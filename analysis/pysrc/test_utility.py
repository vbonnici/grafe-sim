# To run tests:
#   (in the current directory)
#   $ pytest -v

import pytest
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from .utility import precision, recall, f1score, overall_purity, \
    remove_zero_rows, plot_elbow, global_fold_change, non_zero_rows, \
    precision_df, recall_df, f1score_df, medoid


class TestPrecisionDf:

    def test_precision_df_empty_input(self):
        assert precision_df([], []).empty

    def test_precision_df_one_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [4, 4, 4, 4, 4, 4]
        result = precision_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {4: 1/3}, 2: {4: 1/3},
                                    3: {4: 1/3}})
        pd.testing.assert_frame_equal(result, expected_df)

    def test_precision_df_two_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 2]
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 0.5, 3: 0.5}}).T
        result = precision_df(labels, cluster_labels)

        pd.testing.assert_frame_equal(result, expected_df)

    def test_precision_df_three_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 3]
        result = precision_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 2/3, 3: 1/3},
                                    3: {1: 0.0, 2: 0.0, 3: 1.0}}).T
        pd.testing.assert_frame_equal(result, expected_df)


class TestPrecision:

    def test_precision_empty(self):
        # Test empty input.
        assert precision([], []) == {}

    def test_precision_one_element(self):
        # Test input with one element.
        assert precision([0], [0]) == {0: 1.0}
        assert precision([0], [1]) == {1: 1.0}

    def test_precision_same_clusters_same_labels(self):
        # Test input with multiple elements, same clusters and same labels.
        assert precision([0, 0, 0], [0, 0, 0]) == {0: 1.0}
        assert precision([1, 1, 1], [1, 1, 1]) == {1: 1.0}

    def test_precision_same_clusters_diff_labels(self):
        # Test input with multiple elements, same clusters and different
        # labels.
        assert precision([0, 0, 0], [1, 1, 1]) == {1: 1.0}
        assert precision([1, 1, 1], [4, 4, 4]) == {4: 1.0}

    def test_precision_diff_clusters_same_labels(self):
        # Test input with multiple elements, different clusters and same
        # labels.
        assert precision([0, 0, 0, 1, 1, 1], [0, 0, 0, 0, 0, 0]) == {0: 0.5}
        assert precision([0, 0, 0, 1, 1, 1], [0, 0, 0, 1, 1, 1]) == {
            0: 1.0, 1: 1.0}
        assert precision([0, 0, 0, 1, 1, 1], [0, 0, 1, 1, 1, 1]) == {
            0: 1.0, 1: 0.75}
        assert precision([0, 0, 0, 1, 1, 1], [0, 1, 1, 1, 1, 1]) == {
            0: 1.0, 1: 0.6}
        assert precision([0, 0, 0, 1, 1, 1], [1, 1, 1, 1, 1, 1]) == {1: 0.5}

    def test_precision_diff_clusters_diff_labels(self):
        # Test input with multiple elements, different clusters and different
        # labels.
        assert precision([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 0.5}
        assert precision([0, 0, 0, 1, 1, 1], [1, 1, 1, 0, 0, 0]) == {
            1: 1.0, 0: 1.0}
        assert precision([0, 0, 0, 1, 1, 1], [4, 4, 4, 3, 3, 3]) == {
            4: 1.0, 3: 1.0}
        assert precision([0, 0, 0, 1, 1, 1], [1, 1, 0, 0, 0, 0]) == {
            1: 1.0, 0: 0.75}
        assert precision([0, 0, 0, 1, 1, 1], [4, 4, 5, 5, 5, 5]) == {
            4: 1.0, 5: 0.75}
        assert precision([0, 0, 0, 1, 1, 1], [1, 0, 0, 0, 0, 0]) == {
            1: 1.0, 0: 0.6}
        assert precision([0, 0, 0, 1, 1, 1], [4, 5, 5, 5, 5, 5]) == {
            4: 1.0, 5: 0.6}
        assert precision([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 0.5}

    def test_precision_invalid_input(self):
        # Test invalid input.
        with pytest.raises(ValueError):
            precision([0, 0], [0, 0, 0])
        with pytest.raises(ValueError):
            precision([0, 0, 0], [0, 0])

    def test_precision_use_max_label(self):
        truth_labels = ["A", "A", "B", "B", "C", "C", "A", "A", "B"]
        cluster_labels = [1, 1, 1, 2, 2, 2, 3, 3, 3]

        # Test default behavior (use cluster label as key).
        precision_dict = precision(truth_labels, cluster_labels)
        assert len(precision_dict) == 3
        assert 1 in precision_dict
        assert 2 in precision_dict
        assert 3 in precision_dict
        assert precision_dict[1] == 2 / 3
        assert precision_dict[2] == 2 / 3
        assert precision_dict[3] == 2 / 3

        # Test use_max_label=True.
        precision_dict = precision(
            truth_labels,
            cluster_labels,
            use_max_label=True)
        assert len(precision_dict) == 3
        assert "A" in precision_dict
        assert "A_1" in precision_dict
        assert "C" in precision_dict
        assert precision_dict["A"] == 2 / 3
        assert precision_dict["A_1"] == 2 / 3
        assert precision_dict["C"] == 2 / 3


class TestRecallDf:

    def test_recall_df_empty_input(self):
        assert recall_df([], []).empty

    def test_recall_df_one_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [4, 4, 4, 4, 4, 4]
        result = recall_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {4: 1.0}, 2: {4: 1.0},
                                    3: {4: 1.0}})
        pd.testing.assert_frame_equal(result, expected_df)

    def test_recall_df_two_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 2]
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 1.0, 3: 1.0}}).T
        result = recall_df(labels, cluster_labels)

        pd.testing.assert_frame_equal(result, expected_df)

    def test_recall_df_three_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 3]
        result = recall_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 1.0, 3: 0.5},
                                    3: {1: 0.0, 2: 0.0, 3: 0.5}}).T
        pd.testing.assert_frame_equal(result, expected_df)


