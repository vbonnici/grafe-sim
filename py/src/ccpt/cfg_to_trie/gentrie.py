import os
from pathlib import Path
import pathlib
from statistics import mean, stdev
import subprocess
import tempfile
import time
import xml.etree.ElementTree as ET
import networkx as nx
import argparse
import ccpt.cfg_to_trie.utils as utils
import logging
import logging.config
import ccpt.compare_tries.compare as compare

logger = logging.getLogger(__name__)
logger.addHandler(logging.NullHandler())


class Trie:

    def __init__(self, acfg: nx.DiGraph, lp: int,
                 save_input_path: str = "") -> None:

        self.__nxtree: nx.DiGraph = self.__generate(acfg, lp, save_input_path)
        self.__lp: int = lp
        # TODO: improve and copy them here. The total path set is
        # not needed anymore.
        path_set = compare.gen_total_paths_set([self.__nxtree])
        self.__paths = compare.gen_feature_vector(path_set, self.__nxtree)

        # if not self.__is_consistent():
        #     raise Exception

    # Getter.
    def get_lp(self) -> int:
        return self.__lp

    def get_nxtree(self) -> nx.DiGraph:
        return self.__nxtree

    def get_paths(self) -> dict:
        return self.__paths

    def get_name(self) -> str:
        return self.__nxtree.name

    def set_name(self, name: str) -> None:
        self.__nxtree.name = name

    def __generate(self, acfg: nx.DiGraph, lp: int,
                   save_input_path: str = "") -> nx.DiGraph:
        """
        Starting from a CFG in G (as networkx graph), calls
        GraphGrepSX to produce the corresponding prefix tree.
        The generated .grapes file of G can be kept by specifying the path
        in which to save it in "save_input_path".

        Args:
            G (nx.Graph): CFG as NetworkX graph.
            lp (int): length path of GraphGrepSX
            save_input_path (str): path in which save .grapes file of G used.

        Returns:
            The prefix tree as a NewtworkX graph.

        Raises:
            ValueError: when produced graph is not a tree.
        """
        # Do all the stuff in a temporary directory.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir: pathlib.Path = pathlib.Path(tmpdirname)

            # Generate input .grapes
            tmpgrapes: pathlib.Path = tmpdir / "input.grapes"
            # TODO: is the graph name useful?
            utils.nx_to_grapes(acfg, "tmp", tmpgrapes.as_posix())

            # (Eventually) save the input .grapes also in 'save_input_path'.
            if save_input_path:
                savedgrapes: pathlib.Path = pathlib.Path(save_input_path)
                os.system(f"cp {tmpgrapes} {savedgrapes}")

            # Call GraphGrepSX.
            execfile: str = os.path.dirname(os.path.abspath(__file__)) \
                + "/ggsx"

            proc: subprocess.CompletedProcess[bytes] = subprocess.run(
                [execfile, "-b", tmpgrapes, "--lp", str(lp)],
                cwd=tmpdirname, capture_output=True
            )

            # Get labelmap from stdout of GraphGrepSX.
            map_from_stdout: str = proc.stdout.decode()
            map_from_stdout = map_from_stdout.split("##START-LABEL-MAP##\n")[1]
            map_from_stdout = map_from_stdout.split("##END-LABEL-MAP##\n")[0]
            labelmap: dict = {}
            for m in map_from_stdout.split("\n"):
                ms: list[str] = m.split(" ")
                if len(ms) > 1:
                    labelmap[ms[0]] = str(ms[1])

            # Parse XML.
            xml_filename: pathlib.Path = pathlib.Path(tmpgrapes.as_posix()
                                                      + ".index.xml")
            tree: ET.ElementTree = ET.parse(xml_filename)
            root: ET.Element = tree.getroot()

            # Add "fake-root" to labelmap.
            labelmap["-1"] = "fake-root"
            # Create G doing XML dfs.
            G = nx.DiGraph(lp=lp)
            self.__xml_dfs(G, labelmap, root, 0, 0)

            if not nx.is_tree(G):
                raise ValueError

            # Print statistics about leaf's path occurences,
            path_occur: dict[int, int] = \
                nx.get_node_attributes(G, "path_occurences")
            leafs: list[int] = [x for x in G.nodes()
                                if G.out_degree(x) == 0
                                and G.in_degree(x) == 1]
            logger.info(f"Trie leafs number: {len(leafs)}.")
            path_occur_leafs: list[int] = []
            for leaf in leafs:
                path_occur_leafs.append(int(path_occur[leaf]))
            logger.info("Path occurences in leafs mean: %.2f",
                        mean(path_occur_leafs))
            logger.info("Path occurences in leafs std.dev.: %.2f",
                        stdev(path_occur_leafs))
            logger.debug(f"List of path occurrencies: {path_occur_leafs}.")

            return G

    def __xml_dfs(self, G: nx.Graph, map: dict, root: ET.Element, id: int,
                  depth: int) -> int:
        """
        Build NetworkX graph G while visiting XML tree with DFS.
        """

        # Create current node.

        # Add "" if label contains ':' due to pydot incompatibility.
        # > ValueError: Node names and attributes should not contain ":"
        # > unless they are quoted with "". For example the string
        # > 'attribute:data1' should be written as '"attribute:data1"'.
        # > Please refer https://github.com/pydot/pydot/issues/258
        lab: str = map[root.attrib["label"]].replace("\"", "")
        if ":" in lab:
            lab = f"\"{lab}\""

        cc: str = root.attrib["child_count"]
        # 'e' should be a list of one element.
        e: list[ET.Element] = root.findall("OCPTNGraphsInfos/element")
        po: str = ""
        if e:
            po = e[0].attrib["path_occurences"]

        G.add_node(id, label=str(lab), child_count=cc,
                   xlabel=po, path_occurences=po, depth=depth)
        next_id: int = id + 1

        # If it is leaf: return.
        if int(cc) == 0:
            return next_id

        # (Else): visit all childs.
        childs_id: list[int] = []
        for _, child in enumerate(root.findall("node")):
            childs_id.append(next_id)
            next_id = self.__xml_dfs(G, map, child, next_id, depth=depth + 1)

        for c in childs_id:
            G.add_edge(id, c)

        return next_id

    def __gen_path_string(self, path: list, concat: str) -> str:
        return concat.join(path)

    def __is_consistent(self):

        if not nx.is_tree(self.__nxtree):
            return False
        if not isinstance(self.__nxtree, nx.DiGraph):
            return False

        # Check 'paths' correctness.
        leaves = [x for x in self.__nxtree.nodes()
                  if self.__nxtree.out_degree(x) == 0
                  and self.__nxtree.in_degree(x) == 1]
        print(leaves)
        root = [x for x in self.__nxtree.nodes()
                if self.__nxtree.in_degree(x) == 0]
        root = root[0]
        cmp_paths = dict(self.__paths)
        for leaf in leaves:
            path = nx.shortest_path(self.__nxtree, source=root, target=leaf)
            # Exclude fake-root (id = 0)
            path = [n for n in path if n != 0]
            # Check 'lp' correctness.
            if len(path) > self.__lp:
                return False
            path = [nx.get_node_attributes(self.__nxtree, "label")[n]
                    for n in path]
            path = self.__gen_path_string(path, "->")
            occ = nx.get_node_attributes(self.__nxtree,
                                         "path_occurences")[leaf]
            if self.__paths.get(path) == occ:
                print(self.__paths.get(path), occ)
                return False
            cmp_paths.pop(path, None)

        if cmp_paths != {}:
            return False

        return True

    def __str__(self):
        return self.__nxtree.__str__()


