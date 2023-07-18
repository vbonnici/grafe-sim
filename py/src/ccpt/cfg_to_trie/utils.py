
import logging
import logging.config
import os
import pathlib
import re
import shutil
import subprocess
import tempfile
import networkx as nx
from pathlib import Path

from ccpt.cfg_to_trie.antlr_llvm.LLVMParser import LLVMParser

logger = logging.getLogger(__name__)
logger.addHandler(logging.NullHandler())


def error(message):
    '''
    Print error message and exit with error code -1.

    Args:
        message (str): error message that will be printed
    '''
    print(os.strerror, 'error: ' + message)
    exit(-1)


def execute_shell_cmd(command, working_dir="."):
    '''
    Executes on shell the given command, redirecting stdout and stderr.

    Args:
        command (str): Command to execute

    Returns:
        return_code (int): Return code of execution
    '''
    logger.debug(f"cmd: {command}")
    command_as_list = command.split(' ')
    process = subprocess.run(
        command_as_list,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        encoding="utf8",
        errors='ignore',
        cwd=working_dir)

    # if(process.stdout):
    #     print('  ', re.sub('\n', '\n   ', process.stdout))

    if process.stderr:
        logger.debug("   [stderr]:")
        logger.debug("  " + re.sub('\n', '\n   ', process.stderr))

    # print('   return code: ', process.returncode)
    return process.returncode


def c_to_ll(filename: str, cpp_flag: bool = False) -> str:
    """
    Uses clang to generate LLVMIR of C/C++ source code file given as
    input. Creates a temporary file for LLVMIR generated and then
    deletes it.

    Args:
        filename (str): C/C++ source code file name.
        cpp_flag (bool): flag to use clang++ (C++) instead of clang (C)
    Returns:
        A string of LLVMIR generated.
    Raises:
        RuntimeError: when clang cmd returns non-zero code.
    """

    filename = Path(filename)
    clangcmd = "clang-7" if not cpp_flag else "clang++-7"
    # Temporary file for llvmir generated.
    tmp_file = tempfile.NamedTemporaryFile(delete=False)

    # Execute clang/clang++.
    cmd = f"{clangcmd} -emit-llvm -S {filename} -o {tmp_file.name} " + \
        "-fno-discard-value-names -Xclang -disable-O0-optnone -O0"
    if execute_shell_cmd(cmd) != 0:
        raise RuntimeError("Clang returned non-zero code.")

    # Read temporary file.
    tmp_file.seek(0)
    llvmir_str = ""
    with open(tmp_file.name) as fout_r:
        for line in fout_r:
            llvmir_str += line

    # Close file and delete it.
    tmp_file.close()
    os.unlink(tmp_file.name)

    return llvmir_str


# TODO: could be useful additional parameter 'out_save_path'?
def llvmir_to_nx_cfgs(llvmir: str) -> dict:
    """
    Starting from an LLVM-IR, generates a set of CFGs (as NetworkX graphs),
    one for each function in the LLVM-IR, and returns a dictionary in
    this form {foo: CFG_of_foo, bar: CFG_of_bar, ...}.
    Uses opt-7.

    """

    with tempfile.TemporaryDirectory() as tmpdirname:
        tmpdir = pathlib.Path(tmpdirname)

        # Create (temporary) llvm-ir input file.
        tmpllvmir = tmpdir / "input.ll"
        with open(tmpllvmir, "w") as f:
            f.write(llvmir)  # TODO: bad generation.

        # Launch opt-7.
        # proc = subprocess.run(
        #     ["opt-7", "-dot-cfg", tmpllvmir, "-disable-output"],
        #     cwd=tmpdirname, capture_output=True
        # )
        cmd = f"opt-7 -dot-cfg {tmpllvmir} -disable-output"
        if execute_shell_cmd(cmd, tmpdirname) != 0:
            raise RuntimeError("Opt-7 returned a non-zero code.")

        dict = {}
        # For all .dot generated
        for f in tmpdir.glob("cfg.*.dot"):
            if f.is_file():
                # print(f.name)
                function_name = f.stem.replace("cfg", "").replace(".", "")
                # new_dot_name = fname.stem + "-" + function_name
                #                + "or-cfg.dot"
                G = nx.nx_pydot.read_dot(f)
                # demangled_name = demangle(function_name).replace(" ", "")
                # dict[demangled_name] = nx.DiGraph(G)
                dict[function_name] = nx.DiGraph(G)
                # print(f"Generated CFG of {fname}:{function_name} function.")

        logger.debug(f"Found cfg for functions: {dict.keys()}.")

        return dict