class TestRecall:

    def test_recall_empty(self):
        # Test empty input.
        assert recall([], []) == {}

    def test_recall_one_element(self):
        # Test input with one element.
        assert recall([0], [0]) == {0: 1.0}
        assert recall([0], [1]) == {1: 1.0}

    def test_recall_same_clusters_same_labels(self):
        # Test input with multiple elements, same clusters and same labels.
        assert recall([0, 0, 0], [0, 0, 0]) == {0: 1.0}
        assert recall([1, 1, 1], [1, 1, 1]) == {1: 1.0}

    def test_recall_same_clusters_diff_labels(self):
        # Test input with multiple elements, same clusters and different
        # labels.
        assert recall([0, 0, 0], [1, 1, 1]) == {1: 1.0}
        assert recall([1, 1, 1], [4, 4, 4]) == {4: 1.0}

    def test_recall_diff_clusters_same_labels(self):
        # Test input with multiple elements, different clusters and same
        # labels.
        assert recall([0, 0, 0, 1, 1, 1], [0, 0, 0, 0, 0, 0]) == {0: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [0, 0, 0, 1, 1, 1]) == {
            0: 1.0, 1: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [0, 0, 1, 1, 1, 1]) == {
            0: 2 / 3, 1: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [0, 1, 1, 1, 1, 1]) == {
            0: 1 / 3, 1: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [1, 1, 1, 1, 1, 1]) == {1: 1.0}

    def test_recall_diff_clusters_diff_labels(self):
        # Test input with multiple elements, different clusters and different
        # labels.
        assert recall([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [1, 1, 1, 0, 0, 0]) == {
            1: 1.0, 0: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [4, 4, 4, 3, 3, 3]) == {
            4: 1.0, 3: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [1, 1, 0, 0, 0, 0]) == {
            1: 2 / 3, 0: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [4, 4, 5, 5, 5, 5]) == {
            4: 2 / 3, 5: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [1, 0, 0, 0, 0, 0]) == {
            1: 1 / 3, 0: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [4, 5, 5, 5, 5, 5]) == {
            4: 1 / 3, 5: 1.0}
        assert recall([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 1.0}

    def test_recall_invalid_input(self):
        # Test invalid input.
        with pytest.raises(ValueError):
            recall([0, 0], [0, 0, 0])
        with pytest.raises(ValueError):
            recall([0, 0, 0], [0, 0])

    def test_recall_use_max_label(self):
        truth_labels = ["A", "A", "B", "B", "C", "C", "A", "A", "B"]
        cluster_labels = [1, 1, 1, 2, 2, 2, 3, 3, 3]

        # Test default behavior (use cluster label as key).
        recall_dict = recall(truth_labels, cluster_labels)
        assert len(recall_dict) == 3
        assert 1 in recall_dict
        assert 2 in recall_dict
        assert 3 in recall_dict
        assert recall_dict[1] == 1 / 2
        assert recall_dict[2] == 1.0
        assert recall_dict[3] == 1 / 2

        # Test use_max_label=True.
        recall_dict = recall(truth_labels, cluster_labels, use_max_label=True)
        assert len(recall_dict) == 3
        assert "A" in recall_dict
        assert "A_1" in recall_dict
        assert "C" in recall_dict
        assert recall_dict["A"] == 1 / 2
        assert recall_dict["C"] == 1.0
        assert recall_dict["A_1"] == 1 / 2


class TestF1scoreDf:

    def test_f1score_df_empty_input(self):
        assert f1score_df([], []).empty

    def test_f1score_df_one_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [4, 4, 4, 4, 4, 4]
        result = f1score_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {4: 0.5}, 2: {4: 0.5},
                                    3: {4: 0.5}})
        pd.testing.assert_frame_equal(result, expected_df)

    def test_f1score_df_two_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 2]
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 2/3, 3: 2/3}}).T
        result = f1score_df(labels, cluster_labels)

        pd.testing.assert_frame_equal(result, expected_df)

    def test_f1score_df_three_cluster(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 3]
        result = f1score_df(labels, cluster_labels)
        expected_df = pd.DataFrame({1: {1: 1.0, 2: 0.0, 3: 0.0},
                                    2: {1: 0.0, 2: 4/5, 3: 2/5},
                                    3: {1: 0.0, 2: 0.0, 3: 2/3}}).T
        pd.testing.assert_frame_equal(result, expected_df)

    def test_f1score_df_using_dfs(self):
        labels = [1, 1, 2, 2, 3, 3]
        cluster_labels = [1, 1, 2, 2, 2, 3]
        prec_df = precision_df(labels, cluster_labels)
        rec_df = recall_df(labels, cluster_labels)

        expected_df = (2*prec_df*rec_df) / (prec_df + rec_df)
        expected_df = expected_df.fillna(0)
        result = f1score_df(labels, cluster_labels)
        print(result)
        print(expected_df)
        pd.testing.assert_frame_equal(result, expected_df)


