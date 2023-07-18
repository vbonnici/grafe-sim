import argparse
from antlr4 import      \
    InputStream,        \
    CommonTokenStream,  \
    BailErrorStrategy
from ccpt.cfg_to_trie.antlr_llvm.LLVMLexer import LLVMLexer
from ccpt.cfg_to_trie.antlr_llvm.LLVMParser import LLVMParser
from ccpt.cfg_to_trie.antlr_llvm.LLVMParserVisitor import LLVMParserVisitor
import ccpt.cfg_to_trie.utils as utils


# Tuples:
# @globalident-ty: type
# @globalident-sty: simplified type
# typedef-%localident: type


class ModuleVisitor(LLVMParserVisitor):
    """Contains all the redefinitions of the visit methods.

    This class contains all the redefinition of the visit methods used
    during the exploration of LLVM-IR module.
    """

    def __init__(self) -> None:
        """
        Constructor.
        """
        super().__init__()
        self.tupleset: set = set()

    def get_tupleset(self) -> set:
        """
        Returns the set of tuples created during the visit of the module.
        """
        return self.tupleset

    # Redefinition of visitor's methods.

    # Visit a parse tree produced by LLVMParser#globalDef.
    def visitGlobalDef(self, ctx: LLVMParser.GlobalDefContext):

        global_ident: str = ctx.globalIdent().getText()
        type: LLVMParser.LlvmTypeContext = ctx.llvmType()

        t: tuple = tuple((f"{global_ident}-ty", type.getText()))
        self.tupleset.add(t)
        t = tuple((f"{global_ident}-sty", utils.get_simplified_type(type)))
        self.tupleset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#globalDecl.
    def visitGlobalDecl(self, ctx: LLVMParser.GlobalDeclContext):

        global_ident: str = ctx.globalIdent().getText()
        type: LLVMParser.LlvmTypeContext = ctx.llvmType()

        t: tuple = tuple((f"{global_ident}-ty", type.getText()))
        self.tupleset.add(t)
        t = tuple((f"{global_ident}-sty", utils.get_simplified_type(type)))
        self.tupleset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#typeDef.
    def visitTypeDef(self, ctx: LLVMParser.TypeDefContext):

        if ctx.llvmType():
            local_ident: str = ctx.localIdent().getText()
            type_str: str = ctx.llvmType().getText()
            t: tuple = tuple((f"typedef-{local_ident}", type_str))
            self.tupleset.add(t)

        # else: opaque

        return self.visitChildren(ctx)


def parse(module: str) -> set:
    """
    Parse an llvm module returning a set of tuples.

    Given an LLVM module, this function uses the parser and visits
    the created AST to populate a set of tuple with informations like:
    ....
    types of global_ident
    ....

    Args:
        module(str): LLVM-IR module string.

    Returns:
        A set of tuples.

    Raises:
        Exception: If error occurs during parsing.
    """

    # LLVM Lexer and Parser.
    lexer: LLVMLexer = LLVMLexer(InputStream(module))
    stream: CommonTokenStream = CommonTokenStream(lexer)
    parser: LLVMParser = LLVMParser(stream)
    # Make the parser raise exception if error occurs during parsing.
    parser._errHandler = BailErrorStrategy()
    # Create tree from custom grammar production "mySingleInstruction".
    tree = parser.module()
    # Visit tree with custom visitor.
    visitor: ModuleVisitor = ModuleVisitor()
    visitor.visit(tree)
    myset: set = visitor.get_tupleset()
    # Return the set.
    return myset


def main() -> None:
    """
    Starting from a LLVMIR file, prints MV result on stdout.
    """

    # CLI.
    parser: argparse.ArgumentParser = argparse.ArgumentParser()
    # Positional options.
    parser.add_argument("llvmir_file", type=argparse.FileType("r"),
                        help="input .ll file")
    args = parser.parse_args()

    # Read llvmir file.
    llvmir = ""
    with open(args.llvmir_file.name, "r") as f:
        for line in f:
            llvmir += line

    # Parse module.
    res = parse(llvmir)

    print("Result")
    for e in res:
        print(e)


if __name__ == "__main__":
    main()