def c_to_nx(fname: str, keep_llvm: bool = False) -> dict:
    """
    Uses clang/opt to generate CFGs of C/C++ source file "fname".

    Args:
        fname (str): C source code file name.

    Returns:
        A dict of NetworkX graphs: one CFG for each function.

    Raises:
        ValueError: when fname does not have ".c" extension.
    """

    curr_dir = Path(".").absolute()

    # Create .tmp-ccpt-c-to-nx directory.
    # ATTENTION: all file in an existing .tmp directory will be deleted
    tmp_dir = Path(".tmp-ccpt-c-to-nx").absolute()
    if not tmp_dir.exists():
        os.mkdir(tmp_dir)
    # Delete all file in the directory.
    [f.unlink() for f in tmp_dir.glob("*") if f.is_file()]

    fname = Path(fname)

    if fname.suffix == '.c':
        clangcmd = 'clang-7'
    elif fname.suffix == '.cpp':
        clangcmd = 'clang++-7'
    else:
        print(f"file \"{fname}\" does not match .c or .cpp extension")
        raise ValueError

    # STEP 1 - clang: from .c to a set of .ll (in /.tmp dir)
    cmd = clangcmd + ' -emit-llvm -S ' + str(fname) \
        + ' -o ' + str(tmp_dir) + "/" + str(fname.stem) + '.ll' \
        + ' -fno-discard-value-names -Xclang -disable-O0-optnone -O0'
    if execute_shell_cmd(cmd) != 0:
        error('last command returned a non-zero code')

    if keep_llvm:
        cmd = 'cp ' + str(tmp_dir) + "/" + str(fname.stem) + '.ll .'
    if execute_shell_cmd(cmd) != 0:
        error('last command returned a non-zero code')

    # STEP 2 - opt: from .ll to (a set of) .dot
    os.chdir(tmp_dir)
    # cmd = 'opt -dot-cfg ' + str(tmp_dir) + '/' + str(filename.stem) \
    #     + '.ll' + ' -o ' + str(tmp_dir) + '/' + str(file_out) + '.dot'
    cmd = 'opt-7 -dot-cfg ' + str(fname.stem) + '.ll -disable-output'
    if execute_shell_cmd(cmd) != 0:
        error('last command returned a non-zero code')

    dict = {}
    # For all .dot generated
    for f in Path(".").glob("cfg.*.dot"):
        if f.is_file():
            function_name = f.stem.replace("cfg", "").replace(".", "")
            # new_dot_name = fname.stem + "-" + function_name + "or-cfg.dot"
            G = nx.nx_pydot.read_dot(f)
            dict[function_name] = G
            print(f"Generated CFG of {fname}:{function_name} function.")

    # Remove temporary dir.
    os.chdir(curr_dir)
    shutil.rmtree(tmp_dir, ignore_errors=False)

    return dict


def nx_to_pdf(G: nx.Graph, fname: str) -> None:
    """
    Prints NetworkX graph G into .pdf file using pydot.

    Args:
        G (nx.DiGraph): NetworkX graph to be printed.
        fname (str): file name in which G will be printed.
    """

    G_pydot = nx.drawing.nx_pydot.to_pydot(G)
    G_pydot.write_pdf(fname)


def nx_to_grapes(G: nx.Graph, gname: str, fname: str) -> None:
    """
    Prints the NetworkX graph G in the grapes format.

    Args:
        G (nx.DiGraph): NetworkX graph to be printed.
        gname (str): graph name.
        fname (str): file name in which G will be printed.

    Returns:
        None.

    Raises:
        PermissionError: when access to fname file is denied.
    """

    labels = nx.get_node_attributes(G, "label")

    with open(fname, "w") as file:

        # Write the graph name into the file.
        file.write("#" + gname + "\n")

        # Write the number of nodes in the graph.
        file.write(str(G.number_of_nodes()) + "\n")

        # Write all nodes' label.
        for node in G.nodes:
            file.write(str(labels[node]) + "\n")

        # Write number of edges.
        file.write(str(G.number_of_edges()) + "\n")

        # Write all edges.
        for edge in G.edges:
            file.write(str(edge[0]) + " " + str(edge[1]) + "\n")

        # print(f"Graph written as GRAPES format in \"{fname}\".")

    return


