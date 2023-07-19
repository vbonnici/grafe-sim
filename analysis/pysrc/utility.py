import re
import pandas as pd
from scipy.spatial.distance import pdist, squareform
from scipy.cluster.vq import whiten
from scipy.cluster.hierarchy import linkage
from sklearn.cluster import AgglomerativeClustering
from yellowbrick.cluster import KElbowVisualizer
import numpy as np

ckeywords = [
    "alignas", "alignof", "auto", "bool", "break", "case", "char", "const",
    "constexpr", "continue", "default", "do", "double", "else", "enum",
    "extern", "false", "float", "for", "goto", "if", "inline", "int", "long",
    "nullptr", "register", "restrict", "return", "short", "signed", "sizeof",
    "static", "static_assert", "struct", "switch", "thread_local", "true",
    "typedef", "typeof", "typeof_unqual", "union", "unsigned", "void",
    "volatile", "while"]

cppkeywords = [
    "alignas", "alignof", "and", "end_eq", "asm", "atomic_cancel",
    "atomic_commit", "atomic_noexcept", "auto", "bitand", "bitor",
    "bool", "break", "case", "catch", "char", "char8_t", "char16_t",
    "char32_t", "class", "compl", "concept", "const", "consteval",
    "constexpr", "constinit", "const_cast", "continue", "co_await",
    "co_return", "co_yield", "decltype", "default", "delete", "do",
    "double", "dynamic_cast", "else", "enum", "explicit", "export",
    "extern", "false", "float", "for", "friend", "goto", "if",
    "int", "long", "mutable", "namespace", "new", "noexcept", "not",
    "not_eq", "nullptr", "operator", "or", "or_eq", "private",
    "public", "reflexpr", "register", "reinterpret_cast",
    "return", "short", "signed", "sizeof", "static",
    "static_cast", "struct", "switch", "synchronized", "template",
    "thread_local", "throw", "true", "try", "typedef", "typeid",
    "typename", "union", "unsigned", "using", "virtual", "void",
    "volatile", "wchar_t", "while", "xor", "xor_eq", "inline",
    "protected", "requires", "this", "static_assert"]


def get_keywords_count(file, c_flag: bool = False) -> dict:
    '''
    Return the number of occurencies of every keyword in c/cpp

    Args

        file: the file to analyze

        flag: True for .c file, False for .ccp files (False by default)
    '''

    keywords: list = []
    count: dict = {}

    if c_flag:
        keywords = ckeywords
        count = dict.fromkeys(ckeywords)
    else:
        keywords = cppkeywords
        count = dict.fromkeys(cppkeywords)

    with open(file) as f:
        read_data = f.read()
        # Split the file into lines
        lines = read_data.splitlines()
        # For every line remove every comment
        for i, l in enumerate(lines):
            lines[i] = re.sub("//.*", "", l)

        # Rebuild the file
        read_data = "\n".join(lines)

    # Split the file into words
    read_data = read_data.split()

    # Count each word
    for k in keywords:
        count[k] = read_data.count(k)

    # for i, k in enumerate(keywords):
    #    print(f"{k} -- {count[i]}")

    return count


# TODO: seems not working.
# Removed.
# Use 'fcluster' instead.

# def get_clusters_from_dendrogram(dendrogram: dict) -> dict:
#     """
#     Starting from a dengrogram generated with scipy API, generates a
#     dictionary of clusters in the dengrogram. Requires that "default"
#     cluster leaves have color "C0" (default behaviour of scipy API).

#     Params:
#         dendrogram (dict): a dendrogram generated using scipy.dendgrogram()

#     Returns:
#         a dictionary where each entry represent one cluster: the key is
#         a numerical ID of the cluster, the value is a list of leaves
#         in the cluster.

#     Raise:
#         ValueError: when the dict does not seem a dendrogram.
#         RuntimeError: when an integrity problem occurs in slicing leaves
#           color list.
#     """

#     if not isinstance(dendrogram, dict) \
#             or "leaves_color_list" not in dendrogram \
#             or "leaves" not in dendrogram:
#         raise ValueError("This dictionary does not seem a scipy dendrogram.")

#     clusters: dict = {}
#     clusterID: int = 0

#     # Create an empty "default" cluster with ID = 0.
#     # This cluster will contain all the elements over the threshold (by
#       default with color "C0").
#     clusters[clusterID] = []
#     clusterID += 1

