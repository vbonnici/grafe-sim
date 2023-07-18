import re
from antlr4 import      \
    InputStream,        \
    CommonTokenStream,  \
    BailErrorStrategy
from ccpt.cfg_to_trie.antlr_llvm.LLVMLexer import LLVMLexer
from ccpt.cfg_to_trie.antlr_llvm.LLVMParser import LLVMParser
from ccpt.cfg_to_trie.antlr_llvm.LLVMParserVisitor import LLVMParserVisitor
import ccpt.cfg_to_trie.utils as utils

# key            | value                                    | test
# ---------------|------------------------------------------| ----
# `op`           | instruction name                         | OK
# `write`        | varname of a **variable** "written"      | const-expr prob
#                | by the instruction                       |
# `read`         | varname of a **variable** "read" by the  | const-expr prob
#                | instruction                              |
# `const`        | simple **constant** used by the          | OK
#                | instruction                              |
# `const-expr`   | **constant expression** used by the      | OK
#                | instruction                              |
# `call`         | function name called by the instruction  | OK
# *varname*-`ty` | LLVM-**type** of variable *varname*      | some doubts
#
# TODO
# *varname*-`sty`| simplified **type** of variable *varname*|

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

    def __init__(self, module_set) -> None:
        super().__init__()
        self.globalset: set = set()
        self.moduleset: set = module_set
        self.pendingVarname = ""

        self.AdditionalWrittenValueIndex = -1

        self.pendingDefaultLlvmType = ""
        self.typeCounter = 0
        self.skipTypeIndex = -1

        # Variable used (eventually) to store the localIdent in
        # localIdent = valueInstruction.
        # When visiting a valueInstruction, type of returned value
        # can be computed and then paired with this localIdent.
        self.localIdentToInferType = None

        # positon inside instruction of llvmType that represent type
        # for value produced by valueInstruction
        self.llvmTypeForValueInstructionCounter = -1
        self.inferTypeForValueInstruction = False

    def getGlobalset(self) -> set:
        """
        Returns the set of tuples created during the visit of the tree.
        """
        return self.globalset

    # # "Vector" instructions. #####

    # # Visit a parse tree produced by LLVMParser#extractElementInst.
    # def visitExtractElementInst(self,
    #                             ctx: LLVMParser.ExtractElementInstContext):
    #     vect = ctx.value(0).getText()
    #     index = ctx.value(1).getText()
    #     t = tuple(("read", vect + "[" + index + "]"))
    #     self.globalset.add(t)

    #     return self.visitChildren(ctx)

    # # Visit a parse tree produced by LLVMParser#insertElementInst.
    # def visitInsertElementInst(self,
    #                            ctx: LLVMParser.InsertElementInstContext):
    #     vect = ctx.value(0).getText()
    #     index = ctx.value(2).getText()
    #     t = tuple(("write", vect + "[" + index + "]"))
    #     self.handleValue(ctx.value(1), "read")

    #     self.globalset.add(t)

    #     return self.visitChildren(ctx)

    # TODO: placeholder is temporary.
    def add_type_tuples_from_str(self, varname: str, llvmtype: str,
                                 placeholder: str = "") -> None:
        """
        Adds type's tuples (-ty and -sty) to global set starting from
        an llvmtype as string. The placeholder string is added to both
        tuples' type.

        Args:
            llvmtypestr(str): Llvmtype to add.
            varname(str): variable name for lhs of tuples.
            placeholder(str): to add to the bottom of computed type.
        Returns:
            None.
        Raise:
            ??
        """

        llvmtypectx = self.create_llvmtype_ctx(llvmtype)

        # Use the context to add complete tuples.
        self.add_type_tuples(varname, llvmtypectx, placeholder)

        return

    # TODO: placeholder is temporary.

    def add_type_tuples(self, varname: str,
                        llvmtypectx: LLVMParser.LlvmTypeContext,
                        placeholder: str = "") -> None:
        """
        Adds type's tuples (-ty and -sty) to global set starting from
        a valid llvmtype context object.

        Args:
            llvmtypectx(ctx): LlvmTypeContext of type to add.
            varname(str): variable name for lhs of tuples.
            placeholder(str): to add to the bottom of computed type.
        Returns:
            None.
        Raise:
            ValueError: when llvmtype is not an LlvmTypeContext.
        """

        # Check if ctx is an LlvmType context.
        if not isinstance(llvmtypectx, LLVMParser.LlvmTypeContext):
            raise ValueError

        # Add raw type.
        tuple = ((varname + "-ty", llvmtypectx.getText() + placeholder))
        self.globalset.add(tuple)

        # Add simplified type.
        simpl_type = utils.get_simplified_type(llvmtypectx) + placeholder
        tuple = ((varname + "-sty", simpl_type))
        self.globalset.add(tuple)

        return

    def isConversionInst(self, ctx) -> bool:
        if not isinstance(ctx, LLVMParser.ValueInstructionContext):
            raise ValueError
        instruction = ctx.getChild(0)
        childs = [instruction.getChild(i).getText()
                  for i in range(instruction.getChildCount())]
        return ('to' in childs)

    def get_type_in_typelist(self, typelist, index: int):
        # Build list of types.
        list = []
        remaining_list = typelist

        while remaining_list.typeList():
            list.append(remaining_list.llvmType())
            remaining_list = remaining_list.typeList()
        list.append(remaining_list.llvmType())
        list.reverse()
        print(list)
        # Return type in 'index' position.
        return list[index]

    def get_aggr_elem_type(self, typectx, indeces: list):

        if typectx.concreteNonRecType().arrayType():
            type = typectx.concreteNonRecType().arrayType().llvmType()
        elif typectx.concreteNonRecType().structType():
            typelistctx = typectx.concreteNonRecType().structType().typeList()
            # Consume index.
            type = self.get_type_in_typelist(typelistctx, indeces[0])
            indeces = indeces[1:]
            print("remaining indeces", indeces)
            if len(indeces) > 0:
                type = self.get_aggr_elem_type(type, indeces)
        else:
            # Should never happen.
            type = None

        return type

    def create_llvmtype_ctx(self,
                            llvmtype_str: str) -> LLVMParser.LlvmTypeContext:

        # Clean string.
        llvmtype_str = str(llvmtype_str)
        llvmtype_str = llvmtype_str.replace("x", " x ")
        llvmtype_str = llvmtype_str.replace(",", ", ")
        try:
            lexer = LLVMLexer(InputStream(llvmtype_str))
            stream = CommonTokenStream(lexer)
            parser = LLVMParser(stream)
            ctx = parser.llvmType()
            return ctx
        except BaseException:
            print(f"cannot construct type for {llvmtype_str}")
            raise (f"cannot construct type for {llvmtype_str}")