class TestF1score:

    def test_f1score_empty(self):
        # Test empty input.
        assert f1score([], []) == {}

    def test_f1score_one_element(self):
        # Test input with one element.
        assert f1score([0], [0]) == {0: 1.0}
        assert f1score([0], [1]) == {1: 1.0}

    def test_f1score_same_clusters_same_labels(self):
        # Test input with multiple elements, same clusters and same labels.
        assert f1score([0, 0, 0], [0, 0, 0]) == {0: 1.0}
        assert f1score([1, 1, 1], [1, 1, 1]) == {1: 1.0}

    def test_f1score_same_clusters_diff_labels(self):
        # Test input with multiple elements, same clusters and different
        # labels.
        assert f1score([0, 0, 0], [1, 1, 1]) == {1: 1.0}
        assert f1score([1, 1, 1], [4, 4, 4]) == {4: 1.0}

    def test_f1score_diff_clusters_same_labels(self):
        # Test input with multiple elements, different clusters and same
        # labels.
        assert f1score([0, 0, 0, 1, 1, 1], [0, 0, 0, 0, 0, 0]) == {0: 2 / 3}
        assert f1score([0, 0, 0, 1, 1, 1], [0, 0, 0, 1, 1, 1]) == {
            0: 1.0, 1: 1.0}
        assert f1score([0, 0, 0, 1, 1, 1], [0, 0, 1, 1, 1, 1]) == {
            0: 0.8, 1: 1.5 / 1.75}
        assert f1score([0, 0, 0, 1, 1, 1], [0, 1, 1, 1, 1, 1]) == {
            0: 0.5, 1: 1.2 / 1.6}
        assert f1score([0, 0, 0, 1, 1, 1], [1, 1, 1, 1, 1, 1]) == {1: 2 / 3}

    def test_f1score_diff_clusters_diff_labels(self):
        # Test input with multiple elements, different clusters and different
        # labels.
        assert f1score([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 2 / 3}
        assert f1score([0, 0, 0, 1, 1, 1], [1, 1, 1, 0, 0, 0]) == {
            1: 1.0, 0: 1.0}
        assert f1score([0, 0, 0, 1, 1, 1], [4, 4, 4, 3, 3, 3]) == {
            4: 1.0, 3: 1.0}
        assert f1score([0, 0, 0, 1, 1, 1], [1, 1, 0, 0, 0, 0]) == {
            1: 0.8, 0: 1.5 / 1.75}
        assert f1score([0, 0, 0, 1, 1, 1], [4, 4, 5, 5, 5, 5]) == {
            4: 0.8, 5: 1.5 / 1.75}
        assert f1score([0, 0, 0, 1, 1, 1], [1, 0, 0, 0, 0, 0]) == {
            1: 0.5, 0: 1.2 / 1.6}
        assert f1score([0, 0, 0, 1, 1, 1], [4, 5, 5, 5, 5, 5]) == {
            4: 0.5, 5: 1.2 / 1.6}
        assert f1score([0, 0, 0, 1, 1, 1], [4, 4, 4, 4, 4, 4]) == {4: 2 / 3}

    def test_f1score_invalid_input(self):
        # Test invalid input.
        with pytest.raises(ValueError):
            f1score([0, 0], [0, 0, 0])
        with pytest.raises(ValueError):
            f1score([0, 0, 0], [0, 0])

    def test_f1score_use_max_label(self):
        truth_labels = ["A", "A", "B", "B", "C", "C", "A", "A", "B"]
        cluster_labels = [1, 1, 1, 2, 2, 2, 3, 3, 3]

        # Test default behavior (use cluster label as key).
        f1_dict = f1score(truth_labels, cluster_labels)
        assert len(f1_dict) == 3
        assert 1 in f1_dict
        assert 2 in f1_dict
        assert 3 in f1_dict
        assert f1_dict[1] == pytest.approx(4 / 7, rel=1e-6)
        assert f1_dict[2] == pytest.approx(4 / 5, rel=1e-6)
        assert f1_dict[3] == pytest.approx(4 / 7, rel=1e-6)

        # Test use_max_label=True.
        f1_dict = f1score(truth_labels, cluster_labels, use_max_label=True)
        assert len(f1_dict) == 3
        assert "A" in f1_dict
        assert "A_1" in f1_dict
        assert "C" in f1_dict
        assert f1_dict["A"] == pytest.approx(4 / 7, rel=1e-6)
        assert f1_dict["C"] == pytest.approx(4 / 5, rel=1e-6)
        assert f1_dict["A_1"] == pytest.approx(4 / 7, rel=1e-6)


class TestOverallPurity:

    def test_overall_purity(self):
        # Define the input values for the test.
        precisions = {1: 0.8, 2: 0.9, 3: 0.7}
        cluster_labels = [1, 1, 2, 2, 3, 3, 3]

        # Calculate the expected output value.
        elems = len(cluster_labels)
        expected_output = (0.8 * 2 + 0.9 * 2 + 0.7 * 3) / elems
        expected_output2 = (0.8 * 2 / elems + 0.9 * 2 / elems +
                            0.7 * 3 / elems)

        # Ensure that the function is correct.
        assert overall_purity(precisions, cluster_labels) == expected_output
        assert overall_purity(precisions, cluster_labels) == expected_output2

    def test_overall_purity_all_equal(self):
        precisions = {1: 0.5, 2: 0.5, 3: 0.5}
        cluster_labels = [1, 1, 1, 2, 2, 3, 3, 3]
        assert overall_purity(precisions, cluster_labels) == 0.5

    def test_overall_purity_exception(self):

        # Label not in dictionary.
        precisions = {1: 0.8, 2: 0.9, 3: 0.7}
        cluster_labels = [1, 1, 2, 2, 4, 3, 3, 3]
        with pytest.raises(ValueError):
            overall_purity(precisions, cluster_labels)

        # Dictionary's key not in labels.
        with pytest.raises(ValueError):
            precisions = {1: 0.8, 2: 0.9, 3: 0.7, 4: 0.5}
            cluster_labels = [1, 1, 2, 2, 3, 3, 3]
            overall_purity(precisions, cluster_labels)

        # Labels emtpy: returning 0 would not be appropriate.
        with pytest.raises(ValueError):
            overall_purity({}, [])


class TestRemoveZeroRows:

    def test_default_behavior(self):
        # Create a sample dataframe with numeric and non-numeric columns
        df = pd.DataFrame(
            {'A': [0, 0, 1], 'B': [0, 0, 0], 'C': ['a', 'b', 'c']})
        # Call the remove_zero_rows() function with only the required df
        # parameter
        result = remove_zero_rows(df)
        # Assert that the result contains only the non-zero rows and excludes
        # the non-numeric column
        assert len(result) == 1
        assert result.iloc[0]['A'] == 1
        assert result.iloc[0]['B'] == 0
        assert result.iloc[0]['C'] == 'c'
        assert len(result.columns) == 3
        # Assert that non columns was dropped.
        assert set(df.columns) == set(result.columns)

    def test_in_place_parameter(self):
        # Create a sample dataframe with some zero rows
        df = pd.DataFrame({'A': [0, 0, 1], 'B': [0, 0, 0]})
        # Call the remove_zero_rows() function with in_place=True
        assert remove_zero_rows(df, in_place=True) is None
        # Assert that the input dataframe has been modified in place
        assert len(df) == 1
        assert df.iloc[0]['A'] == 1
        assert df.iloc[0]['B'] == 0

    def test_exclude_col_parameter(self):
        # Create a sample dataframe with some zero rows
        df = pd.DataFrame(
            {'A': [0, 0, 1], 'B': [0, 1, 0], 'C': ['a', 'b', 'c']})
        # Call the remove_zero_rows() function with exclude_col=['C']
        result = remove_zero_rows(df, exclude_col=['B'])
        # Assert that the result contains all rows and includes the non-numeric
        # column
        assert len(result) == 1
        assert result.iloc[0]['A'] == 1
        assert result.iloc[0]['B'] == 0

        assert len(result.columns) == 3

        assert 'A' in result.columns
        assert 'B' in result.columns
        assert 'C' in result.columns

    def test_no_zero_rows(self):
        # Create a sample dataframe with no zero rows
        df = pd.DataFrame({'A': [1, 2, 3], 'B': [4, 5, 6]})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df)
        # Assert that the result is equal to the input dataframe
        pd.testing.assert_frame_equal(result, df)

    def test_no_zero_rows_in_place(self):
        # Create a sample dataframe with no zero rows
        df = pd.DataFrame({'A': [1, 2, 3], 'B': [4, 5, 6]})
        # Call the remove_zero_rows() function with in_place=True
        df_old = df.copy()
        remove_zero_rows(df, in_place=True)
        # Assert that the result is equal to the input dataframe
        pd.testing.assert_frame_equal(df_old, df)

    def test_only_zero_rows(self):
        # Create a sample dataframe with only zero rows
        df = pd.DataFrame(
            {'A': [0, 0, 0], 'B': [0, 0, 0], 'C': ['a', 'b', 'c']})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df)
        # Assert that the result is an empty dataframe
        assert len(result) == 0
        assert len(result.columns) == 3

    def test_only_zero_not_excluded_rows(self):
        # Create a sample dataframe with only zero (not-excluded) rows
        df = pd.DataFrame(
            {'A': [0, 0, 0], 'B': [1, 2, 3], 'C': ['a', 'b', 'c']})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df, exclude_col=['B'])
        # Assert that the result is an empty dataframe
        assert len(result) == 0
        assert len(result.columns) == 3

    def test_only_zero_rows_in_place(self):
        # Create a sample dataframe with only zero rows
        df = pd.DataFrame(
            {'A': [0, 0, 0], 'B': [0, 0, 0], 'C': ['a', 'b', 'c']})
        # Call the remove_zero_rows() function
        remove_zero_rows(df, in_place=True)
        # Assert that the result is an empty dataframe
        assert len(df) == 0
        assert len(df.columns) == 3

    def test_only_one_row(self):
        # Create a sample dataframe with only one row
        df = pd.DataFrame({'A': [0], 'B': [1]})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df)
        # Assert that the result is equal to the input dataframe
        pd.testing.assert_frame_equal(result, df)

    def test_only_one_column(self):
        # Create a sample dataframe with only one column
        df = pd.DataFrame({'A': [0, 0, 0]})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df)
        # Assert that the result is an empty dataframe
        assert len(result) == 0
        assert len(result.columns) == 1

    def test_only_non_numeric_columns(self):
        # Create a sample dataframe with only non-numeric columns
        df = pd.DataFrame({'A': ['a', 'b', 'c'], 'B': ['d', 'e', 'f']})
        # Call the remove_zero_rows() function
        result = remove_zero_rows(df)
        # Assert that the result is equal to the input dataframe
        pd.testing.assert_frame_equal(result, df)