#     last_switch_pos: int = 0

#     color_list: list = dendrogram["leaves_color_list"]
#     leaves_list: list = dendrogram["leaves"]
#     for pos, color in list(enumerate(color_list))[1:]:

#         # If it is last leaf must include it in the cluster.
#         last_pos = (pos == len(list(enumerate(color_list))) - 1)
#         if last_pos:
#             pos = pos + 1

#         # When the leaf color switches or it is the last leaf.
#         if color != color_list[pos-1] or last_pos:
#             # Check integrity of sublist.
#             if len(set(color_list[last_switch_pos:pos])) != 1:
#                     raise RuntimeError("Cluster integrity failed.")
#             # If "default" cluster: append to existing cluster.
#             if color_list[pos-1] == "C0":
#                 clusters[0].extend(leaves_list[last_switch_pos:pos])
#             # Otherwise: create new cluster.
#             else:
#                 clusters[clusterID] = leaves_list[last_switch_pos:pos]
#                 clusterID += 1

#             last_switch_pos = pos

#     return clusters


# TODO: check correctness.
def get_distance_between(df: pd.DataFrame, id1: str, id2: str,
                         link_metric: str) -> float:
    """
    Returns the distance between 'id1' and 'id2' rows in a DataFrame.
    """
    df_sel = df.loc[[id1, id2]]
    # Standardize (normalize) the features.
    df_tmp = whiten(df_sel)
    matrix = linkage(df_tmp, metric=link_metric)

    return matrix[0][2]


def clean_and_index(df, index_col="id") -> pd.DataFrame:
    '''
    Given a Pandas DF, set the index of DF to `index_col` and removes
    unnamed cols.
    '''
    # TODO: also clean the path in 'id' col?

    # Set index.
    df = df.set_index(index_col)
    # Remove Unnamed cols.
    df = df.loc[:, ~df.columns.str.contains('^Unnamed')]

    return df


def get_pdist_squared(df, metric: str):
    '''
    Uses pdist to compute the squared distance matrix in df using the
    metric 'metric'.
    '''
    dm = squareform(pdist(df, metric=metric))

    return dm


def drop_unuseful_features_unique(df) -> pd.DataFrame:
    '''
    Given a DF, drops every column that has a non-zero value only for
    one entry.
    '''
    # Get columns with one non-zero entry as Series.
    s = pd.Series(df.astype(bool).sum(axis=0) == 1)
    # Get list of columns to delete.
    to_del = [i for i in s.index if s[i]]
    # (Check.)
    for c in to_del:
        if not (df[c].astype(bool).sum(axis=0)) == 1:
            raise Exception("Error while selecting unuseful column to delete.")

    # Drop columns.
    df2 = df.drop(to_del, axis=1)
    # (Check.)
    if df.shape[1] - df2.shape[1] != len(to_del):
        raise Exception("Error while dropping unuseful column to delete.")

    return df2


def drop_unuseful_features_all_equal(df) -> pd.DataFrame:
    '''
    Given a DF, drops every column that has the same value for each row.
    '''
    # Get columns with all equal entries
    s = pd.Series(df.apply(lambda col: len(col.unique()) == 1, axis=0))
    # Get list of columns to delete.
    to_del = [i for i in s.index if s[i]]
    # (Check.)
    for c in to_del:
        if not (df[c].all() == df[c][0]):
            raise Exception("Error while selecting unuseful column to delete.")

    # Drop columns.
    df2 = df.drop(to_del, axis=1)
    # (Check.)
    if df.shape[1] - df2.shape[1] != len(to_del):
        raise Exception("Error while dropping unuseful column to delete.")

    return df2


def get_linkage(distance_matrix, method):
    # Check that distance matrix given is condensed.
    # ?

    link = linkage(distance_matrix, method=method)
    return link


