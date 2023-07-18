import argparse
import os
import pathlib
import time
from matplotlib import collections
import networkx as nx
import re
import csv
import tempfile
import logging
import logging.config
import ccpt.cfg_to_trie.iv as iv
import ccpt.cfg_to_trie.mv as mv
import ccpt.cfg_to_trie.utils as utils

logger = logging.getLogger(__name__)
logger.addHandler(logging.NullHandler())


def get_predef_map_path(id: int) -> str:
    """
    Returns:
        path (as str) of predefined map with the given ID.
    Raise:
        KeyError: when id is not found.
    """

    predef_map_dict: dict[int, str] = {
        0: "../../../../classes/map-nomap-0.csv",
        1: "../../../../classes/map-ref-1.csv",
        2: "../../../../classes/map-ref-loadstore-2.csv",
        3: "../../../../classes/map-ref-loadstore-phicall-3.csv",
        4: "../../../../classes/map-ref-more-detail-4.csv"
    }

    try:
        map_csv: str = predef_map_dict[id]
        map_csv_path = os.path.join(os.path.dirname(__file__), map_csv)
    except Exception:
        logger.error(f"Invalid mapping ID {map_csv}")
        logger.error(f"Valid mapping IDs: {list(predef_map_dict.keys())}")
        raise KeyError

    return map_csv_path


def gen_map_from_csv(fname: str) -> list:
    """
    Generate a list of dicts in this form {"re":regex, "label":label,
    "color": color} starting from the csv file "fname".

    Args:
        fname (str): csv file name.

    Returns:
        the list of dict.

    Raises:
        FileNotFoundError: when "fname" file is not found.
    """
    map = []

    with open(fname, newline="") as csvfile:
        spamreader = csv.reader(csvfile, delimiter=",")
        next(spamreader)

        for row in spamreader:
            dict = {"re": row[0], "label": row[1], "color": row[2]}
            map.append(dict)

    return map


def generate_unique_labels(filename: str, level: int):
    """Given the class file and the level, it produces the array of label.

    Given the name of the classes' file and the level, which represent the
    depth in the tree of the classes, this function produces the corresponding
    array of unique labels.

    The level must be 0 or 1, otherwise 1 will be used.

    Parameters
    ----------
    filename: string
    level: int(0-1)

    Return
    ------
    labels: collection of unique labels
    """

    # Use the default level
    if level != 0 or level != 1:
        level = 1

    with open(os.path.dirname(__file__) + "../classes/" + filename,
              newline="") as csvfile:
        spamreader = csv.reader(csvfile, delimiter=";")
        header = []
        header = next(spamreader)
        mapping = []
        for row in spamreader:
            dict2 = {}
            for el in row:
                pos = row.index(el)
                dict2[header[pos]] = el
            mapping.append(dict2)

    labels = collections.Counter(m["level" + level] for m in mapping)

    return labels