class TestPlotElbow():

    def test_plot_elbow(self):
        # Generate a dummy distance matrix with at least 5 samples
        matrix = np.random.rand(4, 4)
        distance_matrix = np.triu(matrix)
        np.fill_diagonal(distance_matrix, 0)

        # Call the plot_elbow function with the dummy distance matrix
        fig = plot_elbow(distance_matrix)

        # Assert the figure object.
        assert fig is not None
        assert isinstance(fig, plt.Figure)
        plt.close(fig)

    def test_plot_elbow_invalid_input(self):
        # Test invalid distance matrix shape
        with pytest.raises(ValueError):
            plot_elbow(np.array([[0, 1, 2], [1, 0, 3]]))
        plt.close()

        # Test invalid distance matrix type
        with pytest.raises(ValueError):
            distance_matrix = [[0, 1, 2], [1, 0, 3], [2, 3, 0]]
            plot_elbow(distance_matrix)
        plt.close()

        # Test invalid distance matrix dimensions
        with pytest.raises(ValueError):
            distance_matrix = np.array([[0, 1], [1, 0]])
            plot_elbow(distance_matrix)
        plt.close()

    def test_plot_elbow_k_range(self):
        # Create a distance matrix
        distance_matrix = np.array([[0, 1, 2, 3],
                                    [1, 0, 1, 2],
                                    [2, 1, 0, 1],
                                    [3, 2, 1, 0]])

        # Test invalid k_range tuple
        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, k_range=(1,))
        plt.close()

        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, k_range=(1, 2, 3))
        plt.close()

        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, k_range=(0, 3))
        plt.close()

        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, k_range=(1, -3))
        plt.close()

    def test_plot_elbow_linkage(self):
        # Create a distance matrix
        distance_matrix = np.array([[0, 1, 2, 3],
                                    [1, 0, 1, 2],
                                    [2, 1, 0, 1],
                                    [3, 2, 1, 0]])

        # Test with valid values of linkage
        valid_linkages = ['complete', 'average']
        for linkage in valid_linkages:
            fig = plot_elbow(distance_matrix, linkage=linkage)
            assert isinstance(fig, plt.Figure)
        plt.close(fig)

        # Test with invalid value of linkage
        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, linkage='invalid')
        plt.close()

        # Test with invalid value of linkage: ward does not work with
        # 'precomputed' distances.
        with pytest.raises(ValueError):
            plot_elbow(distance_matrix, linkage='ward')
        plt.close()

    def test_plot_elbow_ax(self):
        # Create a distance matrix
        distance_matrix = np.array([[0, 1, 2, 3],
                                    [1, 0, 1, 2],
                                    [2, 1, 0, 1],
                                    [3, 2, 1, 0]])
        # Create a new figure and axis for the plot
        _, ax = plt.subplots()
        plot_elbow(distance_matrix, ax=ax)
        # Check if the axis object has at least one line.
        assert len(ax.lines) > 0
        plt.close()


