# Generated from LLVMParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LLVMParser import LLVMParser
else:
    from LLVMParser import LLVMParser

# This class defines a complete listener for a parse tree produced by LLVMParser.
class LLVMParserListener(ParseTreeListener):

    # Enter a parse tree produced by LLVMParser#mySingleInstruction.
    def enterMySingleInstruction(self, ctx:LLVMParser.MySingleInstructionContext):
        pass

    # Exit a parse tree produced by LLVMParser#mySingleInstruction.
    def exitMySingleInstruction(self, ctx:LLVMParser.MySingleInstructionContext):
        pass


    # Enter a parse tree produced by LLVMParser#module.
    def enterModule(self, ctx:LLVMParser.ModuleContext):
        pass

    # Exit a parse tree produced by LLVMParser#module.
    def exitModule(self, ctx:LLVMParser.ModuleContext):
        pass


    # Enter a parse tree produced by LLVMParser#topLevelEntities.
    def enterTopLevelEntities(self, ctx:LLVMParser.TopLevelEntitiesContext):
        pass

    # Exit a parse tree produced by LLVMParser#topLevelEntities.
    def exitTopLevelEntities(self, ctx:LLVMParser.TopLevelEntitiesContext):
        pass


    # Enter a parse tree produced by LLVMParser#topLevelEntityList.
    def enterTopLevelEntityList(self, ctx:LLVMParser.TopLevelEntityListContext):
        pass

    # Exit a parse tree produced by LLVMParser#topLevelEntityList.
    def exitTopLevelEntityList(self, ctx:LLVMParser.TopLevelEntityListContext):
        pass


    # Enter a parse tree produced by LLVMParser#topLevelEntity.
    def enterTopLevelEntity(self, ctx:LLVMParser.TopLevelEntityContext):
        pass

    # Exit a parse tree produced by LLVMParser#topLevelEntity.
    def exitTopLevelEntity(self, ctx:LLVMParser.TopLevelEntityContext):
        pass


    # Enter a parse tree produced by LLVMParser#sourceFilename.
    def enterSourceFilename(self, ctx:LLVMParser.SourceFilenameContext):
        pass

    # Exit a parse tree produced by LLVMParser#sourceFilename.
    def exitSourceFilename(self, ctx:LLVMParser.SourceFilenameContext):
        pass


    # Enter a parse tree produced by LLVMParser#targetDefinition.
    def enterTargetDefinition(self, ctx:LLVMParser.TargetDefinitionContext):
        pass

    # Exit a parse tree produced by LLVMParser#targetDefinition.
    def exitTargetDefinition(self, ctx:LLVMParser.TargetDefinitionContext):
        pass


    # Enter a parse tree produced by LLVMParser#moduleAsm.
    def enterModuleAsm(self, ctx:LLVMParser.ModuleAsmContext):
        pass

    # Exit a parse tree produced by LLVMParser#moduleAsm.
    def exitModuleAsm(self, ctx:LLVMParser.ModuleAsmContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeDef.
    def enterTypeDef(self, ctx:LLVMParser.TypeDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeDef.
    def exitTypeDef(self, ctx:LLVMParser.TypeDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#comdatDef.
    def enterComdatDef(self, ctx:LLVMParser.ComdatDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#comdatDef.
    def exitComdatDef(self, ctx:LLVMParser.ComdatDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#selectionKind.
    def enterSelectionKind(self, ctx:LLVMParser.SelectionKindContext):
        pass

    # Exit a parse tree produced by LLVMParser#selectionKind.
    def exitSelectionKind(self, ctx:LLVMParser.SelectionKindContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalDecl.
    def enterGlobalDecl(self, ctx:LLVMParser.GlobalDeclContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalDecl.
    def exitGlobalDecl(self, ctx:LLVMParser.GlobalDeclContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalDef.
    def enterGlobalDef(self, ctx:LLVMParser.GlobalDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalDef.
    def exitGlobalDef(self, ctx:LLVMParser.GlobalDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#optExternallyInitialized.
    def enterOptExternallyInitialized(self, ctx:LLVMParser.OptExternallyInitializedContext):
        pass

    # Exit a parse tree produced by LLVMParser#optExternallyInitialized.
    def exitOptExternallyInitialized(self, ctx:LLVMParser.OptExternallyInitializedContext):
        pass


    # Enter a parse tree produced by LLVMParser#immutable.
    def enterImmutable(self, ctx:LLVMParser.ImmutableContext):
        pass

    # Exit a parse tree produced by LLVMParser#immutable.
    def exitImmutable(self, ctx:LLVMParser.ImmutableContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalAttrs.
    def enterGlobalAttrs(self, ctx:LLVMParser.GlobalAttrsContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalAttrs.
    def exitGlobalAttrs(self, ctx:LLVMParser.GlobalAttrsContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalAttrList.
    def enterGlobalAttrList(self, ctx:LLVMParser.GlobalAttrListContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalAttrList.
    def exitGlobalAttrList(self, ctx:LLVMParser.GlobalAttrListContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalAttr.
    def enterGlobalAttr(self, ctx:LLVMParser.GlobalAttrContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalAttr.
    def exitGlobalAttr(self, ctx:LLVMParser.GlobalAttrContext):
        pass


    # Enter a parse tree produced by LLVMParser#indirectSymbolDef.
    def enterIndirectSymbolDef(self, ctx:LLVMParser.IndirectSymbolDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#indirectSymbolDef.
    def exitIndirectSymbolDef(self, ctx:LLVMParser.IndirectSymbolDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#alias.
    def enterAlias(self, ctx:LLVMParser.AliasContext):
        pass

    # Exit a parse tree produced by LLVMParser#alias.
    def exitAlias(self, ctx:LLVMParser.AliasContext):
        pass


    # Enter a parse tree produced by LLVMParser#functionDecl.
    def enterFunctionDecl(self, ctx:LLVMParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by LLVMParser#functionDecl.
    def exitFunctionDecl(self, ctx:LLVMParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by LLVMParser#functionDef.
    def enterFunctionDef(self, ctx:LLVMParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#functionDef.
    def exitFunctionDef(self, ctx:LLVMParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#functionHeader.
    def enterFunctionHeader(self, ctx:LLVMParser.FunctionHeaderContext):
        pass

    # Exit a parse tree produced by LLVMParser#functionHeader.
    def exitFunctionHeader(self, ctx:LLVMParser.FunctionHeaderContext):
        pass


    # Enter a parse tree produced by LLVMParser#optGC.
    def enterOptGC(self, ctx:LLVMParser.OptGCContext):
        pass

    # Exit a parse tree produced by LLVMParser#optGC.
    def exitOptGC(self, ctx:LLVMParser.OptGCContext):
        pass


    # Enter a parse tree produced by LLVMParser#optPrefix.
    def enterOptPrefix(self, ctx:LLVMParser.OptPrefixContext):
        pass

    # Exit a parse tree produced by LLVMParser#optPrefix.
    def exitOptPrefix(self, ctx:LLVMParser.OptPrefixContext):
        pass


    # Enter a parse tree produced by LLVMParser#optPrologue.
    def enterOptPrologue(self, ctx:LLVMParser.OptPrologueContext):
        pass

    # Exit a parse tree produced by LLVMParser#optPrologue.
    def exitOptPrologue(self, ctx:LLVMParser.OptPrologueContext):
        pass


    # Enter a parse tree produced by LLVMParser#optPersonality.
    def enterOptPersonality(self, ctx:LLVMParser.OptPersonalityContext):
        pass

    # Exit a parse tree produced by LLVMParser#optPersonality.
    def exitOptPersonality(self, ctx:LLVMParser.OptPersonalityContext):
        pass


    # Enter a parse tree produced by LLVMParser#functionBody.
    def enterFunctionBody(self, ctx:LLVMParser.FunctionBodyContext):
        pass

    # Exit a parse tree produced by LLVMParser#functionBody.
    def exitFunctionBody(self, ctx:LLVMParser.FunctionBodyContext):
        pass


    # Enter a parse tree produced by LLVMParser#attrGroupDef.
    def enterAttrGroupDef(self, ctx:LLVMParser.AttrGroupDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#attrGroupDef.
    def exitAttrGroupDef(self, ctx:LLVMParser.AttrGroupDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#namedMetadataDef.
    def enterNamedMetadataDef(self, ctx:LLVMParser.NamedMetadataDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#namedMetadataDef.
    def exitNamedMetadataDef(self, ctx:LLVMParser.NamedMetadataDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataNodes.
    def enterMetadataNodes(self, ctx:LLVMParser.MetadataNodesContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataNodes.
    def exitMetadataNodes(self, ctx:LLVMParser.MetadataNodesContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataNodeList.
    def enterMetadataNodeList(self, ctx:LLVMParser.MetadataNodeListContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataNodeList.
    def exitMetadataNodeList(self, ctx:LLVMParser.MetadataNodeListContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataNode.
    def enterMetadataNode(self, ctx:LLVMParser.MetadataNodeContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataNode.
    def exitMetadataNode(self, ctx:LLVMParser.MetadataNodeContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataDef.
    def enterMetadataDef(self, ctx:LLVMParser.MetadataDefContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataDef.
    def exitMetadataDef(self, ctx:LLVMParser.MetadataDefContext):
        pass


    # Enter a parse tree produced by LLVMParser#optDistinct.
    def enterOptDistinct(self, ctx:LLVMParser.OptDistinctContext):
        pass

    # Exit a parse tree produced by LLVMParser#optDistinct.
    def exitOptDistinct(self, ctx:LLVMParser.OptDistinctContext):
        pass


    # Enter a parse tree produced by LLVMParser#useListOrders.
    def enterUseListOrders(self, ctx:LLVMParser.UseListOrdersContext):
        pass

    # Exit a parse tree produced by LLVMParser#useListOrders.
    def exitUseListOrders(self, ctx:LLVMParser.UseListOrdersContext):
        pass


    # Enter a parse tree produced by LLVMParser#useListOrderList.
    def enterUseListOrderList(self, ctx:LLVMParser.UseListOrderListContext):
        pass

    # Exit a parse tree produced by LLVMParser#useListOrderList.
    def exitUseListOrderList(self, ctx:LLVMParser.UseListOrderListContext):
        pass


    # Enter a parse tree produced by LLVMParser#useListOrder.
    def enterUseListOrder(self, ctx:LLVMParser.UseListOrderContext):
        pass

    # Exit a parse tree produced by LLVMParser#useListOrder.
    def exitUseListOrder(self, ctx:LLVMParser.UseListOrderContext):
        pass


    # Enter a parse tree produced by LLVMParser#useListOrderBB.
    def enterUseListOrderBB(self, ctx:LLVMParser.UseListOrderBBContext):
        pass

    # Exit a parse tree produced by LLVMParser#useListOrderBB.
    def exitUseListOrderBB(self, ctx:LLVMParser.UseListOrderBBContext):
        pass


    # Enter a parse tree produced by LLVMParser#globalIdent.
    def enterGlobalIdent(self, ctx:LLVMParser.GlobalIdentContext):
        pass

    # Exit a parse tree produced by LLVMParser#globalIdent.
    def exitGlobalIdent(self, ctx:LLVMParser.GlobalIdentContext):
        pass


    # Enter a parse tree produced by LLVMParser#localIdent.
    def enterLocalIdent(self, ctx:LLVMParser.LocalIdentContext):
        pass

    # Exit a parse tree produced by LLVMParser#localIdent.
    def exitLocalIdent(self, ctx:LLVMParser.LocalIdentContext):
        pass


    # Enter a parse tree produced by LLVMParser#labelIdent.
    def enterLabelIdent(self, ctx:LLVMParser.LabelIdentContext):
        pass

    # Exit a parse tree produced by LLVMParser#labelIdent.
    def exitLabelIdent(self, ctx:LLVMParser.LabelIdentContext):
        pass


    # Enter a parse tree produced by LLVMParser#attrGroupID.
    def enterAttrGroupID(self, ctx:LLVMParser.AttrGroupIDContext):
        pass

    # Exit a parse tree produced by LLVMParser#attrGroupID.
    def exitAttrGroupID(self, ctx:LLVMParser.AttrGroupIDContext):
        pass


    # Enter a parse tree produced by LLVMParser#comdatName.
    def enterComdatName(self, ctx:LLVMParser.ComdatNameContext):
        pass

    # Exit a parse tree produced by LLVMParser#comdatName.
    def exitComdatName(self, ctx:LLVMParser.ComdatNameContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataName.
    def enterMetadataName(self, ctx:LLVMParser.MetadataNameContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataName.
    def exitMetadataName(self, ctx:LLVMParser.MetadataNameContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataID.
    def enterMetadataID(self, ctx:LLVMParser.MetadataIDContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataID.
    def exitMetadataID(self, ctx:LLVMParser.MetadataIDContext):
        pass


    # Enter a parse tree produced by LLVMParser#llvmType.
    def enterLlvmType(self, ctx:LLVMParser.LlvmTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#llvmType.
    def exitLlvmType(self, ctx:LLVMParser.LlvmTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#concreteNonRecType.
    def enterConcreteNonRecType(self, ctx:LLVMParser.ConcreteNonRecTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#concreteNonRecType.
    def exitConcreteNonRecType(self, ctx:LLVMParser.ConcreteNonRecTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#voidType.
    def enterVoidType(self, ctx:LLVMParser.VoidTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#voidType.
    def exitVoidType(self, ctx:LLVMParser.VoidTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#intType.
    def enterIntType(self, ctx:LLVMParser.IntTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#intType.
    def exitIntType(self, ctx:LLVMParser.IntTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#floatType.
    def enterFloatType(self, ctx:LLVMParser.FloatTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#floatType.
    def exitFloatType(self, ctx:LLVMParser.FloatTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#floatKind.
    def enterFloatKind(self, ctx:LLVMParser.FloatKindContext):
        pass

    # Exit a parse tree produced by LLVMParser#floatKind.
    def exitFloatKind(self, ctx:LLVMParser.FloatKindContext):
        pass


    # Enter a parse tree produced by LLVMParser#mmxType.
    def enterMmxType(self, ctx:LLVMParser.MmxTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#mmxType.
    def exitMmxType(self, ctx:LLVMParser.MmxTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#optAddrSpace.
    def enterOptAddrSpace(self, ctx:LLVMParser.OptAddrSpaceContext):
        pass

    # Exit a parse tree produced by LLVMParser#optAddrSpace.
    def exitOptAddrSpace(self, ctx:LLVMParser.OptAddrSpaceContext):
        pass


    # Enter a parse tree produced by LLVMParser#addrSpace.
    def enterAddrSpace(self, ctx:LLVMParser.AddrSpaceContext):
        pass

    # Exit a parse tree produced by LLVMParser#addrSpace.
    def exitAddrSpace(self, ctx:LLVMParser.AddrSpaceContext):
        pass


    # Enter a parse tree produced by LLVMParser#vectorType.
    def enterVectorType(self, ctx:LLVMParser.VectorTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#vectorType.
    def exitVectorType(self, ctx:LLVMParser.VectorTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#labelType.
    def enterLabelType(self, ctx:LLVMParser.LabelTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#labelType.
    def exitLabelType(self, ctx:LLVMParser.LabelTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#tokenType.
    def enterTokenType(self, ctx:LLVMParser.TokenTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#tokenType.
    def exitTokenType(self, ctx:LLVMParser.TokenTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataType.
    def enterMetadataType(self, ctx:LLVMParser.MetadataTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataType.
    def exitMetadataType(self, ctx:LLVMParser.MetadataTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#arrayType.
    def enterArrayType(self, ctx:LLVMParser.ArrayTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#arrayType.
    def exitArrayType(self, ctx:LLVMParser.ArrayTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#structType.
    def enterStructType(self, ctx:LLVMParser.StructTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#structType.
    def exitStructType(self, ctx:LLVMParser.StructTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeList.
    def enterTypeList(self, ctx:LLVMParser.TypeListContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeList.
    def exitTypeList(self, ctx:LLVMParser.TypeListContext):
        pass


    # Enter a parse tree produced by LLVMParser#opaqueType.
    def enterOpaqueType(self, ctx:LLVMParser.OpaqueTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#opaqueType.
    def exitOpaqueType(self, ctx:LLVMParser.OpaqueTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#namedType.
    def enterNamedType(self, ctx:LLVMParser.NamedTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#namedType.
    def exitNamedType(self, ctx:LLVMParser.NamedTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#value.
    def enterValue(self, ctx:LLVMParser.ValueContext):
        pass

    # Exit a parse tree produced by LLVMParser#value.
    def exitValue(self, ctx:LLVMParser.ValueContext):
        pass


    # Enter a parse tree produced by LLVMParser#inlineAsm.
    def enterInlineAsm(self, ctx:LLVMParser.InlineAsmContext):
        pass

    # Exit a parse tree produced by LLVMParser#inlineAsm.
    def exitInlineAsm(self, ctx:LLVMParser.InlineAsmContext):
        pass


    # Enter a parse tree produced by LLVMParser#optSideEffect.
    def enterOptSideEffect(self, ctx:LLVMParser.OptSideEffectContext):
        pass

    # Exit a parse tree produced by LLVMParser#optSideEffect.
    def exitOptSideEffect(self, ctx:LLVMParser.OptSideEffectContext):
        pass


    # Enter a parse tree produced by LLVMParser#optAlignStack.
    def enterOptAlignStack(self, ctx:LLVMParser.OptAlignStackContext):
        pass

    # Exit a parse tree produced by LLVMParser#optAlignStack.
    def exitOptAlignStack(self, ctx:LLVMParser.OptAlignStackContext):
        pass


    # Enter a parse tree produced by LLVMParser#optIntelDialect.
    def enterOptIntelDialect(self, ctx:LLVMParser.OptIntelDialectContext):
        pass

    # Exit a parse tree produced by LLVMParser#optIntelDialect.
    def exitOptIntelDialect(self, ctx:LLVMParser.OptIntelDialectContext):
        pass


    # Enter a parse tree produced by LLVMParser#constant.
    def enterConstant(self, ctx:LLVMParser.ConstantContext):
        pass

    # Exit a parse tree produced by LLVMParser#constant.
    def exitConstant(self, ctx:LLVMParser.ConstantContext):
        pass


    # Enter a parse tree produced by LLVMParser#boolConst.
    def enterBoolConst(self, ctx:LLVMParser.BoolConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#boolConst.
    def exitBoolConst(self, ctx:LLVMParser.BoolConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#boolLit.
    def enterBoolLit(self, ctx:LLVMParser.BoolLitContext):
        pass

    # Exit a parse tree produced by LLVMParser#boolLit.
    def exitBoolLit(self, ctx:LLVMParser.BoolLitContext):
        pass


    # Enter a parse tree produced by LLVMParser#intConst.
    def enterIntConst(self, ctx:LLVMParser.IntConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#intConst.
    def exitIntConst(self, ctx:LLVMParser.IntConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#intLit.
    def enterIntLit(self, ctx:LLVMParser.IntLitContext):
        pass

    # Exit a parse tree produced by LLVMParser#intLit.
    def exitIntLit(self, ctx:LLVMParser.IntLitContext):
        pass


    # Enter a parse tree produced by LLVMParser#floatConst.
    def enterFloatConst(self, ctx:LLVMParser.FloatConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#floatConst.
    def exitFloatConst(self, ctx:LLVMParser.FloatConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#nullConst.
    def enterNullConst(self, ctx:LLVMParser.NullConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#nullConst.
    def exitNullConst(self, ctx:LLVMParser.NullConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#noneConst.
    def enterNoneConst(self, ctx:LLVMParser.NoneConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#noneConst.
    def exitNoneConst(self, ctx:LLVMParser.NoneConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#structConst.
    def enterStructConst(self, ctx:LLVMParser.StructConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#structConst.
    def exitStructConst(self, ctx:LLVMParser.StructConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#arrayConst.
    def enterArrayConst(self, ctx:LLVMParser.ArrayConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#arrayConst.
    def exitArrayConst(self, ctx:LLVMParser.ArrayConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#charArrayConst.
    def enterCharArrayConst(self, ctx:LLVMParser.CharArrayConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#charArrayConst.
    def exitCharArrayConst(self, ctx:LLVMParser.CharArrayConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#stringLit.
    def enterStringLit(self, ctx:LLVMParser.StringLitContext):
        pass

    # Exit a parse tree produced by LLVMParser#stringLit.
    def exitStringLit(self, ctx:LLVMParser.StringLitContext):
        pass


    # Enter a parse tree produced by LLVMParser#vectorConst.
    def enterVectorConst(self, ctx:LLVMParser.VectorConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#vectorConst.
    def exitVectorConst(self, ctx:LLVMParser.VectorConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#zeroInitializerConst.
    def enterZeroInitializerConst(self, ctx:LLVMParser.ZeroInitializerConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#zeroInitializerConst.
    def exitZeroInitializerConst(self, ctx:LLVMParser.ZeroInitializerConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#undefConst.
    def enterUndefConst(self, ctx:LLVMParser.UndefConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#undefConst.
    def exitUndefConst(self, ctx:LLVMParser.UndefConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#blockAddressConst.
    def enterBlockAddressConst(self, ctx:LLVMParser.BlockAddressConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#blockAddressConst.
    def exitBlockAddressConst(self, ctx:LLVMParser.BlockAddressConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#constantExpr.
    def enterConstantExpr(self, ctx:LLVMParser.ConstantExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#constantExpr.
    def exitConstantExpr(self, ctx:LLVMParser.ConstantExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#addExpr.
    def enterAddExpr(self, ctx:LLVMParser.AddExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#addExpr.
    def exitAddExpr(self, ctx:LLVMParser.AddExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fAddExpr.
    def enterFAddExpr(self, ctx:LLVMParser.FAddExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fAddExpr.
    def exitFAddExpr(self, ctx:LLVMParser.FAddExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#subExpr.
    def enterSubExpr(self, ctx:LLVMParser.SubExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#subExpr.
    def exitSubExpr(self, ctx:LLVMParser.SubExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fSubExpr.
    def enterFSubExpr(self, ctx:LLVMParser.FSubExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fSubExpr.
    def exitFSubExpr(self, ctx:LLVMParser.FSubExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#mulExpr.
    def enterMulExpr(self, ctx:LLVMParser.MulExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#mulExpr.
    def exitMulExpr(self, ctx:LLVMParser.MulExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fMulExpr.
    def enterFMulExpr(self, ctx:LLVMParser.FMulExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fMulExpr.
    def exitFMulExpr(self, ctx:LLVMParser.FMulExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#uDivExpr.
    def enterUDivExpr(self, ctx:LLVMParser.UDivExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#uDivExpr.
    def exitUDivExpr(self, ctx:LLVMParser.UDivExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#sDivExpr.
    def enterSDivExpr(self, ctx:LLVMParser.SDivExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#sDivExpr.
    def exitSDivExpr(self, ctx:LLVMParser.SDivExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fDivExpr.
    def enterFDivExpr(self, ctx:LLVMParser.FDivExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fDivExpr.
    def exitFDivExpr(self, ctx:LLVMParser.FDivExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#uRemExpr.
    def enterURemExpr(self, ctx:LLVMParser.URemExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#uRemExpr.
    def exitURemExpr(self, ctx:LLVMParser.URemExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#sRemExpr.
    def enterSRemExpr(self, ctx:LLVMParser.SRemExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#sRemExpr.
    def exitSRemExpr(self, ctx:LLVMParser.SRemExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fRemExpr.
    def enterFRemExpr(self, ctx:LLVMParser.FRemExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fRemExpr.
    def exitFRemExpr(self, ctx:LLVMParser.FRemExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#shlExpr.
    def enterShlExpr(self, ctx:LLVMParser.ShlExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#shlExpr.
    def exitShlExpr(self, ctx:LLVMParser.ShlExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#lShrExpr.
    def enterLShrExpr(self, ctx:LLVMParser.LShrExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#lShrExpr.
    def exitLShrExpr(self, ctx:LLVMParser.LShrExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#ashrExpr.
    def enterAshrExpr(self, ctx:LLVMParser.AshrExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#ashrExpr.
    def exitAshrExpr(self, ctx:LLVMParser.AshrExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#andExpr.
    def enterAndExpr(self, ctx:LLVMParser.AndExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#andExpr.
    def exitAndExpr(self, ctx:LLVMParser.AndExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#orExpr.
    def enterOrExpr(self, ctx:LLVMParser.OrExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#orExpr.
    def exitOrExpr(self, ctx:LLVMParser.OrExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#xorExpr.
    def enterXorExpr(self, ctx:LLVMParser.XorExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#xorExpr.
    def exitXorExpr(self, ctx:LLVMParser.XorExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#extractElementExpr.
    def enterExtractElementExpr(self, ctx:LLVMParser.ExtractElementExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#extractElementExpr.
    def exitExtractElementExpr(self, ctx:LLVMParser.ExtractElementExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#insertElementExpr.
    def enterInsertElementExpr(self, ctx:LLVMParser.InsertElementExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#insertElementExpr.
    def exitInsertElementExpr(self, ctx:LLVMParser.InsertElementExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#shuffleVectorExpr.
    def enterShuffleVectorExpr(self, ctx:LLVMParser.ShuffleVectorExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#shuffleVectorExpr.
    def exitShuffleVectorExpr(self, ctx:LLVMParser.ShuffleVectorExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#extractValueExpr.
    def enterExtractValueExpr(self, ctx:LLVMParser.ExtractValueExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#extractValueExpr.
    def exitExtractValueExpr(self, ctx:LLVMParser.ExtractValueExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#insertValueExpr.
    def enterInsertValueExpr(self, ctx:LLVMParser.InsertValueExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#insertValueExpr.
    def exitInsertValueExpr(self, ctx:LLVMParser.InsertValueExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#getElementPtrExpr.
    def enterGetElementPtrExpr(self, ctx:LLVMParser.GetElementPtrExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#getElementPtrExpr.
    def exitGetElementPtrExpr(self, ctx:LLVMParser.GetElementPtrExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#gepConstIndices.
    def enterGepConstIndices(self, ctx:LLVMParser.GepConstIndicesContext):
        pass

    # Exit a parse tree produced by LLVMParser#gepConstIndices.
    def exitGepConstIndices(self, ctx:LLVMParser.GepConstIndicesContext):
        pass


    # Enter a parse tree produced by LLVMParser#gepConstIndexList.
    def enterGepConstIndexList(self, ctx:LLVMParser.GepConstIndexListContext):
        pass

    # Exit a parse tree produced by LLVMParser#gepConstIndexList.
    def exitGepConstIndexList(self, ctx:LLVMParser.GepConstIndexListContext):
        pass


    # Enter a parse tree produced by LLVMParser#gepConstIndex.
    def enterGepConstIndex(self, ctx:LLVMParser.GepConstIndexContext):
        pass

    # Exit a parse tree produced by LLVMParser#gepConstIndex.
    def exitGepConstIndex(self, ctx:LLVMParser.GepConstIndexContext):
        pass


    # Enter a parse tree produced by LLVMParser#optInrange.
    def enterOptInrange(self, ctx:LLVMParser.OptInrangeContext):
        pass

    # Exit a parse tree produced by LLVMParser#optInrange.
    def exitOptInrange(self, ctx:LLVMParser.OptInrangeContext):
        pass


    # Enter a parse tree produced by LLVMParser#truncExpr.
    def enterTruncExpr(self, ctx:LLVMParser.TruncExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#truncExpr.
    def exitTruncExpr(self, ctx:LLVMParser.TruncExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#zExtExpr.
    def enterZExtExpr(self, ctx:LLVMParser.ZExtExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#zExtExpr.
    def exitZExtExpr(self, ctx:LLVMParser.ZExtExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#sExtExpr.
    def enterSExtExpr(self, ctx:LLVMParser.SExtExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#sExtExpr.
    def exitSExtExpr(self, ctx:LLVMParser.SExtExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fPTruncExpr.
    def enterFPTruncExpr(self, ctx:LLVMParser.FPTruncExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fPTruncExpr.
    def exitFPTruncExpr(self, ctx:LLVMParser.FPTruncExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpExtExpr.
    def enterFpExtExpr(self, ctx:LLVMParser.FpExtExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpExtExpr.
    def exitFpExtExpr(self, ctx:LLVMParser.FpExtExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpToUIExpr.
    def enterFpToUIExpr(self, ctx:LLVMParser.FpToUIExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpToUIExpr.
    def exitFpToUIExpr(self, ctx:LLVMParser.FpToUIExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpToSIExpr.
    def enterFpToSIExpr(self, ctx:LLVMParser.FpToSIExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpToSIExpr.
    def exitFpToSIExpr(self, ctx:LLVMParser.FpToSIExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#uiToFPExpr.
    def enterUiToFPExpr(self, ctx:LLVMParser.UiToFPExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#uiToFPExpr.
    def exitUiToFPExpr(self, ctx:LLVMParser.UiToFPExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#siToFPExpr.
    def enterSiToFPExpr(self, ctx:LLVMParser.SiToFPExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#siToFPExpr.
    def exitSiToFPExpr(self, ctx:LLVMParser.SiToFPExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#ptrToIntExpr.
    def enterPtrToIntExpr(self, ctx:LLVMParser.PtrToIntExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#ptrToIntExpr.
    def exitPtrToIntExpr(self, ctx:LLVMParser.PtrToIntExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#intToPtrExpr.
    def enterIntToPtrExpr(self, ctx:LLVMParser.IntToPtrExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#intToPtrExpr.
    def exitIntToPtrExpr(self, ctx:LLVMParser.IntToPtrExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#bitCastExpr.
    def enterBitCastExpr(self, ctx:LLVMParser.BitCastExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#bitCastExpr.
    def exitBitCastExpr(self, ctx:LLVMParser.BitCastExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#addrSpaceCastExpr.
    def enterAddrSpaceCastExpr(self, ctx:LLVMParser.AddrSpaceCastExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#addrSpaceCastExpr.
    def exitAddrSpaceCastExpr(self, ctx:LLVMParser.AddrSpaceCastExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#iCmpExpr.
    def enterICmpExpr(self, ctx:LLVMParser.ICmpExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#iCmpExpr.
    def exitICmpExpr(self, ctx:LLVMParser.ICmpExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#fCmpExpr.
    def enterFCmpExpr(self, ctx:LLVMParser.FCmpExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#fCmpExpr.
    def exitFCmpExpr(self, ctx:LLVMParser.FCmpExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#selectExpr.
    def enterSelectExpr(self, ctx:LLVMParser.SelectExprContext):
        pass

    # Exit a parse tree produced by LLVMParser#selectExpr.
    def exitSelectExpr(self, ctx:LLVMParser.SelectExprContext):
        pass


    # Enter a parse tree produced by LLVMParser#basicBlockList.
    def enterBasicBlockList(self, ctx:LLVMParser.BasicBlockListContext):
        pass

    # Exit a parse tree produced by LLVMParser#basicBlockList.
    def exitBasicBlockList(self, ctx:LLVMParser.BasicBlockListContext):
        pass


    # Enter a parse tree produced by LLVMParser#basicBlock.
    def enterBasicBlock(self, ctx:LLVMParser.BasicBlockContext):
        pass

    # Exit a parse tree produced by LLVMParser#basicBlock.
    def exitBasicBlock(self, ctx:LLVMParser.BasicBlockContext):
        pass


    # Enter a parse tree produced by LLVMParser#optLabelIdent.
    def enterOptLabelIdent(self, ctx:LLVMParser.OptLabelIdentContext):
        pass

    # Exit a parse tree produced by LLVMParser#optLabelIdent.
    def exitOptLabelIdent(self, ctx:LLVMParser.OptLabelIdentContext):
        pass


    # Enter a parse tree produced by LLVMParser#instructions.
    def enterInstructions(self, ctx:LLVMParser.InstructionsContext):
        pass

    # Exit a parse tree produced by LLVMParser#instructions.
    def exitInstructions(self, ctx:LLVMParser.InstructionsContext):
        pass


    # Enter a parse tree produced by LLVMParser#instructionList.
    def enterInstructionList(self, ctx:LLVMParser.InstructionListContext):
        pass

    # Exit a parse tree produced by LLVMParser#instructionList.
    def exitInstructionList(self, ctx:LLVMParser.InstructionListContext):
        pass


    # Enter a parse tree produced by LLVMParser#instruction.
    def enterInstruction(self, ctx:LLVMParser.InstructionContext):
        pass

    # Exit a parse tree produced by LLVMParser#instruction.
    def exitInstruction(self, ctx:LLVMParser.InstructionContext):
        pass


    # Enter a parse tree produced by LLVMParser#valueInstruction.
    def enterValueInstruction(self, ctx:LLVMParser.ValueInstructionContext):
        pass

    # Exit a parse tree produced by LLVMParser#valueInstruction.
    def exitValueInstruction(self, ctx:LLVMParser.ValueInstructionContext):
        pass


    # Enter a parse tree produced by LLVMParser#addInst.
    def enterAddInst(self, ctx:LLVMParser.AddInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#addInst.
    def exitAddInst(self, ctx:LLVMParser.AddInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fAddInst.
    def enterFAddInst(self, ctx:LLVMParser.FAddInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fAddInst.
    def exitFAddInst(self, ctx:LLVMParser.FAddInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#subInst.
    def enterSubInst(self, ctx:LLVMParser.SubInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#subInst.
    def exitSubInst(self, ctx:LLVMParser.SubInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fSubInst.
    def enterFSubInst(self, ctx:LLVMParser.FSubInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fSubInst.
    def exitFSubInst(self, ctx:LLVMParser.FSubInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#mulInst.
    def enterMulInst(self, ctx:LLVMParser.MulInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#mulInst.
    def exitMulInst(self, ctx:LLVMParser.MulInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fMulInst.
    def enterFMulInst(self, ctx:LLVMParser.FMulInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fMulInst.
    def exitFMulInst(self, ctx:LLVMParser.FMulInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#uDivInst.
    def enterUDivInst(self, ctx:LLVMParser.UDivInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#uDivInst.
    def exitUDivInst(self, ctx:LLVMParser.UDivInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#sDivInst.
    def enterSDivInst(self, ctx:LLVMParser.SDivInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#sDivInst.
    def exitSDivInst(self, ctx:LLVMParser.SDivInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fDivInst.
    def enterFDivInst(self, ctx:LLVMParser.FDivInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fDivInst.
    def exitFDivInst(self, ctx:LLVMParser.FDivInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#uRemInst.
    def enterURemInst(self, ctx:LLVMParser.URemInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#uRemInst.
    def exitURemInst(self, ctx:LLVMParser.URemInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#sRemInst.
    def enterSRemInst(self, ctx:LLVMParser.SRemInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#sRemInst.
    def exitSRemInst(self, ctx:LLVMParser.SRemInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fRemInst.
    def enterFRemInst(self, ctx:LLVMParser.FRemInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fRemInst.
    def exitFRemInst(self, ctx:LLVMParser.FRemInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#shlInst.
    def enterShlInst(self, ctx:LLVMParser.ShlInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#shlInst.
    def exitShlInst(self, ctx:LLVMParser.ShlInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#lshrInst.
    def enterLshrInst(self, ctx:LLVMParser.LshrInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#lshrInst.
    def exitLshrInst(self, ctx:LLVMParser.LshrInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#ashrInst.
    def enterAshrInst(self, ctx:LLVMParser.AshrInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#ashrInst.
    def exitAshrInst(self, ctx:LLVMParser.AshrInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#andInst.
    def enterAndInst(self, ctx:LLVMParser.AndInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#andInst.
    def exitAndInst(self, ctx:LLVMParser.AndInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#orInst.
    def enterOrInst(self, ctx:LLVMParser.OrInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#orInst.
    def exitOrInst(self, ctx:LLVMParser.OrInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#xorInst.
    def enterXorInst(self, ctx:LLVMParser.XorInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#xorInst.
    def exitXorInst(self, ctx:LLVMParser.XorInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#extractElementInst.
    def enterExtractElementInst(self, ctx:LLVMParser.ExtractElementInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#extractElementInst.
    def exitExtractElementInst(self, ctx:LLVMParser.ExtractElementInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#insertElementInst.
    def enterInsertElementInst(self, ctx:LLVMParser.InsertElementInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#insertElementInst.
    def exitInsertElementInst(self, ctx:LLVMParser.InsertElementInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#shuffleVectorInst.
    def enterShuffleVectorInst(self, ctx:LLVMParser.ShuffleVectorInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#shuffleVectorInst.
    def exitShuffleVectorInst(self, ctx:LLVMParser.ShuffleVectorInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#extractValueInst.
    def enterExtractValueInst(self, ctx:LLVMParser.ExtractValueInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#extractValueInst.
    def exitExtractValueInst(self, ctx:LLVMParser.ExtractValueInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#insertValueInst.
    def enterInsertValueInst(self, ctx:LLVMParser.InsertValueInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#insertValueInst.
    def exitInsertValueInst(self, ctx:LLVMParser.InsertValueInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#allocaInst.
    def enterAllocaInst(self, ctx:LLVMParser.AllocaInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#allocaInst.
    def exitAllocaInst(self, ctx:LLVMParser.AllocaInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#optInAlloca.
    def enterOptInAlloca(self, ctx:LLVMParser.OptInAllocaContext):
        pass

    # Exit a parse tree produced by LLVMParser#optInAlloca.
    def exitOptInAlloca(self, ctx:LLVMParser.OptInAllocaContext):
        pass


    # Enter a parse tree produced by LLVMParser#optSwiftError.
    def enterOptSwiftError(self, ctx:LLVMParser.OptSwiftErrorContext):
        pass

    # Exit a parse tree produced by LLVMParser#optSwiftError.
    def exitOptSwiftError(self, ctx:LLVMParser.OptSwiftErrorContext):
        pass


    # Enter a parse tree produced by LLVMParser#loadInst.
    def enterLoadInst(self, ctx:LLVMParser.LoadInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#loadInst.
    def exitLoadInst(self, ctx:LLVMParser.LoadInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#storeInst.
    def enterStoreInst(self, ctx:LLVMParser.StoreInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#storeInst.
    def exitStoreInst(self, ctx:LLVMParser.StoreInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fenceInst.
    def enterFenceInst(self, ctx:LLVMParser.FenceInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fenceInst.
    def exitFenceInst(self, ctx:LLVMParser.FenceInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#cmpXchgInst.
    def enterCmpXchgInst(self, ctx:LLVMParser.CmpXchgInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#cmpXchgInst.
    def exitCmpXchgInst(self, ctx:LLVMParser.CmpXchgInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#optWeak.
    def enterOptWeak(self, ctx:LLVMParser.OptWeakContext):
        pass

    # Exit a parse tree produced by LLVMParser#optWeak.
    def exitOptWeak(self, ctx:LLVMParser.OptWeakContext):
        pass


    # Enter a parse tree produced by LLVMParser#atomicRMWInst.
    def enterAtomicRMWInst(self, ctx:LLVMParser.AtomicRMWInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#atomicRMWInst.
    def exitAtomicRMWInst(self, ctx:LLVMParser.AtomicRMWInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#binOp.
    def enterBinOp(self, ctx:LLVMParser.BinOpContext):
        pass

    # Exit a parse tree produced by LLVMParser#binOp.
    def exitBinOp(self, ctx:LLVMParser.BinOpContext):
        pass


    # Enter a parse tree produced by LLVMParser#getElementPtrInst.
    def enterGetElementPtrInst(self, ctx:LLVMParser.GetElementPtrInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#getElementPtrInst.
    def exitGetElementPtrInst(self, ctx:LLVMParser.GetElementPtrInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#truncInst.
    def enterTruncInst(self, ctx:LLVMParser.TruncInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#truncInst.
    def exitTruncInst(self, ctx:LLVMParser.TruncInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#zExtInst.
    def enterZExtInst(self, ctx:LLVMParser.ZExtInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#zExtInst.
    def exitZExtInst(self, ctx:LLVMParser.ZExtInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#sExtInst.
    def enterSExtInst(self, ctx:LLVMParser.SExtInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#sExtInst.
    def exitSExtInst(self, ctx:LLVMParser.SExtInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpTruncInst.
    def enterFpTruncInst(self, ctx:LLVMParser.FpTruncInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpTruncInst.
    def exitFpTruncInst(self, ctx:LLVMParser.FpTruncInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpExtInst.
    def enterFpExtInst(self, ctx:LLVMParser.FpExtInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpExtInst.
    def exitFpExtInst(self, ctx:LLVMParser.FpExtInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpToUIInst.
    def enterFpToUIInst(self, ctx:LLVMParser.FpToUIInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpToUIInst.
    def exitFpToUIInst(self, ctx:LLVMParser.FpToUIInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpToSIInst.
    def enterFpToSIInst(self, ctx:LLVMParser.FpToSIInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpToSIInst.
    def exitFpToSIInst(self, ctx:LLVMParser.FpToSIInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#uiToFPInst.
    def enterUiToFPInst(self, ctx:LLVMParser.UiToFPInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#uiToFPInst.
    def exitUiToFPInst(self, ctx:LLVMParser.UiToFPInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#siToFPInst.
    def enterSiToFPInst(self, ctx:LLVMParser.SiToFPInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#siToFPInst.
    def exitSiToFPInst(self, ctx:LLVMParser.SiToFPInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#ptrToIntInst.
    def enterPtrToIntInst(self, ctx:LLVMParser.PtrToIntInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#ptrToIntInst.
    def exitPtrToIntInst(self, ctx:LLVMParser.PtrToIntInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#intToPtrInst.
    def enterIntToPtrInst(self, ctx:LLVMParser.IntToPtrInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#intToPtrInst.
    def exitIntToPtrInst(self, ctx:LLVMParser.IntToPtrInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#bitCastInst.
    def enterBitCastInst(self, ctx:LLVMParser.BitCastInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#bitCastInst.
    def exitBitCastInst(self, ctx:LLVMParser.BitCastInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#addrSpaceCastInst.
    def enterAddrSpaceCastInst(self, ctx:LLVMParser.AddrSpaceCastInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#addrSpaceCastInst.
    def exitAddrSpaceCastInst(self, ctx:LLVMParser.AddrSpaceCastInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#iCmpInst.
    def enterICmpInst(self, ctx:LLVMParser.ICmpInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#iCmpInst.
    def exitICmpInst(self, ctx:LLVMParser.ICmpInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#fCmpInst.
    def enterFCmpInst(self, ctx:LLVMParser.FCmpInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#fCmpInst.
    def exitFCmpInst(self, ctx:LLVMParser.FCmpInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#phiInst.
    def enterPhiInst(self, ctx:LLVMParser.PhiInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#phiInst.
    def exitPhiInst(self, ctx:LLVMParser.PhiInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#incList.
    def enterIncList(self, ctx:LLVMParser.IncListContext):
        pass

    # Exit a parse tree produced by LLVMParser#incList.
    def exitIncList(self, ctx:LLVMParser.IncListContext):
        pass


    # Enter a parse tree produced by LLVMParser#inc.
    def enterInc(self, ctx:LLVMParser.IncContext):
        pass

    # Exit a parse tree produced by LLVMParser#inc.
    def exitInc(self, ctx:LLVMParser.IncContext):
        pass


    # Enter a parse tree produced by LLVMParser#selectInst.
    def enterSelectInst(self, ctx:LLVMParser.SelectInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#selectInst.
    def exitSelectInst(self, ctx:LLVMParser.SelectInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#callInst.
    def enterCallInst(self, ctx:LLVMParser.CallInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#callInst.
    def exitCallInst(self, ctx:LLVMParser.CallInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#optTail.
    def enterOptTail(self, ctx:LLVMParser.OptTailContext):
        pass

    # Exit a parse tree produced by LLVMParser#optTail.
    def exitOptTail(self, ctx:LLVMParser.OptTailContext):
        pass


    # Enter a parse tree produced by LLVMParser#vaArgInst.
    def enterVaArgInst(self, ctx:LLVMParser.VaArgInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#vaArgInst.
    def exitVaArgInst(self, ctx:LLVMParser.VaArgInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#landingPadInst.
    def enterLandingPadInst(self, ctx:LLVMParser.LandingPadInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#landingPadInst.
    def exitLandingPadInst(self, ctx:LLVMParser.LandingPadInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#optCleanup.
    def enterOptCleanup(self, ctx:LLVMParser.OptCleanupContext):
        pass

    # Exit a parse tree produced by LLVMParser#optCleanup.
    def exitOptCleanup(self, ctx:LLVMParser.OptCleanupContext):
        pass


    # Enter a parse tree produced by LLVMParser#clauses.
    def enterClauses(self, ctx:LLVMParser.ClausesContext):
        pass

    # Exit a parse tree produced by LLVMParser#clauses.
    def exitClauses(self, ctx:LLVMParser.ClausesContext):
        pass


    # Enter a parse tree produced by LLVMParser#clauseList.
    def enterClauseList(self, ctx:LLVMParser.ClauseListContext):
        pass

    # Exit a parse tree produced by LLVMParser#clauseList.
    def exitClauseList(self, ctx:LLVMParser.ClauseListContext):
        pass


    # Enter a parse tree produced by LLVMParser#clause.
    def enterClause(self, ctx:LLVMParser.ClauseContext):
        pass

    # Exit a parse tree produced by LLVMParser#clause.
    def exitClause(self, ctx:LLVMParser.ClauseContext):
        pass


    # Enter a parse tree produced by LLVMParser#catchPadInst.
    def enterCatchPadInst(self, ctx:LLVMParser.CatchPadInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#catchPadInst.
    def exitCatchPadInst(self, ctx:LLVMParser.CatchPadInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#cleanupPadInst.
    def enterCleanupPadInst(self, ctx:LLVMParser.CleanupPadInstContext):
        pass

    # Exit a parse tree produced by LLVMParser#cleanupPadInst.
    def exitCleanupPadInst(self, ctx:LLVMParser.CleanupPadInstContext):
        pass


    # Enter a parse tree produced by LLVMParser#terminator.
    def enterTerminator(self, ctx:LLVMParser.TerminatorContext):
        pass

    # Exit a parse tree produced by LLVMParser#terminator.
    def exitTerminator(self, ctx:LLVMParser.TerminatorContext):
        pass


    # Enter a parse tree produced by LLVMParser#retTerm.
    def enterRetTerm(self, ctx:LLVMParser.RetTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#retTerm.
    def exitRetTerm(self, ctx:LLVMParser.RetTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#brTerm.
    def enterBrTerm(self, ctx:LLVMParser.BrTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#brTerm.
    def exitBrTerm(self, ctx:LLVMParser.BrTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#condBrTerm.
    def enterCondBrTerm(self, ctx:LLVMParser.CondBrTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#condBrTerm.
    def exitCondBrTerm(self, ctx:LLVMParser.CondBrTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#switchTerm.
    def enterSwitchTerm(self, ctx:LLVMParser.SwitchTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#switchTerm.
    def exitSwitchTerm(self, ctx:LLVMParser.SwitchTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#cases.
    def enterCases(self, ctx:LLVMParser.CasesContext):
        pass

    # Exit a parse tree produced by LLVMParser#cases.
    def exitCases(self, ctx:LLVMParser.CasesContext):
        pass


    # Enter a parse tree produced by LLVMParser#caseList.
    def enterCaseList(self, ctx:LLVMParser.CaseListContext):
        pass

    # Exit a parse tree produced by LLVMParser#caseList.
    def exitCaseList(self, ctx:LLVMParser.CaseListContext):
        pass


    # Enter a parse tree produced by LLVMParser#llvmCase.
    def enterLlvmCase(self, ctx:LLVMParser.LlvmCaseContext):
        pass

    # Exit a parse tree produced by LLVMParser#llvmCase.
    def exitLlvmCase(self, ctx:LLVMParser.LlvmCaseContext):
        pass


    # Enter a parse tree produced by LLVMParser#indirectBrTerm.
    def enterIndirectBrTerm(self, ctx:LLVMParser.IndirectBrTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#indirectBrTerm.
    def exitIndirectBrTerm(self, ctx:LLVMParser.IndirectBrTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#labelList.
    def enterLabelList(self, ctx:LLVMParser.LabelListContext):
        pass

    # Exit a parse tree produced by LLVMParser#labelList.
    def exitLabelList(self, ctx:LLVMParser.LabelListContext):
        pass


    # Enter a parse tree produced by LLVMParser#label.
    def enterLabel(self, ctx:LLVMParser.LabelContext):
        pass

    # Exit a parse tree produced by LLVMParser#label.
    def exitLabel(self, ctx:LLVMParser.LabelContext):
        pass


    # Enter a parse tree produced by LLVMParser#invokeTerm.
    def enterInvokeTerm(self, ctx:LLVMParser.InvokeTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#invokeTerm.
    def exitInvokeTerm(self, ctx:LLVMParser.InvokeTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#resumeTerm.
    def enterResumeTerm(self, ctx:LLVMParser.ResumeTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#resumeTerm.
    def exitResumeTerm(self, ctx:LLVMParser.ResumeTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#catchSwitchTerm.
    def enterCatchSwitchTerm(self, ctx:LLVMParser.CatchSwitchTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#catchSwitchTerm.
    def exitCatchSwitchTerm(self, ctx:LLVMParser.CatchSwitchTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#catchRetTerm.
    def enterCatchRetTerm(self, ctx:LLVMParser.CatchRetTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#catchRetTerm.
    def exitCatchRetTerm(self, ctx:LLVMParser.CatchRetTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#cleanupRetTerm.
    def enterCleanupRetTerm(self, ctx:LLVMParser.CleanupRetTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#cleanupRetTerm.
    def exitCleanupRetTerm(self, ctx:LLVMParser.CleanupRetTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#unreachableTerm.
    def enterUnreachableTerm(self, ctx:LLVMParser.UnreachableTermContext):
        pass

    # Exit a parse tree produced by LLVMParser#unreachableTerm.
    def exitUnreachableTerm(self, ctx:LLVMParser.UnreachableTermContext):
        pass


    # Enter a parse tree produced by LLVMParser#unwindTarget.
    def enterUnwindTarget(self, ctx:LLVMParser.UnwindTargetContext):
        pass

    # Exit a parse tree produced by LLVMParser#unwindTarget.
    def exitUnwindTarget(self, ctx:LLVMParser.UnwindTargetContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdTuple.
    def enterMdTuple(self, ctx:LLVMParser.MdTupleContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdTuple.
    def exitMdTuple(self, ctx:LLVMParser.MdTupleContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdFields.
    def enterMdFields(self, ctx:LLVMParser.MdFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdFields.
    def exitMdFields(self, ctx:LLVMParser.MdFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdFieldList.
    def enterMdFieldList(self, ctx:LLVMParser.MdFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdFieldList.
    def exitMdFieldList(self, ctx:LLVMParser.MdFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdField.
    def enterMdField(self, ctx:LLVMParser.MdFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdField.
    def exitMdField(self, ctx:LLVMParser.MdFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadata.
    def enterMetadata(self, ctx:LLVMParser.MetadataContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadata.
    def exitMetadata(self, ctx:LLVMParser.MetadataContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdString.
    def enterMdString(self, ctx:LLVMParser.MdStringContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdString.
    def exitMdString(self, ctx:LLVMParser.MdStringContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataAttachment.
    def enterMetadataAttachment(self, ctx:LLVMParser.MetadataAttachmentContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataAttachment.
    def exitMetadataAttachment(self, ctx:LLVMParser.MetadataAttachmentContext):
        pass


    # Enter a parse tree produced by LLVMParser#mdNode.
    def enterMdNode(self, ctx:LLVMParser.MdNodeContext):
        pass

    # Exit a parse tree produced by LLVMParser#mdNode.
    def exitMdNode(self, ctx:LLVMParser.MdNodeContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataAttachments.
    def enterMetadataAttachments(self, ctx:LLVMParser.MetadataAttachmentsContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataAttachments.
    def exitMetadataAttachments(self, ctx:LLVMParser.MetadataAttachmentsContext):
        pass


    # Enter a parse tree produced by LLVMParser#metadataAttachmentList.
    def enterMetadataAttachmentList(self, ctx:LLVMParser.MetadataAttachmentListContext):
        pass

    # Exit a parse tree produced by LLVMParser#metadataAttachmentList.
    def exitMetadataAttachmentList(self, ctx:LLVMParser.MetadataAttachmentListContext):
        pass


    # Enter a parse tree produced by LLVMParser#optCommaSepMetadataAttachmentList.
    def enterOptCommaSepMetadataAttachmentList(self, ctx:LLVMParser.OptCommaSepMetadataAttachmentListContext):
        pass

    # Exit a parse tree produced by LLVMParser#optCommaSepMetadataAttachmentList.
    def exitOptCommaSepMetadataAttachmentList(self, ctx:LLVMParser.OptCommaSepMetadataAttachmentListContext):
        pass


    # Enter a parse tree produced by LLVMParser#commaSepMetadataAttachmentList.
    def enterCommaSepMetadataAttachmentList(self, ctx:LLVMParser.CommaSepMetadataAttachmentListContext):
        pass

    # Exit a parse tree produced by LLVMParser#commaSepMetadataAttachmentList.
    def exitCommaSepMetadataAttachmentList(self, ctx:LLVMParser.CommaSepMetadataAttachmentListContext):
        pass


    # Enter a parse tree produced by LLVMParser#specializedMDNode.
    def enterSpecializedMDNode(self, ctx:LLVMParser.SpecializedMDNodeContext):
        pass

    # Exit a parse tree produced by LLVMParser#specializedMDNode.
    def exitSpecializedMDNode(self, ctx:LLVMParser.SpecializedMDNodeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompileUnit.
    def enterDiCompileUnit(self, ctx:LLVMParser.DiCompileUnitContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompileUnit.
    def exitDiCompileUnit(self, ctx:LLVMParser.DiCompileUnitContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompileUnitFields.
    def enterDiCompileUnitFields(self, ctx:LLVMParser.DiCompileUnitFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompileUnitFields.
    def exitDiCompileUnitFields(self, ctx:LLVMParser.DiCompileUnitFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompileUnitFieldList.
    def enterDiCompileUnitFieldList(self, ctx:LLVMParser.DiCompileUnitFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompileUnitFieldList.
    def exitDiCompileUnitFieldList(self, ctx:LLVMParser.DiCompileUnitFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompileUnitField.
    def enterDiCompileUnitField(self, ctx:LLVMParser.DiCompileUnitFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompileUnitField.
    def exitDiCompileUnitField(self, ctx:LLVMParser.DiCompileUnitFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFile.
    def enterDiFile(self, ctx:LLVMParser.DiFileContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFile.
    def exitDiFile(self, ctx:LLVMParser.DiFileContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFileFields.
    def enterDiFileFields(self, ctx:LLVMParser.DiFileFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFileFields.
    def exitDiFileFields(self, ctx:LLVMParser.DiFileFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFileFieldList.
    def enterDiFileFieldList(self, ctx:LLVMParser.DiFileFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFileFieldList.
    def exitDiFileFieldList(self, ctx:LLVMParser.DiFileFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFileField.
    def enterDiFileField(self, ctx:LLVMParser.DiFileFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFileField.
    def exitDiFileField(self, ctx:LLVMParser.DiFileFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diBasicType.
    def enterDiBasicType(self, ctx:LLVMParser.DiBasicTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#diBasicType.
    def exitDiBasicType(self, ctx:LLVMParser.DiBasicTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diBasicTypeFields.
    def enterDiBasicTypeFields(self, ctx:LLVMParser.DiBasicTypeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diBasicTypeFields.
    def exitDiBasicTypeFields(self, ctx:LLVMParser.DiBasicTypeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diBasicTypeFieldList.
    def enterDiBasicTypeFieldList(self, ctx:LLVMParser.DiBasicTypeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diBasicTypeFieldList.
    def exitDiBasicTypeFieldList(self, ctx:LLVMParser.DiBasicTypeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diBasicTypeField.
    def enterDiBasicTypeField(self, ctx:LLVMParser.DiBasicTypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diBasicTypeField.
    def exitDiBasicTypeField(self, ctx:LLVMParser.DiBasicTypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubroutineType.
    def enterDiSubroutineType(self, ctx:LLVMParser.DiSubroutineTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubroutineType.
    def exitDiSubroutineType(self, ctx:LLVMParser.DiSubroutineTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubroutineTypeFields.
    def enterDiSubroutineTypeFields(self, ctx:LLVMParser.DiSubroutineTypeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubroutineTypeFields.
    def exitDiSubroutineTypeFields(self, ctx:LLVMParser.DiSubroutineTypeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubroutineTypeFieldList.
    def enterDiSubroutineTypeFieldList(self, ctx:LLVMParser.DiSubroutineTypeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubroutineTypeFieldList.
    def exitDiSubroutineTypeFieldList(self, ctx:LLVMParser.DiSubroutineTypeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubroutineTypeField.
    def enterDiSubroutineTypeField(self, ctx:LLVMParser.DiSubroutineTypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubroutineTypeField.
    def exitDiSubroutineTypeField(self, ctx:LLVMParser.DiSubroutineTypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diDerivedType.
    def enterDiDerivedType(self, ctx:LLVMParser.DiDerivedTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#diDerivedType.
    def exitDiDerivedType(self, ctx:LLVMParser.DiDerivedTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diDerivedTypeFields.
    def enterDiDerivedTypeFields(self, ctx:LLVMParser.DiDerivedTypeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diDerivedTypeFields.
    def exitDiDerivedTypeFields(self, ctx:LLVMParser.DiDerivedTypeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diDerivedTypeFieldList.
    def enterDiDerivedTypeFieldList(self, ctx:LLVMParser.DiDerivedTypeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diDerivedTypeFieldList.
    def exitDiDerivedTypeFieldList(self, ctx:LLVMParser.DiDerivedTypeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diDerivedTypeField.
    def enterDiDerivedTypeField(self, ctx:LLVMParser.DiDerivedTypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diDerivedTypeField.
    def exitDiDerivedTypeField(self, ctx:LLVMParser.DiDerivedTypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompositeType.
    def enterDiCompositeType(self, ctx:LLVMParser.DiCompositeTypeContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompositeType.
    def exitDiCompositeType(self, ctx:LLVMParser.DiCompositeTypeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompositeTypeFields.
    def enterDiCompositeTypeFields(self, ctx:LLVMParser.DiCompositeTypeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompositeTypeFields.
    def exitDiCompositeTypeFields(self, ctx:LLVMParser.DiCompositeTypeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompositeTypeFieldList.
    def enterDiCompositeTypeFieldList(self, ctx:LLVMParser.DiCompositeTypeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompositeTypeFieldList.
    def exitDiCompositeTypeFieldList(self, ctx:LLVMParser.DiCompositeTypeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diCompositeTypeField.
    def enterDiCompositeTypeField(self, ctx:LLVMParser.DiCompositeTypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diCompositeTypeField.
    def exitDiCompositeTypeField(self, ctx:LLVMParser.DiCompositeTypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubrange.
    def enterDiSubrange(self, ctx:LLVMParser.DiSubrangeContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubrange.
    def exitDiSubrange(self, ctx:LLVMParser.DiSubrangeContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubrangeFields.
    def enterDiSubrangeFields(self, ctx:LLVMParser.DiSubrangeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubrangeFields.
    def exitDiSubrangeFields(self, ctx:LLVMParser.DiSubrangeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubrangeFieldList.
    def enterDiSubrangeFieldList(self, ctx:LLVMParser.DiSubrangeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubrangeFieldList.
    def exitDiSubrangeFieldList(self, ctx:LLVMParser.DiSubrangeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubrangeField.
    def enterDiSubrangeField(self, ctx:LLVMParser.DiSubrangeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubrangeField.
    def exitDiSubrangeField(self, ctx:LLVMParser.DiSubrangeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diEnumerator.
    def enterDiEnumerator(self, ctx:LLVMParser.DiEnumeratorContext):
        pass

    # Exit a parse tree produced by LLVMParser#diEnumerator.
    def exitDiEnumerator(self, ctx:LLVMParser.DiEnumeratorContext):
        pass


    # Enter a parse tree produced by LLVMParser#diEnumeratorFields.
    def enterDiEnumeratorFields(self, ctx:LLVMParser.DiEnumeratorFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diEnumeratorFields.
    def exitDiEnumeratorFields(self, ctx:LLVMParser.DiEnumeratorFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diEnumeratorFieldList.
    def enterDiEnumeratorFieldList(self, ctx:LLVMParser.DiEnumeratorFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diEnumeratorFieldList.
    def exitDiEnumeratorFieldList(self, ctx:LLVMParser.DiEnumeratorFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diEnumeratorField.
    def enterDiEnumeratorField(self, ctx:LLVMParser.DiEnumeratorFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diEnumeratorField.
    def exitDiEnumeratorField(self, ctx:LLVMParser.DiEnumeratorFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateTypeParameter.
    def enterDiTemplateTypeParameter(self, ctx:LLVMParser.DiTemplateTypeParameterContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateTypeParameter.
    def exitDiTemplateTypeParameter(self, ctx:LLVMParser.DiTemplateTypeParameterContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateTypeParameterFields.
    def enterDiTemplateTypeParameterFields(self, ctx:LLVMParser.DiTemplateTypeParameterFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateTypeParameterFields.
    def exitDiTemplateTypeParameterFields(self, ctx:LLVMParser.DiTemplateTypeParameterFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateTypeParameterFieldList.
    def enterDiTemplateTypeParameterFieldList(self, ctx:LLVMParser.DiTemplateTypeParameterFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateTypeParameterFieldList.
    def exitDiTemplateTypeParameterFieldList(self, ctx:LLVMParser.DiTemplateTypeParameterFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateTypeParameterField.
    def enterDiTemplateTypeParameterField(self, ctx:LLVMParser.DiTemplateTypeParameterFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateTypeParameterField.
    def exitDiTemplateTypeParameterField(self, ctx:LLVMParser.DiTemplateTypeParameterFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateValueParameter.
    def enterDiTemplateValueParameter(self, ctx:LLVMParser.DiTemplateValueParameterContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateValueParameter.
    def exitDiTemplateValueParameter(self, ctx:LLVMParser.DiTemplateValueParameterContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateValueParameterFields.
    def enterDiTemplateValueParameterFields(self, ctx:LLVMParser.DiTemplateValueParameterFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateValueParameterFields.
    def exitDiTemplateValueParameterFields(self, ctx:LLVMParser.DiTemplateValueParameterFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateValueParameterFieldList.
    def enterDiTemplateValueParameterFieldList(self, ctx:LLVMParser.DiTemplateValueParameterFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateValueParameterFieldList.
    def exitDiTemplateValueParameterFieldList(self, ctx:LLVMParser.DiTemplateValueParameterFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diTemplateValueParameterField.
    def enterDiTemplateValueParameterField(self, ctx:LLVMParser.DiTemplateValueParameterFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diTemplateValueParameterField.
    def exitDiTemplateValueParameterField(self, ctx:LLVMParser.DiTemplateValueParameterFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diModule.
    def enterDiModule(self, ctx:LLVMParser.DiModuleContext):
        pass

    # Exit a parse tree produced by LLVMParser#diModule.
    def exitDiModule(self, ctx:LLVMParser.DiModuleContext):
        pass


    # Enter a parse tree produced by LLVMParser#diModuleFields.
    def enterDiModuleFields(self, ctx:LLVMParser.DiModuleFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diModuleFields.
    def exitDiModuleFields(self, ctx:LLVMParser.DiModuleFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diModuleFieldList.
    def enterDiModuleFieldList(self, ctx:LLVMParser.DiModuleFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diModuleFieldList.
    def exitDiModuleFieldList(self, ctx:LLVMParser.DiModuleFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diModuleField.
    def enterDiModuleField(self, ctx:LLVMParser.DiModuleFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diModuleField.
    def exitDiModuleField(self, ctx:LLVMParser.DiModuleFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diNamespace.
    def enterDiNamespace(self, ctx:LLVMParser.DiNamespaceContext):
        pass

    # Exit a parse tree produced by LLVMParser#diNamespace.
    def exitDiNamespace(self, ctx:LLVMParser.DiNamespaceContext):
        pass


    # Enter a parse tree produced by LLVMParser#diNamespaceFields.
    def enterDiNamespaceFields(self, ctx:LLVMParser.DiNamespaceFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diNamespaceFields.
    def exitDiNamespaceFields(self, ctx:LLVMParser.DiNamespaceFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diNamespaceFieldList.
    def enterDiNamespaceFieldList(self, ctx:LLVMParser.DiNamespaceFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diNamespaceFieldList.
    def exitDiNamespaceFieldList(self, ctx:LLVMParser.DiNamespaceFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diNamespaceField.
    def enterDiNamespaceField(self, ctx:LLVMParser.DiNamespaceFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diNamespaceField.
    def exitDiNamespaceField(self, ctx:LLVMParser.DiNamespaceFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariable.
    def enterDiGlobalVariable(self, ctx:LLVMParser.DiGlobalVariableContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariable.
    def exitDiGlobalVariable(self, ctx:LLVMParser.DiGlobalVariableContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableFields.
    def enterDiGlobalVariableFields(self, ctx:LLVMParser.DiGlobalVariableFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableFields.
    def exitDiGlobalVariableFields(self, ctx:LLVMParser.DiGlobalVariableFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableFieldList.
    def enterDiGlobalVariableFieldList(self, ctx:LLVMParser.DiGlobalVariableFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableFieldList.
    def exitDiGlobalVariableFieldList(self, ctx:LLVMParser.DiGlobalVariableFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableField.
    def enterDiGlobalVariableField(self, ctx:LLVMParser.DiGlobalVariableFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableField.
    def exitDiGlobalVariableField(self, ctx:LLVMParser.DiGlobalVariableFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubprogram.
    def enterDiSubprogram(self, ctx:LLVMParser.DiSubprogramContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubprogram.
    def exitDiSubprogram(self, ctx:LLVMParser.DiSubprogramContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubprogramFields.
    def enterDiSubprogramFields(self, ctx:LLVMParser.DiSubprogramFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubprogramFields.
    def exitDiSubprogramFields(self, ctx:LLVMParser.DiSubprogramFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubprogramFieldList.
    def enterDiSubprogramFieldList(self, ctx:LLVMParser.DiSubprogramFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubprogramFieldList.
    def exitDiSubprogramFieldList(self, ctx:LLVMParser.DiSubprogramFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diSubprogramField.
    def enterDiSubprogramField(self, ctx:LLVMParser.DiSubprogramFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diSubprogramField.
    def exitDiSubprogramField(self, ctx:LLVMParser.DiSubprogramFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlock.
    def enterDiLexicalBlock(self, ctx:LLVMParser.DiLexicalBlockContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlock.
    def exitDiLexicalBlock(self, ctx:LLVMParser.DiLexicalBlockContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFields.
    def enterDiLexicalBlockFields(self, ctx:LLVMParser.DiLexicalBlockFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFields.
    def exitDiLexicalBlockFields(self, ctx:LLVMParser.DiLexicalBlockFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFieldList.
    def enterDiLexicalBlockFieldList(self, ctx:LLVMParser.DiLexicalBlockFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFieldList.
    def exitDiLexicalBlockFieldList(self, ctx:LLVMParser.DiLexicalBlockFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockField.
    def enterDiLexicalBlockField(self, ctx:LLVMParser.DiLexicalBlockFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockField.
    def exitDiLexicalBlockField(self, ctx:LLVMParser.DiLexicalBlockFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFile.
    def enterDiLexicalBlockFile(self, ctx:LLVMParser.DiLexicalBlockFileContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFile.
    def exitDiLexicalBlockFile(self, ctx:LLVMParser.DiLexicalBlockFileContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFileFields.
    def enterDiLexicalBlockFileFields(self, ctx:LLVMParser.DiLexicalBlockFileFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFileFields.
    def exitDiLexicalBlockFileFields(self, ctx:LLVMParser.DiLexicalBlockFileFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFileFieldList.
    def enterDiLexicalBlockFileFieldList(self, ctx:LLVMParser.DiLexicalBlockFileFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFileFieldList.
    def exitDiLexicalBlockFileFieldList(self, ctx:LLVMParser.DiLexicalBlockFileFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLexicalBlockFileField.
    def enterDiLexicalBlockFileField(self, ctx:LLVMParser.DiLexicalBlockFileFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLexicalBlockFileField.
    def exitDiLexicalBlockFileField(self, ctx:LLVMParser.DiLexicalBlockFileFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocation.
    def enterDiLocation(self, ctx:LLVMParser.DiLocationContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocation.
    def exitDiLocation(self, ctx:LLVMParser.DiLocationContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocationFields.
    def enterDiLocationFields(self, ctx:LLVMParser.DiLocationFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocationFields.
    def exitDiLocationFields(self, ctx:LLVMParser.DiLocationFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocationFieldList.
    def enterDiLocationFieldList(self, ctx:LLVMParser.DiLocationFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocationFieldList.
    def exitDiLocationFieldList(self, ctx:LLVMParser.DiLocationFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocationField.
    def enterDiLocationField(self, ctx:LLVMParser.DiLocationFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocationField.
    def exitDiLocationField(self, ctx:LLVMParser.DiLocationFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocalVariable.
    def enterDiLocalVariable(self, ctx:LLVMParser.DiLocalVariableContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocalVariable.
    def exitDiLocalVariable(self, ctx:LLVMParser.DiLocalVariableContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocalVariableFields.
    def enterDiLocalVariableFields(self, ctx:LLVMParser.DiLocalVariableFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocalVariableFields.
    def exitDiLocalVariableFields(self, ctx:LLVMParser.DiLocalVariableFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocalVariableFieldList.
    def enterDiLocalVariableFieldList(self, ctx:LLVMParser.DiLocalVariableFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocalVariableFieldList.
    def exitDiLocalVariableFieldList(self, ctx:LLVMParser.DiLocalVariableFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diLocalVariableField.
    def enterDiLocalVariableField(self, ctx:LLVMParser.DiLocalVariableFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diLocalVariableField.
    def exitDiLocalVariableField(self, ctx:LLVMParser.DiLocalVariableFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diExpression.
    def enterDiExpression(self, ctx:LLVMParser.DiExpressionContext):
        pass

    # Exit a parse tree produced by LLVMParser#diExpression.
    def exitDiExpression(self, ctx:LLVMParser.DiExpressionContext):
        pass


    # Enter a parse tree produced by LLVMParser#diExpressionFields.
    def enterDiExpressionFields(self, ctx:LLVMParser.DiExpressionFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diExpressionFields.
    def exitDiExpressionFields(self, ctx:LLVMParser.DiExpressionFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diExpressionFieldList.
    def enterDiExpressionFieldList(self, ctx:LLVMParser.DiExpressionFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diExpressionFieldList.
    def exitDiExpressionFieldList(self, ctx:LLVMParser.DiExpressionFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diExpressionField.
    def enterDiExpressionField(self, ctx:LLVMParser.DiExpressionFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diExpressionField.
    def exitDiExpressionField(self, ctx:LLVMParser.DiExpressionFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableExpression.
    def enterDiGlobalVariableExpression(self, ctx:LLVMParser.DiGlobalVariableExpressionContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableExpression.
    def exitDiGlobalVariableExpression(self, ctx:LLVMParser.DiGlobalVariableExpressionContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableExpressionFields.
    def enterDiGlobalVariableExpressionFields(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableExpressionFields.
    def exitDiGlobalVariableExpressionFields(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableExpressionFieldList.
    def enterDiGlobalVariableExpressionFieldList(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableExpressionFieldList.
    def exitDiGlobalVariableExpressionFieldList(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diGlobalVariableExpressionField.
    def enterDiGlobalVariableExpressionField(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diGlobalVariableExpressionField.
    def exitDiGlobalVariableExpressionField(self, ctx:LLVMParser.DiGlobalVariableExpressionFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diObjCProperty.
    def enterDiObjCProperty(self, ctx:LLVMParser.DiObjCPropertyContext):
        pass

    # Exit a parse tree produced by LLVMParser#diObjCProperty.
    def exitDiObjCProperty(self, ctx:LLVMParser.DiObjCPropertyContext):
        pass


    # Enter a parse tree produced by LLVMParser#diObjCPropertyFields.
    def enterDiObjCPropertyFields(self, ctx:LLVMParser.DiObjCPropertyFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diObjCPropertyFields.
    def exitDiObjCPropertyFields(self, ctx:LLVMParser.DiObjCPropertyFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diObjCPropertyFieldList.
    def enterDiObjCPropertyFieldList(self, ctx:LLVMParser.DiObjCPropertyFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diObjCPropertyFieldList.
    def exitDiObjCPropertyFieldList(self, ctx:LLVMParser.DiObjCPropertyFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diObjCPropertyField.
    def enterDiObjCPropertyField(self, ctx:LLVMParser.DiObjCPropertyFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diObjCPropertyField.
    def exitDiObjCPropertyField(self, ctx:LLVMParser.DiObjCPropertyFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diImportedEntity.
    def enterDiImportedEntity(self, ctx:LLVMParser.DiImportedEntityContext):
        pass

    # Exit a parse tree produced by LLVMParser#diImportedEntity.
    def exitDiImportedEntity(self, ctx:LLVMParser.DiImportedEntityContext):
        pass


    # Enter a parse tree produced by LLVMParser#diImportedEntityFields.
    def enterDiImportedEntityFields(self, ctx:LLVMParser.DiImportedEntityFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diImportedEntityFields.
    def exitDiImportedEntityFields(self, ctx:LLVMParser.DiImportedEntityFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diImportedEntityFieldList.
    def enterDiImportedEntityFieldList(self, ctx:LLVMParser.DiImportedEntityFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diImportedEntityFieldList.
    def exitDiImportedEntityFieldList(self, ctx:LLVMParser.DiImportedEntityFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diImportedEntityField.
    def enterDiImportedEntityField(self, ctx:LLVMParser.DiImportedEntityFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diImportedEntityField.
    def exitDiImportedEntityField(self, ctx:LLVMParser.DiImportedEntityFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacro.
    def enterDiMacro(self, ctx:LLVMParser.DiMacroContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacro.
    def exitDiMacro(self, ctx:LLVMParser.DiMacroContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFields.
    def enterDiMacroFields(self, ctx:LLVMParser.DiMacroFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFields.
    def exitDiMacroFields(self, ctx:LLVMParser.DiMacroFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFieldList.
    def enterDiMacroFieldList(self, ctx:LLVMParser.DiMacroFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFieldList.
    def exitDiMacroFieldList(self, ctx:LLVMParser.DiMacroFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroField.
    def enterDiMacroField(self, ctx:LLVMParser.DiMacroFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroField.
    def exitDiMacroField(self, ctx:LLVMParser.DiMacroFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFile.
    def enterDiMacroFile(self, ctx:LLVMParser.DiMacroFileContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFile.
    def exitDiMacroFile(self, ctx:LLVMParser.DiMacroFileContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFileFields.
    def enterDiMacroFileFields(self, ctx:LLVMParser.DiMacroFileFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFileFields.
    def exitDiMacroFileFields(self, ctx:LLVMParser.DiMacroFileFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFileFieldList.
    def enterDiMacroFileFieldList(self, ctx:LLVMParser.DiMacroFileFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFileFieldList.
    def exitDiMacroFileFieldList(self, ctx:LLVMParser.DiMacroFileFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diMacroFileField.
    def enterDiMacroFileField(self, ctx:LLVMParser.DiMacroFileFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#diMacroFileField.
    def exitDiMacroFileField(self, ctx:LLVMParser.DiMacroFileFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#genericDINode.
    def enterGenericDINode(self, ctx:LLVMParser.GenericDINodeContext):
        pass

    # Exit a parse tree produced by LLVMParser#genericDINode.
    def exitGenericDINode(self, ctx:LLVMParser.GenericDINodeContext):
        pass


    # Enter a parse tree produced by LLVMParser#genericDINodeFields.
    def enterGenericDINodeFields(self, ctx:LLVMParser.GenericDINodeFieldsContext):
        pass

    # Exit a parse tree produced by LLVMParser#genericDINodeFields.
    def exitGenericDINodeFields(self, ctx:LLVMParser.GenericDINodeFieldsContext):
        pass


    # Enter a parse tree produced by LLVMParser#genericDINodeFieldList.
    def enterGenericDINodeFieldList(self, ctx:LLVMParser.GenericDINodeFieldListContext):
        pass

    # Exit a parse tree produced by LLVMParser#genericDINodeFieldList.
    def exitGenericDINodeFieldList(self, ctx:LLVMParser.GenericDINodeFieldListContext):
        pass


    # Enter a parse tree produced by LLVMParser#genericDINodeField.
    def enterGenericDINodeField(self, ctx:LLVMParser.GenericDINodeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#genericDINodeField.
    def exitGenericDINodeField(self, ctx:LLVMParser.GenericDINodeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#fileField.
    def enterFileField(self, ctx:LLVMParser.FileFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#fileField.
    def exitFileField(self, ctx:LLVMParser.FileFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#isOptimizedField.
    def enterIsOptimizedField(self, ctx:LLVMParser.IsOptimizedFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#isOptimizedField.
    def exitIsOptimizedField(self, ctx:LLVMParser.IsOptimizedFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#tagField.
    def enterTagField(self, ctx:LLVMParser.TagFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#tagField.
    def exitTagField(self, ctx:LLVMParser.TagFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#nameField.
    def enterNameField(self, ctx:LLVMParser.NameFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#nameField.
    def exitNameField(self, ctx:LLVMParser.NameFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#sizeField.
    def enterSizeField(self, ctx:LLVMParser.SizeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#sizeField.
    def exitSizeField(self, ctx:LLVMParser.SizeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#alignField.
    def enterAlignField(self, ctx:LLVMParser.AlignFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#alignField.
    def exitAlignField(self, ctx:LLVMParser.AlignFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#flagsField.
    def enterFlagsField(self, ctx:LLVMParser.FlagsFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#flagsField.
    def exitFlagsField(self, ctx:LLVMParser.FlagsFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#lineField.
    def enterLineField(self, ctx:LLVMParser.LineFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#lineField.
    def exitLineField(self, ctx:LLVMParser.LineFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#scopeField.
    def enterScopeField(self, ctx:LLVMParser.ScopeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#scopeField.
    def exitScopeField(self, ctx:LLVMParser.ScopeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#baseTypeField.
    def enterBaseTypeField(self, ctx:LLVMParser.BaseTypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#baseTypeField.
    def exitBaseTypeField(self, ctx:LLVMParser.BaseTypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#offsetField.
    def enterOffsetField(self, ctx:LLVMParser.OffsetFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#offsetField.
    def exitOffsetField(self, ctx:LLVMParser.OffsetFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#templateParamsField.
    def enterTemplateParamsField(self, ctx:LLVMParser.TemplateParamsFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#templateParamsField.
    def exitTemplateParamsField(self, ctx:LLVMParser.TemplateParamsFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#intOrMDField.
    def enterIntOrMDField(self, ctx:LLVMParser.IntOrMDFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#intOrMDField.
    def exitIntOrMDField(self, ctx:LLVMParser.IntOrMDFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeField.
    def enterTypeField(self, ctx:LLVMParser.TypeFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeField.
    def exitTypeField(self, ctx:LLVMParser.TypeFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#linkageNameField.
    def enterLinkageNameField(self, ctx:LLVMParser.LinkageNameFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#linkageNameField.
    def exitLinkageNameField(self, ctx:LLVMParser.LinkageNameFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#isLocalField.
    def enterIsLocalField(self, ctx:LLVMParser.IsLocalFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#isLocalField.
    def exitIsLocalField(self, ctx:LLVMParser.IsLocalFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#isDefinitionField.
    def enterIsDefinitionField(self, ctx:LLVMParser.IsDefinitionFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#isDefinitionField.
    def exitIsDefinitionField(self, ctx:LLVMParser.IsDefinitionFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#declarationField.
    def enterDeclarationField(self, ctx:LLVMParser.DeclarationFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#declarationField.
    def exitDeclarationField(self, ctx:LLVMParser.DeclarationFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#columnField.
    def enterColumnField(self, ctx:LLVMParser.ColumnFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#columnField.
    def exitColumnField(self, ctx:LLVMParser.ColumnFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeMacinfoField.
    def enterTypeMacinfoField(self, ctx:LLVMParser.TypeMacinfoFieldContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeMacinfoField.
    def exitTypeMacinfoField(self, ctx:LLVMParser.TypeMacinfoFieldContext):
        pass


    # Enter a parse tree produced by LLVMParser#checksumkind.
    def enterChecksumkind(self, ctx:LLVMParser.ChecksumkindContext):
        pass

    # Exit a parse tree produced by LLVMParser#checksumkind.
    def exitChecksumkind(self, ctx:LLVMParser.ChecksumkindContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFlagList.
    def enterDiFlagList(self, ctx:LLVMParser.DiFlagListContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFlagList.
    def exitDiFlagList(self, ctx:LLVMParser.DiFlagListContext):
        pass


    # Enter a parse tree produced by LLVMParser#diFlag.
    def enterDiFlag(self, ctx:LLVMParser.DiFlagContext):
        pass

    # Exit a parse tree produced by LLVMParser#diFlag.
    def exitDiFlag(self, ctx:LLVMParser.DiFlagContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfAttEncoding.
    def enterDwarfAttEncoding(self, ctx:LLVMParser.DwarfAttEncodingContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfAttEncoding.
    def exitDwarfAttEncoding(self, ctx:LLVMParser.DwarfAttEncodingContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfCC.
    def enterDwarfCC(self, ctx:LLVMParser.DwarfCCContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfCC.
    def exitDwarfCC(self, ctx:LLVMParser.DwarfCCContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfLang.
    def enterDwarfLang(self, ctx:LLVMParser.DwarfLangContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfLang.
    def exitDwarfLang(self, ctx:LLVMParser.DwarfLangContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfMacinfo.
    def enterDwarfMacinfo(self, ctx:LLVMParser.DwarfMacinfoContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfMacinfo.
    def exitDwarfMacinfo(self, ctx:LLVMParser.DwarfMacinfoContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfOp.
    def enterDwarfOp(self, ctx:LLVMParser.DwarfOpContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfOp.
    def exitDwarfOp(self, ctx:LLVMParser.DwarfOpContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfTag.
    def enterDwarfTag(self, ctx:LLVMParser.DwarfTagContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfTag.
    def exitDwarfTag(self, ctx:LLVMParser.DwarfTagContext):
        pass


    # Enter a parse tree produced by LLVMParser#dwarfVirtuality.
    def enterDwarfVirtuality(self, ctx:LLVMParser.DwarfVirtualityContext):
        pass

    # Exit a parse tree produced by LLVMParser#dwarfVirtuality.
    def exitDwarfVirtuality(self, ctx:LLVMParser.DwarfVirtualityContext):
        pass


    # Enter a parse tree produced by LLVMParser#emissionKind.
    def enterEmissionKind(self, ctx:LLVMParser.EmissionKindContext):
        pass

    # Exit a parse tree produced by LLVMParser#emissionKind.
    def exitEmissionKind(self, ctx:LLVMParser.EmissionKindContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeValues.
    def enterTypeValues(self, ctx:LLVMParser.TypeValuesContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeValues.
    def exitTypeValues(self, ctx:LLVMParser.TypeValuesContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeValueList.
    def enterTypeValueList(self, ctx:LLVMParser.TypeValueListContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeValueList.
    def exitTypeValueList(self, ctx:LLVMParser.TypeValueListContext):
        pass


    # Enter a parse tree produced by LLVMParser#commaSepTypeValueList.
    def enterCommaSepTypeValueList(self, ctx:LLVMParser.CommaSepTypeValueListContext):
        pass

    # Exit a parse tree produced by LLVMParser#commaSepTypeValueList.
    def exitCommaSepTypeValueList(self, ctx:LLVMParser.CommaSepTypeValueListContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeValue.
    def enterTypeValue(self, ctx:LLVMParser.TypeValueContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeValue.
    def exitTypeValue(self, ctx:LLVMParser.TypeValueContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeConsts.
    def enterTypeConsts(self, ctx:LLVMParser.TypeConstsContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeConsts.
    def exitTypeConsts(self, ctx:LLVMParser.TypeConstsContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeConstList.
    def enterTypeConstList(self, ctx:LLVMParser.TypeConstListContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeConstList.
    def exitTypeConstList(self, ctx:LLVMParser.TypeConstListContext):
        pass


    # Enter a parse tree produced by LLVMParser#typeConst.
    def enterTypeConst(self, ctx:LLVMParser.TypeConstContext):
        pass

    # Exit a parse tree produced by LLVMParser#typeConst.
    def exitTypeConst(self, ctx:LLVMParser.TypeConstContext):
        pass


    # Enter a parse tree produced by LLVMParser#alignment.
    def enterAlignment(self, ctx:LLVMParser.AlignmentContext):
        pass

    # Exit a parse tree produced by LLVMParser#alignment.
    def exitAlignment(self, ctx:LLVMParser.AlignmentContext):
        pass


    # Enter a parse tree produced by LLVMParser#allocSize.
    def enterAllocSize(self, ctx:LLVMParser.AllocSizeContext):
        pass

    # Exit a parse tree produced by LLVMParser#allocSize.
    def exitAllocSize(self, ctx:LLVMParser.AllocSizeContext):
        pass


    # Enter a parse tree produced by LLVMParser#args.
    def enterArgs(self, ctx:LLVMParser.ArgsContext):
        pass

    # Exit a parse tree produced by LLVMParser#args.
    def exitArgs(self, ctx:LLVMParser.ArgsContext):
        pass


    # Enter a parse tree produced by LLVMParser#argList.
    def enterArgList(self, ctx:LLVMParser.ArgListContext):
        pass

    # Exit a parse tree produced by LLVMParser#argList.
    def exitArgList(self, ctx:LLVMParser.ArgListContext):
        pass


    # Enter a parse tree produced by LLVMParser#arg.
    def enterArg(self, ctx:LLVMParser.ArgContext):
        pass

    # Exit a parse tree produced by LLVMParser#arg.
    def exitArg(self, ctx:LLVMParser.ArgContext):
        pass


    # Enter a parse tree produced by LLVMParser#atomicOrdering.
    def enterAtomicOrdering(self, ctx:LLVMParser.AtomicOrderingContext):
        pass

    # Exit a parse tree produced by LLVMParser#atomicOrdering.
    def exitAtomicOrdering(self, ctx:LLVMParser.AtomicOrderingContext):
        pass


    # Enter a parse tree produced by LLVMParser#optCallingConv.
    def enterOptCallingConv(self, ctx:LLVMParser.OptCallingConvContext):
        pass

    # Exit a parse tree produced by LLVMParser#optCallingConv.
    def exitOptCallingConv(self, ctx:LLVMParser.OptCallingConvContext):
        pass


    # Enter a parse tree produced by LLVMParser#callingConv.
    def enterCallingConv(self, ctx:LLVMParser.CallingConvContext):
        pass

    # Exit a parse tree produced by LLVMParser#callingConv.
    def exitCallingConv(self, ctx:LLVMParser.CallingConvContext):
        pass


    # Enter a parse tree produced by LLVMParser#optComdat.
    def enterOptComdat(self, ctx:LLVMParser.OptComdatContext):
        pass

    # Exit a parse tree produced by LLVMParser#optComdat.
    def exitOptComdat(self, ctx:LLVMParser.OptComdatContext):
        pass


    # Enter a parse tree produced by LLVMParser#comdat.
    def enterComdat(self, ctx:LLVMParser.ComdatContext):
        pass

    # Exit a parse tree produced by LLVMParser#comdat.
    def exitComdat(self, ctx:LLVMParser.ComdatContext):
        pass


    # Enter a parse tree produced by LLVMParser#dereferenceable.
    def enterDereferenceable(self, ctx:LLVMParser.DereferenceableContext):
        pass

    # Exit a parse tree produced by LLVMParser#dereferenceable.
    def exitDereferenceable(self, ctx:LLVMParser.DereferenceableContext):
        pass


    # Enter a parse tree produced by LLVMParser#optDLLStorageClass.
    def enterOptDLLStorageClass(self, ctx:LLVMParser.OptDLLStorageClassContext):
        pass

    # Exit a parse tree produced by LLVMParser#optDLLStorageClass.
    def exitOptDLLStorageClass(self, ctx:LLVMParser.OptDLLStorageClassContext):
        pass


    # Enter a parse tree produced by LLVMParser#dllStorageClass.
    def enterDllStorageClass(self, ctx:LLVMParser.DllStorageClassContext):
        pass

    # Exit a parse tree produced by LLVMParser#dllStorageClass.
    def exitDllStorageClass(self, ctx:LLVMParser.DllStorageClassContext):
        pass


    # Enter a parse tree produced by LLVMParser#optExact.
    def enterOptExact(self, ctx:LLVMParser.OptExactContext):
        pass

    # Exit a parse tree produced by LLVMParser#optExact.
    def exitOptExact(self, ctx:LLVMParser.OptExactContext):
        pass


    # Enter a parse tree produced by LLVMParser#exceptionArgs.
    def enterExceptionArgs(self, ctx:LLVMParser.ExceptionArgsContext):
        pass

    # Exit a parse tree produced by LLVMParser#exceptionArgs.
    def exitExceptionArgs(self, ctx:LLVMParser.ExceptionArgsContext):
        pass


    # Enter a parse tree produced by LLVMParser#exceptionArgList.
    def enterExceptionArgList(self, ctx:LLVMParser.ExceptionArgListContext):
        pass

    # Exit a parse tree produced by LLVMParser#exceptionArgList.
    def exitExceptionArgList(self, ctx:LLVMParser.ExceptionArgListContext):
        pass


    # Enter a parse tree produced by LLVMParser#exceptionArg.
    def enterExceptionArg(self, ctx:LLVMParser.ExceptionArgContext):
        pass

    # Exit a parse tree produced by LLVMParser#exceptionArg.
    def exitExceptionArg(self, ctx:LLVMParser.ExceptionArgContext):
        pass


    # Enter a parse tree produced by LLVMParser#exceptionScope.
    def enterExceptionScope(self, ctx:LLVMParser.ExceptionScopeContext):
        pass

    # Exit a parse tree produced by LLVMParser#exceptionScope.
    def exitExceptionScope(self, ctx:LLVMParser.ExceptionScopeContext):
        pass


    # Enter a parse tree produced by LLVMParser#fastMathFlags.
    def enterFastMathFlags(self, ctx:LLVMParser.FastMathFlagsContext):
        pass

    # Exit a parse tree produced by LLVMParser#fastMathFlags.
    def exitFastMathFlags(self, ctx:LLVMParser.FastMathFlagsContext):
        pass


    # Enter a parse tree produced by LLVMParser#fastMathFlagList.
    def enterFastMathFlagList(self, ctx:LLVMParser.FastMathFlagListContext):
        pass

    # Exit a parse tree produced by LLVMParser#fastMathFlagList.
    def exitFastMathFlagList(self, ctx:LLVMParser.FastMathFlagListContext):
        pass


    # Enter a parse tree produced by LLVMParser#fastMathFlag.
    def enterFastMathFlag(self, ctx:LLVMParser.FastMathFlagContext):
        pass

    # Exit a parse tree produced by LLVMParser#fastMathFlag.
    def exitFastMathFlag(self, ctx:LLVMParser.FastMathFlagContext):
        pass


    # Enter a parse tree produced by LLVMParser#fpred.
    def enterFpred(self, ctx:LLVMParser.FpredContext):
        pass

    # Exit a parse tree produced by LLVMParser#fpred.
    def exitFpred(self, ctx:LLVMParser.FpredContext):
        pass


    # Enter a parse tree produced by LLVMParser#funcAttrs.
    def enterFuncAttrs(self, ctx:LLVMParser.FuncAttrsContext):
        pass

    # Exit a parse tree produced by LLVMParser#funcAttrs.
    def exitFuncAttrs(self, ctx:LLVMParser.FuncAttrsContext):
        pass


    # Enter a parse tree produced by LLVMParser#funcAttrList.
    def enterFuncAttrList(self, ctx:LLVMParser.FuncAttrListContext):
        pass

    # Exit a parse tree produced by LLVMParser#funcAttrList.
    def exitFuncAttrList(self, ctx:LLVMParser.FuncAttrListContext):
        pass


    # Enter a parse tree produced by LLVMParser#funcAttr.
    def enterFuncAttr(self, ctx:LLVMParser.FuncAttrContext):
        pass

    # Exit a parse tree produced by LLVMParser#funcAttr.
    def exitFuncAttr(self, ctx:LLVMParser.FuncAttrContext):
        pass


    # Enter a parse tree produced by LLVMParser#optInBounds.
    def enterOptInBounds(self, ctx:LLVMParser.OptInBoundsContext):
        pass

    # Exit a parse tree produced by LLVMParser#optInBounds.
    def exitOptInBounds(self, ctx:LLVMParser.OptInBoundsContext):
        pass


    # Enter a parse tree produced by LLVMParser#indices.
    def enterIndices(self, ctx:LLVMParser.IndicesContext):
        pass

    # Exit a parse tree produced by LLVMParser#indices.
    def exitIndices(self, ctx:LLVMParser.IndicesContext):
        pass


    # Enter a parse tree produced by LLVMParser#indexList.
    def enterIndexList(self, ctx:LLVMParser.IndexListContext):
        pass

    # Exit a parse tree produced by LLVMParser#indexList.
    def exitIndexList(self, ctx:LLVMParser.IndexListContext):
        pass


    # Enter a parse tree produced by LLVMParser#index.
    def enterIndex(self, ctx:LLVMParser.IndexContext):
        pass

    # Exit a parse tree produced by LLVMParser#index.
    def exitIndex(self, ctx:LLVMParser.IndexContext):
        pass


    # Enter a parse tree produced by LLVMParser#iPred.
    def enterIPred(self, ctx:LLVMParser.IPredContext):
        pass

    # Exit a parse tree produced by LLVMParser#iPred.
    def exitIPred(self, ctx:LLVMParser.IPredContext):
        pass


    # Enter a parse tree produced by LLVMParser#optLinkage.
    def enterOptLinkage(self, ctx:LLVMParser.OptLinkageContext):
        pass

    # Exit a parse tree produced by LLVMParser#optLinkage.
    def exitOptLinkage(self, ctx:LLVMParser.OptLinkageContext):
        pass


    # Enter a parse tree produced by LLVMParser#linkage.
    def enterLinkage(self, ctx:LLVMParser.LinkageContext):
        pass

    # Exit a parse tree produced by LLVMParser#linkage.
    def exitLinkage(self, ctx:LLVMParser.LinkageContext):
        pass


    # Enter a parse tree produced by LLVMParser#optExternLinkage.
    def enterOptExternLinkage(self, ctx:LLVMParser.OptExternLinkageContext):
        pass

    # Exit a parse tree produced by LLVMParser#optExternLinkage.
    def exitOptExternLinkage(self, ctx:LLVMParser.OptExternLinkageContext):
        pass


    # Enter a parse tree produced by LLVMParser#externLinkage.
    def enterExternLinkage(self, ctx:LLVMParser.ExternLinkageContext):
        pass

    # Exit a parse tree produced by LLVMParser#externLinkage.
    def exitExternLinkage(self, ctx:LLVMParser.ExternLinkageContext):
        pass


    # Enter a parse tree produced by LLVMParser#operandBundles.
    def enterOperandBundles(self, ctx:LLVMParser.OperandBundlesContext):
        pass

    # Exit a parse tree produced by LLVMParser#operandBundles.
    def exitOperandBundles(self, ctx:LLVMParser.OperandBundlesContext):
        pass


    # Enter a parse tree produced by LLVMParser#operandBundleList.
    def enterOperandBundleList(self, ctx:LLVMParser.OperandBundleListContext):
        pass

    # Exit a parse tree produced by LLVMParser#operandBundleList.
    def exitOperandBundleList(self, ctx:LLVMParser.OperandBundleListContext):
        pass


    # Enter a parse tree produced by LLVMParser#operandBundle.
    def enterOperandBundle(self, ctx:LLVMParser.OperandBundleContext):
        pass

    # Exit a parse tree produced by LLVMParser#operandBundle.
    def exitOperandBundle(self, ctx:LLVMParser.OperandBundleContext):
        pass


    # Enter a parse tree produced by LLVMParser#overflowFlags.
    def enterOverflowFlags(self, ctx:LLVMParser.OverflowFlagsContext):
        pass

    # Exit a parse tree produced by LLVMParser#overflowFlags.
    def exitOverflowFlags(self, ctx:LLVMParser.OverflowFlagsContext):
        pass


    # Enter a parse tree produced by LLVMParser#overflowFlagList.
    def enterOverflowFlagList(self, ctx:LLVMParser.OverflowFlagListContext):
        pass

    # Exit a parse tree produced by LLVMParser#overflowFlagList.
    def exitOverflowFlagList(self, ctx:LLVMParser.OverflowFlagListContext):
        pass


    # Enter a parse tree produced by LLVMParser#overflowFlag.
    def enterOverflowFlag(self, ctx:LLVMParser.OverflowFlagContext):
        pass

    # Exit a parse tree produced by LLVMParser#overflowFlag.
    def exitOverflowFlag(self, ctx:LLVMParser.OverflowFlagContext):
        pass


    # Enter a parse tree produced by LLVMParser#paramAttrs.
    def enterParamAttrs(self, ctx:LLVMParser.ParamAttrsContext):
        pass

    # Exit a parse tree produced by LLVMParser#paramAttrs.
    def exitParamAttrs(self, ctx:LLVMParser.ParamAttrsContext):
        pass


    # Enter a parse tree produced by LLVMParser#paramAttrList.
    def enterParamAttrList(self, ctx:LLVMParser.ParamAttrListContext):
        pass

    # Exit a parse tree produced by LLVMParser#paramAttrList.
    def exitParamAttrList(self, ctx:LLVMParser.ParamAttrListContext):
        pass


    # Enter a parse tree produced by LLVMParser#paramAttr.
    def enterParamAttr(self, ctx:LLVMParser.ParamAttrContext):
        pass

    # Exit a parse tree produced by LLVMParser#paramAttr.
    def exitParamAttr(self, ctx:LLVMParser.ParamAttrContext):
        pass


    # Enter a parse tree produced by LLVMParser#params.
    def enterParams(self, ctx:LLVMParser.ParamsContext):
        pass

    # Exit a parse tree produced by LLVMParser#params.
    def exitParams(self, ctx:LLVMParser.ParamsContext):
        pass


    # Enter a parse tree produced by LLVMParser#paramList.
    def enterParamList(self, ctx:LLVMParser.ParamListContext):
        pass

    # Exit a parse tree produced by LLVMParser#paramList.
    def exitParamList(self, ctx:LLVMParser.ParamListContext):
        pass


    # Enter a parse tree produced by LLVMParser#param.
    def enterParam(self, ctx:LLVMParser.ParamContext):
        pass

    # Exit a parse tree produced by LLVMParser#param.
    def exitParam(self, ctx:LLVMParser.ParamContext):
        pass


    # Enter a parse tree produced by LLVMParser#optPreemptionSpecifier.
    def enterOptPreemptionSpecifier(self, ctx:LLVMParser.OptPreemptionSpecifierContext):
        pass

    # Exit a parse tree produced by LLVMParser#optPreemptionSpecifier.
    def exitOptPreemptionSpecifier(self, ctx:LLVMParser.OptPreemptionSpecifierContext):
        pass


    # Enter a parse tree produced by LLVMParser#preemptionSpecifier.
    def enterPreemptionSpecifier(self, ctx:LLVMParser.PreemptionSpecifierContext):
        pass

    # Exit a parse tree produced by LLVMParser#preemptionSpecifier.
    def exitPreemptionSpecifier(self, ctx:LLVMParser.PreemptionSpecifierContext):
        pass


    # Enter a parse tree produced by LLVMParser#returnAttrs.
    def enterReturnAttrs(self, ctx:LLVMParser.ReturnAttrsContext):
        pass

    # Exit a parse tree produced by LLVMParser#returnAttrs.
    def exitReturnAttrs(self, ctx:LLVMParser.ReturnAttrsContext):
        pass


    # Enter a parse tree produced by LLVMParser#returnAttrList.
    def enterReturnAttrList(self, ctx:LLVMParser.ReturnAttrListContext):
        pass

    # Exit a parse tree produced by LLVMParser#returnAttrList.
    def exitReturnAttrList(self, ctx:LLVMParser.ReturnAttrListContext):
        pass


    # Enter a parse tree produced by LLVMParser#returnAttr.
    def enterReturnAttr(self, ctx:LLVMParser.ReturnAttrContext):
        pass

    # Exit a parse tree produced by LLVMParser#returnAttr.
    def exitReturnAttr(self, ctx:LLVMParser.ReturnAttrContext):
        pass


    # Enter a parse tree produced by LLVMParser#section.
    def enterSection(self, ctx:LLVMParser.SectionContext):
        pass

    # Exit a parse tree produced by LLVMParser#section.
    def exitSection(self, ctx:LLVMParser.SectionContext):
        pass


    # Enter a parse tree produced by LLVMParser#stackAlignment.
    def enterStackAlignment(self, ctx:LLVMParser.StackAlignmentContext):
        pass

    # Exit a parse tree produced by LLVMParser#stackAlignment.
    def exitStackAlignment(self, ctx:LLVMParser.StackAlignmentContext):
        pass


    # Enter a parse tree produced by LLVMParser#optSyncScope.
    def enterOptSyncScope(self, ctx:LLVMParser.OptSyncScopeContext):
        pass

    # Exit a parse tree produced by LLVMParser#optSyncScope.
    def exitOptSyncScope(self, ctx:LLVMParser.OptSyncScopeContext):
        pass


    # Enter a parse tree produced by LLVMParser#threadLocal.
    def enterThreadLocal(self, ctx:LLVMParser.ThreadLocalContext):
        pass

    # Exit a parse tree produced by LLVMParser#threadLocal.
    def exitThreadLocal(self, ctx:LLVMParser.ThreadLocalContext):
        pass


    # Enter a parse tree produced by LLVMParser#tlsModel.
    def enterTlsModel(self, ctx:LLVMParser.TlsModelContext):
        pass

    # Exit a parse tree produced by LLVMParser#tlsModel.
    def exitTlsModel(self, ctx:LLVMParser.TlsModelContext):
        pass


    # Enter a parse tree produced by LLVMParser#unnamedAddr.
    def enterUnnamedAddr(self, ctx:LLVMParser.UnnamedAddrContext):
        pass

    # Exit a parse tree produced by LLVMParser#unnamedAddr.
    def exitUnnamedAddr(self, ctx:LLVMParser.UnnamedAddrContext):
        pass


    # Enter a parse tree produced by LLVMParser#visibility.
    def enterVisibility(self, ctx:LLVMParser.VisibilityContext):
        pass

    # Exit a parse tree produced by LLVMParser#visibility.
    def exitVisibility(self, ctx:LLVMParser.VisibilityContext):
        pass



del LLVMParser