def augmenter(G: nx.DiGraph, gts: set, map: list, var_flag: bool = True,
              const_flag: bool = True, sty_flag: bool = True,
              cut_flag: bool = True) -> nx.DiGraph:
    """
    Modifies the CFG in G for the specific project purpose and returns
    the new graph.

    gts: global tuples set (from module visitor)
    cut_flag: cut some nodes (e.g. terminators with outdegreeu = 1)
    """

    var_color = "#4363d8"  # Blue.
    const_color = "#e6194B"  # Red.
    tuple_type_suffix = "-sty" if sty_flag else "-ty"

    # New graph.
    A = nx.DiGraph()
    # Counter of added nodes in the new graph.
    node_counter = 0


    # Step 0: remove special nodes "s0", "s1", etc. and add these
    # informations on edge labels.
    for node in list(G.nodes):
        # Re-route s0, s1 edges.
        if node.find(":s") > -1:
            node_root = node.split(":")[0]
            for edge in list(G.out_edges(node)):
                root_label = G.nodes[node_root]["label"]
                node_name = \
                    re.search("<" + node.split(":")[1] + ">",
                              root_label).group(0)
                node_name_value = \
                    re.sub("<" + node.split(":")[1] + ">", "",
                           str(node_name))
                G.remove_edge(edge[0], edge[1])
                # G.add_edge(node_root,edge[1])
                # A.add_edge(varname["name"], node_counter,
                #            label=varname["action"], color="#FF0000")
                G.add_edge(node_root, edge[1], label=str(node_name_value))

            G.remove_node(node)
        # TODO check if it is useful
        # else:
        #    node_counter += 1

    # Step 1: reset node IDs of G.
    G = nx.convert_node_labels_to_integers(G)

    # Step 2: explode G nodes into a sequences of nodes (one sequence
    # for each original node, one node for each instruction in it).

    first_inst = True

    # Get node (a set of instructions) labels from G.
    labels = nx.get_node_attributes(G, "label")
    old = {}
    for node in list(G.nodes):

        # Delete the useless characters in the string to keep
        # the splitting easier
        # print(f" LABEL: {labels[node]}\nLABEL")

        # G. Boldini 14/12/22: trying to fix a bug.
        # > labels[node] = labels[node].replace('\\\"', '\"')
        # > key error
        if labels.get(node):
            labels[node] = labels[node].replace('\\\"', '\"')
            # print(f" LABELL: {labels[node]}\nLABEL")
            labels[node] = labels[node].replace("\\l...", "")
            instructions = labels[node].split("\\l")
        # print(f" LABELLLL: {labels[node]}\nLABEL")
        # print(f"\nLABELLL: {labels[node]}\nLABEL")
        # print("-- inst: ", instructions)

        # TEST
        # for e in list(instructions):
        #    print(e)
        #    with open("Tommaso_GUERRA_109_cifrario.ll") as file:
        #        lines = file.readlines()
        #        for line in lines:
        #            if line.find(e) > -1:
        #                print(f"LINE: {line}\nINST: {e}\nN: {line.find(e)}\n")

        # Handle "switch" problem.
        concat = False
        for e in list(instructions):
            if not concat and re.match(".*\\[\\Z", str(e)):
                concat = True
                continue
            index = instructions.index(e)
            if concat:
                instructions[index] = instructions[index - 1] \
                    + instructions[index]
                instructions[index - 1] = ""
                if re.match(".*].*", e):
                    concat = False

        # Handle multi-line problem.
        concat = False
        open_brackets = 0
        for idx, e in enumerate(instructions):
            if concat:
                open_brackets += len(re.findall("[\\(\\[]", e)) - \
                    len(re.findall("[\\)\\]]", e))
                instructions[idx] = instructions[idx - 1] \
                    + instructions[idx].replace("...", "")
                instructions[idx - 1] = ""
                concat = open_brackets != 0
                break
            open_brackets = len(re.findall(
                "[\\(\\[]", e)) - len(re.findall("[\\)\\]]", e))
            if open_brackets > 0:
                concat = True

        # Handle multi-line problem when no parenthesis is open.
        for idx, e in enumerate(instructions):
            if "..." in e:
                instructions[idx] = instructions[idx - 1] \
                    + instructions[idx].replace("...", "")
                instructions[idx - 1] = ""

        # String cleaning.
        for e in list(instructions):
            # Remove all not-alphanumeric or "%" chars at line begin.
            new = re.sub("^[^(a-z)%<(0-9)]*", "", e)
            # Remove all not-alphanumeric or "%" or "]" chars at line end.
            new = re.sub("[^(a-z)\\]%<}(0-9)]*\\Z", "", new)

            # temporaneamente per fare compilare anche il python si può fare
            # così:
            # instructions[instructions.index(e)] = repr(new)

            instructions[instructions.index(e)] = new
        # Remove empty strings.
        instructions = [i for i in instructions if i]
        # Remove <s[0-9]> instructions.
        instructions = [i for i in instructions if not re.match("<s[0-9]>", i)]

        # Get basic-block label (first instruction) and remove it from
        # instructions.
        bb_label = instructions[0]
        instructions.remove(instructions[0])

        # Create a dictionary to map old edges in new graph.
        # Format: {"oldID" : {entry : "entryID", exit : "exitID"}}
        entry_exit_dict = {}

        # Explode original node (set of instruction) into a sequential
        # graph with one node for each instruction).
        for inst in instructions:
            # Parse the instruction with the instruction-visitor module.
            # print("inst: ", inst)

            # For debug. # TODO
            debug_not_found_types = []

            try:
                start_counter_ns = time.perf_counter_ns()

                tuples = iv.parse(inst, gts)

                end_counter_ns = time.perf_counter_ns()
                timer_ns = end_counter_ns - start_counter_ns
                print("#### IV (ms): ", timer_ns/1e6)

            except Exception:
                tuples = {tuple(("op", "not-parsed"))}

            for t_key, t_val in tuples:
                if t_key == "write" and var_flag:
                    # Try to get type of var
                    t_val_tuple = [(k, v) for k, v in tuples.union(gts)
                                   if k == (t_val + tuple_type_suffix)]
                    t_val_type = "unknown-type"

                    if len(t_val_tuple) == 1:
                        t_val_type = t_val_tuple[0][1]

                    if t_val not in A:  # If not present.
                        A.add_node(t_val, label=str(t_val_type), xlabel=t_val,
                                   color=var_color,
                                   type="var")
                        # For debug.
                        if t_val_type == "unknown-type":
                            debug_not_found_types.append(t_val)

                    A.add_edge(node_counter, t_val, label="write",
                               color=var_color)

                elif t_key == "read" and var_flag:
                    t_val_tuple = [(k, v) for k, v in tuples.union(gts)
                                   if k == (t_val + tuple_type_suffix)]
                    t_val_type = "unknown-type"
                    if len(t_val_tuple) == 1:
                        t_val_type = t_val_tuple[0][1]

                    # If not present.
                    if t_val not in A:
                        A.add_node(t_val, label=str(t_val_type), xlabel=t_val,
                                   color=var_color, type="var")
                        # For debug.
                        if t_val_type == "unknown-type":
                            debug_not_found_types.append(t_val)
                    A.add_edge(t_val, node_counter, label="read",
                               color=var_color)

                elif t_key == "op":
                    # Compute node_label using map.
                    node_label = "notfound"  # + "\n(" + inst + ")"
                    node_color = "#ffffff"
                    opcode = t_val
                    dbg_tag = re.findall("!dbg ![0-9]+", inst)
                    if len(dbg_tag) > 0:
                        dbg_tag = dbg_tag[0].split(" ")[1]
                    else:
                        dbg_tag = None
                    # print(f"{inst}  ----  {t_key} - {t_val}")
                    for m in map:
                        regex = m["re"]
                        if re.fullmatch(str(regex), opcode):
                            # + "\n(" + inst + ")"
                            node_label = m["label"].strip()
                            node_color = m["color"].strip()

                    if instructions.index(inst) == 0:  # First.
                        A.add_node(
                            node_counter,
                            label=str(node_label),
                            shape="record",
                            xlabel=f"BB-{bb_label}",
                            fillcolor=node_color,
                            style="filled",
                            type="inst",
                            dbg=dbg_tag)
                        entry_exit_dict["entry"] = node_counter

                        if first_inst:
                            A.nodes()[node_counter]["first_inst"] = True
                            first_inst = False
                    else:
                        A.add_node(
                            node_counter,
                            label=str(node_label),
                            shape="record",
                            fillcolor=node_color,
                            style="filled",
                            type="inst",
                            dbg=dbg_tag)
                        A.add_edge(node_counter - 1, node_counter)
                        # Is a call:
                        call = [v for k, v in tuples if k == "call"]
                        if len(call) == 1:
                            # FIXME: temporary workaround.
                            # Remove '@' at the beginning of the string.
                            # This should be done by visitor (?)
                            call = re.sub("^@", "", call[0])
                            # demangled_call =
                            #   utils.demangle(call).replace(" ", "")
                            A.nodes()[node_counter]["call_to"] = call

                elif t_key == "const" and const_flag:
                    # If not present.
                    if t_val not in A:
                        A.add_node(t_val, label=str(t_val), color=const_color,
                                   type="const")
                    A.add_edge(t_val, node_counter, color=const_color)
                    # , label="read")

                else:
                    pass
            # End - for t in tuples

            node_counter += 1

            # For debug.
            if len(debug_not_found_types) > 0:
                logger.warning(
                    f"{inst} - Not found types for {debug_not_found_types}.")
        # End - for inst in instructions

        entry_exit_dict["exit"] = node_counter - 1
        old[node] = entry_exit_dict

    # End - for node in list(G.nodes)

    A.nodes[node_counter - 1]["last_inst"] = True

    # Step 3: map G edges in A.
    for edge in list(G.edges):
        edge_attributes = ""
        try:
            edge_attributes = nx.get_edge_attributes(G, "label")[edge]
        except Exception:
            pass

        if edge_attributes != "":
            A.add_edge(old[edge[0]]["exit"], old[edge[1]]["entry"],
                       label=str(edge_attributes))
        else:
            A.add_edge(old[edge[0]]["exit"], old[edge[1]]["entry"])

    # Step 4: remove all unuseful terminator instruction
    # TODO Fix: it"s not working always.
    # TODO: find terminator not using regex but looking at the graph
    # e.g. predecessor of flow node with xlabal
    terminator_regex = re.compile(
        "terminator|ret|br|switch|indirectbr|"
        + "invoke|callbr|resume|unreachable|catchswitch|catchret|cleanupret")

    if cut_flag:
        for node in list(A.nodes):
            if re.search(terminator_regex, A._node[node]["label"]):
                # print(f"{A._node[node]['label']} - {A.out_degree(node)}")
                # this controls the in degree and the out degree of the
                # terminator node (maybe others check could be done to
                # remove even more terminator blocks)
                if A.out_degree(node) == 1 and A.in_degree(node) == 1:
                    _, out_v = list(A.out_edges(node))[0]
                    for in_u, _ in list(A.in_edges(node)):
                        A.add_edge(in_u, out_v)
                        A.remove_edge(in_u, node)
                        A.remove_node(node)

    # Step 5: reset all A node IDs.
    A = nx.convert_node_labels_to_integers(A)

    # Step 6: clean labels.
    utils.fix_pydot_issue(A)

    # Return new graph.
    # print("CFG augmented.")
    return A


