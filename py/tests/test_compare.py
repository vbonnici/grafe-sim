import pytest
import networkx as nx
import ccpt.compare_tries.compare as compare
from collections import Counter


def test_jaccard_1():
    G = nx.DiGraph(lp=1)
    G.add_node(0, label="fake-root", child_count=3, depth=0)
    G.add_node(1, label="A", path_occurences=1, child_count=0, depth=1)
    G.add_node(2, label="B", path_occurences=1, child_count=0, depth=1)
    G.add_node(3, label="C", path_occurences=1, child_count=0, depth=1)
    G.add_edge(0, 1)
    G.add_edge(0, 2)
    G.add_edge(0, 3)

    W = nx.DiGraph(lp=1)
    W.add_node(0, label="fake-root", child_count=3, depth=0)
    W.add_node(1, label="A", path_occurences=1, child_count=0, depth=1)
    W.add_node(2, label="B", path_occurences=1, child_count=0, depth=1)
    W.add_node(3, label="C", path_occurences=1, child_count=0, depth=1)
    W.add_edge(0, 1)
    W.add_edge(0, 2)
    W.add_edge(0, 3)

    assert nx.is_isomorphic(G, W)
    assert compare.jaccard(G, W) == 1.0
    assert compare.jaccard1(G, W) == 0.5
    assert compare.jaccard2(G, W) == 1.0


def test_jaccard_0():
    G = nx.DiGraph(lp=1)
    G.add_node(0, label="fake-root", child_count=3, depth=0)
    G.add_node(1, label="A", path_occurences=1, child_count=0, depth=1)
    G.add_node(2, label="B", path_occurences=1, child_count=0, depth=1)
    G.add_node(3, label="C", path_occurences=1, child_count=0, depth=1)
    G.add_edge(0, 1)
    G.add_edge(0, 2)
    G.add_edge(0, 3)

    W = nx.DiGraph(lp=1)
    W.add_node(0, label="fake-root", child_count=3, depth=0)
    W.add_node(1, label="D", path_occurences=1, child_count=0, depth=1)
    W.add_node(2, label="E", path_occurences=1, child_count=0, depth=1)
    W.add_node(3, label="F", path_occurences=1, child_count=0, depth=1)
    W.add_edge(0, 1)
    W.add_edge(0, 2)
    W.add_edge(0, 3)

    assert compare.jaccard(G, W) == 0.0
    assert compare.jaccard1(G, W) == 0.0
    assert compare.jaccard2(G, W) == 0.0


def test_jaccard_mix():
    G = nx.DiGraph(lp=2)
    G.add_node(0, label="fake-root", child_count=1, depth=0)
    G.add_node(1, label="A", path_occurences=1, child_count=2, depth=1)
    G.add_node(2, label="B", path_occurences=2, child_count=0, depth=2)
    G.add_node(3, label="C", path_occurences=1, child_count=0, depth=2)
    G.add_edge(0, 1)
    G.add_edge(1, 2)
    G.add_edge(1, 3)

    W = nx.DiGraph(lp=2)
    W.add_node(0, label="fake-root", child_count=1, depth=0)
    W.add_node(1, label="A", path_occurences=1, child_count=2, depth=1)
    W.add_node(2, label="B", path_occurences=1, child_count=0, depth=2)
    W.add_node(3, label="C", path_occurences=1, child_count=0, depth=2)
    W.add_edge(0, 1)
    W.add_edge(1, 2)
    W.add_edge(1, 3)

    assert compare.jaccard(G, W) == pytest.approx(0.66, 0.1)
    assert compare.jaccard2(G, W) == pytest.approx(0.66, 0.1)
    assert compare.jaccard1(G, W) == 0.4


def test_mset_op():
    mset1 = Counter(["AA", "AA", "AA", "BB", "BB"])
    mset2 = Counter(["AA", "AA", "CC", "BB", "CC"])

    inters = compare.mset_intersec(mset1, mset2)
    union = compare.mset_union(mset1, mset2)
    sum = compare.mset_sum(mset1, mset2)

    assert inters == Counter(["AA", "AA", "BB"])
    assert union == Counter(["AA", "AA", "AA", "BB", "BB", "CC", "CC"])
    assert sum == Counter(["AA", "AA", "AA", "AA", "AA", "BB", "BB",
                           "BB", "CC", "CC"])


