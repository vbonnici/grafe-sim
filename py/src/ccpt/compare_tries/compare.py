from collections import Counter
import networkx as nx
import argparse
import ccpt.cfg_to_trie.utils as utils
import os


# def foo() -> None:
#
#     G1 = utils.dot_to_nx("../examples/mwe/parsed_xml_incr2.dot")
#     G2 = utils.dot_to_nx("../examples/mwe/parsed_xml_incr3.dot")
#
#     labels_G1 = nx.get_node_attributes(G1, "label")
#     labels_G2 = nx.get_node_attributes(G2, "label")
#     xlabels_G1 = nx.get_node_attributes(G1, "xlabel")
#     xlabels_G2 = nx.get_node_attributes(G2, "xlabel")
#
#     lista_G1 = list(nx.dfs_edges(G1, source='0'))
#     lista_G2 = list(nx.dfs_edges(G2, source='0'))
#
#     #for l in lista_G1:
#     #    #print(f"{labels_G1[l[0]]} -> {labels_G1[l[1]]}")
#     #    print(f"{labels_G1[l[0]]} ({xlabels_G1[l[0]]}) ->\
#                {labels_G1[l[1]]} ({xlabels_G1[l[1]]})")
#
#     leafs_G1 = []
#     leafs_G2 = []
#     paths_G1 = []
#     paths_G2 = []
#     # find all the leafs in the tree
#     for n in G1.nodes:
#         if len(list(G1.successors(n))) == 1:
#             leafs_G1.append(n)
#
#     # find the path from the root to each leaf
#     for n in leafs_G1:
#         for path in nx.all_simple_paths(G1, source='0', target=str(n)):
#             pathx = []
#             for p in path:
#                 pathx.append(labels_G1[str(p)])
#             paths_G1.append(pathx)
#
#     for n in G2.nodes:
#         if len(list(G2.successors(n))) == 1:
#             leafs_G2.append(n)
#     # find the path from the root to each leaf
#     for n in leafs_G2:
#         for path in nx.all_simple_paths(G2, source='0', target=str(n)):
#             pathx = []
#             for p in path:
#                 pathx.append(labels_G2[str(p)])
#             paths_G2.append(pathx)
#
#     #print(paths_G1)
#     #print("###")
#     #print(paths_G2)
#
#     found = 0
#
#     for p in paths_G1:
#         if p in paths_G2:
#             found += 1
#     print(f"Num elem G1: {len(paths_G1)}")
#     print(f"Num elem G2: {len(paths_G2)}")
#     print(f"Found G1/Num elem G1: {found/len(paths_G1)}")