def hier_clust_dyn(linkage: np.ndarray, thres, index, squared_dm):
    """
    Returns a cluster-map.
    """

    n = len(index)
    if linkage.shape[0] != n - 1:
        raise ValueError("linkage and index not compatible.")
    # Check on squared_dm shape ?

    items = []  # A list of sets, one for each line of linkage.

    for line in linkage:
        s = set()
        for el in line[0:2]:
            i = int(el)
            s = s | (set([i]) if i < n else items[i - n])  # Set union.
            # if el < n:
            #     s.add(el)
            # else:
            #     idx = int(el) - n
            #     s = s | items[idx] # set union
        items.append(s)

    means = []
    # print(items)
    # print("---")
    for line in items:
        # Compute mean distance in the cluster.
        distances = []
        # print("line", line)
        for i in line:
            # print(i, "vs")
            # print(" + ".join([f"{squared_dm[i][j]}"
            #                   for j in line if i != j]))
            dist_in_cluster = [squared_dm[i][j] for j in line if i != j]
            distances.append(dist_in_cluster)
        means.append(np.mean(distances))
        # print("mean", np.mean(distances), "\n---")

    if len(means) != len(items):
        raise Exception("Clusters and means len differ.")

    # print("linkage parallel data-structures")
    # print("idx\t| items\t| mean")
    # for i in range(len(items)):
    #     print(f"{i}\t| {items[i]}\t| {means[i]}")

    # print("\n".join([f"{e} | {means[idx]}" for idx, e in enumerate(items)]))

    # Clustering.

    clusters = linkage_dfs(linkage, thres, means, items, len(linkage) - 1, n)
    # print("clusters\n", clusters)

    clustermap = {}
    for i, c in enumerate(clusters):
        clustermap[i] = [index[e] for e in c]

    return clustermap


def linkage_dfs(linkage, thres, means, items, idx, n):

    # If the cluster of this linkage line respect the condition,
    # its items form a cluster.
    if means[idx] < thres:
        return [list(items[idx])]  # to unpack correctly later.

    # Otherwise, dfs on 1st and 2nd element of current linkage line.
    clusters = []  # list of list
    for e in linkage[idx][0:2]:
        if e < n:
            clusters.append([int(e)])
        else:
            subclusters = linkage_dfs(
                linkage, thres, means, items, int(e) - n, n)
            # unpack subclusters and append to clusters
            for sc in subclusters:
                clusters.append(sc)

    return clusters


def clusters_list_to_dict(clusters_list, index):
    if not isinstance(clusters_list, np.ndarray):
        raise ValueError

    return {
        k: [index[i]
            for i in range(len(clusters_list)) if clusters_list[i] == k]
        for k in set(clusters_list)
    }


def clusters_dict_to_list(clusters_dict, index):
    if not isinstance(clusters_dict, dict):
        raise ValueError

    return np.asarray([
        k
        for i in range(sum([len(e) for _, e in clusters_dict.items()]))
        for k, l in clusters_dict.items() if index[i] in l
    ])


def global_fold_change(df, cluster_list, special_value=None):
    """
    This function calculates the and informal fold change for every feature
    in a given dataframe of samples. Returns a dictionary with one key for
    every feature and the corresponding fold change as value.
    If the denominator is zero (the feature is important for sure), the
    the corresponding fold change value will be the special_value.

    Args:
        df (pandas DataFrame): The input dataframe.
        cluster_list (list): A list containing the cluster membership of each
            sample in the dataframe.
        special_value (Any): The value to be used in case the denominator
            is zero. Default is None.

    Returns:
        dict: A dictionary with one key for every feature and
            the corresponding fold change as value.

    Raises:
        ValueError: if cluster_list does not match dataframe size.
    """

    if len(df) != len(cluster_list):
        raise ValueError(f"The length of the cluster list must be equal\
            to the number of samples in the dataframe.\
            Found len(df)={len(df)}, len(cluster_list)={len(cluster_list)}.")

    d = {}

    df_mean = df.assign(cluster=cluster_list).groupby(['cluster']) \
                                             .mean(numeric_only=True)
    df_min = df_mean.min()
    df_max = df_mean.max()
    del df_mean

    for feature in df.columns:
        max = df_max.loc[feature]
        min = df_min.loc[feature]
        if min != 0:
            d[feature] = max / min
        else:
            d[feature] = special_value

    del df_max, df_min

    return d


