# grafe-sim
Code similarity via graph-based features.

## Project structure

### ```/GraphGrepSX```

This folder contains a modified version on
[GraphGrepSX](https://github.com/InfOmics/GraphGrepSX). The changes concern
the creation of an additional XML output of input graphs index (as prefix tree).


### ```/llvmGrammars```
This folder contains the BNF grammars in *G4* format of LLVM-IR 7.0.0
language. The original grammar description can be found on LLVM mailing
list at this [link](https://lists.llvm.org/pipermail/llvm-dev/2018-June/123851.html).

### ```/py```
This folder contains all the source files regarging the execution pipeline.
This folder contain `ccpt` python package.
The source code is located in `/src` directory and the unit tests in
`/tests` directory.

### ```/analysis```
This folder contains some workflow examples of the clustering and classification
problems. They are both contained inside a *jupyter notebook*.
It also contains a `/data` folder in which are a sample of the Codenet dataset source files.

### ```/maps```

This folder contains a set of ```.csv``` files which represents
some predefinite maps that can be used for A-CFG creation.
## Setup

<!-- In order to install and use `ccpt` follow the following steps:

1. Install python requirements
2. Install OS requirements: clang/opt v7.0.0, graphviz
3. Install `ccpt` package in editor mode
4. Compile GraphGrepSX on your own machine
....
....

-->

### LLVM Clang and Opt (v7.0.0)
<!--
Also required:.
 - `clang` (1:14.0-55~exp2)
 - `opt` (3.19-2)
 - `graphviz` (2.42.2-6)
-->
In order to make the preprocessing steps (`.c` $\rightarrow$ `.dot` CFG)
of `ccpt` works, `clang-7` and `opt-7` must be installed: **v 7.0.0 required**.

- Build specific version of llvm project from source:

    ```sh
    mkdir <llvm-7-dir>
    cd <llvm-7-dir>
    git clone https://github.com/llvm/llvm-project.git
    cd llvm-project
    git checkout tags/llvmorg-7.0.0
    cmake -S llvm -B build -G "Unix Makefiles" -DCMAKE_BUILD_TYPE="Release" -DLLVM_ENABLE_PROJECTS=clang
    cmake --build build -j 8
    ```
- Then, create a symlink:
    ```
    ln -s /full/path/to/<llvm-7-dir>/llvm-project/build/bin/clang /usr/bin/clang-7
    ln -s /full/path/to/<llvm-7-dir>/llvm-project/build/bin/clang++ /usr/bin/clang++-7
    ln -s /full/path/to/<llvm-7-dir>/llvm-project/build/bin/opt /usr/bin/opt-7
    ln -s /full/path/to/<llvm-7-dir>/llvm-project/build/bin/llvm-cxxfilt /usr/bin/llvm-cxxfilt-7
    ```

<!--Follow the instruction for your OS to install Clang and Opt.-->

It is only required that Clang/Opt 7.0.0 could be called from CLI with `clang-7`
and `opt-7` commands. To check if they work:
```sh
clang-7 --version
clang++-7 --version
opt-7 --version
llvm-cxxfilt-7 --version
```

### Graphviz
To install graphviz on Ubuntu:
```
sudo apt install graphviz
```

### Modified GraphGrepSX (```ggsx```)

To compile GraphGrepSX on your own machine:
```sh
cd /GraphGrepSX
make clean
make -B
cp ggsx /py/src/ccpt/cfg_to_trie
```
<!-- TODO: check last step with new project structure. -->

### ```ccpt``` Python package

#### 1. Python requirements

To install Python requirements it is raccomanded to create a new virtual
environment:
```sh
python3 -m venv venv
```
To activate the virtual environment `venv`:
- Linux/MacOS

    ```sh
    source venv/bin/activate
    ```
- Windows

    ```sh
    venv\Scripts\activate
    ```
To install requirements for the project in the virtual environment
`venv`:
```sh
(venv)$ pip install -r py/requirements.txt
```
To install also additional requirements for development:
```sh
(venv)$ pip install -r py/requirements_dev.txt
```

(To deactivate venv):
```
(venv)$ deactivate

```
#### 2. ccpt package in editor mode

From virtual environment:
```sh
(venv)$ pip install -e py/
```

<!-- README OLD -->

<!--
This folder contains the following modules:
- `aug.py`

    Starting from the RAW CFG (as a`.dot` file) produced by CLANG compilation produces a new `.dot` file containing a modified/augmented CFG created using information given by `iv.py` module.\
    (**in the future**) CFG production can be parametrized.

- `iv.py`

    This module provide a `parse(instruction)` method that takes as input a single LLVM-IR instruction and returns a set of tuples, each of them describes an information about the instruction.

    It uses antlr4 python parser, that requires `antlr4-python3-runtime`:
    ```
    pip install antlr4-python3-runtime
    ```
- `pre-processing.py`

    Starting from `.c` produces a set of `.dot` files (one for each function in the file) that contains the CFG (of each function) generated using CLANG compiler. Optionally, it can produce `.ll` file containing the LLVM-IR code and the `.pdf`s of the CFGs.\
    As default, output files will be saved in `./out-pp` directory (overwriting any old file with the same name).
-->

# Usage

Test if `ccpt` is installed:
```sh
pip show ccpt
```
<!-- To check if everything works, go into `../examples/mwe` directory and
follow the instructions. -->


For description and usage of `ccpt`:
- [README of cfg_to_trie](./py/src/ccpt/cfg_to_trie/README.md)
- [README of compare_tries](./py/src/ccpt/compare_tries/README.md)

Launch jupyter notebook server:
```sh
python -m jupyter notebook
```


# Analysis
The analysis phase is performed using *jupyter notebook*. The analysis in these notebooks
are done on a series of precomputed features extracted from the A-CFGs generated from the source code.

## Features generation
Execute these commands to generate the features starting from the source code.


Create a folder for the generated files inside `/analysis`
```sh
cd analysis
mkdir featuresData
```

Choose a file from the data folder and generate the features
```sh
python3 gen-features-callgraph.py data/p00000/[somefile] -od featuresData
```

## Necessary packages
In order to run the examples inside the jupyter notebooks some packages must be installed, which are:
- sklearn
- yellowbrick

### Installation
After activating the virtual environment created above, execute the following commands:
<br>

**skelearn**
```sh
pip3 install -U scikit-learn
```

**yellowbrick**
```sh
pip install yellowbrick
```

## Running the example
After activating the virtual environment, start the **jupyter** server from the 'analysis' folder:
```sh
jupyter notebook
```
This command will start a new tab in the default browser showing a list of all the files and folder located into the folder in which the command has been executed, in this case *analysis*.

Select the desired notebook and execute the internal boxes.

<!--
... TODO ...
## Unit testing

Make sure that python development requirements are installed.

To run the unit-tests:
```sh
(venv)$ pytest
```
### Development notes
- To generate new `requirements.txt` file:
    ```
    pipreqs . --force
    ```
    that requires `pipreqs` py package. To install it:
    ```
    pip install pipreqs
    ```
 -->