class TestFoldChange():

    def test_fold_change_no_den0(self):
        # Create a sample dataframe.
        sample1 = {'A': 2, 'B': 1, 'C': 0}
        sample2 = {'A': 1, 'B': 1, 'C': 1}
        sample3 = {'A': 3, 'B': 6, 'C': 3}
        sample4 = {'A': 3, 'B': 0, 'C': 1}
        df = pd.DataFrame([sample1, sample2, sample3, sample4])
        df_old = df.copy()

        fc = global_fold_change(df, [0, 0, 1, 1])

        pd.testing.assert_frame_equal(df, df_old)
        assert fc['A'] == 2
        assert fc['B'] == 3
        assert fc['C'] == 4

    def test_fold_change_den0_default(self):
        # Create a sample dataframe.
        sample1 = {'A': 2, 'B': 1, 'C': 0}
        sample2 = {'A': 1, 'B': 1, 'C': 1}
        sample3 = {'A': 3, 'B': 0, 'C': 3}
        sample4 = {'A': 3, 'B': 0, 'C': 1}
        df = pd.DataFrame([sample1, sample2, sample3, sample4])
        df_old = df.copy()

        fc = global_fold_change(df, [0, 0, 1, 1])

        pd.testing.assert_frame_equal(df, df_old)
        assert fc['A'] == 2
        assert fc['B'] is None
        assert fc['C'] == 4

    def test_fold_change_den0_special_value(self):
        # Create a sample dataframe.
        sample1 = {'A': 2, 'B': 1, 'C': 0}
        sample2 = {'A': 1, 'B': 1, 'C': 1}
        sample3 = {'A': 3, 'B': 0, 'C': 3}
        sample4 = {'A': 3, 'B': 0, 'C': 1}
        df = pd.DataFrame([sample1, sample2, sample3, sample4])
        df_old = df.copy()

        fc = global_fold_change(df, [0, 0, 1, 1], special_value=-1)

        pd.testing.assert_frame_equal(df, df_old)
        assert fc['A'] == 2
        assert fc['B'] == -1
        assert fc['C'] == 4

    def test_fold_change_den0_special_value_2(self):
        # Create a sample dataframe.
        sample1 = {'A': 0, 'B': 1, 'C': 0}
        sample2 = {'A': 0, 'B': 1, 'C': 1}
        sample3 = {'A': 3, 'B': 0, 'C': 3}
        sample4 = {'A': 3, 'B': 0, 'C': 1}
        df = pd.DataFrame([sample1, sample2, sample3, sample4])
        df_old = df.copy()

        fc = global_fold_change(df, [0, 0, 1, 1], special_value=-1)

        pd.testing.assert_frame_equal(df, df_old)
        assert fc['A'] == -1
        assert fc['B'] == -1
        assert fc['C'] == 4

    def test_fold_change_exception(self):
        # Create a sample dataframe.
        sample1 = {'A': 0, 'B': 1, 'C': 0}
        sample2 = {'A': 1, 'B': 1, 'C': 1}
        sample3 = {'A': 3, 'B': 0, 'C': 1}
        df = pd.DataFrame([sample1, sample2, sample3])
        df_old = df.copy()

        # Assert that raises ValueError exception.
        with pytest.raises(ValueError):
            global_fold_change(df, [0, 0])

        with pytest.raises(ValueError):
            global_fold_change(df, [0, 0, 0, 0])

        with pytest.raises(ValueError):
            global_fold_change(df, [])

        # Assert that do not raises ValueError exception.
        try:
            global_fold_change(df, [0, 0, 0])
        except ValueError as err:
            assert False, f"'global_fold_change' raised an exception {err}"

        pd.testing.assert_frame_equal(df, df_old)


