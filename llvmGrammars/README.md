# antlr parser

This folder contains grammar description (.g4) for LLVM IR language
used by *antlr4*.

## Build

Pre-requisites:

- install antlr4: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation

### (re)build the Py parser (used by Py modules)

```
antlr4 -Dlanguage=Python3 LLVMLexer.g4 -o ../py/antlr_llvm_py
antlr4 -Dlanguage=Python3 LLVMParser.g4 -visitor -o ../py/antlr_llvm_py
```

### build parser in java (useful for testing):

```
antlr4 LLVMLexer.g4 -o java
antlr4 LLVMParser.g4 -o java
cd java
javac LLVM*.java
```