###########

    # Visit a parse tree produced by LLVMParser#localIdent.
    def visitTerminator(self, ctx: LLVMParser.TerminatorContext):
        # Opcode.
        opcode = ctx.getChild(0).getChild(0).getText()
        t = tuple(("op", str(opcode)))
        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#instruction.
    def visitInstruction(self, ctx: LLVMParser.InstructionContext):

        # localIdent = valueInstruction
        if ctx.getChildCount() == 3:

            # old
            self.pendingVarname = ctx.localIdent().getText()

            # new
            self.localIdentToInferType = ctx.localIdent().getText()


#            vartype = "unknown"
#            if ctx.valueInstruction().catchPadInst() \
#                    or ctx.valueInstruction().cleanupPadInst():
#                vartype = "catch-type"
#            elif ctx.valueInstruction().getElementPtrInst():
#                vartype = "pointer-to-" + self.computeSimplifiedType(
#                   ctx.valueInstruction().getChild(0).llvmType(0))
#            else: # Any other valueInstruction.
#                # Infer type.
#                if isinstance(ctx.valueInstruction().getChild(0).llvmType(),
#                              list):
#                    index = 0
#                    # Conversion instructions.
#                    childs = [
#                       ctx.valueInstruction().getChild(0).getChild(i)
#                                                         .getText()
#                       for i in range(ctx.valueInstruction().getChild(0)
#                                                            .getChildCount())
#                       ]
#                    if 'to' in childs:
#                        index = 1 # Take second llvmType()
#                    vartype = self.computeSimplifiedType(
#                       ctx.valueInstruction().getChild(0).llvmType(index))
#                else:
#                    vartype = self.computeSimplifiedType(
#                       ctx.valueInstruction().getChild(0).llvmType())
#
#            t: tuple = tuple((str(varname), vartype))
#            self.globalset.add(t)
#
            # Handle access.
            t = tuple(("write", ctx.localIdent().getText()))
            self.globalset.add(t)

        # Any other rule.
        else:
            self.pendingVarname = ""

        # Op-code for non "valueInstruction"
        if not ctx.valueInstruction():

            opcode = ctx.getChild(0).getChild(0).getText()
            t = tuple(("op", str(opcode)))
            self.globalset.add(t)

            # Type inference: default behaviour (llvmType-value pair in
            # visitors)
            self.pendingDefaultLlvmType == ""

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

        # Here we have to check type of generated value
        # default: first LLVMType

        if self.isConversionInst(ctx):
            # The second type
            if self.pendingVarname != "":
                # print(self.pendingVarname, ":", ctx.getChild(0).llvmType(1)
                #                                                .getText())
                # TODO: OLD type.
                t = tuple(
                    (self.pendingVarname,
                     ctx.getChild(0).llvmType(1).getText()))
                self.globalset.add(t)
                self.skipTypeIndex = 1

        elif not ctx.extractElementInst() \
                and not ctx.shuffleVectorInst() \
                and not ctx.extractValueInst() \
                and not ctx.allocaInst() \
                and not ctx.getElementPtrInst() \
                and not ctx.iCmpInst() and not ctx.fCmpInst() \
                and not ctx.selectInst() \
                and not ctx.vaArgInst() \
                and not ctx.landingPadInst() \
                and not ctx.catchPadInst() \
                and not ctx.cleanupPadInst():
            # Only if there is a localIdent to assign the generated value.
            if self.pendingVarname != "":
                type = ""
                try:
                    type = ctx.getChild(0).llvmType(0).getText()
                except BaseException:
                    type = ctx.getChild(0).llvmType().getText()

                # print(self.pendingVarname, ":", type)
                # TODO: old type.
                t = tuple((self.pendingVarname, type))
                self.globalset.add(t)
                self.skipTypeIndex = 0

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#storeInst.
    def visitStoreInst(self, ctx: LLVMParser.StoreInstContext):

        # 2nd 'value' will be written.
        self.AdditionalWrittenValueIndex = 2
        # print(ctx.value(1).getText(), ":", ctx.llvmType(1).getText())

        return self.visitChildren(ctx)

        # Visit a parse tree produced by LLVMParser#allocaInst.