class TestNonZeroRows():

    def test_non_zero_rows(self):
        # Create example dataframe.
        data = {'A': [1, 0, 1, 0], 'B': [1, 1, 0, 0], 'C': [0, 0, 1, 1]}
        df = pd.DataFrame(data)
        features = {'A', 'B'}

        expected_output = pd.DataFrame({'A': [1], 'B': [1], 'C': [0]})
        result = non_zero_rows(df, features)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_columns_to_return(self):
        # Create example dataframe.
        data = {'A': [1, 0, 1, 0], 'B': [1, 1, 0, 0], 'C': [0, 0, 1, 1]}
        df = pd.DataFrame(data)
        features = {'A', 'B'}
        columns = {'A', 'C'}

        expected_output = pd.DataFrame({'A': [1], 'C': [0]})
        result = non_zero_rows(df, features, columns)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_non_numeric(self):
        # Create example dataframe.
        data = {'A': [1, 0, 1, 0], 'B': [1, 1, 0, 0],
                'C': [0, 0, 1, 1], 'D': ['1', '1', '1', '1']}
        df = pd.DataFrame(data)
        features = {'A', 'B', 'D'}

        expected_output = pd.DataFrame({'A': [1], 'B': [1],
                                        'C': [0], 'D': ['1']})

        result = non_zero_rows(df, features)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_empty_set(self):
        # Create example dataframe.
        data = {'A': [1, 0, 1, 0], 'B': [1, 1, 0, 0],
                'C': [0, 0, 1, 1], 'D': ['a', 'b', 'c', 'd']}
        df = pd.DataFrame(data)
        # Empty input set.
        features = set()
        expected_output = pd.DataFrame(data)

        result = non_zero_rows(df, features)
        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_empty_df_input(self):
        # Create empty dataframe.
        df = pd.DataFrame()
        features = {'A', 'B'}

        expected_output = pd.DataFrame()
        result = non_zero_rows(df, features)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_no_matching_lines(self):
        # Create example dataframe.
        data = {'A': [0, 0, 0, 0], 'B': [0, 0, 0, 0],
                'C': [0, 0, 0, 0], 'D': ['a', 'b', 'c', 'd']}
        df = pd.DataFrame(data)
        features = {'A', 'B'}

        # Expected an empty dataframe with same structure (columns and dtypes).
        expected_output = df.iloc[:0]
        result = non_zero_rows(df, features)

        print(result)
        print(expected_output)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))

    def test_non_zero_rows_ignore_missing_feature(self):
        # Create example dataframe.
        data = {'A': [1, 0, 1, 0], 'B': [1, 1, 0, 0],
                'C': [0, 0, 1, 1], 'D': ['a', 'b', 'c', 'd']}
        df = pd.DataFrame(data)
        features = {'A', 'B', 'E'}

        expected_output = pd.DataFrame({'A': [1], 'B': [1],
                                        'C': [0], 'D': ['a']})
        result = non_zero_rows(df, features)

        print(result)
        print(expected_output)

        pd.testing.assert_frame_equal(result.sort_index(axis=1),
                                      expected_output.sort_index(axis=1))