# TODO:
# - Use set to do union and intersection
# - Check graph properties at the beginning: must be DiGraph, must have
#   label and path_occurences attributes.
def jaccard(G1: nx.DiGraph, G2: nx.DiGraph) -> float:
    '''

    Given to prefix trees, this function performs the jaccard
    similarity.
    '''
    # if not nx.is_tree(G1) or not nx.is_tree(G2):
    #    print(f"The graphs must be trees!")
    #    return

    assert isinstance(G1, nx.DiGraph)
    assert isinstance(G2, nx.DiGraph)

    labels_G1 = nx.get_node_attributes(G1, "label")
    labels_G2 = nx.get_node_attributes(G2, "label")
    cc_G1 = nx.get_node_attributes(G1, "child_count")
    cc_G2 = nx.get_node_attributes(G2, "child_count")
    po_G1 = nx.get_node_attributes(G1, "path_occurences")
    po_G2 = nx.get_node_attributes(G2, "path_occurences")
    # print("path_occ G1", po_G1)
    # print("path_occ G2", po_G2)

    leafs_G1 = []
    leafs_G2 = []

    leafs_G1 = [x for x in G1.nodes() if int(cc_G1[x]) == 0]
    # if G1.out_degree(x) == 0 and G1.in_degree(x) > 0]

    leafs_G2 = [x for x in G2.nodes() if int(cc_G2[x]) == 0]
    # if G2.out_degree(x) == 0 and G2.in_degree(x) > 0]

    # print("leafs G1", leafs_G1)
    # print("leafs G2", leafs_G2)

    # generate all the paths from the root to the leafs
    paths_G1 = []
    paths_G2 = []
    for leaf in leafs_G1:
        paths_G1.append(nx.shortest_path(G1, source=0,
                                         target=leaf))

    for leaf in leafs_G2:
        paths_G2.append(nx.shortest_path(G2, source=0,
                                         target=leaf))

    # print("paths G1", paths_G1)
    # print("paths G2", paths_G2)

    # map the numbers into the correct labels
    # then add the correct number of paths in the list
    if len(labels_G1) > 0 and len(labels_G2) > 0:
        if len(labels_G1) != len(list(G1.nodes())) \
                and len(labels_G1) != len(list(G1.nodes())):
            print("Something wrong with labels.")
            raise ValueError
        paths_G1_new = []
        paths_G2_new = []
        for p in paths_G1:
            pp2 = []
            for pp in p:
                pp2.append(str(labels_G1[pp]))

            for x in range(0, int(po_G1[p[-1]])):
                paths_G1_new.append(pp2)

        for p in paths_G2:
            pp2 = []
            for pp in p:
                pp2.append(str(labels_G2[pp]))
            for x in range(0, int(po_G2[p[-1]])):
                paths_G2_new.append(pp2)
        paths_G1 = paths_G1_new
        paths_G2 = paths_G2_new

    # print("paths G1", paths_G1)
    # print("paths G2", paths_G2)

    # find the intersection of the lists
    intersection = []
    for p in paths_G1:
        if p not in intersection:
            min_p = min(paths_G1_new.count(p), paths_G2_new.count(p))
            for x in range(0, min_p):
                intersection.append(p)

    # print(f"intersection {intersection}")

    # find the union of the lists
    union = []
    for p in paths_G1:
        if p in intersection:
            if p not in union:
                p_in_G1 = len([x for x in paths_G1 if x == p])
                p_in_G2 = len([x for x in paths_G2 if x == p])
                # print(f"p_in_G1 {p_in_G1}")
                # print(f"p_in_G2 {p_in_G2}")
                for x in range(max(p_in_G1, p_in_G2)):
                    union.append(p)
        else:
            union.append(p)
    for p in paths_G2:
        if p in intersection:
            if p not in union:
                p_in_G1 = len([x for x in paths_G1 if x == p])
                p_in_G2 = len([x for x in paths_G2 if x == p])
                # print(f"p_in_G1 {p_in_G1}")
                # print(f"p_in_G2 {p_in_G2}")
                for x in range(max(p_in_G1, p_in_G2)):
                    union.append(p)
        else:
            union.append(p)
    # union.sort()

    # print(f"union {union}")

    jacc: float = len(intersection) / len(union)
    return jacc


def mset_union(mset1: Counter, mset2: Counter) -> Counter:
    """
    Union operation on multisets (bag) stored as a Counter.
    https://en.wikipedia.org/wiki/Multiset
    https://docs.python.org/3/library/collections.html#collections.Counter

    Args:
        mset1 (Counter): multiset1 as Counter object.
        mset2 (Counter): multiset2 as Counter object.

    Returns:
        A multiset (as Counter object) that is the union of mset1 and
        mset2.

    Raises:
        ValueError: if mset1 or mset2 are not instance of Counter class.
    """

    if not isinstance(mset1, Counter) or not isinstance(mset1, Counter):
        raise ValueError

    union: Counter = Counter()
    for e in list(mset1) + list(mset2):
        if union[e] == 0:
            c1 = mset1[e]
            c2 = mset2[e]
            union[e] += max(c1, c2)
    return union


def mset_intersec(mset1: Counter, mset2: Counter) -> Counter:
    """
    Intersection operation on multisets (bag) stored as a Counter.
    https://en.wikipedia.org/wiki/Multiset
    https://docs.python.org/3/library/collections.html#collections.Counter

    Args:
        mset1 (Counter): multiset1 as Counter object.
        mset2 (Counter): multiset2 as Counter object.

    Returns:
        A multiset (as Counter object) that is the intersection of mset1 and
        mset2.

    Raises:
        ValueError: if mset1 or mset2 are not instance of Counter class.
    """

    if not isinstance(mset1, Counter) or not isinstance(mset1, Counter):
        raise ValueError

    intersec: Counter = Counter()
    for e in mset1:
        c1 = mset1[e]
        c2 = mset2[e]
        intersec[e] += min(c1, c2)
    return intersec