def generate_acfg_one_function(llvmir: str, map: list, var_flag: bool = True,
                               const_flag: bool = True, sty_flag: bool = True,
                               cut_flag: bool = True, function: str = None,
                               function_params: str = None) -> tuple:
    """
    Starting from a LLVM-IR (as string), generate the abstract cfg
    of function 'function'. 'function' can be not specified if LLVM-IR
    has only one function.

    Args:
        llvmir (str): LLVM-IR of the program.
        map, var_flag, const_flag: parameters of augmenter().
        function

    Returns:
        A triple of
        - the abstract cfg as NetworkX graph;
        - the original cfg of the function as NetworkX graph;
        - function name of cfg.

    Raises:
        ValueError: when function was not specified (when needed) or was
            not found.
    """

    logger.debug(
        f"generate_acfg_one_function \
          params: c={const_flag}, v={var_flag}, cut={cut_flag}, \
          sty={sty_flag},f={function}.")

    # Generate the original CFGs.
    cfgs = utils.llvmir_to_nx_cfgs(llvmir)
    logger.debug(f"Got these function cfgs: {list(cfgs.keys())}")

    # Get one CFG: using function and function_params
    function = function.lower()
    if function:
        # Try using only the function (name).
        matched = {}
        for key, value in cfgs.items():
            key_dem = utils.demangle(key).replace(" ", "")
            if ("_GLOBAL_" in key_dem) or ("_cxx" in key_dem):
                continue
            # Can split: function with parameters.
            key_name = key_dem.lower()
            if key_name.split("("):
                key_name = key_name.split("(")[0]

            # Substring.
            if function in key_name:
                # Special case for 'main': equality.
                if function == 'main' and function != key_name:
                    continue
                matched[key_dem] = value

        if len(matched) == 1:
            match = next(iter(matched))
            G = matched[match]

        # Try using also the signature (function_params).
        elif function_params:

            matched2 = {}
            for key, value in matched.items():
                # matched{} contains already demangled names.
                if key.split("("):
                    params = "(" + key.split("(")[1]
                    print(params)
                    if function_params.replace(" ", "") == params:
                        matched2[key] = value
            if len(matched2) == 1:
                match = next(iter(matched2))
                G = matched2[match]
            else:
                logger.debug(f"Functions that have matched '{function}':\
                    {matched2}.")
                raise Exception("Error while selecting function using \
                    signature.")

        else:
            logger.debug(f"Functions that have matched '{function}':\
                {matched}.")
            raise Exception("Error while selecting function using name.")

    # Get one CFG: only one function in the program.
    elif len(cfgs) == 1:
        # Take the unique function.
        function = next(iter(cfgs))
        G = cfgs[function]

    else:
        raise Exception("Error while selecting function: no function \
            specified and more than one function in the program.")

    logger.info(f"Selected CFG of function {match}.")
    logger.debug(f"Selected CFG of function {match}:{G}")

    # TODO: here we can get some informations from the LLVM-IR (e.g.
    # global identifier, user defined type, ...) and pass them
    # to the augmenter function.
    # Get Global Tuples Set using Module Visitor.
    gts = set()
    try:
        gts = mv.parse(llvmir)
    except BaseException:
        logger.warning("Something went wrong visiting the Module: continue.")

    # Generate abstract CFG and return it.
    try:
        W = augmenter(G, gts, map, var_flag, const_flag, sty_flag, cut_flag)
    except Exception as e:
        logger.error(e)
        raise
    return W, G, function

