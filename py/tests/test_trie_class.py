import pytest
from ccpt.cfg_to_trie.gentrie import Trie
import networkx as nx


def util_genG() -> nx.DiGraph:
    # G: A -- B -- C -- D
    G = nx.DiGraph()
    G.add_node(0, label="A")
    G.add_node(1, label="B")
    G.add_node(2, label="C")
    G.add_node(3, label="D")
    G.add_edge(0, 1)
    G.add_edge(1, 2)
    G.add_edge(2, 3)
    return G


def test_trie_attribute_access():
    G = util_genG()
    T: Trie = Trie(acfg=G, lp=4)

    # All attributes are "private".
    with pytest.raises(AttributeError):
        print(T.__lp)
    with pytest.raises(AttributeError):
        print(T.__nxtree)
    with pytest.raises(AttributeError):
        print(T.__paths)

    # But can be accessed in this way.
    print(T._Trie__lp)
    print(T._Trie__nxtree)
    print(T._Trie__paths)

    # Or with getter methods.
    print(T.get_lp())
    print(T.get_nxtree())
    print(T.get_paths())


def test_from_old_gentrie():
    G = util_genG()
    T: Trie = Trie(G, 2)

    assert T.get_lp() == 2
    assert isinstance(T.get_nxtree(), nx.DiGraph)
    assert T.get_paths() != {}

    E = nx.DiGraph()
    E.add_node(0, label="fake-root")
    E.add_node(1, label="A")
    E.add_node(2, label="B")
    E.add_node(3, label="B")
    E.add_node(4, label="C")
    E.add_node(5, label="C")
    E.add_node(6, label="D")
    E.add_node(7, label="D")
    E.add_edge(0, 1)
    E.add_edge(1, 2)
    E.add_edge(0, 3)
    E.add_edge(3, 4)
    E.add_edge(0, 5)
    E.add_edge(5, 6)
    E.add_edge(0, 7)

    assert nx.is_isomorphic(T.get_nxtree(), E)