def mset_sum(mset1: Counter, mset2: Counter) -> Counter:
    """
    Sum operation on multisets (bag) stored as a Counter.
    https://en.wikipedia.org/wiki/Multiset
    https://docs.python.org/3/library/collections.html#collections.Counter

    Args:
        mset1 (Counter): multiset1 as Counter object.
        mset2 (Counter): multiset2 as Counter object.

    Returns:
        A multiset (as Counter object) that is the sum of mset1 and mset2.

    Raises:
        ValueError: if mset1 or mset2 are not instance of Counter class.
    """

    if not isinstance(mset1, Counter) or not isinstance(mset1, Counter):
        raise ValueError

    sum: Counter = Counter()
    for e in list(mset1) + list(mset2):
        if sum[e] == 0:
            c1 = mset1[e]
            c2 = mset2[e]
            sum[e] += c1 + c2
    return sum


def get_list_of_paths_from(G: nx.DiGraph, root: int, all_leafs: bool = False) \
        -> list:
    """
    Generates a list of paths (a string in the form "node0->node1->..->nodeN)
    starting from 'root' node in prefix-tree G. The number of occurrences of
    paths is taken into account. By default, all paths ending in a leaf with
    depth less than lp is discarded.

    Args:
        G (nx.DiGraph): prefix tree.
        root (int): ID of node in G that is the root of paths to generate.
        all_leafs (bool): include also all the paths ending in a leaf that
            is not at maximum depth of the tree = lp.
    Returns:
        A list of all the paths (eventually repeated) starting from root in G.

    Raises:
        ValueError: when something goes wrong with node labels.
    """

    labels = nx.get_node_attributes(G, "label")
    # Clean labels from ".
    labels = {key: value.replace("\"", "") for (key, value) in labels.items()}
    cc = nx.get_node_attributes(G, "child_count")
    po = nx.get_node_attributes(G, "path_occurences")
    d = nx.get_node_attributes(G, "depth")

    # Collect leafs of the tree.
    leafs = [x for x in G.nodes() if int(cc[x]) == 0
             and (all_leafs or d[x] == G.graph["lp"])]
    # TODO: use in_ and out_degree.
    # if G1.out_degree(x) == 0 and G1.in_degree(x) > 0]

    # Generate all the paths from the root to the leaf.
    paths = []
    for leaf in leafs:
        path = nx.shortest_path(G, source=root, target=leaf)
        # Exclude fake-root (id = 0)
        path = [n for n in path if n != 0]
        paths.append(path)

    # Map the numbers into the correct labels.
    paths_new = []

    if len(labels) > 0:
        if len(labels) != len(list(G.nodes())):
            print("Something wrong with labels.")
            raise ValueError
        paths_new = []
        for p in paths:
            pp2 = ""
            for idx, pp in enumerate(p):
                pp2 += str(labels[pp])
                if idx != len(p) - 1:
                    pp2 += "->"

            # Add the correct number of paths in the list.
            for x in range(0, int(po[p[-1]])):
                paths_new.append(pp2)

    return paths_new


def jaccard1(G: nx.DiGraph, W: nx.DiGraph) -> float:
    """
    Computes Jaccard index between two prefix tree G and W using formula
    that applies to multiset: https://en.wikipedia.org/wiki/Jaccard_index.

    Args:
        G (nx.DiGraph): prefix tree 1.
        W (nx.DiGraph): prefix tree 2.

    Returns:
        The jaccard index as float number in [0 .. 0.5].

    Raises:
        ValueError: if G and W are not a tree with root ID 0 and label
        "fake-root".
    """

    if not nx.is_tree(G) or not nx.is_tree(W):
        raise ValueError
    # lst1 = [n for n, d in G.in_degree(G.nodes()) if d == 0]
    # lst2 = [n for n, d in W.in_degree(W.nodes()) if d == 0]
    # Found more than one root (maybe reduntant).
    # if len(lst1) != 1 or len(lst2) != 1:
    #   raise ValueError
    # TODO: Problems with label trash.
    # Check roots.
    # for r in lst1 + lst2:
        # print(nx.get_node_attributes(G, "label"))
        # if r != 0 or nx.get_node_attributes(G, "label")[r] != "fake-root":
        #    raise ValueError

    paths_G = get_list_of_paths_from(G, 0)
    paths_W = get_list_of_paths_from(W, 0)
    paths_G_mset = Counter(paths_G)
    paths_W_mset = Counter(paths_W)
    i: Counter = mset_intersec(paths_G_mset, paths_W_mset)
    s: Counter = mset_sum(paths_G_mset, paths_W_mset)
    # jaccard: float = i.total() / s.total()
    jaccard: float = sum([v for _, v in i.items()]) \
        / sum([v for _, v in s.items()])
    return jaccard