# TODO: more test needed.


def generate_acfg(llvmir: str, map: list, var_flag: bool = True,
                  const_flag: bool = True, sty_flag: bool = True,
                  cut_flag: bool = True):
    """
    Starting from a LLVM-IR (as string), generate the abstract cfg
    of the program in llvmir.
    """
    start_counter_ns = time.perf_counter_ns()

    # Generate the original CFGs.
    cfgs = utils.llvmir_to_nx_cfgs(llvmir)

    end_counter_ns = time.perf_counter_ns()
    timer_ns = end_counter_ns - start_counter_ns
    print("#### ALL ORIGINAL CFG (ms): ", timer_ns/1e6)

    for id, cfg in cfgs.items():
        print(f"#### ORIGNAL CFG (function,node,edge): {id},{len(cfg.nodes)},{len(cfg.edges)}")


    # Get Global Tuples Set using Module Visitor.
    gts = set()
    try:

        start_counter_ns = time.perf_counter_ns()
        gts = mv.parse(llvmir)

        end_counter_ns = time.perf_counter_ns()
        timer_ns = end_counter_ns - start_counter_ns
        print("#### MODULE VISITOR (ms): ", timer_ns/1e6)

    except BaseException:
        logger.warning("Something went wrong visiting the Module: continue.")

    print("#### FUNCTIONS no: ", len(cfgs))

    # Generate a-cfg for all the functions.
    acfgs = {}
    for function, cfg in cfgs.items():
        logger.info(f"Generating acfg for function {function}...")

        start_counter_ns = time.perf_counter_ns()

        acfgs[function] = augmenter(
            cfg, gts, map, var_flag, const_flag, sty_flag, cut_flag)

        end_counter_ns = time.perf_counter_ns()
        timer_ns = end_counter_ns - start_counter_ns
        print(f"#### ACFG (function,ms): {function},{timer_ns/1e6}")

        logger.info("done.")
        del cfg
    del cfgs

    for id, acfg in acfgs.items():
        print(f"#### ACFG (function,node,edge): {id},{len(acfg.nodes)},{len(acfg.edges)}")

    start_counter_ns = time.perf_counter_ns()

    # Generate callgraph
    with tempfile.TemporaryDirectory() as tmpdirname:
        tmpdir = pathlib.Path(tmpdirname)

        # Create (temporary) llvm-ir input file.
        tmpllvmir = tmpdir / "input.ll"
        with open(tmpllvmir, "w") as f:
            f.write(llvmir)

        # Launch opt-7 and get the callgraph.
        cmd = f"opt-7 -analyze -dot-callgraph {tmpllvmir}"
        if utils.execute_shell_cmd(cmd, tmpdirname) != 0:
            raise RuntimeError("Opt-7 returned a non-zero code.")
        f = tmpdir / pathlib.Path("callgraph.dot")
        callgraph = nx.nx_pydot.read_dot(f)

    utils.nx_to_pdf(callgraph, "o-callgraph.pdf")

    utils.clean_callgraph(callgraph)
    callgraph = nx.DiGraph(callgraph)
    utils.nx_to_pdf(callgraph, "o-callgraph-clean.pdf")

    end_counter_ns = time.perf_counter_ns()
    timer_ns = end_counter_ns - start_counter_ns
    print(f"#### ORIGINAL CALLGRAPH (ms): ", timer_ns/1e6)

    start_counter_ns = time.perf_counter_ns()


    # TEMPPPP
    # utils.nx_to_pdf(callgraph, "callgraph-cleaned.pdf")

    logger.info(f"Functions found in the callgraph: \
        {set([l for _, l in callgraph.nodes(data='label')])}.")

    for _, label in callgraph.nodes(data="label"):

        if acfgs.get(label):
            # raise RuntimeError(f"acfg for function {label} not found.")

            first = [n for n, a in acfgs[label].nodes(data="first_inst") if a]
            if len(first) != 1:
                raise RuntimeError(f"Found more/less than one 'first_inst' \
                    attribute in acfg of {label} function: {first}")
            first = first[0]
            acfgs[label].nodes[first]["entry_node_for"] = label
            if acfgs[label].nodes[first].get("xlabel"):
                acfgs[label].nodes[first]["xlabel"] += ",Fentry-" + label
            else:
                acfgs[label].nodes[first]["xlabel"] = "Fentry-" + label

            last = [n for n, a in acfgs[label].nodes(data="last_inst") if a]
            if len(last) != 1:
                raise RuntimeError(f"Found more/less than one 'last_inst' \
                    attribute in acfg of {label} function.")
            last = last[0]
            acfgs[label].nodes[last]["exit_node_for"] = label
            if acfgs[label].nodes[last].get("xlabel"):
                acfgs[label].nodes[last]["xlabel"] += ",Fexit-" + label
            else:
                acfgs[label].nodes[last]["xlabel"] = "Fexit-" + label

            calls = [(n, a)
                     for n, a in acfgs[label].nodes(data="call_to") if a]
            for (node_from, to_function) in calls:
                acfgs[label].nodes[node_from]["call_from"] = label
                acfgs[label].nodes[node_from]["call_to_function"] = to_function

    # Join all acfgs.
    A = nx.disjoint_union_all([g for k, g in acfgs.items()
                               # TEMPORARY WORKAROUND: exclude functions that
                               # begins with '__cxx_global_var_init' or
                               # '_GLOBAL__sub'.
                               if not re.match("^__cxx_global_var_init.*", k)
                               and not re.match("^_GLOBAL__sub.*", k)
                               ])

    entry_map = {}
    exit_map = {}
    excluded_labels = []
    for _, label in callgraph.nodes(data="label"):
        entries = [n for n, a in A.nodes(data="entry_node_for") if a == label]
        exits = [n for n, a in A.nodes(data="exit_node_for") if a == label]
        if not entries:
            # exclude: no cfg for function label generated.
            excluded_labels.append(label)
            continue
        if len(entries) != 1:
            raise RuntimeError(f"Found more/less than one 'entry_node_for' \
                attribute for function {label}: {entries}")
        if len(exits) != 1:
            raise RuntimeError(f"Found more/less than one 'exit_node_for' \
                attribute for function {label}: {exits}")
        entry_map[label] = entries[0]
        exit_map[label] = exits[0]

    for n, label in callgraph.nodes(data="label"):
        if callgraph.out_degree(n) > 0:
            # Search for 'call_to_function' attributes in 'call_from' = label.
            for n, a in A.nodes(data="call_from"):
                if a == label:
                    # Add edge.
                    to = A.nodes(data="call_to_function")[n]
                    if entry_map.get(to) and exit_map.get(to):
                        if to not in excluded_labels:
                            A.add_edge(n, entry_map[to])
                            A.add_edge(exit_map[to], n)
                    else:
                        logger.warning(
                            f"{to} not found in entry_map or exit_map")

    if excluded_labels:
        logger.warning(f"link with {excluded_labels} cfgs ignored.")

    #utils.nx_to_pdf(A, "tempA.pdf")


    # Remove all unuseful CC.
    starting_nodes = utils.nodes_with_no_inst_pred(A)
    starting_nodes = [n for n in starting_nodes
                      if not A.nodes[n].get("entry_node_for")
                      or ("cxx"
                          in str(A.nodes[n].get("entry_node_for"))
                          or "__clang"
                          in str(A.nodes[n].get("entry_node_for")))]
    # starting_nodes = [n for n in starting_nodes
    #                   if (not A.nodes[n].get("entry_node_for"))
    #                       or ("main" not in A.nodes[n].get("entry_node_for"))]
    logger.info("Dropping CC with nodes "
                 + ", ".join([f"{n}:{A.nodes[n].get('xlabel')}"
                              for n in starting_nodes]))
    cc_nodes = set()
    for s in starting_nodes:
        cc_nodes = cc_nodes.union(
            utils.node_connected_component_only_inst(A, s)
            # nx.node_connected_component(A.to_undirected(), s)
            )

    # for c in cc_nodes:
    #     A.nodes[c]["fillcolor"] = "black"
    # utils.nx_to_pdf(A, "AAA.pdf")

    A.remove_nodes_from(list(cc_nodes))

    # Removes remaining 'var' and 'const' nodes.
    A.remove_nodes_from(
        list([n for n in A.nodes
             if A.in_degree(n) == 0 and A.out_degree(n) == 0]))

    if nx.number_connected_components(A.to_undirected()) != 1:
        logger.critical(
            "Number of cc in acfg: "
            + str(nx.number_connected_components(A.to_undirected())))
        raise Exception

    # Reset all A node IDs.
    A = nx.convert_node_labels_to_integers(A)

    end_counter_ns = time.perf_counter_ns()
    timer_ns = end_counter_ns - start_counter_ns
    print(f"#### CALLGRAPH (ms): ", timer_ns/1e6)
    print(f"#### CALLGRAPH (node,edge): {len(A.nodes)},{len(A.edges)}")

    return A


