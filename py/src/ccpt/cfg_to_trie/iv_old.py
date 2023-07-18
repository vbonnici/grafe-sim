from antlr4 import      \
    InputStream,        \
    CommonTokenStream,  \
    BailErrorStrategy,  \
    ParserRuleContext
from ccpt.cfg_to_trie.antlr_llvm.LLVMLexer import LLVMLexer
from ccpt.cfg_to_trie.antlr_llvm.LLVMParser import LLVMParser
from ccpt.cfg_to_trie.antlr_llvm.LLVMParserVisitor import LLVMParserVisitor


# tuple meanings
# ('write','varname')
# ('read','varname')
# ('op','opcode')
# ('const','value')
# ('const-expr','expr')
# ('varname','type')
# ('call','function-name')
# To infer types:
# - for local variables (alloca instruction have precedence to put its
#   type in the global set)
# - for SSA variables: check value instruction type and assign it. By
#   definition, these variables will be assigned only ones.

# NOT IMPLEMENTED ('write-pointer','varname')
# NOT IMPLEMENTED ('read-pointer','varname')

class MyVisitor(LLVMParserVisitor):
    """Contains all the redefinitions of the visit methods.

    This class contains all the redefinition of the visit methods used
    during the exploration of the parse tree generated from the
    instruction.
    """

    def __init__(self) -> None:
        super().__init__()
        self.globalset: set = set()

    def getGlobalset(self) -> set:
        """
        Returns the set of tuples created during the visit of the tree.
        """
        return self.globalset

    def handleValue(self, ctx: ParserRuleContext, access_type: str):
        if ctx.constant():
            # For now: exclude blockAddressConst
            if ctx.constant().blockAddressConst():
                pass
            elif ctx.constant().constantExpr():
                t: tuple = tuple(
                    ("const-expr", str(ctx.getChild(0).getText())))
                self.globalset.add(t)
            else:
                t: tuple = tuple(("const", str(ctx.getChild(0).getText())))
                self.globalset.add(t)
        else:
            t: tuple = tuple((access_type, str(ctx.getChild(0).getText())))
            self.globalset.add(t)

        return

    def handleBinaryInst(self, ctx):
        # Opcode.
        opcode: str = ctx.getChild(0).getText()
        t: tuple = tuple(("op", str(opcode)))
        self.globalset.add(t)
        # Operands.
        for v in ctx.value():
            self.handleValue(v, "read")

        return

    def computeSimplifiedType(self, ctx):
        t = "unknown"
        if ctx.voidType():
            t = "void"
        elif ctx.metadataType():
            t = "metadata-type"
        elif ctx.getChildCount() == 3:
            t = "pointer-type"
        elif ctx.getChildCount() == 4:
            # t = "function-type"
            # Get the return value of the function.
            t = self.computeSimplifiedType(ctx.llvmType())
        elif ctx.concreteNonRecType():
            tmpctx = ctx.concreteNonRecType()
            if tmpctx.intType():
                t = tmpctx.intType().getText()
            elif tmpctx.floatType():
                t = tmpctx.floatType().getChild(0).getText()
            elif tmpctx.vectorType():
                t = "vect-of-" \
                    + self.computeSimplifiedType(tmpctx.vectorType()
                                                 .llvmType())
            elif tmpctx.arrayType():
                t = "array-of-" \
                    + self.computeSimplifiedType(tmpctx.arrayType()
                                                 .llvmType())
            elif tmpctx.namedType():
                t = "named-t-" + tmpctx.namedType().localIdent().getText()
            elif tmpctx.structType():
                t = "struct"
            else:  # tokenType, mmxType, labelType
                t = tmpctx.getChild(0).getText()
        else:  # Should be unuseful.
            pass
        return t

    # "Binary" and "Bitwise" instructions. ######

    # Visit a parse tree produced by LLVMParser#addInst.
    def visitAddInst(self, ctx: LLVMParser.AddInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fAddInst.
    def visitFAddInst(self, ctx: LLVMParser.FAddInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#subInst.
    def visitSubInst(self, ctx: LLVMParser.SubInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fSubInst.
    def visitFSubInst(self, ctx: LLVMParser.FSubInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#mulInst.
    def visitMulInst(self, ctx: LLVMParser.MulInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fMulInst.
    def visitFMulInst(self, ctx: LLVMParser.FMulInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#uDivInst.
    def visitUDivInst(self, ctx: LLVMParser.UDivInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#sDivInst.
    def visitSDivInst(self, ctx: LLVMParser.SDivInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fDivInst.
    def visitFDivInst(self, ctx: LLVMParser.FDivInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#uRemInst.
    def visitURemInst(self, ctx: LLVMParser.URemInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#sRemInst.
    def visitSRemInst(self, ctx: LLVMParser.SRemInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fRemInst.
    def visitFRemInst(self, ctx: LLVMParser.FRemInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#shlInst.
    def visitShlInst(self, ctx: LLVMParser.ShlInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#lshrInst.
    def visitLshrInst(self, ctx: LLVMParser.LshrInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#ashrInst.
    def visitAshrInst(self, ctx: LLVMParser.AshrInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#andInst.
    def visitAndInst(self, ctx: LLVMParser.AndInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#orInst.
    def visitOrInst(self, ctx: LLVMParser.OrInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#xorInst.
    def visitXorInst(self, ctx: LLVMParser.XorInstContext):
        self.handleBinaryInst(ctx)
        return self.visitChildren(ctx)

    # "Vector" instructions. #####

    # Visit a parse tree produced by LLVMParser#extractElementInst.
    def visitExtractElementInst(self,
                                ctx: LLVMParser.ExtractElementInstContext):
        vect = ctx.value(0).getText()
        index = ctx.value(1).getText()
        t = tuple(("read", vect + "[" + index + "]"))
        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#insertElementInst.
    def visitInsertElementInst(self, ctx: LLVMParser.InsertElementInstContext):
        vect = ctx.value(0).getText()
        index = ctx.value(2).getText()
        t = tuple(("write", vect + "[" + index + "]"))
        self.handleValue(ctx.value(1), "read")

        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Other instructions. #####

    # Visit a parse tree produced by LLVMParser#iCmpInst.
    def visitICmpInst(self, ctx: LLVMParser.ICmpInstContext):
        self.handleValue(ctx.value(0), "read")
        self.handleValue(ctx.value(1), "read")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fCmpInst.
    def visitFCmpInst(self, ctx: LLVMParser.FCmpInstContext):
        self.handleValue(ctx.value(0), "read")
        self.handleValue(ctx.value(1), "read")
        return self.visitChildren(ctx)

    # Used only by phi instruction.
    # Visit a parse tree produced by LLVMParser#inc.
    def visitInc(self, ctx: LLVMParser.IncContext):
        self.handleValue(ctx.value(), "read")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#selectInst.
    def visitSelectInst(self, ctx: LLVMParser.SelectInstContext):
        # Condition.
        self.handleValue(ctx.value(0), "read")
        # Values.
        self.handleValue(ctx.value(1), "read")
        self.handleValue(ctx.value(2), "read")
        return self.visitChildren(ctx)

    # For "call" and "invoke" instructions.
    # Visit a parse tree produced by LLVMParser#arg.
    def visitArg(self, ctx: LLVMParser.ArgContext):
        self.handleValue(ctx.value(), "read")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#getElementPtrInst.
    def visitGetElementPtrInst(self, ctx: LLVMParser.GetElementPtrInstContext):
        self.handleValue(ctx.value(), "read")
        return self.visitChildren(ctx)

###########
    # Visit a parse tree produced by LLVMParser#instruction.
    def visitInstruction(self, ctx: LLVMParser.InstructionContext):

        # localIdent = valueInstruction
        if ctx.getChildCount() == 3:
            varname = ctx.localIdent().getText()
            # Not needed anymore (maybe).
            # if ctx.valueInstruction().allocaInst(): # 'alloca' instruction.
            #     vartype = \
            #       self.computeSimplifiedType(ctx.valueInstruction()
            #                                  .allocaInst().llvmType(0))
            #     varname = ctx.localIdent().getText()
            #     t = tuple((str(varname), vartype))
            #     self.globalset.add(t)

            vartype = "unknown"
            if ctx.valueInstruction().catchPadInst() \
                    or ctx.valueInstruction().cleanupPadInst():
                vartype = "catch-type"
            elif ctx.valueInstruction().getElementPtrInst():
                vartype = "pointer-to-" + \
                    self.computeSimplifiedType(
                        ctx.valueInstruction().getChild(0).llvmType(0))
            else:  # Any other valueInstruction.
                # Infer type.
                if isinstance(ctx.valueInstruction().getChild(
                        0).llvmType(), list):
                    index = 0
                    # Conversion instructions.
                    childs = [
                        ctx.valueInstruction().getChild(0)
                                              .getChild(i).getText()
                        for i in range(ctx.valueInstruction().getChild(0)
                                       .getChildCount())
                        ]
                    if 'to' in childs:
                        index = 1  # Take second llvmType()
                    vartype = self.computeSimplifiedType(
                        ctx.valueInstruction().getChild(0).llvmType(index))
                else:
                    vartype = self.computeSimplifiedType(
                        ctx.valueInstruction().getChild(0).llvmType())

            t: tuple = tuple((str(varname), vartype))
            self.globalset.add(t)

            # Handle access.
            t = tuple(("write", str(varname)))
            self.globalset.add(t)
        else:
            pass

        # Op-code for non "valueInstruction"
        if not ctx.valueInstruction():
            opcode = ctx.getChild(0).getChild(0).getText()
            t = tuple(("op", str(opcode)))
            self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#valueInstruction.
    def visitValueInstruction(self, ctx: LLVMParser.ValueInstructionContext):

        # Opcode.
        if ctx.callInst():
            opcode = ctx.getChild(0).getChild(1)
        else:
            opcode = ctx.getChild(0).getChild(0)
        t = tuple(("op", str(opcode)))
        self.globalset.add(t)

        # Each "value" in a "valueInstruction" is a """read""" access.

        # print(f" AAA {ctx.getChild(0).value()}")
        # for i in range(3):
#        if ctx.getChild(0).value():
#            for v in ctx.getChild(0).value():
#                #print(f" AAA {ctx.getChild(0).value()}")
#                if v.constant():
#                    t = tuple(("const", str(v.getText())))
#                else:
#                    t = tuple(("read", str(v.getText())))
#                self.globalset.add(t)

        #    values = list(ctx.getChild(0).value())

        # for i in range(3): # At most 3 "value" in a valueInstruction.
        #    if ctx.getChild(0).value():
        #        if ctx.getChild(0).value()[i].constant():
        #            t = tuple(("const",\
        #                       str(ctx.getChild(0).value(i).getText())))
        #        else:
        #            t = tuple(("read",\
        #                       str(ctx.getChild(0).value(i).getText())))
        #        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#loadInst.
    def visitLoadInst(self, ctx: LLVMParser.LoadInstContext):
        # if ctx.alignment() != None:
        #    print("alignment")
        self.handleValue(ctx.value(), "read")

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#storeInst.
    def visitStoreInst(self, ctx: LLVMParser.StoreInstContext):
        # First "value" parameter.
        self.handleValue(ctx.value(0), "read")
        # Second "value" parameter.
        self.handleValue(ctx.value(1), "write")

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#localIdent.
    def visitTerminator(self, ctx: LLVMParser.TerminatorContext):
        opcode = ctx.getChild(0).getChild(0).getText()
        t = tuple(("op", str(opcode)))
        self.globalset.add(t)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#constant.
    def visitConstant(self, ctx: LLVMParser.ConstantContext):

        # two_level_up_context = ctx.getRuleContext().parentCtx \
        #         .getRuleContext().parentCtx.getRuleContext()
        #
        # if ctx.blockAddressConst() or ctx.constantExpr():
        #     # For now, exclude blockAddressConst and constantExpr
        #     # productions.
        #     pass
        # elif isinstance(two_level_up_context, LLVMParser.CallInstContext):
        #     # Exclude constants as function name in callInst
        #     pass
        # else:
        #     value = ctx.getChild(0).getText()
        #     t = tuple(("const", str(value)))
        #     self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#localIdent.
    def visitLocalIdent(self, ctx):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#bitCastInst.
    def visitBitCastInst(self, ctx: LLVMParser.BitCastInstContext):
        self.handleValue(ctx.value(), "read")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#callInst.
    def visitCallInst(self, ctx: LLVMParser.CallInstContext):
        t: tuple = tuple(('call', ctx.value().getText()))
        self.globalset.add(t)

        return self.visitChildren(ctx)


def parse(instruction: str) -> set:
    """
    Parse an llvm instruction returning a set of tuples.

    Given an LLVM instruction, this function uses the parser and visits
    the created AST to populate a set of tuple with informations like:
    the constant used, the variable used, the name of the opcode and
    if the the variable are red or written.

    Args:
        instruction(str): LLVM-IR instruction to parse.

    Returns:
        A set of tuples.

    Raises:
        Exception: If error occurs during parsing.
    """

    # LLVM Lexer and Parser.
    lexer = LLVMLexer(InputStream(instruction))
    stream = CommonTokenStream(lexer)
    parser = LLVMParser(stream)
    # Make the parser raise exception if error occurs during parsing.
    parser._errHandler = BailErrorStrategy()
    # Create tree from custom grammar production "mySingleInstruction".
    tree = parser.mySingleInstruction()
    # Visit tree with custom visitor.
    visitor = MyVisitor()
    visitor.visit(tree)
    myset: set = visitor.getGlobalset()
    # Return the set.
    return myset


def main() -> None:
    """
    Reads an instruction form stdin and prints IV result on stdout.
    """

    print("INFO: ^D or \"exit\" to exit.")
    print("INFO: RETURN to end the instruction to parse.")
    while True:
        data = str(InputStream(input(">>> ")))
        if data == "exit":
            break
        try:
            x = parse(data)
            print(x)
        except Exception as e:
            print("Exception raised during instruction parsing:")
            print(e)


if __name__ == "__main__":
    main()
