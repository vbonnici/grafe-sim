# grafe-sim
Code similarity via graph-based features



# Project structure

### ```/GraphGrepSX```

This folder contains a modified version on
[GraphGrepSX](https://github.com/InfOmics/GraphGrepSX). The changes concern
the creation of an additional XML output of input graphs index (as prefix tree).


### ```/llvmGrammars```
This folder contains the BNF grammars in *G4* format of LLVM-IR 7.0.0
language. The original grammar description can be found on LLVM mailing
list at this [link](https://lists.llvm.org/pipermail/llvm-dev/2018-June/123851.html).
# Setup

## ggsx

To compile GraphGrepSX on your own machine (REQUIRED):
```sh
cd /GraphGrepSX
make clean
make -B
cp ggsx /py/src/ccpt/cfg_to_trie
```
<!-- TODO: check last step with new project structure. -->