def grapes_to_nx(fname: str) -> nx.Graph:
    """
    Parses .grapes file and generate corresponding NetworkX graph.

    Args:
        fname (str): .grapes CFG filename.

    Returns:
        A new NetworkX graph.

    Raises:
        FileNotFoundError: when file is not found.
    """

    with open(fname) as f:
        G = nx.Graph()

        lines = f.readlines()
        idx = 0

        # graph_name = lines[idx].rstrip()
        idx += 1

        node_count = int(lines[idx].rstrip())
        idx += 1
        for i in range(node_count):
            G.add_node(i, label=lines[idx].rstrip())
            idx += 1

        edge_count = int(lines[idx].rstrip())
        idx += 1
        for i in range(edge_count):
            u, v = lines[idx].rstrip().split(" ")
            G.add_edge(u, v)
            idx += 1

        return G


# def print_graph_grapes(G: nx.DiGraph, name: str, kind: str):
#     """Prints the given graph in the grapes format.
#     print(os.path.dirname(__file__))
#
#     This function prints, into a file, the given graph in the format
#     used in the grapes algorithm.
#
#     Parameters
#     ----------
#     G: nx.DiGraph -> graph to be plotted
#
#     name: string -> name of the graph
#
#     kind: string -> what kind of node will be printed. It can be
#     one of the following: ["all", "inst"]
#     """
#     labels = nx.get_node_attributes(G, "label")
#     types = nx.get_node_attributes(G, "type")
#     # print(labels)
#     # print(types)
#
#     file = open(name + ".grapes", "w")
#
#     # write the graph name into the file
#     file.write("#" + name + "\n")
#
#     # write the number of nodes in the graph
#     file.write(str(G.number_of_nodes()) + "\n")
#
#     if kind == "all":
#         # Write all nodes" label.
#         for node in G.nodes:
#             file.write(str(labels[node]) + "\n")
#
#         # Write number of edges.
#         file.write(str(G.number_of_edges()) + "\n")
#
#         # Write all edges.
#         for edge in G.edges:
#             file.write(str(edge[0]) + " " + str(edge[1]) + "\n")
#
#     elif kind == "inst":
#         # counter for the new position of the printed list
#         node_counter = 0
#         original_position_list = []
#         new_position_list = []
#         # write all the names of the node, one for every line
#         for node in list(G.nodes):
#             if types[node] == "inst":
#                 file.write(node + "\n")
#
#                 new_position_list.append(node_counter)
#
#                 node_counter = node_counter + 1
#
#                 original_position_list.append(list(G.nodes).index(node))
#
#         # write the number of edges in the graph
#         file.write(str(G.number_of_edges()) + "\n")
#
#         # write all edges in the graph using the number corresponding to
#         # the position in the above list
#         for edge in G.edges:
#             file.write(str(edge[0]) + " " + str(edge[1]) + "\n")
#     else:
#         print("Error in the kind parameter.")
#
#     file.close()
#     print("CFG written as GRAPES format in \"" + name + ".grapes\".")
#
#     return

    # gv = pgv.AGraph("dot/es1.dot", strict=False, directed=True)
    # G = nx.DiGraph(gv)
    # print(G)
    # G = nx.Graph(nx.nx_pydot.read_dot("./dot/for.dot"))
    # print(type(nx.nodes(G)))
    # print("-------------")
    # print(G.edges)
    # print("-------------")
    # print(G.__dict__.keys())
    # print("-------------")
    # for node in G.nodes:
    # print(G.info())
    # print(label["Node0x8ccd20"])
    #     print(G._node[node].__dict__)
    # print(G._node.values())
    # print("-------------")
    # print(G)
    # nx.draw(G)
    # plt.savefig("filename.png")
    # A = nx.complete_graph(5)
    # nx.draw(A)
    # plt.draw()
    # for a in G._node:
    #   print(a, end="--\n")
    # print(G._node["Node0x8ccd20"].items().get("labels"))


