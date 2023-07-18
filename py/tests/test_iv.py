from xmlrpc.client import Boolean
import pytest
import re
from ccpt.cfg_to_trie.iv import parse
import ccpt.cfg_to_trie.utils as utils

from antlr4 import      \
    InputStream,        \
    CommonTokenStream,  \
    BailErrorStrategy
from ccpt.cfg_to_trie.antlr_llvm.LLVMLexer import LLVMLexer
from ccpt.cfg_to_trie.antlr_llvm.LLVMParser import LLVMParser


# From old file: may be useful if path errors occur in the future.
# sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__),
#                '..')))
# IV_IN_DAT = os.path.join(os.path.dirname(__file__), 'in_iv.dat')
# IV_OUT_DAT = os.path.join(os.path.dirname(__file__), 'out_iv.dat')


def remove_comments_and_clean(line: str) -> str:
    """
    Removes from string 'line' everything after first ';'.
    """
    if not isinstance(line, str):
        raise ValueError
    if re.search(";", line):
        line = line.split(";")[0]
    line = line.strip()
    line = line.replace("\n", "")
    line = line.replace("\t", "")
    line = line.replace("\r", "")
    return line


def get_tuples_from_string(s: str) -> str:
    """
    Returns a set of tuples read from the string 's' formatted as follow:
    key1:value1 [1 space] key2:value2 ...
    """

    if not isinstance(s, str):
        raise ValueError
    my_set = set()
    if s != "":
        for pair in s.split(" "):
            split = pair.split(":")
            my_set.add(tuple((split[0], split[1])))
    return my_set


def check_from_files(ifile: str, ofile: str, keysRegex: list) -> Boolean:
    """
    Helper function for testing with files.
    """

    # Open both files.
    with open(ifile, 'r') as file_in, open(ofile, 'r') as file_out:
        while file_in and file_out:
            line_in = file_in.readline()
            line_out = file_out.readline()
            if not line_in or not line_out:
                break
            # Ignore blank lines and lines starting with '#'.
            if line_in == "\n" or line_in.startswith("#"):
                continue
            # Clean strings (in: instruction, out:set-of-tuples).
            instr = remove_comments_and_clean(line_in)
            line_out = remove_comments_and_clean(line_out)
            exp = get_tuples_from_string(line_out)
            # Try to parse instruction.
            try:
                got = parse(instr)
            except Exception:
                pytest.fail(f"Exception occurred while parsing \'{instr}\'.")

            # Get subset of tuples to test (in 'keys').
            got_to_test = set()
            for regex in keysRegex:
                for e in list(got):
                    if re.search(regex, e[0]):
                        got_to_test.add(e)
                        got.remove(e)

            # Check equality.
            assert got_to_test == exp, \
                f"from \'{instr}\'\n \
                    got(subset)={got_to_test}\nexp={exp}"
            # if keys:
            #     # Get subset of tuples to test (in 'keys').
            #     got_to_test = \
            #         set([e for e in got if e[0] in keys])
            #     # Check equality.
            #     assert got_to_test == exp, \
            #             f"from \'{instr}\'\n \
            #             got(subset)={got_to_test}\nexp={exp}"
            # else:
            #     print(exp)
            #     print("got", got)
            #     print()
            #     assert exp.issubset(got), \
            #         f"from \'{instr}\'\n \
            #         got={got}\nexp={exp}"


class TestInstructionVisitor():

    # TODO: Clean.
    def test_in_dat(self):
        with open("tests/data/in_iv.dat", 'r') as file_in:
            failed_inst = []

            while True:
                line = file_in.readline()
                if not line:
                    break

                # Ignore blank lines and lines starting with '#'.
                if line == "\n" or line.startswith("#"):
                    # Get instruction type (last line starting with '##').
                    if re.search("^## ", line):
                        last_inst = line.split("## ")[1]
                        if last_inst.split("("):
                            last_inst = last_inst.split("(")[0]
                        last_inst = last_inst.strip().replace("\n", "")
                        last_inst = last_inst.lower()

                # Get instruction
                else:
                    cleaned = remove_comments_and_clean(line)
                    # print(last_inst, " - ", cleaned)
                    try:
                        t = parse(cleaned)
                        assert isinstance(t, set)

                    except Exception:
                        # pytest.fail("ERROR in parsing a \'" + last_inst \
                        #              + "\' inst: " + cleaned)
                        failed_inst.append(cleaned)

            if len(failed_inst) > 0:
                pytest.fail("ERROR(s) in\n  " + "\n  "
                            .join([s for s in failed_inst]))

    def test_empty_inst(self):
        with pytest.raises(Exception):
            parse('')

    def test_wrong_inst(self):
        with pytest.raises(Exception):
            parse('abcdefghi')

    def test_op_and_call_tuples(self):
        """
        Test 'op' and 'call' tuples generated.
        """
        check_from_files(ifile="tests/data/in_iv.dat",
                         ofile="tests/data/out_iv_op_call.dat",
                         keysRegex=["op", "call"])

    def test_type(self):
        """
        Test type inference on variables ('*-ty' tuples).
        """
        check_from_files(ifile="tests/data/in_iv.dat",
                         ofile="tests/data/out_iv_type.dat",
                         keysRegex=["-ty$"])

    def test_var_access(self):
        """
        Test 'read' and 'write' tuples generated.
        """
        check_from_files(ifile="tests/data/in_iv.dat",
                         ofile="tests/data/out_iv_read_write.dat",
                         keysRegex=["read", "write"])

    def test_const_tuples(self):
        """
        Test 'const' and 'const-expr' tuples generated.
        """
        check_from_files(ifile="tests/data/in_iv.dat",
                         ofile="tests/data/out_iv_const.dat",
                         keysRegex=["const", "const-expr"])

    def test_sty(self):
        """
        Test computation of simplified type starting from LlvmType.
        """

        with open("tests//data/in_out_iv_sty.dat", "r") as f:
            for line in f:
                ty, exp = line.split(";")

                # Clean strings.
                ty = ty.strip()
                exp = re.sub("#.*", "", exp)
                exp = exp.strip()

                # LLVM Lexer and Parser.
                lexer = LLVMLexer(InputStream(ty))
                stream = CommonTokenStream(lexer)
                parser = LLVMParser(stream)
                # Make the parser raise exception if error occurs during
                # parsing.
                parser._errHandler = BailErrorStrategy()
                # Create tree from custom grammar production "LlvmType".
                tree = parser.llvmType()
                # Compute simplified type.
                got = utils.get_simplified_type(tree)

                assert got == exp
