import os
import pytest # noqa
import ccpt.cfg_to_trie.utils as utils
import networkx as nx


def test_dot_to_nx_trie():

    G = nx.DiGraph()
    G.add_node(0, label="fake-root")
    G.add_node(1, label="A")
    G.add_node(2, label="B")
    G.add_node(3, label="B")
    G.add_node(4, label="C")
    G.add_node(5, label="C")
    G.add_node(6, label="D")
    G.add_node(7, label="D")
    G.add_edge(0, 1)
    G.add_edge(1, 2)
    G.add_edge(0, 3)
    G.add_edge(3, 4)
    G.add_edge(0, 5)
    G.add_edge(5, 6)
    G.add_edge(0, 7)

    assert nx.is_tree(G)
    nx.nx_pydot.write_dot(G, ".tmp.dot")

    G1 = utils.dot_to_nx(".tmp.dot")
    assert nx.is_tree(G1)
    assert nx.is_isomorphic(G, G1)

    os.system("rm .tmp.dot")


class TestFixPydotIssue:

    def test_fix_pydot_issue_first(self):
        # Create a test graph
        G = nx.Graph()
        G.add_node('A', label='Node A')
        G.add_node('B', label='Node B')
        G.add_node('C', label='Node C: Test')
        G.add_edge('A', 'B', label='Edge A->B')
        G.add_edge('B', 'C', label='Edge B->C')
        G.add_edge('C', 'A', label='Edge C->A')

        # Check the labels before formatting
        assert G.nodes['A']['label'] == 'Node A'
        assert G.nodes['B']['label'] == 'Node B'
        assert G.nodes['C']['label'] == 'Node C: Test'
        assert G.edges[('A', 'B')]['label'] == 'Edge A->B'
        assert G.edges[('B', 'C')]['label'] == 'Edge B->C'
        assert G.edges[('C', 'A')]['label'] == 'Edge C->A'

        # Fix the pydot issue with colons in the labels
        utils.fix_pydot_issue(G)

        # Check the modified labels
        assert G.nodes['A']['label'] == 'Node A'
        assert G.nodes['B']['label'] == 'Node B'
        assert G.nodes['C']['label'] == '"Node C: Test"'
        assert G.edges[('A', 'B')]['label'] == 'Edge A-\\>B'
        assert G.edges[('B', 'C')]['label'] == 'Edge B-\\>C'
        assert G.edges[('C', 'A')]['label'] == 'Edge C-\\>A'


class TestCleanCallgraph:

    def test_clean_callgraph_first(self):

        G = nx.DiGraph()
        G.add_node(0, label='"{external node}"')
        G.add_node(1, label='"{sumii}"')
        G.add_node(2, label='"{sumiii}"')
        G.add_node(3, label='"{main}"')
        G.add_node(4)
        G.add_edge(0, 1)
        G.add_edge(0, 2)
        G.add_edge(0, 3)
        G.add_edge(3, 1)
        G.add_edge(3, 2)
        G.add_edge(4, 0)

        utils.clean_callgraph(G)

        W = nx.DiGraph()
        W.add_node(1, label='sumii')
        W.add_node(2, label='sumiii')
        W.add_node(3, label='main')
        W.add_edge(3, 1)
        W.add_edge(3, 2)

        assert nx.is_isomorphic(G, W)
        assert G.nodes == W.nodes  # Check labels.


class TestDemangle:

    def test_demangle(self):
        symbol = '_ZN3Foo3barEv'
        expected_output = 'Foo::bar()'
        assert utils.demangle(symbol) == expected_output

    def test_empty_and_none_symbol(self):
        symbol = ""
        with pytest.raises(ValueError):
            utils.demangle(symbol)
        symbol = None
        with pytest.raises(Exception):
            utils.demangle(symbol)


class TestNodesWithNoInstPred:

    def test_nodes_with_no_inst_pred_first(self):
        A = nx.DiGraph()
        A.add_node(1, label='A', type="inst")
        A.add_node(2, label='B', type="inst")
        A.add_node(3, label='C', type="inst")
        A.add_node(4, label='D', type="var")
        A.add_node(5, label='E', type="inst")
        A.add_edge(1, 2)
        A.add_edge(2, 3)
        A.add_edge(4, 5)

        A_old = A.copy()

        exp_res = set([1, 5])
        res = set(utils.nodes_with_no_inst_pred(A))

        # Check results.
        assert exp_res == res
        # No modification made on original graph.
        assert nx.is_isomorphic(A, A_old)