def dot_to_nx(fname: str) -> nx.DiGraph():
    """
    Reads a .dot file and return the graph in it as nx.DiGraph.
    Do not use to read a clang generated .dot
    """

    G = nx.nx_pydot.read_dot(fname)
    # Delete all non-integer nodes.
    for node in list(G.nodes()):
        if not node[0:].isdigit() and G.degree(node) == 0:
            G.remove_node(node)
    # Relabel nodes (from str to int)
    try:
        map = {old: int(old) for old in G.nodes()}
        G = nx.relabel_nodes(G, map)
    except ValueError:
        pass
    # Cast to DiGraph
    G = nx.DiGraph(G)

    return G


# For the visitors.

# TODO: 'i1' can be simplified as 'bool' instead of 'int' ?
# TODO: when type definition will be considered, opaque type must
# be handled.
def get_simplified_type(ctx: LLVMParser.LlvmTypeContext,
                        pointer: bool = False) -> str:
    """
    Compute a string representing a simplified type starting from
    context of LlvmType grammar's production. 'pointer' is used for
    recursive call: DO NOT USE in function call.

    Args:
        ctx: context of LlvmType.
        pointer: DO NOT USE (used internally).
    Returns:
        A string of simplified type.
    Raise:
        ValueError: when ctx is not an LlvmType context.
    """

    if not isinstance(ctx, LLVMParser.LlvmTypeContext):
        raise ValueError

    # Handle concreteNonRecType
    if ctx.concreteNonRecType():
        if ctx.concreteNonRecType().intType():
            return "int"
        if ctx.concreteNonRecType().floatType():
            return "float"
        if ctx.concreteNonRecType().vectorType():
            subctx = ctx.concreteNonRecType().vectorType().llvmType()
            return f"<{get_simplified_type(subctx)}>"
        if ctx.concreteNonRecType().arrayType():
            subctx = ctx.concreteNonRecType().arrayType().llvmType()
            return f"[{get_simplified_type(subctx)}]"
        if ctx.concreteNonRecType().structType():
            return "struct"
        # Otherwise: labelType, namedType, mmxType, tokenType.
        return ctx.concreteNonRecType().getText()

    # Handle pointer type.
    if ctx.getChildCount() == 3:
        subctx = ctx.llvmType()
        return f"{get_simplified_type(subctx, pointer=True)}*"

    # Handle function type.
    # E.g. i32 (i8, float) --> i32 (only returned value's type).
    if ctx.getChildCount() == 4:
        subctx = ctx.llvmType()
        if pointer:
            return get_simplified_type(subctx, pointer=False) + "-function"
        else:
            return get_simplified_type(subctx)

    # Otherwise: voidType, metadataType.
    return ctx.getText()


def fix_pydot_issue(G):
    """
    Modifies the labels of the nodes and edges in a NetworkX graph to
    fix issues with the `pydot` library. This function surrounds the
    labels containing colons with double quotes, and it escapes any
    problematic characters.

    Args:
        G (networkx.Graph): The graph whose labels will be modified.

    Returns:
        None: this function modifies the labels in-place.
    """
    problematic_chars = r'<>{}|'
    problematic_chars_re = re.compile(f'[{problematic_chars}]')
    invalid_chars_re = re.compile(r'[^\x20-\x7e]')

    for label_id in ["label", "xlabel"]:

        # Modify the labels of the nodes.
        for node in G.nodes():
            label = G.nodes[node].get(label_id)
            if label:
                # Use escape characters for any problematic characters.
                label = problematic_chars_re.sub(r'\\\g<0>', label)
                # Replace dots with escaped dots.
                label = label.replace('.', '\\.')
                label = label.replace('"', '')
                # Remove any remaining invalid characters.
                label = invalid_chars_re.sub('', label)
                # Surround the label with double quotes if it contains colons.
                if ':' in label:
                    label = f'"{label}"'

                G.nodes[node][label_id] = label

        # The same for edges.
        for source, target in G.edges():
            label = G.edges[source, target].get(label_id)
            if label:
                label = problematic_chars_re.sub(r'\\\g<0>', label)
                label = label.replace('.', '\\.')
                label = invalid_chars_re.sub('', label)
                if ':' in label:
                    label = f'"{label}"'
                G.edges[source, target][label_id] = label