def test_gen_features_vector():

    # G:
    # fake-root
    #     --- A --- B (2)
    #           --- C (1)
    #     --- C (8)

    G = nx.DiGraph(name="G", lp=2)

    G.add_node(0, label="fake-root", child_count=2, depth=0)
    G.add_node(1, label="A", path_occurences=1, child_count=2, depth=1)
    G.add_node(2, label="B", path_occurences=2, child_count=0, depth=2)
    G.add_node(3, label="C", path_occurences=1, child_count=0, depth=2)
    G.add_node(4, label="C", path_occurences=8, child_count=0, depth=1)
    G.add_edge(0, 1)
    G.add_edge(1, 2)
    G.add_edge(1, 3)
    G.add_edge(0, 4)

    # W:
    # fake-root
    #     --- A --- B (1)
    #           --- D (1)
    W = nx.DiGraph(name="W", lp=2)
    W.add_node(0, label="fake-root", child_count=1, depth=0)
    W.add_node(1, label="A", path_occurences=1, child_count=2, depth=1)
    W.add_node(2, label="B", path_occurences=1, child_count=0, depth=2)
    W.add_node(3, label="D", path_occurences=1, child_count=0, depth=2)
    W.add_edge(0, 1)
    W.add_edge(1, 2)
    W.add_edge(1, 3)
    tries: list[nx.Digraph] = [G, W]

    global_list = compare.gen_total_paths_set(tries)
    expected = set(["A->B", "A->C", "A->D"])
    assert expected == set(global_list)

    feature_table: dict = {}
    for T in tries:
        feature_table[T.name] = compare.gen_feature_vector(global_list, T)

    expected = {}
    expected["G"] = {"A->C": 1, "A->B": 2, "A->D": 0}
    expected["W"] = {"A->C": 0, "A->B": 1, "A->D": 1}

    for k in feature_table:
        assert expected[k] == feature_table[k]


def test_get_list_of_path_from():

    # G (lp=3):
    # fake-root
    #     --- A (3) --- B (2) --- D (2)
    #               --- C (1) --- D (1)
    #     --- C (10)--- D (8) --- E (8)
    #               --- E (2)
    #     --- B (3)

    G = nx.DiGraph(name="G", lp=3)

    G.add_node(0, label="fake-root", child_count=3, depth=0)

    G.add_node(1, label="A", path_occurences=3, child_count=2, depth=1)
    G.add_node(2, label="B", path_occurences=2, child_count=1, depth=2)
    G.add_node(3, label="D", path_occurences=2, child_count=0, depth=3)
    G.add_node(4, label="C", path_occurences=1, child_count=1, depth=2)
    G.add_node(5, label="D", path_occurences=1, child_count=0, depth=3)

    G.add_node(6, label="C", path_occurences=10, child_count=2, depth=1)
    G.add_node(7, label="D", path_occurences=8, child_count=1, depth=2)
    G.add_node(8, label="E", path_occurences=8, child_count=0, depth=3)
    G.add_node(9, label="E", path_occurences=2, child_count=0, depth=2)

    G.add_node(10, label="B", path_occurences=3, child_count=0, depth=1)

    G.add_edge(0, 1)
    G.add_edge(0, 6)
    G.add_edge(0, 10)
    G.add_edge(1, 2)
    G.add_edge(1, 4)
    G.add_edge(2, 3)
    G.add_edge(4, 5)
    G.add_edge(6, 7)
    G.add_edge(6, 9)
    G.add_edge(7, 8)

    paths_def = compare.get_list_of_paths_from(G, 0)
    paths_all_leafs = compare.get_list_of_paths_from(G, 0, True)

    # Check paths lenght.
    assert min([len(p.split("->")) for p in paths_def]) == 3
    assert max([len(p.split("->")) for p in paths_def]) == 3
    assert min([len(p.split("->")) for p in paths_all_leafs]) == 1
    assert max([len(p.split("->")) for p in paths_all_leafs]) == 3

    # Check paths occurency.
    paths_def_true = {"A->B->D": 2, "A->C->D": 1, "C->D->E": 8}
    paths_all_leafs_true = {"A->B->D": 2, "A->C->D": 1, "C->D->E": 8,
                            "C->E": 2, "B": 3}

    for pt, nt in paths_def_true.items():
        assert len([p for p in paths_def if p == pt]) == nt
    for pt, nt in paths_all_leafs_true.items():
        assert len([p for p in paths_all_leafs if p == pt]) == nt

    # Check number of paths generated.
    assert sum([v for _, v in paths_all_leafs_true.items()]) \
        == len(paths_all_leafs)
    assert sum([v for _, v in paths_def_true.items()]) \
        == len(paths_def)
