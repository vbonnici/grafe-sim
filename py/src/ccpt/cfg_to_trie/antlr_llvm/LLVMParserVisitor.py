# Generated from LLVMParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LLVMParser import LLVMParser
else:
    from LLVMParser import LLVMParser

# This class defines a complete generic visitor for a parse tree produced by LLVMParser.

class LLVMParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LLVMParser#mySingleInstruction.
    def visitMySingleInstruction(self, ctx:LLVMParser.MySingleInstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#module.
    def visitModule(self, ctx:LLVMParser.ModuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#topLevelEntities.
    def visitTopLevelEntities(self, ctx:LLVMParser.TopLevelEntitiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#topLevelEntityList.
    def visitTopLevelEntityList(self, ctx:LLVMParser.TopLevelEntityListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#topLevelEntity.
    def visitTopLevelEntity(self, ctx:LLVMParser.TopLevelEntityContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sourceFilename.
    def visitSourceFilename(self, ctx:LLVMParser.SourceFilenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#targetDefinition.
    def visitTargetDefinition(self, ctx:LLVMParser.TargetDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#moduleAsm.
    def visitModuleAsm(self, ctx:LLVMParser.ModuleAsmContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeDef.
    def visitTypeDef(self, ctx:LLVMParser.TypeDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#comdatDef.
    def visitComdatDef(self, ctx:LLVMParser.ComdatDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#selectionKind.
    def visitSelectionKind(self, ctx:LLVMParser.SelectionKindContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalDecl.
    def visitGlobalDecl(self, ctx:LLVMParser.GlobalDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalDef.
    def visitGlobalDef(self, ctx:LLVMParser.GlobalDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optExternallyInitialized.
    def visitOptExternallyInitialized(self, ctx:LLVMParser.OptExternallyInitializedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#immutable.
    def visitImmutable(self, ctx:LLVMParser.ImmutableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalAttrs.
    def visitGlobalAttrs(self, ctx:LLVMParser.GlobalAttrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalAttrList.
    def visitGlobalAttrList(self, ctx:LLVMParser.GlobalAttrListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalAttr.
    def visitGlobalAttr(self, ctx:LLVMParser.GlobalAttrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#indirectSymbolDef.
    def visitIndirectSymbolDef(self, ctx:LLVMParser.IndirectSymbolDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#alias.
    def visitAlias(self, ctx:LLVMParser.AliasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#functionDecl.
    def visitFunctionDecl(self, ctx:LLVMParser.FunctionDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#functionDef.
    def visitFunctionDef(self, ctx:LLVMParser.FunctionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#functionHeader.
    def visitFunctionHeader(self, ctx:LLVMParser.FunctionHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optGC.
    def visitOptGC(self, ctx:LLVMParser.OptGCContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optPrefix.
    def visitOptPrefix(self, ctx:LLVMParser.OptPrefixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optPrologue.
    def visitOptPrologue(self, ctx:LLVMParser.OptPrologueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optPersonality.
    def visitOptPersonality(self, ctx:LLVMParser.OptPersonalityContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#functionBody.
    def visitFunctionBody(self, ctx:LLVMParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#attrGroupDef.
    def visitAttrGroupDef(self, ctx:LLVMParser.AttrGroupDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#namedMetadataDef.
    def visitNamedMetadataDef(self, ctx:LLVMParser.NamedMetadataDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataNodes.
    def visitMetadataNodes(self, ctx:LLVMParser.MetadataNodesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataNodeList.
    def visitMetadataNodeList(self, ctx:LLVMParser.MetadataNodeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataNode.
    def visitMetadataNode(self, ctx:LLVMParser.MetadataNodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataDef.
    def visitMetadataDef(self, ctx:LLVMParser.MetadataDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optDistinct.
    def visitOptDistinct(self, ctx:LLVMParser.OptDistinctContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#useListOrders.
    def visitUseListOrders(self, ctx:LLVMParser.UseListOrdersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#useListOrderList.
    def visitUseListOrderList(self, ctx:LLVMParser.UseListOrderListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#useListOrder.
    def visitUseListOrder(self, ctx:LLVMParser.UseListOrderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#useListOrderBB.
    def visitUseListOrderBB(self, ctx:LLVMParser.UseListOrderBBContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#globalIdent.
    def visitGlobalIdent(self, ctx:LLVMParser.GlobalIdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#localIdent.
    def visitLocalIdent(self, ctx:LLVMParser.LocalIdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#labelIdent.
    def visitLabelIdent(self, ctx:LLVMParser.LabelIdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#attrGroupID.
    def visitAttrGroupID(self, ctx:LLVMParser.AttrGroupIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#comdatName.
    def visitComdatName(self, ctx:LLVMParser.ComdatNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataName.
    def visitMetadataName(self, ctx:LLVMParser.MetadataNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataID.
    def visitMetadataID(self, ctx:LLVMParser.MetadataIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#llvmType.
    def visitLlvmType(self, ctx:LLVMParser.LlvmTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#concreteNonRecType.
    def visitConcreteNonRecType(self, ctx:LLVMParser.ConcreteNonRecTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#voidType.
    def visitVoidType(self, ctx:LLVMParser.VoidTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intType.
    def visitIntType(self, ctx:LLVMParser.IntTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#floatType.
    def visitFloatType(self, ctx:LLVMParser.FloatTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#floatKind.
    def visitFloatKind(self, ctx:LLVMParser.FloatKindContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mmxType.
    def visitMmxType(self, ctx:LLVMParser.MmxTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optAddrSpace.
    def visitOptAddrSpace(self, ctx:LLVMParser.OptAddrSpaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#addrSpace.
    def visitAddrSpace(self, ctx:LLVMParser.AddrSpaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#vectorType.
    def visitVectorType(self, ctx:LLVMParser.VectorTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#labelType.
    def visitLabelType(self, ctx:LLVMParser.LabelTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#tokenType.
    def visitTokenType(self, ctx:LLVMParser.TokenTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataType.
    def visitMetadataType(self, ctx:LLVMParser.MetadataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#arrayType.
    def visitArrayType(self, ctx:LLVMParser.ArrayTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#structType.
    def visitStructType(self, ctx:LLVMParser.StructTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeList.
    def visitTypeList(self, ctx:LLVMParser.TypeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#opaqueType.
    def visitOpaqueType(self, ctx:LLVMParser.OpaqueTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#namedType.
    def visitNamedType(self, ctx:LLVMParser.NamedTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#value.
    def visitValue(self, ctx:LLVMParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#inlineAsm.
    def visitInlineAsm(self, ctx:LLVMParser.InlineAsmContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optSideEffect.
    def visitOptSideEffect(self, ctx:LLVMParser.OptSideEffectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optAlignStack.
    def visitOptAlignStack(self, ctx:LLVMParser.OptAlignStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optIntelDialect.
    def visitOptIntelDialect(self, ctx:LLVMParser.OptIntelDialectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#constant.
    def visitConstant(self, ctx:LLVMParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#boolConst.
    def visitBoolConst(self, ctx:LLVMParser.BoolConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#boolLit.
    def visitBoolLit(self, ctx:LLVMParser.BoolLitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intConst.
    def visitIntConst(self, ctx:LLVMParser.IntConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intLit.
    def visitIntLit(self, ctx:LLVMParser.IntLitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#floatConst.
    def visitFloatConst(self, ctx:LLVMParser.FloatConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#nullConst.
    def visitNullConst(self, ctx:LLVMParser.NullConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#noneConst.
    def visitNoneConst(self, ctx:LLVMParser.NoneConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#structConst.
    def visitStructConst(self, ctx:LLVMParser.StructConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#arrayConst.
    def visitArrayConst(self, ctx:LLVMParser.ArrayConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#charArrayConst.
    def visitCharArrayConst(self, ctx:LLVMParser.CharArrayConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#stringLit.
    def visitStringLit(self, ctx:LLVMParser.StringLitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#vectorConst.
    def visitVectorConst(self, ctx:LLVMParser.VectorConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#zeroInitializerConst.
    def visitZeroInitializerConst(self, ctx:LLVMParser.ZeroInitializerConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#undefConst.
    def visitUndefConst(self, ctx:LLVMParser.UndefConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#blockAddressConst.
    def visitBlockAddressConst(self, ctx:LLVMParser.BlockAddressConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#constantExpr.
    def visitConstantExpr(self, ctx:LLVMParser.ConstantExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#addExpr.
    def visitAddExpr(self, ctx:LLVMParser.AddExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fAddExpr.
    def visitFAddExpr(self, ctx:LLVMParser.FAddExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#subExpr.
    def visitSubExpr(self, ctx:LLVMParser.SubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fSubExpr.
    def visitFSubExpr(self, ctx:LLVMParser.FSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mulExpr.
    def visitMulExpr(self, ctx:LLVMParser.MulExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fMulExpr.
    def visitFMulExpr(self, ctx:LLVMParser.FMulExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uDivExpr.
    def visitUDivExpr(self, ctx:LLVMParser.UDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sDivExpr.
    def visitSDivExpr(self, ctx:LLVMParser.SDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fDivExpr.
    def visitFDivExpr(self, ctx:LLVMParser.FDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uRemExpr.
    def visitURemExpr(self, ctx:LLVMParser.URemExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sRemExpr.
    def visitSRemExpr(self, ctx:LLVMParser.SRemExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fRemExpr.
    def visitFRemExpr(self, ctx:LLVMParser.FRemExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#shlExpr.
    def visitShlExpr(self, ctx:LLVMParser.ShlExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#lShrExpr.
    def visitLShrExpr(self, ctx:LLVMParser.LShrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#ashrExpr.
    def visitAshrExpr(self, ctx:LLVMParser.AshrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#andExpr.
    def visitAndExpr(self, ctx:LLVMParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#orExpr.
    def visitOrExpr(self, ctx:LLVMParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#xorExpr.
    def visitXorExpr(self, ctx:LLVMParser.XorExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#extractElementExpr.
    def visitExtractElementExpr(self, ctx:LLVMParser.ExtractElementExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#insertElementExpr.
    def visitInsertElementExpr(self, ctx:LLVMParser.InsertElementExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#shuffleVectorExpr.
    def visitShuffleVectorExpr(self, ctx:LLVMParser.ShuffleVectorExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#extractValueExpr.
    def visitExtractValueExpr(self, ctx:LLVMParser.ExtractValueExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#insertValueExpr.
    def visitInsertValueExpr(self, ctx:LLVMParser.InsertValueExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#getElementPtrExpr.
    def visitGetElementPtrExpr(self, ctx:LLVMParser.GetElementPtrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#gepConstIndices.
    def visitGepConstIndices(self, ctx:LLVMParser.GepConstIndicesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#gepConstIndexList.
    def visitGepConstIndexList(self, ctx:LLVMParser.GepConstIndexListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#gepConstIndex.
    def visitGepConstIndex(self, ctx:LLVMParser.GepConstIndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optInrange.
    def visitOptInrange(self, ctx:LLVMParser.OptInrangeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#truncExpr.
    def visitTruncExpr(self, ctx:LLVMParser.TruncExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#zExtExpr.
    def visitZExtExpr(self, ctx:LLVMParser.ZExtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sExtExpr.
    def visitSExtExpr(self, ctx:LLVMParser.SExtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fPTruncExpr.
    def visitFPTruncExpr(self, ctx:LLVMParser.FPTruncExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpExtExpr.
    def visitFpExtExpr(self, ctx:LLVMParser.FpExtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpToUIExpr.
    def visitFpToUIExpr(self, ctx:LLVMParser.FpToUIExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpToSIExpr.
    def visitFpToSIExpr(self, ctx:LLVMParser.FpToSIExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uiToFPExpr.
    def visitUiToFPExpr(self, ctx:LLVMParser.UiToFPExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#siToFPExpr.
    def visitSiToFPExpr(self, ctx:LLVMParser.SiToFPExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#ptrToIntExpr.
    def visitPtrToIntExpr(self, ctx:LLVMParser.PtrToIntExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intToPtrExpr.
    def visitIntToPtrExpr(self, ctx:LLVMParser.IntToPtrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#bitCastExpr.
    def visitBitCastExpr(self, ctx:LLVMParser.BitCastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#addrSpaceCastExpr.
    def visitAddrSpaceCastExpr(self, ctx:LLVMParser.AddrSpaceCastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#iCmpExpr.
    def visitICmpExpr(self, ctx:LLVMParser.ICmpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fCmpExpr.
    def visitFCmpExpr(self, ctx:LLVMParser.FCmpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#selectExpr.
    def visitSelectExpr(self, ctx:LLVMParser.SelectExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#basicBlockList.
    def visitBasicBlockList(self, ctx:LLVMParser.BasicBlockListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#basicBlock.
    def visitBasicBlock(self, ctx:LLVMParser.BasicBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optLabelIdent.
    def visitOptLabelIdent(self, ctx:LLVMParser.OptLabelIdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#instructions.
    def visitInstructions(self, ctx:LLVMParser.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#instructionList.
    def visitInstructionList(self, ctx:LLVMParser.InstructionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#instruction.
    def visitInstruction(self, ctx:LLVMParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#valueInstruction.
    def visitValueInstruction(self, ctx:LLVMParser.ValueInstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#addInst.
    def visitAddInst(self, ctx:LLVMParser.AddInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fAddInst.
    def visitFAddInst(self, ctx:LLVMParser.FAddInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#subInst.
    def visitSubInst(self, ctx:LLVMParser.SubInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fSubInst.
    def visitFSubInst(self, ctx:LLVMParser.FSubInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mulInst.
    def visitMulInst(self, ctx:LLVMParser.MulInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fMulInst.
    def visitFMulInst(self, ctx:LLVMParser.FMulInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uDivInst.
    def visitUDivInst(self, ctx:LLVMParser.UDivInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sDivInst.
    def visitSDivInst(self, ctx:LLVMParser.SDivInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fDivInst.
    def visitFDivInst(self, ctx:LLVMParser.FDivInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uRemInst.
    def visitURemInst(self, ctx:LLVMParser.URemInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sRemInst.
    def visitSRemInst(self, ctx:LLVMParser.SRemInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fRemInst.
    def visitFRemInst(self, ctx:LLVMParser.FRemInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#shlInst.
    def visitShlInst(self, ctx:LLVMParser.ShlInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#lshrInst.
    def visitLshrInst(self, ctx:LLVMParser.LshrInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#ashrInst.
    def visitAshrInst(self, ctx:LLVMParser.AshrInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#andInst.
    def visitAndInst(self, ctx:LLVMParser.AndInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#orInst.
    def visitOrInst(self, ctx:LLVMParser.OrInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#xorInst.
    def visitXorInst(self, ctx:LLVMParser.XorInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#extractElementInst.
    def visitExtractElementInst(self, ctx:LLVMParser.ExtractElementInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#insertElementInst.
    def visitInsertElementInst(self, ctx:LLVMParser.InsertElementInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#shuffleVectorInst.
    def visitShuffleVectorInst(self, ctx:LLVMParser.ShuffleVectorInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#extractValueInst.
    def visitExtractValueInst(self, ctx:LLVMParser.ExtractValueInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#insertValueInst.
    def visitInsertValueInst(self, ctx:LLVMParser.InsertValueInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#allocaInst.
    def visitAllocaInst(self, ctx:LLVMParser.AllocaInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optInAlloca.
    def visitOptInAlloca(self, ctx:LLVMParser.OptInAllocaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optSwiftError.
    def visitOptSwiftError(self, ctx:LLVMParser.OptSwiftErrorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#loadInst.
    def visitLoadInst(self, ctx:LLVMParser.LoadInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#storeInst.
    def visitStoreInst(self, ctx:LLVMParser.StoreInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fenceInst.
    def visitFenceInst(self, ctx:LLVMParser.FenceInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#cmpXchgInst.
    def visitCmpXchgInst(self, ctx:LLVMParser.CmpXchgInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optWeak.
    def visitOptWeak(self, ctx:LLVMParser.OptWeakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#atomicRMWInst.
    def visitAtomicRMWInst(self, ctx:LLVMParser.AtomicRMWInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#binOp.
    def visitBinOp(self, ctx:LLVMParser.BinOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#getElementPtrInst.
    def visitGetElementPtrInst(self, ctx:LLVMParser.GetElementPtrInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#truncInst.
    def visitTruncInst(self, ctx:LLVMParser.TruncInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#zExtInst.
    def visitZExtInst(self, ctx:LLVMParser.ZExtInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sExtInst.
    def visitSExtInst(self, ctx:LLVMParser.SExtInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpTruncInst.
    def visitFpTruncInst(self, ctx:LLVMParser.FpTruncInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpExtInst.
    def visitFpExtInst(self, ctx:LLVMParser.FpExtInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpToUIInst.
    def visitFpToUIInst(self, ctx:LLVMParser.FpToUIInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpToSIInst.
    def visitFpToSIInst(self, ctx:LLVMParser.FpToSIInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#uiToFPInst.
    def visitUiToFPInst(self, ctx:LLVMParser.UiToFPInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#siToFPInst.
    def visitSiToFPInst(self, ctx:LLVMParser.SiToFPInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#ptrToIntInst.
    def visitPtrToIntInst(self, ctx:LLVMParser.PtrToIntInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intToPtrInst.
    def visitIntToPtrInst(self, ctx:LLVMParser.IntToPtrInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#bitCastInst.
    def visitBitCastInst(self, ctx:LLVMParser.BitCastInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#addrSpaceCastInst.
    def visitAddrSpaceCastInst(self, ctx:LLVMParser.AddrSpaceCastInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#iCmpInst.
    def visitICmpInst(self, ctx:LLVMParser.ICmpInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fCmpInst.
    def visitFCmpInst(self, ctx:LLVMParser.FCmpInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#phiInst.
    def visitPhiInst(self, ctx:LLVMParser.PhiInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#incList.
    def visitIncList(self, ctx:LLVMParser.IncListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#inc.
    def visitInc(self, ctx:LLVMParser.IncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#selectInst.
    def visitSelectInst(self, ctx:LLVMParser.SelectInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#callInst.
    def visitCallInst(self, ctx:LLVMParser.CallInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optTail.
    def visitOptTail(self, ctx:LLVMParser.OptTailContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#vaArgInst.
    def visitVaArgInst(self, ctx:LLVMParser.VaArgInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#landingPadInst.
    def visitLandingPadInst(self, ctx:LLVMParser.LandingPadInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optCleanup.
    def visitOptCleanup(self, ctx:LLVMParser.OptCleanupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#clauses.
    def visitClauses(self, ctx:LLVMParser.ClausesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#clauseList.
    def visitClauseList(self, ctx:LLVMParser.ClauseListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#clause.
    def visitClause(self, ctx:LLVMParser.ClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#catchPadInst.
    def visitCatchPadInst(self, ctx:LLVMParser.CatchPadInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#cleanupPadInst.
    def visitCleanupPadInst(self, ctx:LLVMParser.CleanupPadInstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#terminator.
    def visitTerminator(self, ctx:LLVMParser.TerminatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#retTerm.
    def visitRetTerm(self, ctx:LLVMParser.RetTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#brTerm.
    def visitBrTerm(self, ctx:LLVMParser.BrTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#condBrTerm.
    def visitCondBrTerm(self, ctx:LLVMParser.CondBrTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#switchTerm.
    def visitSwitchTerm(self, ctx:LLVMParser.SwitchTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#cases.
    def visitCases(self, ctx:LLVMParser.CasesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#caseList.
    def visitCaseList(self, ctx:LLVMParser.CaseListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#llvmCase.
    def visitLlvmCase(self, ctx:LLVMParser.LlvmCaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#indirectBrTerm.
    def visitIndirectBrTerm(self, ctx:LLVMParser.IndirectBrTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#labelList.
    def visitLabelList(self, ctx:LLVMParser.LabelListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#label.
    def visitLabel(self, ctx:LLVMParser.LabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#invokeTerm.
    def visitInvokeTerm(self, ctx:LLVMParser.InvokeTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#resumeTerm.
    def visitResumeTerm(self, ctx:LLVMParser.ResumeTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#catchSwitchTerm.
    def visitCatchSwitchTerm(self, ctx:LLVMParser.CatchSwitchTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#catchRetTerm.
    def visitCatchRetTerm(self, ctx:LLVMParser.CatchRetTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#cleanupRetTerm.
    def visitCleanupRetTerm(self, ctx:LLVMParser.CleanupRetTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#unreachableTerm.
    def visitUnreachableTerm(self, ctx:LLVMParser.UnreachableTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#unwindTarget.
    def visitUnwindTarget(self, ctx:LLVMParser.UnwindTargetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdTuple.
    def visitMdTuple(self, ctx:LLVMParser.MdTupleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdFields.
    def visitMdFields(self, ctx:LLVMParser.MdFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdFieldList.
    def visitMdFieldList(self, ctx:LLVMParser.MdFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdField.
    def visitMdField(self, ctx:LLVMParser.MdFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadata.
    def visitMetadata(self, ctx:LLVMParser.MetadataContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdString.
    def visitMdString(self, ctx:LLVMParser.MdStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataAttachment.
    def visitMetadataAttachment(self, ctx:LLVMParser.MetadataAttachmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#mdNode.
    def visitMdNode(self, ctx:LLVMParser.MdNodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataAttachments.
    def visitMetadataAttachments(self, ctx:LLVMParser.MetadataAttachmentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#metadataAttachmentList.
    def visitMetadataAttachmentList(self, ctx:LLVMParser.MetadataAttachmentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optCommaSepMetadataAttachmentList.
    def visitOptCommaSepMetadataAttachmentList(self, ctx:LLVMParser.OptCommaSepMetadataAttachmentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#commaSepMetadataAttachmentList.
    def visitCommaSepMetadataAttachmentList(self, ctx:LLVMParser.CommaSepMetadataAttachmentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#specializedMDNode.
    def visitSpecializedMDNode(self, ctx:LLVMParser.SpecializedMDNodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompileUnit.
    def visitDiCompileUnit(self, ctx:LLVMParser.DiCompileUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompileUnitFields.
    def visitDiCompileUnitFields(self, ctx:LLVMParser.DiCompileUnitFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompileUnitFieldList.
    def visitDiCompileUnitFieldList(self, ctx:LLVMParser.DiCompileUnitFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompileUnitField.
    def visitDiCompileUnitField(self, ctx:LLVMParser.DiCompileUnitFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFile.
    def visitDiFile(self, ctx:LLVMParser.DiFileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFileFields.
    def visitDiFileFields(self, ctx:LLVMParser.DiFileFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFileFieldList.
    def visitDiFileFieldList(self, ctx:LLVMParser.DiFileFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFileField.
    def visitDiFileField(self, ctx:LLVMParser.DiFileFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diBasicType.
    def visitDiBasicType(self, ctx:LLVMParser.DiBasicTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diBasicTypeFields.
    def visitDiBasicTypeFields(self, ctx:LLVMParser.DiBasicTypeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diBasicTypeFieldList.
    def visitDiBasicTypeFieldList(self, ctx:LLVMParser.DiBasicTypeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diBasicTypeField.
    def visitDiBasicTypeField(self, ctx:LLVMParser.DiBasicTypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubroutineType.
    def visitDiSubroutineType(self, ctx:LLVMParser.DiSubroutineTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubroutineTypeFields.
    def visitDiSubroutineTypeFields(self, ctx:LLVMParser.DiSubroutineTypeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubroutineTypeFieldList.
    def visitDiSubroutineTypeFieldList(self, ctx:LLVMParser.DiSubroutineTypeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubroutineTypeField.
    def visitDiSubroutineTypeField(self, ctx:LLVMParser.DiSubroutineTypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diDerivedType.
    def visitDiDerivedType(self, ctx:LLVMParser.DiDerivedTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diDerivedTypeFields.
    def visitDiDerivedTypeFields(self, ctx:LLVMParser.DiDerivedTypeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diDerivedTypeFieldList.
    def visitDiDerivedTypeFieldList(self, ctx:LLVMParser.DiDerivedTypeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diDerivedTypeField.
    def visitDiDerivedTypeField(self, ctx:LLVMParser.DiDerivedTypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompositeType.
    def visitDiCompositeType(self, ctx:LLVMParser.DiCompositeTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompositeTypeFields.
    def visitDiCompositeTypeFields(self, ctx:LLVMParser.DiCompositeTypeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompositeTypeFieldList.
    def visitDiCompositeTypeFieldList(self, ctx:LLVMParser.DiCompositeTypeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diCompositeTypeField.
    def visitDiCompositeTypeField(self, ctx:LLVMParser.DiCompositeTypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubrange.
    def visitDiSubrange(self, ctx:LLVMParser.DiSubrangeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubrangeFields.
    def visitDiSubrangeFields(self, ctx:LLVMParser.DiSubrangeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubrangeFieldList.
    def visitDiSubrangeFieldList(self, ctx:LLVMParser.DiSubrangeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubrangeField.
    def visitDiSubrangeField(self, ctx:LLVMParser.DiSubrangeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diEnumerator.
    def visitDiEnumerator(self, ctx:LLVMParser.DiEnumeratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diEnumeratorFields.
    def visitDiEnumeratorFields(self, ctx:LLVMParser.DiEnumeratorFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diEnumeratorFieldList.
    def visitDiEnumeratorFieldList(self, ctx:LLVMParser.DiEnumeratorFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diEnumeratorField.
    def visitDiEnumeratorField(self, ctx:LLVMParser.DiEnumeratorFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateTypeParameter.
    def visitDiTemplateTypeParameter(self, ctx:LLVMParser.DiTemplateTypeParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateTypeParameterFields.
    def visitDiTemplateTypeParameterFields(self, ctx:LLVMParser.DiTemplateTypeParameterFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateTypeParameterFieldList.
    def visitDiTemplateTypeParameterFieldList(self, ctx:LLVMParser.DiTemplateTypeParameterFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateTypeParameterField.
    def visitDiTemplateTypeParameterField(self, ctx:LLVMParser.DiTemplateTypeParameterFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateValueParameter.
    def visitDiTemplateValueParameter(self, ctx:LLVMParser.DiTemplateValueParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateValueParameterFields.
    def visitDiTemplateValueParameterFields(self, ctx:LLVMParser.DiTemplateValueParameterFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateValueParameterFieldList.
    def visitDiTemplateValueParameterFieldList(self, ctx:LLVMParser.DiTemplateValueParameterFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diTemplateValueParameterField.
    def visitDiTemplateValueParameterField(self, ctx:LLVMParser.DiTemplateValueParameterFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diModule.
    def visitDiModule(self, ctx:LLVMParser.DiModuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diModuleFields.
    def visitDiModuleFields(self, ctx:LLVMParser.DiModuleFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diModuleFieldList.
    def visitDiModuleFieldList(self, ctx:LLVMParser.DiModuleFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diModuleField.
    def visitDiModuleField(self, ctx:LLVMParser.DiModuleFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diNamespace.
    def visitDiNamespace(self, ctx:LLVMParser.DiNamespaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diNamespaceFields.
    def visitDiNamespaceFields(self, ctx:LLVMParser.DiNamespaceFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diNamespaceFieldList.
    def visitDiNamespaceFieldList(self, ctx:LLVMParser.DiNamespaceFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diNamespaceField.
    def visitDiNamespaceField(self, ctx:LLVMParser.DiNamespaceFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariable.
    def visitDiGlobalVariable(self, ctx:LLVMParser.DiGlobalVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableFields.
    def visitDiGlobalVariableFields(self, ctx:LLVMParser.DiGlobalVariableFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableFieldList.
    def visitDiGlobalVariableFieldList(self, ctx:LLVMParser.DiGlobalVariableFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableField.
    def visitDiGlobalVariableField(self, ctx:LLVMParser.DiGlobalVariableFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubprogram.
    def visitDiSubprogram(self, ctx:LLVMParser.DiSubprogramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubprogramFields.
    def visitDiSubprogramFields(self, ctx:LLVMParser.DiSubprogramFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubprogramFieldList.
    def visitDiSubprogramFieldList(self, ctx:LLVMParser.DiSubprogramFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diSubprogramField.
    def visitDiSubprogramField(self, ctx:LLVMParser.DiSubprogramFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlock.
    def visitDiLexicalBlock(self, ctx:LLVMParser.DiLexicalBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFields.
    def visitDiLexicalBlockFields(self, ctx:LLVMParser.DiLexicalBlockFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFieldList.
    def visitDiLexicalBlockFieldList(self, ctx:LLVMParser.DiLexicalBlockFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockField.
    def visitDiLexicalBlockField(self, ctx:LLVMParser.DiLexicalBlockFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFile.
    def visitDiLexicalBlockFile(self, ctx:LLVMParser.DiLexicalBlockFileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFileFields.
    def visitDiLexicalBlockFileFields(self, ctx:LLVMParser.DiLexicalBlockFileFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFileFieldList.
    def visitDiLexicalBlockFileFieldList(self, ctx:LLVMParser.DiLexicalBlockFileFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLexicalBlockFileField.
    def visitDiLexicalBlockFileField(self, ctx:LLVMParser.DiLexicalBlockFileFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocation.
    def visitDiLocation(self, ctx:LLVMParser.DiLocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocationFields.
    def visitDiLocationFields(self, ctx:LLVMParser.DiLocationFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocationFieldList.
    def visitDiLocationFieldList(self, ctx:LLVMParser.DiLocationFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocationField.
    def visitDiLocationField(self, ctx:LLVMParser.DiLocationFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocalVariable.
    def visitDiLocalVariable(self, ctx:LLVMParser.DiLocalVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocalVariableFields.
    def visitDiLocalVariableFields(self, ctx:LLVMParser.DiLocalVariableFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocalVariableFieldList.
    def visitDiLocalVariableFieldList(self, ctx:LLVMParser.DiLocalVariableFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diLocalVariableField.
    def visitDiLocalVariableField(self, ctx:LLVMParser.DiLocalVariableFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diExpression.
    def visitDiExpression(self, ctx:LLVMParser.DiExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diExpressionFields.
    def visitDiExpressionFields(self, ctx:LLVMParser.DiExpressionFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diExpressionFieldList.
    def visitDiExpressionFieldList(self, ctx:LLVMParser.DiExpressionFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diExpressionField.
    def visitDiExpressionField(self, ctx:LLVMParser.DiExpressionFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableExpression.
    def visitDiGlobalVariableExpression(self, ctx:LLVMParser.DiGlobalVariableExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableExpressionFields.
    def visitDiGlobalVariableExpressionFields(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableExpressionFieldList.
    def visitDiGlobalVariableExpressionFieldList(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diGlobalVariableExpressionField.
    def visitDiGlobalVariableExpressionField(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diObjCProperty.
    def visitDiObjCProperty(self, ctx:LLVMParser.DiObjCPropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diObjCPropertyFields.
    def visitDiObjCPropertyFields(self, ctx:LLVMParser.DiObjCPropertyFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diObjCPropertyFieldList.
    def visitDiObjCPropertyFieldList(self, ctx:LLVMParser.DiObjCPropertyFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diObjCPropertyField.
    def visitDiObjCPropertyField(self, ctx:LLVMParser.DiObjCPropertyFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diImportedEntity.
    def visitDiImportedEntity(self, ctx:LLVMParser.DiImportedEntityContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diImportedEntityFields.
    def visitDiImportedEntityFields(self, ctx:LLVMParser.DiImportedEntityFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diImportedEntityFieldList.
    def visitDiImportedEntityFieldList(self, ctx:LLVMParser.DiImportedEntityFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diImportedEntityField.
    def visitDiImportedEntityField(self, ctx:LLVMParser.DiImportedEntityFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacro.
    def visitDiMacro(self, ctx:LLVMParser.DiMacroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFields.
    def visitDiMacroFields(self, ctx:LLVMParser.DiMacroFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFieldList.
    def visitDiMacroFieldList(self, ctx:LLVMParser.DiMacroFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroField.
    def visitDiMacroField(self, ctx:LLVMParser.DiMacroFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFile.
    def visitDiMacroFile(self, ctx:LLVMParser.DiMacroFileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFileFields.
    def visitDiMacroFileFields(self, ctx:LLVMParser.DiMacroFileFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFileFieldList.
    def visitDiMacroFileFieldList(self, ctx:LLVMParser.DiMacroFileFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diMacroFileField.
    def visitDiMacroFileField(self, ctx:LLVMParser.DiMacroFileFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#genericDINode.
    def visitGenericDINode(self, ctx:LLVMParser.GenericDINodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#genericDINodeFields.
    def visitGenericDINodeFields(self, ctx:LLVMParser.GenericDINodeFieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#genericDINodeFieldList.
    def visitGenericDINodeFieldList(self, ctx:LLVMParser.GenericDINodeFieldListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#genericDINodeField.
    def visitGenericDINodeField(self, ctx:LLVMParser.GenericDINodeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fileField.
    def visitFileField(self, ctx:LLVMParser.FileFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#isOptimizedField.
    def visitIsOptimizedField(self, ctx:LLVMParser.IsOptimizedFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#tagField.
    def visitTagField(self, ctx:LLVMParser.TagFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#nameField.
    def visitNameField(self, ctx:LLVMParser.NameFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#sizeField.
    def visitSizeField(self, ctx:LLVMParser.SizeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#alignField.
    def visitAlignField(self, ctx:LLVMParser.AlignFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#flagsField.
    def visitFlagsField(self, ctx:LLVMParser.FlagsFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#lineField.
    def visitLineField(self, ctx:LLVMParser.LineFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#scopeField.
    def visitScopeField(self, ctx:LLVMParser.ScopeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#baseTypeField.
    def visitBaseTypeField(self, ctx:LLVMParser.BaseTypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#offsetField.
    def visitOffsetField(self, ctx:LLVMParser.OffsetFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#templateParamsField.
    def visitTemplateParamsField(self, ctx:LLVMParser.TemplateParamsFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#intOrMDField.
    def visitIntOrMDField(self, ctx:LLVMParser.IntOrMDFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeField.
    def visitTypeField(self, ctx:LLVMParser.TypeFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#linkageNameField.
    def visitLinkageNameField(self, ctx:LLVMParser.LinkageNameFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#isLocalField.
    def visitIsLocalField(self, ctx:LLVMParser.IsLocalFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#isDefinitionField.
    def visitIsDefinitionField(self, ctx:LLVMParser.IsDefinitionFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#declarationField.
    def visitDeclarationField(self, ctx:LLVMParser.DeclarationFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#columnField.
    def visitColumnField(self, ctx:LLVMParser.ColumnFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeMacinfoField.
    def visitTypeMacinfoField(self, ctx:LLVMParser.TypeMacinfoFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#checksumkind.
    def visitChecksumkind(self, ctx:LLVMParser.ChecksumkindContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFlagList.
    def visitDiFlagList(self, ctx:LLVMParser.DiFlagListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#diFlag.
    def visitDiFlag(self, ctx:LLVMParser.DiFlagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfAttEncoding.
    def visitDwarfAttEncoding(self, ctx:LLVMParser.DwarfAttEncodingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfCC.
    def visitDwarfCC(self, ctx:LLVMParser.DwarfCCContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfLang.
    def visitDwarfLang(self, ctx:LLVMParser.DwarfLangContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfMacinfo.
    def visitDwarfMacinfo(self, ctx:LLVMParser.DwarfMacinfoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfOp.
    def visitDwarfOp(self, ctx:LLVMParser.DwarfOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfTag.
    def visitDwarfTag(self, ctx:LLVMParser.DwarfTagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dwarfVirtuality.
    def visitDwarfVirtuality(self, ctx:LLVMParser.DwarfVirtualityContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#emissionKind.
    def visitEmissionKind(self, ctx:LLVMParser.EmissionKindContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeValues.
    def visitTypeValues(self, ctx:LLVMParser.TypeValuesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeValueList.
    def visitTypeValueList(self, ctx:LLVMParser.TypeValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#commaSepTypeValueList.
    def visitCommaSepTypeValueList(self, ctx:LLVMParser.CommaSepTypeValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeValue.
    def visitTypeValue(self, ctx:LLVMParser.TypeValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeConsts.
    def visitTypeConsts(self, ctx:LLVMParser.TypeConstsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeConstList.
    def visitTypeConstList(self, ctx:LLVMParser.TypeConstListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#typeConst.
    def visitTypeConst(self, ctx:LLVMParser.TypeConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#alignment.
    def visitAlignment(self, ctx:LLVMParser.AlignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#allocSize.
    def visitAllocSize(self, ctx:LLVMParser.AllocSizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#args.
    def visitArgs(self, ctx:LLVMParser.ArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#argList.
    def visitArgList(self, ctx:LLVMParser.ArgListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#arg.
    def visitArg(self, ctx:LLVMParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#atomicOrdering.
    def visitAtomicOrdering(self, ctx:LLVMParser.AtomicOrderingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optCallingConv.
    def visitOptCallingConv(self, ctx:LLVMParser.OptCallingConvContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#callingConv.
    def visitCallingConv(self, ctx:LLVMParser.CallingConvContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optComdat.
    def visitOptComdat(self, ctx:LLVMParser.OptComdatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#comdat.
    def visitComdat(self, ctx:LLVMParser.ComdatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dereferenceable.
    def visitDereferenceable(self, ctx:LLVMParser.DereferenceableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optDLLStorageClass.
    def visitOptDLLStorageClass(self, ctx:LLVMParser.OptDLLStorageClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#dllStorageClass.
    def visitDllStorageClass(self, ctx:LLVMParser.DllStorageClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optExact.
    def visitOptExact(self, ctx:LLVMParser.OptExactContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#exceptionArgs.
    def visitExceptionArgs(self, ctx:LLVMParser.ExceptionArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#exceptionArgList.
    def visitExceptionArgList(self, ctx:LLVMParser.ExceptionArgListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#exceptionArg.
    def visitExceptionArg(self, ctx:LLVMParser.ExceptionArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#exceptionScope.
    def visitExceptionScope(self, ctx:LLVMParser.ExceptionScopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fastMathFlags.
    def visitFastMathFlags(self, ctx:LLVMParser.FastMathFlagsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fastMathFlagList.
    def visitFastMathFlagList(self, ctx:LLVMParser.FastMathFlagListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fastMathFlag.
    def visitFastMathFlag(self, ctx:LLVMParser.FastMathFlagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#fpred.
    def visitFpred(self, ctx:LLVMParser.FpredContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#funcAttrs.
    def visitFuncAttrs(self, ctx:LLVMParser.FuncAttrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#funcAttrList.
    def visitFuncAttrList(self, ctx:LLVMParser.FuncAttrListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#funcAttr.
    def visitFuncAttr(self, ctx:LLVMParser.FuncAttrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optInBounds.
    def visitOptInBounds(self, ctx:LLVMParser.OptInBoundsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#indices.
    def visitIndices(self, ctx:LLVMParser.IndicesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#indexList.
    def visitIndexList(self, ctx:LLVMParser.IndexListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#index.
    def visitIndex(self, ctx:LLVMParser.IndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#iPred.
    def visitIPred(self, ctx:LLVMParser.IPredContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optLinkage.
    def visitOptLinkage(self, ctx:LLVMParser.OptLinkageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#linkage.
    def visitLinkage(self, ctx:LLVMParser.LinkageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optExternLinkage.
    def visitOptExternLinkage(self, ctx:LLVMParser.OptExternLinkageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#externLinkage.
    def visitExternLinkage(self, ctx:LLVMParser.ExternLinkageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#operandBundles.
    def visitOperandBundles(self, ctx:LLVMParser.OperandBundlesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#operandBundleList.
    def visitOperandBundleList(self, ctx:LLVMParser.OperandBundleListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#operandBundle.
    def visitOperandBundle(self, ctx:LLVMParser.OperandBundleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#overflowFlags.
    def visitOverflowFlags(self, ctx:LLVMParser.OverflowFlagsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#overflowFlagList.
    def visitOverflowFlagList(self, ctx:LLVMParser.OverflowFlagListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#overflowFlag.
    def visitOverflowFlag(self, ctx:LLVMParser.OverflowFlagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#paramAttrs.
    def visitParamAttrs(self, ctx:LLVMParser.ParamAttrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#paramAttrList.
    def visitParamAttrList(self, ctx:LLVMParser.ParamAttrListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#paramAttr.
    def visitParamAttr(self, ctx:LLVMParser.ParamAttrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#params.
    def visitParams(self, ctx:LLVMParser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#paramList.
    def visitParamList(self, ctx:LLVMParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#param.
    def visitParam(self, ctx:LLVMParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optPreemptionSpecifier.
    def visitOptPreemptionSpecifier(self, ctx:LLVMParser.OptPreemptionSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#preemptionSpecifier.
    def visitPreemptionSpecifier(self, ctx:LLVMParser.PreemptionSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#returnAttrs.
    def visitReturnAttrs(self, ctx:LLVMParser.ReturnAttrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#returnAttrList.
    def visitReturnAttrList(self, ctx:LLVMParser.ReturnAttrListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#returnAttr.
    def visitReturnAttr(self, ctx:LLVMParser.ReturnAttrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#section.
    def visitSection(self, ctx:LLVMParser.SectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#stackAlignment.
    def visitStackAlignment(self, ctx:LLVMParser.StackAlignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#optSyncScope.
    def visitOptSyncScope(self, ctx:LLVMParser.OptSyncScopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#threadLocal.
    def visitThreadLocal(self, ctx:LLVMParser.ThreadLocalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#tlsModel.
    def visitTlsModel(self, ctx:LLVMParser.TlsModelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#unnamedAddr.
    def visitUnnamedAddr(self, ctx:LLVMParser.UnnamedAddrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LLVMParser#visibility.
    def visitVisibility(self, ctx:LLVMParser.VisibilityContext):
        return self.visitChildren(ctx)



del LLVMParser