def clean_callgraph(G: nx.DiGraph) -> None:
    """
    Removes 'external node' and relative edges from raw callgraph
    generated by opt-7. Removes '"{' at the beginning and '}"' at the end
    of the labels.

    Args:
        G (networkx.Graph): The callgraph as networkx.DiGraph.

    Returns:
        None: this function modifies the the graph in-place.
    """

    to_remove = []
    new_labels = {}
    for n in G.nodes:
        label = G.nodes[n].get("label")
        if (not label) or ("external node" in label):
            to_remove.append(n)
            continue
        new_labels[n] = re.sub("^\"{", "", label)
        new_labels[n] = re.sub("}\"$", "", new_labels[n])
        new_labels[n] = re.sub("\\.c", "c", new_labels[n])

    for n in to_remove:
        G.remove_node(n)

    nx.set_node_attributes(G, new_labels, "label")

    return


def demangle(symbol: str) -> str:
    """
    Demangle a C++ symbol using llvm-cxxfilt-7 command.

    Args:
        symbol (str): a string representing a mangled C++ symbol.

    Returns:
        str: the demangled symbol.

    Raises:
        ValueError: if input symbol is not a non-empty string.
        FileNotFoundError: if llvm-cxxfilt-7 command is not found in PATH.
        Exception: ff there is an error running the command.
    """
    if not isinstance(symbol, str) or not symbol:
        raise ValueError("Invalid symbol input")

    if shutil.which("llvm-cxxfilt-7") is None:
        raise FileNotFoundError("llvm-cxxfilt-7 not found in PATH.")

    try:
        output = subprocess.run(["llvm-cxxfilt-7", symbol],
                                capture_output=True,
                                text=True)
        output = output.stdout.strip()
    except subprocess.CalledProcessError as e:
        logger.error(e.output)
        raise subprocess.CalledProcessError(
            "Error running llvm-cxxfilt-7 command.")
    return output


def demangle_std(symbol: str, no_params: bool = False) -> str:
    """
    Demangle a C++ symbol using c++filt command.

    Args:
        symbol (str): a string representing a mangled C++ symbol.
        no_params (bool): '--no-params' CLI option (Do not display function
            arguments).

    Returns:
        str: the demangled symbol.

    Raises:
        ValueError: if input symbol is not a non-empty string.
        FileNotFoundError: if llvm-cxxfilt-7 command is not found in PATH.
        Exception: ff there is an error running the command.
    """
    if not isinstance(symbol, str) or not symbol:
        raise ValueError("Invalid symbol input")

    if shutil.which("c++filt") is None:
        raise FileNotFoundError("c++filt not found in PATH.")

    try:
        cmd = list(["c++filt"])
        if no_params:
            cmd.append("-p")
        cmd.append(symbol)
        output = subprocess.run(cmd,
                                capture_output=True,
                                text=True)
        output = output.stdout.strip()
    except subprocess.CalledProcessError as e:
        logger.error(e.output)
        raise subprocess.CalledProcessError(
            "Error running c++filt command.")
    return output


def nodes_with_no_inst_pred(acfg: nx.DiGraph) -> list:
    """
    Returns a list of nodes with indegree = 0 refering only to
    'inst' nodes in the graph acfg.

    Args:
        acfg (nx.DiGraph): the a-cfg as networkx graph.

    Returns:
        list: the list of nodes with indegree=0 refering only to
            'inst' nodes.
    """

    tmp = acfg.copy()
    tmp.remove_nodes_from(
        list(n for n in tmp.nodes if tmp.nodes[n].get('type') != 'inst')
    )

    return [n for n in tmp.nodes
            if tmp.in_degree(n) == 0]


def node_connected_component_only_inst(G: nx.DiGraph, n: int) -> set:
    """
    Returns a set of nodes in the component of G containing node n, but
        considering only 'inst' nodes.

    Args:
        G (nx.DiGraph): the nx graph.
        n (int): node ID in the graph

    Returns:
        set: a set of nodes in the component of G (considering only 'inst'
        nodes) containing node n.
    """

    tmp = G.copy()
    tmp.remove_nodes_from(
        list(n for n in tmp.nodes if tmp.nodes[n].get('type') != 'inst')
    )

    return nx.node_connected_component(tmp.to_undirected(), n)