def precision_df(labels, cluster_labels):
    """
    Calculate the precision for each cluster and class, and return the
    results in a DataFrame.

    Params:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.

    Returns:
        pd.DataFrame: a DataFrame containing the precisions for each cluster
            label and class label. The columns are the class labels (ground
            truth) and the row index is the cluster labels.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    precision_data = {}
    for i in set(cluster_labels):
        precision_data[i] = {}
        for j in set(labels):
            mij = len([idy for idy in
                       [idx for idx, lab in enumerate(cluster_labels)
                        if lab == i]
                       if labels[idy] == j])
            mi = len([idx for idx, lab in enumerate(cluster_labels)
                      if lab == i])
            precision_data[i][j] = mij/mi if mi != 0 else 0

    return pd.DataFrame(precision_data).T


def precision(labels, cluster_labels, use_max_label=False):
    """
    Calculate the precision for each cluster, as the maximum precision
    among all the ground truth classes.

    Params:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.
        use_max_label (bool): if True, the returned dictionary will use the
            maximum ground truth label as the key instead of the cluster label.

    Returns:
        dict[int, float]: a dictionary mapping either the cluster label or the
        maximum ground truth label to its (maximum among classes) precision.
        The keys are unique by appending a suffix to duplicate keys.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    df = precision_df(labels, cluster_labels)
    if use_max_label:
        return convert_to_max_label_dict(df)
    else:
        return df.max(axis=1).to_dict()


def recall_df(labels, cluster_labels):
    """
    Calculate the recall for each cluster and class, and return the
    results in a DataFrame.

    Params:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.

    Returns:
        pd.DataFrame: a DataFrame containing the recalls for each cluster
            label and class label. The columns are the class labels (ground
            truth) and the row index is the cluster labels.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    recall_data = {}
    for i in set(cluster_labels):
        recall_data[i] = {}
        for j in set(labels):
            mij = len([idy for idy in
                       [idx for idx, lab in enumerate(cluster_labels)
                        if lab == i]
                       if labels[idy] == j])
            mj = len([idx for idx, lab in enumerate(labels)
                      if lab == j])

            recall_data[i][j] = mij/mj if mj != 0 else 0

    return pd.DataFrame(recall_data).T


def recall(labels, cluster_labels, use_max_label=False):
    """
    Calculate the recall for each cluster, as the maximum recall
    among all the ground truth classes.

    Params:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.
        use_max_label (bool): if True, the returned dictionary will use the
            maximum ground truth label as the key instead of the cluster label.

    Returns:
        dict[int, float]: a dictionary mapping either the cluster label or the
        maximum ground truth label to its (maximum among classes) recall.
        The keys are unique by appending a suffix to duplicate keys.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    df = recall_df(labels, cluster_labels)
    if use_max_label:
        return convert_to_max_label_dict(df)
    else:
        return df.max(axis=1).to_dict()