def main() -> None:
    """
    Produces a new augmented CFG (as a .dot file) of one function
    in the source code LLVM-IR given as input.
    """

    logging.config.fileConfig(
        os.path.join(os.path.dirname(__file__), "../../../log.config"),
        disable_existing_loggers=False)

    parser = argparse.ArgumentParser()
    # Positional options.
    parser.add_argument("llvmir_file", type=str,
                        help="input .ll file")
    # Non-positional options.
    parser.add_argument("-m", "--mapping", type=str, metavar="MAP",
                        default="3",
                        help="map-id [0-4] or csv file")
    parser.add_argument("-sty", "--simplified-types", action="store_true",
                        default=False,
                        help="use simplified types instead of RAW types.")
    parser.add_argument("-nv", "--no-var", action="store_true",
                        default=False,
                        help="do not generate variables subgraph")
    parser.add_argument("-nc", "--no-const", action="store_true",
                        default=False,
                        help="do not generate constants subgraph")
    parser.add_argument("-ncut", "--no-cut", action="store_true",
                        default=False,
                        help="do not 'clean' tree: \
                        e.g. removing unuseful terminators")
    parser.add_argument("-o", "--output", type=str, metavar="OUT_FILENAME",
                        default="",
                        help="output abstract cfg file name")
    parser.add_argument("-fn", "--function-name", type=str,
                        metavar="FUNCTION_NAME", default="",
                        help="name of function in the source code of which to \
                            generate the abstract cfg")
    parser.add_argument("-fp", "--function-params", type=str,
                        metavar="FUNCTION_PARAMS", default="",
                        help="params of function in the source code of \
                            which to generate the abstract cfg")
    parser.add_argument("-e", "--extra-output", action="store_true",
                        default=False,
                        help="extra output: ?")
    parser.add_argument("-d", "--debug", action="store_true",
                        default=False,
                        help="print debug log")
    # choices=logging._nameToLevel.keys()
    args = parser.parse_args()
    llvmir_file = args.llvmir_file
    function_name = args.function_name
    function_params = args.function_params
    var_flag = not args.no_var
    const_flag = not args.no_const
    cut_flag = not args.no_cut
    sty_flag = args.simplified_types
    extra_output_flag = args.extra_output
    spec_out = args.output

    # Set debug level.

    # if args.debug:
    #     logging.getLogger("root").handlers[0].setLevel(logging.DEBUG)
    # else:
    #     logging.getLogger("root").handlers[0].setLevel(logging.WARNING)

    # Read llvmir file.
    llvmir = ""
    with open(llvmir_file, "r") as f:
        for line in f:
            llvmir += line

    # Generate map from csv.
    input_map_path: str = ""
    if args.mapping.isdigit():
        input_map_path = get_predef_map_path(int(args.mapping))
    else:
        input_map_path = args.mapping

    logger.info(f"Generating map from csv '{input_map_path}'... ")
    map: list[dict] = gen_map_from_csv(input_map_path)
    logger.info(f"Generating map from csv '{input_map_path}'... done.")

    function_name_found = ""
    G = None

    print("Generating absract CFG... ")
    if function_name:
        # Generate abstract cfg of (eventually) specified function.
        try:
            A, G, function_name_found = \
                generate_acfg_one_function(llvmir, map, var_flag, const_flag,
                                           sty_flag, cut_flag, function_name,
                                           function_params)
        except BaseException:
            raise
        # A: abstract cfg of 'function_name_found'
        # G: original cfg of 'function_name_found'
        print(f"...found function {function_name_found}...")
    else:
        A = generate_acfg(llvmir, map, var_flag,
                          const_flag, sty_flag, cut_flag)
    print("done.")

    # TODO: think about how to handle -o option.

    # Option '-o'.
    if not spec_out:
        basename = f"{pathlib.Path(llvmir_file).stem}"
        if function_name_found:
            basename += "-" + function_name_found
    else:
        basename = spec_out

    # Plot abstract cfg as dot file.
    if spec_out:
        out_dot = basename
    else:
        out_dot = f"acfg-{basename}.dot"

    # my_set = set([k for n in A.nodes for k in A.nodes[n].keys()])
    # for s in my_set:
    #     for k, v in nx.get_node_attributes(A, s).items():
    #         # print(v)
    #         if ":" in str(v):
    #             print("node", s, k, v)
    #     for k, v in nx.get_edge_attributes(A, s).items():
    #         # print(v)
    #         if ":" in str(v):
    #             print("edge", s, k, v)

    nx.nx_pydot.write_dot(A, out_dot)
    print(f"New A-CFG written in '{out_dot}'.")

    # Extra output.
    if extra_output_flag:
        # Original CFG dot.
        # TODO: print original cfgs also when doing complete acfg.
        if G:
            out_orig_dot = pathlib.Path(
                f"ocfg-{pathlib.Path(basename).stem}.dot")
            nx.nx_pydot.write_dot(G, out_orig_dot)
            print(f"Original CFG ({G}) written in '{out_orig_dot}'.")
            # Original CFG pdf.
            out_orig_pdf = pathlib.Path(
                f"ocfg-{pathlib.Path(basename).stem}.pdf")
            utils.nx_to_pdf(G, out_orig_pdf)
            print(f"Original CFG ({G}) printed as pdf in '{out_orig_pdf}'.")
        # Abstract CFG pdf.
        out_a_pdf = pathlib.Path(f"{pathlib.Path(out_dot).stem}.pdf")
        utils.nx_to_pdf(A, out_a_pdf)
        print(f"A-CFG ({A}) printed as pdf in '{out_a_pdf}'.")

    return


if __name__ == "__main__":
    main()