class TestMedoid:

    def test_medoid_first(self):
        dm = np.array([
            [0, 1, 2, 3, 4],
            [1, 0, 1, 2, 3],
            [2, 1, 0, 1, 5],
            [3, 2, 1, 0, 1],
            [4, 3, 5, 1, 0]
        ])
        cluster_labels = np.array([0, 0, 1, 1, 1])
        assert (medoid(dm, cluster_labels) == {0: 0, 1: 3}
                or medoid(dm, cluster_labels) == {0: 1, 1: 3})

    def test_medoid_no_mod_to_dm(self):
        dm = np.array([
            [0, 1, 2, 3, 4],
            [1, 0, 1, 2, 3],
            [2, 1, 0, 1, 2],
            [3, 2, 1, 0, 1],
            [4, 3, 2, 1, 0]
        ])
        cluster_labels = np.array([0, 1, 0, 1, 1])
        old_dm = dm
        medoid(dm, cluster_labels)
        assert np.allclose(old_dm, dm)

    def test_medoid_not_symmetric(self):
        dm = np.array([
            [0, 1, 2, 3, 2],
            [1, 0, 1, 2, 3],
            [2, 1, 0, 1, 2],
            [3, 2, 1, 0, 1],
            [4, 3, 2, 1, 0]
        ])
        cluster_labels = np.array([0, 0, 1, 1, 1])
        with pytest.raises(ValueError):
            medoid(dm, cluster_labels)

    def test_medoid_one_element_cluster(self):
        dm = np.array([
            [0, 1, 2, 3, 4],
            [1, 0, 1, 2, 3],
            [2, 1, 0, 1, 2],
            [3, 2, 1, 0, 1],
            [4, 3, 2, 1, 0]
        ])
        cluster_labels = np.array([1, 1, 0, 1, 1])
        assert (medoid(dm, cluster_labels) == {0: 2, 1: 1}
                or medoid(dm, cluster_labels) == {0: 2, 1: 4})

    def test_medoid_cluster_labels_types(self):
        dm = np.array([
            [0, 1, 2, 3, 4],
            [1, 0, 1, 2, 3],
            [2, 1, 0, 1, 2],
            [3, 2, 1, 0, 1],
            [4, 3, 2, 1, 0]
        ])
        # non-integer type.
        cluster_labels = np.array([0.5, 0.5, 1.2, 1.2, 1.2])
        assert (medoid(dm, cluster_labels) == {0.5: 0, 1.2: 3}
                or medoid(dm, cluster_labels) == {0.5: 1, 1.2: 3})
        # str type.
        cluster_labels = np.array(["A", "A", "B", "B", "B"])
        assert (medoid(dm, cluster_labels) == {"A": 0, "B": 3}
                or medoid(dm, cluster_labels) == {"A": 1, "B": 3})