def main() -> None:

    logging.config.fileConfig(
        os.path.join(os.path.dirname(__file__), "../../../log.config"),
        disable_existing_loggers=False)

    # CLI arguments parsing.
    parser: argparse.ArgumentParser = argparse.ArgumentParser()
    # Positional options.
    parser.add_argument("dot_file", type=argparse.FileType('r'),
                        help="input .dot file")
    # Non-positional options.
    parser.add_argument("-lp", "--length-path", type=int, default=3,
                        help="set max DFS depth to LP (GraphGrepSX)")
    parser.add_argument("-o", "--output", type=str, metavar="OUT_FILENAME",
                        default="",
                        help="output prefix tree file name")
    parser.add_argument("-e", "--extra-output", action="store_true",
                        default=False,
                        help="extra output: input .grapes and output .pdf")
    parser.add_argument("-l", "--log", type=str, default="WARNING",
                        help="set log level")
    args: argparse.Namespace = parser.parse_args()
    filename_in: str = args.dot_file.name
    lp: int = args.length_path
    filename_out: str = args.output
    extra_output_flag: bool = args.extra_output

    # Set log level.
    # numeric_level: Optional[Any] = getattr(logging, args.log.upper(), None)
    # if not isinstance(numeric_level, int):
    #     raise ValueError(f"Invalid log level: {args.log}")
    # logger.basicConfig(level=numeric_level)

    # Read input graph.
    logger.info("Reading input graph...")
    G: nx.digraph = utils.dot_to_nx(filename_in)
    logger.info(f"Reading input graph... {G} done.")

    # Generate prefix tree.
    try:
        logger.info("Generating the prefix tree...")
        # Save .grapes if extra_output_flag.
        save_path: str = ""
        if extra_output_flag:
            save_path = Path(filename_in).stem + ".grapes"

        start_counter_ns = time.perf_counter_ns()

        W: Trie = Trie(G, lp, save_path)

        end_counter_ns = time.perf_counter_ns()
        timer_ns = end_counter_ns - start_counter_ns
        print("#### TRIE (ms): ", timer_ns/1e6)
        print("#### TRIE (node,edge,leaf): "
              + str(len(W.get_nxtree().nodes)) + ","
              + str(len(W.get_nxtree().edges)) + ","
              + str(len(W.get_paths())))

        logger.info(f"Generating the prefix tree... {W} done.")
    except Exception:
        logger.critical("Got an exception executing generate_trie().")
        raise

    # Generate output .dot (in current directory)
    if not filename_out:
        filename_out = "trie-" + Path(filename_in).stem + ".dot"
    nx.nx_pydot.write_dot(W.get_nxtree(), filename_out)
    # Check.
    try:
        utils.dot_to_nx(filename_out)
    except BaseException:
        print("Printed dot has problems.")
        raise

    print(f"Prefix tree printed in '{filename_out}'.")

    # Generate pdf if extra_output_flag.
    if (extra_output_flag):
        # TODO: not so beautiful here: if exception occurs in generate_trie
        # this will be never shown, but the file was generated anyway.
        print(f"Input graph in .grapes format printed in '{save_path}'.")

        filename_pdf = Path(filename_out).stem + ".pdf"
        utils.nx_to_pdf(W.get_nxtree(), filename_pdf)
        print(f"Prefix tree printed in '{filename_pdf}'.")

    return


if __name__ == "main":
    main()