#    def visitAllocaInst(self, ctx:LLVMParser.AllocaInstContext):
#        if self.pendingVarname != "":
#            # TODO: handle vector and array ?
#            print(self.pendingVarname, ":", ctx.llvmType(0).getText() + "*")
#            t = tuple((self.pendingVarname, ctx.llvmType(0).getText() + "*"))
#            self.globalset.add(t)
#
#
#
#        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#cmpXchgInst.

    def visitCmpXchgInst(self, ctx: LLVMParser.CmpXchgInstContext):
        # 1st value will be written ...
        self.AdditionalWrittenValueIndex = 1
        # ... and read.
        t: tuple = tuple(('read', ctx.value(0).getText()))
        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#atomicRMWInst.
    def visitAtomicRMWInst(self, ctx: LLVMParser.AtomicRMWInstContext):
        # DOC: The contents of memory at the location specified by the
        # ‘<pointer>’ operand are atomically read, modified, and written back.

        # 1st value will be written ...
        self.AdditionalWrittenValueIndex = 1
        # ... and read.
        t: tuple = tuple(('read', ctx.value(0).getText()))
        self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#retTerm.
    def visitRetTerm(self, ctx: LLVMParser.RetTermContext):

        # TYPE INFERENCE.
        if ctx.value():
            if ctx.value().localIdent() \
               or ctx.value().constant().globalIdent():

                if ctx.llvmType():
                    type = ctx.llvmType().getText() \
                           + ctx.optAddrSpace().getText() + "*"

                elif ctx.concreteNonRecType():
                    type = ctx.concreteNonRecType().getText()

                # TODO: old type.
                t = tuple((ctx.value().getText(), type))
                self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#switchTerm.

    def visitSwitchTerm(self, ctx: LLVMParser.SwitchTermContext):

        # TYPE INFERENCE.
        if ctx.value().localIdent() or ctx.value().constant().globalIdent():
            # TODO: old type.
            t = tuple((ctx.value().getText(), ctx.llvmType().getText()))
            self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#indirectBrTerm.
    def visitIndirectBrTerm(self, ctx: LLVMParser.IndirectBrTermContext):

        # TYPE INFERENCE.
        if ctx.value().localIdent() or ctx.value().constant().globalIdent():
            # TODO: old type.
            t = tuple((ctx.value().getText(), ctx.llvmType().getText()))
            self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#invokeTerm.
    def visitInvokeTerm(self, ctx: LLVMParser.InvokeTermContext):

        # TYPE INFERENCE.
        # assign to result in <result> = invoke...
        # grammar does not allow it.
        # ctx.llvmType().getText()

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#llvmType.
    def visitLlvmType(self, ctx: LLVMParser.LlvmTypeContext):

        # print("visitType:", ctx.getText())

        parent_ctx = ctx.getRuleContext().parentCtx
        if isinstance(parent_ctx, LLVMParser.LlvmTypeContext) \
                or isinstance(parent_ctx, LLVMParser.TypeListContext) \
                or isinstance(parent_ctx, LLVMParser.ArrayTypeContext) \
                or isinstance(parent_ctx, LLVMParser.VectorTypeContext):
            # Exclude recursive llvmType
            pass

        # Non-recursive llvmType
        else:
            # print("visit non-rec LLVMType", ctx.getText())

            if self.skipTypeIndex != self.typeCounter:
                if self.pendingDefaultLlvmType == "":
                    self.pendingDefaultLlvmType = ctx.getText()
            else:
                self.pendingDefaultLlvmType = ""
            self.typeCounter += 1

            # if self.pendingVarname != "":
            #    t = tuple((self.pendingVarname, str(ctx.getText())))
            #    #self.globalset.add(t)
            #
            #    self.pendingVarname = ""

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#constant.
    def visitConstant(self, ctx: LLVMParser.ConstantContext):
        # https://llvm.org/docs/LangRef.html#constants
        # constant
        #    : boolConst
        #    | intConst
        #    | floatConst
        #    | nullConst
        #    | noneConst
        #    | structConst
        #    | arrayConst
        #    | charArrayConst
        #    | vectorConst
        #    | zeroInitializerConst
        #    // @42
        #    // @foo
        #    | globalIdent
        #    | undefConst
        #    | blockAddressConst
        #    | constantExpr
        # ;

        constant = ctx.getText()

        # TUPLE: const-expr.
        if ctx.constantExpr():
            t = tuple(("const-expr", str(constant)))
            self.globalset.add(t)
        # Exclude 'globalIdent' from constant's tuples.
        elif ctx.globalIdent():
            # print("globalIdent \'",constant,"\' excluded from constants.")
            pass
        # TUPLE: const.
        else:
            t = tuple(("const", str(constant)))
            self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#localIdent.
    def visitLocalIdent(self, ctx: LLVMParser.LocalIdentContext):

        # # Avoid to add access in the case of localIdent = ValueInstruction.
        # if isinstance(ctx.getRuleContext().parentCtx,
        #               LLVMParser.InstructionContext):
        #     return self.visitChildren(ctx)

        # # Avoid to add access in the case of parent is 'typeDef'
        # # or 'namedType'.
        # if isinstance(ctx.getRuleContext().parentCtx,
        #               LLVMParser.TypeDefContext) \
        #         or isinstance(ctx.getRuleContext().parentCtx,
        #                       LLVMParser.NamedTypeContext):
        #     return self.visitChildren(ctx)

        # # Avoid to add access if used as label. #TODO: Is this ok?
        # if isinstance(ctx.getRuleContext().parentCtx, LLVMParser.IncContext)\
        #         or isinstance(ctx.getRuleContext().parentCtx,
        #                       LLVMParser.CatchPadInstContext) \
        #         or isinstance(ctx.getRuleContext().parentCtx,
        #                       LLVMParser.BrTermContext) \
        #         or isinstance(ctx.getRuleContext().parentCtx,
        #                       LLVMParser.CatchPadInstContext):
        #
        #     return self.visitChildren(ctx)

        # # Avoid other cases. TODO: Check.
        # blockAddressConst

        # TODO: 'param' as dad is ok?, typeDef - NO?
        # Handle access type
        # if isinstance(ctx.getRuleContext().parentCtx,
        #               LLVMParser.ValueContext):
        #     if self.AdditionalWrittenValueIndex == 0:
        #         t = tuple(("write", str(ctx.getText())))
        #         self.globalset.add(t)
        #         self.AdditionalWrittenValueIndex = -1
        #     else:
        #         t = tuple(("read", str(ctx.getText())))
        #         self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#globalIdent.
    def visitGlobalIdent(self, ctx: LLVMParser.GlobalIdentContext):
        # if isinstance(ctx.getRuleContext().parentCtx,
        #               LLVMParser.ConstantContext):
        #     # Handle access type
        #     if self.AdditionalWrittenValueIndex == 0:
        #         t = tuple(("write", str(ctx.getText())))
        #         self.globalset.add(t)
        #         self.AdditionalWrittenValueIndex = -1
        #     else:
        #         t = tuple(("read", str(ctx.getText())))
        #         self.globalset.add(t)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#value.
    def visitValue(self, ctx: LLVMParser.ValueContext):

        if self.AdditionalWrittenValueIndex > 0:
            self.AdditionalWrittenValueIndex -= 1
        # print("visitValue: pendingWriteVarPosition",
        #       self.AdditionalWrittenValueIndex)

        # Type and access are computed only for localIdent and globalIdent
        # not for constants.
        if ctx.constant():
            # Drop pending type.
            self.pendingDefaultLlvmType = ""
            if ctx.getChild(0).globalIdent():
                # Handle access type
                # Avoid funcType, expection labels and so on..
                if not isinstance(ctx.getRuleContext().parentCtx,
                                  LLVMParser.InvokeTermContext) \
                   and not isinstance(ctx.getRuleContext().parentCtx,
                                      LLVMParser.CallInstContext) \
                   and not isinstance(ctx.getRuleContext().parentCtx,
                                      LLVMParser.ExceptionArgContext):
                    if self.AdditionalWrittenValueIndex == 0:
                        t = tuple(("write", str(ctx.getText())))
                        self.globalset.add(t)
                        self.AdditionalWrittenValueIndex = -1
                    else:
                        t = tuple(("read", str(ctx.getText())))
                        self.globalset.add(t)
            # elif ctx.getChild(0).constantExpr():
            #     self.writeConstExprFlag = True

        else:  # localIdent.
            if self.pendingDefaultLlvmType != "":
                # Found 'LLVMtype value' pair.
                # print(ctx.getText(),":",self.pendingDefaultLlvmType)
                # TODO: old type.
                t = tuple((ctx.getText(), self.pendingDefaultLlvmType))
                # self.globalset.add(t)
                self.pendingDefaultLlvmType = ""

            # Handle access type
            # Avoid funcType, expection labels and so on..
            if not isinstance(ctx.getRuleContext().parentCtx,
                              LLVMParser.InvokeTermContext) \
                and not isinstance(ctx.getRuleContext().parentCtx,
                                   LLVMParser.CallInstContext) \
                and not isinstance(ctx.getRuleContext().parentCtx,
                                   LLVMParser.ExceptionArgContext):
                if self.AdditionalWrittenValueIndex == 0:
                    t = tuple(("write", str(ctx.getText())))
                    self.globalset.add(t)
                    self.AdditionalWrittenValueIndex = -1
                else:
                    t = tuple(("read", str(ctx.getText())))
                    self.globalset.add(t)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#constantExpr.
    def visitConstantExpr(self, ctx: LLVMParser.ConstantExprContext):
        """
        All constants->globalIdent childs of ConstantExpr are read.
        """
        # TODO: handle write access. Have ConstExprs write access?
        # storeInstruction

        ctx = ctx.getChild(0)
        childs = [ctx.getChild(i) for i in range(ctx.getChildCount())
                  if isinstance(ctx.getChild(i), LLVMParser.ConstantContext)]

        for c in childs:
            if c.globalIdent():
                t = tuple(("read", c.globalIdent().getText()))
                self.globalset.add(t)

        return self.visitChildren(ctx)

    # Sometimes intConst, noneConst, arrayConst are used
    # without being a 'constant' childs.

    # Visit a parse tree produced by LLVMParser#intConst.
    def visitIntConst(self, ctx: LLVMParser.IntConstContext):
        t = tuple(("const", str(ctx.getText())))
        self.globalset.add(t)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#noneConst.
    def visitNoneConst(self, ctx: LLVMParser.NoneConstContext):
        t = tuple(("const", str(ctx.getText())))
        self.globalset.add(t)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#arrayConst.
    def visitArrayConst(self, ctx: LLVMParser.ArrayConstContext):
        t = tuple(("const", str(ctx.getText())))
        self.globalset.add(t)
        return self.visitChildren(ctx)

    # ------ begin valueInstructions -------

    def assignTypeToPendingLocalIdent(self, ctx, pos: int) -> None:
        '''
        Given a production in ctx, assign (if needed) the 'pos'-th
        llvmType to localIdentToInferType.
        '''
        if self.localIdentToInferType:
            if pos == 0:
                try:
                    type = ctx.llvmType(pos)
                except BaseException:
                    type = ctx.llvmType()
            else:
                type = ctx.llvmType(pos)
            self.add_type_tuples(self.localIdentToInferType, type)
        return

    def handleGeneratedValueType(self, binaryOrBitwiseInstCtx):
        if self.localIdentToInferType:
            type = binaryOrBitwiseInstCtx.llvmType()
            self.add_type_tuples(self.localIdentToInferType, type)
        return

    def handleGeneratedValueTypeCast(self, conversionInstCtx):
        if self.localIdentToInferType:
            type = conversionInstCtx.llvmType(1)
            self.add_type_tuples(self.localIdentToInferType, type)
        return

    # ------- Binary -------

    # Visit a parse tree produced by LLVMParser#addInst.

    def visitAddInst(self, ctx: LLVMParser.AddInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fAddInst.
    def visitFAddInst(self, ctx: LLVMParser.FAddInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#subInst.
    def visitSubInst(self, ctx: LLVMParser.SubInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fSubInst.
    def visitFSubInst(self, ctx: LLVMParser.FSubInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#mulInst.
    def visitMulInst(self, ctx: LLVMParser.MulInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fMulInst.
    def visitFMulInst(self, ctx: LLVMParser.FMulInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#uDivInst.
    def visitUDivInst(self, ctx: LLVMParser.UDivInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#sDivInst.
    def visitSDivInst(self, ctx: LLVMParser.SDivInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fDivInst.
    def visitFDivInst(self, ctx: LLVMParser.FDivInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#uRemInst.
    def visitURemInst(self, ctx: LLVMParser.URemInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#sRemInst.
    def visitSRemInst(self, ctx: LLVMParser.SRemInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fRemInst.
    def visitFRemInst(self, ctx: LLVMParser.FRemInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

# Bitwise

    # Visit a parse tree produced by LLVMParser#shlInst.
    def visitShlInst(self, ctx: LLVMParser.ShlInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#lshrInst.
    def visitLshrInst(self, ctx: LLVMParser.LshrInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#ashrInst.
    def visitAshrInst(self, ctx: LLVMParser.AshrInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#andInst.
    def visitAndInst(self, ctx: LLVMParser.AndInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#orInst.
    def visitOrInst(self, ctx: LLVMParser.OrInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#xorInst.
    def visitXorInst(self, ctx: LLVMParser.XorInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

# Vector instructions

    # Visit a parse tree produced by LLVMParser#extractElementInst.
    def visitExtractElementInst(
            self, ctx: LLVMParser.ExtractElementInstContext):

        # Handle localIdentToInferType.
        if self.localIdentToInferType:
            # TODO: do it in a better way.
            typestr = ctx.llvmType(0).getText()
            typestr = typestr.replace("<", "")
            typestr = typestr.replace(">", "")
            typestr = typestr.split("x")[1]
            typestr = typestr.strip()
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#insertElementInst.
    def visitInsertElementInst(self, ctx: LLVMParser.InsertElementInstContext):
        if self.localIdentToInferType:
            type = ctx.llvmType(0)
            self.add_type_tuples(self.localIdentToInferType, type)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#shuffleVectorInst.
    def visitShuffleVectorInst(self, ctx: LLVMParser.ShuffleVectorInstContext):
        if self.localIdentToInferType:
            m = ctx.llvmType(2).getText()
            m = re.search("<.*x", m).group(0)[1:-1]
            ty = ctx.llvmType(0).getText()
            ty = re.sub("^<.*x", "", ty)[:-1]
            typestr = f"<{m}x{ty}>"
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr)

        return self.visitChildren(ctx)

# Aggregate instructions

    # Visit a parse tree produced by LLVMParser#extractValueInst.
    def visitExtractValueInst(self, ctx: LLVMParser.ExtractValueInstContext):
        # TODO Ok for non named types.
        if self.localIdentToInferType:

            # TODO: maybe the type cannot be named ?

            # If the type is named: try to get information from module set.
            # if ctx.llvmType().concreteNonRecType().namedType():
            #     query = f"typedef-{ctx.llvmType().getText()}"
            #     typestr = [v for ((k,v)) in self.moduleset if k == query][0]
            #     typectx = self.create_llvmtype_ctx(typestr)

            # Else: use the type to get element type.
            # else:
            #    typectx = ctx.llvmType()

            typectx = ctx.llvmType()

            indeces = ctx.indexList().getText().split(",")
            indeces = [int(i) for i in indeces]
            type = self.get_aggr_elem_type(typectx, indeces)
            self.add_type_tuples(self.localIdentToInferType, type)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#insertValueInst.
    def visitInsertValueInst(self, ctx: LLVMParser.InsertValueInstContext):
        # TODO this is a temporary place-holder. It's needed to parse
        # all the llvmir file to get information about the structures.
        # TODO: maybe the type cannot be named ?

        if self.localIdentToInferType:
            type = ctx.llvmType(0)
            self.add_type_tuples(self.localIdentToInferType, type)

        return self.visitChildren(ctx)

# Memory instructions

    # Visit a parse tree produced by LLVMParser#allocaInst.
    def visitAllocaInst(self, ctx: LLVMParser.AllocaInstContext):
        if self.localIdentToInferType:
            typestr = ctx.llvmType(0).getText() + "*"
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#loadInst.
    def visitLoadInst(self, ctx: LLVMParser.LoadInstContext):
        # old
        self.skipTypeIndex = 0
        # new
        if self.localIdentToInferType:
            type = ctx.llvmType(0)
            self.add_type_tuples(self.localIdentToInferType, type)

        return self.visitChildren(ctx)

    # TODO: it performs address calculation only and does not access memory.
    # Visit a parse tree produced by LLVMParser#getElementPtrInst.
    def visitGetElementPtrInst(self, ctx: LLVMParser.GetElementPtrInstContext):
        # TODO this is a temporary place-holder. It's needed to parse
        # all the llvmir file to get information about the structures.
        if self.localIdentToInferType:
            typestr = ctx.llvmType(0).getText()
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr,
                                          placeholder="-field-ptr")

            # TODO: Read the documentation.
            # if ctx.commaSepTypeValueList(): # has indeces

            #     # Compute list of indeces.
            #     tmp = ctx.commaSepTypeValueList()
            #     indeces = []
            #     while tmp.commaSepTypeValueList():
            #         indeces.append(tmp.typeValue().value().getText())
            #         tmp = tmp.commaSepTypeValueList()
            #     indeces.append(tmp.typeValue().value().getText())
            #     indeces.reverse()
            #     indeces = [int(i) for i in indeces]

            #     if ctx.llvmType(0).concreteNonRecType().namedType(): #
            #         # tuple = [for k,v in self.module_set]
            #         # print("Module set")
            #         print("named type with indeces:")
            #         query = f"typedef-{ctx.llvmType(0).getText()}"
            #         tuple = [v for ((k,v)) in self.moduleset if k == query]
            #         type = self.create_llvmtype_ctx(tuple[0])
            #         type = self.get_aggr_elem_type(type, indeces)
            #         self.add_type_tuples_from_str(self.localIdentToInferType,
            #             type.getText() + "*")

            # else:
            #     self.add_type_tuples()

        return self.visitChildren(ctx)

    # --------- Conversion instructions --------

    # Visit a parse tree produced by LLVMParser#truncInst.

    def visitTruncInst(self, ctx: LLVMParser.TruncInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#zExtInst.
    def visitZExtInst(self, ctx: LLVMParser.ZExtInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#sExtInst.
    def visitSExtInst(self, ctx: LLVMParser.SExtInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fpTruncInst.
    def visitFpTruncInst(self, ctx: LLVMParser.FpTruncInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fpExtInst.
    def visitFpExtInst(self, ctx: LLVMParser.FpExtInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fpToUIInst.
    def visitFpToUIInst(self, ctx: LLVMParser.FpToUIInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fpToSIInst.
    def visitFpToSIInst(self, ctx: LLVMParser.FpToSIInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#uiToFPInst.
    def visitUiToFPInst(self, ctx: LLVMParser.UiToFPInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#siToFPInst.
    def visitSiToFPInst(self, ctx: LLVMParser.SiToFPInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#ptrToIntInst.
    def visitPtrToIntInst(self, ctx: LLVMParser.PtrToIntInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#intToPtrInst.
    def visitIntToPtrInst(self, ctx: LLVMParser.IntToPtrInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#bitCastInst.
    def visitBitCastInst(self, ctx: LLVMParser.BitCastInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#addrSpaceCastInst.
    def visitAddrSpaceCastInst(self, ctx: LLVMParser.AddrSpaceCastInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

# Other instructions

    # Visit a parse tree produced by LLVMParser#iCmpInst.
    def visitICmpInst(self, ctx: LLVMParser.ICmpInstContext):
        if self.localIdentToInferType:
            try:
                N = ctx.llvmType().concreteNonRecType().vectorType().getText()
                N = re.search("<.*x", N).group(0)
                typestr = N + " i1>"
            except BaseException:
                typestr = "i1"
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#fCmpInst.
    def visitFCmpInst(self, ctx: LLVMParser.FCmpInstContext):
        if self.localIdentToInferType:
            try:
                N = ctx.llvmType().concreteNonRecType().vectorType().getText()
                N = re.search("<.*x", N).group(0)
                typestr = N + "i1>"
            except BaseException:
                typestr = "i1"
            self.add_type_tuples_from_str(self.localIdentToInferType, typestr)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#phiInst.
    def visitPhiInst(self, ctx: LLVMParser.PhiInstContext):
        # self.handleGeneratedValueType(ctx)
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#selectInst.
    def visitSelectInst(self, ctx: LLVMParser.SelectInstContext):
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#callInst.
    def visitCallInst(self, ctx: LLVMParser.CallInstContext):
        # 'call' tuple.
        tuple = (('call', ctx.value().getText()))
        self.globalset.add(tuple)
        # Type inference for pending localIdent.
        # self.assignTypeToPendingLocalIdent(ctx, 0)
        if self.localIdentToInferType:
            if ctx.llvmType().getChildCount() == 4:  # funcType
                type = ctx.llvmType().llvmType()
            else:
                type = ctx.llvmType()
            self.add_type_tuples(self.localIdentToInferType, type)

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#vaArgInst.
    def visitVaArgInst(self, ctx: LLVMParser.VaArgInstContext):
        self.assignTypeToPendingLocalIdent(ctx, 1)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#landingPadInst.
    def visitLandingPadInst(self, ctx: LLVMParser.LandingPadInstContext):
        self.assignTypeToPendingLocalIdent(ctx, 0)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#catchPadInst.
    def visitCatchPadInst(self, ctx: LLVMParser.CatchPadInstContext):
        if self.localIdentToInferType:
            self.add_type_tuples_from_str(self.localIdentToInferType, "token")

        return self.visitChildren(ctx)

    # Visit a parse tree produced by LLVMParser#cleanupPadInst.
    def visitCleanupPadInst(self, ctx: LLVMParser.CleanupPadInstContext):
        if self.localIdentToInferType:
            self.add_type_tuples_from_str(self.localIdentToInferType, "token")

        return self.visitChildren(ctx)

# end valueInstructions


def parse(instruction: str, module_set: set = set()) -> set:
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
    visitor = MyVisitor(module_set)
    visitor.visit(tree)
    myset: set = visitor.getGlobalset()
    # Return the set.
    return myset


def main() -> None:
    """
    Reads an instruction form stdin and prints IV result on stdout.
    """

    print("INFO: IV(2)")
    print("INFO: ^D or \"exit\" to exit.")
    print("INFO: RETURN to end the instruction to parse.")
    while True:
        InputStream.__init__
        data = str(InputStream(input(">>> ")))
        if data == "exit":
            break
        try:
            x = parse(data)
            print("raw: ", x)
            print()
            for t in x:
                print(t[0], ":", t[1])
            print()
        except Exception as e:
            print("Exception raised during instruction parsing:")
            print(e)


if __name__ == "__main__":
    main()