def jaccard2(G: nx.DiGraph, W: nx.DiGraph) -> float:
    """
    Computes Jaccard index between two prefix tree G and W using standard
    formula but with intersection and union operation of multisets.

    Args:
        G (nx.DiGraph): prefix tree 1.
        W (nx.DiGraph): prefix tree 2.

    Returns:
        The jaccard index as float number in [0 .. 1].

    Raises:
        None.
    """

    if not nx.is_tree(G) or not nx.is_tree(W):
        raise ValueError

    paths_G = get_list_of_paths_from(G, 0)
    paths_W = get_list_of_paths_from(W, 0)
    paths_G_mset = Counter(paths_G)
    paths_W_mset = Counter(paths_W)

    i: Counter = mset_intersec(paths_G_mset, paths_W_mset)
    u: Counter = mset_union(paths_G_mset, paths_W_mset)
    # jaccard: float = i.total() / u.total()
    jaccard: float = sum([v for _, v in i.items()]) \
        / sum([v for _, v in u.items()])
    return jaccard


def gen_total_paths_set(tries: list) -> set():
    '''
    Given a list of tries, returns the set of all the paths in all the
    tries. Each path is a string like "nodeA->nodeB->nodeC".

    Args:
        tries : list of nx.DiGraph

    Return:
        The set of all the paths
    '''
    global_paths_set = set()
    # The given list must contain at least one trie.
    if len(tries) < 1:
        raise ValueError

    # Generate all the paths of all the tries.
    for t in tries:
        global_paths_set.update(get_list_of_paths_from(t, 0))

    return global_paths_set


def gen_feature_vector(global_path_list: list, G: nx.DiGraph):
    '''
    Given a the global list of paths and a trie, returns the vector of
    features looking at the number of occurencies.

    Args:
        global_path_list : list of all paths
        G : (nx.DiGraph) prefix tree

    Return:
        A vector in which every position is the number of occurrencies
        of the path in the analized trie.
    '''
    features: dict[str, int] = {}

    # Get all the paths from the trie
    trie_paths = get_list_of_paths_from(G, 0)

    for p in global_path_list:
        features[p] = trie_paths.count(p)

    return features


def main() -> None:
    print("### CCMP - COMPARE")

    parser = argparse.ArgumentParser()
    parser.add_argument("dotfiles", type=str,
                        help="input dot files", nargs='+')
    args = parser.parse_args()

    if len(args.dotfiles) == 2:
        G1 = utils.dot_to_nx(args.dotfiles[0])
        G2 = utils.dot_to_nx(args.dotfiles[1])

        jacc: float = jaccard(G1, G2)
        jacc1: float = jaccard1(G1, G2)
        jacc2: float = jaccard2(G1, G2)

        print(f"old jaccard score: {jacc}")
        print(f"jaccard1 score [0..0.5]: {jacc1}")
        print(f"jaccard2 score [0....1]: {jacc2}")

        # write the scores and the names of the programs into a file
        with open(os.path.join(os.path.dirname(__file__),
                               "scores.csv"), mode="a", newline="") as csvfile:
            row: str = args.dotfiles[0] + ";" + args.dotfiles[1] + ";"\
                + str(jacc1) + ";" + str(jacc2) + "\n"
            csvfile.write(row)
    else:
        print("Wrong number of parameters, 2 expected!")
        exit(1)


if __name__ == "__main__":
    main()
