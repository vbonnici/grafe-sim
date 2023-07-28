This folder contain a subset of **Project_CodeNet_C++1000 dataset**,
part of the [CodeNet project](https://github.com/IBM/Project_CodeNet).
This subset of the dataset is created to reduce memory usage
and reproduce (almost) the same results shown in the paper/thesis.


The source codes comes from online systems that allow users to submit
solutions to programming problems, typically in the form of competitions
or courses. The system then verifies the correctness of the proposed
solution through an internal verification mechanism, usually based on a
series of unit tests that the solution must pass.
A programming problem consists of a set of submissions (source code
files submitted by users) for each programming language supported in the
dataset. When using the same programming language, various submissions
to the same problem represent source codes with type 4 similarity.
The benchmark datasets were obtained by filtering the original dataset
to remove identical problems and nearly duplicated code samples, aiming
to achieve better training and more accurate evaluation statistics.
The **Project_CodeNet_C++1000 dataset** contain 1000 programming
problems, each with 500 submissions: it is divided into folders based
on the problem, identified by a string `p[0-9]+`, each containing 500
files following the nomenclature `s[0-9]+.cpp`.

To download and extract the entire dataset:
```shell
wget https://dax-cdn.cdn.appdomain.cloud/dax-project-codenet/1.0.0/Project_CodeNet_C++1000.tar.gz
tar -xf Project_CodeNet_C++1000.tar.gz
```

