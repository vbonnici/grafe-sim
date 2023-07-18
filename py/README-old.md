# Python source code

This folder contain `ccpt` python package.
The source code is located in `/src` directory and the unit tests in
`/tests` directory.

## Prerequisites

In order to install and use `ccpt` follow the following steps:

1. Install python requirements
2. Install OS requirements: clang/opt v7.0.0, graphviz
3. Install `ccpt` package in editor mode
4. Compile GraphGrepSX on your own machine

### 1. python requirements

To install python requirements it is raccomanded to create a new virtual
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
(venv)$ pip install -r requirements.txt
```
To install also additional requirements for development:
```sh
(venv)$ pip install -r requirements_dev.txt
```

(To deactivate venv):
```
(venv)$ deactivate

```
### 2. OS requirements (clang/opt)
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

Graphviz:
(Ubuntu)
```
sudo apt install graphviz
```

### 3. ccpt package in editor mode

From virtual environment:
```sh
(venv)$ pip install -e .
```

### 4. Compile GraphGrepSX on your own machine
```sh
cd ../GraphGrepSX
make clean
make -B
cp ggsx ../py/src/ccpt/cfg_to_trie
```
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


**Usage**:

```
pre-processing.py [-h] [-p] [-l] [-o OUT_DIR] FILENAME
```

Positional arguments:

```
FILENAME              input file (.c)
```

Options:

````
-h, --help            show this help message and exit
-p, --emit-pdf        generate pdf file(s) for each .dot file generated (default: False)
-l, --emit-llvm       save intermidiate llvm-ir file generated (default: False)
-o OUT_DIR, --out-dir OUT_DIR
                        output directory (default: out-pp)
```
-->

## Usage

Test if `ccpt` is installed:
```sh
pip show ccpt
```
To check if everything works, go into `../examples/mwe` directory and
follow the isntructions.


For description and usage of `ccpt`:
- [README of cfg_to_trie](./src/ccpt/cfg_to_trie/README.md)
- [README of compare_tries](./src/ccpt/compare_tries/README.md)

Launch jupyter notebook server:
```sh
python -m jupyter notebook
```


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