def f1score_df(labels, cluster_labels):
    """
    Calculate the f1-score for each cluster and class, and return the
    results in a DataFrame.

    Params:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.

    Returns:
        pd.DataFrame: a DataFrame containing the f1-scores for each cluster
            label and class label. The columns are the class labels (ground
            truth) and the row index is the cluster labels.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    f1score_data = {}
    for i in set(cluster_labels):
        f1score_data[i] = {}
        for j in set(labels):
            mij = len([idy for idy in [idx for idx, lab in enumerate(
                cluster_labels) if lab == i] if labels[idy] == j])
            mi = len([idx for idx, lab in enumerate(
                cluster_labels) if lab == i])
            mj = len([idx for idx, lab in enumerate(labels) if lab == j])

            p = mij / mi
            r = mij / mj
            if r + p == 0:
                f1score_data[i][j] = 0
            else:
                f1score_data[i][j] = (2 * r * p) / (r + p)

    return pd.DataFrame(f1score_data).T


def f1score(labels, cluster_labels, use_max_label=False):
    """
    Calculate the F1 score for each cluster, as the maximum F1 score
    among all the ground truth classes.

    Parames:
        labels (list[int]): a list of ground truth labels for the data.
        cluster_labels (list[int]): a list of cluster labels for the data.
        use_max_label (bool): if True, the returned dictionary will use the
            maximum ground truth label as the key instead of the cluster label.

    Returns:
        dict[int, float]: a dictionary mapping either the cluster label or the
        maximum ground truth label to its (maximum among classes)  F1 score.
        The keys are unique by appending a suffix to duplicate keys.

    Raises:
        ValueError: if the two input lists have different sizes.
    """

    if len(labels) != len(cluster_labels):
        raise ValueError("The two input array must have same size.")

    df = f1score_df(labels, cluster_labels)
    if use_max_label:
        return convert_to_max_label_dict(df)
    else:
        return df.max(axis=1).to_dict()


def convert_to_max_label_dict(df: pd.DataFrame):
    # TODO: direct test.
    # It has only been indirectly tested, as its functionality is primarily
    # evaluated through testing of the precision(), recall(), and f1score()
    # functions that make use of it.
    """
    Compute maximum values in the DataFrame for each row and put the results
    in a dictionary: the keys are the columns that have the highest value
    for each row and the values are the corresponding highest values.

    Params:
        df (pd.DataFrame): a DataFrame with a generic metric for each cluster
            label and class label. The DataFrame should have the cluster
            labels as row index and labels (ground truth) as columns.

    Returns:
        dict[int, float]: a dictionary mapping the maximum column name to its
            maximum value. The keys are unique by appending a suffix to
            duplicate keys.
    """

    max_cluster_label = df.idxmax(axis=1)
    max_value_by_class = df.max(axis=1)
    result = {}
    for class_label, max_cluster in max_cluster_label.items():
        if max_cluster in result:
            suffix = 1
            while f"{max_cluster}_{suffix}" in result:
                suffix += 1
            max_cluster = f"{max_cluster}_{suffix}"
        result[max_cluster] = max_value_by_class[class_label]
    return result


def overall_purity(precisions, cluster_labels):
    """
    Calculate the overall purity of a clustering, given a dictionary of
    precisions and a list of cluster labels. The overall purity is
    calculated as a weighted mean by the number of elements in each
    cluster.

    Params:
        precisions (dict[int, float]): a dictionary mapping each cluster
            label to its (maximum among classes) precision.
        cluster_labels (list[int]): a list of cluster labels for the data.

    Returns:
        float: the overall purity of the clustering.

    Raises:
        ValueError: if the keys of the precisions dictionary are not equal to
            the set of cluster labels or if there are no data points in
            any cluster.
    """

    # Check that all the labels in `cluster_labels` are present in the
    # keys of the `precisions` dictionary and viceversa.
    if set(precisions.keys()) != set(cluster_labels):
        raise ValueError("The precisions dictionary must have a key for \
            each cluster label.")
    # Check that cluster_labels list is not empty.
    if len(cluster_labels) == 0:
        raise ValueError("The cluster labels list must not be empty.")

    purity_sum = 0
    total_size = 0
    for cluster, purity in precisions.items():
        size = len([idx for idx, lab in enumerate(
            cluster_labels) if lab == cluster])
        purity_sum += purity * size
        total_size += size

    overall_purity = purity_sum / total_size

    return overall_purity


def remove_zero_rows(df, exclude_col=[], in_place=False):
    """
    Removes all rows from a Pandas dataframe that have all zero values in the
    numeric columns.

    Args:
        df (pandas.DataFrame): The dataframe to modify.
        exclude_col (list): A list of column names to exclude from the
            zero-checking process.
            Columns in this list will not be checked for zero values.
        in_place (bool): If True, modify the input dataframe in place.
            If False (default), return a copy of the modified dataframe.

    Returns:
        pandas.DataFrame:
            If in_place is False, a copy of the input dataframe with the zero
            rows removed. If in_place is True, None.
    """

    # Select only the numeric columns from the dataframe.
    numeric_columns = df.select_dtypes(include=['number'])
    # Get a list of the column names.
    column_names = list(numeric_columns.columns)
    # Remove the columns in the exclude_col list from the column_names list.
    column_names = [col for col in column_names if col not in exclude_col]
    # If there are no numeric columns to check: do nothing.
    if len(column_names) == 0:
        return None if in_place else df
    # Find the rows that have all zero values in the numeric columns.
    all_zero_rows = df.loc[df[column_names].eq(0).all(axis=1), :]
    # Drop the rows from the dataframe.
    if in_place:
        df.drop(all_zero_rows.index, axis=0, inplace=True)
        return None
    else:
        df_modified = df.drop(all_zero_rows.index, axis=0, inplace=False)
        return df_modified


def plot_elbow(distance_matrix, linkage='average', k_range=(2, 30),
               evaluation_metric='silhouette', timings=False,
               finalize_plot=True, ax=None):
    """
    Plots the elbow curve for a sklearn's AgglomerativeClustering model
    using the KElbowVisualizer.

    Args:
        distance_matrix (numpy.ndarray or pandas.DataFrame): the precomputed
            distance matrix to use for clustering.
        linkage (str): the linkage method to use for clustering.
        k_range (tuple): the range of number of clusters to consider.
        evaluation_metric (str): the metric to use for evaluation by the
            KElbowVisualizer.
        timings (bool): if True, display timings for each iteration.
        finalize_plot (bool): if True (default), finalize and render the
            plot before returning it using finalize() method.
        ax (matplotlib.axes.Axes): the axis object to draw the plot on.
            If None, a new figure and axis will be created.

    Returns:
        matplotlib.figure.Figure: the figure object of the elbow curve plot.

    Raises:
        ValueError: if the distance matrix is not squared or its dimension
            is less than 3 or the function fail to convert its type.
    """

    # Check the type of the distance matrix and try to convert it to a numpy
    # array if necessary
    if not isinstance(distance_matrix, (np.ndarray, pd.DataFrame)):
        try:
            distance_matrix = np.array(distance_matrix)
        except Exception:
            raise ValueError(
                f"Distance matrix must be a numpy array or pandas dataframe. \
                Got {type(distance_matrix)}.")

    # Check if the distance matrix is a valid distance matrix
    if distance_matrix.shape[0] != distance_matrix.shape[1] or \
       distance_matrix.shape[0] < 4:
        raise ValueError('The distance matrix must be a square matrix \
            with dimensions greater than or equal to 4')

    # Adjust k_range tuple for little distance matrix.
    try:
        k_range = ((k_range[0], min(k_range[1], distance_matrix.shape[0])))
    except BaseException:
        raise ValueError("Specified k-range not valid. Should be at least \
        (2, n_samples - 1)")

    # Create the AgglomerativeClustering model
    model = AgglomerativeClustering(affinity='precomputed', linkage=linkage)

    # Create the KElbowVisualizer
    visualizer = KElbowVisualizer(model, k=k_range, timings=timings,
                                  metric=evaluation_metric, ax=ax)
    # Fit data to visualizer
    visualizer.fit(distance_matrix)
    # Finalize and render the plot if requested
    if finalize_plot:
        visualizer.finalize()

    # Return the figure object of the elbow curve plot
    return visualizer.fig


def non_zero_rows(df: pd.DataFrame, features: set,
                  columns_to_return: set = None) -> pd.DataFrame:
    """
    Returns all the rows that have a non-zero value for each of the specified
    numeric features. Non-numeric features and Non-existing numeric features
    given as input will be discarded from comparison.

    Parameters:
        df (pd.DataFrame): The DataFrame to filter.
        features (set): The set of features to check for non-zero values.
        columns_to_return (set): The set of columns to be returned, default
            is None and will return all columns.

    Returns:
        pd.DataFrame: A DataFrame containing only the rows where the values
            of features are non-zero and columns specified.
    """

    if not features:
        if not columns_to_return:
            return df
        else:
            return df[list(columns_to_return)]

    # Remove non-numeric features from the set.
    numeric_cols = df.select_dtypes(include=[np.number]).columns
    features = features.intersection(numeric_cols)
    # Check for non-zero values on numeric columns.
    mask = (df[list(features)] != 0).all(axis=1)

    if not columns_to_return:
        return df[mask]
    else:
        return df[mask][list(columns_to_return)]


def medoid(dm: list, cluster_labels: list) -> dict:
    """
    Compute the medoid for each cluster, where the medoid is defined as the
    element with the minimum mean distance from other elements in the same
    cluster, based on a distance matrix `dm` and a list of `cluster_labels`.

    Args:
        dm (list): A symmetric distance matrix, represented as a list of lists.
        cluster_labels (list): A list of labels for each element in the
            distance matrix, indicating which cluster it belongs to.
            Must be a list of int or string.

    Returns:
        dict: A dictionary where each key is a cluster label and each value is
        the index of the element with the minimum mean distance from other
        elements in the same cluster.
    """

    # Check if input matrix is symmetric.
    if not np.allclose(dm, dm.T):
        raise ValueError("Distance matrix is not symmetric")

    medoid = {}
    clusters = np.unique(cluster_labels)

    # Cast dm to float.
    dm = np.array(dm).astype(float)
    # Fill diagonal element with nan: this allows np.nanmean to exclude
    # these values from mean computation.
    np.fill_diagonal(dm, np.nan)

    for c in clusters:
        cluster_elems = np.where(cluster_labels == c)[0]
        dist_to_others = np.nanmean(dm[cluster_elems][:, cluster_elems],
                                    axis=1)
        min_el = np.argmin(dist_to_others)
        medoid[c] = cluster_elems[min_el]
    return medoid
