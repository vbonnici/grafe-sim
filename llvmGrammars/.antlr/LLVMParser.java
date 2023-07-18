// Generated from /home/giacomo/repos/tesi/antlr_llvm/LLVMParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLVMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, EQSIGN=2, GT=3, VDASH=4, COMMA=5, BANG=6, DOTS=7, LPAREN=8, RPAREN=9, 
		LBRACK=10, RBRACK=11, LBRACE=12, RBRACE=13, STAR=14, ACQ_REL=15, ACQUIRE=16, 
		ADD=17, ADDRSPACE=18, ADDRSPACECAST=19, AFN=20, ALIAS=21, ALIGNCOLON=22, 
		ALIGN=23, ALIGNSTACK=24, ALLOCA=25, ALLOCSIZE=26, ALWAYSINLINE=27, AMDGPU_CS=28, 
		AMDGPU_ES=29, AMDGPU_GS=30, AMDGPU_HS=31, AMDGPU_KERNEL=32, AMDGPU_LS=33, 
		AMDGPU_PS=34, AMDGPU_VS=35, AND=36, ANY=37, ANYREGCC=38, APPENDING=39, 
		ARCP=40, ARGCOLON=41, ARGMEMONLY=42, ARM_AAPCSCC=43, ARM_AAPCS_VFPCC=44, 
		ARM_APCSCC=45, ASHR=46, ASM=47, ATOMIC=48, ATOMICRMW=49, ATTRIBUTESCOLON=50, 
		ATTRIBUTES=51, AVAILABLE_EXTERNALLY=52, AVR_INTRCC=53, AVR_SIGNALCC=54, 
		BASETYPECOLON=55, BITCAST=56, BLOCKADDRESS=57, BR=58, BUILTIN=59, BYVAL=60, 
		C=61, CALL=62, CALLER=63, CATCH=64, CATCHPAD=65, CATCHRET=66, CATCHSWITCH=67, 
		CCCOLON=68, CC=69, CCC=70, CHECKSUMCOLON=71, CHECKSUMKINDCOLON=72, CLEANUP=73, 
		CLEANUPPAD=74, CLEANUPRET=75, CMPXCHG=76, COLD=77, COLDCC=78, COLUMNCOLON=79, 
		COMDAT=80, COMMON=81, CONFIGMACROSCOLON=82, CONSTANT=83, CONTAININGTYPECOLON=84, 
		CONTRACT=85, CONVERGENT=86, COUNTCOLON=87, CXX_FAST_TLSCC=88, DATALAYOUT=89, 
		DEBUGINFOFORPROFILINGCOLON=90, DECLARATIONCOLON=91, DECLARE=92, DEFAULT=93, 
		DEFINE=94, DEREFERENCEABLE=95, DEREFERENCEABLE_OR_NULL=96, NOTDIBASICTYPE=97, 
		NOTDICOMPILEUNIT=98, NOTDICOMPOSITETYPE=99, NOTDIDERIVEDTYPE=100, NOTDIENUMERATOR=101, 
		NOTDIEXPRESSION=102, NOTDIFILE=103, NOTDIGLOBALVARIABLE=104, NOTDIGLOBALVARIABLEEXPRESSION=105, 
		NOTDIIMPORTEDENTITY=106, NOTDILEXICALBLOCK=107, NOTDILEXICALBLOCKFILE=108, 
		NOTDILOCALVARIABLE=109, NOTDILOCATION=110, NOTDIMACRO=111, NOTDIMACROFILE=112, 
		NOTDIMODULE=113, NOTDINAMESPACE=114, NOTDIOBJCPROPERTY=115, DIRECTORYCOLON=116, 
		DISCRIMINATORCOLON=117, DISTINCT=118, NOTDISUBPROGRAM=119, NOTDISUBRANGE=120, 
		NOTDISUBROUTINETYPE=121, NOTDITEMPLATETYPEPARAMETER=122, NOTDITEMPLATEVALUEPARAMETER=123, 
		DLLEXPORT=124, DLLIMPORT=125, DOUBLE=126, DSO_LOCAL=127, DSO_PREEMPTABLE=128, 
		DWARFADDRESSSPACECOLON=129, DWOIDCOLON=130, ELEMENTSCOLON=131, EMISSIONKINDCOLON=132, 
		ENCODINGCOLON=133, ENTITYCOLON=134, ENUMSCOLON=135, EQ=136, EXACT=137, 
		EXACTMATCH=138, EXPORTSYMBOLSCOLON=139, EXPRCOLON=140, EXTERNAL=141, EXTERNALLY_INITIALIZED=142, 
		EXTERN_WEAK=143, EXTRACTELEMENT=144, EXTRACTVALUE=145, EXTRADATACOLON=146, 
		FADD=147, FALSE=148, FAST=149, FASTCC=150, FCMP=151, FDIV=152, FENCE=153, 
		FILECOLON=154, FILENAMECOLON=155, FILTER=156, FLAGSCOLON=157, FLOAT=158, 
		FMUL=159, FP128=160, FPEXT=161, FPTOSI=162, FPTOUI=163, FPTRUNC=164, FREM=165, 
		FROM=166, FSUB=167, FULLDEBUG=168, GC=169, NOTGENERICDINODE=170, GETELEMENTPTR=171, 
		GETTERCOLON=172, GHCCC=173, GLOBAL=174, GLOBALSCOLON=175, GNUPUBNAMESCOLON=176, 
		HALF=177, HEADERCOLON=178, HHVMCC=179, HHVM_CCC=180, HIDDEN_VISIB=181, 
		ICMP=182, IDENTIFIERCOLON=183, IFUNC=184, IMPORTSCOLON=185, INACCESSIBLEMEMONLY=186, 
		INACCESSIBLEMEM_OR_ARGMEMONLY=187, INALLOCA=188, INBOUNDS=189, INCLUDEPATHCOLON=190, 
		INDIRECTBR=191, INITIALEXEC=192, INLINEDATCOLON=193, INLINEHINT=194, INRANGE=195, 
		INREG=196, INSERTELEMENT=197, INSERTVALUE=198, INTELDIALECT=199, INTEL_OCL_BICC=200, 
		INTERNAL=201, INTTOPTR=202, INVOKE=203, ISDEFINITIONCOLON=204, ISLOCALCOLON=205, 
		ISOPTIMIZEDCOLON=206, ISUNSIGNEDCOLON=207, ISYSROOTCOLON=208, JUMPTABLE=209, 
		LABEL=210, LANDINGPAD=211, LANGUAGECOLON=212, LARGEST=213, LINECOLON=214, 
		LINETABLESONLY=215, LINKAGENAMECOLON=216, LINKONCE=217, LINKONCE_ODR=218, 
		LOAD=219, LOCALDYNAMIC=220, LOCALEXEC=221, LOCAL_UNNAMED_ADDR=222, LOWERBOUNDCOLON=223, 
		LSHR=224, MACROSCOLON=225, MAX=226, METADATA=227, MIN=228, MINSIZE=229, 
		MODULE=230, MONOTONIC=231, MSP430_INTRCC=232, MUL=233, MUSTTAIL=234, NAKED=235, 
		NAMECOLON=236, NAND=237, NE=238, NEST=239, NINF=240, NNAN=241, NOALIAS=242, 
		NOBUILTIN=243, NOCAPTURE=244, NODEBUG=245, NODESCOLON=246, NODUPLICATE=247, 
		NODUPLICATES=248, NOIMPLICITFLOAT=249, NOINLINE=250, NONE=251, NONLAZYBIND=252, 
		NONNULL=253, NORECURSE=254, NOREDZONE=255, NORETURN=256, NOTAIL=257, NOUNWIND=258, 
		NSW=259, NSZ=260, NULL=261, NUW=262, OEQ=263, OFFSETCOLON=264, OGE=265, 
		OGT=266, OLE=267, OLT=268, ONE=269, OPAQUE=270, OPERANDSCOLON=271, OPTNONE=272, 
		OPTSIZE=273, OR=274, ORD=275, PERSONALITY=276, PHI=277, PPC_FP128=278, 
		PREFIX=279, PRESERVE_ALLCC=280, PRESERVE_MOSTCC=281, PRIVATE=282, PRODUCERCOLON=283, 
		PROLOGUE=284, PROTECTED=285, PTRTOINT=286, PTX_DEVICE=287, PTX_KERNEL=288, 
		READNONE=289, READONLY=290, REASSOC=291, RELEASE=292, RESUME=293, RET=294, 
		RETAINEDTYPESCOLON=295, RETURNED=296, RETURNS_TWICE=297, RUNTIMELANGCOLON=298, 
		RUNTIMEVERSIONCOLON=299, SAFESTACK=300, SAMESIZE=301, SANITIZE_ADDRESS=302, 
		SANITIZE_HWADDRESS=303, SANITIZE_MEMORY=304, SANITIZE_THREAD=305, SCOPECOLON=306, 
		SCOPELINECOLON=307, SDIV=308, SECTION=309, SELECT=310, SEQ_CST=311, SETTERCOLON=312, 
		SEXT=313, SGE=314, SGT=315, SHL=316, SHUFFLEVECTOR=317, SIDEEFFECT=318, 
		SIGNEXT=319, SITOFP=320, SIZECOLON=321, SLE=322, SLT=323, SOURCE_FILENAME=324, 
		SPECULATABLE=325, SPIR_FUNC=326, SPIR_KERNEL=327, SPLITDEBUGFILENAMECOLON=328, 
		SPLITDEBUGINLININGCOLON=329, SREM=330, SRET=331, SSP=332, SSPREQ=333, 
		SSPSTRONG=334, STORE=335, STRICTFP=336, SUB=337, SWIFTCC=338, SWIFTERROR=339, 
		SWIFTSELF=340, SWITCH=341, SYNCSCOPE=342, TAGCOLON=343, TAIL=344, TARGET=345, 
		TEMPLATEPARAMSCOLON=346, THISADJUSTMENTCOLON=347, THREAD_LOCAL=348, THROWNTYPESCOLON=349, 
		TO=350, TOKEN=351, TRIPLE=352, TRUE=353, TRUNC=354, TYPECOLON=355, TYPE=356, 
		TYPESCOLON=357, UDIV=358, UEQ=359, UGE=360, UGT=361, UITOFP=362, ULE=363, 
		ULT=364, UMAX=365, UMIN=366, UNDEF=367, UNE=368, UNITCOLON=369, UNNAMED_ADDR=370, 
		UNO=371, UNORDERED=372, UNREACHABLE=373, UNWIND=374, UREM=375, USELISTORDER=376, 
		USELISTORDER_BB=377, UWTABLE=378, VA_ARG=379, VALUECOLON=380, VARCOLON=381, 
		VARIABLESCOLON=382, VIRTUALINDEXCOLON=383, VIRTUALITYCOLON=384, VOID=385, 
		VTABLEHOLDERCOLON=386, WEAK=387, WEAK_ODR=388, WEBKIT_JSCC=389, WIN64CC=390, 
		WITHIN=391, WRITEONLY=392, X=393, X86_64_SYSVCC=394, X86_FASTCALLCC=395, 
		X86_FP80=396, X86_INTRCC=397, X86_MMX=398, X86_REGCALLCC=399, X86_STDCALLCC=400, 
		X86_THISCALLCC=401, X86_VECTORCALLCC=402, XCHG=403, XOR=404, ZEROEXT=405, 
		ZEROINITIALIZER=406, ZEXT=407, VOLATILE=408, COMMENT=409, WHITESPACE=410, 
		ATTR_GROUP_ID=411, COMDAT_NAME=412, METADATA_NAME=413, METADATA_ID=414, 
		DWARF_TAG=415, DWARF_ATT_ENCODING=416, DI_FLAG=417, DWARF_LANG=418, DWARF_CC=419, 
		CHECKSUM_KIND=420, DWARF_VIRTUALITY=421, DWARF_MACINFO=422, DWARF_OP=423, 
		INT_LIT=424, DECIMAL_LIT=425, DECIMALS=426, FLOAT_LIT=427, FRAC_LIT=428, 
		SIGN=429, SCI_LIT=430, FLOAT_HEX_LIT=431, STRING_LIT=432, QUOTED_STRING=433, 
		INT_TYPE=434, NAME=435, ESCAPE_NAME=436, QUOTED_NAME=437, ID=438, GLOBAL_IDENT=439, 
		GLOBAL_NAME=440, GLOBAL_ID=441, LOCAL_IDENT=442, LOCAL_NAME=443, LOCAL_ID=444, 
		LABEL_IDENT=445;
	public static final int
		RULE_mySingleInstruction = 0, RULE_module = 1, RULE_topLevelEntities = 2, 
		RULE_topLevelEntityList = 3, RULE_topLevelEntity = 4, RULE_sourceFilename = 5, 
		RULE_targetDefinition = 6, RULE_moduleAsm = 7, RULE_typeDef = 8, RULE_comdatDef = 9, 
		RULE_selectionKind = 10, RULE_globalDecl = 11, RULE_globalDef = 12, RULE_optExternallyInitialized = 13, 
		RULE_immutable = 14, RULE_globalAttrs = 15, RULE_globalAttrList = 16, 
		RULE_globalAttr = 17, RULE_indirectSymbolDef = 18, RULE_alias = 19, RULE_functionDecl = 20, 
		RULE_functionDef = 21, RULE_functionHeader = 22, RULE_optGC = 23, RULE_optPrefix = 24, 
		RULE_optPrologue = 25, RULE_optPersonality = 26, RULE_functionBody = 27, 
		RULE_attrGroupDef = 28, RULE_namedMetadataDef = 29, RULE_metadataNodes = 30, 
		RULE_metadataNodeList = 31, RULE_metadataNode = 32, RULE_metadataDef = 33, 
		RULE_optDistinct = 34, RULE_useListOrders = 35, RULE_useListOrderList = 36, 
		RULE_useListOrder = 37, RULE_useListOrderBB = 38, RULE_globalIdent = 39, 
		RULE_localIdent = 40, RULE_labelIdent = 41, RULE_attrGroupID = 42, RULE_comdatName = 43, 
		RULE_metadataName = 44, RULE_metadataID = 45, RULE_llvmType = 46, RULE_concreteNonRecType = 47, 
		RULE_voidType = 48, RULE_intType = 49, RULE_floatType = 50, RULE_floatKind = 51, 
		RULE_mmxType = 52, RULE_optAddrSpace = 53, RULE_addrSpace = 54, RULE_vectorType = 55, 
		RULE_labelType = 56, RULE_tokenType = 57, RULE_metadataType = 58, RULE_arrayType = 59, 
		RULE_structType = 60, RULE_typeList = 61, RULE_opaqueType = 62, RULE_namedType = 63, 
		RULE_value = 64, RULE_inlineAsm = 65, RULE_optSideEffect = 66, RULE_optAlignStack = 67, 
		RULE_optIntelDialect = 68, RULE_constant = 69, RULE_boolConst = 70, RULE_boolLit = 71, 
		RULE_intConst = 72, RULE_intLit = 73, RULE_floatConst = 74, RULE_nullConst = 75, 
		RULE_noneConst = 76, RULE_structConst = 77, RULE_arrayConst = 78, RULE_charArrayConst = 79, 
		RULE_stringLit = 80, RULE_vectorConst = 81, RULE_zeroInitializerConst = 82, 
		RULE_undefConst = 83, RULE_blockAddressConst = 84, RULE_constantExpr = 85, 
		RULE_addExpr = 86, RULE_fAddExpr = 87, RULE_subExpr = 88, RULE_fSubExpr = 89, 
		RULE_mulExpr = 90, RULE_fMulExpr = 91, RULE_uDivExpr = 92, RULE_sDivExpr = 93, 
		RULE_fDivExpr = 94, RULE_uRemExpr = 95, RULE_sRemExpr = 96, RULE_fRemExpr = 97, 
		RULE_shlExpr = 98, RULE_lShrExpr = 99, RULE_ashrExpr = 100, RULE_andExpr = 101, 
		RULE_orExpr = 102, RULE_xorExpr = 103, RULE_extractElementExpr = 104, 
		RULE_insertElementExpr = 105, RULE_shuffleVectorExpr = 106, RULE_extractValueExpr = 107, 
		RULE_insertValueExpr = 108, RULE_getElementPtrExpr = 109, RULE_gepConstIndices = 110, 
		RULE_gepConstIndexList = 111, RULE_gepConstIndex = 112, RULE_optInrange = 113, 
		RULE_truncExpr = 114, RULE_zExtExpr = 115, RULE_sExtExpr = 116, RULE_fPTruncExpr = 117, 
		RULE_fpExtExpr = 118, RULE_fpToUIExpr = 119, RULE_fpToSIExpr = 120, RULE_uiToFPExpr = 121, 
		RULE_siToFPExpr = 122, RULE_ptrToIntExpr = 123, RULE_intToPtrExpr = 124, 
		RULE_bitCastExpr = 125, RULE_addrSpaceCastExpr = 126, RULE_iCmpExpr = 127, 
		RULE_fCmpExpr = 128, RULE_selectExpr = 129, RULE_basicBlockList = 130, 
		RULE_basicBlock = 131, RULE_optLabelIdent = 132, RULE_instructions = 133, 
		RULE_instructionList = 134, RULE_instruction = 135, RULE_valueInstruction = 136, 
		RULE_addInst = 137, RULE_fAddInst = 138, RULE_subInst = 139, RULE_fSubInst = 140, 
		RULE_mulInst = 141, RULE_fMulInst = 142, RULE_uDivInst = 143, RULE_sDivInst = 144, 
		RULE_fDivInst = 145, RULE_uRemInst = 146, RULE_sRemInst = 147, RULE_fRemInst = 148, 
		RULE_shlInst = 149, RULE_lshrInst = 150, RULE_ashrInst = 151, RULE_andInst = 152, 
		RULE_orInst = 153, RULE_xorInst = 154, RULE_extractElementInst = 155, 
		RULE_insertElementInst = 156, RULE_shuffleVectorInst = 157, RULE_extractValueInst = 158, 
		RULE_insertValueInst = 159, RULE_allocaInst = 160, RULE_optInAlloca = 161, 
		RULE_optSwiftError = 162, RULE_loadInst = 163, RULE_storeInst = 164, RULE_fenceInst = 165, 
		RULE_cmpXchgInst = 166, RULE_optWeak = 167, RULE_atomicRMWInst = 168, 
		RULE_binOp = 169, RULE_getElementPtrInst = 170, RULE_truncInst = 171, 
		RULE_zExtInst = 172, RULE_sExtInst = 173, RULE_fpTruncInst = 174, RULE_fpExtInst = 175, 
		RULE_fpToUIInst = 176, RULE_fpToSIInst = 177, RULE_uiToFPInst = 178, RULE_siToFPInst = 179, 
		RULE_ptrToIntInst = 180, RULE_intToPtrInst = 181, RULE_bitCastInst = 182, 
		RULE_addrSpaceCastInst = 183, RULE_iCmpInst = 184, RULE_fCmpInst = 185, 
		RULE_phiInst = 186, RULE_incList = 187, RULE_inc = 188, RULE_selectInst = 189, 
		RULE_callInst = 190, RULE_optTail = 191, RULE_vaArgInst = 192, RULE_landingPadInst = 193, 
		RULE_optCleanup = 194, RULE_clauses = 195, RULE_clauseList = 196, RULE_clause = 197, 
		RULE_catchPadInst = 198, RULE_cleanupPadInst = 199, RULE_terminator = 200, 
		RULE_retTerm = 201, RULE_brTerm = 202, RULE_condBrTerm = 203, RULE_switchTerm = 204, 
		RULE_cases = 205, RULE_caseList = 206, RULE_llvmCase = 207, RULE_indirectBrTerm = 208, 
		RULE_labelList = 209, RULE_label = 210, RULE_invokeTerm = 211, RULE_resumeTerm = 212, 
		RULE_catchSwitchTerm = 213, RULE_catchRetTerm = 214, RULE_cleanupRetTerm = 215, 
		RULE_unreachableTerm = 216, RULE_unwindTarget = 217, RULE_mdTuple = 218, 
		RULE_mdFields = 219, RULE_mdFieldList = 220, RULE_mdField = 221, RULE_metadata = 222, 
		RULE_mdString = 223, RULE_metadataAttachment = 224, RULE_mdNode = 225, 
		RULE_metadataAttachments = 226, RULE_metadataAttachmentList = 227, RULE_optCommaSepMetadataAttachmentList = 228, 
		RULE_commaSepMetadataAttachmentList = 229, RULE_specializedMDNode = 230, 
		RULE_diCompileUnit = 231, RULE_diCompileUnitFields = 232, RULE_diCompileUnitFieldList = 233, 
		RULE_diCompileUnitField = 234, RULE_diFile = 235, RULE_diFileFields = 236, 
		RULE_diFileFieldList = 237, RULE_diFileField = 238, RULE_diBasicType = 239, 
		RULE_diBasicTypeFields = 240, RULE_diBasicTypeFieldList = 241, RULE_diBasicTypeField = 242, 
		RULE_diSubroutineType = 243, RULE_diSubroutineTypeFields = 244, RULE_diSubroutineTypeFieldList = 245, 
		RULE_diSubroutineTypeField = 246, RULE_diDerivedType = 247, RULE_diDerivedTypeFields = 248, 
		RULE_diDerivedTypeFieldList = 249, RULE_diDerivedTypeField = 250, RULE_diCompositeType = 251, 
		RULE_diCompositeTypeFields = 252, RULE_diCompositeTypeFieldList = 253, 
		RULE_diCompositeTypeField = 254, RULE_diSubrange = 255, RULE_diSubrangeFields = 256, 
		RULE_diSubrangeFieldList = 257, RULE_diSubrangeField = 258, RULE_diEnumerator = 259, 
		RULE_diEnumeratorFields = 260, RULE_diEnumeratorFieldList = 261, RULE_diEnumeratorField = 262, 
		RULE_diTemplateTypeParameter = 263, RULE_diTemplateTypeParameterFields = 264, 
		RULE_diTemplateTypeParameterFieldList = 265, RULE_diTemplateTypeParameterField = 266, 
		RULE_diTemplateValueParameter = 267, RULE_diTemplateValueParameterFields = 268, 
		RULE_diTemplateValueParameterFieldList = 269, RULE_diTemplateValueParameterField = 270, 
		RULE_diModule = 271, RULE_diModuleFields = 272, RULE_diModuleFieldList = 273, 
		RULE_diModuleField = 274, RULE_diNamespace = 275, RULE_diNamespaceFields = 276, 
		RULE_diNamespaceFieldList = 277, RULE_diNamespaceField = 278, RULE_diGlobalVariable = 279, 
		RULE_diGlobalVariableFields = 280, RULE_diGlobalVariableFieldList = 281, 
		RULE_diGlobalVariableField = 282, RULE_diSubprogram = 283, RULE_diSubprogramFields = 284, 
		RULE_diSubprogramFieldList = 285, RULE_diSubprogramField = 286, RULE_diLexicalBlock = 287, 
		RULE_diLexicalBlockFields = 288, RULE_diLexicalBlockFieldList = 289, RULE_diLexicalBlockField = 290, 
		RULE_diLexicalBlockFile = 291, RULE_diLexicalBlockFileFields = 292, RULE_diLexicalBlockFileFieldList = 293, 
		RULE_diLexicalBlockFileField = 294, RULE_diLocation = 295, RULE_diLocationFields = 296, 
		RULE_diLocationFieldList = 297, RULE_diLocationField = 298, RULE_diLocalVariable = 299, 
		RULE_diLocalVariableFields = 300, RULE_diLocalVariableFieldList = 301, 
		RULE_diLocalVariableField = 302, RULE_diExpression = 303, RULE_diExpressionFields = 304, 
		RULE_diExpressionFieldList = 305, RULE_diExpressionField = 306, RULE_diGlobalVariableExpression = 307, 
		RULE_diGlobalVariableExpressionFields = 308, RULE_diGlobalVariableExpressionFieldList = 309, 
		RULE_diGlobalVariableExpressionField = 310, RULE_diObjCProperty = 311, 
		RULE_diObjCPropertyFields = 312, RULE_diObjCPropertyFieldList = 313, RULE_diObjCPropertyField = 314, 
		RULE_diImportedEntity = 315, RULE_diImportedEntityFields = 316, RULE_diImportedEntityFieldList = 317, 
		RULE_diImportedEntityField = 318, RULE_diMacro = 319, RULE_diMacroFields = 320, 
		RULE_diMacroFieldList = 321, RULE_diMacroField = 322, RULE_diMacroFile = 323, 
		RULE_diMacroFileFields = 324, RULE_diMacroFileFieldList = 325, RULE_diMacroFileField = 326, 
		RULE_genericDINode = 327, RULE_genericDINodeFields = 328, RULE_genericDINodeFieldList = 329, 
		RULE_genericDINodeField = 330, RULE_fileField = 331, RULE_isOptimizedField = 332, 
		RULE_tagField = 333, RULE_nameField = 334, RULE_sizeField = 335, RULE_alignField = 336, 
		RULE_flagsField = 337, RULE_lineField = 338, RULE_scopeField = 339, RULE_baseTypeField = 340, 
		RULE_offsetField = 341, RULE_templateParamsField = 342, RULE_intOrMDField = 343, 
		RULE_typeField = 344, RULE_linkageNameField = 345, RULE_isLocalField = 346, 
		RULE_isDefinitionField = 347, RULE_declarationField = 348, RULE_columnField = 349, 
		RULE_typeMacinfoField = 350, RULE_checksumkind = 351, RULE_diFlagList = 352, 
		RULE_diFlag = 353, RULE_dwarfAttEncoding = 354, RULE_dwarfCC = 355, RULE_dwarfLang = 356, 
		RULE_dwarfMacinfo = 357, RULE_dwarfOp = 358, RULE_dwarfTag = 359, RULE_dwarfVirtuality = 360, 
		RULE_emissionKind = 361, RULE_typeValues = 362, RULE_typeValueList = 363, 
		RULE_commaSepTypeValueList = 364, RULE_typeValue = 365, RULE_typeConsts = 366, 
		RULE_typeConstList = 367, RULE_typeConst = 368, RULE_alignment = 369, 
		RULE_allocSize = 370, RULE_args = 371, RULE_argList = 372, RULE_arg = 373, 
		RULE_atomicOrdering = 374, RULE_optCallingConv = 375, RULE_callingConv = 376, 
		RULE_optComdat = 377, RULE_comdat = 378, RULE_dereferenceable = 379, RULE_optDLLStorageClass = 380, 
		RULE_dllStorageClass = 381, RULE_optExact = 382, RULE_exceptionArgs = 383, 
		RULE_exceptionArgList = 384, RULE_exceptionArg = 385, RULE_exceptionScope = 386, 
		RULE_fastMathFlags = 387, RULE_fastMathFlagList = 388, RULE_fastMathFlag = 389, 
		RULE_fpred = 390, RULE_funcAttrs = 391, RULE_funcAttrList = 392, RULE_funcAttr = 393, 
		RULE_optInBounds = 394, RULE_indices = 395, RULE_indexList = 396, RULE_index = 397, 
		RULE_iPred = 398, RULE_optLinkage = 399, RULE_linkage = 400, RULE_optExternLinkage = 401, 
		RULE_externLinkage = 402, RULE_operandBundles = 403, RULE_operandBundleList = 404, 
		RULE_operandBundle = 405, RULE_overflowFlags = 406, RULE_overflowFlagList = 407, 
		RULE_overflowFlag = 408, RULE_paramAttrs = 409, RULE_paramAttrList = 410, 
		RULE_paramAttr = 411, RULE_params = 412, RULE_paramList = 413, RULE_param = 414, 
		RULE_optPreemptionSpecifier = 415, RULE_preemptionSpecifier = 416, RULE_returnAttrs = 417, 
		RULE_returnAttrList = 418, RULE_returnAttr = 419, RULE_section = 420, 
		RULE_stackAlignment = 421, RULE_optSyncScope = 422, RULE_threadLocal = 423, 
		RULE_tlsModel = 424, RULE_unnamedAddr = 425, RULE_visibility = 426;
	private static String[] makeRuleNames() {
		return new String[] {
			"mySingleInstruction", "module", "topLevelEntities", "topLevelEntityList", 
			"topLevelEntity", "sourceFilename", "targetDefinition", "moduleAsm", 
			"typeDef", "comdatDef", "selectionKind", "globalDecl", "globalDef", "optExternallyInitialized", 
			"immutable", "globalAttrs", "globalAttrList", "globalAttr", "indirectSymbolDef", 
			"alias", "functionDecl", "functionDef", "functionHeader", "optGC", "optPrefix", 
			"optPrologue", "optPersonality", "functionBody", "attrGroupDef", "namedMetadataDef", 
			"metadataNodes", "metadataNodeList", "metadataNode", "metadataDef", "optDistinct", 
			"useListOrders", "useListOrderList", "useListOrder", "useListOrderBB", 
			"globalIdent", "localIdent", "labelIdent", "attrGroupID", "comdatName", 
			"metadataName", "metadataID", "llvmType", "concreteNonRecType", "voidType", 
			"intType", "floatType", "floatKind", "mmxType", "optAddrSpace", "addrSpace", 
			"vectorType", "labelType", "tokenType", "metadataType", "arrayType", 
			"structType", "typeList", "opaqueType", "namedType", "value", "inlineAsm", 
			"optSideEffect", "optAlignStack", "optIntelDialect", "constant", "boolConst", 
			"boolLit", "intConst", "intLit", "floatConst", "nullConst", "noneConst", 
			"structConst", "arrayConst", "charArrayConst", "stringLit", "vectorConst", 
			"zeroInitializerConst", "undefConst", "blockAddressConst", "constantExpr", 
			"addExpr", "fAddExpr", "subExpr", "fSubExpr", "mulExpr", "fMulExpr", 
			"uDivExpr", "sDivExpr", "fDivExpr", "uRemExpr", "sRemExpr", "fRemExpr", 
			"shlExpr", "lShrExpr", "ashrExpr", "andExpr", "orExpr", "xorExpr", "extractElementExpr", 
			"insertElementExpr", "shuffleVectorExpr", "extractValueExpr", "insertValueExpr", 
			"getElementPtrExpr", "gepConstIndices", "gepConstIndexList", "gepConstIndex", 
			"optInrange", "truncExpr", "zExtExpr", "sExtExpr", "fPTruncExpr", "fpExtExpr", 
			"fpToUIExpr", "fpToSIExpr", "uiToFPExpr", "siToFPExpr", "ptrToIntExpr", 
			"intToPtrExpr", "bitCastExpr", "addrSpaceCastExpr", "iCmpExpr", "fCmpExpr", 
			"selectExpr", "basicBlockList", "basicBlock", "optLabelIdent", "instructions", 
			"instructionList", "instruction", "valueInstruction", "addInst", "fAddInst", 
			"subInst", "fSubInst", "mulInst", "fMulInst", "uDivInst", "sDivInst", 
			"fDivInst", "uRemInst", "sRemInst", "fRemInst", "shlInst", "lshrInst", 
			"ashrInst", "andInst", "orInst", "xorInst", "extractElementInst", "insertElementInst", 
			"shuffleVectorInst", "extractValueInst", "insertValueInst", "allocaInst", 
			"optInAlloca", "optSwiftError", "loadInst", "storeInst", "fenceInst", 
			"cmpXchgInst", "optWeak", "atomicRMWInst", "binOp", "getElementPtrInst", 
			"truncInst", "zExtInst", "sExtInst", "fpTruncInst", "fpExtInst", "fpToUIInst", 
			"fpToSIInst", "uiToFPInst", "siToFPInst", "ptrToIntInst", "intToPtrInst", 
			"bitCastInst", "addrSpaceCastInst", "iCmpInst", "fCmpInst", "phiInst", 
			"incList", "inc", "selectInst", "callInst", "optTail", "vaArgInst", "landingPadInst", 
			"optCleanup", "clauses", "clauseList", "clause", "catchPadInst", "cleanupPadInst", 
			"terminator", "retTerm", "brTerm", "condBrTerm", "switchTerm", "cases", 
			"caseList", "llvmCase", "indirectBrTerm", "labelList", "label", "invokeTerm", 
			"resumeTerm", "catchSwitchTerm", "catchRetTerm", "cleanupRetTerm", "unreachableTerm", 
			"unwindTarget", "mdTuple", "mdFields", "mdFieldList", "mdField", "metadata", 
			"mdString", "metadataAttachment", "mdNode", "metadataAttachments", "metadataAttachmentList", 
			"optCommaSepMetadataAttachmentList", "commaSepMetadataAttachmentList", 
			"specializedMDNode", "diCompileUnit", "diCompileUnitFields", "diCompileUnitFieldList", 
			"diCompileUnitField", "diFile", "diFileFields", "diFileFieldList", "diFileField", 
			"diBasicType", "diBasicTypeFields", "diBasicTypeFieldList", "diBasicTypeField", 
			"diSubroutineType", "diSubroutineTypeFields", "diSubroutineTypeFieldList", 
			"diSubroutineTypeField", "diDerivedType", "diDerivedTypeFields", "diDerivedTypeFieldList", 
			"diDerivedTypeField", "diCompositeType", "diCompositeTypeFields", "diCompositeTypeFieldList", 
			"diCompositeTypeField", "diSubrange", "diSubrangeFields", "diSubrangeFieldList", 
			"diSubrangeField", "diEnumerator", "diEnumeratorFields", "diEnumeratorFieldList", 
			"diEnumeratorField", "diTemplateTypeParameter", "diTemplateTypeParameterFields", 
			"diTemplateTypeParameterFieldList", "diTemplateTypeParameterField", "diTemplateValueParameter", 
			"diTemplateValueParameterFields", "diTemplateValueParameterFieldList", 
			"diTemplateValueParameterField", "diModule", "diModuleFields", "diModuleFieldList", 
			"diModuleField", "diNamespace", "diNamespaceFields", "diNamespaceFieldList", 
			"diNamespaceField", "diGlobalVariable", "diGlobalVariableFields", "diGlobalVariableFieldList", 
			"diGlobalVariableField", "diSubprogram", "diSubprogramFields", "diSubprogramFieldList", 
			"diSubprogramField", "diLexicalBlock", "diLexicalBlockFields", "diLexicalBlockFieldList", 
			"diLexicalBlockField", "diLexicalBlockFile", "diLexicalBlockFileFields", 
			"diLexicalBlockFileFieldList", "diLexicalBlockFileField", "diLocation", 
			"diLocationFields", "diLocationFieldList", "diLocationField", "diLocalVariable", 
			"diLocalVariableFields", "diLocalVariableFieldList", "diLocalVariableField", 
			"diExpression", "diExpressionFields", "diExpressionFieldList", "diExpressionField", 
			"diGlobalVariableExpression", "diGlobalVariableExpressionFields", "diGlobalVariableExpressionFieldList", 
			"diGlobalVariableExpressionField", "diObjCProperty", "diObjCPropertyFields", 
			"diObjCPropertyFieldList", "diObjCPropertyField", "diImportedEntity", 
			"diImportedEntityFields", "diImportedEntityFieldList", "diImportedEntityField", 
			"diMacro", "diMacroFields", "diMacroFieldList", "diMacroField", "diMacroFile", 
			"diMacroFileFields", "diMacroFileFieldList", "diMacroFileField", "genericDINode", 
			"genericDINodeFields", "genericDINodeFieldList", "genericDINodeField", 
			"fileField", "isOptimizedField", "tagField", "nameField", "sizeField", 
			"alignField", "flagsField", "lineField", "scopeField", "baseTypeField", 
			"offsetField", "templateParamsField", "intOrMDField", "typeField", "linkageNameField", 
			"isLocalField", "isDefinitionField", "declarationField", "columnField", 
			"typeMacinfoField", "checksumkind", "diFlagList", "diFlag", "dwarfAttEncoding", 
			"dwarfCC", "dwarfLang", "dwarfMacinfo", "dwarfOp", "dwarfTag", "dwarfVirtuality", 
			"emissionKind", "typeValues", "typeValueList", "commaSepTypeValueList", 
			"typeValue", "typeConsts", "typeConstList", "typeConst", "alignment", 
			"allocSize", "args", "argList", "arg", "atomicOrdering", "optCallingConv", 
			"callingConv", "optComdat", "comdat", "dereferenceable", "optDLLStorageClass", 
			"dllStorageClass", "optExact", "exceptionArgs", "exceptionArgList", "exceptionArg", 
			"exceptionScope", "fastMathFlags", "fastMathFlagList", "fastMathFlag", 
			"fpred", "funcAttrs", "funcAttrList", "funcAttr", "optInBounds", "indices", 
			"indexList", "index", "iPred", "optLinkage", "linkage", "optExternLinkage", 
			"externLinkage", "operandBundles", "operandBundleList", "operandBundle", 
			"overflowFlags", "overflowFlagList", "overflowFlag", "paramAttrs", "paramAttrList", 
			"paramAttr", "params", "paramList", "param", "optPreemptionSpecifier", 
			"preemptionSpecifier", "returnAttrs", "returnAttrList", "returnAttr", 
			"section", "stackAlignment", "optSyncScope", "threadLocal", "tlsModel", 
			"unnamedAddr", "visibility"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'='", "'>'", "'|'", "','", "'!'", "'...'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'*'", "'acq_rel'", "'acquire'", "'add'", 
			"'addrspace'", "'addrspacecast'", "'afn'", "'alias'", "'align:'", "'align'", 
			"'alignstack'", "'alloca'", "'allocsize'", "'alwaysinline'", "'amdgpu_cs'", 
			"'amdgpu_es'", "'amdgpu_gs'", "'amdgpu_hs'", "'amdgpu_kernel'", "'amdgpu_ls'", 
			"'amdgpu_ps'", "'amdgpu_vs'", "'and'", "'any'", "'anyregcc'", "'appending'", 
			"'arcp'", "'arg:'", "'argmemonly'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", 
			"'arm_apcscc'", "'ashr'", "'asm'", "'atomic'", "'atomicrmw'", "'attributes:'", 
			"'attributes'", "'available_externally'", "'avr_intrcc'", "'avr_signalcc'", 
			"'baseType:'", "'bitcast'", "'blockaddress'", "'br'", "'builtin'", "'byval'", 
			"'c'", "'call'", "'caller'", "'catch'", "'catchpad'", "'catchret'", "'catchswitch'", 
			"'cc:'", "'cc'", "'ccc'", "'checksum:'", "'checksumkind:'", "'cleanup'", 
			"'cleanuppad'", "'cleanupret'", "'cmpxchg'", "'cold'", "'coldcc'", "'column:'", 
			"'comdat'", "'common'", "'configMacros:'", "'constant'", "'containingType:'", 
			"'contract'", "'convergent'", "'count:'", "'cxx_fast_tlscc'", "'datalayout'", 
			"'debugInfoForProfiling:'", "'declaration:'", "'declare'", "'default'", 
			"'define'", "'dereferenceable'", "'dereferenceable_or_null'", "'!DIBasicType'", 
			"'!DICompileUnit'", "'!DICompositeType'", "'!DIDerivedType'", "'!DIEnumerator'", 
			"'!DIExpression'", "'!DIFile'", "'!DIGlobalVariable'", "'!DIGlobalVariableExpression'", 
			"'!DIImportedEntity'", "'!DILexicalBlock'", "'!DILexicalBlockFile'", 
			"'!DILocalVariable'", "'!DILocation'", "'!DIMacro'", "'!DIMacroFile'", 
			"'!DIModule'", "'!DINamespace'", "'!DIObjCProperty'", "'directory:'", 
			"'discriminator:'", "'distinct'", "'!DISubprogram'", "'!DISubrange'", 
			"'!DISubroutineType'", "'!DITemplateTypeParameter'", "'!DITemplateValueParameter'", 
			"'dllexport'", "'dllimport'", "'double'", "'dso_local'", "'dso_preemptable'", 
			"'dwarfAddressSpace:'", "'dwoId:'", "'elements:'", "'emissionKind:'", 
			"'encoding:'", "'entity:'", "'enums:'", "'eq'", "'exact'", "'exactmatch'", 
			"'exportSymbols:'", "'expr:'", "'external'", "'externally_initialized'", 
			"'extern_weak'", "'extractelement'", "'extractvalue'", "'extraData:'", 
			"'fadd'", "'false'", "'fast'", "'fastcc'", "'fcmp'", "'fdiv'", "'fence'", 
			"'file:'", "'filename:'", "'filter'", "'flags:'", "'float'", "'fmul'", 
			"'fp128'", "'fpext'", "'fptosi'", "'fptoui'", "'fptrunc'", "'frem'", 
			"'from'", "'fsub'", "'FullDebug'", "'gc'", "'!GenericDINode'", "'getelementptr'", 
			"'getter:'", "'ghccc'", "'global'", "'globals:'", "'gnuPubnames:'", "'half'", 
			"'header:'", "'hhvmcc'", "'hhvm_ccc'", "'hidden'", "'icmp'", "'identifier:'", 
			"'ifunc'", "'imports:'", "'inaccessiblememonly'", "'inaccessiblemem_or_argmemonly'", 
			"'inalloca'", "'inbounds'", "'includePath:'", "'indirectbr'", "'initialexec'", 
			"'inlinedAt:'", "'inlinehint'", "'inrange'", "'inreg'", "'insertelement'", 
			"'insertvalue'", "'inteldialect'", "'intel_ocl_bicc'", "'internal'", 
			"'inttoptr'", "'invoke'", "'isDefinition:'", "'isLocal:'", "'isOptimized:'", 
			"'isUnsigned:'", "'isysroot:'", "'jumptable'", "'label'", "'landingpad'", 
			"'language:'", "'largest'", "'line:'", "'LineTablesOnly'", "'linkageName:'", 
			"'linkonce'", "'linkonce_odr'", "'load'", "'localdynamic'", "'localexec'", 
			"'local_unnamed_addr'", "'lowerBound:'", "'lshr'", "'macros:'", "'max'", 
			"'metadata'", "'min'", "'minsize'", "'module'", "'monotonic'", "'msp430_intrcc'", 
			"'mul'", "'musttail'", "'naked'", "'name:'", "'nand'", "'ne'", "'nest'", 
			"'ninf'", "'nnan'", "'noalias'", "'nobuiltin'", "'nocapture'", "'NoDebug'", 
			"'nodes:'", "'noduplicate'", "'noduplicates'", "'noimplicitfloat'", "'noinline'", 
			"'none'", "'nonlazybind'", "'nonnull'", "'norecurse'", "'noredzone'", 
			"'noreturn'", "'notail'", "'nounwind'", "'nsw'", "'nsz'", "'null'", "'nuw'", 
			"'oeq'", "'offset:'", "'oge'", "'ogt'", "'ole'", "'olt'", "'one'", "'opaque'", 
			"'operands:'", "'optnone'", "'optsize'", "'or'", "'ord'", "'personality'", 
			"'phi'", "'ppc_fp128'", "'prefix'", "'preserve_allcc'", "'preserve_mostcc'", 
			"'private'", "'producer:'", "'prologue'", "'protected'", "'ptrtoint'", 
			"'ptx_device'", "'ptx_kernel'", "'readnone'", "'readonly'", "'reassoc'", 
			"'release'", "'resume'", "'ret'", "'retainedTypes:'", "'returned'", "'returns_twice'", 
			"'runtimeLang:'", "'runtimeVersion:'", "'safestack'", "'samesize'", "'sanitize_address'", 
			"'sanitize_hwaddress'", "'sanitize_memory'", "'sanitize_thread'", "'scope:'", 
			"'scopeLine:'", "'sdiv'", "'section'", "'select'", "'seq_cst'", "'setter:'", 
			"'sext'", "'sge'", "'sgt'", "'shl'", "'shufflevector'", "'sideeffect'", 
			"'signext'", "'sitofp'", "'size:'", "'sle'", "'slt'", "'source_filename'", 
			"'speculatable'", "'spir_func'", "'spir_kernel'", "'splitDebugFilename:'", 
			"'splitDebugInlining:'", "'srem'", "'sret'", "'ssp'", "'sspreq'", "'sspstrong'", 
			"'store'", "'strictfp'", "'sub'", "'swiftcc'", "'swifterror'", "'swiftself'", 
			"'switch'", "'syncscope'", "'tag:'", "'tail'", "'target'", "'templateParams:'", 
			"'thisAdjustment:'", "'thread_local'", "'thrownTypes:'", "'to'", "'token'", 
			"'triple'", "'true'", "'trunc'", "'type:'", "'type'", "'types:'", "'udiv'", 
			"'ueq'", "'uge'", "'ugt'", "'uitofp'", "'ule'", "'ult'", "'umax'", "'umin'", 
			"'undef'", "'une'", "'unit:'", "'unnamed_addr'", "'uno'", "'unordered'", 
			"'unreachable'", "'unwind'", "'urem'", "'uselistorder'", "'uselistorder_bb'", 
			"'uwtable'", "'va_arg'", "'value:'", "'var:'", "'variables:'", "'virtualIndex:'", 
			"'virtuality:'", "'void'", "'vtableHolder:'", "'weak'", "'weak_odr'", 
			"'webkit_jscc'", "'win64cc'", "'within'", "'writeonly'", "'x'", "'x86_64_sysvcc'", 
			"'x86_fastcallcc'", "'x86_fp80'", "'x86_intrcc'", "'x86_mmx'", "'x86_regcallcc'", 
			"'x86_stdcallcc'", "'x86_thiscallcc'", "'x86_vectorcallcc'", "'xchg'", 
			"'xor'", "'zeroext'", "'zeroinitializer'", "'zext'", "'volatile'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LT", "EQSIGN", "GT", "VDASH", "COMMA", "BANG", "DOTS", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "STAR", "ACQ_REL", 
			"ACQUIRE", "ADD", "ADDRSPACE", "ADDRSPACECAST", "AFN", "ALIAS", "ALIGNCOLON", 
			"ALIGN", "ALIGNSTACK", "ALLOCA", "ALLOCSIZE", "ALWAYSINLINE", "AMDGPU_CS", 
			"AMDGPU_ES", "AMDGPU_GS", "AMDGPU_HS", "AMDGPU_KERNEL", "AMDGPU_LS", 
			"AMDGPU_PS", "AMDGPU_VS", "AND", "ANY", "ANYREGCC", "APPENDING", "ARCP", 
			"ARGCOLON", "ARGMEMONLY", "ARM_AAPCSCC", "ARM_AAPCS_VFPCC", "ARM_APCSCC", 
			"ASHR", "ASM", "ATOMIC", "ATOMICRMW", "ATTRIBUTESCOLON", "ATTRIBUTES", 
			"AVAILABLE_EXTERNALLY", "AVR_INTRCC", "AVR_SIGNALCC", "BASETYPECOLON", 
			"BITCAST", "BLOCKADDRESS", "BR", "BUILTIN", "BYVAL", "C", "CALL", "CALLER", 
			"CATCH", "CATCHPAD", "CATCHRET", "CATCHSWITCH", "CCCOLON", "CC", "CCC", 
			"CHECKSUMCOLON", "CHECKSUMKINDCOLON", "CLEANUP", "CLEANUPPAD", "CLEANUPRET", 
			"CMPXCHG", "COLD", "COLDCC", "COLUMNCOLON", "COMDAT", "COMMON", "CONFIGMACROSCOLON", 
			"CONSTANT", "CONTAININGTYPECOLON", "CONTRACT", "CONVERGENT", "COUNTCOLON", 
			"CXX_FAST_TLSCC", "DATALAYOUT", "DEBUGINFOFORPROFILINGCOLON", "DECLARATIONCOLON", 
			"DECLARE", "DEFAULT", "DEFINE", "DEREFERENCEABLE", "DEREFERENCEABLE_OR_NULL", 
			"NOTDIBASICTYPE", "NOTDICOMPILEUNIT", "NOTDICOMPOSITETYPE", "NOTDIDERIVEDTYPE", 
			"NOTDIENUMERATOR", "NOTDIEXPRESSION", "NOTDIFILE", "NOTDIGLOBALVARIABLE", 
			"NOTDIGLOBALVARIABLEEXPRESSION", "NOTDIIMPORTEDENTITY", "NOTDILEXICALBLOCK", 
			"NOTDILEXICALBLOCKFILE", "NOTDILOCALVARIABLE", "NOTDILOCATION", "NOTDIMACRO", 
			"NOTDIMACROFILE", "NOTDIMODULE", "NOTDINAMESPACE", "NOTDIOBJCPROPERTY", 
			"DIRECTORYCOLON", "DISCRIMINATORCOLON", "DISTINCT", "NOTDISUBPROGRAM", 
			"NOTDISUBRANGE", "NOTDISUBROUTINETYPE", "NOTDITEMPLATETYPEPARAMETER", 
			"NOTDITEMPLATEVALUEPARAMETER", "DLLEXPORT", "DLLIMPORT", "DOUBLE", "DSO_LOCAL", 
			"DSO_PREEMPTABLE", "DWARFADDRESSSPACECOLON", "DWOIDCOLON", "ELEMENTSCOLON", 
			"EMISSIONKINDCOLON", "ENCODINGCOLON", "ENTITYCOLON", "ENUMSCOLON", "EQ", 
			"EXACT", "EXACTMATCH", "EXPORTSYMBOLSCOLON", "EXPRCOLON", "EXTERNAL", 
			"EXTERNALLY_INITIALIZED", "EXTERN_WEAK", "EXTRACTELEMENT", "EXTRACTVALUE", 
			"EXTRADATACOLON", "FADD", "FALSE", "FAST", "FASTCC", "FCMP", "FDIV", 
			"FENCE", "FILECOLON", "FILENAMECOLON", "FILTER", "FLAGSCOLON", "FLOAT", 
			"FMUL", "FP128", "FPEXT", "FPTOSI", "FPTOUI", "FPTRUNC", "FREM", "FROM", 
			"FSUB", "FULLDEBUG", "GC", "NOTGENERICDINODE", "GETELEMENTPTR", "GETTERCOLON", 
			"GHCCC", "GLOBAL", "GLOBALSCOLON", "GNUPUBNAMESCOLON", "HALF", "HEADERCOLON", 
			"HHVMCC", "HHVM_CCC", "HIDDEN_VISIB", "ICMP", "IDENTIFIERCOLON", "IFUNC", 
			"IMPORTSCOLON", "INACCESSIBLEMEMONLY", "INACCESSIBLEMEM_OR_ARGMEMONLY", 
			"INALLOCA", "INBOUNDS", "INCLUDEPATHCOLON", "INDIRECTBR", "INITIALEXEC", 
			"INLINEDATCOLON", "INLINEHINT", "INRANGE", "INREG", "INSERTELEMENT", 
			"INSERTVALUE", "INTELDIALECT", "INTEL_OCL_BICC", "INTERNAL", "INTTOPTR", 
			"INVOKE", "ISDEFINITIONCOLON", "ISLOCALCOLON", "ISOPTIMIZEDCOLON", "ISUNSIGNEDCOLON", 
			"ISYSROOTCOLON", "JUMPTABLE", "LABEL", "LANDINGPAD", "LANGUAGECOLON", 
			"LARGEST", "LINECOLON", "LINETABLESONLY", "LINKAGENAMECOLON", "LINKONCE", 
			"LINKONCE_ODR", "LOAD", "LOCALDYNAMIC", "LOCALEXEC", "LOCAL_UNNAMED_ADDR", 
			"LOWERBOUNDCOLON", "LSHR", "MACROSCOLON", "MAX", "METADATA", "MIN", "MINSIZE", 
			"MODULE", "MONOTONIC", "MSP430_INTRCC", "MUL", "MUSTTAIL", "NAKED", "NAMECOLON", 
			"NAND", "NE", "NEST", "NINF", "NNAN", "NOALIAS", "NOBUILTIN", "NOCAPTURE", 
			"NODEBUG", "NODESCOLON", "NODUPLICATE", "NODUPLICATES", "NOIMPLICITFLOAT", 
			"NOINLINE", "NONE", "NONLAZYBIND", "NONNULL", "NORECURSE", "NOREDZONE", 
			"NORETURN", "NOTAIL", "NOUNWIND", "NSW", "NSZ", "NULL", "NUW", "OEQ", 
			"OFFSETCOLON", "OGE", "OGT", "OLE", "OLT", "ONE", "OPAQUE", "OPERANDSCOLON", 
			"OPTNONE", "OPTSIZE", "OR", "ORD", "PERSONALITY", "PHI", "PPC_FP128", 
			"PREFIX", "PRESERVE_ALLCC", "PRESERVE_MOSTCC", "PRIVATE", "PRODUCERCOLON", 
			"PROLOGUE", "PROTECTED", "PTRTOINT", "PTX_DEVICE", "PTX_KERNEL", "READNONE", 
			"READONLY", "REASSOC", "RELEASE", "RESUME", "RET", "RETAINEDTYPESCOLON", 
			"RETURNED", "RETURNS_TWICE", "RUNTIMELANGCOLON", "RUNTIMEVERSIONCOLON", 
			"SAFESTACK", "SAMESIZE", "SANITIZE_ADDRESS", "SANITIZE_HWADDRESS", "SANITIZE_MEMORY", 
			"SANITIZE_THREAD", "SCOPECOLON", "SCOPELINECOLON", "SDIV", "SECTION", 
			"SELECT", "SEQ_CST", "SETTERCOLON", "SEXT", "SGE", "SGT", "SHL", "SHUFFLEVECTOR", 
			"SIDEEFFECT", "SIGNEXT", "SITOFP", "SIZECOLON", "SLE", "SLT", "SOURCE_FILENAME", 
			"SPECULATABLE", "SPIR_FUNC", "SPIR_KERNEL", "SPLITDEBUGFILENAMECOLON", 
			"SPLITDEBUGINLININGCOLON", "SREM", "SRET", "SSP", "SSPREQ", "SSPSTRONG", 
			"STORE", "STRICTFP", "SUB", "SWIFTCC", "SWIFTERROR", "SWIFTSELF", "SWITCH", 
			"SYNCSCOPE", "TAGCOLON", "TAIL", "TARGET", "TEMPLATEPARAMSCOLON", "THISADJUSTMENTCOLON", 
			"THREAD_LOCAL", "THROWNTYPESCOLON", "TO", "TOKEN", "TRIPLE", "TRUE", 
			"TRUNC", "TYPECOLON", "TYPE", "TYPESCOLON", "UDIV", "UEQ", "UGE", "UGT", 
			"UITOFP", "ULE", "ULT", "UMAX", "UMIN", "UNDEF", "UNE", "UNITCOLON", 
			"UNNAMED_ADDR", "UNO", "UNORDERED", "UNREACHABLE", "UNWIND", "UREM", 
			"USELISTORDER", "USELISTORDER_BB", "UWTABLE", "VA_ARG", "VALUECOLON", 
			"VARCOLON", "VARIABLESCOLON", "VIRTUALINDEXCOLON", "VIRTUALITYCOLON", 
			"VOID", "VTABLEHOLDERCOLON", "WEAK", "WEAK_ODR", "WEBKIT_JSCC", "WIN64CC", 
			"WITHIN", "WRITEONLY", "X", "X86_64_SYSVCC", "X86_FASTCALLCC", "X86_FP80", 
			"X86_INTRCC", "X86_MMX", "X86_REGCALLCC", "X86_STDCALLCC", "X86_THISCALLCC", 
			"X86_VECTORCALLCC", "XCHG", "XOR", "ZEROEXT", "ZEROINITIALIZER", "ZEXT", 
			"VOLATILE", "COMMENT", "WHITESPACE", "ATTR_GROUP_ID", "COMDAT_NAME", 
			"METADATA_NAME", "METADATA_ID", "DWARF_TAG", "DWARF_ATT_ENCODING", "DI_FLAG", 
			"DWARF_LANG", "DWARF_CC", "CHECKSUM_KIND", "DWARF_VIRTUALITY", "DWARF_MACINFO", 
			"DWARF_OP", "INT_LIT", "DECIMAL_LIT", "DECIMALS", "FLOAT_LIT", "FRAC_LIT", 
			"SIGN", "SCI_LIT", "FLOAT_HEX_LIT", "STRING_LIT", "QUOTED_STRING", "INT_TYPE", 
			"NAME", "ESCAPE_NAME", "QUOTED_NAME", "ID", "GLOBAL_IDENT", "GLOBAL_NAME", 
			"GLOBAL_ID", "LOCAL_IDENT", "LOCAL_NAME", "LOCAL_ID", "LABEL_IDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LLVMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LLVMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MySingleInstructionContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public MySingleInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mySingleInstruction; }
	}

	public final MySingleInstructionContext mySingleInstruction() throws RecognitionException {
		MySingleInstructionContext _localctx = new MySingleInstructionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mySingleInstruction);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADDRSPACECAST:
			case ALLOCA:
			case AND:
			case ASHR:
			case ATOMICRMW:
			case BITCAST:
			case CALL:
			case CATCHPAD:
			case CLEANUPPAD:
			case CMPXCHG:
			case EXTRACTELEMENT:
			case EXTRACTVALUE:
			case FADD:
			case FCMP:
			case FDIV:
			case FENCE:
			case FMUL:
			case FPEXT:
			case FPTOSI:
			case FPTOUI:
			case FPTRUNC:
			case FREM:
			case FSUB:
			case GETELEMENTPTR:
			case ICMP:
			case INSERTELEMENT:
			case INSERTVALUE:
			case INTTOPTR:
			case LANDINGPAD:
			case LOAD:
			case LSHR:
			case MUL:
			case MUSTTAIL:
			case NOTAIL:
			case OR:
			case PHI:
			case PTRTOINT:
			case SDIV:
			case SELECT:
			case SEXT:
			case SHL:
			case SHUFFLEVECTOR:
			case SITOFP:
			case SREM:
			case STORE:
			case SUB:
			case TAIL:
			case TRUNC:
			case UDIV:
			case UITOFP:
			case UREM:
			case VA_ARG:
			case XOR:
			case ZEXT:
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				instruction();
				}
				break;
			case BR:
			case CATCHRET:
			case CATCHSWITCH:
			case CLEANUPRET:
			case INDIRECTBR:
			case INVOKE:
			case RESUME:
			case RET:
			case SWITCH:
			case UNREACHABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				terminator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TopLevelEntitiesContext topLevelEntities() {
			return getRuleContext(TopLevelEntitiesContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			topLevelEntities();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelEntitiesContext extends ParserRuleContext {
		public TopLevelEntityListContext topLevelEntityList() {
			return getRuleContext(TopLevelEntityListContext.class,0);
		}
		public TopLevelEntitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelEntities; }
	}

	public final TopLevelEntitiesContext topLevelEntities() throws RecognitionException {
		TopLevelEntitiesContext _localctx = new TopLevelEntitiesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevelEntities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (ATTRIBUTES - 51)) | (1L << (DECLARE - 51)) | (1L << (DEFINE - 51)))) != 0) || _la==MODULE || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (SOURCE_FILENAME - 324)) | (1L << (TARGET - 324)) | (1L << (USELISTORDER - 324)) | (1L << (USELISTORDER_BB - 324)))) != 0) || ((((_la - 412)) & ~0x3f) == 0 && ((1L << (_la - 412)) & ((1L << (COMDAT_NAME - 412)) | (1L << (METADATA_NAME - 412)) | (1L << (METADATA_ID - 412)) | (1L << (GLOBAL_IDENT - 412)) | (1L << (LOCAL_IDENT - 412)))) != 0)) {
				{
				setState(860);
				topLevelEntityList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelEntityListContext extends ParserRuleContext {
		public TopLevelEntityContext topLevelEntity() {
			return getRuleContext(TopLevelEntityContext.class,0);
		}
		public TopLevelEntityListContext topLevelEntityList() {
			return getRuleContext(TopLevelEntityListContext.class,0);
		}
		public TopLevelEntityListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelEntityList; }
	}

	public final TopLevelEntityListContext topLevelEntityList() throws RecognitionException {
		return topLevelEntityList(0);
	}

	private TopLevelEntityListContext topLevelEntityList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TopLevelEntityListContext _localctx = new TopLevelEntityListContext(_ctx, _parentState);
		TopLevelEntityListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_topLevelEntityList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(864);
			topLevelEntity();
			}
			_ctx.stop = _input.LT(-1);
			setState(870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TopLevelEntityListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_topLevelEntityList);
					setState(866);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(867);
					topLevelEntity();
					}
					} 
				}
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TopLevelEntityContext extends ParserRuleContext {
		public SourceFilenameContext sourceFilename() {
			return getRuleContext(SourceFilenameContext.class,0);
		}
		public TargetDefinitionContext targetDefinition() {
			return getRuleContext(TargetDefinitionContext.class,0);
		}
		public ModuleAsmContext moduleAsm() {
			return getRuleContext(ModuleAsmContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public ComdatDefContext comdatDef() {
			return getRuleContext(ComdatDefContext.class,0);
		}
		public GlobalDeclContext globalDecl() {
			return getRuleContext(GlobalDeclContext.class,0);
		}
		public GlobalDefContext globalDef() {
			return getRuleContext(GlobalDefContext.class,0);
		}
		public IndirectSymbolDefContext indirectSymbolDef() {
			return getRuleContext(IndirectSymbolDefContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public AttrGroupDefContext attrGroupDef() {
			return getRuleContext(AttrGroupDefContext.class,0);
		}
		public NamedMetadataDefContext namedMetadataDef() {
			return getRuleContext(NamedMetadataDefContext.class,0);
		}
		public MetadataDefContext metadataDef() {
			return getRuleContext(MetadataDefContext.class,0);
		}
		public UseListOrderContext useListOrder() {
			return getRuleContext(UseListOrderContext.class,0);
		}
		public UseListOrderBBContext useListOrderBB() {
			return getRuleContext(UseListOrderBBContext.class,0);
		}
		public TopLevelEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelEntity; }
	}

	public final TopLevelEntityContext topLevelEntity() throws RecognitionException {
		TopLevelEntityContext _localctx = new TopLevelEntityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_topLevelEntity);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				sourceFilename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				targetDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				moduleAsm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(876);
				typeDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
				comdatDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(878);
				globalDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(879);
				globalDef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(880);
				indirectSymbolDef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(881);
				functionDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(882);
				functionDef();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(883);
				attrGroupDef();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(884);
				namedMetadataDef();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(885);
				metadataDef();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(886);
				useListOrder();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(887);
				useListOrderBB();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceFilenameContext extends ParserRuleContext {
		public TerminalNode SOURCE_FILENAME() { return getToken(LLVMParser.SOURCE_FILENAME, 0); }
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public SourceFilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFilename; }
	}

	public final SourceFilenameContext sourceFilename() throws RecognitionException {
		SourceFilenameContext _localctx = new SourceFilenameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sourceFilename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(SOURCE_FILENAME);
			setState(891);
			match(EQSIGN);
			setState(892);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetDefinitionContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(LLVMParser.TARGET, 0); }
		public TerminalNode DATALAYOUT() { return getToken(LLVMParser.DATALAYOUT, 0); }
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode TRIPLE() { return getToken(LLVMParser.TRIPLE, 0); }
		public TargetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetDefinition; }
	}

	public final TargetDefinitionContext targetDefinition() throws RecognitionException {
		TargetDefinitionContext _localctx = new TargetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_targetDefinition);
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				match(TARGET);
				setState(895);
				match(DATALAYOUT);
				setState(896);
				match(EQSIGN);
				setState(897);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(TARGET);
				setState(899);
				match(TRIPLE);
				setState(900);
				match(EQSIGN);
				setState(901);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleAsmContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(LLVMParser.MODULE, 0); }
		public TerminalNode ASM() { return getToken(LLVMParser.ASM, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ModuleAsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleAsm; }
	}

	public final ModuleAsmContext moduleAsm() throws RecognitionException {
		ModuleAsmContext _localctx = new ModuleAsmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleAsm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(MODULE);
			setState(905);
			match(ASM);
			setState(906);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public TerminalNode TYPE() { return getToken(LLVMParser.TYPE, 0); }
		public OpaqueTypeContext opaqueType() {
			return getRuleContext(OpaqueTypeContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDef);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				localIdent();
				setState(909);
				match(EQSIGN);
				setState(910);
				match(TYPE);
				setState(911);
				opaqueType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				localIdent();
				setState(914);
				match(EQSIGN);
				setState(915);
				match(TYPE);
				setState(916);
				llvmType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComdatDefContext extends ParserRuleContext {
		public ComdatNameContext comdatName() {
			return getRuleContext(ComdatNameContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public TerminalNode COMDAT() { return getToken(LLVMParser.COMDAT, 0); }
		public SelectionKindContext selectionKind() {
			return getRuleContext(SelectionKindContext.class,0);
		}
		public ComdatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comdatDef; }
	}

	public final ComdatDefContext comdatDef() throws RecognitionException {
		ComdatDefContext _localctx = new ComdatDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comdatDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			comdatName();
			setState(921);
			match(EQSIGN);
			setState(922);
			match(COMDAT);
			setState(923);
			selectionKind();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionKindContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(LLVMParser.ANY, 0); }
		public TerminalNode EXACTMATCH() { return getToken(LLVMParser.EXACTMATCH, 0); }
		public TerminalNode LARGEST() { return getToken(LLVMParser.LARGEST, 0); }
		public TerminalNode NODUPLICATES() { return getToken(LLVMParser.NODUPLICATES, 0); }
		public TerminalNode SAMESIZE() { return getToken(LLVMParser.SAMESIZE, 0); }
		public SelectionKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionKind; }
	}

	public final SelectionKindContext selectionKind() throws RecognitionException {
		SelectionKindContext _localctx = new SelectionKindContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectionKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_la = _input.LA(1);
			if ( !(_la==ANY || _la==EXACTMATCH || _la==LARGEST || _la==NODUPLICATES || _la==SAMESIZE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclContext extends ParserRuleContext {
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public ExternLinkageContext externLinkage() {
			return getRuleContext(ExternLinkageContext.class,0);
		}
		public OptPreemptionSpecifierContext optPreemptionSpecifier() {
			return getRuleContext(OptPreemptionSpecifierContext.class,0);
		}
		public OptDLLStorageClassContext optDLLStorageClass() {
			return getRuleContext(OptDLLStorageClassContext.class,0);
		}
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public OptExternallyInitializedContext optExternallyInitialized() {
			return getRuleContext(OptExternallyInitializedContext.class,0);
		}
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public GlobalAttrsContext globalAttrs() {
			return getRuleContext(GlobalAttrsContext.class,0);
		}
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ThreadLocalContext threadLocal() {
			return getRuleContext(ThreadLocalContext.class,0);
		}
		public UnnamedAddrContext unnamedAddr() {
			return getRuleContext(UnnamedAddrContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_globalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			globalIdent();
			setState(928);
			match(EQSIGN);
			setState(929);
			externLinkage();
			setState(930);
			optPreemptionSpecifier();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) {
				{
				setState(931);
				visibility();
				}
			}

			setState(934);
			optDLLStorageClass();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THREAD_LOCAL) {
				{
				setState(935);
				threadLocal();
				}
			}

			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL_UNNAMED_ADDR || _la==UNNAMED_ADDR) {
				{
				setState(938);
				unnamedAddr();
				}
			}

			setState(941);
			optAddrSpace();
			setState(942);
			optExternallyInitialized();
			setState(943);
			immutable();
			setState(944);
			llvmType(0);
			setState(945);
			globalAttrs();
			setState(946);
			funcAttrs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDefContext extends ParserRuleContext {
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public OptLinkageContext optLinkage() {
			return getRuleContext(OptLinkageContext.class,0);
		}
		public OptPreemptionSpecifierContext optPreemptionSpecifier() {
			return getRuleContext(OptPreemptionSpecifierContext.class,0);
		}
		public OptDLLStorageClassContext optDLLStorageClass() {
			return getRuleContext(OptDLLStorageClassContext.class,0);
		}
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public OptExternallyInitializedContext optExternallyInitialized() {
			return getRuleContext(OptExternallyInitializedContext.class,0);
		}
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public GlobalAttrsContext globalAttrs() {
			return getRuleContext(GlobalAttrsContext.class,0);
		}
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ThreadLocalContext threadLocal() {
			return getRuleContext(ThreadLocalContext.class,0);
		}
		public UnnamedAddrContext unnamedAddr() {
			return getRuleContext(UnnamedAddrContext.class,0);
		}
		public GlobalDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDef; }
	}

	public final GlobalDefContext globalDef() throws RecognitionException {
		GlobalDefContext _localctx = new GlobalDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_globalDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			globalIdent();
			setState(949);
			match(EQSIGN);
			setState(950);
			optLinkage();
			setState(951);
			optPreemptionSpecifier();
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) {
				{
				setState(952);
				visibility();
				}
			}

			setState(955);
			optDLLStorageClass();
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THREAD_LOCAL) {
				{
				setState(956);
				threadLocal();
				}
			}

			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL_UNNAMED_ADDR || _la==UNNAMED_ADDR) {
				{
				setState(959);
				unnamedAddr();
				}
			}

			setState(962);
			optAddrSpace();
			setState(963);
			optExternallyInitialized();
			setState(964);
			immutable();
			setState(965);
			llvmType(0);
			setState(966);
			constant();
			setState(967);
			globalAttrs();
			setState(968);
			funcAttrs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptExternallyInitializedContext extends ParserRuleContext {
		public TerminalNode EXTERNALLY_INITIALIZED() { return getToken(LLVMParser.EXTERNALLY_INITIALIZED, 0); }
		public OptExternallyInitializedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optExternallyInitialized; }
	}

	public final OptExternallyInitializedContext optExternallyInitialized() throws RecognitionException {
		OptExternallyInitializedContext _localctx = new OptExternallyInitializedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optExternallyInitialized);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNALLY_INITIALIZED) {
				{
				setState(970);
				match(EXTERNALLY_INITIALIZED);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(LLVMParser.CONSTANT, 0); }
		public TerminalNode GLOBAL() { return getToken(LLVMParser.GLOBAL, 0); }
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_immutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==GLOBAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalAttrsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public GlobalAttrListContext globalAttrList() {
			return getRuleContext(GlobalAttrListContext.class,0);
		}
		public GlobalAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalAttrs; }
	}

	public final GlobalAttrsContext globalAttrs() throws RecognitionException {
		GlobalAttrsContext _localctx = new GlobalAttrsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_globalAttrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(975);
				match(COMMA);
				setState(976);
				globalAttrList(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalAttrListContext extends ParserRuleContext {
		public GlobalAttrContext globalAttr() {
			return getRuleContext(GlobalAttrContext.class,0);
		}
		public GlobalAttrListContext globalAttrList() {
			return getRuleContext(GlobalAttrListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public GlobalAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalAttrList; }
	}

	public final GlobalAttrListContext globalAttrList() throws RecognitionException {
		return globalAttrList(0);
	}

	private GlobalAttrListContext globalAttrList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GlobalAttrListContext _localctx = new GlobalAttrListContext(_ctx, _parentState);
		GlobalAttrListContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_globalAttrList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(980);
			globalAttr();
			}
			_ctx.stop = _input.LT(-1);
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GlobalAttrListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_globalAttrList);
					setState(982);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(983);
					match(COMMA);
					setState(984);
					globalAttr();
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GlobalAttrContext extends ParserRuleContext {
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public ComdatContext comdat() {
			return getRuleContext(ComdatContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public MetadataAttachmentContext metadataAttachment() {
			return getRuleContext(MetadataAttachmentContext.class,0);
		}
		public GlobalAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalAttr; }
	}

	public final GlobalAttrContext globalAttr() throws RecognitionException {
		GlobalAttrContext _localctx = new GlobalAttrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_globalAttr);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				section();
				}
				break;
			case COMDAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				comdat();
				}
				break;
			case ALIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				alignment();
				}
				break;
			case METADATA_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
				metadataAttachment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectSymbolDefContext extends ParserRuleContext {
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public ExternLinkageContext externLinkage() {
			return getRuleContext(ExternLinkageContext.class,0);
		}
		public OptPreemptionSpecifierContext optPreemptionSpecifier() {
			return getRuleContext(OptPreemptionSpecifierContext.class,0);
		}
		public OptDLLStorageClassContext optDLLStorageClass() {
			return getRuleContext(OptDLLStorageClassContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ThreadLocalContext threadLocal() {
			return getRuleContext(ThreadLocalContext.class,0);
		}
		public UnnamedAddrContext unnamedAddr() {
			return getRuleContext(UnnamedAddrContext.class,0);
		}
		public OptLinkageContext optLinkage() {
			return getRuleContext(OptLinkageContext.class,0);
		}
		public IndirectSymbolDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectSymbolDef; }
	}

	public final IndirectSymbolDefContext indirectSymbolDef() throws RecognitionException {
		IndirectSymbolDefContext _localctx = new IndirectSymbolDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indirectSymbolDef);
		int _la;
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				globalIdent();
				setState(997);
				match(EQSIGN);
				setState(998);
				externLinkage();
				setState(999);
				optPreemptionSpecifier();
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) {
					{
					setState(1000);
					visibility();
					}
				}

				setState(1003);
				optDLLStorageClass();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THREAD_LOCAL) {
					{
					setState(1004);
					threadLocal();
					}
				}

				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL_UNNAMED_ADDR || _la==UNNAMED_ADDR) {
					{
					setState(1007);
					unnamedAddr();
					}
				}

				setState(1010);
				alias();
				setState(1011);
				llvmType(0);
				setState(1012);
				match(COMMA);
				setState(1013);
				llvmType(0);
				setState(1014);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				globalIdent();
				setState(1017);
				match(EQSIGN);
				setState(1018);
				optLinkage();
				setState(1019);
				optPreemptionSpecifier();
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) {
					{
					setState(1020);
					visibility();
					}
				}

				setState(1023);
				optDLLStorageClass();
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THREAD_LOCAL) {
					{
					setState(1024);
					threadLocal();
					}
				}

				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL_UNNAMED_ADDR || _la==UNNAMED_ADDR) {
					{
					setState(1027);
					unnamedAddr();
					}
				}

				setState(1030);
				alias();
				setState(1031);
				llvmType(0);
				setState(1032);
				match(COMMA);
				setState(1033);
				llvmType(0);
				setState(1034);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(LLVMParser.ALIAS, 0); }
		public TerminalNode IFUNC() { return getToken(LLVMParser.IFUNC, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==IFUNC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(LLVMParser.DECLARE, 0); }
		public MetadataAttachmentsContext metadataAttachments() {
			return getRuleContext(MetadataAttachmentsContext.class,0);
		}
		public OptExternLinkageContext optExternLinkage() {
			return getRuleContext(OptExternLinkageContext.class,0);
		}
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(DECLARE);
			setState(1041);
			metadataAttachments();
			setState(1042);
			optExternLinkage();
			setState(1043);
			functionHeader();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(LLVMParser.DEFINE, 0); }
		public OptLinkageContext optLinkage() {
			return getRuleContext(OptLinkageContext.class,0);
		}
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public MetadataAttachmentsContext metadataAttachments() {
			return getRuleContext(MetadataAttachmentsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(DEFINE);
			setState(1046);
			optLinkage();
			setState(1047);
			functionHeader();
			setState(1048);
			metadataAttachments();
			setState(1049);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeaderContext extends ParserRuleContext {
		public OptPreemptionSpecifierContext optPreemptionSpecifier() {
			return getRuleContext(OptPreemptionSpecifierContext.class,0);
		}
		public OptDLLStorageClassContext optDLLStorageClass() {
			return getRuleContext(OptDLLStorageClassContext.class,0);
		}
		public OptCallingConvContext optCallingConv() {
			return getRuleContext(OptCallingConvContext.class,0);
		}
		public ReturnAttrsContext returnAttrs() {
			return getRuleContext(ReturnAttrsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public OptComdatContext optComdat() {
			return getRuleContext(OptComdatContext.class,0);
		}
		public OptGCContext optGC() {
			return getRuleContext(OptGCContext.class,0);
		}
		public OptPrefixContext optPrefix() {
			return getRuleContext(OptPrefixContext.class,0);
		}
		public OptPrologueContext optPrologue() {
			return getRuleContext(OptPrologueContext.class,0);
		}
		public OptPersonalityContext optPersonality() {
			return getRuleContext(OptPersonalityContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public UnnamedAddrContext unnamedAddr() {
			return getRuleContext(UnnamedAddrContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			optPreemptionSpecifier();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) {
				{
				setState(1052);
				visibility();
				}
			}

			setState(1055);
			optDLLStorageClass();
			setState(1056);
			optCallingConv();
			setState(1057);
			returnAttrs();
			setState(1058);
			llvmType(0);
			setState(1059);
			globalIdent();
			setState(1060);
			match(LPAREN);
			setState(1061);
			params();
			setState(1062);
			match(RPAREN);
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(1063);
				unnamedAddr();
				}
				break;
			}
			setState(1066);
			funcAttrs();
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(1067);
				section();
				}
				break;
			}
			setState(1070);
			optComdat();
			setState(1071);
			optGC();
			setState(1072);
			optPrefix();
			setState(1073);
			optPrologue();
			setState(1074);
			optPersonality();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptGCContext extends ParserRuleContext {
		public TerminalNode GC() { return getToken(LLVMParser.GC, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public OptGCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optGC; }
	}

	public final OptGCContext optGC() throws RecognitionException {
		OptGCContext _localctx = new OptGCContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_optGC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(1076);
				match(GC);
				setState(1077);
				stringLit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptPrefixContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(LLVMParser.PREFIX, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optPrefix; }
	}

	public final OptPrefixContext optPrefix() throws RecognitionException {
		OptPrefixContext _localctx = new OptPrefixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_optPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(1080);
				match(PREFIX);
				setState(1081);
				llvmType(0);
				setState(1082);
				constant();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptPrologueContext extends ParserRuleContext {
		public TerminalNode PROLOGUE() { return getToken(LLVMParser.PROLOGUE, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptPrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optPrologue; }
	}

	public final OptPrologueContext optPrologue() throws RecognitionException {
		OptPrologueContext _localctx = new OptPrologueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optPrologue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(1086);
				match(PROLOGUE);
				setState(1087);
				llvmType(0);
				setState(1088);
				constant();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptPersonalityContext extends ParserRuleContext {
		public TerminalNode PERSONALITY() { return getToken(LLVMParser.PERSONALITY, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptPersonalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optPersonality; }
	}

	public final OptPersonalityContext optPersonality() throws RecognitionException {
		OptPersonalityContext _localctx = new OptPersonalityContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_optPersonality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(1092);
				match(PERSONALITY);
				setState(1093);
				llvmType(0);
				setState(1094);
				constant();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public BasicBlockListContext basicBlockList() {
			return getRuleContext(BasicBlockListContext.class,0);
		}
		public UseListOrdersContext useListOrders() {
			return getRuleContext(UseListOrdersContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(LBRACE);
			setState(1099);
			basicBlockList(0);
			setState(1100);
			useListOrders();
			setState(1101);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrGroupDefContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTES() { return getToken(LLVMParser.ATTRIBUTES, 0); }
		public AttrGroupIDContext attrGroupID() {
			return getRuleContext(AttrGroupIDContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public AttrGroupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrGroupDef; }
	}

	public final AttrGroupDefContext attrGroupDef() throws RecognitionException {
		AttrGroupDefContext _localctx = new AttrGroupDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attrGroupDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(ATTRIBUTES);
			setState(1104);
			attrGroupID();
			setState(1105);
			match(EQSIGN);
			setState(1106);
			match(LBRACE);
			setState(1107);
			funcAttrs();
			setState(1108);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedMetadataDefContext extends ParserRuleContext {
		public MetadataNameContext metadataName() {
			return getRuleContext(MetadataNameContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public TerminalNode BANG() { return getToken(LLVMParser.BANG, 0); }
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public MetadataNodesContext metadataNodes() {
			return getRuleContext(MetadataNodesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public NamedMetadataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedMetadataDef; }
	}

	public final NamedMetadataDefContext namedMetadataDef() throws RecognitionException {
		NamedMetadataDefContext _localctx = new NamedMetadataDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedMetadataDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			metadataName();
			setState(1111);
			match(EQSIGN);
			setState(1112);
			match(BANG);
			setState(1113);
			match(LBRACE);
			setState(1114);
			metadataNodes();
			setState(1115);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataNodesContext extends ParserRuleContext {
		public MetadataNodeListContext metadataNodeList() {
			return getRuleContext(MetadataNodeListContext.class,0);
		}
		public MetadataNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataNodes; }
	}

	public final MetadataNodesContext metadataNodes() throws RecognitionException {
		MetadataNodesContext _localctx = new MetadataNodesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_metadataNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOTDIEXPRESSION || _la==METADATA_ID) {
				{
				setState(1117);
				metadataNodeList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataNodeListContext extends ParserRuleContext {
		public MetadataNodeContext metadataNode() {
			return getRuleContext(MetadataNodeContext.class,0);
		}
		public MetadataNodeListContext metadataNodeList() {
			return getRuleContext(MetadataNodeListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public MetadataNodeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataNodeList; }
	}

	public final MetadataNodeListContext metadataNodeList() throws RecognitionException {
		return metadataNodeList(0);
	}

	private MetadataNodeListContext metadataNodeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MetadataNodeListContext _localctx = new MetadataNodeListContext(_ctx, _parentState);
		MetadataNodeListContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_metadataNodeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1121);
			metadataNode();
			}
			_ctx.stop = _input.LT(-1);
			setState(1128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MetadataNodeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_metadataNodeList);
					setState(1123);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1124);
					match(COMMA);
					setState(1125);
					metadataNode();
					}
					} 
				}
				setState(1130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MetadataNodeContext extends ParserRuleContext {
		public MetadataIDContext metadataID() {
			return getRuleContext(MetadataIDContext.class,0);
		}
		public DiExpressionContext diExpression() {
			return getRuleContext(DiExpressionContext.class,0);
		}
		public MetadataNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataNode; }
	}

	public final MetadataNodeContext metadataNode() throws RecognitionException {
		MetadataNodeContext _localctx = new MetadataNodeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_metadataNode);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METADATA_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				metadataID();
				}
				break;
			case NOTDIEXPRESSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				diExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataDefContext extends ParserRuleContext {
		public MetadataIDContext metadataID() {
			return getRuleContext(MetadataIDContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public OptDistinctContext optDistinct() {
			return getRuleContext(OptDistinctContext.class,0);
		}
		public MdTupleContext mdTuple() {
			return getRuleContext(MdTupleContext.class,0);
		}
		public SpecializedMDNodeContext specializedMDNode() {
			return getRuleContext(SpecializedMDNodeContext.class,0);
		}
		public MetadataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataDef; }
	}

	public final MetadataDefContext metadataDef() throws RecognitionException {
		MetadataDefContext _localctx = new MetadataDefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_metadataDef);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				metadataID();
				setState(1136);
				match(EQSIGN);
				setState(1137);
				optDistinct();
				setState(1138);
				mdTuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				metadataID();
				setState(1141);
				match(EQSIGN);
				setState(1142);
				optDistinct();
				setState(1143);
				specializedMDNode();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptDistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(LLVMParser.DISTINCT, 0); }
		public OptDistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optDistinct; }
	}

	public final OptDistinctContext optDistinct() throws RecognitionException {
		OptDistinctContext _localctx = new OptDistinctContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_optDistinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1147);
				match(DISTINCT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseListOrdersContext extends ParserRuleContext {
		public UseListOrderListContext useListOrderList() {
			return getRuleContext(UseListOrderListContext.class,0);
		}
		public UseListOrdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useListOrders; }
	}

	public final UseListOrdersContext useListOrders() throws RecognitionException {
		UseListOrdersContext _localctx = new UseListOrdersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_useListOrders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USELISTORDER) {
				{
				setState(1150);
				useListOrderList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseListOrderListContext extends ParserRuleContext {
		public UseListOrderContext useListOrder() {
			return getRuleContext(UseListOrderContext.class,0);
		}
		public UseListOrderListContext useListOrderList() {
			return getRuleContext(UseListOrderListContext.class,0);
		}
		public UseListOrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useListOrderList; }
	}

	public final UseListOrderListContext useListOrderList() throws RecognitionException {
		return useListOrderList(0);
	}

	private UseListOrderListContext useListOrderList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UseListOrderListContext _localctx = new UseListOrderListContext(_ctx, _parentState);
		UseListOrderListContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_useListOrderList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1154);
			useListOrder();
			}
			_ctx.stop = _input.LT(-1);
			setState(1160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UseListOrderListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_useListOrderList);
					setState(1156);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1157);
					useListOrder();
					}
					} 
				}
				setState(1162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UseListOrderContext extends ParserRuleContext {
		public TerminalNode USELISTORDER() { return getToken(LLVMParser.USELISTORDER, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public UseListOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useListOrder; }
	}

	public final UseListOrderContext useListOrder() throws RecognitionException {
		UseListOrderContext _localctx = new UseListOrderContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_useListOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(USELISTORDER);
			setState(1164);
			llvmType(0);
			setState(1165);
			value();
			setState(1166);
			match(COMMA);
			setState(1167);
			match(LBRACE);
			setState(1168);
			indexList(0);
			setState(1169);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseListOrderBBContext extends ParserRuleContext {
		public TerminalNode USELISTORDER_BB() { return getToken(LLVMParser.USELISTORDER_BB, 0); }
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public UseListOrderBBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useListOrderBB; }
	}

	public final UseListOrderBBContext useListOrderBB() throws RecognitionException {
		UseListOrderBBContext _localctx = new UseListOrderBBContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_useListOrderBB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(USELISTORDER_BB);
			setState(1172);
			globalIdent();
			setState(1173);
			match(COMMA);
			setState(1174);
			localIdent();
			setState(1175);
			match(COMMA);
			setState(1176);
			match(LBRACE);
			setState(1177);
			indexList(0);
			setState(1178);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalIdentContext extends ParserRuleContext {
		public TerminalNode GLOBAL_IDENT() { return getToken(LLVMParser.GLOBAL_IDENT, 0); }
		public GlobalIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalIdent; }
	}

	public final GlobalIdentContext globalIdent() throws RecognitionException {
		GlobalIdentContext _localctx = new GlobalIdentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_globalIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(GLOBAL_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalIdentContext extends ParserRuleContext {
		public TerminalNode LOCAL_IDENT() { return getToken(LLVMParser.LOCAL_IDENT, 0); }
		public LocalIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localIdent; }
	}

	public final LocalIdentContext localIdent() throws RecognitionException {
		LocalIdentContext _localctx = new LocalIdentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_localIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(LOCAL_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelIdentContext extends ParserRuleContext {
		public TerminalNode LABEL_IDENT() { return getToken(LLVMParser.LABEL_IDENT, 0); }
		public LabelIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelIdent; }
	}

	public final LabelIdentContext labelIdent() throws RecognitionException {
		LabelIdentContext _localctx = new LabelIdentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_labelIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(LABEL_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrGroupIDContext extends ParserRuleContext {
		public TerminalNode ATTR_GROUP_ID() { return getToken(LLVMParser.ATTR_GROUP_ID, 0); }
		public AttrGroupIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrGroupID; }
	}

	public final AttrGroupIDContext attrGroupID() throws RecognitionException {
		AttrGroupIDContext _localctx = new AttrGroupIDContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attrGroupID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(ATTR_GROUP_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComdatNameContext extends ParserRuleContext {
		public TerminalNode COMDAT_NAME() { return getToken(LLVMParser.COMDAT_NAME, 0); }
		public ComdatNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comdatName; }
	}

	public final ComdatNameContext comdatName() throws RecognitionException {
		ComdatNameContext _localctx = new ComdatNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comdatName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(COMDAT_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataNameContext extends ParserRuleContext {
		public TerminalNode METADATA_NAME() { return getToken(LLVMParser.METADATA_NAME, 0); }
		public MetadataNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataName; }
	}

	public final MetadataNameContext metadataName() throws RecognitionException {
		MetadataNameContext _localctx = new MetadataNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_metadataName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(METADATA_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataIDContext extends ParserRuleContext {
		public TerminalNode METADATA_ID() { return getToken(LLVMParser.METADATA_ID, 0); }
		public MetadataIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataID; }
	}

	public final MetadataIDContext metadataID() throws RecognitionException {
		MetadataIDContext _localctx = new MetadataIDContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_metadataID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(METADATA_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlvmTypeContext extends ParserRuleContext {
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public ConcreteNonRecTypeContext concreteNonRecType() {
			return getRuleContext(ConcreteNonRecTypeContext.class,0);
		}
		public MetadataTypeContext metadataType() {
			return getRuleContext(MetadataTypeContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LLVMParser.STAR, 0); }
		public LlvmTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llvmType; }
	}

	public final LlvmTypeContext llvmType() throws RecognitionException {
		return llvmType(0);
	}

	private LlvmTypeContext llvmType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LlvmTypeContext _localctx = new LlvmTypeContext(_ctx, _parentState);
		LlvmTypeContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_llvmType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(1195);
				voidType();
				}
				break;
			case LT:
			case LBRACK:
			case LBRACE:
			case DOUBLE:
			case FLOAT:
			case FP128:
			case HALF:
			case LABEL:
			case PPC_FP128:
			case TOKEN:
			case X86_FP80:
			case X86_MMX:
			case INT_TYPE:
			case LOCAL_IDENT:
				{
				setState(1196);
				concreteNonRecType();
				}
				break;
			case METADATA:
				{
				setState(1197);
				metadataType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new LlvmTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_llvmType);
						setState(1200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1201);
						match(LPAREN);
						setState(1202);
						params();
						setState(1203);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new LlvmTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_llvmType);
						setState(1205);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1206);
						optAddrSpace();
						setState(1207);
						match(STAR);
						}
						break;
					}
					} 
				}
				setState(1213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcreteNonRecTypeContext extends ParserRuleContext {
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public VectorTypeContext vectorType() {
			return getRuleContext(VectorTypeContext.class,0);
		}
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public MmxTypeContext mmxType() {
			return getRuleContext(MmxTypeContext.class,0);
		}
		public TokenTypeContext tokenType() {
			return getRuleContext(TokenTypeContext.class,0);
		}
		public ConcreteNonRecTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concreteNonRecType; }
	}

	public final ConcreteNonRecTypeContext concreteNonRecType() throws RecognitionException {
		ConcreteNonRecTypeContext _localctx = new ConcreteNonRecTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_concreteNonRecType);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				intType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				floatType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1216);
				vectorType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1217);
				labelType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1218);
				arrayType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1219);
				structType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1220);
				namedType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1221);
				mmxType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1222);
				tokenType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(LLVMParser.VOID, 0); }
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(LLVMParser.INT_TYPE, 0); }
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(INT_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatTypeContext extends ParserRuleContext {
		public FloatKindContext floatKind() {
			return getRuleContext(FloatKindContext.class,0);
		}
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_floatType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			floatKind();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatKindContext extends ParserRuleContext {
		public TerminalNode HALF() { return getToken(LLVMParser.HALF, 0); }
		public TerminalNode FLOAT() { return getToken(LLVMParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(LLVMParser.DOUBLE, 0); }
		public TerminalNode X86_FP80() { return getToken(LLVMParser.X86_FP80, 0); }
		public TerminalNode FP128() { return getToken(LLVMParser.FP128, 0); }
		public TerminalNode PPC_FP128() { return getToken(LLVMParser.PPC_FP128, 0); }
		public FloatKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatKind; }
	}

	public final FloatKindContext floatKind() throws RecognitionException {
		FloatKindContext _localctx = new FloatKindContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_floatKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || _la==PPC_FP128 || _la==X86_FP80) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MmxTypeContext extends ParserRuleContext {
		public TerminalNode X86_MMX() { return getToken(LLVMParser.X86_MMX, 0); }
		public MmxTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmxType; }
	}

	public final MmxTypeContext mmxType() throws RecognitionException {
		MmxTypeContext _localctx = new MmxTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mmxType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(X86_MMX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptAddrSpaceContext extends ParserRuleContext {
		public AddrSpaceContext addrSpace() {
			return getRuleContext(AddrSpaceContext.class,0);
		}
		public OptAddrSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optAddrSpace; }
	}

	public final OptAddrSpaceContext optAddrSpace() throws RecognitionException {
		OptAddrSpaceContext _localctx = new OptAddrSpaceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_optAddrSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDRSPACE) {
				{
				setState(1235);
				addrSpace();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrSpaceContext extends ParserRuleContext {
		public TerminalNode ADDRSPACE() { return getToken(LLVMParser.ADDRSPACE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public AddrSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrSpace; }
	}

	public final AddrSpaceContext addrSpace() throws RecognitionException {
		AddrSpaceContext _localctx = new AddrSpaceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_addrSpace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(ADDRSPACE);
			setState(1239);
			match(LPAREN);
			setState(1240);
			match(INT_LIT);
			setState(1241);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LLVMParser.LT, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode X() { return getToken(LLVMParser.X, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(LLVMParser.GT, 0); }
		public VectorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorType; }
	}

	public final VectorTypeContext vectorType() throws RecognitionException {
		VectorTypeContext _localctx = new VectorTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_vectorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(LT);
			setState(1244);
			match(INT_LIT);
			setState(1245);
			match(X);
			setState(1246);
			llvmType(0);
			setState(1247);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelTypeContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(LLVMParser.LABEL, 0); }
		public LabelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelType; }
	}

	public final LabelTypeContext labelType() throws RecognitionException {
		LabelTypeContext _localctx = new LabelTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_labelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenTypeContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(LLVMParser.TOKEN, 0); }
		public TokenTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenType; }
	}

	public final TokenTypeContext tokenType() throws RecognitionException {
		TokenTypeContext _localctx = new TokenTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tokenType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataTypeContext extends ParserRuleContext {
		public TerminalNode METADATA() { return getToken(LLVMParser.METADATA, 0); }
		public MetadataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataType; }
	}

	public final MetadataTypeContext metadataType() throws RecognitionException {
		MetadataTypeContext _localctx = new MetadataTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_metadataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(METADATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode X() { return getToken(LLVMParser.X, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(LBRACK);
			setState(1256);
			match(INT_LIT);
			setState(1257);
			match(X);
			setState(1258);
			llvmType(0);
			setState(1259);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode LT() { return getToken(LLVMParser.LT, 0); }
		public TerminalNode GT() { return getToken(LLVMParser.GT, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structType);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				match(LBRACE);
				setState(1262);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(LBRACE);
				setState(1264);
				typeList(0);
				setState(1265);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				match(LT);
				setState(1268);
				match(LBRACE);
				setState(1269);
				match(RBRACE);
				setState(1270);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1271);
				match(LT);
				setState(1272);
				match(LBRACE);
				setState(1273);
				typeList(0);
				setState(1274);
				match(RBRACE);
				setState(1275);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		return typeList(0);
	}

	private TypeListContext typeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeListContext _localctx = new TypeListContext(_ctx, _parentState);
		TypeListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_typeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1280);
			llvmType(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeList);
					setState(1282);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1283);
					match(COMMA);
					setState(1284);
					llvmType(0);
					}
					} 
				}
				setState(1289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpaqueTypeContext extends ParserRuleContext {
		public TerminalNode OPAQUE() { return getToken(LLVMParser.OPAQUE, 0); }
		public OpaqueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueType; }
	}

	public final OpaqueTypeContext opaqueType() throws RecognitionException {
		OpaqueTypeContext _localctx = new OpaqueTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_opaqueType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(OPAQUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedTypeContext extends ParserRuleContext {
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public NamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedType; }
	}

	public final NamedTypeContext namedType() throws RecognitionException {
		NamedTypeContext _localctx = new NamedTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_namedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			localIdent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public InlineAsmContext inlineAsm() {
			return getRuleContext(InlineAsmContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_value);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case LBRACK:
			case LBRACE:
			case ADD:
			case ADDRSPACECAST:
			case AND:
			case ASHR:
			case BITCAST:
			case BLOCKADDRESS:
			case C:
			case EXTRACTELEMENT:
			case EXTRACTVALUE:
			case FADD:
			case FALSE:
			case FCMP:
			case FDIV:
			case FMUL:
			case FPEXT:
			case FPTOSI:
			case FPTOUI:
			case FPTRUNC:
			case FREM:
			case FSUB:
			case GETELEMENTPTR:
			case ICMP:
			case INSERTELEMENT:
			case INSERTVALUE:
			case INTTOPTR:
			case LSHR:
			case MUL:
			case NONE:
			case NULL:
			case OR:
			case PTRTOINT:
			case SDIV:
			case SELECT:
			case SEXT:
			case SHL:
			case SHUFFLEVECTOR:
			case SITOFP:
			case SREM:
			case SUB:
			case TRUE:
			case TRUNC:
			case UDIV:
			case UITOFP:
			case UNDEF:
			case UREM:
			case XOR:
			case ZEROINITIALIZER:
			case ZEXT:
			case INT_LIT:
			case FLOAT_LIT:
			case GLOBAL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				constant();
				}
				break;
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				localIdent();
				}
				break;
			case ASM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				inlineAsm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAsmContext extends ParserRuleContext {
		public TerminalNode ASM() { return getToken(LLVMParser.ASM, 0); }
		public OptSideEffectContext optSideEffect() {
			return getRuleContext(OptSideEffectContext.class,0);
		}
		public OptAlignStackContext optAlignStack() {
			return getRuleContext(OptAlignStackContext.class,0);
		}
		public OptIntelDialectContext optIntelDialect() {
			return getRuleContext(OptIntelDialectContext.class,0);
		}
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public InlineAsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAsm; }
	}

	public final InlineAsmContext inlineAsm() throws RecognitionException {
		InlineAsmContext _localctx = new InlineAsmContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_inlineAsm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(ASM);
			setState(1300);
			optSideEffect();
			setState(1301);
			optAlignStack();
			setState(1302);
			optIntelDialect();
			setState(1303);
			stringLit();
			setState(1304);
			match(COMMA);
			setState(1305);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptSideEffectContext extends ParserRuleContext {
		public TerminalNode SIDEEFFECT() { return getToken(LLVMParser.SIDEEFFECT, 0); }
		public OptSideEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optSideEffect; }
	}

	public final OptSideEffectContext optSideEffect() throws RecognitionException {
		OptSideEffectContext _localctx = new OptSideEffectContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_optSideEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIDEEFFECT) {
				{
				setState(1307);
				match(SIDEEFFECT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptAlignStackContext extends ParserRuleContext {
		public TerminalNode ALIGNSTACK() { return getToken(LLVMParser.ALIGNSTACK, 0); }
		public OptAlignStackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optAlignStack; }
	}

	public final OptAlignStackContext optAlignStack() throws RecognitionException {
		OptAlignStackContext _localctx = new OptAlignStackContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_optAlignStack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNSTACK) {
				{
				setState(1310);
				match(ALIGNSTACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptIntelDialectContext extends ParserRuleContext {
		public TerminalNode INTELDIALECT() { return getToken(LLVMParser.INTELDIALECT, 0); }
		public OptIntelDialectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optIntelDialect; }
	}

	public final OptIntelDialectContext optIntelDialect() throws RecognitionException {
		OptIntelDialectContext _localctx = new OptIntelDialectContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_optIntelDialect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTELDIALECT) {
				{
				setState(1313);
				match(INTELDIALECT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public FloatConstContext floatConst() {
			return getRuleContext(FloatConstContext.class,0);
		}
		public NullConstContext nullConst() {
			return getRuleContext(NullConstContext.class,0);
		}
		public NoneConstContext noneConst() {
			return getRuleContext(NoneConstContext.class,0);
		}
		public StructConstContext structConst() {
			return getRuleContext(StructConstContext.class,0);
		}
		public ArrayConstContext arrayConst() {
			return getRuleContext(ArrayConstContext.class,0);
		}
		public CharArrayConstContext charArrayConst() {
			return getRuleContext(CharArrayConstContext.class,0);
		}
		public VectorConstContext vectorConst() {
			return getRuleContext(VectorConstContext.class,0);
		}
		public ZeroInitializerConstContext zeroInitializerConst() {
			return getRuleContext(ZeroInitializerConstContext.class,0);
		}
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public UndefConstContext undefConst() {
			return getRuleContext(UndefConstContext.class,0);
		}
		public BlockAddressConstContext blockAddressConst() {
			return getRuleContext(BlockAddressConstContext.class,0);
		}
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_constant);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				boolConst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				intConst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1318);
				floatConst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1319);
				nullConst();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1320);
				noneConst();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1321);
				structConst();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1322);
				arrayConst();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1323);
				charArrayConst();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1324);
				vectorConst();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1325);
				zeroInitializerConst();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1326);
				globalIdent();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1327);
				undefConst();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1328);
				blockAddressConst();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1329);
				constantExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolConstContext extends ParserRuleContext {
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_boolConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			boolLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LLVMParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LLVMParser.FALSE, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
	}

	public final BoolLitContext boolLit() throws RecognitionException {
		BoolLitContext _localctx = new BoolLitContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_boolLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntConstContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public IntConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intConst; }
	}

	public final IntConstContext intConst() throws RecognitionException {
		IntConstContext _localctx = new IntConstContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_intConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(INT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public IntLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLit; }
	}

	public final IntLitContext intLit() throws RecognitionException {
		IntLitContext _localctx = new IntLitContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_intLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(INT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatConstContext extends ParserRuleContext {
		public TerminalNode FLOAT_LIT() { return getToken(LLVMParser.FLOAT_LIT, 0); }
		public FloatConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatConst; }
	}

	public final FloatConstContext floatConst() throws RecognitionException {
		FloatConstContext _localctx = new FloatConstContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_floatConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(FLOAT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullConstContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LLVMParser.NULL, 0); }
		public NullConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullConst; }
	}

	public final NullConstContext nullConst() throws RecognitionException {
		NullConstContext _localctx = new NullConstContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_nullConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoneConstContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(LLVMParser.NONE, 0); }
		public NoneConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noneConst; }
	}

	public final NoneConstContext noneConst() throws RecognitionException {
		NoneConstContext _localctx = new NoneConstContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_noneConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(NONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructConstContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public TypeConstListContext typeConstList() {
			return getRuleContext(TypeConstListContext.class,0);
		}
		public TerminalNode LT() { return getToken(LLVMParser.LT, 0); }
		public TerminalNode GT() { return getToken(LLVMParser.GT, 0); }
		public StructConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structConst; }
	}

	public final StructConstContext structConst() throws RecognitionException {
		StructConstContext _localctx = new StructConstContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structConst);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				match(LBRACE);
				setState(1347);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				match(LBRACE);
				setState(1349);
				typeConstList(0);
				setState(1350);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352);
				match(LT);
				setState(1353);
				match(LBRACE);
				setState(1354);
				match(RBRACE);
				setState(1355);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1356);
				match(LT);
				setState(1357);
				match(LBRACE);
				setState(1358);
				typeConstList(0);
				setState(1359);
				match(RBRACE);
				setState(1360);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayConstContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public TypeConstsContext typeConsts() {
			return getRuleContext(TypeConstsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public ArrayConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConst; }
	}

	public final ArrayConstContext arrayConst() throws RecognitionException {
		ArrayConstContext _localctx = new ArrayConstContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arrayConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(LBRACK);
			setState(1365);
			typeConsts();
			setState(1366);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharArrayConstContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(LLVMParser.C, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CharArrayConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrayConst; }
	}

	public final CharArrayConstContext charArrayConst() throws RecognitionException {
		CharArrayConstContext _localctx = new CharArrayConstContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_charArrayConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(C);
			setState(1369);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(LLVMParser.STRING_LIT, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_stringLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorConstContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LLVMParser.LT, 0); }
		public TypeConstsContext typeConsts() {
			return getRuleContext(TypeConstsContext.class,0);
		}
		public TerminalNode GT() { return getToken(LLVMParser.GT, 0); }
		public VectorConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorConst; }
	}

	public final VectorConstContext vectorConst() throws RecognitionException {
		VectorConstContext _localctx = new VectorConstContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_vectorConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(LT);
			setState(1374);
			typeConsts();
			setState(1375);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZeroInitializerConstContext extends ParserRuleContext {
		public TerminalNode ZEROINITIALIZER() { return getToken(LLVMParser.ZEROINITIALIZER, 0); }
		public ZeroInitializerConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroInitializerConst; }
	}

	public final ZeroInitializerConstContext zeroInitializerConst() throws RecognitionException {
		ZeroInitializerConstContext _localctx = new ZeroInitializerConstContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_zeroInitializerConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(ZEROINITIALIZER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndefConstContext extends ParserRuleContext {
		public TerminalNode UNDEF() { return getToken(LLVMParser.UNDEF, 0); }
		public UndefConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefConst; }
	}

	public final UndefConstContext undefConst() throws RecognitionException {
		UndefConstContext _localctx = new UndefConstContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_undefConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(UNDEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockAddressConstContext extends ParserRuleContext {
		public TerminalNode BLOCKADDRESS() { return getToken(LLVMParser.BLOCKADDRESS, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public GlobalIdentContext globalIdent() {
			return getRuleContext(GlobalIdentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public BlockAddressConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAddressConst; }
	}

	public final BlockAddressConstContext blockAddressConst() throws RecognitionException {
		BlockAddressConstContext _localctx = new BlockAddressConstContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_blockAddressConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(BLOCKADDRESS);
			setState(1382);
			match(LPAREN);
			setState(1383);
			globalIdent();
			setState(1384);
			match(COMMA);
			setState(1385);
			localIdent();
			setState(1386);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public FAddExprContext fAddExpr() {
			return getRuleContext(FAddExprContext.class,0);
		}
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public FSubExprContext fSubExpr() {
			return getRuleContext(FSubExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public FMulExprContext fMulExpr() {
			return getRuleContext(FMulExprContext.class,0);
		}
		public UDivExprContext uDivExpr() {
			return getRuleContext(UDivExprContext.class,0);
		}
		public SDivExprContext sDivExpr() {
			return getRuleContext(SDivExprContext.class,0);
		}
		public FDivExprContext fDivExpr() {
			return getRuleContext(FDivExprContext.class,0);
		}
		public URemExprContext uRemExpr() {
			return getRuleContext(URemExprContext.class,0);
		}
		public SRemExprContext sRemExpr() {
			return getRuleContext(SRemExprContext.class,0);
		}
		public FRemExprContext fRemExpr() {
			return getRuleContext(FRemExprContext.class,0);
		}
		public ShlExprContext shlExpr() {
			return getRuleContext(ShlExprContext.class,0);
		}
		public LShrExprContext lShrExpr() {
			return getRuleContext(LShrExprContext.class,0);
		}
		public AshrExprContext ashrExpr() {
			return getRuleContext(AshrExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public XorExprContext xorExpr() {
			return getRuleContext(XorExprContext.class,0);
		}
		public ExtractElementExprContext extractElementExpr() {
			return getRuleContext(ExtractElementExprContext.class,0);
		}
		public InsertElementExprContext insertElementExpr() {
			return getRuleContext(InsertElementExprContext.class,0);
		}
		public ShuffleVectorExprContext shuffleVectorExpr() {
			return getRuleContext(ShuffleVectorExprContext.class,0);
		}
		public ExtractValueExprContext extractValueExpr() {
			return getRuleContext(ExtractValueExprContext.class,0);
		}
		public InsertValueExprContext insertValueExpr() {
			return getRuleContext(InsertValueExprContext.class,0);
		}
		public GetElementPtrExprContext getElementPtrExpr() {
			return getRuleContext(GetElementPtrExprContext.class,0);
		}
		public TruncExprContext truncExpr() {
			return getRuleContext(TruncExprContext.class,0);
		}
		public ZExtExprContext zExtExpr() {
			return getRuleContext(ZExtExprContext.class,0);
		}
		public SExtExprContext sExtExpr() {
			return getRuleContext(SExtExprContext.class,0);
		}
		public FPTruncExprContext fPTruncExpr() {
			return getRuleContext(FPTruncExprContext.class,0);
		}
		public FpExtExprContext fpExtExpr() {
			return getRuleContext(FpExtExprContext.class,0);
		}
		public FpToUIExprContext fpToUIExpr() {
			return getRuleContext(FpToUIExprContext.class,0);
		}
		public FpToSIExprContext fpToSIExpr() {
			return getRuleContext(FpToSIExprContext.class,0);
		}
		public UiToFPExprContext uiToFPExpr() {
			return getRuleContext(UiToFPExprContext.class,0);
		}
		public SiToFPExprContext siToFPExpr() {
			return getRuleContext(SiToFPExprContext.class,0);
		}
		public PtrToIntExprContext ptrToIntExpr() {
			return getRuleContext(PtrToIntExprContext.class,0);
		}
		public IntToPtrExprContext intToPtrExpr() {
			return getRuleContext(IntToPtrExprContext.class,0);
		}
		public BitCastExprContext bitCastExpr() {
			return getRuleContext(BitCastExprContext.class,0);
		}
		public AddrSpaceCastExprContext addrSpaceCastExpr() {
			return getRuleContext(AddrSpaceCastExprContext.class,0);
		}
		public ICmpExprContext iCmpExpr() {
			return getRuleContext(ICmpExprContext.class,0);
		}
		public FCmpExprContext fCmpExpr() {
			return getRuleContext(FCmpExprContext.class,0);
		}
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public ConstantExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpr; }
	}

	public final ConstantExprContext constantExpr() throws RecognitionException {
		ConstantExprContext _localctx = new ConstantExprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_constantExpr);
		try {
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				addExpr();
				}
				break;
			case FADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				fAddExpr();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				subExpr();
				}
				break;
			case FSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1391);
				fSubExpr();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1392);
				mulExpr();
				}
				break;
			case FMUL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1393);
				fMulExpr();
				}
				break;
			case UDIV:
				enterOuterAlt(_localctx, 7);
				{
				setState(1394);
				uDivExpr();
				}
				break;
			case SDIV:
				enterOuterAlt(_localctx, 8);
				{
				setState(1395);
				sDivExpr();
				}
				break;
			case FDIV:
				enterOuterAlt(_localctx, 9);
				{
				setState(1396);
				fDivExpr();
				}
				break;
			case UREM:
				enterOuterAlt(_localctx, 10);
				{
				setState(1397);
				uRemExpr();
				}
				break;
			case SREM:
				enterOuterAlt(_localctx, 11);
				{
				setState(1398);
				sRemExpr();
				}
				break;
			case FREM:
				enterOuterAlt(_localctx, 12);
				{
				setState(1399);
				fRemExpr();
				}
				break;
			case SHL:
				enterOuterAlt(_localctx, 13);
				{
				setState(1400);
				shlExpr();
				}
				break;
			case LSHR:
				enterOuterAlt(_localctx, 14);
				{
				setState(1401);
				lShrExpr();
				}
				break;
			case ASHR:
				enterOuterAlt(_localctx, 15);
				{
				setState(1402);
				ashrExpr();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 16);
				{
				setState(1403);
				andExpr();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 17);
				{
				setState(1404);
				orExpr();
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1405);
				xorExpr();
				}
				break;
			case EXTRACTELEMENT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1406);
				extractElementExpr();
				}
				break;
			case INSERTELEMENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(1407);
				insertElementExpr();
				}
				break;
			case SHUFFLEVECTOR:
				enterOuterAlt(_localctx, 21);
				{
				setState(1408);
				shuffleVectorExpr();
				}
				break;
			case EXTRACTVALUE:
				enterOuterAlt(_localctx, 22);
				{
				setState(1409);
				extractValueExpr();
				}
				break;
			case INSERTVALUE:
				enterOuterAlt(_localctx, 23);
				{
				setState(1410);
				insertValueExpr();
				}
				break;
			case GETELEMENTPTR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1411);
				getElementPtrExpr();
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 25);
				{
				setState(1412);
				truncExpr();
				}
				break;
			case ZEXT:
				enterOuterAlt(_localctx, 26);
				{
				setState(1413);
				zExtExpr();
				}
				break;
			case SEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(1414);
				sExtExpr();
				}
				break;
			case FPTRUNC:
				enterOuterAlt(_localctx, 28);
				{
				setState(1415);
				fPTruncExpr();
				}
				break;
			case FPEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(1416);
				fpExtExpr();
				}
				break;
			case FPTOUI:
				enterOuterAlt(_localctx, 30);
				{
				setState(1417);
				fpToUIExpr();
				}
				break;
			case FPTOSI:
				enterOuterAlt(_localctx, 31);
				{
				setState(1418);
				fpToSIExpr();
				}
				break;
			case UITOFP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1419);
				uiToFPExpr();
				}
				break;
			case SITOFP:
				enterOuterAlt(_localctx, 33);
				{
				setState(1420);
				siToFPExpr();
				}
				break;
			case PTRTOINT:
				enterOuterAlt(_localctx, 34);
				{
				setState(1421);
				ptrToIntExpr();
				}
				break;
			case INTTOPTR:
				enterOuterAlt(_localctx, 35);
				{
				setState(1422);
				intToPtrExpr();
				}
				break;
			case BITCAST:
				enterOuterAlt(_localctx, 36);
				{
				setState(1423);
				bitCastExpr();
				}
				break;
			case ADDRSPACECAST:
				enterOuterAlt(_localctx, 37);
				{
				setState(1424);
				addrSpaceCastExpr();
				}
				break;
			case ICMP:
				enterOuterAlt(_localctx, 38);
				{
				setState(1425);
				iCmpExpr();
				}
				break;
			case FCMP:
				enterOuterAlt(_localctx, 39);
				{
				setState(1426);
				fCmpExpr();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 40);
				{
				setState(1427);
				selectExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LLVMParser.ADD, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(ADD);
			setState(1431);
			overflowFlags();
			setState(1432);
			match(LPAREN);
			setState(1433);
			llvmType(0);
			setState(1434);
			constant();
			setState(1435);
			match(COMMA);
			setState(1436);
			llvmType(0);
			setState(1437);
			constant();
			setState(1438);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FAddExprContext extends ParserRuleContext {
		public TerminalNode FADD() { return getToken(LLVMParser.FADD, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FAddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAddExpr; }
	}

	public final FAddExprContext fAddExpr() throws RecognitionException {
		FAddExprContext _localctx = new FAddExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_fAddExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			match(FADD);
			setState(1441);
			match(LPAREN);
			setState(1442);
			llvmType(0);
			setState(1443);
			constant();
			setState(1444);
			match(COMMA);
			setState(1445);
			llvmType(0);
			setState(1446);
			constant();
			setState(1447);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubExprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LLVMParser.SUB, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpr; }
	}

	public final SubExprContext subExpr() throws RecognitionException {
		SubExprContext _localctx = new SubExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_subExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(SUB);
			setState(1450);
			overflowFlags();
			setState(1451);
			match(LPAREN);
			setState(1452);
			llvmType(0);
			setState(1453);
			constant();
			setState(1454);
			match(COMMA);
			setState(1455);
			llvmType(0);
			setState(1456);
			constant();
			setState(1457);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FSubExprContext extends ParserRuleContext {
		public TerminalNode FSUB() { return getToken(LLVMParser.FSUB, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fSubExpr; }
	}

	public final FSubExprContext fSubExpr() throws RecognitionException {
		FSubExprContext _localctx = new FSubExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_fSubExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(FSUB);
			setState(1460);
			match(LPAREN);
			setState(1461);
			llvmType(0);
			setState(1462);
			constant();
			setState(1463);
			match(COMMA);
			setState(1464);
			llvmType(0);
			setState(1465);
			constant();
			setState(1466);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LLVMParser.MUL, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(MUL);
			setState(1469);
			overflowFlags();
			setState(1470);
			match(LPAREN);
			setState(1471);
			llvmType(0);
			setState(1472);
			constant();
			setState(1473);
			match(COMMA);
			setState(1474);
			llvmType(0);
			setState(1475);
			constant();
			setState(1476);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FMulExprContext extends ParserRuleContext {
		public TerminalNode FMUL() { return getToken(LLVMParser.FMUL, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FMulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fMulExpr; }
	}

	public final FMulExprContext fMulExpr() throws RecognitionException {
		FMulExprContext _localctx = new FMulExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_fMulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(FMUL);
			setState(1479);
			match(LPAREN);
			setState(1480);
			llvmType(0);
			setState(1481);
			constant();
			setState(1482);
			match(COMMA);
			setState(1483);
			llvmType(0);
			setState(1484);
			constant();
			setState(1485);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UDivExprContext extends ParserRuleContext {
		public TerminalNode UDIV() { return getToken(LLVMParser.UDIV, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public UDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uDivExpr; }
	}

	public final UDivExprContext uDivExpr() throws RecognitionException {
		UDivExprContext _localctx = new UDivExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_uDivExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(UDIV);
			setState(1488);
			optExact();
			setState(1489);
			match(LPAREN);
			setState(1490);
			llvmType(0);
			setState(1491);
			constant();
			setState(1492);
			match(COMMA);
			setState(1493);
			llvmType(0);
			setState(1494);
			constant();
			setState(1495);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SDivExprContext extends ParserRuleContext {
		public TerminalNode SDIV() { return getToken(LLVMParser.SDIV, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDivExpr; }
	}

	public final SDivExprContext sDivExpr() throws RecognitionException {
		SDivExprContext _localctx = new SDivExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_sDivExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(SDIV);
			setState(1498);
			optExact();
			setState(1499);
			match(LPAREN);
			setState(1500);
			llvmType(0);
			setState(1501);
			constant();
			setState(1502);
			match(COMMA);
			setState(1503);
			llvmType(0);
			setState(1504);
			constant();
			setState(1505);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FDivExprContext extends ParserRuleContext {
		public TerminalNode FDIV() { return getToken(LLVMParser.FDIV, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fDivExpr; }
	}

	public final FDivExprContext fDivExpr() throws RecognitionException {
		FDivExprContext _localctx = new FDivExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_fDivExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(FDIV);
			setState(1508);
			match(LPAREN);
			setState(1509);
			llvmType(0);
			setState(1510);
			constant();
			setState(1511);
			match(COMMA);
			setState(1512);
			llvmType(0);
			setState(1513);
			constant();
			setState(1514);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class URemExprContext extends ParserRuleContext {
		public TerminalNode UREM() { return getToken(LLVMParser.UREM, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public URemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uRemExpr; }
	}

	public final URemExprContext uRemExpr() throws RecognitionException {
		URemExprContext _localctx = new URemExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_uRemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(UREM);
			setState(1517);
			match(LPAREN);
			setState(1518);
			llvmType(0);
			setState(1519);
			constant();
			setState(1520);
			match(COMMA);
			setState(1521);
			llvmType(0);
			setState(1522);
			constant();
			setState(1523);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SRemExprContext extends ParserRuleContext {
		public TerminalNode SREM() { return getToken(LLVMParser.SREM, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SRemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sRemExpr; }
	}

	public final SRemExprContext sRemExpr() throws RecognitionException {
		SRemExprContext _localctx = new SRemExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_sRemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(SREM);
			setState(1526);
			match(LPAREN);
			setState(1527);
			llvmType(0);
			setState(1528);
			constant();
			setState(1529);
			match(COMMA);
			setState(1530);
			llvmType(0);
			setState(1531);
			constant();
			setState(1532);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FRemExprContext extends ParserRuleContext {
		public TerminalNode FREM() { return getToken(LLVMParser.FREM, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FRemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fRemExpr; }
	}

	public final FRemExprContext fRemExpr() throws RecognitionException {
		FRemExprContext _localctx = new FRemExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fRemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(FREM);
			setState(1535);
			match(LPAREN);
			setState(1536);
			llvmType(0);
			setState(1537);
			constant();
			setState(1538);
			match(COMMA);
			setState(1539);
			llvmType(0);
			setState(1540);
			constant();
			setState(1541);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShlExprContext extends ParserRuleContext {
		public TerminalNode SHL() { return getToken(LLVMParser.SHL, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ShlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shlExpr; }
	}

	public final ShlExprContext shlExpr() throws RecognitionException {
		ShlExprContext _localctx = new ShlExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_shlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(SHL);
			setState(1544);
			overflowFlags();
			setState(1545);
			match(LPAREN);
			setState(1546);
			llvmType(0);
			setState(1547);
			constant();
			setState(1548);
			match(COMMA);
			setState(1549);
			llvmType(0);
			setState(1550);
			constant();
			setState(1551);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LShrExprContext extends ParserRuleContext {
		public TerminalNode LSHR() { return getToken(LLVMParser.LSHR, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public LShrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lShrExpr; }
	}

	public final LShrExprContext lShrExpr() throws RecognitionException {
		LShrExprContext _localctx = new LShrExprContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_lShrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			match(LSHR);
			setState(1554);
			optExact();
			setState(1555);
			match(LPAREN);
			setState(1556);
			llvmType(0);
			setState(1557);
			constant();
			setState(1558);
			match(COMMA);
			setState(1559);
			llvmType(0);
			setState(1560);
			constant();
			setState(1561);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AshrExprContext extends ParserRuleContext {
		public TerminalNode ASHR() { return getToken(LLVMParser.ASHR, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public AshrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ashrExpr; }
	}

	public final AshrExprContext ashrExpr() throws RecognitionException {
		AshrExprContext _localctx = new AshrExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ashrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(ASHR);
			setState(1564);
			optExact();
			setState(1565);
			match(LPAREN);
			setState(1566);
			llvmType(0);
			setState(1567);
			constant();
			setState(1568);
			match(COMMA);
			setState(1569);
			llvmType(0);
			setState(1570);
			constant();
			setState(1571);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LLVMParser.AND, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(AND);
			setState(1574);
			match(LPAREN);
			setState(1575);
			llvmType(0);
			setState(1576);
			constant();
			setState(1577);
			match(COMMA);
			setState(1578);
			llvmType(0);
			setState(1579);
			constant();
			setState(1580);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LLVMParser.OR, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_orExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(OR);
			setState(1583);
			match(LPAREN);
			setState(1584);
			llvmType(0);
			setState(1585);
			constant();
			setState(1586);
			match(COMMA);
			setState(1587);
			llvmType(0);
			setState(1588);
			constant();
			setState(1589);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExprContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(LLVMParser.XOR, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public XorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpr; }
	}

	public final XorExprContext xorExpr() throws RecognitionException {
		XorExprContext _localctx = new XorExprContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_xorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(XOR);
			setState(1592);
			match(LPAREN);
			setState(1593);
			llvmType(0);
			setState(1594);
			constant();
			setState(1595);
			match(COMMA);
			setState(1596);
			llvmType(0);
			setState(1597);
			constant();
			setState(1598);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractElementExprContext extends ParserRuleContext {
		public TerminalNode EXTRACTELEMENT() { return getToken(LLVMParser.EXTRACTELEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ExtractElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractElementExpr; }
	}

	public final ExtractElementExprContext extractElementExpr() throws RecognitionException {
		ExtractElementExprContext _localctx = new ExtractElementExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_extractElementExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(EXTRACTELEMENT);
			setState(1601);
			match(LPAREN);
			setState(1602);
			llvmType(0);
			setState(1603);
			constant();
			setState(1604);
			match(COMMA);
			setState(1605);
			llvmType(0);
			setState(1606);
			constant();
			setState(1607);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertElementExprContext extends ParserRuleContext {
		public TerminalNode INSERTELEMENT() { return getToken(LLVMParser.INSERTELEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public InsertElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertElementExpr; }
	}

	public final InsertElementExprContext insertElementExpr() throws RecognitionException {
		InsertElementExprContext _localctx = new InsertElementExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_insertElementExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(INSERTELEMENT);
			setState(1610);
			match(LPAREN);
			setState(1611);
			llvmType(0);
			setState(1612);
			constant();
			setState(1613);
			match(COMMA);
			setState(1614);
			llvmType(0);
			setState(1615);
			constant();
			setState(1616);
			match(COMMA);
			setState(1617);
			llvmType(0);
			setState(1618);
			constant();
			setState(1619);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShuffleVectorExprContext extends ParserRuleContext {
		public TerminalNode SHUFFLEVECTOR() { return getToken(LLVMParser.SHUFFLEVECTOR, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ShuffleVectorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffleVectorExpr; }
	}

	public final ShuffleVectorExprContext shuffleVectorExpr() throws RecognitionException {
		ShuffleVectorExprContext _localctx = new ShuffleVectorExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_shuffleVectorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(SHUFFLEVECTOR);
			setState(1622);
			match(LPAREN);
			setState(1623);
			llvmType(0);
			setState(1624);
			constant();
			setState(1625);
			match(COMMA);
			setState(1626);
			llvmType(0);
			setState(1627);
			constant();
			setState(1628);
			match(COMMA);
			setState(1629);
			llvmType(0);
			setState(1630);
			constant();
			setState(1631);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractValueExprContext extends ParserRuleContext {
		public TerminalNode EXTRACTVALUE() { return getToken(LLVMParser.EXTRACTVALUE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IndicesContext indices() {
			return getRuleContext(IndicesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ExtractValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractValueExpr; }
	}

	public final ExtractValueExprContext extractValueExpr() throws RecognitionException {
		ExtractValueExprContext _localctx = new ExtractValueExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_extractValueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(EXTRACTVALUE);
			setState(1634);
			match(LPAREN);
			setState(1635);
			llvmType(0);
			setState(1636);
			constant();
			setState(1637);
			indices();
			setState(1638);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValueExprContext extends ParserRuleContext {
		public TerminalNode INSERTVALUE() { return getToken(LLVMParser.INSERTVALUE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public IndicesContext indices() {
			return getRuleContext(IndicesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public InsertValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValueExpr; }
	}

	public final InsertValueExprContext insertValueExpr() throws RecognitionException {
		InsertValueExprContext _localctx = new InsertValueExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_insertValueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(INSERTVALUE);
			setState(1641);
			match(LPAREN);
			setState(1642);
			llvmType(0);
			setState(1643);
			constant();
			setState(1644);
			match(COMMA);
			setState(1645);
			llvmType(0);
			setState(1646);
			constant();
			setState(1647);
			indices();
			setState(1648);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetElementPtrExprContext extends ParserRuleContext {
		public TerminalNode GETELEMENTPTR() { return getToken(LLVMParser.GETELEMENTPTR, 0); }
		public OptInBoundsContext optInBounds() {
			return getRuleContext(OptInBoundsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public GepConstIndicesContext gepConstIndices() {
			return getRuleContext(GepConstIndicesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public GetElementPtrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getElementPtrExpr; }
	}

	public final GetElementPtrExprContext getElementPtrExpr() throws RecognitionException {
		GetElementPtrExprContext _localctx = new GetElementPtrExprContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_getElementPtrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(GETELEMENTPTR);
			setState(1651);
			optInBounds();
			setState(1652);
			match(LPAREN);
			setState(1653);
			llvmType(0);
			setState(1654);
			match(COMMA);
			setState(1655);
			llvmType(0);
			setState(1656);
			constant();
			setState(1657);
			match(COMMA);
			setState(1658);
			gepConstIndices();
			setState(1659);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GepConstIndicesContext extends ParserRuleContext {
		public GepConstIndexListContext gepConstIndexList() {
			return getRuleContext(GepConstIndexListContext.class,0);
		}
		public GepConstIndicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gepConstIndices; }
	}

	public final GepConstIndicesContext gepConstIndices() throws RecognitionException {
		GepConstIndicesContext _localctx = new GepConstIndicesContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_gepConstIndices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LBRACK) | (1L << LBRACE))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (INRANGE - 195)) | (1L << (LABEL - 195)) | (1L << (METADATA - 195)))) != 0) || _la==PPC_FP128 || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (TOKEN - 351)) | (1L << (VOID - 351)) | (1L << (X86_FP80 - 351)) | (1L << (X86_MMX - 351)))) != 0) || _la==INT_TYPE || _la==LOCAL_IDENT) {
				{
				setState(1661);
				gepConstIndexList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GepConstIndexListContext extends ParserRuleContext {
		public GepConstIndexContext gepConstIndex() {
			return getRuleContext(GepConstIndexContext.class,0);
		}
		public GepConstIndexListContext gepConstIndexList() {
			return getRuleContext(GepConstIndexListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public GepConstIndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gepConstIndexList; }
	}

	public final GepConstIndexListContext gepConstIndexList() throws RecognitionException {
		return gepConstIndexList(0);
	}

	private GepConstIndexListContext gepConstIndexList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GepConstIndexListContext _localctx = new GepConstIndexListContext(_ctx, _parentState);
		GepConstIndexListContext _prevctx = _localctx;
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_gepConstIndexList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1665);
			gepConstIndex();
			}
			_ctx.stop = _input.LT(-1);
			setState(1672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GepConstIndexListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_gepConstIndexList);
					setState(1667);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1668);
					match(COMMA);
					setState(1669);
					gepConstIndex();
					}
					} 
				}
				setState(1674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GepConstIndexContext extends ParserRuleContext {
		public OptInrangeContext optInrange() {
			return getRuleContext(OptInrangeContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public GepConstIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gepConstIndex; }
	}

	public final GepConstIndexContext gepConstIndex() throws RecognitionException {
		GepConstIndexContext _localctx = new GepConstIndexContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_gepConstIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			optInrange();
			setState(1676);
			llvmType(0);
			setState(1677);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptInrangeContext extends ParserRuleContext {
		public TerminalNode INRANGE() { return getToken(LLVMParser.INRANGE, 0); }
		public OptInrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optInrange; }
	}

	public final OptInrangeContext optInrange() throws RecognitionException {
		OptInrangeContext _localctx = new OptInrangeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_optInrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INRANGE) {
				{
				setState(1679);
				match(INRANGE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncExprContext extends ParserRuleContext {
		public TerminalNode TRUNC() { return getToken(LLVMParser.TRUNC, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public TruncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncExpr; }
	}

	public final TruncExprContext truncExpr() throws RecognitionException {
		TruncExprContext _localctx = new TruncExprContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_truncExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(TRUNC);
			setState(1683);
			match(LPAREN);
			setState(1684);
			llvmType(0);
			setState(1685);
			constant();
			setState(1686);
			match(TO);
			setState(1687);
			llvmType(0);
			setState(1688);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZExtExprContext extends ParserRuleContext {
		public TerminalNode ZEXT() { return getToken(LLVMParser.ZEXT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ZExtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zExtExpr; }
	}

	public final ZExtExprContext zExtExpr() throws RecognitionException {
		ZExtExprContext _localctx = new ZExtExprContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_zExtExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(ZEXT);
			setState(1691);
			match(LPAREN);
			setState(1692);
			llvmType(0);
			setState(1693);
			constant();
			setState(1694);
			match(TO);
			setState(1695);
			llvmType(0);
			setState(1696);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SExtExprContext extends ParserRuleContext {
		public TerminalNode SEXT() { return getToken(LLVMParser.SEXT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SExtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExtExpr; }
	}

	public final SExtExprContext sExtExpr() throws RecognitionException {
		SExtExprContext _localctx = new SExtExprContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_sExtExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(SEXT);
			setState(1699);
			match(LPAREN);
			setState(1700);
			llvmType(0);
			setState(1701);
			constant();
			setState(1702);
			match(TO);
			setState(1703);
			llvmType(0);
			setState(1704);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FPTruncExprContext extends ParserRuleContext {
		public TerminalNode FPTRUNC() { return getToken(LLVMParser.FPTRUNC, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FPTruncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fPTruncExpr; }
	}

	public final FPTruncExprContext fPTruncExpr() throws RecognitionException {
		FPTruncExprContext _localctx = new FPTruncExprContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fPTruncExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(FPTRUNC);
			setState(1707);
			match(LPAREN);
			setState(1708);
			llvmType(0);
			setState(1709);
			constant();
			setState(1710);
			match(TO);
			setState(1711);
			llvmType(0);
			setState(1712);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpExtExprContext extends ParserRuleContext {
		public TerminalNode FPEXT() { return getToken(LLVMParser.FPEXT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FpExtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpExtExpr; }
	}

	public final FpExtExprContext fpExtExpr() throws RecognitionException {
		FpExtExprContext _localctx = new FpExtExprContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fpExtExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(FPEXT);
			setState(1715);
			match(LPAREN);
			setState(1716);
			llvmType(0);
			setState(1717);
			constant();
			setState(1718);
			match(TO);
			setState(1719);
			llvmType(0);
			setState(1720);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpToUIExprContext extends ParserRuleContext {
		public TerminalNode FPTOUI() { return getToken(LLVMParser.FPTOUI, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FpToUIExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpToUIExpr; }
	}

	public final FpToUIExprContext fpToUIExpr() throws RecognitionException {
		FpToUIExprContext _localctx = new FpToUIExprContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_fpToUIExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(FPTOUI);
			setState(1723);
			match(LPAREN);
			setState(1724);
			llvmType(0);
			setState(1725);
			constant();
			setState(1726);
			match(TO);
			setState(1727);
			llvmType(0);
			setState(1728);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpToSIExprContext extends ParserRuleContext {
		public TerminalNode FPTOSI() { return getToken(LLVMParser.FPTOSI, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FpToSIExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpToSIExpr; }
	}

	public final FpToSIExprContext fpToSIExpr() throws RecognitionException {
		FpToSIExprContext _localctx = new FpToSIExprContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_fpToSIExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(FPTOSI);
			setState(1731);
			match(LPAREN);
			setState(1732);
			llvmType(0);
			setState(1733);
			constant();
			setState(1734);
			match(TO);
			setState(1735);
			llvmType(0);
			setState(1736);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UiToFPExprContext extends ParserRuleContext {
		public TerminalNode UITOFP() { return getToken(LLVMParser.UITOFP, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public UiToFPExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uiToFPExpr; }
	}

	public final UiToFPExprContext uiToFPExpr() throws RecognitionException {
		UiToFPExprContext _localctx = new UiToFPExprContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_uiToFPExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(UITOFP);
			setState(1739);
			match(LPAREN);
			setState(1740);
			llvmType(0);
			setState(1741);
			constant();
			setState(1742);
			match(TO);
			setState(1743);
			llvmType(0);
			setState(1744);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiToFPExprContext extends ParserRuleContext {
		public TerminalNode SITOFP() { return getToken(LLVMParser.SITOFP, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SiToFPExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siToFPExpr; }
	}

	public final SiToFPExprContext siToFPExpr() throws RecognitionException {
		SiToFPExprContext _localctx = new SiToFPExprContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_siToFPExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(SITOFP);
			setState(1747);
			match(LPAREN);
			setState(1748);
			llvmType(0);
			setState(1749);
			constant();
			setState(1750);
			match(TO);
			setState(1751);
			llvmType(0);
			setState(1752);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrToIntExprContext extends ParserRuleContext {
		public TerminalNode PTRTOINT() { return getToken(LLVMParser.PTRTOINT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public PtrToIntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrToIntExpr; }
	}

	public final PtrToIntExprContext ptrToIntExpr() throws RecognitionException {
		PtrToIntExprContext _localctx = new PtrToIntExprContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ptrToIntExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(PTRTOINT);
			setState(1755);
			match(LPAREN);
			setState(1756);
			llvmType(0);
			setState(1757);
			constant();
			setState(1758);
			match(TO);
			setState(1759);
			llvmType(0);
			setState(1760);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntToPtrExprContext extends ParserRuleContext {
		public TerminalNode INTTOPTR() { return getToken(LLVMParser.INTTOPTR, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public IntToPtrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intToPtrExpr; }
	}

	public final IntToPtrExprContext intToPtrExpr() throws RecognitionException {
		IntToPtrExprContext _localctx = new IntToPtrExprContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_intToPtrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(INTTOPTR);
			setState(1763);
			match(LPAREN);
			setState(1764);
			llvmType(0);
			setState(1765);
			constant();
			setState(1766);
			match(TO);
			setState(1767);
			llvmType(0);
			setState(1768);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitCastExprContext extends ParserRuleContext {
		public TerminalNode BITCAST() { return getToken(LLVMParser.BITCAST, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public BitCastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitCastExpr; }
	}

	public final BitCastExprContext bitCastExpr() throws RecognitionException {
		BitCastExprContext _localctx = new BitCastExprContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_bitCastExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(BITCAST);
			setState(1771);
			match(LPAREN);
			setState(1772);
			llvmType(0);
			setState(1773);
			constant();
			setState(1774);
			match(TO);
			setState(1775);
			llvmType(0);
			setState(1776);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrSpaceCastExprContext extends ParserRuleContext {
		public TerminalNode ADDRSPACECAST() { return getToken(LLVMParser.ADDRSPACECAST, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public AddrSpaceCastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrSpaceCastExpr; }
	}

	public final AddrSpaceCastExprContext addrSpaceCastExpr() throws RecognitionException {
		AddrSpaceCastExprContext _localctx = new AddrSpaceCastExprContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_addrSpaceCastExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(ADDRSPACECAST);
			setState(1779);
			match(LPAREN);
			setState(1780);
			llvmType(0);
			setState(1781);
			constant();
			setState(1782);
			match(TO);
			setState(1783);
			llvmType(0);
			setState(1784);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ICmpExprContext extends ParserRuleContext {
		public TerminalNode ICMP() { return getToken(LLVMParser.ICMP, 0); }
		public IPredContext iPred() {
			return getRuleContext(IPredContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ICmpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCmpExpr; }
	}

	public final ICmpExprContext iCmpExpr() throws RecognitionException {
		ICmpExprContext _localctx = new ICmpExprContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_iCmpExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(ICMP);
			setState(1787);
			iPred();
			setState(1788);
			match(LPAREN);
			setState(1789);
			llvmType(0);
			setState(1790);
			constant();
			setState(1791);
			match(COMMA);
			setState(1792);
			llvmType(0);
			setState(1793);
			constant();
			setState(1794);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FCmpExprContext extends ParserRuleContext {
		public TerminalNode FCMP() { return getToken(LLVMParser.FCMP, 0); }
		public FpredContext fpred() {
			return getRuleContext(FpredContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FCmpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fCmpExpr; }
	}

	public final FCmpExprContext fCmpExpr() throws RecognitionException {
		FCmpExprContext _localctx = new FCmpExprContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_fCmpExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(FCMP);
			setState(1797);
			fpred();
			setState(1798);
			match(LPAREN);
			setState(1799);
			llvmType(0);
			setState(1800);
			constant();
			setState(1801);
			match(COMMA);
			setState(1802);
			llvmType(0);
			setState(1803);
			constant();
			setState(1804);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(LLVMParser.SELECT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(SELECT);
			setState(1807);
			match(LPAREN);
			setState(1808);
			llvmType(0);
			setState(1809);
			constant();
			setState(1810);
			match(COMMA);
			setState(1811);
			llvmType(0);
			setState(1812);
			constant();
			setState(1813);
			match(COMMA);
			setState(1814);
			llvmType(0);
			setState(1815);
			constant();
			setState(1816);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicBlockListContext extends ParserRuleContext {
		public BasicBlockContext basicBlock() {
			return getRuleContext(BasicBlockContext.class,0);
		}
		public BasicBlockListContext basicBlockList() {
			return getRuleContext(BasicBlockListContext.class,0);
		}
		public BasicBlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicBlockList; }
	}

	public final BasicBlockListContext basicBlockList() throws RecognitionException {
		return basicBlockList(0);
	}

	private BasicBlockListContext basicBlockList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasicBlockListContext _localctx = new BasicBlockListContext(_ctx, _parentState);
		BasicBlockListContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_basicBlockList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1819);
			basicBlock();
			}
			_ctx.stop = _input.LT(-1);
			setState(1825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasicBlockListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basicBlockList);
					setState(1821);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1822);
					basicBlock();
					}
					} 
				}
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasicBlockContext extends ParserRuleContext {
		public OptLabelIdentContext optLabelIdent() {
			return getRuleContext(OptLabelIdentContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public BasicBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicBlock; }
	}

	public final BasicBlockContext basicBlock() throws RecognitionException {
		BasicBlockContext _localctx = new BasicBlockContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_basicBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			optLabelIdent();
			setState(1829);
			instructions();
			setState(1830);
			terminator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptLabelIdentContext extends ParserRuleContext {
		public LabelIdentContext labelIdent() {
			return getRuleContext(LabelIdentContext.class,0);
		}
		public OptLabelIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optLabelIdent; }
	}

	public final OptLabelIdentContext optLabelIdent() throws RecognitionException {
		OptLabelIdentContext _localctx = new OptLabelIdentContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_optLabelIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENT) {
				{
				setState(1832);
				labelIdent();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADDRSPACECAST - 17)) | (1L << (ALLOCA - 17)) | (1L << (AND - 17)) | (1L << (ASHR - 17)) | (1L << (ATOMICRMW - 17)) | (1L << (BITCAST - 17)) | (1L << (CALL - 17)) | (1L << (CATCHPAD - 17)) | (1L << (CLEANUPPAD - 17)) | (1L << (CMPXCHG - 17)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (EXTRACTELEMENT - 144)) | (1L << (EXTRACTVALUE - 144)) | (1L << (FADD - 144)) | (1L << (FCMP - 144)) | (1L << (FDIV - 144)) | (1L << (FENCE - 144)) | (1L << (FMUL - 144)) | (1L << (FPEXT - 144)) | (1L << (FPTOSI - 144)) | (1L << (FPTOUI - 144)) | (1L << (FPTRUNC - 144)) | (1L << (FREM - 144)) | (1L << (FSUB - 144)) | (1L << (GETELEMENTPTR - 144)) | (1L << (ICMP - 144)) | (1L << (INSERTELEMENT - 144)) | (1L << (INSERTVALUE - 144)) | (1L << (INTTOPTR - 144)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (LANDINGPAD - 211)) | (1L << (LOAD - 211)) | (1L << (LSHR - 211)) | (1L << (MUL - 211)) | (1L << (MUSTTAIL - 211)) | (1L << (NOTAIL - 211)) | (1L << (OR - 211)))) != 0) || ((((_la - 277)) & ~0x3f) == 0 && ((1L << (_la - 277)) & ((1L << (PHI - 277)) | (1L << (PTRTOINT - 277)) | (1L << (SDIV - 277)) | (1L << (SELECT - 277)) | (1L << (SEXT - 277)) | (1L << (SHL - 277)) | (1L << (SHUFFLEVECTOR - 277)) | (1L << (SITOFP - 277)) | (1L << (SREM - 277)) | (1L << (STORE - 277)) | (1L << (SUB - 277)))) != 0) || ((((_la - 344)) & ~0x3f) == 0 && ((1L << (_la - 344)) & ((1L << (TAIL - 344)) | (1L << (TRUNC - 344)) | (1L << (UDIV - 344)) | (1L << (UITOFP - 344)) | (1L << (UREM - 344)) | (1L << (VA_ARG - 344)) | (1L << (XOR - 344)) | (1L << (ZEXT - 344)))) != 0) || _la==LOCAL_IDENT) {
				{
				setState(1835);
				instructionList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionListContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public InstructionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionList; }
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		return instructionList(0);
	}

	private InstructionListContext instructionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionListContext _localctx = new InstructionListContext(_ctx, _parentState);
		InstructionListContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_instructionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1839);
			instruction();
			}
			_ctx.stop = _input.LT(-1);
			setState(1845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructionList);
					setState(1841);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1842);
					instruction();
					}
					} 
				}
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public StoreInstContext storeInst() {
			return getRuleContext(StoreInstContext.class,0);
		}
		public FenceInstContext fenceInst() {
			return getRuleContext(FenceInstContext.class,0);
		}
		public CmpXchgInstContext cmpXchgInst() {
			return getRuleContext(CmpXchgInstContext.class,0);
		}
		public AtomicRMWInstContext atomicRMWInst() {
			return getRuleContext(AtomicRMWInstContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public ValueInstructionContext valueInstruction() {
			return getRuleContext(ValueInstructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_instruction);
		try {
			setState(1857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1848);
				storeInst();
				}
				break;
			case FENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				fenceInst();
				}
				break;
			case CMPXCHG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				cmpXchgInst();
				}
				break;
			case ATOMICRMW:
				enterOuterAlt(_localctx, 4);
				{
				setState(1851);
				atomicRMWInst();
				}
				break;
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1852);
				localIdent();
				setState(1853);
				match(EQSIGN);
				setState(1854);
				valueInstruction();
				}
				break;
			case ADD:
			case ADDRSPACECAST:
			case ALLOCA:
			case AND:
			case ASHR:
			case BITCAST:
			case CALL:
			case CATCHPAD:
			case CLEANUPPAD:
			case EXTRACTELEMENT:
			case EXTRACTVALUE:
			case FADD:
			case FCMP:
			case FDIV:
			case FMUL:
			case FPEXT:
			case FPTOSI:
			case FPTOUI:
			case FPTRUNC:
			case FREM:
			case FSUB:
			case GETELEMENTPTR:
			case ICMP:
			case INSERTELEMENT:
			case INSERTVALUE:
			case INTTOPTR:
			case LANDINGPAD:
			case LOAD:
			case LSHR:
			case MUL:
			case MUSTTAIL:
			case NOTAIL:
			case OR:
			case PHI:
			case PTRTOINT:
			case SDIV:
			case SELECT:
			case SEXT:
			case SHL:
			case SHUFFLEVECTOR:
			case SITOFP:
			case SREM:
			case SUB:
			case TAIL:
			case TRUNC:
			case UDIV:
			case UITOFP:
			case UREM:
			case VA_ARG:
			case XOR:
			case ZEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1856);
				valueInstruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueInstructionContext extends ParserRuleContext {
		public AddInstContext addInst() {
			return getRuleContext(AddInstContext.class,0);
		}
		public FAddInstContext fAddInst() {
			return getRuleContext(FAddInstContext.class,0);
		}
		public SubInstContext subInst() {
			return getRuleContext(SubInstContext.class,0);
		}
		public FSubInstContext fSubInst() {
			return getRuleContext(FSubInstContext.class,0);
		}
		public MulInstContext mulInst() {
			return getRuleContext(MulInstContext.class,0);
		}
		public FMulInstContext fMulInst() {
			return getRuleContext(FMulInstContext.class,0);
		}
		public UDivInstContext uDivInst() {
			return getRuleContext(UDivInstContext.class,0);
		}
		public SDivInstContext sDivInst() {
			return getRuleContext(SDivInstContext.class,0);
		}
		public FDivInstContext fDivInst() {
			return getRuleContext(FDivInstContext.class,0);
		}
		public URemInstContext uRemInst() {
			return getRuleContext(URemInstContext.class,0);
		}
		public SRemInstContext sRemInst() {
			return getRuleContext(SRemInstContext.class,0);
		}
		public FRemInstContext fRemInst() {
			return getRuleContext(FRemInstContext.class,0);
		}
		public ShlInstContext shlInst() {
			return getRuleContext(ShlInstContext.class,0);
		}
		public LshrInstContext lshrInst() {
			return getRuleContext(LshrInstContext.class,0);
		}
		public AshrInstContext ashrInst() {
			return getRuleContext(AshrInstContext.class,0);
		}
		public AndInstContext andInst() {
			return getRuleContext(AndInstContext.class,0);
		}
		public OrInstContext orInst() {
			return getRuleContext(OrInstContext.class,0);
		}
		public XorInstContext xorInst() {
			return getRuleContext(XorInstContext.class,0);
		}
		public ExtractElementInstContext extractElementInst() {
			return getRuleContext(ExtractElementInstContext.class,0);
		}
		public InsertElementInstContext insertElementInst() {
			return getRuleContext(InsertElementInstContext.class,0);
		}
		public ShuffleVectorInstContext shuffleVectorInst() {
			return getRuleContext(ShuffleVectorInstContext.class,0);
		}
		public ExtractValueInstContext extractValueInst() {
			return getRuleContext(ExtractValueInstContext.class,0);
		}
		public InsertValueInstContext insertValueInst() {
			return getRuleContext(InsertValueInstContext.class,0);
		}
		public AllocaInstContext allocaInst() {
			return getRuleContext(AllocaInstContext.class,0);
		}
		public LoadInstContext loadInst() {
			return getRuleContext(LoadInstContext.class,0);
		}
		public GetElementPtrInstContext getElementPtrInst() {
			return getRuleContext(GetElementPtrInstContext.class,0);
		}
		public TruncInstContext truncInst() {
			return getRuleContext(TruncInstContext.class,0);
		}
		public ZExtInstContext zExtInst() {
			return getRuleContext(ZExtInstContext.class,0);
		}
		public SExtInstContext sExtInst() {
			return getRuleContext(SExtInstContext.class,0);
		}
		public FpTruncInstContext fpTruncInst() {
			return getRuleContext(FpTruncInstContext.class,0);
		}
		public FpExtInstContext fpExtInst() {
			return getRuleContext(FpExtInstContext.class,0);
		}
		public FpToUIInstContext fpToUIInst() {
			return getRuleContext(FpToUIInstContext.class,0);
		}
		public FpToSIInstContext fpToSIInst() {
			return getRuleContext(FpToSIInstContext.class,0);
		}
		public UiToFPInstContext uiToFPInst() {
			return getRuleContext(UiToFPInstContext.class,0);
		}
		public SiToFPInstContext siToFPInst() {
			return getRuleContext(SiToFPInstContext.class,0);
		}
		public PtrToIntInstContext ptrToIntInst() {
			return getRuleContext(PtrToIntInstContext.class,0);
		}
		public IntToPtrInstContext intToPtrInst() {
			return getRuleContext(IntToPtrInstContext.class,0);
		}
		public BitCastInstContext bitCastInst() {
			return getRuleContext(BitCastInstContext.class,0);
		}
		public AddrSpaceCastInstContext addrSpaceCastInst() {
			return getRuleContext(AddrSpaceCastInstContext.class,0);
		}
		public ICmpInstContext iCmpInst() {
			return getRuleContext(ICmpInstContext.class,0);
		}
		public FCmpInstContext fCmpInst() {
			return getRuleContext(FCmpInstContext.class,0);
		}
		public PhiInstContext phiInst() {
			return getRuleContext(PhiInstContext.class,0);
		}
		public SelectInstContext selectInst() {
			return getRuleContext(SelectInstContext.class,0);
		}
		public CallInstContext callInst() {
			return getRuleContext(CallInstContext.class,0);
		}
		public VaArgInstContext vaArgInst() {
			return getRuleContext(VaArgInstContext.class,0);
		}
		public LandingPadInstContext landingPadInst() {
			return getRuleContext(LandingPadInstContext.class,0);
		}
		public CatchPadInstContext catchPadInst() {
			return getRuleContext(CatchPadInstContext.class,0);
		}
		public CleanupPadInstContext cleanupPadInst() {
			return getRuleContext(CleanupPadInstContext.class,0);
		}
		public ValueInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueInstruction; }
	}

	public final ValueInstructionContext valueInstruction() throws RecognitionException {
		ValueInstructionContext _localctx = new ValueInstructionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_valueInstruction);
		try {
			setState(1907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				addInst();
				}
				break;
			case FADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				fAddInst();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				subInst();
				}
				break;
			case FSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1862);
				fSubInst();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1863);
				mulInst();
				}
				break;
			case FMUL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1864);
				fMulInst();
				}
				break;
			case UDIV:
				enterOuterAlt(_localctx, 7);
				{
				setState(1865);
				uDivInst();
				}
				break;
			case SDIV:
				enterOuterAlt(_localctx, 8);
				{
				setState(1866);
				sDivInst();
				}
				break;
			case FDIV:
				enterOuterAlt(_localctx, 9);
				{
				setState(1867);
				fDivInst();
				}
				break;
			case UREM:
				enterOuterAlt(_localctx, 10);
				{
				setState(1868);
				uRemInst();
				}
				break;
			case SREM:
				enterOuterAlt(_localctx, 11);
				{
				setState(1869);
				sRemInst();
				}
				break;
			case FREM:
				enterOuterAlt(_localctx, 12);
				{
				setState(1870);
				fRemInst();
				}
				break;
			case SHL:
				enterOuterAlt(_localctx, 13);
				{
				setState(1871);
				shlInst();
				}
				break;
			case LSHR:
				enterOuterAlt(_localctx, 14);
				{
				setState(1872);
				lshrInst();
				}
				break;
			case ASHR:
				enterOuterAlt(_localctx, 15);
				{
				setState(1873);
				ashrInst();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 16);
				{
				setState(1874);
				andInst();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 17);
				{
				setState(1875);
				orInst();
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1876);
				xorInst();
				}
				break;
			case EXTRACTELEMENT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1877);
				extractElementInst();
				}
				break;
			case INSERTELEMENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(1878);
				insertElementInst();
				}
				break;
			case SHUFFLEVECTOR:
				enterOuterAlt(_localctx, 21);
				{
				setState(1879);
				shuffleVectorInst();
				}
				break;
			case EXTRACTVALUE:
				enterOuterAlt(_localctx, 22);
				{
				setState(1880);
				extractValueInst();
				}
				break;
			case INSERTVALUE:
				enterOuterAlt(_localctx, 23);
				{
				setState(1881);
				insertValueInst();
				}
				break;
			case ALLOCA:
				enterOuterAlt(_localctx, 24);
				{
				setState(1882);
				allocaInst();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 25);
				{
				setState(1883);
				loadInst();
				}
				break;
			case GETELEMENTPTR:
				enterOuterAlt(_localctx, 26);
				{
				setState(1884);
				getElementPtrInst();
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 27);
				{
				setState(1885);
				truncInst();
				}
				break;
			case ZEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1886);
				zExtInst();
				}
				break;
			case SEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(1887);
				sExtInst();
				}
				break;
			case FPTRUNC:
				enterOuterAlt(_localctx, 30);
				{
				setState(1888);
				fpTruncInst();
				}
				break;
			case FPEXT:
				enterOuterAlt(_localctx, 31);
				{
				setState(1889);
				fpExtInst();
				}
				break;
			case FPTOUI:
				enterOuterAlt(_localctx, 32);
				{
				setState(1890);
				fpToUIInst();
				}
				break;
			case FPTOSI:
				enterOuterAlt(_localctx, 33);
				{
				setState(1891);
				fpToSIInst();
				}
				break;
			case UITOFP:
				enterOuterAlt(_localctx, 34);
				{
				setState(1892);
				uiToFPInst();
				}
				break;
			case SITOFP:
				enterOuterAlt(_localctx, 35);
				{
				setState(1893);
				siToFPInst();
				}
				break;
			case PTRTOINT:
				enterOuterAlt(_localctx, 36);
				{
				setState(1894);
				ptrToIntInst();
				}
				break;
			case INTTOPTR:
				enterOuterAlt(_localctx, 37);
				{
				setState(1895);
				intToPtrInst();
				}
				break;
			case BITCAST:
				enterOuterAlt(_localctx, 38);
				{
				setState(1896);
				bitCastInst();
				}
				break;
			case ADDRSPACECAST:
				enterOuterAlt(_localctx, 39);
				{
				setState(1897);
				addrSpaceCastInst();
				}
				break;
			case ICMP:
				enterOuterAlt(_localctx, 40);
				{
				setState(1898);
				iCmpInst();
				}
				break;
			case FCMP:
				enterOuterAlt(_localctx, 41);
				{
				setState(1899);
				fCmpInst();
				}
				break;
			case PHI:
				enterOuterAlt(_localctx, 42);
				{
				setState(1900);
				phiInst();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 43);
				{
				setState(1901);
				selectInst();
				}
				break;
			case CALL:
			case MUSTTAIL:
			case NOTAIL:
			case TAIL:
				enterOuterAlt(_localctx, 44);
				{
				setState(1902);
				callInst();
				}
				break;
			case VA_ARG:
				enterOuterAlt(_localctx, 45);
				{
				setState(1903);
				vaArgInst();
				}
				break;
			case LANDINGPAD:
				enterOuterAlt(_localctx, 46);
				{
				setState(1904);
				landingPadInst();
				}
				break;
			case CATCHPAD:
				enterOuterAlt(_localctx, 47);
				{
				setState(1905);
				catchPadInst();
				}
				break;
			case CLEANUPPAD:
				enterOuterAlt(_localctx, 48);
				{
				setState(1906);
				cleanupPadInst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddInstContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LLVMParser.ADD, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public AddInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addInst; }
	}

	public final AddInstContext addInst() throws RecognitionException {
		AddInstContext _localctx = new AddInstContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_addInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(ADD);
			setState(1910);
			overflowFlags();
			setState(1911);
			llvmType(0);
			setState(1912);
			value();
			setState(1913);
			match(COMMA);
			setState(1914);
			value();
			setState(1915);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FAddInstContext extends ParserRuleContext {
		public TerminalNode FADD() { return getToken(LLVMParser.FADD, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FAddInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAddInst; }
	}

	public final FAddInstContext fAddInst() throws RecognitionException {
		FAddInstContext _localctx = new FAddInstContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_fAddInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			match(FADD);
			setState(1918);
			fastMathFlags();
			setState(1919);
			llvmType(0);
			setState(1920);
			value();
			setState(1921);
			match(COMMA);
			setState(1922);
			value();
			setState(1923);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubInstContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LLVMParser.SUB, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SubInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subInst; }
	}

	public final SubInstContext subInst() throws RecognitionException {
		SubInstContext _localctx = new SubInstContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_subInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(SUB);
			setState(1926);
			overflowFlags();
			setState(1927);
			llvmType(0);
			setState(1928);
			value();
			setState(1929);
			match(COMMA);
			setState(1930);
			value();
			setState(1931);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FSubInstContext extends ParserRuleContext {
		public TerminalNode FSUB() { return getToken(LLVMParser.FSUB, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FSubInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fSubInst; }
	}

	public final FSubInstContext fSubInst() throws RecognitionException {
		FSubInstContext _localctx = new FSubInstContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fSubInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			match(FSUB);
			setState(1934);
			fastMathFlags();
			setState(1935);
			llvmType(0);
			setState(1936);
			value();
			setState(1937);
			match(COMMA);
			setState(1938);
			value();
			setState(1939);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulInstContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LLVMParser.MUL, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public MulInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulInst; }
	}

	public final MulInstContext mulInst() throws RecognitionException {
		MulInstContext _localctx = new MulInstContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_mulInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(MUL);
			setState(1942);
			overflowFlags();
			setState(1943);
			llvmType(0);
			setState(1944);
			value();
			setState(1945);
			match(COMMA);
			setState(1946);
			value();
			setState(1947);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FMulInstContext extends ParserRuleContext {
		public TerminalNode FMUL() { return getToken(LLVMParser.FMUL, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FMulInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fMulInst; }
	}

	public final FMulInstContext fMulInst() throws RecognitionException {
		FMulInstContext _localctx = new FMulInstContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_fMulInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			match(FMUL);
			setState(1950);
			fastMathFlags();
			setState(1951);
			llvmType(0);
			setState(1952);
			value();
			setState(1953);
			match(COMMA);
			setState(1954);
			value();
			setState(1955);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UDivInstContext extends ParserRuleContext {
		public TerminalNode UDIV() { return getToken(LLVMParser.UDIV, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public UDivInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uDivInst; }
	}

	public final UDivInstContext uDivInst() throws RecognitionException {
		UDivInstContext _localctx = new UDivInstContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_uDivInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(UDIV);
			setState(1958);
			optExact();
			setState(1959);
			llvmType(0);
			setState(1960);
			value();
			setState(1961);
			match(COMMA);
			setState(1962);
			value();
			setState(1963);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SDivInstContext extends ParserRuleContext {
		public TerminalNode SDIV() { return getToken(LLVMParser.SDIV, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SDivInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDivInst; }
	}

	public final SDivInstContext sDivInst() throws RecognitionException {
		SDivInstContext _localctx = new SDivInstContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_sDivInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(SDIV);
			setState(1966);
			optExact();
			setState(1967);
			llvmType(0);
			setState(1968);
			value();
			setState(1969);
			match(COMMA);
			setState(1970);
			value();
			setState(1971);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FDivInstContext extends ParserRuleContext {
		public TerminalNode FDIV() { return getToken(LLVMParser.FDIV, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FDivInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fDivInst; }
	}

	public final FDivInstContext fDivInst() throws RecognitionException {
		FDivInstContext _localctx = new FDivInstContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_fDivInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(FDIV);
			setState(1974);
			fastMathFlags();
			setState(1975);
			llvmType(0);
			setState(1976);
			value();
			setState(1977);
			match(COMMA);
			setState(1978);
			value();
			setState(1979);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class URemInstContext extends ParserRuleContext {
		public TerminalNode UREM() { return getToken(LLVMParser.UREM, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public URemInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uRemInst; }
	}

	public final URemInstContext uRemInst() throws RecognitionException {
		URemInstContext _localctx = new URemInstContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_uRemInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			match(UREM);
			setState(1982);
			llvmType(0);
			setState(1983);
			value();
			setState(1984);
			match(COMMA);
			setState(1985);
			value();
			setState(1986);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SRemInstContext extends ParserRuleContext {
		public TerminalNode SREM() { return getToken(LLVMParser.SREM, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SRemInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sRemInst; }
	}

	public final SRemInstContext sRemInst() throws RecognitionException {
		SRemInstContext _localctx = new SRemInstContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_sRemInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(SREM);
			setState(1989);
			llvmType(0);
			setState(1990);
			value();
			setState(1991);
			match(COMMA);
			setState(1992);
			value();
			setState(1993);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FRemInstContext extends ParserRuleContext {
		public TerminalNode FREM() { return getToken(LLVMParser.FREM, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FRemInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fRemInst; }
	}

	public final FRemInstContext fRemInst() throws RecognitionException {
		FRemInstContext _localctx = new FRemInstContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fRemInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(FREM);
			setState(1996);
			fastMathFlags();
			setState(1997);
			llvmType(0);
			setState(1998);
			value();
			setState(1999);
			match(COMMA);
			setState(2000);
			value();
			setState(2001);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShlInstContext extends ParserRuleContext {
		public TerminalNode SHL() { return getToken(LLVMParser.SHL, 0); }
		public OverflowFlagsContext overflowFlags() {
			return getRuleContext(OverflowFlagsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ShlInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shlInst; }
	}

	public final ShlInstContext shlInst() throws RecognitionException {
		ShlInstContext _localctx = new ShlInstContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_shlInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			match(SHL);
			setState(2004);
			overflowFlags();
			setState(2005);
			llvmType(0);
			setState(2006);
			value();
			setState(2007);
			match(COMMA);
			setState(2008);
			value();
			setState(2009);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LshrInstContext extends ParserRuleContext {
		public TerminalNode LSHR() { return getToken(LLVMParser.LSHR, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public LshrInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lshrInst; }
	}

	public final LshrInstContext lshrInst() throws RecognitionException {
		LshrInstContext _localctx = new LshrInstContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_lshrInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(LSHR);
			setState(2012);
			optExact();
			setState(2013);
			llvmType(0);
			setState(2014);
			value();
			setState(2015);
			match(COMMA);
			setState(2016);
			value();
			setState(2017);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AshrInstContext extends ParserRuleContext {
		public TerminalNode ASHR() { return getToken(LLVMParser.ASHR, 0); }
		public OptExactContext optExact() {
			return getRuleContext(OptExactContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public AshrInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ashrInst; }
	}

	public final AshrInstContext ashrInst() throws RecognitionException {
		AshrInstContext _localctx = new AshrInstContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_ashrInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			match(ASHR);
			setState(2020);
			optExact();
			setState(2021);
			llvmType(0);
			setState(2022);
			value();
			setState(2023);
			match(COMMA);
			setState(2024);
			value();
			setState(2025);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndInstContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LLVMParser.AND, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public AndInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andInst; }
	}

	public final AndInstContext andInst() throws RecognitionException {
		AndInstContext _localctx = new AndInstContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_andInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(AND);
			setState(2028);
			llvmType(0);
			setState(2029);
			value();
			setState(2030);
			match(COMMA);
			setState(2031);
			value();
			setState(2032);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrInstContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LLVMParser.OR, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public OrInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orInst; }
	}

	public final OrInstContext orInst() throws RecognitionException {
		OrInstContext _localctx = new OrInstContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_orInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			match(OR);
			setState(2035);
			llvmType(0);
			setState(2036);
			value();
			setState(2037);
			match(COMMA);
			setState(2038);
			value();
			setState(2039);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorInstContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(LLVMParser.XOR, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public XorInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorInst; }
	}

	public final XorInstContext xorInst() throws RecognitionException {
		XorInstContext _localctx = new XorInstContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_xorInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			match(XOR);
			setState(2042);
			llvmType(0);
			setState(2043);
			value();
			setState(2044);
			match(COMMA);
			setState(2045);
			value();
			setState(2046);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractElementInstContext extends ParserRuleContext {
		public TerminalNode EXTRACTELEMENT() { return getToken(LLVMParser.EXTRACTELEMENT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ExtractElementInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractElementInst; }
	}

	public final ExtractElementInstContext extractElementInst() throws RecognitionException {
		ExtractElementInstContext _localctx = new ExtractElementInstContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_extractElementInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(EXTRACTELEMENT);
			setState(2049);
			llvmType(0);
			setState(2050);
			value();
			setState(2051);
			match(COMMA);
			setState(2052);
			llvmType(0);
			setState(2053);
			value();
			setState(2054);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertElementInstContext extends ParserRuleContext {
		public TerminalNode INSERTELEMENT() { return getToken(LLVMParser.INSERTELEMENT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public InsertElementInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertElementInst; }
	}

	public final InsertElementInstContext insertElementInst() throws RecognitionException {
		InsertElementInstContext _localctx = new InsertElementInstContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_insertElementInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(INSERTELEMENT);
			setState(2057);
			llvmType(0);
			setState(2058);
			value();
			setState(2059);
			match(COMMA);
			setState(2060);
			llvmType(0);
			setState(2061);
			value();
			setState(2062);
			match(COMMA);
			setState(2063);
			llvmType(0);
			setState(2064);
			value();
			setState(2065);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShuffleVectorInstContext extends ParserRuleContext {
		public TerminalNode SHUFFLEVECTOR() { return getToken(LLVMParser.SHUFFLEVECTOR, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ShuffleVectorInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffleVectorInst; }
	}

	public final ShuffleVectorInstContext shuffleVectorInst() throws RecognitionException {
		ShuffleVectorInstContext _localctx = new ShuffleVectorInstContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_shuffleVectorInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(SHUFFLEVECTOR);
			setState(2068);
			llvmType(0);
			setState(2069);
			value();
			setState(2070);
			match(COMMA);
			setState(2071);
			llvmType(0);
			setState(2072);
			value();
			setState(2073);
			match(COMMA);
			setState(2074);
			llvmType(0);
			setState(2075);
			value();
			setState(2076);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractValueInstContext extends ParserRuleContext {
		public TerminalNode EXTRACTVALUE() { return getToken(LLVMParser.EXTRACTVALUE, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ExtractValueInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractValueInst; }
	}

	public final ExtractValueInstContext extractValueInst() throws RecognitionException {
		ExtractValueInstContext _localctx = new ExtractValueInstContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_extractValueInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(EXTRACTVALUE);
			setState(2079);
			llvmType(0);
			setState(2080);
			value();
			setState(2081);
			match(COMMA);
			setState(2082);
			indexList(0);
			setState(2083);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValueInstContext extends ParserRuleContext {
		public TerminalNode INSERTVALUE() { return getToken(LLVMParser.INSERTVALUE, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public InsertValueInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValueInst; }
	}

	public final InsertValueInstContext insertValueInst() throws RecognitionException {
		InsertValueInstContext _localctx = new InsertValueInstContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_insertValueInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			match(INSERTVALUE);
			setState(2086);
			llvmType(0);
			setState(2087);
			value();
			setState(2088);
			match(COMMA);
			setState(2089);
			llvmType(0);
			setState(2090);
			value();
			setState(2091);
			match(COMMA);
			setState(2092);
			indexList(0);
			setState(2093);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocaInstContext extends ParserRuleContext {
		public TerminalNode ALLOCA() { return getToken(LLVMParser.ALLOCA, 0); }
		public OptInAllocaContext optInAlloca() {
			return getRuleContext(OptInAllocaContext.class,0);
		}
		public OptSwiftErrorContext optSwiftError() {
			return getRuleContext(OptSwiftErrorContext.class,0);
		}
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AddrSpaceContext addrSpace() {
			return getRuleContext(AddrSpaceContext.class,0);
		}
		public AllocaInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocaInst; }
	}

	public final AllocaInstContext allocaInst() throws RecognitionException {
		AllocaInstContext _localctx = new AllocaInstContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_allocaInst);
		try {
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				match(ALLOCA);
				setState(2096);
				optInAlloca();
				setState(2097);
				optSwiftError();
				setState(2098);
				llvmType(0);
				setState(2099);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(ALLOCA);
				setState(2102);
				optInAlloca();
				setState(2103);
				optSwiftError();
				setState(2104);
				llvmType(0);
				setState(2105);
				match(COMMA);
				setState(2106);
				alignment();
				setState(2107);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2109);
				match(ALLOCA);
				setState(2110);
				optInAlloca();
				setState(2111);
				optSwiftError();
				setState(2112);
				llvmType(0);
				setState(2113);
				match(COMMA);
				setState(2114);
				llvmType(0);
				setState(2115);
				value();
				setState(2116);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2118);
				match(ALLOCA);
				setState(2119);
				optInAlloca();
				setState(2120);
				optSwiftError();
				setState(2121);
				llvmType(0);
				setState(2122);
				match(COMMA);
				setState(2123);
				llvmType(0);
				setState(2124);
				value();
				setState(2125);
				match(COMMA);
				setState(2126);
				alignment();
				setState(2127);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2129);
				match(ALLOCA);
				setState(2130);
				optInAlloca();
				setState(2131);
				optSwiftError();
				setState(2132);
				llvmType(0);
				setState(2133);
				match(COMMA);
				setState(2134);
				addrSpace();
				setState(2135);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2137);
				match(ALLOCA);
				setState(2138);
				optInAlloca();
				setState(2139);
				optSwiftError();
				setState(2140);
				llvmType(0);
				setState(2141);
				match(COMMA);
				setState(2142);
				alignment();
				setState(2143);
				match(COMMA);
				setState(2144);
				addrSpace();
				setState(2145);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2147);
				match(ALLOCA);
				setState(2148);
				optInAlloca();
				setState(2149);
				optSwiftError();
				setState(2150);
				llvmType(0);
				setState(2151);
				match(COMMA);
				setState(2152);
				llvmType(0);
				setState(2153);
				value();
				setState(2154);
				match(COMMA);
				setState(2155);
				addrSpace();
				setState(2156);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2158);
				match(ALLOCA);
				setState(2159);
				optInAlloca();
				setState(2160);
				optSwiftError();
				setState(2161);
				llvmType(0);
				setState(2162);
				match(COMMA);
				setState(2163);
				llvmType(0);
				setState(2164);
				value();
				setState(2165);
				match(COMMA);
				setState(2166);
				alignment();
				setState(2167);
				match(COMMA);
				setState(2168);
				addrSpace();
				setState(2169);
				optCommaSepMetadataAttachmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptInAllocaContext extends ParserRuleContext {
		public TerminalNode INALLOCA() { return getToken(LLVMParser.INALLOCA, 0); }
		public OptInAllocaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optInAlloca; }
	}

	public final OptInAllocaContext optInAlloca() throws RecognitionException {
		OptInAllocaContext _localctx = new OptInAllocaContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_optInAlloca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INALLOCA) {
				{
				setState(2173);
				match(INALLOCA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptSwiftErrorContext extends ParserRuleContext {
		public TerminalNode SWIFTERROR() { return getToken(LLVMParser.SWIFTERROR, 0); }
		public OptSwiftErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optSwiftError; }
	}

	public final OptSwiftErrorContext optSwiftError() throws RecognitionException {
		OptSwiftErrorContext _localctx = new OptSwiftErrorContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_optSwiftError);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SWIFTERROR) {
				{
				setState(2176);
				match(SWIFTERROR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadInstContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(LLVMParser.LOAD, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public TerminalNode VOLATILE() { return getToken(LLVMParser.VOLATILE, 0); }
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public TerminalNode ATOMIC() { return getToken(LLVMParser.ATOMIC, 0); }
		public OptSyncScopeContext optSyncScope() {
			return getRuleContext(OptSyncScopeContext.class,0);
		}
		public AtomicOrderingContext atomicOrdering() {
			return getRuleContext(AtomicOrderingContext.class,0);
		}
		public LoadInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadInst; }
	}

	public final LoadInstContext loadInst() throws RecognitionException {
		LoadInstContext _localctx = new LoadInstContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_loadInst);
		int _la;
		try {
			setState(2229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				match(LOAD);
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2180);
					match(VOLATILE);
					}
				}

				setState(2183);
				llvmType(0);
				setState(2184);
				match(COMMA);
				setState(2185);
				llvmType(0);
				setState(2186);
				value();
				setState(2187);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2189);
				match(LOAD);
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2190);
					match(VOLATILE);
					}
				}

				setState(2193);
				llvmType(0);
				setState(2194);
				match(COMMA);
				setState(2195);
				llvmType(0);
				setState(2196);
				value();
				setState(2197);
				match(COMMA);
				setState(2198);
				alignment();
				setState(2199);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2201);
				match(LOAD);
				setState(2202);
				match(ATOMIC);
				setState(2204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2203);
					match(VOLATILE);
					}
				}

				setState(2206);
				llvmType(0);
				setState(2207);
				match(COMMA);
				setState(2208);
				llvmType(0);
				setState(2209);
				value();
				setState(2210);
				optSyncScope();
				setState(2211);
				atomicOrdering();
				setState(2212);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2214);
				match(LOAD);
				setState(2215);
				match(ATOMIC);
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2216);
					match(VOLATILE);
					}
				}

				setState(2219);
				llvmType(0);
				setState(2220);
				match(COMMA);
				setState(2221);
				llvmType(0);
				setState(2222);
				value();
				setState(2223);
				optSyncScope();
				setState(2224);
				atomicOrdering();
				setState(2225);
				match(COMMA);
				setState(2226);
				alignment();
				setState(2227);
				optCommaSepMetadataAttachmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StoreInstContext extends ParserRuleContext {
		public TerminalNode STORE() { return getToken(LLVMParser.STORE, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public TerminalNode VOLATILE() { return getToken(LLVMParser.VOLATILE, 0); }
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public TerminalNode ATOMIC() { return getToken(LLVMParser.ATOMIC, 0); }
		public OptSyncScopeContext optSyncScope() {
			return getRuleContext(OptSyncScopeContext.class,0);
		}
		public AtomicOrderingContext atomicOrdering() {
			return getRuleContext(AtomicOrderingContext.class,0);
		}
		public StoreInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeInst; }
	}

	public final StoreInstContext storeInst() throws RecognitionException {
		StoreInstContext _localctx = new StoreInstContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_storeInst);
		int _la;
		try {
			setState(2285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2231);
				match(STORE);
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2232);
					match(VOLATILE);
					}
				}

				setState(2235);
				llvmType(0);
				setState(2236);
				value();
				setState(2237);
				match(COMMA);
				setState(2238);
				llvmType(0);
				setState(2239);
				value();
				setState(2240);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				match(STORE);
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2243);
					match(VOLATILE);
					}
				}

				setState(2246);
				llvmType(0);
				setState(2247);
				value();
				setState(2248);
				match(COMMA);
				setState(2249);
				llvmType(0);
				setState(2250);
				value();
				setState(2251);
				match(COMMA);
				setState(2252);
				alignment();
				setState(2253);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2255);
				match(STORE);
				setState(2256);
				match(ATOMIC);
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2257);
					match(VOLATILE);
					}
				}

				setState(2260);
				llvmType(0);
				setState(2261);
				value();
				setState(2262);
				match(COMMA);
				setState(2263);
				llvmType(0);
				setState(2264);
				value();
				setState(2265);
				optSyncScope();
				setState(2266);
				atomicOrdering();
				setState(2267);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2269);
				match(STORE);
				setState(2270);
				match(ATOMIC);
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE) {
					{
					setState(2271);
					match(VOLATILE);
					}
				}

				setState(2274);
				llvmType(0);
				setState(2275);
				value();
				setState(2276);
				match(COMMA);
				setState(2277);
				llvmType(0);
				setState(2278);
				value();
				setState(2279);
				optSyncScope();
				setState(2280);
				atomicOrdering();
				setState(2281);
				match(COMMA);
				setState(2282);
				alignment();
				setState(2283);
				optCommaSepMetadataAttachmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FenceInstContext extends ParserRuleContext {
		public TerminalNode FENCE() { return getToken(LLVMParser.FENCE, 0); }
		public OptSyncScopeContext optSyncScope() {
			return getRuleContext(OptSyncScopeContext.class,0);
		}
		public AtomicOrderingContext atomicOrdering() {
			return getRuleContext(AtomicOrderingContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FenceInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fenceInst; }
	}

	public final FenceInstContext fenceInst() throws RecognitionException {
		FenceInstContext _localctx = new FenceInstContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_fenceInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			match(FENCE);
			setState(2288);
			optSyncScope();
			setState(2289);
			atomicOrdering();
			setState(2290);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpXchgInstContext extends ParserRuleContext {
		public TerminalNode CMPXCHG() { return getToken(LLVMParser.CMPXCHG, 0); }
		public OptWeakContext optWeak() {
			return getRuleContext(OptWeakContext.class,0);
		}
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public OptSyncScopeContext optSyncScope() {
			return getRuleContext(OptSyncScopeContext.class,0);
		}
		public List<AtomicOrderingContext> atomicOrdering() {
			return getRuleContexts(AtomicOrderingContext.class);
		}
		public AtomicOrderingContext atomicOrdering(int i) {
			return getRuleContext(AtomicOrderingContext.class,i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public TerminalNode VOLATILE() { return getToken(LLVMParser.VOLATILE, 0); }
		public CmpXchgInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpXchgInst; }
	}

	public final CmpXchgInstContext cmpXchgInst() throws RecognitionException {
		CmpXchgInstContext _localctx = new CmpXchgInstContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_cmpXchgInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			match(CMPXCHG);
			setState(2293);
			optWeak();
			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(2294);
				match(VOLATILE);
				}
			}

			setState(2297);
			llvmType(0);
			setState(2298);
			value();
			setState(2299);
			match(COMMA);
			setState(2300);
			llvmType(0);
			setState(2301);
			value();
			setState(2302);
			match(COMMA);
			setState(2303);
			llvmType(0);
			setState(2304);
			value();
			setState(2305);
			optSyncScope();
			setState(2306);
			atomicOrdering();
			setState(2307);
			atomicOrdering();
			setState(2308);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptWeakContext extends ParserRuleContext {
		public TerminalNode WEAK() { return getToken(LLVMParser.WEAK, 0); }
		public OptWeakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optWeak; }
	}

	public final OptWeakContext optWeak() throws RecognitionException {
		OptWeakContext _localctx = new OptWeakContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_optWeak);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEAK) {
				{
				setState(2310);
				match(WEAK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicRMWInstContext extends ParserRuleContext {
		public TerminalNode ATOMICRMW() { return getToken(LLVMParser.ATOMICRMW, 0); }
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptSyncScopeContext optSyncScope() {
			return getRuleContext(OptSyncScopeContext.class,0);
		}
		public AtomicOrderingContext atomicOrdering() {
			return getRuleContext(AtomicOrderingContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public TerminalNode VOLATILE() { return getToken(LLVMParser.VOLATILE, 0); }
		public AtomicRMWInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicRMWInst; }
	}

	public final AtomicRMWInstContext atomicRMWInst() throws RecognitionException {
		AtomicRMWInstContext _localctx = new AtomicRMWInstContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_atomicRMWInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(ATOMICRMW);
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(2314);
				match(VOLATILE);
				}
			}

			setState(2317);
			binOp();
			setState(2318);
			llvmType(0);
			setState(2319);
			value();
			setState(2320);
			match(COMMA);
			setState(2321);
			llvmType(0);
			setState(2322);
			value();
			setState(2323);
			optSyncScope();
			setState(2324);
			atomicOrdering();
			setState(2325);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LLVMParser.ADD, 0); }
		public TerminalNode AND() { return getToken(LLVMParser.AND, 0); }
		public TerminalNode MAX() { return getToken(LLVMParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(LLVMParser.MIN, 0); }
		public TerminalNode NAND() { return getToken(LLVMParser.NAND, 0); }
		public TerminalNode OR() { return getToken(LLVMParser.OR, 0); }
		public TerminalNode SUB() { return getToken(LLVMParser.SUB, 0); }
		public TerminalNode UMAX() { return getToken(LLVMParser.UMAX, 0); }
		public TerminalNode UMIN() { return getToken(LLVMParser.UMIN, 0); }
		public TerminalNode XCHG() { return getToken(LLVMParser.XCHG, 0); }
		public TerminalNode XOR() { return getToken(LLVMParser.XOR, 0); }
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==AND || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (MAX - 226)) | (1L << (MIN - 226)) | (1L << (NAND - 226)) | (1L << (OR - 226)))) != 0) || ((((_la - 337)) & ~0x3f) == 0 && ((1L << (_la - 337)) & ((1L << (SUB - 337)) | (1L << (UMAX - 337)) | (1L << (UMIN - 337)))) != 0) || _la==XCHG || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetElementPtrInstContext extends ParserRuleContext {
		public TerminalNode GETELEMENTPTR() { return getToken(LLVMParser.GETELEMENTPTR, 0); }
		public OptInBoundsContext optInBounds() {
			return getRuleContext(OptInBoundsContext.class,0);
		}
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CommaSepTypeValueListContext commaSepTypeValueList() {
			return getRuleContext(CommaSepTypeValueListContext.class,0);
		}
		public GetElementPtrInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getElementPtrInst; }
	}

	public final GetElementPtrInstContext getElementPtrInst() throws RecognitionException {
		GetElementPtrInstContext _localctx = new GetElementPtrInstContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_getElementPtrInst);
		try {
			setState(2347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				match(GETELEMENTPTR);
				setState(2330);
				optInBounds();
				setState(2331);
				llvmType(0);
				setState(2332);
				match(COMMA);
				setState(2333);
				llvmType(0);
				setState(2334);
				value();
				setState(2335);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2337);
				match(GETELEMENTPTR);
				setState(2338);
				optInBounds();
				setState(2339);
				llvmType(0);
				setState(2340);
				match(COMMA);
				setState(2341);
				llvmType(0);
				setState(2342);
				value();
				setState(2343);
				match(COMMA);
				setState(2344);
				commaSepTypeValueList(0);
				setState(2345);
				optCommaSepMetadataAttachmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncInstContext extends ParserRuleContext {
		public TerminalNode TRUNC() { return getToken(LLVMParser.TRUNC, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public TruncInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncInst; }
	}

	public final TruncInstContext truncInst() throws RecognitionException {
		TruncInstContext _localctx = new TruncInstContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_truncInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(TRUNC);
			setState(2350);
			llvmType(0);
			setState(2351);
			value();
			setState(2352);
			match(TO);
			setState(2353);
			llvmType(0);
			setState(2354);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZExtInstContext extends ParserRuleContext {
		public TerminalNode ZEXT() { return getToken(LLVMParser.ZEXT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ZExtInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zExtInst; }
	}

	public final ZExtInstContext zExtInst() throws RecognitionException {
		ZExtInstContext _localctx = new ZExtInstContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_zExtInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(ZEXT);
			setState(2357);
			llvmType(0);
			setState(2358);
			value();
			setState(2359);
			match(TO);
			setState(2360);
			llvmType(0);
			setState(2361);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SExtInstContext extends ParserRuleContext {
		public TerminalNode SEXT() { return getToken(LLVMParser.SEXT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SExtInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExtInst; }
	}

	public final SExtInstContext sExtInst() throws RecognitionException {
		SExtInstContext _localctx = new SExtInstContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_sExtInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			match(SEXT);
			setState(2364);
			llvmType(0);
			setState(2365);
			value();
			setState(2366);
			match(TO);
			setState(2367);
			llvmType(0);
			setState(2368);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpTruncInstContext extends ParserRuleContext {
		public TerminalNode FPTRUNC() { return getToken(LLVMParser.FPTRUNC, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FpTruncInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpTruncInst; }
	}

	public final FpTruncInstContext fpTruncInst() throws RecognitionException {
		FpTruncInstContext _localctx = new FpTruncInstContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_fpTruncInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			match(FPTRUNC);
			setState(2371);
			llvmType(0);
			setState(2372);
			value();
			setState(2373);
			match(TO);
			setState(2374);
			llvmType(0);
			setState(2375);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpExtInstContext extends ParserRuleContext {
		public TerminalNode FPEXT() { return getToken(LLVMParser.FPEXT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FpExtInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpExtInst; }
	}

	public final FpExtInstContext fpExtInst() throws RecognitionException {
		FpExtInstContext _localctx = new FpExtInstContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_fpExtInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(FPEXT);
			setState(2378);
			llvmType(0);
			setState(2379);
			value();
			setState(2380);
			match(TO);
			setState(2381);
			llvmType(0);
			setState(2382);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpToUIInstContext extends ParserRuleContext {
		public TerminalNode FPTOUI() { return getToken(LLVMParser.FPTOUI, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FpToUIInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpToUIInst; }
	}

	public final FpToUIInstContext fpToUIInst() throws RecognitionException {
		FpToUIInstContext _localctx = new FpToUIInstContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_fpToUIInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			match(FPTOUI);
			setState(2385);
			llvmType(0);
			setState(2386);
			value();
			setState(2387);
			match(TO);
			setState(2388);
			llvmType(0);
			setState(2389);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpToSIInstContext extends ParserRuleContext {
		public TerminalNode FPTOSI() { return getToken(LLVMParser.FPTOSI, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FpToSIInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpToSIInst; }
	}

	public final FpToSIInstContext fpToSIInst() throws RecognitionException {
		FpToSIInstContext _localctx = new FpToSIInstContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_fpToSIInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(FPTOSI);
			setState(2392);
			llvmType(0);
			setState(2393);
			value();
			setState(2394);
			match(TO);
			setState(2395);
			llvmType(0);
			setState(2396);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UiToFPInstContext extends ParserRuleContext {
		public TerminalNode UITOFP() { return getToken(LLVMParser.UITOFP, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public UiToFPInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uiToFPInst; }
	}

	public final UiToFPInstContext uiToFPInst() throws RecognitionException {
		UiToFPInstContext _localctx = new UiToFPInstContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_uiToFPInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			match(UITOFP);
			setState(2399);
			llvmType(0);
			setState(2400);
			value();
			setState(2401);
			match(TO);
			setState(2402);
			llvmType(0);
			setState(2403);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiToFPInstContext extends ParserRuleContext {
		public TerminalNode SITOFP() { return getToken(LLVMParser.SITOFP, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SiToFPInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siToFPInst; }
	}

	public final SiToFPInstContext siToFPInst() throws RecognitionException {
		SiToFPInstContext _localctx = new SiToFPInstContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_siToFPInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
			match(SITOFP);
			setState(2406);
			llvmType(0);
			setState(2407);
			value();
			setState(2408);
			match(TO);
			setState(2409);
			llvmType(0);
			setState(2410);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrToIntInstContext extends ParserRuleContext {
		public TerminalNode PTRTOINT() { return getToken(LLVMParser.PTRTOINT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public PtrToIntInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrToIntInst; }
	}

	public final PtrToIntInstContext ptrToIntInst() throws RecognitionException {
		PtrToIntInstContext _localctx = new PtrToIntInstContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_ptrToIntInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			match(PTRTOINT);
			setState(2413);
			llvmType(0);
			setState(2414);
			value();
			setState(2415);
			match(TO);
			setState(2416);
			llvmType(0);
			setState(2417);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntToPtrInstContext extends ParserRuleContext {
		public TerminalNode INTTOPTR() { return getToken(LLVMParser.INTTOPTR, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public IntToPtrInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intToPtrInst; }
	}

	public final IntToPtrInstContext intToPtrInst() throws RecognitionException {
		IntToPtrInstContext _localctx = new IntToPtrInstContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_intToPtrInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(INTTOPTR);
			setState(2420);
			llvmType(0);
			setState(2421);
			value();
			setState(2422);
			match(TO);
			setState(2423);
			llvmType(0);
			setState(2424);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitCastInstContext extends ParserRuleContext {
		public TerminalNode BITCAST() { return getToken(LLVMParser.BITCAST, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public BitCastInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitCastInst; }
	}

	public final BitCastInstContext bitCastInst() throws RecognitionException {
		BitCastInstContext _localctx = new BitCastInstContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_bitCastInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			match(BITCAST);
			setState(2427);
			llvmType(0);
			setState(2428);
			value();
			setState(2429);
			match(TO);
			setState(2430);
			llvmType(0);
			setState(2431);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrSpaceCastInstContext extends ParserRuleContext {
		public TerminalNode ADDRSPACECAST() { return getToken(LLVMParser.ADDRSPACECAST, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public AddrSpaceCastInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrSpaceCastInst; }
	}

	public final AddrSpaceCastInstContext addrSpaceCastInst() throws RecognitionException {
		AddrSpaceCastInstContext _localctx = new AddrSpaceCastInstContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_addrSpaceCastInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(ADDRSPACECAST);
			setState(2434);
			llvmType(0);
			setState(2435);
			value();
			setState(2436);
			match(TO);
			setState(2437);
			llvmType(0);
			setState(2438);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ICmpInstContext extends ParserRuleContext {
		public TerminalNode ICMP() { return getToken(LLVMParser.ICMP, 0); }
		public IPredContext iPred() {
			return getRuleContext(IPredContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ICmpInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCmpInst; }
	}

	public final ICmpInstContext iCmpInst() throws RecognitionException {
		ICmpInstContext _localctx = new ICmpInstContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_iCmpInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(ICMP);
			setState(2441);
			iPred();
			setState(2442);
			llvmType(0);
			setState(2443);
			value();
			setState(2444);
			match(COMMA);
			setState(2445);
			value();
			setState(2446);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FCmpInstContext extends ParserRuleContext {
		public TerminalNode FCMP() { return getToken(LLVMParser.FCMP, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public FpredContext fpred() {
			return getRuleContext(FpredContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public FCmpInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fCmpInst; }
	}

	public final FCmpInstContext fCmpInst() throws RecognitionException {
		FCmpInstContext _localctx = new FCmpInstContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_fCmpInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			match(FCMP);
			setState(2449);
			fastMathFlags();
			setState(2450);
			fpred();
			setState(2451);
			llvmType(0);
			setState(2452);
			value();
			setState(2453);
			match(COMMA);
			setState(2454);
			value();
			setState(2455);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhiInstContext extends ParserRuleContext {
		public TerminalNode PHI() { return getToken(LLVMParser.PHI, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public IncListContext incList() {
			return getRuleContext(IncListContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public PhiInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phiInst; }
	}

	public final PhiInstContext phiInst() throws RecognitionException {
		PhiInstContext _localctx = new PhiInstContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_phiInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(PHI);
			setState(2458);
			llvmType(0);
			setState(2459);
			incList(0);
			setState(2460);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncListContext extends ParserRuleContext {
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public IncListContext incList() {
			return getRuleContext(IncListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public IncListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incList; }
	}

	public final IncListContext incList() throws RecognitionException {
		return incList(0);
	}

	private IncListContext incList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IncListContext _localctx = new IncListContext(_ctx, _parentState);
		IncListContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_incList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2463);
			inc();
			}
			_ctx.stop = _input.LT(-1);
			setState(2470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IncListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_incList);
					setState(2465);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2466);
					match(COMMA);
					setState(2467);
					inc();
					}
					} 
				}
				setState(2472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IncContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(LBRACK);
			setState(2474);
			value();
			setState(2475);
			match(COMMA);
			setState(2476);
			localIdent();
			setState(2477);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectInstContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(LLVMParser.SELECT, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SelectInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectInst; }
	}

	public final SelectInstContext selectInst() throws RecognitionException {
		SelectInstContext _localctx = new SelectInstContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_selectInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(SELECT);
			setState(2480);
			llvmType(0);
			setState(2481);
			value();
			setState(2482);
			match(COMMA);
			setState(2483);
			llvmType(0);
			setState(2484);
			value();
			setState(2485);
			match(COMMA);
			setState(2486);
			llvmType(0);
			setState(2487);
			value();
			setState(2488);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallInstContext extends ParserRuleContext {
		public OptTailContext optTail() {
			return getRuleContext(OptTailContext.class,0);
		}
		public TerminalNode CALL() { return getToken(LLVMParser.CALL, 0); }
		public FastMathFlagsContext fastMathFlags() {
			return getRuleContext(FastMathFlagsContext.class,0);
		}
		public OptCallingConvContext optCallingConv() {
			return getRuleContext(OptCallingConvContext.class,0);
		}
		public ReturnAttrsContext returnAttrs() {
			return getRuleContext(ReturnAttrsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public OperandBundlesContext operandBundles() {
			return getRuleContext(OperandBundlesContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CallInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callInst; }
	}

	public final CallInstContext callInst() throws RecognitionException {
		CallInstContext _localctx = new CallInstContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_callInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			optTail();
			setState(2491);
			match(CALL);
			setState(2492);
			fastMathFlags();
			setState(2493);
			optCallingConv();
			setState(2494);
			returnAttrs();
			setState(2495);
			llvmType(0);
			setState(2496);
			value();
			setState(2497);
			match(LPAREN);
			setState(2498);
			args();
			setState(2499);
			match(RPAREN);
			setState(2500);
			funcAttrs();
			setState(2501);
			operandBundles();
			setState(2502);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptTailContext extends ParserRuleContext {
		public TerminalNode MUSTTAIL() { return getToken(LLVMParser.MUSTTAIL, 0); }
		public TerminalNode NOTAIL() { return getToken(LLVMParser.NOTAIL, 0); }
		public TerminalNode TAIL() { return getToken(LLVMParser.TAIL, 0); }
		public OptTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optTail; }
	}

	public final OptTailContext optTail() throws RecognitionException {
		OptTailContext _localctx = new OptTailContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_optTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUSTTAIL || _la==NOTAIL || _la==TAIL) {
				{
				setState(2504);
				_la = _input.LA(1);
				if ( !(_la==MUSTTAIL || _la==NOTAIL || _la==TAIL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VaArgInstContext extends ParserRuleContext {
		public TerminalNode VA_ARG() { return getToken(LLVMParser.VA_ARG, 0); }
		public List<LlvmTypeContext> llvmType() {
			return getRuleContexts(LlvmTypeContext.class);
		}
		public LlvmTypeContext llvmType(int i) {
			return getRuleContext(LlvmTypeContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public VaArgInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vaArgInst; }
	}

	public final VaArgInstContext vaArgInst() throws RecognitionException {
		VaArgInstContext _localctx = new VaArgInstContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_vaArgInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			match(VA_ARG);
			setState(2508);
			llvmType(0);
			setState(2509);
			value();
			setState(2510);
			match(COMMA);
			setState(2511);
			llvmType(0);
			setState(2512);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LandingPadInstContext extends ParserRuleContext {
		public TerminalNode LANDINGPAD() { return getToken(LLVMParser.LANDINGPAD, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public OptCleanupContext optCleanup() {
			return getRuleContext(OptCleanupContext.class,0);
		}
		public ClausesContext clauses() {
			return getRuleContext(ClausesContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public LandingPadInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landingPadInst; }
	}

	public final LandingPadInstContext landingPadInst() throws RecognitionException {
		LandingPadInstContext _localctx = new LandingPadInstContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_landingPadInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			match(LANDINGPAD);
			setState(2515);
			llvmType(0);
			setState(2516);
			optCleanup();
			setState(2517);
			clauses();
			setState(2518);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptCleanupContext extends ParserRuleContext {
		public TerminalNode CLEANUP() { return getToken(LLVMParser.CLEANUP, 0); }
		public OptCleanupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optCleanup; }
	}

	public final OptCleanupContext optCleanup() throws RecognitionException {
		OptCleanupContext _localctx = new OptCleanupContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_optCleanup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(2520);
				match(CLEANUP);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClausesContext extends ParserRuleContext {
		public ClauseListContext clauseList() {
			return getRuleContext(ClauseListContext.class,0);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(2523);
				clauseList(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseListContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public ClauseListContext clauseList() {
			return getRuleContext(ClauseListContext.class,0);
		}
		public ClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseList; }
	}

	public final ClauseListContext clauseList() throws RecognitionException {
		return clauseList(0);
	}

	private ClauseListContext clauseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClauseListContext _localctx = new ClauseListContext(_ctx, _parentState);
		ClauseListContext _prevctx = _localctx;
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_clauseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2527);
			clause();
			}
			_ctx.stop = _input.LT(-1);
			setState(2533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClauseListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_clauseList);
					setState(2529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2530);
					clause();
					}
					} 
				}
				setState(2535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(LLVMParser.CATCH, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(LLVMParser.FILTER, 0); }
		public ArrayConstContext arrayConst() {
			return getRuleContext(ArrayConstContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_clause);
		try {
			setState(2544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				match(CATCH);
				setState(2537);
				llvmType(0);
				setState(2538);
				value();
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2540);
				match(FILTER);
				setState(2541);
				llvmType(0);
				setState(2542);
				arrayConst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchPadInstContext extends ParserRuleContext {
		public TerminalNode CATCHPAD() { return getToken(LLVMParser.CATCHPAD, 0); }
		public TerminalNode WITHIN() { return getToken(LLVMParser.WITHIN, 0); }
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public ExceptionArgsContext exceptionArgs() {
			return getRuleContext(ExceptionArgsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CatchPadInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchPadInst; }
	}

	public final CatchPadInstContext catchPadInst() throws RecognitionException {
		CatchPadInstContext _localctx = new CatchPadInstContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_catchPadInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			match(CATCHPAD);
			setState(2547);
			match(WITHIN);
			setState(2548);
			localIdent();
			setState(2549);
			match(LBRACK);
			setState(2550);
			exceptionArgs();
			setState(2551);
			match(RBRACK);
			setState(2552);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CleanupPadInstContext extends ParserRuleContext {
		public TerminalNode CLEANUPPAD() { return getToken(LLVMParser.CLEANUPPAD, 0); }
		public TerminalNode WITHIN() { return getToken(LLVMParser.WITHIN, 0); }
		public ExceptionScopeContext exceptionScope() {
			return getRuleContext(ExceptionScopeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public ExceptionArgsContext exceptionArgs() {
			return getRuleContext(ExceptionArgsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CleanupPadInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cleanupPadInst; }
	}

	public final CleanupPadInstContext cleanupPadInst() throws RecognitionException {
		CleanupPadInstContext _localctx = new CleanupPadInstContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_cleanupPadInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			match(CLEANUPPAD);
			setState(2555);
			match(WITHIN);
			setState(2556);
			exceptionScope();
			setState(2557);
			match(LBRACK);
			setState(2558);
			exceptionArgs();
			setState(2559);
			match(RBRACK);
			setState(2560);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminatorContext extends ParserRuleContext {
		public RetTermContext retTerm() {
			return getRuleContext(RetTermContext.class,0);
		}
		public BrTermContext brTerm() {
			return getRuleContext(BrTermContext.class,0);
		}
		public CondBrTermContext condBrTerm() {
			return getRuleContext(CondBrTermContext.class,0);
		}
		public SwitchTermContext switchTerm() {
			return getRuleContext(SwitchTermContext.class,0);
		}
		public IndirectBrTermContext indirectBrTerm() {
			return getRuleContext(IndirectBrTermContext.class,0);
		}
		public InvokeTermContext invokeTerm() {
			return getRuleContext(InvokeTermContext.class,0);
		}
		public ResumeTermContext resumeTerm() {
			return getRuleContext(ResumeTermContext.class,0);
		}
		public CatchSwitchTermContext catchSwitchTerm() {
			return getRuleContext(CatchSwitchTermContext.class,0);
		}
		public CatchRetTermContext catchRetTerm() {
			return getRuleContext(CatchRetTermContext.class,0);
		}
		public CleanupRetTermContext cleanupRetTerm() {
			return getRuleContext(CleanupRetTermContext.class,0);
		}
		public UnreachableTermContext unreachableTerm() {
			return getRuleContext(UnreachableTermContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_terminator);
		try {
			setState(2573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2562);
				retTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2563);
				brTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2564);
				condBrTerm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2565);
				switchTerm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2566);
				indirectBrTerm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2567);
				invokeTerm();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2568);
				resumeTerm();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2569);
				catchSwitchTerm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2570);
				catchRetTerm();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2571);
				cleanupRetTerm();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2572);
				unreachableTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetTermContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(LLVMParser.RET, 0); }
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LLVMParser.STAR, 0); }
		public ConcreteNonRecTypeContext concreteNonRecType() {
			return getRuleContext(ConcreteNonRecTypeContext.class,0);
		}
		public RetTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retTerm; }
	}

	public final RetTermContext retTerm() throws RecognitionException {
		RetTermContext _localctx = new RetTermContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_retTerm);
		try {
			setState(2590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2575);
				match(RET);
				setState(2576);
				voidType();
				setState(2577);
				optCommaSepMetadataAttachmentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2579);
				match(RET);
				setState(2585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(2580);
					llvmType(0);
					setState(2581);
					optAddrSpace();
					setState(2582);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(2584);
					concreteNonRecType();
					}
					break;
				}
				setState(2587);
				value();
				setState(2588);
				optCommaSepMetadataAttachmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrTermContext extends ParserRuleContext {
		public TerminalNode BR() { return getToken(LLVMParser.BR, 0); }
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public BrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brTerm; }
	}

	public final BrTermContext brTerm() throws RecognitionException {
		BrTermContext _localctx = new BrTermContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_brTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2592);
			match(BR);
			setState(2593);
			labelType();
			setState(2594);
			localIdent();
			setState(2595);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondBrTermContext extends ParserRuleContext {
		public TerminalNode BR() { return getToken(LLVMParser.BR, 0); }
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LLVMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LLVMParser.COMMA, i);
		}
		public List<LabelTypeContext> labelType() {
			return getRuleContexts(LabelTypeContext.class);
		}
		public LabelTypeContext labelType(int i) {
			return getRuleContext(LabelTypeContext.class,i);
		}
		public List<LocalIdentContext> localIdent() {
			return getRuleContexts(LocalIdentContext.class);
		}
		public LocalIdentContext localIdent(int i) {
			return getRuleContext(LocalIdentContext.class,i);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CondBrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBrTerm; }
	}

	public final CondBrTermContext condBrTerm() throws RecognitionException {
		CondBrTermContext _localctx = new CondBrTermContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_condBrTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			match(BR);
			setState(2598);
			intType();
			setState(2599);
			value();
			setState(2600);
			match(COMMA);
			setState(2601);
			labelType();
			setState(2602);
			localIdent();
			setState(2603);
			match(COMMA);
			setState(2604);
			labelType();
			setState(2605);
			localIdent();
			setState(2606);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchTermContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LLVMParser.SWITCH, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public SwitchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchTerm; }
	}

	public final SwitchTermContext switchTerm() throws RecognitionException {
		SwitchTermContext _localctx = new SwitchTermContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_switchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2608);
			match(SWITCH);
			setState(2609);
			llvmType(0);
			setState(2610);
			value();
			setState(2611);
			match(COMMA);
			setState(2612);
			labelType();
			setState(2613);
			localIdent();
			setState(2614);
			match(LBRACK);
			setState(2615);
			cases();
			setState(2616);
			match(RBRACK);
			setState(2617);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LBRACK) | (1L << LBRACE))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || _la==LABEL || _la==METADATA || _la==PPC_FP128 || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (TOKEN - 351)) | (1L << (VOID - 351)) | (1L << (X86_FP80 - 351)) | (1L << (X86_MMX - 351)))) != 0) || _la==INT_TYPE || _la==LOCAL_IDENT) {
				{
				setState(2619);
				caseList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseListContext extends ParserRuleContext {
		public LlvmCaseContext llvmCase() {
			return getRuleContext(LlvmCaseContext.class,0);
		}
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public CaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseList; }
	}

	public final CaseListContext caseList() throws RecognitionException {
		return caseList(0);
	}

	private CaseListContext caseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaseListContext _localctx = new CaseListContext(_ctx, _parentState);
		CaseListContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_caseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2623);
			llvmCase();
			}
			_ctx.stop = _input.LT(-1);
			setState(2629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaseListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_caseList);
					setState(2625);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2626);
					llvmCase();
					}
					} 
				}
				setState(2631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LlvmCaseContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public LlvmCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llvmCase; }
	}

	public final LlvmCaseContext llvmCase() throws RecognitionException {
		LlvmCaseContext _localctx = new LlvmCaseContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_llvmCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			llvmType(0);
			setState(2633);
			intConst();
			setState(2634);
			match(COMMA);
			setState(2635);
			labelType();
			setState(2636);
			localIdent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectBrTermContext extends ParserRuleContext {
		public TerminalNode INDIRECTBR() { return getToken(LLVMParser.INDIRECTBR, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public IndirectBrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectBrTerm; }
	}

	public final IndirectBrTermContext indirectBrTerm() throws RecognitionException {
		IndirectBrTermContext _localctx = new IndirectBrTermContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_indirectBrTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(INDIRECTBR);
			setState(2639);
			llvmType(0);
			setState(2640);
			value();
			setState(2641);
			match(COMMA);
			setState(2642);
			match(LBRACK);
			setState(2643);
			labelList(0);
			setState(2644);
			match(RBRACK);
			setState(2645);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelListContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public LabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelList; }
	}

	public final LabelListContext labelList() throws RecognitionException {
		return labelList(0);
	}

	private LabelListContext labelList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LabelListContext _localctx = new LabelListContext(_ctx, _parentState);
		LabelListContext _prevctx = _localctx;
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_labelList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2648);
			label();
			}
			_ctx.stop = _input.LT(-1);
			setState(2655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LabelListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_labelList);
					setState(2650);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2651);
					match(COMMA);
					setState(2652);
					label();
					}
					} 
				}
				setState(2657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			labelType();
			setState(2659);
			localIdent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeTermContext extends ParserRuleContext {
		public TerminalNode INVOKE() { return getToken(LLVMParser.INVOKE, 0); }
		public OptCallingConvContext optCallingConv() {
			return getRuleContext(OptCallingConvContext.class,0);
		}
		public ReturnAttrsContext returnAttrs() {
			return getRuleContext(ReturnAttrsContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public FuncAttrsContext funcAttrs() {
			return getRuleContext(FuncAttrsContext.class,0);
		}
		public OperandBundlesContext operandBundles() {
			return getRuleContext(OperandBundlesContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public List<LabelTypeContext> labelType() {
			return getRuleContexts(LabelTypeContext.class);
		}
		public LabelTypeContext labelType(int i) {
			return getRuleContext(LabelTypeContext.class,i);
		}
		public List<LocalIdentContext> localIdent() {
			return getRuleContexts(LocalIdentContext.class);
		}
		public LocalIdentContext localIdent(int i) {
			return getRuleContext(LocalIdentContext.class,i);
		}
		public TerminalNode UNWIND() { return getToken(LLVMParser.UNWIND, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public InvokeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeTerm; }
	}

	public final InvokeTermContext invokeTerm() throws RecognitionException {
		InvokeTermContext _localctx = new InvokeTermContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_invokeTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2661);
			match(INVOKE);
			setState(2662);
			optCallingConv();
			setState(2663);
			returnAttrs();
			setState(2664);
			llvmType(0);
			setState(2665);
			value();
			setState(2666);
			match(LPAREN);
			setState(2667);
			args();
			setState(2668);
			match(RPAREN);
			setState(2669);
			funcAttrs();
			setState(2670);
			operandBundles();
			setState(2671);
			match(TO);
			setState(2672);
			labelType();
			setState(2673);
			localIdent();
			setState(2674);
			match(UNWIND);
			setState(2675);
			labelType();
			setState(2676);
			localIdent();
			setState(2677);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResumeTermContext extends ParserRuleContext {
		public TerminalNode RESUME() { return getToken(LLVMParser.RESUME, 0); }
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public ResumeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumeTerm; }
	}

	public final ResumeTermContext resumeTerm() throws RecognitionException {
		ResumeTermContext _localctx = new ResumeTermContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_resumeTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			match(RESUME);
			setState(2680);
			llvmType(0);
			setState(2681);
			value();
			setState(2682);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchSwitchTermContext extends ParserRuleContext {
		public TerminalNode CATCHSWITCH() { return getToken(LLVMParser.CATCHSWITCH, 0); }
		public TerminalNode WITHIN() { return getToken(LLVMParser.WITHIN, 0); }
		public ExceptionScopeContext exceptionScope() {
			return getRuleContext(ExceptionScopeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public TerminalNode UNWIND() { return getToken(LLVMParser.UNWIND, 0); }
		public UnwindTargetContext unwindTarget() {
			return getRuleContext(UnwindTargetContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CatchSwitchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchSwitchTerm; }
	}

	public final CatchSwitchTermContext catchSwitchTerm() throws RecognitionException {
		CatchSwitchTermContext _localctx = new CatchSwitchTermContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_catchSwitchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			match(CATCHSWITCH);
			setState(2685);
			match(WITHIN);
			setState(2686);
			exceptionScope();
			setState(2687);
			match(LBRACK);
			setState(2688);
			labelList(0);
			setState(2689);
			match(RBRACK);
			setState(2690);
			match(UNWIND);
			setState(2691);
			unwindTarget();
			setState(2692);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchRetTermContext extends ParserRuleContext {
		public TerminalNode CATCHRET() { return getToken(LLVMParser.CATCHRET, 0); }
		public TerminalNode FROM() { return getToken(LLVMParser.FROM, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CatchRetTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchRetTerm; }
	}

	public final CatchRetTermContext catchRetTerm() throws RecognitionException {
		CatchRetTermContext _localctx = new CatchRetTermContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_catchRetTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2694);
			match(CATCHRET);
			setState(2695);
			match(FROM);
			setState(2696);
			value();
			setState(2697);
			match(TO);
			setState(2698);
			labelType();
			setState(2699);
			localIdent();
			setState(2700);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CleanupRetTermContext extends ParserRuleContext {
		public TerminalNode CLEANUPRET() { return getToken(LLVMParser.CLEANUPRET, 0); }
		public TerminalNode FROM() { return getToken(LLVMParser.FROM, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode UNWIND() { return getToken(LLVMParser.UNWIND, 0); }
		public UnwindTargetContext unwindTarget() {
			return getRuleContext(UnwindTargetContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public CleanupRetTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cleanupRetTerm; }
	}

	public final CleanupRetTermContext cleanupRetTerm() throws RecognitionException {
		CleanupRetTermContext _localctx = new CleanupRetTermContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_cleanupRetTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			match(CLEANUPRET);
			setState(2703);
			match(FROM);
			setState(2704);
			value();
			setState(2705);
			match(UNWIND);
			setState(2706);
			unwindTarget();
			setState(2707);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreachableTermContext extends ParserRuleContext {
		public TerminalNode UNREACHABLE() { return getToken(LLVMParser.UNREACHABLE, 0); }
		public OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() {
			return getRuleContext(OptCommaSepMetadataAttachmentListContext.class,0);
		}
		public UnreachableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreachableTerm; }
	}

	public final UnreachableTermContext unreachableTerm() throws RecognitionException {
		UnreachableTermContext _localctx = new UnreachableTermContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_unreachableTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2709);
			match(UNREACHABLE);
			setState(2710);
			optCommaSepMetadataAttachmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnwindTargetContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(LLVMParser.TO, 0); }
		public TerminalNode CALLER() { return getToken(LLVMParser.CALLER, 0); }
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public UnwindTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwindTarget; }
	}

	public final UnwindTargetContext unwindTarget() throws RecognitionException {
		UnwindTargetContext _localctx = new UnwindTargetContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_unwindTarget);
		try {
			setState(2717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(2712);
				match(TO);
				setState(2713);
				match(CALLER);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2714);
				labelType();
				setState(2715);
				localIdent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdTupleContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(LLVMParser.BANG, 0); }
		public MdFieldsContext mdFields() {
			return getRuleContext(MdFieldsContext.class,0);
		}
		public MdTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdTuple; }
	}

	public final MdTupleContext mdTuple() throws RecognitionException {
		MdTupleContext _localctx = new MdTupleContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_mdTuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			match(BANG);
			setState(2720);
			mdFields();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdFieldsContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LLVMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LLVMParser.RBRACE, 0); }
		public MdFieldListContext mdFieldList() {
			return getRuleContext(MdFieldListContext.class,0);
		}
		public MdFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdFields; }
	}

	public final MdFieldsContext mdFields() throws RecognitionException {
		MdFieldsContext _localctx = new MdFieldsContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_mdFields);
		try {
			setState(2728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2722);
				match(LBRACE);
				setState(2723);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2724);
				match(LBRACE);
				setState(2725);
				mdFieldList(0);
				setState(2726);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdFieldListContext extends ParserRuleContext {
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public MdFieldListContext mdFieldList() {
			return getRuleContext(MdFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public MdFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdFieldList; }
	}

	public final MdFieldListContext mdFieldList() throws RecognitionException {
		return mdFieldList(0);
	}

	private MdFieldListContext mdFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MdFieldListContext _localctx = new MdFieldListContext(_ctx, _parentState);
		MdFieldListContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_mdFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2731);
			mdField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MdFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mdFieldList);
					setState(2733);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2734);
					match(COMMA);
					setState(2735);
					mdField();
					}
					} 
				}
				setState(2740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MdFieldContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LLVMParser.NULL, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public MdFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdField; }
	}

	public final MdFieldContext mdField() throws RecognitionException {
		MdFieldContext _localctx = new MdFieldContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_mdField);
		try {
			setState(2743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				match(NULL);
				}
				break;
			case LT:
			case BANG:
			case LBRACK:
			case LBRACE:
			case NOTDIBASICTYPE:
			case NOTDICOMPILEUNIT:
			case NOTDICOMPOSITETYPE:
			case NOTDIDERIVEDTYPE:
			case NOTDIENUMERATOR:
			case NOTDIEXPRESSION:
			case NOTDIFILE:
			case NOTDIGLOBALVARIABLE:
			case NOTDIGLOBALVARIABLEEXPRESSION:
			case NOTDIIMPORTEDENTITY:
			case NOTDILEXICALBLOCK:
			case NOTDILEXICALBLOCKFILE:
			case NOTDILOCALVARIABLE:
			case NOTDILOCATION:
			case NOTDIMACRO:
			case NOTDIMACROFILE:
			case NOTDIMODULE:
			case NOTDINAMESPACE:
			case NOTDIOBJCPROPERTY:
			case NOTDISUBPROGRAM:
			case NOTDISUBRANGE:
			case NOTDISUBROUTINETYPE:
			case NOTDITEMPLATETYPEPARAMETER:
			case NOTDITEMPLATEVALUEPARAMETER:
			case DOUBLE:
			case FLOAT:
			case FP128:
			case NOTGENERICDINODE:
			case HALF:
			case LABEL:
			case METADATA:
			case PPC_FP128:
			case TOKEN:
			case VOID:
			case X86_FP80:
			case X86_MMX:
			case METADATA_ID:
			case INT_TYPE:
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2742);
				metadata();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MdStringContext mdString() {
			return getRuleContext(MdStringContext.class,0);
		}
		public MdTupleContext mdTuple() {
			return getRuleContext(MdTupleContext.class,0);
		}
		public MetadataIDContext metadataID() {
			return getRuleContext(MetadataIDContext.class,0);
		}
		public SpecializedMDNodeContext specializedMDNode() {
			return getRuleContext(SpecializedMDNodeContext.class,0);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_metadata);
		try {
			setState(2752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2745);
				llvmType(0);
				setState(2746);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2748);
				mdString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2749);
				mdTuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2750);
				metadataID();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2751);
				specializedMDNode();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdStringContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(LLVMParser.BANG, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public MdStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdString; }
	}

	public final MdStringContext mdString() throws RecognitionException {
		MdStringContext _localctx = new MdStringContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_mdString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2754);
			match(BANG);
			setState(2755);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataAttachmentContext extends ParserRuleContext {
		public MetadataNameContext metadataName() {
			return getRuleContext(MetadataNameContext.class,0);
		}
		public MdNodeContext mdNode() {
			return getRuleContext(MdNodeContext.class,0);
		}
		public MetadataAttachmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataAttachment; }
	}

	public final MetadataAttachmentContext metadataAttachment() throws RecognitionException {
		MetadataAttachmentContext _localctx = new MetadataAttachmentContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_metadataAttachment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
			metadataName();
			setState(2758);
			mdNode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdNodeContext extends ParserRuleContext {
		public MdTupleContext mdTuple() {
			return getRuleContext(MdTupleContext.class,0);
		}
		public MetadataIDContext metadataID() {
			return getRuleContext(MetadataIDContext.class,0);
		}
		public SpecializedMDNodeContext specializedMDNode() {
			return getRuleContext(SpecializedMDNodeContext.class,0);
		}
		public MdNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdNode; }
	}

	public final MdNodeContext mdNode() throws RecognitionException {
		MdNodeContext _localctx = new MdNodeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_mdNode);
		try {
			setState(2763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2760);
				mdTuple();
				}
				break;
			case METADATA_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
				metadataID();
				}
				break;
			case NOTDIBASICTYPE:
			case NOTDICOMPILEUNIT:
			case NOTDICOMPOSITETYPE:
			case NOTDIDERIVEDTYPE:
			case NOTDIENUMERATOR:
			case NOTDIEXPRESSION:
			case NOTDIFILE:
			case NOTDIGLOBALVARIABLE:
			case NOTDIGLOBALVARIABLEEXPRESSION:
			case NOTDIIMPORTEDENTITY:
			case NOTDILEXICALBLOCK:
			case NOTDILEXICALBLOCKFILE:
			case NOTDILOCALVARIABLE:
			case NOTDILOCATION:
			case NOTDIMACRO:
			case NOTDIMACROFILE:
			case NOTDIMODULE:
			case NOTDINAMESPACE:
			case NOTDIOBJCPROPERTY:
			case NOTDISUBPROGRAM:
			case NOTDISUBRANGE:
			case NOTDISUBROUTINETYPE:
			case NOTDITEMPLATETYPEPARAMETER:
			case NOTDITEMPLATEVALUEPARAMETER:
			case NOTGENERICDINODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2762);
				specializedMDNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataAttachmentsContext extends ParserRuleContext {
		public MetadataAttachmentListContext metadataAttachmentList() {
			return getRuleContext(MetadataAttachmentListContext.class,0);
		}
		public MetadataAttachmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataAttachments; }
	}

	public final MetadataAttachmentsContext metadataAttachments() throws RecognitionException {
		MetadataAttachmentsContext _localctx = new MetadataAttachmentsContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_metadataAttachments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==METADATA_NAME) {
				{
				setState(2765);
				metadataAttachmentList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataAttachmentListContext extends ParserRuleContext {
		public MetadataAttachmentContext metadataAttachment() {
			return getRuleContext(MetadataAttachmentContext.class,0);
		}
		public MetadataAttachmentListContext metadataAttachmentList() {
			return getRuleContext(MetadataAttachmentListContext.class,0);
		}
		public MetadataAttachmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataAttachmentList; }
	}

	public final MetadataAttachmentListContext metadataAttachmentList() throws RecognitionException {
		return metadataAttachmentList(0);
	}

	private MetadataAttachmentListContext metadataAttachmentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MetadataAttachmentListContext _localctx = new MetadataAttachmentListContext(_ctx, _parentState);
		MetadataAttachmentListContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_metadataAttachmentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2769);
			metadataAttachment();
			}
			_ctx.stop = _input.LT(-1);
			setState(2775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MetadataAttachmentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_metadataAttachmentList);
					setState(2771);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2772);
					metadataAttachment();
					}
					} 
				}
				setState(2777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OptCommaSepMetadataAttachmentListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public CommaSepMetadataAttachmentListContext commaSepMetadataAttachmentList() {
			return getRuleContext(CommaSepMetadataAttachmentListContext.class,0);
		}
		public OptCommaSepMetadataAttachmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optCommaSepMetadataAttachmentList; }
	}

	public final OptCommaSepMetadataAttachmentListContext optCommaSepMetadataAttachmentList() throws RecognitionException {
		OptCommaSepMetadataAttachmentListContext _localctx = new OptCommaSepMetadataAttachmentListContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_optCommaSepMetadataAttachmentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(2778);
				match(COMMA);
				setState(2779);
				commaSepMetadataAttachmentList(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaSepMetadataAttachmentListContext extends ParserRuleContext {
		public MetadataAttachmentContext metadataAttachment() {
			return getRuleContext(MetadataAttachmentContext.class,0);
		}
		public CommaSepMetadataAttachmentListContext commaSepMetadataAttachmentList() {
			return getRuleContext(CommaSepMetadataAttachmentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public CommaSepMetadataAttachmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSepMetadataAttachmentList; }
	}

	public final CommaSepMetadataAttachmentListContext commaSepMetadataAttachmentList() throws RecognitionException {
		return commaSepMetadataAttachmentList(0);
	}

	private CommaSepMetadataAttachmentListContext commaSepMetadataAttachmentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommaSepMetadataAttachmentListContext _localctx = new CommaSepMetadataAttachmentListContext(_ctx, _parentState);
		CommaSepMetadataAttachmentListContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_commaSepMetadataAttachmentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2783);
			metadataAttachment();
			}
			_ctx.stop = _input.LT(-1);
			setState(2790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaSepMetadataAttachmentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_commaSepMetadataAttachmentList);
					setState(2785);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2786);
					match(COMMA);
					setState(2787);
					metadataAttachment();
					}
					} 
				}
				setState(2792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SpecializedMDNodeContext extends ParserRuleContext {
		public DiCompileUnitContext diCompileUnit() {
			return getRuleContext(DiCompileUnitContext.class,0);
		}
		public DiFileContext diFile() {
			return getRuleContext(DiFileContext.class,0);
		}
		public DiBasicTypeContext diBasicType() {
			return getRuleContext(DiBasicTypeContext.class,0);
		}
		public DiSubroutineTypeContext diSubroutineType() {
			return getRuleContext(DiSubroutineTypeContext.class,0);
		}
		public DiDerivedTypeContext diDerivedType() {
			return getRuleContext(DiDerivedTypeContext.class,0);
		}
		public DiCompositeTypeContext diCompositeType() {
			return getRuleContext(DiCompositeTypeContext.class,0);
		}
		public DiSubrangeContext diSubrange() {
			return getRuleContext(DiSubrangeContext.class,0);
		}
		public DiEnumeratorContext diEnumerator() {
			return getRuleContext(DiEnumeratorContext.class,0);
		}
		public DiTemplateTypeParameterContext diTemplateTypeParameter() {
			return getRuleContext(DiTemplateTypeParameterContext.class,0);
		}
		public DiTemplateValueParameterContext diTemplateValueParameter() {
			return getRuleContext(DiTemplateValueParameterContext.class,0);
		}
		public DiModuleContext diModule() {
			return getRuleContext(DiModuleContext.class,0);
		}
		public DiNamespaceContext diNamespace() {
			return getRuleContext(DiNamespaceContext.class,0);
		}
		public DiGlobalVariableContext diGlobalVariable() {
			return getRuleContext(DiGlobalVariableContext.class,0);
		}
		public DiSubprogramContext diSubprogram() {
			return getRuleContext(DiSubprogramContext.class,0);
		}
		public DiLexicalBlockContext diLexicalBlock() {
			return getRuleContext(DiLexicalBlockContext.class,0);
		}
		public DiLexicalBlockFileContext diLexicalBlockFile() {
			return getRuleContext(DiLexicalBlockFileContext.class,0);
		}
		public DiLocationContext diLocation() {
			return getRuleContext(DiLocationContext.class,0);
		}
		public DiLocalVariableContext diLocalVariable() {
			return getRuleContext(DiLocalVariableContext.class,0);
		}
		public DiExpressionContext diExpression() {
			return getRuleContext(DiExpressionContext.class,0);
		}
		public DiGlobalVariableExpressionContext diGlobalVariableExpression() {
			return getRuleContext(DiGlobalVariableExpressionContext.class,0);
		}
		public DiObjCPropertyContext diObjCProperty() {
			return getRuleContext(DiObjCPropertyContext.class,0);
		}
		public DiImportedEntityContext diImportedEntity() {
			return getRuleContext(DiImportedEntityContext.class,0);
		}
		public DiMacroContext diMacro() {
			return getRuleContext(DiMacroContext.class,0);
		}
		public DiMacroFileContext diMacroFile() {
			return getRuleContext(DiMacroFileContext.class,0);
		}
		public GenericDINodeContext genericDINode() {
			return getRuleContext(GenericDINodeContext.class,0);
		}
		public SpecializedMDNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specializedMDNode; }
	}

	public final SpecializedMDNodeContext specializedMDNode() throws RecognitionException {
		SpecializedMDNodeContext _localctx = new SpecializedMDNodeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_specializedMDNode);
		try {
			setState(2818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTDICOMPILEUNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2793);
				diCompileUnit();
				}
				break;
			case NOTDIFILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794);
				diFile();
				}
				break;
			case NOTDIBASICTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2795);
				diBasicType();
				}
				break;
			case NOTDISUBROUTINETYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2796);
				diSubroutineType();
				}
				break;
			case NOTDIDERIVEDTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2797);
				diDerivedType();
				}
				break;
			case NOTDICOMPOSITETYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2798);
				diCompositeType();
				}
				break;
			case NOTDISUBRANGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2799);
				diSubrange();
				}
				break;
			case NOTDIENUMERATOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(2800);
				diEnumerator();
				}
				break;
			case NOTDITEMPLATETYPEPARAMETER:
				enterOuterAlt(_localctx, 9);
				{
				setState(2801);
				diTemplateTypeParameter();
				}
				break;
			case NOTDITEMPLATEVALUEPARAMETER:
				enterOuterAlt(_localctx, 10);
				{
				setState(2802);
				diTemplateValueParameter();
				}
				break;
			case NOTDIMODULE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2803);
				diModule();
				}
				break;
			case NOTDINAMESPACE:
				enterOuterAlt(_localctx, 12);
				{
				setState(2804);
				diNamespace();
				}
				break;
			case NOTDIGLOBALVARIABLE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2805);
				diGlobalVariable();
				}
				break;
			case NOTDISUBPROGRAM:
				enterOuterAlt(_localctx, 14);
				{
				setState(2806);
				diSubprogram();
				}
				break;
			case NOTDILEXICALBLOCK:
				enterOuterAlt(_localctx, 15);
				{
				setState(2807);
				diLexicalBlock();
				}
				break;
			case NOTDILEXICALBLOCKFILE:
				enterOuterAlt(_localctx, 16);
				{
				setState(2808);
				diLexicalBlockFile();
				}
				break;
			case NOTDILOCATION:
				enterOuterAlt(_localctx, 17);
				{
				setState(2809);
				diLocation();
				}
				break;
			case NOTDILOCALVARIABLE:
				enterOuterAlt(_localctx, 18);
				{
				setState(2810);
				diLocalVariable();
				}
				break;
			case NOTDIEXPRESSION:
				enterOuterAlt(_localctx, 19);
				{
				setState(2811);
				diExpression();
				}
				break;
			case NOTDIGLOBALVARIABLEEXPRESSION:
				enterOuterAlt(_localctx, 20);
				{
				setState(2812);
				diGlobalVariableExpression();
				}
				break;
			case NOTDIOBJCPROPERTY:
				enterOuterAlt(_localctx, 21);
				{
				setState(2813);
				diObjCProperty();
				}
				break;
			case NOTDIIMPORTEDENTITY:
				enterOuterAlt(_localctx, 22);
				{
				setState(2814);
				diImportedEntity();
				}
				break;
			case NOTDIMACRO:
				enterOuterAlt(_localctx, 23);
				{
				setState(2815);
				diMacro();
				}
				break;
			case NOTDIMACROFILE:
				enterOuterAlt(_localctx, 24);
				{
				setState(2816);
				diMacroFile();
				}
				break;
			case NOTGENERICDINODE:
				enterOuterAlt(_localctx, 25);
				{
				setState(2817);
				genericDINode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompileUnitContext extends ParserRuleContext {
		public TerminalNode NOTDICOMPILEUNIT() { return getToken(LLVMParser.NOTDICOMPILEUNIT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiCompileUnitFieldsContext diCompileUnitFields() {
			return getRuleContext(DiCompileUnitFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiCompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompileUnit; }
	}

	public final DiCompileUnitContext diCompileUnit() throws RecognitionException {
		DiCompileUnitContext _localctx = new DiCompileUnitContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_diCompileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			match(NOTDICOMPILEUNIT);
			setState(2821);
			match(LPAREN);
			setState(2822);
			diCompileUnitFields();
			setState(2823);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompileUnitFieldsContext extends ParserRuleContext {
		public DiCompileUnitFieldListContext diCompileUnitFieldList() {
			return getRuleContext(DiCompileUnitFieldListContext.class,0);
		}
		public DiCompileUnitFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompileUnitFields; }
	}

	public final DiCompileUnitFieldsContext diCompileUnitFields() throws RecognitionException {
		DiCompileUnitFieldsContext _localctx = new DiCompileUnitFieldsContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_diCompileUnitFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DEBUGINFOFORPROFILINGCOLON - 90)) | (1L << (DWOIDCOLON - 90)) | (1L << (EMISSIONKINDCOLON - 90)) | (1L << (ENUMSCOLON - 90)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (FILECOLON - 154)) | (1L << (FLAGSCOLON - 154)) | (1L << (GLOBALSCOLON - 154)) | (1L << (GNUPUBNAMESCOLON - 154)) | (1L << (IMPORTSCOLON - 154)) | (1L << (ISOPTIMIZEDCOLON - 154)) | (1L << (LANGUAGECOLON - 154)))) != 0) || _la==MACROSCOLON || _la==PRODUCERCOLON || ((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (RETAINEDTYPESCOLON - 295)) | (1L << (RUNTIMEVERSIONCOLON - 295)) | (1L << (SPLITDEBUGFILENAMECOLON - 295)) | (1L << (SPLITDEBUGINLININGCOLON - 295)))) != 0)) {
				{
				setState(2825);
				diCompileUnitFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompileUnitFieldListContext extends ParserRuleContext {
		public DiCompileUnitFieldContext diCompileUnitField() {
			return getRuleContext(DiCompileUnitFieldContext.class,0);
		}
		public DiCompileUnitFieldListContext diCompileUnitFieldList() {
			return getRuleContext(DiCompileUnitFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiCompileUnitFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompileUnitFieldList; }
	}

	public final DiCompileUnitFieldListContext diCompileUnitFieldList() throws RecognitionException {
		return diCompileUnitFieldList(0);
	}

	private DiCompileUnitFieldListContext diCompileUnitFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiCompileUnitFieldListContext _localctx = new DiCompileUnitFieldListContext(_ctx, _parentState);
		DiCompileUnitFieldListContext _prevctx = _localctx;
		int _startState = 466;
		enterRecursionRule(_localctx, 466, RULE_diCompileUnitFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2829);
			diCompileUnitField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiCompileUnitFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diCompileUnitFieldList);
					setState(2831);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2832);
					match(COMMA);
					setState(2833);
					diCompileUnitField();
					}
					} 
				}
				setState(2838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiCompileUnitFieldContext extends ParserRuleContext {
		public TerminalNode LANGUAGECOLON() { return getToken(LLVMParser.LANGUAGECOLON, 0); }
		public DwarfLangContext dwarfLang() {
			return getRuleContext(DwarfLangContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public TerminalNode PRODUCERCOLON() { return getToken(LLVMParser.PRODUCERCOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public IsOptimizedFieldContext isOptimizedField() {
			return getRuleContext(IsOptimizedFieldContext.class,0);
		}
		public TerminalNode FLAGSCOLON() { return getToken(LLVMParser.FLAGSCOLON, 0); }
		public TerminalNode RUNTIMEVERSIONCOLON() { return getToken(LLVMParser.RUNTIMEVERSIONCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode SPLITDEBUGFILENAMECOLON() { return getToken(LLVMParser.SPLITDEBUGFILENAMECOLON, 0); }
		public TerminalNode EMISSIONKINDCOLON() { return getToken(LLVMParser.EMISSIONKINDCOLON, 0); }
		public EmissionKindContext emissionKind() {
			return getRuleContext(EmissionKindContext.class,0);
		}
		public TerminalNode ENUMSCOLON() { return getToken(LLVMParser.ENUMSCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TerminalNode RETAINEDTYPESCOLON() { return getToken(LLVMParser.RETAINEDTYPESCOLON, 0); }
		public TerminalNode GLOBALSCOLON() { return getToken(LLVMParser.GLOBALSCOLON, 0); }
		public TerminalNode IMPORTSCOLON() { return getToken(LLVMParser.IMPORTSCOLON, 0); }
		public TerminalNode MACROSCOLON() { return getToken(LLVMParser.MACROSCOLON, 0); }
		public TerminalNode DWOIDCOLON() { return getToken(LLVMParser.DWOIDCOLON, 0); }
		public TerminalNode SPLITDEBUGINLININGCOLON() { return getToken(LLVMParser.SPLITDEBUGINLININGCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public TerminalNode DEBUGINFOFORPROFILINGCOLON() { return getToken(LLVMParser.DEBUGINFOFORPROFILINGCOLON, 0); }
		public TerminalNode GNUPUBNAMESCOLON() { return getToken(LLVMParser.GNUPUBNAMESCOLON, 0); }
		public DiCompileUnitFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompileUnitField; }
	}

	public final DiCompileUnitFieldContext diCompileUnitField() throws RecognitionException {
		DiCompileUnitFieldContext _localctx = new DiCompileUnitFieldContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_diCompileUnitField);
		try {
			setState(2871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGUAGECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2839);
				match(LANGUAGECOLON);
				setState(2840);
				dwarfLang();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2841);
				fileField();
				}
				break;
			case PRODUCERCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2842);
				match(PRODUCERCOLON);
				setState(2843);
				stringLit();
				}
				break;
			case ISOPTIMIZEDCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(2844);
				isOptimizedField();
				}
				break;
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(2845);
				match(FLAGSCOLON);
				setState(2846);
				stringLit();
				}
				break;
			case RUNTIMEVERSIONCOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(2847);
				match(RUNTIMEVERSIONCOLON);
				setState(2848);
				intLit();
				}
				break;
			case SPLITDEBUGFILENAMECOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(2849);
				match(SPLITDEBUGFILENAMECOLON);
				setState(2850);
				stringLit();
				}
				break;
			case EMISSIONKINDCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(2851);
				match(EMISSIONKINDCOLON);
				setState(2852);
				emissionKind();
				}
				break;
			case ENUMSCOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(2853);
				match(ENUMSCOLON);
				setState(2854);
				mdField();
				}
				break;
			case RETAINEDTYPESCOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(2855);
				match(RETAINEDTYPESCOLON);
				setState(2856);
				mdField();
				}
				break;
			case GLOBALSCOLON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2857);
				match(GLOBALSCOLON);
				setState(2858);
				mdField();
				}
				break;
			case IMPORTSCOLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(2859);
				match(IMPORTSCOLON);
				setState(2860);
				mdField();
				}
				break;
			case MACROSCOLON:
				enterOuterAlt(_localctx, 13);
				{
				setState(2861);
				match(MACROSCOLON);
				setState(2862);
				mdField();
				}
				break;
			case DWOIDCOLON:
				enterOuterAlt(_localctx, 14);
				{
				setState(2863);
				match(DWOIDCOLON);
				setState(2864);
				intLit();
				}
				break;
			case SPLITDEBUGINLININGCOLON:
				enterOuterAlt(_localctx, 15);
				{
				setState(2865);
				match(SPLITDEBUGINLININGCOLON);
				setState(2866);
				boolLit();
				}
				break;
			case DEBUGINFOFORPROFILINGCOLON:
				enterOuterAlt(_localctx, 16);
				{
				setState(2867);
				match(DEBUGINFOFORPROFILINGCOLON);
				setState(2868);
				boolLit();
				}
				break;
			case GNUPUBNAMESCOLON:
				enterOuterAlt(_localctx, 17);
				{
				setState(2869);
				match(GNUPUBNAMESCOLON);
				setState(2870);
				boolLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiFileContext extends ParserRuleContext {
		public TerminalNode NOTDIFILE() { return getToken(LLVMParser.NOTDIFILE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiFileFieldsContext diFileFields() {
			return getRuleContext(DiFileFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFile; }
	}

	public final DiFileContext diFile() throws RecognitionException {
		DiFileContext _localctx = new DiFileContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_diFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			match(NOTDIFILE);
			setState(2874);
			match(LPAREN);
			setState(2875);
			diFileFields();
			setState(2876);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiFileFieldsContext extends ParserRuleContext {
		public DiFileFieldListContext diFileFieldList() {
			return getRuleContext(DiFileFieldListContext.class,0);
		}
		public DiFileFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFileFields; }
	}

	public final DiFileFieldsContext diFileFields() throws RecognitionException {
		DiFileFieldsContext _localctx = new DiFileFieldsContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_diFileFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CHECKSUMCOLON - 71)) | (1L << (CHECKSUMKINDCOLON - 71)) | (1L << (DIRECTORYCOLON - 71)))) != 0) || _la==FILENAMECOLON) {
				{
				setState(2878);
				diFileFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiFileFieldListContext extends ParserRuleContext {
		public DiFileFieldContext diFileField() {
			return getRuleContext(DiFileFieldContext.class,0);
		}
		public DiFileFieldListContext diFileFieldList() {
			return getRuleContext(DiFileFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiFileFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFileFieldList; }
	}

	public final DiFileFieldListContext diFileFieldList() throws RecognitionException {
		return diFileFieldList(0);
	}

	private DiFileFieldListContext diFileFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiFileFieldListContext _localctx = new DiFileFieldListContext(_ctx, _parentState);
		DiFileFieldListContext _prevctx = _localctx;
		int _startState = 474;
		enterRecursionRule(_localctx, 474, RULE_diFileFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2882);
			diFileField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiFileFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diFileFieldList);
					setState(2884);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2885);
					match(COMMA);
					setState(2886);
					diFileField();
					}
					} 
				}
				setState(2891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiFileFieldContext extends ParserRuleContext {
		public TerminalNode FILENAMECOLON() { return getToken(LLVMParser.FILENAMECOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode DIRECTORYCOLON() { return getToken(LLVMParser.DIRECTORYCOLON, 0); }
		public TerminalNode CHECKSUMKINDCOLON() { return getToken(LLVMParser.CHECKSUMKINDCOLON, 0); }
		public ChecksumkindContext checksumkind() {
			return getRuleContext(ChecksumkindContext.class,0);
		}
		public TerminalNode CHECKSUMCOLON() { return getToken(LLVMParser.CHECKSUMCOLON, 0); }
		public DiFileFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFileField; }
	}

	public final DiFileFieldContext diFileField() throws RecognitionException {
		DiFileFieldContext _localctx = new DiFileFieldContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_diFileField);
		try {
			setState(2900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILENAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2892);
				match(FILENAMECOLON);
				setState(2893);
				stringLit();
				}
				break;
			case DIRECTORYCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2894);
				match(DIRECTORYCOLON);
				setState(2895);
				stringLit();
				}
				break;
			case CHECKSUMKINDCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2896);
				match(CHECKSUMKINDCOLON);
				setState(2897);
				checksumkind();
				}
				break;
			case CHECKSUMCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(2898);
				match(CHECKSUMCOLON);
				setState(2899);
				stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiBasicTypeContext extends ParserRuleContext {
		public TerminalNode NOTDIBASICTYPE() { return getToken(LLVMParser.NOTDIBASICTYPE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiBasicTypeFieldsContext diBasicTypeFields() {
			return getRuleContext(DiBasicTypeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiBasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diBasicType; }
	}

	public final DiBasicTypeContext diBasicType() throws RecognitionException {
		DiBasicTypeContext _localctx = new DiBasicTypeContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_diBasicType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2902);
			match(NOTDIBASICTYPE);
			setState(2903);
			match(LPAREN);
			setState(2904);
			diBasicTypeFields();
			setState(2905);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiBasicTypeFieldsContext extends ParserRuleContext {
		public DiBasicTypeFieldListContext diBasicTypeFieldList() {
			return getRuleContext(DiBasicTypeFieldListContext.class,0);
		}
		public DiBasicTypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diBasicTypeFields; }
	}

	public final DiBasicTypeFieldsContext diBasicTypeFields() throws RecognitionException {
		DiBasicTypeFieldsContext _localctx = new DiBasicTypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_diBasicTypeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNCOLON || _la==ENCODINGCOLON || _la==NAMECOLON || _la==SIZECOLON || _la==TAGCOLON) {
				{
				setState(2907);
				diBasicTypeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiBasicTypeFieldListContext extends ParserRuleContext {
		public DiBasicTypeFieldContext diBasicTypeField() {
			return getRuleContext(DiBasicTypeFieldContext.class,0);
		}
		public DiBasicTypeFieldListContext diBasicTypeFieldList() {
			return getRuleContext(DiBasicTypeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiBasicTypeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diBasicTypeFieldList; }
	}

	public final DiBasicTypeFieldListContext diBasicTypeFieldList() throws RecognitionException {
		return diBasicTypeFieldList(0);
	}

	private DiBasicTypeFieldListContext diBasicTypeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiBasicTypeFieldListContext _localctx = new DiBasicTypeFieldListContext(_ctx, _parentState);
		DiBasicTypeFieldListContext _prevctx = _localctx;
		int _startState = 482;
		enterRecursionRule(_localctx, 482, RULE_diBasicTypeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2911);
			diBasicTypeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiBasicTypeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diBasicTypeFieldList);
					setState(2913);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2914);
					match(COMMA);
					setState(2915);
					diBasicTypeField();
					}
					} 
				}
				setState(2920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiBasicTypeFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public SizeFieldContext sizeField() {
			return getRuleContext(SizeFieldContext.class,0);
		}
		public AlignFieldContext alignField() {
			return getRuleContext(AlignFieldContext.class,0);
		}
		public TerminalNode ENCODINGCOLON() { return getToken(LLVMParser.ENCODINGCOLON, 0); }
		public DwarfAttEncodingContext dwarfAttEncoding() {
			return getRuleContext(DwarfAttEncodingContext.class,0);
		}
		public DiBasicTypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diBasicTypeField; }
	}

	public final DiBasicTypeFieldContext diBasicTypeField() throws RecognitionException {
		DiBasicTypeFieldContext _localctx = new DiBasicTypeFieldContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_diBasicTypeField);
		try {
			setState(2927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2921);
				tagField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2922);
				nameField();
				}
				break;
			case SIZECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2923);
				sizeField();
				}
				break;
			case ALIGNCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(2924);
				alignField();
				}
				break;
			case ENCODINGCOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(2925);
				match(ENCODINGCOLON);
				setState(2926);
				dwarfAttEncoding();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubroutineTypeContext extends ParserRuleContext {
		public TerminalNode NOTDISUBROUTINETYPE() { return getToken(LLVMParser.NOTDISUBROUTINETYPE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiSubroutineTypeFieldsContext diSubroutineTypeFields() {
			return getRuleContext(DiSubroutineTypeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiSubroutineTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubroutineType; }
	}

	public final DiSubroutineTypeContext diSubroutineType() throws RecognitionException {
		DiSubroutineTypeContext _localctx = new DiSubroutineTypeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_diSubroutineType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			match(NOTDISUBROUTINETYPE);
			setState(2930);
			match(LPAREN);
			setState(2931);
			diSubroutineTypeFields();
			setState(2932);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubroutineTypeFieldsContext extends ParserRuleContext {
		public DiSubroutineTypeFieldListContext diSubroutineTypeFieldList() {
			return getRuleContext(DiSubroutineTypeFieldListContext.class,0);
		}
		public DiSubroutineTypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubroutineTypeFields; }
	}

	public final DiSubroutineTypeFieldsContext diSubroutineTypeFields() throws RecognitionException {
		DiSubroutineTypeFieldsContext _localctx = new DiSubroutineTypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_diSubroutineTypeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CCCOLON || _la==FLAGSCOLON || _la==TYPESCOLON) {
				{
				setState(2934);
				diSubroutineTypeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubroutineTypeFieldListContext extends ParserRuleContext {
		public DiSubroutineTypeFieldContext diSubroutineTypeField() {
			return getRuleContext(DiSubroutineTypeFieldContext.class,0);
		}
		public DiSubroutineTypeFieldListContext diSubroutineTypeFieldList() {
			return getRuleContext(DiSubroutineTypeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiSubroutineTypeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubroutineTypeFieldList; }
	}

	public final DiSubroutineTypeFieldListContext diSubroutineTypeFieldList() throws RecognitionException {
		return diSubroutineTypeFieldList(0);
	}

	private DiSubroutineTypeFieldListContext diSubroutineTypeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiSubroutineTypeFieldListContext _localctx = new DiSubroutineTypeFieldListContext(_ctx, _parentState);
		DiSubroutineTypeFieldListContext _prevctx = _localctx;
		int _startState = 490;
		enterRecursionRule(_localctx, 490, RULE_diSubroutineTypeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2938);
			diSubroutineTypeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiSubroutineTypeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diSubroutineTypeFieldList);
					setState(2940);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2941);
					match(COMMA);
					setState(2942);
					diSubroutineTypeField();
					}
					} 
				}
				setState(2947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiSubroutineTypeFieldContext extends ParserRuleContext {
		public FlagsFieldContext flagsField() {
			return getRuleContext(FlagsFieldContext.class,0);
		}
		public TerminalNode CCCOLON() { return getToken(LLVMParser.CCCOLON, 0); }
		public DwarfCCContext dwarfCC() {
			return getRuleContext(DwarfCCContext.class,0);
		}
		public TerminalNode TYPESCOLON() { return getToken(LLVMParser.TYPESCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public DiSubroutineTypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubroutineTypeField; }
	}

	public final DiSubroutineTypeFieldContext diSubroutineTypeField() throws RecognitionException {
		DiSubroutineTypeFieldContext _localctx = new DiSubroutineTypeFieldContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_diSubroutineTypeField);
		try {
			setState(2953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2948);
				flagsField();
				}
				break;
			case CCCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2949);
				match(CCCOLON);
				setState(2950);
				dwarfCC();
				}
				break;
			case TYPESCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2951);
				match(TYPESCOLON);
				setState(2952);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiDerivedTypeContext extends ParserRuleContext {
		public TerminalNode NOTDIDERIVEDTYPE() { return getToken(LLVMParser.NOTDIDERIVEDTYPE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiDerivedTypeFieldsContext diDerivedTypeFields() {
			return getRuleContext(DiDerivedTypeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiDerivedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diDerivedType; }
	}

	public final DiDerivedTypeContext diDerivedType() throws RecognitionException {
		DiDerivedTypeContext _localctx = new DiDerivedTypeContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_diDerivedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			match(NOTDIDERIVEDTYPE);
			setState(2956);
			match(LPAREN);
			setState(2957);
			diDerivedTypeFields();
			setState(2958);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiDerivedTypeFieldsContext extends ParserRuleContext {
		public DiDerivedTypeFieldListContext diDerivedTypeFieldList() {
			return getRuleContext(DiDerivedTypeFieldListContext.class,0);
		}
		public DiDerivedTypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diDerivedTypeFields; }
	}

	public final DiDerivedTypeFieldsContext diDerivedTypeFields() throws RecognitionException {
		DiDerivedTypeFieldsContext _localctx = new DiDerivedTypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_diDerivedTypeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNCOLON || _la==BASETYPECOLON || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DWARFADDRESSSPACECOLON - 129)) | (1L << (EXTRADATACOLON - 129)) | (1L << (FILECOLON - 129)) | (1L << (FLAGSCOLON - 129)))) != 0) || ((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & ((1L << (LINECOLON - 214)) | (1L << (NAMECOLON - 214)) | (1L << (OFFSETCOLON - 214)))) != 0) || ((((_la - 306)) & ~0x3f) == 0 && ((1L << (_la - 306)) & ((1L << (SCOPECOLON - 306)) | (1L << (SIZECOLON - 306)) | (1L << (TAGCOLON - 306)))) != 0)) {
				{
				setState(2960);
				diDerivedTypeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiDerivedTypeFieldListContext extends ParserRuleContext {
		public DiDerivedTypeFieldContext diDerivedTypeField() {
			return getRuleContext(DiDerivedTypeFieldContext.class,0);
		}
		public DiDerivedTypeFieldListContext diDerivedTypeFieldList() {
			return getRuleContext(DiDerivedTypeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiDerivedTypeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diDerivedTypeFieldList; }
	}

	public final DiDerivedTypeFieldListContext diDerivedTypeFieldList() throws RecognitionException {
		return diDerivedTypeFieldList(0);
	}

	private DiDerivedTypeFieldListContext diDerivedTypeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiDerivedTypeFieldListContext _localctx = new DiDerivedTypeFieldListContext(_ctx, _parentState);
		DiDerivedTypeFieldListContext _prevctx = _localctx;
		int _startState = 498;
		enterRecursionRule(_localctx, 498, RULE_diDerivedTypeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2964);
			diDerivedTypeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(2971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiDerivedTypeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diDerivedTypeFieldList);
					setState(2966);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2967);
					match(COMMA);
					setState(2968);
					diDerivedTypeField();
					}
					} 
				}
				setState(2973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiDerivedTypeFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public BaseTypeFieldContext baseTypeField() {
			return getRuleContext(BaseTypeFieldContext.class,0);
		}
		public SizeFieldContext sizeField() {
			return getRuleContext(SizeFieldContext.class,0);
		}
		public AlignFieldContext alignField() {
			return getRuleContext(AlignFieldContext.class,0);
		}
		public OffsetFieldContext offsetField() {
			return getRuleContext(OffsetFieldContext.class,0);
		}
		public FlagsFieldContext flagsField() {
			return getRuleContext(FlagsFieldContext.class,0);
		}
		public TerminalNode EXTRADATACOLON() { return getToken(LLVMParser.EXTRADATACOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TerminalNode DWARFADDRESSSPACECOLON() { return getToken(LLVMParser.DWARFADDRESSSPACECOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public DiDerivedTypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diDerivedTypeField; }
	}

	public final DiDerivedTypeFieldContext diDerivedTypeField() throws RecognitionException {
		DiDerivedTypeFieldContext _localctx = new DiDerivedTypeFieldContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_diDerivedTypeField);
		try {
			setState(2988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2974);
				tagField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2975);
				nameField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2976);
				scopeField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(2977);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(2978);
				lineField();
				}
				break;
			case BASETYPECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(2979);
				baseTypeField();
				}
				break;
			case SIZECOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(2980);
				sizeField();
				}
				break;
			case ALIGNCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(2981);
				alignField();
				}
				break;
			case OFFSETCOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(2982);
				offsetField();
				}
				break;
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(2983);
				flagsField();
				}
				break;
			case EXTRADATACOLON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2984);
				match(EXTRADATACOLON);
				setState(2985);
				mdField();
				}
				break;
			case DWARFADDRESSSPACECOLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(2986);
				match(DWARFADDRESSSPACECOLON);
				setState(2987);
				intLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompositeTypeContext extends ParserRuleContext {
		public TerminalNode NOTDICOMPOSITETYPE() { return getToken(LLVMParser.NOTDICOMPOSITETYPE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiCompositeTypeFieldsContext diCompositeTypeFields() {
			return getRuleContext(DiCompositeTypeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiCompositeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompositeType; }
	}

	public final DiCompositeTypeContext diCompositeType() throws RecognitionException {
		DiCompositeTypeContext _localctx = new DiCompositeTypeContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_diCompositeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
			match(NOTDICOMPOSITETYPE);
			setState(2991);
			match(LPAREN);
			setState(2992);
			diCompositeTypeFields();
			setState(2993);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompositeTypeFieldsContext extends ParserRuleContext {
		public DiCompositeTypeFieldListContext diCompositeTypeFieldList() {
			return getRuleContext(DiCompositeTypeFieldListContext.class,0);
		}
		public DiCompositeTypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompositeTypeFields; }
	}

	public final DiCompositeTypeFieldsContext diCompositeTypeFields() throws RecognitionException {
		DiCompositeTypeFieldsContext _localctx = new DiCompositeTypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_diCompositeTypeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNCOLON || _la==BASETYPECOLON || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (DISCRIMINATORCOLON - 117)) | (1L << (ELEMENTSCOLON - 117)) | (1L << (FILECOLON - 117)) | (1L << (FLAGSCOLON - 117)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (IDENTIFIERCOLON - 183)) | (1L << (LINECOLON - 183)) | (1L << (NAMECOLON - 183)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (OFFSETCOLON - 264)) | (1L << (RUNTIMELANGCOLON - 264)) | (1L << (SCOPECOLON - 264)) | (1L << (SIZECOLON - 264)))) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (TAGCOLON - 343)) | (1L << (TEMPLATEPARAMSCOLON - 343)) | (1L << (VTABLEHOLDERCOLON - 343)))) != 0)) {
				{
				setState(2995);
				diCompositeTypeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiCompositeTypeFieldListContext extends ParserRuleContext {
		public DiCompositeTypeFieldContext diCompositeTypeField() {
			return getRuleContext(DiCompositeTypeFieldContext.class,0);
		}
		public DiCompositeTypeFieldListContext diCompositeTypeFieldList() {
			return getRuleContext(DiCompositeTypeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiCompositeTypeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompositeTypeFieldList; }
	}

	public final DiCompositeTypeFieldListContext diCompositeTypeFieldList() throws RecognitionException {
		return diCompositeTypeFieldList(0);
	}

	private DiCompositeTypeFieldListContext diCompositeTypeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiCompositeTypeFieldListContext _localctx = new DiCompositeTypeFieldListContext(_ctx, _parentState);
		DiCompositeTypeFieldListContext _prevctx = _localctx;
		int _startState = 506;
		enterRecursionRule(_localctx, 506, RULE_diCompositeTypeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2999);
			diCompositeTypeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiCompositeTypeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diCompositeTypeFieldList);
					setState(3001);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3002);
					match(COMMA);
					setState(3003);
					diCompositeTypeField();
					}
					} 
				}
				setState(3008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiCompositeTypeFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public BaseTypeFieldContext baseTypeField() {
			return getRuleContext(BaseTypeFieldContext.class,0);
		}
		public SizeFieldContext sizeField() {
			return getRuleContext(SizeFieldContext.class,0);
		}
		public AlignFieldContext alignField() {
			return getRuleContext(AlignFieldContext.class,0);
		}
		public OffsetFieldContext offsetField() {
			return getRuleContext(OffsetFieldContext.class,0);
		}
		public FlagsFieldContext flagsField() {
			return getRuleContext(FlagsFieldContext.class,0);
		}
		public TerminalNode ELEMENTSCOLON() { return getToken(LLVMParser.ELEMENTSCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TerminalNode RUNTIMELANGCOLON() { return getToken(LLVMParser.RUNTIMELANGCOLON, 0); }
		public DwarfLangContext dwarfLang() {
			return getRuleContext(DwarfLangContext.class,0);
		}
		public TerminalNode VTABLEHOLDERCOLON() { return getToken(LLVMParser.VTABLEHOLDERCOLON, 0); }
		public TemplateParamsFieldContext templateParamsField() {
			return getRuleContext(TemplateParamsFieldContext.class,0);
		}
		public TerminalNode IDENTIFIERCOLON() { return getToken(LLVMParser.IDENTIFIERCOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode DISCRIMINATORCOLON() { return getToken(LLVMParser.DISCRIMINATORCOLON, 0); }
		public DiCompositeTypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diCompositeTypeField; }
	}

	public final DiCompositeTypeFieldContext diCompositeTypeField() throws RecognitionException {
		DiCompositeTypeFieldContext _localctx = new DiCompositeTypeFieldContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_diCompositeTypeField);
		try {
			setState(3030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3009);
				tagField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3010);
				nameField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3011);
				scopeField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3012);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3013);
				lineField();
				}
				break;
			case BASETYPECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3014);
				baseTypeField();
				}
				break;
			case SIZECOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(3015);
				sizeField();
				}
				break;
			case ALIGNCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(3016);
				alignField();
				}
				break;
			case OFFSETCOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(3017);
				offsetField();
				}
				break;
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(3018);
				flagsField();
				}
				break;
			case ELEMENTSCOLON:
				enterOuterAlt(_localctx, 11);
				{
				setState(3019);
				match(ELEMENTSCOLON);
				setState(3020);
				mdField();
				}
				break;
			case RUNTIMELANGCOLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(3021);
				match(RUNTIMELANGCOLON);
				setState(3022);
				dwarfLang();
				}
				break;
			case VTABLEHOLDERCOLON:
				enterOuterAlt(_localctx, 13);
				{
				setState(3023);
				match(VTABLEHOLDERCOLON);
				setState(3024);
				mdField();
				}
				break;
			case TEMPLATEPARAMSCOLON:
				enterOuterAlt(_localctx, 14);
				{
				setState(3025);
				templateParamsField();
				}
				break;
			case IDENTIFIERCOLON:
				enterOuterAlt(_localctx, 15);
				{
				setState(3026);
				match(IDENTIFIERCOLON);
				setState(3027);
				stringLit();
				}
				break;
			case DISCRIMINATORCOLON:
				enterOuterAlt(_localctx, 16);
				{
				setState(3028);
				match(DISCRIMINATORCOLON);
				setState(3029);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubrangeContext extends ParserRuleContext {
		public TerminalNode NOTDISUBRANGE() { return getToken(LLVMParser.NOTDISUBRANGE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiSubrangeFieldsContext diSubrangeFields() {
			return getRuleContext(DiSubrangeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiSubrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubrange; }
	}

	public final DiSubrangeContext diSubrange() throws RecognitionException {
		DiSubrangeContext _localctx = new DiSubrangeContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_diSubrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3032);
			match(NOTDISUBRANGE);
			setState(3033);
			match(LPAREN);
			setState(3034);
			diSubrangeFields();
			setState(3035);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubrangeFieldsContext extends ParserRuleContext {
		public DiSubrangeFieldListContext diSubrangeFieldList() {
			return getRuleContext(DiSubrangeFieldListContext.class,0);
		}
		public DiSubrangeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubrangeFields; }
	}

	public final DiSubrangeFieldsContext diSubrangeFields() throws RecognitionException {
		DiSubrangeFieldsContext _localctx = new DiSubrangeFieldsContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_diSubrangeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COUNTCOLON || _la==LOWERBOUNDCOLON) {
				{
				setState(3037);
				diSubrangeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubrangeFieldListContext extends ParserRuleContext {
		public DiSubrangeFieldContext diSubrangeField() {
			return getRuleContext(DiSubrangeFieldContext.class,0);
		}
		public DiSubrangeFieldListContext diSubrangeFieldList() {
			return getRuleContext(DiSubrangeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiSubrangeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubrangeFieldList; }
	}

	public final DiSubrangeFieldListContext diSubrangeFieldList() throws RecognitionException {
		return diSubrangeFieldList(0);
	}

	private DiSubrangeFieldListContext diSubrangeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiSubrangeFieldListContext _localctx = new DiSubrangeFieldListContext(_ctx, _parentState);
		DiSubrangeFieldListContext _prevctx = _localctx;
		int _startState = 514;
		enterRecursionRule(_localctx, 514, RULE_diSubrangeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3041);
			diSubrangeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiSubrangeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diSubrangeFieldList);
					setState(3043);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3044);
					match(COMMA);
					setState(3045);
					diSubrangeField();
					}
					} 
				}
				setState(3050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiSubrangeFieldContext extends ParserRuleContext {
		public TerminalNode COUNTCOLON() { return getToken(LLVMParser.COUNTCOLON, 0); }
		public IntOrMDFieldContext intOrMDField() {
			return getRuleContext(IntOrMDFieldContext.class,0);
		}
		public TerminalNode LOWERBOUNDCOLON() { return getToken(LLVMParser.LOWERBOUNDCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public DiSubrangeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubrangeField; }
	}

	public final DiSubrangeFieldContext diSubrangeField() throws RecognitionException {
		DiSubrangeFieldContext _localctx = new DiSubrangeFieldContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_diSubrangeField);
		try {
			setState(3055);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNTCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3051);
				match(COUNTCOLON);
				setState(3052);
				intOrMDField();
				}
				break;
			case LOWERBOUNDCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3053);
				match(LOWERBOUNDCOLON);
				setState(3054);
				intLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiEnumeratorContext extends ParserRuleContext {
		public TerminalNode NOTDIENUMERATOR() { return getToken(LLVMParser.NOTDIENUMERATOR, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiEnumeratorFieldsContext diEnumeratorFields() {
			return getRuleContext(DiEnumeratorFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiEnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diEnumerator; }
	}

	public final DiEnumeratorContext diEnumerator() throws RecognitionException {
		DiEnumeratorContext _localctx = new DiEnumeratorContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_diEnumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3057);
			match(NOTDIENUMERATOR);
			setState(3058);
			match(LPAREN);
			setState(3059);
			diEnumeratorFields();
			setState(3060);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiEnumeratorFieldsContext extends ParserRuleContext {
		public DiEnumeratorFieldListContext diEnumeratorFieldList() {
			return getRuleContext(DiEnumeratorFieldListContext.class,0);
		}
		public DiEnumeratorFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diEnumeratorFields; }
	}

	public final DiEnumeratorFieldsContext diEnumeratorFields() throws RecognitionException {
		DiEnumeratorFieldsContext _localctx = new DiEnumeratorFieldsContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_diEnumeratorFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISUNSIGNEDCOLON || _la==NAMECOLON || _la==VALUECOLON) {
				{
				setState(3062);
				diEnumeratorFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiEnumeratorFieldListContext extends ParserRuleContext {
		public DiEnumeratorFieldContext diEnumeratorField() {
			return getRuleContext(DiEnumeratorFieldContext.class,0);
		}
		public DiEnumeratorFieldListContext diEnumeratorFieldList() {
			return getRuleContext(DiEnumeratorFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiEnumeratorFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diEnumeratorFieldList; }
	}

	public final DiEnumeratorFieldListContext diEnumeratorFieldList() throws RecognitionException {
		return diEnumeratorFieldList(0);
	}

	private DiEnumeratorFieldListContext diEnumeratorFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiEnumeratorFieldListContext _localctx = new DiEnumeratorFieldListContext(_ctx, _parentState);
		DiEnumeratorFieldListContext _prevctx = _localctx;
		int _startState = 522;
		enterRecursionRule(_localctx, 522, RULE_diEnumeratorFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3066);
			diEnumeratorField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiEnumeratorFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diEnumeratorFieldList);
					setState(3068);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3069);
					match(COMMA);
					setState(3070);
					diEnumeratorField();
					}
					} 
				}
				setState(3075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiEnumeratorFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TerminalNode VALUECOLON() { return getToken(LLVMParser.VALUECOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode ISUNSIGNEDCOLON() { return getToken(LLVMParser.ISUNSIGNEDCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public DiEnumeratorFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diEnumeratorField; }
	}

	public final DiEnumeratorFieldContext diEnumeratorField() throws RecognitionException {
		DiEnumeratorFieldContext _localctx = new DiEnumeratorFieldContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_diEnumeratorField);
		try {
			setState(3081);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3076);
				nameField();
				}
				break;
			case VALUECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3077);
				match(VALUECOLON);
				setState(3078);
				intLit();
				}
				break;
			case ISUNSIGNEDCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3079);
				match(ISUNSIGNEDCOLON);
				setState(3080);
				boolLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateTypeParameterContext extends ParserRuleContext {
		public TerminalNode NOTDITEMPLATETYPEPARAMETER() { return getToken(LLVMParser.NOTDITEMPLATETYPEPARAMETER, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiTemplateTypeParameterFieldsContext diTemplateTypeParameterFields() {
			return getRuleContext(DiTemplateTypeParameterFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiTemplateTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateTypeParameter; }
	}

	public final DiTemplateTypeParameterContext diTemplateTypeParameter() throws RecognitionException {
		DiTemplateTypeParameterContext _localctx = new DiTemplateTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_diTemplateTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3083);
			match(NOTDITEMPLATETYPEPARAMETER);
			setState(3084);
			match(LPAREN);
			setState(3085);
			diTemplateTypeParameterFields();
			setState(3086);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateTypeParameterFieldsContext extends ParserRuleContext {
		public DiTemplateTypeParameterFieldListContext diTemplateTypeParameterFieldList() {
			return getRuleContext(DiTemplateTypeParameterFieldListContext.class,0);
		}
		public DiTemplateTypeParameterFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateTypeParameterFields; }
	}

	public final DiTemplateTypeParameterFieldsContext diTemplateTypeParameterFields() throws RecognitionException {
		DiTemplateTypeParameterFieldsContext _localctx = new DiTemplateTypeParameterFieldsContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_diTemplateTypeParameterFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMECOLON || _la==TYPECOLON) {
				{
				setState(3088);
				diTemplateTypeParameterFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateTypeParameterFieldListContext extends ParserRuleContext {
		public DiTemplateTypeParameterFieldContext diTemplateTypeParameterField() {
			return getRuleContext(DiTemplateTypeParameterFieldContext.class,0);
		}
		public DiTemplateTypeParameterFieldListContext diTemplateTypeParameterFieldList() {
			return getRuleContext(DiTemplateTypeParameterFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiTemplateTypeParameterFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateTypeParameterFieldList; }
	}

	public final DiTemplateTypeParameterFieldListContext diTemplateTypeParameterFieldList() throws RecognitionException {
		return diTemplateTypeParameterFieldList(0);
	}

	private DiTemplateTypeParameterFieldListContext diTemplateTypeParameterFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiTemplateTypeParameterFieldListContext _localctx = new DiTemplateTypeParameterFieldListContext(_ctx, _parentState);
		DiTemplateTypeParameterFieldListContext _prevctx = _localctx;
		int _startState = 530;
		enterRecursionRule(_localctx, 530, RULE_diTemplateTypeParameterFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3092);
			diTemplateTypeParameterField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiTemplateTypeParameterFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diTemplateTypeParameterFieldList);
					setState(3094);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3095);
					match(COMMA);
					setState(3096);
					diTemplateTypeParameterField();
					}
					} 
				}
				setState(3101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiTemplateTypeParameterFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public DiTemplateTypeParameterFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateTypeParameterField; }
	}

	public final DiTemplateTypeParameterFieldContext diTemplateTypeParameterField() throws RecognitionException {
		DiTemplateTypeParameterFieldContext _localctx = new DiTemplateTypeParameterFieldContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_diTemplateTypeParameterField);
		try {
			setState(3104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3102);
				nameField();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3103);
				typeField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateValueParameterContext extends ParserRuleContext {
		public TerminalNode NOTDITEMPLATEVALUEPARAMETER() { return getToken(LLVMParser.NOTDITEMPLATEVALUEPARAMETER, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiTemplateValueParameterFieldsContext diTemplateValueParameterFields() {
			return getRuleContext(DiTemplateValueParameterFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiTemplateValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateValueParameter; }
	}

	public final DiTemplateValueParameterContext diTemplateValueParameter() throws RecognitionException {
		DiTemplateValueParameterContext _localctx = new DiTemplateValueParameterContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_diTemplateValueParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3106);
			match(NOTDITEMPLATEVALUEPARAMETER);
			setState(3107);
			match(LPAREN);
			setState(3108);
			diTemplateValueParameterFields();
			setState(3109);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateValueParameterFieldsContext extends ParserRuleContext {
		public DiTemplateValueParameterFieldListContext diTemplateValueParameterFieldList() {
			return getRuleContext(DiTemplateValueParameterFieldListContext.class,0);
		}
		public DiTemplateValueParameterFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateValueParameterFields; }
	}

	public final DiTemplateValueParameterFieldsContext diTemplateValueParameterFields() throws RecognitionException {
		DiTemplateValueParameterFieldsContext _localctx = new DiTemplateValueParameterFieldsContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_diTemplateValueParameterFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMECOLON || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (TAGCOLON - 343)) | (1L << (TYPECOLON - 343)) | (1L << (VALUECOLON - 343)))) != 0)) {
				{
				setState(3111);
				diTemplateValueParameterFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiTemplateValueParameterFieldListContext extends ParserRuleContext {
		public DiTemplateValueParameterFieldContext diTemplateValueParameterField() {
			return getRuleContext(DiTemplateValueParameterFieldContext.class,0);
		}
		public DiTemplateValueParameterFieldListContext diTemplateValueParameterFieldList() {
			return getRuleContext(DiTemplateValueParameterFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiTemplateValueParameterFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateValueParameterFieldList; }
	}

	public final DiTemplateValueParameterFieldListContext diTemplateValueParameterFieldList() throws RecognitionException {
		return diTemplateValueParameterFieldList(0);
	}

	private DiTemplateValueParameterFieldListContext diTemplateValueParameterFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiTemplateValueParameterFieldListContext _localctx = new DiTemplateValueParameterFieldListContext(_ctx, _parentState);
		DiTemplateValueParameterFieldListContext _prevctx = _localctx;
		int _startState = 538;
		enterRecursionRule(_localctx, 538, RULE_diTemplateValueParameterFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3115);
			diTemplateValueParameterField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiTemplateValueParameterFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diTemplateValueParameterFieldList);
					setState(3117);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3118);
					match(COMMA);
					setState(3119);
					diTemplateValueParameterField();
					}
					} 
				}
				setState(3124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiTemplateValueParameterFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public TerminalNode VALUECOLON() { return getToken(LLVMParser.VALUECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public DiTemplateValueParameterFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diTemplateValueParameterField; }
	}

	public final DiTemplateValueParameterFieldContext diTemplateValueParameterField() throws RecognitionException {
		DiTemplateValueParameterFieldContext _localctx = new DiTemplateValueParameterFieldContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_diTemplateValueParameterField);
		try {
			setState(3130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3125);
				tagField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3126);
				nameField();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3127);
				typeField();
				}
				break;
			case VALUECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3128);
				match(VALUECOLON);
				setState(3129);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiModuleContext extends ParserRuleContext {
		public TerminalNode NOTDIMODULE() { return getToken(LLVMParser.NOTDIMODULE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiModuleFieldsContext diModuleFields() {
			return getRuleContext(DiModuleFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diModule; }
	}

	public final DiModuleContext diModule() throws RecognitionException {
		DiModuleContext _localctx = new DiModuleContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_diModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132);
			match(NOTDIMODULE);
			setState(3133);
			match(LPAREN);
			setState(3134);
			diModuleFields();
			setState(3135);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiModuleFieldsContext extends ParserRuleContext {
		public DiModuleFieldListContext diModuleFieldList() {
			return getRuleContext(DiModuleFieldListContext.class,0);
		}
		public DiModuleFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diModuleFields; }
	}

	public final DiModuleFieldsContext diModuleFields() throws RecognitionException {
		DiModuleFieldsContext _localctx = new DiModuleFieldsContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_diModuleFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGMACROSCOLON || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (INCLUDEPATHCOLON - 190)) | (1L << (ISYSROOTCOLON - 190)) | (1L << (NAMECOLON - 190)))) != 0) || _la==SCOPECOLON) {
				{
				setState(3137);
				diModuleFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiModuleFieldListContext extends ParserRuleContext {
		public DiModuleFieldContext diModuleField() {
			return getRuleContext(DiModuleFieldContext.class,0);
		}
		public DiModuleFieldListContext diModuleFieldList() {
			return getRuleContext(DiModuleFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiModuleFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diModuleFieldList; }
	}

	public final DiModuleFieldListContext diModuleFieldList() throws RecognitionException {
		return diModuleFieldList(0);
	}

	private DiModuleFieldListContext diModuleFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiModuleFieldListContext _localctx = new DiModuleFieldListContext(_ctx, _parentState);
		DiModuleFieldListContext _prevctx = _localctx;
		int _startState = 546;
		enterRecursionRule(_localctx, 546, RULE_diModuleFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3141);
			diModuleField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiModuleFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diModuleFieldList);
					setState(3143);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3144);
					match(COMMA);
					setState(3145);
					diModuleField();
					}
					} 
				}
				setState(3150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiModuleFieldContext extends ParserRuleContext {
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TerminalNode CONFIGMACROSCOLON() { return getToken(LLVMParser.CONFIGMACROSCOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode INCLUDEPATHCOLON() { return getToken(LLVMParser.INCLUDEPATHCOLON, 0); }
		public TerminalNode ISYSROOTCOLON() { return getToken(LLVMParser.ISYSROOTCOLON, 0); }
		public DiModuleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diModuleField; }
	}

	public final DiModuleFieldContext diModuleField() throws RecognitionException {
		DiModuleFieldContext _localctx = new DiModuleFieldContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_diModuleField);
		try {
			setState(3159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3151);
				scopeField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3152);
				nameField();
				}
				break;
			case CONFIGMACROSCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3153);
				match(CONFIGMACROSCOLON);
				setState(3154);
				stringLit();
				}
				break;
			case INCLUDEPATHCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3155);
				match(INCLUDEPATHCOLON);
				setState(3156);
				stringLit();
				}
				break;
			case ISYSROOTCOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3157);
				match(ISYSROOTCOLON);
				setState(3158);
				stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiNamespaceContext extends ParserRuleContext {
		public TerminalNode NOTDINAMESPACE() { return getToken(LLVMParser.NOTDINAMESPACE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiNamespaceFieldsContext diNamespaceFields() {
			return getRuleContext(DiNamespaceFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diNamespace; }
	}

	public final DiNamespaceContext diNamespace() throws RecognitionException {
		DiNamespaceContext _localctx = new DiNamespaceContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_diNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3161);
			match(NOTDINAMESPACE);
			setState(3162);
			match(LPAREN);
			setState(3163);
			diNamespaceFields();
			setState(3164);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiNamespaceFieldsContext extends ParserRuleContext {
		public DiNamespaceFieldListContext diNamespaceFieldList() {
			return getRuleContext(DiNamespaceFieldListContext.class,0);
		}
		public DiNamespaceFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diNamespaceFields; }
	}

	public final DiNamespaceFieldsContext diNamespaceFields() throws RecognitionException {
		DiNamespaceFieldsContext _localctx = new DiNamespaceFieldsContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_diNamespaceFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORTSYMBOLSCOLON || _la==NAMECOLON || _la==SCOPECOLON) {
				{
				setState(3166);
				diNamespaceFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiNamespaceFieldListContext extends ParserRuleContext {
		public DiNamespaceFieldContext diNamespaceField() {
			return getRuleContext(DiNamespaceFieldContext.class,0);
		}
		public DiNamespaceFieldListContext diNamespaceFieldList() {
			return getRuleContext(DiNamespaceFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiNamespaceFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diNamespaceFieldList; }
	}

	public final DiNamespaceFieldListContext diNamespaceFieldList() throws RecognitionException {
		return diNamespaceFieldList(0);
	}

	private DiNamespaceFieldListContext diNamespaceFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiNamespaceFieldListContext _localctx = new DiNamespaceFieldListContext(_ctx, _parentState);
		DiNamespaceFieldListContext _prevctx = _localctx;
		int _startState = 554;
		enterRecursionRule(_localctx, 554, RULE_diNamespaceFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3170);
			diNamespaceField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiNamespaceFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diNamespaceFieldList);
					setState(3172);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3173);
					match(COMMA);
					setState(3174);
					diNamespaceField();
					}
					} 
				}
				setState(3179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiNamespaceFieldContext extends ParserRuleContext {
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TerminalNode EXPORTSYMBOLSCOLON() { return getToken(LLVMParser.EXPORTSYMBOLSCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public DiNamespaceFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diNamespaceField; }
	}

	public final DiNamespaceFieldContext diNamespaceField() throws RecognitionException {
		DiNamespaceFieldContext _localctx = new DiNamespaceFieldContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_diNamespaceField);
		try {
			setState(3184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3180);
				scopeField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3181);
				nameField();
				}
				break;
			case EXPORTSYMBOLSCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3182);
				match(EXPORTSYMBOLSCOLON);
				setState(3183);
				boolLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableContext extends ParserRuleContext {
		public TerminalNode NOTDIGLOBALVARIABLE() { return getToken(LLVMParser.NOTDIGLOBALVARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiGlobalVariableFieldsContext diGlobalVariableFields() {
			return getRuleContext(DiGlobalVariableFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiGlobalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariable; }
	}

	public final DiGlobalVariableContext diGlobalVariable() throws RecognitionException {
		DiGlobalVariableContext _localctx = new DiGlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_diGlobalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3186);
			match(NOTDIGLOBALVARIABLE);
			setState(3187);
			match(LPAREN);
			setState(3188);
			diGlobalVariableFields();
			setState(3189);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableFieldsContext extends ParserRuleContext {
		public DiGlobalVariableFieldListContext diGlobalVariableFieldList() {
			return getRuleContext(DiGlobalVariableFieldListContext.class,0);
		}
		public DiGlobalVariableFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableFields; }
	}

	public final DiGlobalVariableFieldsContext diGlobalVariableFields() throws RecognitionException {
		DiGlobalVariableFieldsContext _localctx = new DiGlobalVariableFieldsContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_diGlobalVariableFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNCOLON || _la==DECLARATIONCOLON || _la==FILECOLON || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (ISDEFINITIONCOLON - 204)) | (1L << (ISLOCALCOLON - 204)) | (1L << (LINECOLON - 204)) | (1L << (LINKAGENAMECOLON - 204)) | (1L << (NAMECOLON - 204)))) != 0) || _la==SCOPECOLON || _la==TYPECOLON) {
				{
				setState(3191);
				diGlobalVariableFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableFieldListContext extends ParserRuleContext {
		public DiGlobalVariableFieldContext diGlobalVariableField() {
			return getRuleContext(DiGlobalVariableFieldContext.class,0);
		}
		public DiGlobalVariableFieldListContext diGlobalVariableFieldList() {
			return getRuleContext(DiGlobalVariableFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiGlobalVariableFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableFieldList; }
	}

	public final DiGlobalVariableFieldListContext diGlobalVariableFieldList() throws RecognitionException {
		return diGlobalVariableFieldList(0);
	}

	private DiGlobalVariableFieldListContext diGlobalVariableFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiGlobalVariableFieldListContext _localctx = new DiGlobalVariableFieldListContext(_ctx, _parentState);
		DiGlobalVariableFieldListContext _prevctx = _localctx;
		int _startState = 562;
		enterRecursionRule(_localctx, 562, RULE_diGlobalVariableFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3195);
			diGlobalVariableField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiGlobalVariableFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diGlobalVariableFieldList);
					setState(3197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3198);
					match(COMMA);
					setState(3199);
					diGlobalVariableField();
					}
					} 
				}
				setState(3204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiGlobalVariableFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public LinkageNameFieldContext linkageNameField() {
			return getRuleContext(LinkageNameFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public IsLocalFieldContext isLocalField() {
			return getRuleContext(IsLocalFieldContext.class,0);
		}
		public IsDefinitionFieldContext isDefinitionField() {
			return getRuleContext(IsDefinitionFieldContext.class,0);
		}
		public DeclarationFieldContext declarationField() {
			return getRuleContext(DeclarationFieldContext.class,0);
		}
		public AlignFieldContext alignField() {
			return getRuleContext(AlignFieldContext.class,0);
		}
		public DiGlobalVariableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableField; }
	}

	public final DiGlobalVariableFieldContext diGlobalVariableField() throws RecognitionException {
		DiGlobalVariableFieldContext _localctx = new DiGlobalVariableFieldContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_diGlobalVariableField);
		try {
			setState(3215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3205);
				nameField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3206);
				scopeField();
				}
				break;
			case LINKAGENAMECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3207);
				linkageNameField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3208);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3209);
				lineField();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3210);
				typeField();
				}
				break;
			case ISLOCALCOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(3211);
				isLocalField();
				}
				break;
			case ISDEFINITIONCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(3212);
				isDefinitionField();
				}
				break;
			case DECLARATIONCOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(3213);
				declarationField();
				}
				break;
			case ALIGNCOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(3214);
				alignField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubprogramContext extends ParserRuleContext {
		public TerminalNode NOTDISUBPROGRAM() { return getToken(LLVMParser.NOTDISUBPROGRAM, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiSubprogramFieldsContext diSubprogramFields() {
			return getRuleContext(DiSubprogramFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiSubprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubprogram; }
	}

	public final DiSubprogramContext diSubprogram() throws RecognitionException {
		DiSubprogramContext _localctx = new DiSubprogramContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_diSubprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3217);
			match(NOTDISUBPROGRAM);
			setState(3218);
			match(LPAREN);
			setState(3219);
			diSubprogramFields();
			setState(3220);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubprogramFieldsContext extends ParserRuleContext {
		public DiSubprogramFieldListContext diSubprogramFieldList() {
			return getRuleContext(DiSubprogramFieldListContext.class,0);
		}
		public DiSubprogramFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubprogramFields; }
	}

	public final DiSubprogramFieldsContext diSubprogramFields() throws RecognitionException {
		DiSubprogramFieldsContext _localctx = new DiSubprogramFieldsContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_diSubprogramFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAININGTYPECOLON || _la==DECLARATIONCOLON || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (FILECOLON - 154)) | (1L << (FLAGSCOLON - 154)) | (1L << (ISDEFINITIONCOLON - 154)) | (1L << (ISLOCALCOLON - 154)) | (1L << (ISOPTIMIZEDCOLON - 154)) | (1L << (LINECOLON - 154)) | (1L << (LINKAGENAMECOLON - 154)))) != 0) || _la==NAMECOLON || ((((_la - 306)) & ~0x3f) == 0 && ((1L << (_la - 306)) & ((1L << (SCOPECOLON - 306)) | (1L << (SCOPELINECOLON - 306)) | (1L << (TEMPLATEPARAMSCOLON - 306)) | (1L << (THISADJUSTMENTCOLON - 306)) | (1L << (THROWNTYPESCOLON - 306)) | (1L << (TYPECOLON - 306)) | (1L << (UNITCOLON - 306)))) != 0) || ((((_la - 382)) & ~0x3f) == 0 && ((1L << (_la - 382)) & ((1L << (VARIABLESCOLON - 382)) | (1L << (VIRTUALINDEXCOLON - 382)) | (1L << (VIRTUALITYCOLON - 382)))) != 0)) {
				{
				setState(3222);
				diSubprogramFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiSubprogramFieldListContext extends ParserRuleContext {
		public DiSubprogramFieldContext diSubprogramField() {
			return getRuleContext(DiSubprogramFieldContext.class,0);
		}
		public DiSubprogramFieldListContext diSubprogramFieldList() {
			return getRuleContext(DiSubprogramFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiSubprogramFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubprogramFieldList; }
	}

	public final DiSubprogramFieldListContext diSubprogramFieldList() throws RecognitionException {
		return diSubprogramFieldList(0);
	}

	private DiSubprogramFieldListContext diSubprogramFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiSubprogramFieldListContext _localctx = new DiSubprogramFieldListContext(_ctx, _parentState);
		DiSubprogramFieldListContext _prevctx = _localctx;
		int _startState = 570;
		enterRecursionRule(_localctx, 570, RULE_diSubprogramFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3226);
			diSubprogramField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiSubprogramFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diSubprogramFieldList);
					setState(3228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3229);
					match(COMMA);
					setState(3230);
					diSubprogramField();
					}
					} 
				}
				setState(3235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiSubprogramFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public LinkageNameFieldContext linkageNameField() {
			return getRuleContext(LinkageNameFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public IsLocalFieldContext isLocalField() {
			return getRuleContext(IsLocalFieldContext.class,0);
		}
		public IsDefinitionFieldContext isDefinitionField() {
			return getRuleContext(IsDefinitionFieldContext.class,0);
		}
		public TerminalNode SCOPELINECOLON() { return getToken(LLVMParser.SCOPELINECOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode CONTAININGTYPECOLON() { return getToken(LLVMParser.CONTAININGTYPECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TerminalNode VIRTUALITYCOLON() { return getToken(LLVMParser.VIRTUALITYCOLON, 0); }
		public DwarfVirtualityContext dwarfVirtuality() {
			return getRuleContext(DwarfVirtualityContext.class,0);
		}
		public TerminalNode VIRTUALINDEXCOLON() { return getToken(LLVMParser.VIRTUALINDEXCOLON, 0); }
		public TerminalNode THISADJUSTMENTCOLON() { return getToken(LLVMParser.THISADJUSTMENTCOLON, 0); }
		public FlagsFieldContext flagsField() {
			return getRuleContext(FlagsFieldContext.class,0);
		}
		public IsOptimizedFieldContext isOptimizedField() {
			return getRuleContext(IsOptimizedFieldContext.class,0);
		}
		public TerminalNode UNITCOLON() { return getToken(LLVMParser.UNITCOLON, 0); }
		public TemplateParamsFieldContext templateParamsField() {
			return getRuleContext(TemplateParamsFieldContext.class,0);
		}
		public DeclarationFieldContext declarationField() {
			return getRuleContext(DeclarationFieldContext.class,0);
		}
		public TerminalNode VARIABLESCOLON() { return getToken(LLVMParser.VARIABLESCOLON, 0); }
		public TerminalNode THROWNTYPESCOLON() { return getToken(LLVMParser.THROWNTYPESCOLON, 0); }
		public DiSubprogramFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diSubprogramField; }
	}

	public final DiSubprogramFieldContext diSubprogramField() throws RecognitionException {
		DiSubprogramFieldContext _localctx = new DiSubprogramFieldContext(_ctx, getState());
		enterRule(_localctx, 572, RULE_diSubprogramField);
		try {
			setState(3264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3236);
				nameField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3237);
				scopeField();
				}
				break;
			case LINKAGENAMECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3238);
				linkageNameField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3239);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3240);
				lineField();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3241);
				typeField();
				}
				break;
			case ISLOCALCOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(3242);
				isLocalField();
				}
				break;
			case ISDEFINITIONCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(3243);
				isDefinitionField();
				}
				break;
			case SCOPELINECOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(3244);
				match(SCOPELINECOLON);
				setState(3245);
				intLit();
				}
				break;
			case CONTAININGTYPECOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(3246);
				match(CONTAININGTYPECOLON);
				setState(3247);
				mdField();
				}
				break;
			case VIRTUALITYCOLON:
				enterOuterAlt(_localctx, 11);
				{
				setState(3248);
				match(VIRTUALITYCOLON);
				setState(3249);
				dwarfVirtuality();
				}
				break;
			case VIRTUALINDEXCOLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(3250);
				match(VIRTUALINDEXCOLON);
				setState(3251);
				intLit();
				}
				break;
			case THISADJUSTMENTCOLON:
				enterOuterAlt(_localctx, 13);
				{
				setState(3252);
				match(THISADJUSTMENTCOLON);
				setState(3253);
				intLit();
				}
				break;
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 14);
				{
				setState(3254);
				flagsField();
				}
				break;
			case ISOPTIMIZEDCOLON:
				enterOuterAlt(_localctx, 15);
				{
				setState(3255);
				isOptimizedField();
				}
				break;
			case UNITCOLON:
				enterOuterAlt(_localctx, 16);
				{
				setState(3256);
				match(UNITCOLON);
				setState(3257);
				mdField();
				}
				break;
			case TEMPLATEPARAMSCOLON:
				enterOuterAlt(_localctx, 17);
				{
				setState(3258);
				templateParamsField();
				}
				break;
			case DECLARATIONCOLON:
				enterOuterAlt(_localctx, 18);
				{
				setState(3259);
				declarationField();
				}
				break;
			case VARIABLESCOLON:
				enterOuterAlt(_localctx, 19);
				{
				setState(3260);
				match(VARIABLESCOLON);
				setState(3261);
				mdField();
				}
				break;
			case THROWNTYPESCOLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(3262);
				match(THROWNTYPESCOLON);
				setState(3263);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockContext extends ParserRuleContext {
		public TerminalNode NOTDILEXICALBLOCK() { return getToken(LLVMParser.NOTDILEXICALBLOCK, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiLexicalBlockFieldsContext diLexicalBlockFields() {
			return getRuleContext(DiLexicalBlockFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiLexicalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlock; }
	}

	public final DiLexicalBlockContext diLexicalBlock() throws RecognitionException {
		DiLexicalBlockContext _localctx = new DiLexicalBlockContext(_ctx, getState());
		enterRule(_localctx, 574, RULE_diLexicalBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3266);
			match(NOTDILEXICALBLOCK);
			setState(3267);
			match(LPAREN);
			setState(3268);
			diLexicalBlockFields();
			setState(3269);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockFieldsContext extends ParserRuleContext {
		public DiLexicalBlockFieldListContext diLexicalBlockFieldList() {
			return getRuleContext(DiLexicalBlockFieldListContext.class,0);
		}
		public DiLexicalBlockFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFields; }
	}

	public final DiLexicalBlockFieldsContext diLexicalBlockFields() throws RecognitionException {
		DiLexicalBlockFieldsContext _localctx = new DiLexicalBlockFieldsContext(_ctx, getState());
		enterRule(_localctx, 576, RULE_diLexicalBlockFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNCOLON || _la==FILECOLON || _la==LINECOLON || _la==SCOPECOLON) {
				{
				setState(3271);
				diLexicalBlockFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockFieldListContext extends ParserRuleContext {
		public DiLexicalBlockFieldContext diLexicalBlockField() {
			return getRuleContext(DiLexicalBlockFieldContext.class,0);
		}
		public DiLexicalBlockFieldListContext diLexicalBlockFieldList() {
			return getRuleContext(DiLexicalBlockFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiLexicalBlockFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFieldList; }
	}

	public final DiLexicalBlockFieldListContext diLexicalBlockFieldList() throws RecognitionException {
		return diLexicalBlockFieldList(0);
	}

	private DiLexicalBlockFieldListContext diLexicalBlockFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiLexicalBlockFieldListContext _localctx = new DiLexicalBlockFieldListContext(_ctx, _parentState);
		DiLexicalBlockFieldListContext _prevctx = _localctx;
		int _startState = 578;
		enterRecursionRule(_localctx, 578, RULE_diLexicalBlockFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3275);
			diLexicalBlockField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiLexicalBlockFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diLexicalBlockFieldList);
					setState(3277);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3278);
					match(COMMA);
					setState(3279);
					diLexicalBlockField();
					}
					} 
				}
				setState(3284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiLexicalBlockFieldContext extends ParserRuleContext {
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public ColumnFieldContext columnField() {
			return getRuleContext(ColumnFieldContext.class,0);
		}
		public DiLexicalBlockFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockField; }
	}

	public final DiLexicalBlockFieldContext diLexicalBlockField() throws RecognitionException {
		DiLexicalBlockFieldContext _localctx = new DiLexicalBlockFieldContext(_ctx, getState());
		enterRule(_localctx, 580, RULE_diLexicalBlockField);
		try {
			setState(3289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3285);
				scopeField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3286);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3287);
				lineField();
				}
				break;
			case COLUMNCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3288);
				columnField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockFileContext extends ParserRuleContext {
		public TerminalNode NOTDILEXICALBLOCKFILE() { return getToken(LLVMParser.NOTDILEXICALBLOCKFILE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiLexicalBlockFileFieldsContext diLexicalBlockFileFields() {
			return getRuleContext(DiLexicalBlockFileFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiLexicalBlockFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFile; }
	}

	public final DiLexicalBlockFileContext diLexicalBlockFile() throws RecognitionException {
		DiLexicalBlockFileContext _localctx = new DiLexicalBlockFileContext(_ctx, getState());
		enterRule(_localctx, 582, RULE_diLexicalBlockFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3291);
			match(NOTDILEXICALBLOCKFILE);
			setState(3292);
			match(LPAREN);
			setState(3293);
			diLexicalBlockFileFields();
			setState(3294);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockFileFieldsContext extends ParserRuleContext {
		public DiLexicalBlockFileFieldListContext diLexicalBlockFileFieldList() {
			return getRuleContext(DiLexicalBlockFileFieldListContext.class,0);
		}
		public DiLexicalBlockFileFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFileFields; }
	}

	public final DiLexicalBlockFileFieldsContext diLexicalBlockFileFields() throws RecognitionException {
		DiLexicalBlockFileFieldsContext _localctx = new DiLexicalBlockFileFieldsContext(_ctx, getState());
		enterRule(_localctx, 584, RULE_diLexicalBlockFileFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISCRIMINATORCOLON || _la==FILECOLON || _la==SCOPECOLON) {
				{
				setState(3296);
				diLexicalBlockFileFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLexicalBlockFileFieldListContext extends ParserRuleContext {
		public DiLexicalBlockFileFieldContext diLexicalBlockFileField() {
			return getRuleContext(DiLexicalBlockFileFieldContext.class,0);
		}
		public DiLexicalBlockFileFieldListContext diLexicalBlockFileFieldList() {
			return getRuleContext(DiLexicalBlockFileFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiLexicalBlockFileFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFileFieldList; }
	}

	public final DiLexicalBlockFileFieldListContext diLexicalBlockFileFieldList() throws RecognitionException {
		return diLexicalBlockFileFieldList(0);
	}

	private DiLexicalBlockFileFieldListContext diLexicalBlockFileFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiLexicalBlockFileFieldListContext _localctx = new DiLexicalBlockFileFieldListContext(_ctx, _parentState);
		DiLexicalBlockFileFieldListContext _prevctx = _localctx;
		int _startState = 586;
		enterRecursionRule(_localctx, 586, RULE_diLexicalBlockFileFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3300);
			diLexicalBlockFileField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiLexicalBlockFileFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diLexicalBlockFileFieldList);
					setState(3302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3303);
					match(COMMA);
					setState(3304);
					diLexicalBlockFileField();
					}
					} 
				}
				setState(3309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiLexicalBlockFileFieldContext extends ParserRuleContext {
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public TerminalNode DISCRIMINATORCOLON() { return getToken(LLVMParser.DISCRIMINATORCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public DiLexicalBlockFileFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLexicalBlockFileField; }
	}

	public final DiLexicalBlockFileFieldContext diLexicalBlockFileField() throws RecognitionException {
		DiLexicalBlockFileFieldContext _localctx = new DiLexicalBlockFileFieldContext(_ctx, getState());
		enterRule(_localctx, 588, RULE_diLexicalBlockFileField);
		try {
			setState(3314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3310);
				scopeField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3311);
				fileField();
				}
				break;
			case DISCRIMINATORCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3312);
				match(DISCRIMINATORCOLON);
				setState(3313);
				intLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocationContext extends ParserRuleContext {
		public TerminalNode NOTDILOCATION() { return getToken(LLVMParser.NOTDILOCATION, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiLocationFieldsContext diLocationFields() {
			return getRuleContext(DiLocationFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocation; }
	}

	public final DiLocationContext diLocation() throws RecognitionException {
		DiLocationContext _localctx = new DiLocationContext(_ctx, getState());
		enterRule(_localctx, 590, RULE_diLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3316);
			match(NOTDILOCATION);
			setState(3317);
			match(LPAREN);
			setState(3318);
			diLocationFields();
			setState(3319);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocationFieldsContext extends ParserRuleContext {
		public DiLocationFieldListContext diLocationFieldList() {
			return getRuleContext(DiLocationFieldListContext.class,0);
		}
		public DiLocationFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocationFields; }
	}

	public final DiLocationFieldsContext diLocationFields() throws RecognitionException {
		DiLocationFieldsContext _localctx = new DiLocationFieldsContext(_ctx, getState());
		enterRule(_localctx, 592, RULE_diLocationFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNCOLON || _la==INLINEDATCOLON || _la==LINECOLON || _la==SCOPECOLON) {
				{
				setState(3321);
				diLocationFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocationFieldListContext extends ParserRuleContext {
		public DiLocationFieldContext diLocationField() {
			return getRuleContext(DiLocationFieldContext.class,0);
		}
		public DiLocationFieldListContext diLocationFieldList() {
			return getRuleContext(DiLocationFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiLocationFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocationFieldList; }
	}

	public final DiLocationFieldListContext diLocationFieldList() throws RecognitionException {
		return diLocationFieldList(0);
	}

	private DiLocationFieldListContext diLocationFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiLocationFieldListContext _localctx = new DiLocationFieldListContext(_ctx, _parentState);
		DiLocationFieldListContext _prevctx = _localctx;
		int _startState = 594;
		enterRecursionRule(_localctx, 594, RULE_diLocationFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3325);
			diLocationField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiLocationFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diLocationFieldList);
					setState(3327);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3328);
					match(COMMA);
					setState(3329);
					diLocationField();
					}
					} 
				}
				setState(3334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiLocationFieldContext extends ParserRuleContext {
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public ColumnFieldContext columnField() {
			return getRuleContext(ColumnFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public TerminalNode INLINEDATCOLON() { return getToken(LLVMParser.INLINEDATCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public DiLocationFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocationField; }
	}

	public final DiLocationFieldContext diLocationField() throws RecognitionException {
		DiLocationFieldContext _localctx = new DiLocationFieldContext(_ctx, getState());
		enterRule(_localctx, 596, RULE_diLocationField);
		try {
			setState(3340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3335);
				lineField();
				}
				break;
			case COLUMNCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3336);
				columnField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3337);
				scopeField();
				}
				break;
			case INLINEDATCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3338);
				match(INLINEDATCOLON);
				setState(3339);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocalVariableContext extends ParserRuleContext {
		public TerminalNode NOTDILOCALVARIABLE() { return getToken(LLVMParser.NOTDILOCALVARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiLocalVariableFieldsContext diLocalVariableFields() {
			return getRuleContext(DiLocalVariableFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiLocalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocalVariable; }
	}

	public final DiLocalVariableContext diLocalVariable() throws RecognitionException {
		DiLocalVariableContext _localctx = new DiLocalVariableContext(_ctx, getState());
		enterRule(_localctx, 598, RULE_diLocalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3342);
			match(NOTDILOCALVARIABLE);
			setState(3343);
			match(LPAREN);
			setState(3344);
			diLocalVariableFields();
			setState(3345);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocalVariableFieldsContext extends ParserRuleContext {
		public DiLocalVariableFieldListContext diLocalVariableFieldList() {
			return getRuleContext(DiLocalVariableFieldListContext.class,0);
		}
		public DiLocalVariableFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocalVariableFields; }
	}

	public final DiLocalVariableFieldsContext diLocalVariableFields() throws RecognitionException {
		DiLocalVariableFieldsContext _localctx = new DiLocalVariableFieldsContext(_ctx, getState());
		enterRule(_localctx, 600, RULE_diLocalVariableFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGNCOLON || _la==ARGCOLON || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (FILECOLON - 154)) | (1L << (FLAGSCOLON - 154)) | (1L << (LINECOLON - 154)))) != 0) || _la==NAMECOLON || _la==SCOPECOLON || _la==TYPECOLON) {
				{
				setState(3347);
				diLocalVariableFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiLocalVariableFieldListContext extends ParserRuleContext {
		public DiLocalVariableFieldContext diLocalVariableField() {
			return getRuleContext(DiLocalVariableFieldContext.class,0);
		}
		public DiLocalVariableFieldListContext diLocalVariableFieldList() {
			return getRuleContext(DiLocalVariableFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiLocalVariableFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocalVariableFieldList; }
	}

	public final DiLocalVariableFieldListContext diLocalVariableFieldList() throws RecognitionException {
		return diLocalVariableFieldList(0);
	}

	private DiLocalVariableFieldListContext diLocalVariableFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiLocalVariableFieldListContext _localctx = new DiLocalVariableFieldListContext(_ctx, _parentState);
		DiLocalVariableFieldListContext _prevctx = _localctx;
		int _startState = 602;
		enterRecursionRule(_localctx, 602, RULE_diLocalVariableFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3351);
			diLocalVariableField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiLocalVariableFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diLocalVariableFieldList);
					setState(3353);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3354);
					match(COMMA);
					setState(3355);
					diLocalVariableField();
					}
					} 
				}
				setState(3360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiLocalVariableFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TerminalNode ARGCOLON() { return getToken(LLVMParser.ARGCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public FlagsFieldContext flagsField() {
			return getRuleContext(FlagsFieldContext.class,0);
		}
		public AlignFieldContext alignField() {
			return getRuleContext(AlignFieldContext.class,0);
		}
		public DiLocalVariableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diLocalVariableField; }
	}

	public final DiLocalVariableFieldContext diLocalVariableField() throws RecognitionException {
		DiLocalVariableFieldContext _localctx = new DiLocalVariableFieldContext(_ctx, getState());
		enterRule(_localctx, 604, RULE_diLocalVariableField);
		try {
			setState(3370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3361);
				nameField();
				}
				break;
			case ARGCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3362);
				match(ARGCOLON);
				setState(3363);
				intLit();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3364);
				scopeField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3365);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3366);
				lineField();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3367);
				typeField();
				}
				break;
			case FLAGSCOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(3368);
				flagsField();
				}
				break;
			case ALIGNCOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(3369);
				alignField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiExpressionContext extends ParserRuleContext {
		public TerminalNode NOTDIEXPRESSION() { return getToken(LLVMParser.NOTDIEXPRESSION, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiExpressionFieldsContext diExpressionFields() {
			return getRuleContext(DiExpressionFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diExpression; }
	}

	public final DiExpressionContext diExpression() throws RecognitionException {
		DiExpressionContext _localctx = new DiExpressionContext(_ctx, getState());
		enterRule(_localctx, 606, RULE_diExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3372);
			match(NOTDIEXPRESSION);
			setState(3373);
			match(LPAREN);
			setState(3374);
			diExpressionFields();
			setState(3375);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiExpressionFieldsContext extends ParserRuleContext {
		public DiExpressionFieldListContext diExpressionFieldList() {
			return getRuleContext(DiExpressionFieldListContext.class,0);
		}
		public DiExpressionFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diExpressionFields; }
	}

	public final DiExpressionFieldsContext diExpressionFields() throws RecognitionException {
		DiExpressionFieldsContext _localctx = new DiExpressionFieldsContext(_ctx, getState());
		enterRule(_localctx, 608, RULE_diExpressionFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DWARF_OP || _la==INT_LIT) {
				{
				setState(3377);
				diExpressionFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiExpressionFieldListContext extends ParserRuleContext {
		public DiExpressionFieldContext diExpressionField() {
			return getRuleContext(DiExpressionFieldContext.class,0);
		}
		public DiExpressionFieldListContext diExpressionFieldList() {
			return getRuleContext(DiExpressionFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiExpressionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diExpressionFieldList; }
	}

	public final DiExpressionFieldListContext diExpressionFieldList() throws RecognitionException {
		return diExpressionFieldList(0);
	}

	private DiExpressionFieldListContext diExpressionFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiExpressionFieldListContext _localctx = new DiExpressionFieldListContext(_ctx, _parentState);
		DiExpressionFieldListContext _prevctx = _localctx;
		int _startState = 610;
		enterRecursionRule(_localctx, 610, RULE_diExpressionFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3381);
			diExpressionField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiExpressionFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diExpressionFieldList);
					setState(3383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3384);
					match(COMMA);
					setState(3385);
					diExpressionField();
					}
					} 
				}
				setState(3390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiExpressionFieldContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public DwarfOpContext dwarfOp() {
			return getRuleContext(DwarfOpContext.class,0);
		}
		public DiExpressionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diExpressionField; }
	}

	public final DiExpressionFieldContext diExpressionField() throws RecognitionException {
		DiExpressionFieldContext _localctx = new DiExpressionFieldContext(_ctx, getState());
		enterRule(_localctx, 612, RULE_diExpressionField);
		try {
			setState(3393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3391);
				match(INT_LIT);
				}
				break;
			case DWARF_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(3392);
				dwarfOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableExpressionContext extends ParserRuleContext {
		public TerminalNode NOTDIGLOBALVARIABLEEXPRESSION() { return getToken(LLVMParser.NOTDIGLOBALVARIABLEEXPRESSION, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiGlobalVariableExpressionFieldsContext diGlobalVariableExpressionFields() {
			return getRuleContext(DiGlobalVariableExpressionFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiGlobalVariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableExpression; }
	}

	public final DiGlobalVariableExpressionContext diGlobalVariableExpression() throws RecognitionException {
		DiGlobalVariableExpressionContext _localctx = new DiGlobalVariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 614, RULE_diGlobalVariableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3395);
			match(NOTDIGLOBALVARIABLEEXPRESSION);
			setState(3396);
			match(LPAREN);
			setState(3397);
			diGlobalVariableExpressionFields();
			setState(3398);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableExpressionFieldsContext extends ParserRuleContext {
		public DiGlobalVariableExpressionFieldListContext diGlobalVariableExpressionFieldList() {
			return getRuleContext(DiGlobalVariableExpressionFieldListContext.class,0);
		}
		public DiGlobalVariableExpressionFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableExpressionFields; }
	}

	public final DiGlobalVariableExpressionFieldsContext diGlobalVariableExpressionFields() throws RecognitionException {
		DiGlobalVariableExpressionFieldsContext _localctx = new DiGlobalVariableExpressionFieldsContext(_ctx, getState());
		enterRule(_localctx, 616, RULE_diGlobalVariableExpressionFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPRCOLON || _la==VARCOLON) {
				{
				setState(3400);
				diGlobalVariableExpressionFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiGlobalVariableExpressionFieldListContext extends ParserRuleContext {
		public DiGlobalVariableExpressionFieldContext diGlobalVariableExpressionField() {
			return getRuleContext(DiGlobalVariableExpressionFieldContext.class,0);
		}
		public DiGlobalVariableExpressionFieldListContext diGlobalVariableExpressionFieldList() {
			return getRuleContext(DiGlobalVariableExpressionFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiGlobalVariableExpressionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableExpressionFieldList; }
	}

	public final DiGlobalVariableExpressionFieldListContext diGlobalVariableExpressionFieldList() throws RecognitionException {
		return diGlobalVariableExpressionFieldList(0);
	}

	private DiGlobalVariableExpressionFieldListContext diGlobalVariableExpressionFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiGlobalVariableExpressionFieldListContext _localctx = new DiGlobalVariableExpressionFieldListContext(_ctx, _parentState);
		DiGlobalVariableExpressionFieldListContext _prevctx = _localctx;
		int _startState = 618;
		enterRecursionRule(_localctx, 618, RULE_diGlobalVariableExpressionFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3404);
			diGlobalVariableExpressionField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiGlobalVariableExpressionFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diGlobalVariableExpressionFieldList);
					setState(3406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3407);
					match(COMMA);
					setState(3408);
					diGlobalVariableExpressionField();
					}
					} 
				}
				setState(3413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiGlobalVariableExpressionFieldContext extends ParserRuleContext {
		public TerminalNode VARCOLON() { return getToken(LLVMParser.VARCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TerminalNode EXPRCOLON() { return getToken(LLVMParser.EXPRCOLON, 0); }
		public DiGlobalVariableExpressionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diGlobalVariableExpressionField; }
	}

	public final DiGlobalVariableExpressionFieldContext diGlobalVariableExpressionField() throws RecognitionException {
		DiGlobalVariableExpressionFieldContext _localctx = new DiGlobalVariableExpressionFieldContext(_ctx, getState());
		enterRule(_localctx, 620, RULE_diGlobalVariableExpressionField);
		try {
			setState(3418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3414);
				match(VARCOLON);
				setState(3415);
				mdField();
				}
				break;
			case EXPRCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3416);
				match(EXPRCOLON);
				setState(3417);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiObjCPropertyContext extends ParserRuleContext {
		public TerminalNode NOTDIOBJCPROPERTY() { return getToken(LLVMParser.NOTDIOBJCPROPERTY, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiObjCPropertyFieldsContext diObjCPropertyFields() {
			return getRuleContext(DiObjCPropertyFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiObjCPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diObjCProperty; }
	}

	public final DiObjCPropertyContext diObjCProperty() throws RecognitionException {
		DiObjCPropertyContext _localctx = new DiObjCPropertyContext(_ctx, getState());
		enterRule(_localctx, 622, RULE_diObjCProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3420);
			match(NOTDIOBJCPROPERTY);
			setState(3421);
			match(LPAREN);
			setState(3422);
			diObjCPropertyFields();
			setState(3423);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiObjCPropertyFieldsContext extends ParserRuleContext {
		public DiObjCPropertyFieldListContext diObjCPropertyFieldList() {
			return getRuleContext(DiObjCPropertyFieldListContext.class,0);
		}
		public DiObjCPropertyFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diObjCPropertyFields; }
	}

	public final DiObjCPropertyFieldsContext diObjCPropertyFields() throws RecognitionException {
		DiObjCPropertyFieldsContext _localctx = new DiObjCPropertyFieldsContext(_ctx, getState());
		enterRule(_localctx, 624, RULE_diObjCPropertyFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTESCOLON || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (FILECOLON - 154)) | (1L << (GETTERCOLON - 154)) | (1L << (LINECOLON - 154)))) != 0) || _la==NAMECOLON || _la==SETTERCOLON || _la==TYPECOLON) {
				{
				setState(3425);
				diObjCPropertyFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiObjCPropertyFieldListContext extends ParserRuleContext {
		public DiObjCPropertyFieldContext diObjCPropertyField() {
			return getRuleContext(DiObjCPropertyFieldContext.class,0);
		}
		public DiObjCPropertyFieldListContext diObjCPropertyFieldList() {
			return getRuleContext(DiObjCPropertyFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiObjCPropertyFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diObjCPropertyFieldList; }
	}

	public final DiObjCPropertyFieldListContext diObjCPropertyFieldList() throws RecognitionException {
		return diObjCPropertyFieldList(0);
	}

	private DiObjCPropertyFieldListContext diObjCPropertyFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiObjCPropertyFieldListContext _localctx = new DiObjCPropertyFieldListContext(_ctx, _parentState);
		DiObjCPropertyFieldListContext _prevctx = _localctx;
		int _startState = 626;
		enterRecursionRule(_localctx, 626, RULE_diObjCPropertyFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3429);
			diObjCPropertyField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiObjCPropertyFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diObjCPropertyFieldList);
					setState(3431);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3432);
					match(COMMA);
					setState(3433);
					diObjCPropertyField();
					}
					} 
				}
				setState(3438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiObjCPropertyFieldContext extends ParserRuleContext {
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public TerminalNode SETTERCOLON() { return getToken(LLVMParser.SETTERCOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode GETTERCOLON() { return getToken(LLVMParser.GETTERCOLON, 0); }
		public TerminalNode ATTRIBUTESCOLON() { return getToken(LLVMParser.ATTRIBUTESCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TypeFieldContext typeField() {
			return getRuleContext(TypeFieldContext.class,0);
		}
		public DiObjCPropertyFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diObjCPropertyField; }
	}

	public final DiObjCPropertyFieldContext diObjCPropertyField() throws RecognitionException {
		DiObjCPropertyFieldContext _localctx = new DiObjCPropertyFieldContext(_ctx, getState());
		enterRule(_localctx, 628, RULE_diObjCPropertyField);
		try {
			setState(3449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3439);
				nameField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3440);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3441);
				lineField();
				}
				break;
			case SETTERCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3442);
				match(SETTERCOLON);
				setState(3443);
				stringLit();
				}
				break;
			case GETTERCOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3444);
				match(GETTERCOLON);
				setState(3445);
				stringLit();
				}
				break;
			case ATTRIBUTESCOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3446);
				match(ATTRIBUTESCOLON);
				setState(3447);
				intLit();
				}
				break;
			case TYPECOLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(3448);
				typeField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiImportedEntityContext extends ParserRuleContext {
		public TerminalNode NOTDIIMPORTEDENTITY() { return getToken(LLVMParser.NOTDIIMPORTEDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiImportedEntityFieldsContext diImportedEntityFields() {
			return getRuleContext(DiImportedEntityFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiImportedEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diImportedEntity; }
	}

	public final DiImportedEntityContext diImportedEntity() throws RecognitionException {
		DiImportedEntityContext _localctx = new DiImportedEntityContext(_ctx, getState());
		enterRule(_localctx, 630, RULE_diImportedEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3451);
			match(NOTDIIMPORTEDENTITY);
			setState(3452);
			match(LPAREN);
			setState(3453);
			diImportedEntityFields();
			setState(3454);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiImportedEntityFieldsContext extends ParserRuleContext {
		public DiImportedEntityFieldListContext diImportedEntityFieldList() {
			return getRuleContext(DiImportedEntityFieldListContext.class,0);
		}
		public DiImportedEntityFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diImportedEntityFields; }
	}

	public final DiImportedEntityFieldsContext diImportedEntityFields() throws RecognitionException {
		DiImportedEntityFieldsContext _localctx = new DiImportedEntityFieldsContext(_ctx, getState());
		enterRule(_localctx, 632, RULE_diImportedEntityFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTITYCOLON || _la==FILECOLON || _la==LINECOLON || _la==NAMECOLON || _la==SCOPECOLON || _la==TAGCOLON) {
				{
				setState(3456);
				diImportedEntityFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiImportedEntityFieldListContext extends ParserRuleContext {
		public DiImportedEntityFieldContext diImportedEntityField() {
			return getRuleContext(DiImportedEntityFieldContext.class,0);
		}
		public DiImportedEntityFieldListContext diImportedEntityFieldList() {
			return getRuleContext(DiImportedEntityFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiImportedEntityFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diImportedEntityFieldList; }
	}

	public final DiImportedEntityFieldListContext diImportedEntityFieldList() throws RecognitionException {
		return diImportedEntityFieldList(0);
	}

	private DiImportedEntityFieldListContext diImportedEntityFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiImportedEntityFieldListContext _localctx = new DiImportedEntityFieldListContext(_ctx, _parentState);
		DiImportedEntityFieldListContext _prevctx = _localctx;
		int _startState = 634;
		enterRecursionRule(_localctx, 634, RULE_diImportedEntityFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3460);
			diImportedEntityField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiImportedEntityFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diImportedEntityFieldList);
					setState(3462);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3463);
					match(COMMA);
					setState(3464);
					diImportedEntityField();
					}
					} 
				}
				setState(3469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiImportedEntityFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public ScopeFieldContext scopeField() {
			return getRuleContext(ScopeFieldContext.class,0);
		}
		public TerminalNode ENTITYCOLON() { return getToken(LLVMParser.ENTITYCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public DiImportedEntityFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diImportedEntityField; }
	}

	public final DiImportedEntityFieldContext diImportedEntityField() throws RecognitionException {
		DiImportedEntityFieldContext _localctx = new DiImportedEntityFieldContext(_ctx, getState());
		enterRule(_localctx, 636, RULE_diImportedEntityField);
		try {
			setState(3477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3470);
				tagField();
				}
				break;
			case SCOPECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3471);
				scopeField();
				}
				break;
			case ENTITYCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3472);
				match(ENTITYCOLON);
				setState(3473);
				mdField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3474);
				fileField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(3475);
				lineField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 6);
				{
				setState(3476);
				nameField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroContext extends ParserRuleContext {
		public TerminalNode NOTDIMACRO() { return getToken(LLVMParser.NOTDIMACRO, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiMacroFieldsContext diMacroFields() {
			return getRuleContext(DiMacroFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacro; }
	}

	public final DiMacroContext diMacro() throws RecognitionException {
		DiMacroContext _localctx = new DiMacroContext(_ctx, getState());
		enterRule(_localctx, 638, RULE_diMacro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3479);
			match(NOTDIMACRO);
			setState(3480);
			match(LPAREN);
			setState(3481);
			diMacroFields();
			setState(3482);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroFieldsContext extends ParserRuleContext {
		public DiMacroFieldListContext diMacroFieldList() {
			return getRuleContext(DiMacroFieldListContext.class,0);
		}
		public DiMacroFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFields; }
	}

	public final DiMacroFieldsContext diMacroFields() throws RecognitionException {
		DiMacroFieldsContext _localctx = new DiMacroFieldsContext(_ctx, getState());
		enterRule(_localctx, 640, RULE_diMacroFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINECOLON || _la==NAMECOLON || _la==TYPECOLON || _la==VALUECOLON) {
				{
				setState(3484);
				diMacroFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroFieldListContext extends ParserRuleContext {
		public DiMacroFieldContext diMacroField() {
			return getRuleContext(DiMacroFieldContext.class,0);
		}
		public DiMacroFieldListContext diMacroFieldList() {
			return getRuleContext(DiMacroFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiMacroFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFieldList; }
	}

	public final DiMacroFieldListContext diMacroFieldList() throws RecognitionException {
		return diMacroFieldList(0);
	}

	private DiMacroFieldListContext diMacroFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiMacroFieldListContext _localctx = new DiMacroFieldListContext(_ctx, _parentState);
		DiMacroFieldListContext _prevctx = _localctx;
		int _startState = 642;
		enterRecursionRule(_localctx, 642, RULE_diMacroFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3488);
			diMacroField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiMacroFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diMacroFieldList);
					setState(3490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3491);
					match(COMMA);
					setState(3492);
					diMacroField();
					}
					} 
				}
				setState(3497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiMacroFieldContext extends ParserRuleContext {
		public TypeMacinfoFieldContext typeMacinfoField() {
			return getRuleContext(TypeMacinfoFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public TerminalNode VALUECOLON() { return getToken(LLVMParser.VALUECOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public DiMacroFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroField; }
	}

	public final DiMacroFieldContext diMacroField() throws RecognitionException {
		DiMacroFieldContext _localctx = new DiMacroFieldContext(_ctx, getState());
		enterRule(_localctx, 644, RULE_diMacroField);
		try {
			setState(3503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3498);
				typeMacinfoField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3499);
				lineField();
				}
				break;
			case NAMECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3500);
				nameField();
				}
				break;
			case VALUECOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3501);
				match(VALUECOLON);
				setState(3502);
				stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroFileContext extends ParserRuleContext {
		public TerminalNode NOTDIMACROFILE() { return getToken(LLVMParser.NOTDIMACROFILE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public DiMacroFileFieldsContext diMacroFileFields() {
			return getRuleContext(DiMacroFileFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public DiMacroFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFile; }
	}

	public final DiMacroFileContext diMacroFile() throws RecognitionException {
		DiMacroFileContext _localctx = new DiMacroFileContext(_ctx, getState());
		enterRule(_localctx, 646, RULE_diMacroFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3505);
			match(NOTDIMACROFILE);
			setState(3506);
			match(LPAREN);
			setState(3507);
			diMacroFileFields();
			setState(3508);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroFileFieldsContext extends ParserRuleContext {
		public DiMacroFileFieldListContext diMacroFileFieldList() {
			return getRuleContext(DiMacroFileFieldListContext.class,0);
		}
		public DiMacroFileFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFileFields; }
	}

	public final DiMacroFileFieldsContext diMacroFileFields() throws RecognitionException {
		DiMacroFileFieldsContext _localctx = new DiMacroFileFieldsContext(_ctx, getState());
		enterRule(_localctx, 648, RULE_diMacroFileFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILECOLON || _la==LINECOLON || _la==NODESCOLON || _la==TYPECOLON) {
				{
				setState(3510);
				diMacroFileFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiMacroFileFieldListContext extends ParserRuleContext {
		public DiMacroFileFieldContext diMacroFileField() {
			return getRuleContext(DiMacroFileFieldContext.class,0);
		}
		public DiMacroFileFieldListContext diMacroFileFieldList() {
			return getRuleContext(DiMacroFileFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public DiMacroFileFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFileFieldList; }
	}

	public final DiMacroFileFieldListContext diMacroFileFieldList() throws RecognitionException {
		return diMacroFileFieldList(0);
	}

	private DiMacroFileFieldListContext diMacroFileFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiMacroFileFieldListContext _localctx = new DiMacroFileFieldListContext(_ctx, _parentState);
		DiMacroFileFieldListContext _prevctx = _localctx;
		int _startState = 650;
		enterRecursionRule(_localctx, 650, RULE_diMacroFileFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3514);
			diMacroFileField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiMacroFileFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diMacroFileFieldList);
					setState(3516);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3517);
					match(COMMA);
					setState(3518);
					diMacroFileField();
					}
					} 
				}
				setState(3523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiMacroFileFieldContext extends ParserRuleContext {
		public TypeMacinfoFieldContext typeMacinfoField() {
			return getRuleContext(TypeMacinfoFieldContext.class,0);
		}
		public LineFieldContext lineField() {
			return getRuleContext(LineFieldContext.class,0);
		}
		public FileFieldContext fileField() {
			return getRuleContext(FileFieldContext.class,0);
		}
		public TerminalNode NODESCOLON() { return getToken(LLVMParser.NODESCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public DiMacroFileFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diMacroFileField; }
	}

	public final DiMacroFileFieldContext diMacroFileField() throws RecognitionException {
		DiMacroFileFieldContext _localctx = new DiMacroFileFieldContext(_ctx, getState());
		enterRule(_localctx, 652, RULE_diMacroFileField);
		try {
			setState(3529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPECOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3524);
				typeMacinfoField();
				}
				break;
			case LINECOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3525);
				lineField();
				}
				break;
			case FILECOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3526);
				fileField();
				}
				break;
			case NODESCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(3527);
				match(NODESCOLON);
				setState(3528);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDINodeContext extends ParserRuleContext {
		public TerminalNode NOTGENERICDINODE() { return getToken(LLVMParser.NOTGENERICDINODE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public GenericDINodeFieldsContext genericDINodeFields() {
			return getRuleContext(GenericDINodeFieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public GenericDINodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDINode; }
	}

	public final GenericDINodeContext genericDINode() throws RecognitionException {
		GenericDINodeContext _localctx = new GenericDINodeContext(_ctx, getState());
		enterRule(_localctx, 654, RULE_genericDINode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3531);
			match(NOTGENERICDINODE);
			setState(3532);
			match(LPAREN);
			setState(3533);
			genericDINodeFields();
			setState(3534);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDINodeFieldsContext extends ParserRuleContext {
		public GenericDINodeFieldListContext genericDINodeFieldList() {
			return getRuleContext(GenericDINodeFieldListContext.class,0);
		}
		public GenericDINodeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDINodeFields; }
	}

	public final GenericDINodeFieldsContext genericDINodeFields() throws RecognitionException {
		GenericDINodeFieldsContext _localctx = new GenericDINodeFieldsContext(_ctx, getState());
		enterRule(_localctx, 656, RULE_genericDINodeFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADERCOLON || _la==OPERANDSCOLON || _la==TAGCOLON) {
				{
				setState(3536);
				genericDINodeFieldList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDINodeFieldListContext extends ParserRuleContext {
		public GenericDINodeFieldContext genericDINodeField() {
			return getRuleContext(GenericDINodeFieldContext.class,0);
		}
		public GenericDINodeFieldListContext genericDINodeFieldList() {
			return getRuleContext(GenericDINodeFieldListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public GenericDINodeFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDINodeFieldList; }
	}

	public final GenericDINodeFieldListContext genericDINodeFieldList() throws RecognitionException {
		return genericDINodeFieldList(0);
	}

	private GenericDINodeFieldListContext genericDINodeFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericDINodeFieldListContext _localctx = new GenericDINodeFieldListContext(_ctx, _parentState);
		GenericDINodeFieldListContext _prevctx = _localctx;
		int _startState = 658;
		enterRecursionRule(_localctx, 658, RULE_genericDINodeFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3540);
			genericDINodeField();
			}
			_ctx.stop = _input.LT(-1);
			setState(3547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericDINodeFieldListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericDINodeFieldList);
					setState(3542);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3543);
					match(COMMA);
					setState(3544);
					genericDINodeField();
					}
					} 
				}
				setState(3549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericDINodeFieldContext extends ParserRuleContext {
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public TerminalNode HEADERCOLON() { return getToken(LLVMParser.HEADERCOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode OPERANDSCOLON() { return getToken(LLVMParser.OPERANDSCOLON, 0); }
		public MdFieldsContext mdFields() {
			return getRuleContext(MdFieldsContext.class,0);
		}
		public GenericDINodeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDINodeField; }
	}

	public final GenericDINodeFieldContext genericDINodeField() throws RecognitionException {
		GenericDINodeFieldContext _localctx = new GenericDINodeFieldContext(_ctx, getState());
		enterRule(_localctx, 660, RULE_genericDINodeField);
		try {
			setState(3555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(3550);
				tagField();
				}
				break;
			case HEADERCOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3551);
				match(HEADERCOLON);
				setState(3552);
				stringLit();
				}
				break;
			case OPERANDSCOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3553);
				match(OPERANDSCOLON);
				setState(3554);
				mdFields();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFieldContext extends ParserRuleContext {
		public TerminalNode FILECOLON() { return getToken(LLVMParser.FILECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public FileFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileField; }
	}

	public final FileFieldContext fileField() throws RecognitionException {
		FileFieldContext _localctx = new FileFieldContext(_ctx, getState());
		enterRule(_localctx, 662, RULE_fileField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3557);
			match(FILECOLON);
			setState(3558);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOptimizedFieldContext extends ParserRuleContext {
		public TerminalNode ISOPTIMIZEDCOLON() { return getToken(LLVMParser.ISOPTIMIZEDCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public IsOptimizedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOptimizedField; }
	}

	public final IsOptimizedFieldContext isOptimizedField() throws RecognitionException {
		IsOptimizedFieldContext _localctx = new IsOptimizedFieldContext(_ctx, getState());
		enterRule(_localctx, 664, RULE_isOptimizedField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3560);
			match(ISOPTIMIZEDCOLON);
			setState(3561);
			boolLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagFieldContext extends ParserRuleContext {
		public TerminalNode TAGCOLON() { return getToken(LLVMParser.TAGCOLON, 0); }
		public DwarfTagContext dwarfTag() {
			return getRuleContext(DwarfTagContext.class,0);
		}
		public TagFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagField; }
	}

	public final TagFieldContext tagField() throws RecognitionException {
		TagFieldContext _localctx = new TagFieldContext(_ctx, getState());
		enterRule(_localctx, 666, RULE_tagField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3563);
			match(TAGCOLON);
			setState(3564);
			dwarfTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameFieldContext extends ParserRuleContext {
		public TerminalNode NAMECOLON() { return getToken(LLVMParser.NAMECOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public NameFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameField; }
	}

	public final NameFieldContext nameField() throws RecognitionException {
		NameFieldContext _localctx = new NameFieldContext(_ctx, getState());
		enterRule(_localctx, 668, RULE_nameField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3566);
			match(NAMECOLON);
			setState(3567);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeFieldContext extends ParserRuleContext {
		public TerminalNode SIZECOLON() { return getToken(LLVMParser.SIZECOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public SizeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeField; }
	}

	public final SizeFieldContext sizeField() throws RecognitionException {
		SizeFieldContext _localctx = new SizeFieldContext(_ctx, getState());
		enterRule(_localctx, 670, RULE_sizeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3569);
			match(SIZECOLON);
			setState(3570);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignFieldContext extends ParserRuleContext {
		public TerminalNode ALIGNCOLON() { return getToken(LLVMParser.ALIGNCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public AlignFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignField; }
	}

	public final AlignFieldContext alignField() throws RecognitionException {
		AlignFieldContext _localctx = new AlignFieldContext(_ctx, getState());
		enterRule(_localctx, 672, RULE_alignField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3572);
			match(ALIGNCOLON);
			setState(3573);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlagsFieldContext extends ParserRuleContext {
		public TerminalNode FLAGSCOLON() { return getToken(LLVMParser.FLAGSCOLON, 0); }
		public DiFlagListContext diFlagList() {
			return getRuleContext(DiFlagListContext.class,0);
		}
		public FlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagsField; }
	}

	public final FlagsFieldContext flagsField() throws RecognitionException {
		FlagsFieldContext _localctx = new FlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 674, RULE_flagsField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3575);
			match(FLAGSCOLON);
			setState(3576);
			diFlagList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineFieldContext extends ParserRuleContext {
		public TerminalNode LINECOLON() { return getToken(LLVMParser.LINECOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public LineFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineField; }
	}

	public final LineFieldContext lineField() throws RecognitionException {
		LineFieldContext _localctx = new LineFieldContext(_ctx, getState());
		enterRule(_localctx, 676, RULE_lineField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3578);
			match(LINECOLON);
			setState(3579);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeFieldContext extends ParserRuleContext {
		public TerminalNode SCOPECOLON() { return getToken(LLVMParser.SCOPECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public ScopeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeField; }
	}

	public final ScopeFieldContext scopeField() throws RecognitionException {
		ScopeFieldContext _localctx = new ScopeFieldContext(_ctx, getState());
		enterRule(_localctx, 678, RULE_scopeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3581);
			match(SCOPECOLON);
			setState(3582);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeFieldContext extends ParserRuleContext {
		public TerminalNode BASETYPECOLON() { return getToken(LLVMParser.BASETYPECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public BaseTypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeField; }
	}

	public final BaseTypeFieldContext baseTypeField() throws RecognitionException {
		BaseTypeFieldContext _localctx = new BaseTypeFieldContext(_ctx, getState());
		enterRule(_localctx, 680, RULE_baseTypeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3584);
			match(BASETYPECOLON);
			setState(3585);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetFieldContext extends ParserRuleContext {
		public TerminalNode OFFSETCOLON() { return getToken(LLVMParser.OFFSETCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public OffsetFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetField; }
	}

	public final OffsetFieldContext offsetField() throws RecognitionException {
		OffsetFieldContext _localctx = new OffsetFieldContext(_ctx, getState());
		enterRule(_localctx, 682, RULE_offsetField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3587);
			match(OFFSETCOLON);
			setState(3588);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateParamsFieldContext extends ParserRuleContext {
		public TerminalNode TEMPLATEPARAMSCOLON() { return getToken(LLVMParser.TEMPLATEPARAMSCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TemplateParamsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParamsField; }
	}

	public final TemplateParamsFieldContext templateParamsField() throws RecognitionException {
		TemplateParamsFieldContext _localctx = new TemplateParamsFieldContext(_ctx, getState());
		enterRule(_localctx, 684, RULE_templateParamsField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3590);
			match(TEMPLATEPARAMSCOLON);
			setState(3591);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntOrMDFieldContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public IntOrMDFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intOrMDField; }
	}

	public final IntOrMDFieldContext intOrMDField() throws RecognitionException {
		IntOrMDFieldContext _localctx = new IntOrMDFieldContext(_ctx, getState());
		enterRule(_localctx, 686, RULE_intOrMDField);
		try {
			setState(3595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3593);
				match(INT_LIT);
				}
				break;
			case LT:
			case BANG:
			case LBRACK:
			case LBRACE:
			case NOTDIBASICTYPE:
			case NOTDICOMPILEUNIT:
			case NOTDICOMPOSITETYPE:
			case NOTDIDERIVEDTYPE:
			case NOTDIENUMERATOR:
			case NOTDIEXPRESSION:
			case NOTDIFILE:
			case NOTDIGLOBALVARIABLE:
			case NOTDIGLOBALVARIABLEEXPRESSION:
			case NOTDIIMPORTEDENTITY:
			case NOTDILEXICALBLOCK:
			case NOTDILEXICALBLOCKFILE:
			case NOTDILOCALVARIABLE:
			case NOTDILOCATION:
			case NOTDIMACRO:
			case NOTDIMACROFILE:
			case NOTDIMODULE:
			case NOTDINAMESPACE:
			case NOTDIOBJCPROPERTY:
			case NOTDISUBPROGRAM:
			case NOTDISUBRANGE:
			case NOTDISUBROUTINETYPE:
			case NOTDITEMPLATETYPEPARAMETER:
			case NOTDITEMPLATEVALUEPARAMETER:
			case DOUBLE:
			case FLOAT:
			case FP128:
			case NOTGENERICDINODE:
			case HALF:
			case LABEL:
			case METADATA:
			case NULL:
			case PPC_FP128:
			case TOKEN:
			case VOID:
			case X86_FP80:
			case X86_MMX:
			case METADATA_ID:
			case INT_TYPE:
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3594);
				mdField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFieldContext extends ParserRuleContext {
		public TerminalNode TYPECOLON() { return getToken(LLVMParser.TYPECOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public TypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeField; }
	}

	public final TypeFieldContext typeField() throws RecognitionException {
		TypeFieldContext _localctx = new TypeFieldContext(_ctx, getState());
		enterRule(_localctx, 688, RULE_typeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3597);
			match(TYPECOLON);
			setState(3598);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkageNameFieldContext extends ParserRuleContext {
		public TerminalNode LINKAGENAMECOLON() { return getToken(LLVMParser.LINKAGENAMECOLON, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public LinkageNameFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageNameField; }
	}

	public final LinkageNameFieldContext linkageNameField() throws RecognitionException {
		LinkageNameFieldContext _localctx = new LinkageNameFieldContext(_ctx, getState());
		enterRule(_localctx, 690, RULE_linkageNameField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3600);
			match(LINKAGENAMECOLON);
			setState(3601);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsLocalFieldContext extends ParserRuleContext {
		public TerminalNode ISLOCALCOLON() { return getToken(LLVMParser.ISLOCALCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public IsLocalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isLocalField; }
	}

	public final IsLocalFieldContext isLocalField() throws RecognitionException {
		IsLocalFieldContext _localctx = new IsLocalFieldContext(_ctx, getState());
		enterRule(_localctx, 692, RULE_isLocalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3603);
			match(ISLOCALCOLON);
			setState(3604);
			boolLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsDefinitionFieldContext extends ParserRuleContext {
		public TerminalNode ISDEFINITIONCOLON() { return getToken(LLVMParser.ISDEFINITIONCOLON, 0); }
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public IsDefinitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isDefinitionField; }
	}

	public final IsDefinitionFieldContext isDefinitionField() throws RecognitionException {
		IsDefinitionFieldContext _localctx = new IsDefinitionFieldContext(_ctx, getState());
		enterRule(_localctx, 694, RULE_isDefinitionField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3606);
			match(ISDEFINITIONCOLON);
			setState(3607);
			boolLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationFieldContext extends ParserRuleContext {
		public TerminalNode DECLARATIONCOLON() { return getToken(LLVMParser.DECLARATIONCOLON, 0); }
		public MdFieldContext mdField() {
			return getRuleContext(MdFieldContext.class,0);
		}
		public DeclarationFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationField; }
	}

	public final DeclarationFieldContext declarationField() throws RecognitionException {
		DeclarationFieldContext _localctx = new DeclarationFieldContext(_ctx, getState());
		enterRule(_localctx, 696, RULE_declarationField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3609);
			match(DECLARATIONCOLON);
			setState(3610);
			mdField();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnFieldContext extends ParserRuleContext {
		public TerminalNode COLUMNCOLON() { return getToken(LLVMParser.COLUMNCOLON, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public ColumnFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnField; }
	}

	public final ColumnFieldContext columnField() throws RecognitionException {
		ColumnFieldContext _localctx = new ColumnFieldContext(_ctx, getState());
		enterRule(_localctx, 698, RULE_columnField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3612);
			match(COLUMNCOLON);
			setState(3613);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMacinfoFieldContext extends ParserRuleContext {
		public TerminalNode TYPECOLON() { return getToken(LLVMParser.TYPECOLON, 0); }
		public DwarfMacinfoContext dwarfMacinfo() {
			return getRuleContext(DwarfMacinfoContext.class,0);
		}
		public TypeMacinfoFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMacinfoField; }
	}

	public final TypeMacinfoFieldContext typeMacinfoField() throws RecognitionException {
		TypeMacinfoFieldContext _localctx = new TypeMacinfoFieldContext(_ctx, getState());
		enterRule(_localctx, 700, RULE_typeMacinfoField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3615);
			match(TYPECOLON);
			setState(3616);
			dwarfMacinfo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChecksumkindContext extends ParserRuleContext {
		public TerminalNode CHECKSUM_KIND() { return getToken(LLVMParser.CHECKSUM_KIND, 0); }
		public ChecksumkindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checksumkind; }
	}

	public final ChecksumkindContext checksumkind() throws RecognitionException {
		ChecksumkindContext _localctx = new ChecksumkindContext(_ctx, getState());
		enterRule(_localctx, 702, RULE_checksumkind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3618);
			match(CHECKSUM_KIND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiFlagListContext extends ParserRuleContext {
		public DiFlagContext diFlag() {
			return getRuleContext(DiFlagContext.class,0);
		}
		public DiFlagListContext diFlagList() {
			return getRuleContext(DiFlagListContext.class,0);
		}
		public TerminalNode VDASH() { return getToken(LLVMParser.VDASH, 0); }
		public DiFlagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFlagList; }
	}

	public final DiFlagListContext diFlagList() throws RecognitionException {
		return diFlagList(0);
	}

	private DiFlagListContext diFlagList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DiFlagListContext _localctx = new DiFlagListContext(_ctx, _parentState);
		DiFlagListContext _prevctx = _localctx;
		int _startState = 704;
		enterRecursionRule(_localctx, 704, RULE_diFlagList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3621);
			diFlag();
			}
			_ctx.stop = _input.LT(-1);
			setState(3628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DiFlagListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_diFlagList);
					setState(3623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3624);
					match(VDASH);
					setState(3625);
					diFlag();
					}
					} 
				}
				setState(3630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DiFlagContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DI_FLAG() { return getToken(LLVMParser.DI_FLAG, 0); }
		public DiFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diFlag; }
	}

	public final DiFlagContext diFlag() throws RecognitionException {
		DiFlagContext _localctx = new DiFlagContext(_ctx, getState());
		enterRule(_localctx, 706, RULE_diFlag);
		try {
			setState(3633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3631);
				intLit();
				}
				break;
			case DI_FLAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(3632);
				match(DI_FLAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfAttEncodingContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_ATT_ENCODING() { return getToken(LLVMParser.DWARF_ATT_ENCODING, 0); }
		public DwarfAttEncodingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfAttEncoding; }
	}

	public final DwarfAttEncodingContext dwarfAttEncoding() throws RecognitionException {
		DwarfAttEncodingContext _localctx = new DwarfAttEncodingContext(_ctx, getState());
		enterRule(_localctx, 708, RULE_dwarfAttEncoding);
		try {
			setState(3637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3635);
				intLit();
				}
				break;
			case DWARF_ATT_ENCODING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3636);
				match(DWARF_ATT_ENCODING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfCCContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_CC() { return getToken(LLVMParser.DWARF_CC, 0); }
		public DwarfCCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfCC; }
	}

	public final DwarfCCContext dwarfCC() throws RecognitionException {
		DwarfCCContext _localctx = new DwarfCCContext(_ctx, getState());
		enterRule(_localctx, 710, RULE_dwarfCC);
		try {
			setState(3641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3639);
				intLit();
				}
				break;
			case DWARF_CC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3640);
				match(DWARF_CC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfLangContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_LANG() { return getToken(LLVMParser.DWARF_LANG, 0); }
		public DwarfLangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfLang; }
	}

	public final DwarfLangContext dwarfLang() throws RecognitionException {
		DwarfLangContext _localctx = new DwarfLangContext(_ctx, getState());
		enterRule(_localctx, 712, RULE_dwarfLang);
		try {
			setState(3645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3643);
				intLit();
				}
				break;
			case DWARF_LANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(3644);
				match(DWARF_LANG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfMacinfoContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_MACINFO() { return getToken(LLVMParser.DWARF_MACINFO, 0); }
		public DwarfMacinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfMacinfo; }
	}

	public final DwarfMacinfoContext dwarfMacinfo() throws RecognitionException {
		DwarfMacinfoContext _localctx = new DwarfMacinfoContext(_ctx, getState());
		enterRule(_localctx, 714, RULE_dwarfMacinfo);
		try {
			setState(3649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3647);
				intLit();
				}
				break;
			case DWARF_MACINFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(3648);
				match(DWARF_MACINFO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfOpContext extends ParserRuleContext {
		public TerminalNode DWARF_OP() { return getToken(LLVMParser.DWARF_OP, 0); }
		public DwarfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfOp; }
	}

	public final DwarfOpContext dwarfOp() throws RecognitionException {
		DwarfOpContext _localctx = new DwarfOpContext(_ctx, getState());
		enterRule(_localctx, 716, RULE_dwarfOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3651);
			match(DWARF_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfTagContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_TAG() { return getToken(LLVMParser.DWARF_TAG, 0); }
		public DwarfTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfTag; }
	}

	public final DwarfTagContext dwarfTag() throws RecognitionException {
		DwarfTagContext _localctx = new DwarfTagContext(_ctx, getState());
		enterRule(_localctx, 718, RULE_dwarfTag);
		try {
			setState(3655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3653);
				intLit();
				}
				break;
			case DWARF_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(3654);
				match(DWARF_TAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DwarfVirtualityContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode DWARF_VIRTUALITY() { return getToken(LLVMParser.DWARF_VIRTUALITY, 0); }
		public DwarfVirtualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwarfVirtuality; }
	}

	public final DwarfVirtualityContext dwarfVirtuality() throws RecognitionException {
		DwarfVirtualityContext _localctx = new DwarfVirtualityContext(_ctx, getState());
		enterRule(_localctx, 720, RULE_dwarfVirtuality);
		try {
			setState(3659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3657);
				intLit();
				}
				break;
			case DWARF_VIRTUALITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(3658);
				match(DWARF_VIRTUALITY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmissionKindContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode FULLDEBUG() { return getToken(LLVMParser.FULLDEBUG, 0); }
		public TerminalNode LINETABLESONLY() { return getToken(LLVMParser.LINETABLESONLY, 0); }
		public TerminalNode NODEBUG() { return getToken(LLVMParser.NODEBUG, 0); }
		public EmissionKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emissionKind; }
	}

	public final EmissionKindContext emissionKind() throws RecognitionException {
		EmissionKindContext _localctx = new EmissionKindContext(_ctx, getState());
		enterRule(_localctx, 722, RULE_emissionKind);
		try {
			setState(3665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3661);
				intLit();
				}
				break;
			case FULLDEBUG:
				enterOuterAlt(_localctx, 2);
				{
				setState(3662);
				match(FULLDEBUG);
				}
				break;
			case LINETABLESONLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(3663);
				match(LINETABLESONLY);
				}
				break;
			case NODEBUG:
				enterOuterAlt(_localctx, 4);
				{
				setState(3664);
				match(NODEBUG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeValuesContext extends ParserRuleContext {
		public TypeValueListContext typeValueList() {
			return getRuleContext(TypeValueListContext.class,0);
		}
		public TypeValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeValues; }
	}

	public final TypeValuesContext typeValues() throws RecognitionException {
		TypeValuesContext _localctx = new TypeValuesContext(_ctx, getState());
		enterRule(_localctx, 724, RULE_typeValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LBRACK) | (1L << LBRACE))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || _la==LABEL || _la==METADATA || _la==PPC_FP128 || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (TOKEN - 351)) | (1L << (VOID - 351)) | (1L << (X86_FP80 - 351)) | (1L << (X86_MMX - 351)))) != 0) || _la==INT_TYPE || _la==LOCAL_IDENT) {
				{
				setState(3667);
				typeValueList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeValueListContext extends ParserRuleContext {
		public TypeValueContext typeValue() {
			return getRuleContext(TypeValueContext.class,0);
		}
		public TypeValueListContext typeValueList() {
			return getRuleContext(TypeValueListContext.class,0);
		}
		public TypeValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeValueList; }
	}

	public final TypeValueListContext typeValueList() throws RecognitionException {
		return typeValueList(0);
	}

	private TypeValueListContext typeValueList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeValueListContext _localctx = new TypeValueListContext(_ctx, _parentState);
		TypeValueListContext _prevctx = _localctx;
		int _startState = 726;
		enterRecursionRule(_localctx, 726, RULE_typeValueList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3671);
			typeValue();
			}
			_ctx.stop = _input.LT(-1);
			setState(3677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeValueListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeValueList);
					setState(3673);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3674);
					typeValue();
					}
					} 
				}
				setState(3679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CommaSepTypeValueListContext extends ParserRuleContext {
		public TypeValueContext typeValue() {
			return getRuleContext(TypeValueContext.class,0);
		}
		public CommaSepTypeValueListContext commaSepTypeValueList() {
			return getRuleContext(CommaSepTypeValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public CommaSepTypeValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSepTypeValueList; }
	}

	public final CommaSepTypeValueListContext commaSepTypeValueList() throws RecognitionException {
		return commaSepTypeValueList(0);
	}

	private CommaSepTypeValueListContext commaSepTypeValueList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommaSepTypeValueListContext _localctx = new CommaSepTypeValueListContext(_ctx, _parentState);
		CommaSepTypeValueListContext _prevctx = _localctx;
		int _startState = 728;
		enterRecursionRule(_localctx, 728, RULE_commaSepTypeValueList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3681);
			typeValue();
			}
			_ctx.stop = _input.LT(-1);
			setState(3688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaSepTypeValueListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_commaSepTypeValueList);
					setState(3683);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3684);
					match(COMMA);
					setState(3685);
					typeValue();
					}
					} 
				}
				setState(3690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeValueContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TypeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeValue; }
	}

	public final TypeValueContext typeValue() throws RecognitionException {
		TypeValueContext _localctx = new TypeValueContext(_ctx, getState());
		enterRule(_localctx, 730, RULE_typeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3691);
			llvmType(0);
			setState(3692);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConstsContext extends ParserRuleContext {
		public TypeConstListContext typeConstList() {
			return getRuleContext(TypeConstListContext.class,0);
		}
		public TypeConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConsts; }
	}

	public final TypeConstsContext typeConsts() throws RecognitionException {
		TypeConstsContext _localctx = new TypeConstsContext(_ctx, getState());
		enterRule(_localctx, 732, RULE_typeConsts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LBRACK) | (1L << LBRACE))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || _la==LABEL || _la==METADATA || _la==PPC_FP128 || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (TOKEN - 351)) | (1L << (VOID - 351)) | (1L << (X86_FP80 - 351)) | (1L << (X86_MMX - 351)))) != 0) || _la==INT_TYPE || _la==LOCAL_IDENT) {
				{
				setState(3694);
				typeConstList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConstListContext extends ParserRuleContext {
		public TypeConstContext typeConst() {
			return getRuleContext(TypeConstContext.class,0);
		}
		public TypeConstListContext typeConstList() {
			return getRuleContext(TypeConstListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public TypeConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstList; }
	}

	public final TypeConstListContext typeConstList() throws RecognitionException {
		return typeConstList(0);
	}

	private TypeConstListContext typeConstList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeConstListContext _localctx = new TypeConstListContext(_ctx, _parentState);
		TypeConstListContext _prevctx = _localctx;
		int _startState = 734;
		enterRecursionRule(_localctx, 734, RULE_typeConstList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3698);
			typeConst();
			}
			_ctx.stop = _input.LT(-1);
			setState(3705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeConstListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeConstList);
					setState(3700);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3701);
					match(COMMA);
					setState(3702);
					typeConst();
					}
					} 
				}
				setState(3707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeConstContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TypeConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConst; }
	}

	public final TypeConstContext typeConst() throws RecognitionException {
		TypeConstContext _localctx = new TypeConstContext(_ctx, getState());
		enterRule(_localctx, 736, RULE_typeConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3708);
			llvmType(0);
			setState(3709);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode ALIGN() { return getToken(LLVMParser.ALIGN, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 738, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3711);
			match(ALIGN);
			setState(3712);
			match(INT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocSizeContext extends ParserRuleContext {
		public TerminalNode ALLOCSIZE() { return getToken(LLVMParser.ALLOCSIZE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public List<TerminalNode> INT_LIT() { return getTokens(LLVMParser.INT_LIT); }
		public TerminalNode INT_LIT(int i) {
			return getToken(LLVMParser.INT_LIT, i);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public AllocSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocSize; }
	}

	public final AllocSizeContext allocSize() throws RecognitionException {
		AllocSizeContext _localctx = new AllocSizeContext(_ctx, getState());
		enterRule(_localctx, 740, RULE_allocSize);
		try {
			setState(3724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3714);
				match(ALLOCSIZE);
				setState(3715);
				match(LPAREN);
				setState(3716);
				match(INT_LIT);
				setState(3717);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3718);
				match(ALLOCSIZE);
				setState(3719);
				match(LPAREN);
				setState(3720);
				match(INT_LIT);
				setState(3721);
				match(COMMA);
				setState(3722);
				match(INT_LIT);
				setState(3723);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode DOTS() { return getToken(LLVMParser.DOTS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 742, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(3726);
				match(DOTS);
				}
				break;
			case 2:
				{
				setState(3727);
				argList(0);
				}
				break;
			case 3:
				{
				setState(3728);
				argList(0);
				setState(3729);
				match(COMMA);
				setState(3730);
				match(DOTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		return argList(0);
	}

	private ArgListContext argList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgListContext _localctx = new ArgListContext(_ctx, _parentState);
		ArgListContext _prevctx = _localctx;
		int _startState = 744;
		enterRecursionRule(_localctx, 744, RULE_argList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3735);
			arg();
			}
			_ctx.stop = _input.LT(-1);
			setState(3742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argList);
					setState(3737);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3738);
					match(COMMA);
					setState(3739);
					arg();
					}
					} 
				}
				setState(3744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public ParamAttrsContext paramAttrs() {
			return getRuleContext(ParamAttrsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LLVMParser.STAR, 0); }
		public ConcreteNonRecTypeContext concreteNonRecType() {
			return getRuleContext(ConcreteNonRecTypeContext.class,0);
		}
		public MetadataTypeContext metadataType() {
			return getRuleContext(MetadataTypeContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 746, RULE_arg);
		try {
			setState(3758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(3745);
					llvmType(0);
					setState(3746);
					optAddrSpace();
					setState(3747);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(3749);
					concreteNonRecType();
					}
					break;
				}
				setState(3752);
				paramAttrs();
				setState(3753);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3755);
				metadataType();
				setState(3756);
				metadata();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicOrderingContext extends ParserRuleContext {
		public TerminalNode ACQ_REL() { return getToken(LLVMParser.ACQ_REL, 0); }
		public TerminalNode ACQUIRE() { return getToken(LLVMParser.ACQUIRE, 0); }
		public TerminalNode MONOTONIC() { return getToken(LLVMParser.MONOTONIC, 0); }
		public TerminalNode RELEASE() { return getToken(LLVMParser.RELEASE, 0); }
		public TerminalNode SEQ_CST() { return getToken(LLVMParser.SEQ_CST, 0); }
		public TerminalNode UNORDERED() { return getToken(LLVMParser.UNORDERED, 0); }
		public AtomicOrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicOrdering; }
	}

	public final AtomicOrderingContext atomicOrdering() throws RecognitionException {
		AtomicOrderingContext _localctx = new AtomicOrderingContext(_ctx, getState());
		enterRule(_localctx, 748, RULE_atomicOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3760);
			_la = _input.LA(1);
			if ( !(_la==ACQ_REL || _la==ACQUIRE || _la==MONOTONIC || _la==RELEASE || _la==SEQ_CST || _la==UNORDERED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptCallingConvContext extends ParserRuleContext {
		public CallingConvContext callingConv() {
			return getRuleContext(CallingConvContext.class,0);
		}
		public OptCallingConvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optCallingConv; }
	}

	public final OptCallingConvContext optCallingConv() throws RecognitionException {
		OptCallingConvContext _localctx = new OptCallingConvContext(_ctx, getState());
		enterRule(_localctx, 750, RULE_optCallingConv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AMDGPU_CS - 28)) | (1L << (AMDGPU_ES - 28)) | (1L << (AMDGPU_GS - 28)) | (1L << (AMDGPU_HS - 28)) | (1L << (AMDGPU_KERNEL - 28)) | (1L << (AMDGPU_LS - 28)) | (1L << (AMDGPU_PS - 28)) | (1L << (AMDGPU_VS - 28)) | (1L << (ANYREGCC - 28)) | (1L << (ARM_AAPCSCC - 28)) | (1L << (ARM_AAPCS_VFPCC - 28)) | (1L << (ARM_APCSCC - 28)) | (1L << (AVR_INTRCC - 28)) | (1L << (AVR_SIGNALCC - 28)) | (1L << (CC - 28)) | (1L << (CCC - 28)) | (1L << (COLDCC - 28)) | (1L << (CXX_FAST_TLSCC - 28)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (FASTCC - 150)) | (1L << (GHCCC - 150)) | (1L << (HHVMCC - 150)) | (1L << (HHVM_CCC - 150)) | (1L << (INTEL_OCL_BICC - 150)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (MSP430_INTRCC - 232)) | (1L << (PRESERVE_ALLCC - 232)) | (1L << (PRESERVE_MOSTCC - 232)) | (1L << (PTX_DEVICE - 232)) | (1L << (PTX_KERNEL - 232)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (SPIR_FUNC - 326)) | (1L << (SPIR_KERNEL - 326)) | (1L << (SWIFTCC - 326)) | (1L << (WEBKIT_JSCC - 326)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (WIN64CC - 390)) | (1L << (X86_64_SYSVCC - 390)) | (1L << (X86_FASTCALLCC - 390)) | (1L << (X86_INTRCC - 390)) | (1L << (X86_REGCALLCC - 390)) | (1L << (X86_STDCALLCC - 390)) | (1L << (X86_THISCALLCC - 390)) | (1L << (X86_VECTORCALLCC - 390)))) != 0)) {
				{
				setState(3762);
				callingConv();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallingConvContext extends ParserRuleContext {
		public TerminalNode AMDGPU_CS() { return getToken(LLVMParser.AMDGPU_CS, 0); }
		public TerminalNode AMDGPU_ES() { return getToken(LLVMParser.AMDGPU_ES, 0); }
		public TerminalNode AMDGPU_GS() { return getToken(LLVMParser.AMDGPU_GS, 0); }
		public TerminalNode AMDGPU_HS() { return getToken(LLVMParser.AMDGPU_HS, 0); }
		public TerminalNode AMDGPU_KERNEL() { return getToken(LLVMParser.AMDGPU_KERNEL, 0); }
		public TerminalNode AMDGPU_LS() { return getToken(LLVMParser.AMDGPU_LS, 0); }
		public TerminalNode AMDGPU_PS() { return getToken(LLVMParser.AMDGPU_PS, 0); }
		public TerminalNode AMDGPU_VS() { return getToken(LLVMParser.AMDGPU_VS, 0); }
		public TerminalNode ANYREGCC() { return getToken(LLVMParser.ANYREGCC, 0); }
		public TerminalNode ARM_AAPCS_VFPCC() { return getToken(LLVMParser.ARM_AAPCS_VFPCC, 0); }
		public TerminalNode ARM_AAPCSCC() { return getToken(LLVMParser.ARM_AAPCSCC, 0); }
		public TerminalNode ARM_APCSCC() { return getToken(LLVMParser.ARM_APCSCC, 0); }
		public TerminalNode AVR_INTRCC() { return getToken(LLVMParser.AVR_INTRCC, 0); }
		public TerminalNode AVR_SIGNALCC() { return getToken(LLVMParser.AVR_SIGNALCC, 0); }
		public TerminalNode CCC() { return getToken(LLVMParser.CCC, 0); }
		public TerminalNode COLDCC() { return getToken(LLVMParser.COLDCC, 0); }
		public TerminalNode CXX_FAST_TLSCC() { return getToken(LLVMParser.CXX_FAST_TLSCC, 0); }
		public TerminalNode FASTCC() { return getToken(LLVMParser.FASTCC, 0); }
		public TerminalNode GHCCC() { return getToken(LLVMParser.GHCCC, 0); }
		public TerminalNode HHVM_CCC() { return getToken(LLVMParser.HHVM_CCC, 0); }
		public TerminalNode HHVMCC() { return getToken(LLVMParser.HHVMCC, 0); }
		public TerminalNode INTEL_OCL_BICC() { return getToken(LLVMParser.INTEL_OCL_BICC, 0); }
		public TerminalNode MSP430_INTRCC() { return getToken(LLVMParser.MSP430_INTRCC, 0); }
		public TerminalNode PRESERVE_ALLCC() { return getToken(LLVMParser.PRESERVE_ALLCC, 0); }
		public TerminalNode PRESERVE_MOSTCC() { return getToken(LLVMParser.PRESERVE_MOSTCC, 0); }
		public TerminalNode PTX_DEVICE() { return getToken(LLVMParser.PTX_DEVICE, 0); }
		public TerminalNode PTX_KERNEL() { return getToken(LLVMParser.PTX_KERNEL, 0); }
		public TerminalNode SPIR_FUNC() { return getToken(LLVMParser.SPIR_FUNC, 0); }
		public TerminalNode SPIR_KERNEL() { return getToken(LLVMParser.SPIR_KERNEL, 0); }
		public TerminalNode SWIFTCC() { return getToken(LLVMParser.SWIFTCC, 0); }
		public TerminalNode WEBKIT_JSCC() { return getToken(LLVMParser.WEBKIT_JSCC, 0); }
		public TerminalNode WIN64CC() { return getToken(LLVMParser.WIN64CC, 0); }
		public TerminalNode X86_64_SYSVCC() { return getToken(LLVMParser.X86_64_SYSVCC, 0); }
		public TerminalNode X86_FASTCALLCC() { return getToken(LLVMParser.X86_FASTCALLCC, 0); }
		public TerminalNode X86_INTRCC() { return getToken(LLVMParser.X86_INTRCC, 0); }
		public TerminalNode X86_REGCALLCC() { return getToken(LLVMParser.X86_REGCALLCC, 0); }
		public TerminalNode X86_STDCALLCC() { return getToken(LLVMParser.X86_STDCALLCC, 0); }
		public TerminalNode X86_THISCALLCC() { return getToken(LLVMParser.X86_THISCALLCC, 0); }
		public TerminalNode X86_VECTORCALLCC() { return getToken(LLVMParser.X86_VECTORCALLCC, 0); }
		public TerminalNode CC() { return getToken(LLVMParser.CC, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public CallingConvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConv; }
	}

	public final CallingConvContext callingConv() throws RecognitionException {
		CallingConvContext _localctx = new CallingConvContext(_ctx, getState());
		enterRule(_localctx, 752, RULE_callingConv);
		try {
			setState(3806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMDGPU_CS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3765);
				match(AMDGPU_CS);
				}
				break;
			case AMDGPU_ES:
				enterOuterAlt(_localctx, 2);
				{
				setState(3766);
				match(AMDGPU_ES);
				}
				break;
			case AMDGPU_GS:
				enterOuterAlt(_localctx, 3);
				{
				setState(3767);
				match(AMDGPU_GS);
				}
				break;
			case AMDGPU_HS:
				enterOuterAlt(_localctx, 4);
				{
				setState(3768);
				match(AMDGPU_HS);
				}
				break;
			case AMDGPU_KERNEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(3769);
				match(AMDGPU_KERNEL);
				}
				break;
			case AMDGPU_LS:
				enterOuterAlt(_localctx, 6);
				{
				setState(3770);
				match(AMDGPU_LS);
				}
				break;
			case AMDGPU_PS:
				enterOuterAlt(_localctx, 7);
				{
				setState(3771);
				match(AMDGPU_PS);
				}
				break;
			case AMDGPU_VS:
				enterOuterAlt(_localctx, 8);
				{
				setState(3772);
				match(AMDGPU_VS);
				}
				break;
			case ANYREGCC:
				enterOuterAlt(_localctx, 9);
				{
				setState(3773);
				match(ANYREGCC);
				}
				break;
			case ARM_AAPCS_VFPCC:
				enterOuterAlt(_localctx, 10);
				{
				setState(3774);
				match(ARM_AAPCS_VFPCC);
				}
				break;
			case ARM_AAPCSCC:
				enterOuterAlt(_localctx, 11);
				{
				setState(3775);
				match(ARM_AAPCSCC);
				}
				break;
			case ARM_APCSCC:
				enterOuterAlt(_localctx, 12);
				{
				setState(3776);
				match(ARM_APCSCC);
				}
				break;
			case AVR_INTRCC:
				enterOuterAlt(_localctx, 13);
				{
				setState(3777);
				match(AVR_INTRCC);
				}
				break;
			case AVR_SIGNALCC:
				enterOuterAlt(_localctx, 14);
				{
				setState(3778);
				match(AVR_SIGNALCC);
				}
				break;
			case CCC:
				enterOuterAlt(_localctx, 15);
				{
				setState(3779);
				match(CCC);
				}
				break;
			case COLDCC:
				enterOuterAlt(_localctx, 16);
				{
				setState(3780);
				match(COLDCC);
				}
				break;
			case CXX_FAST_TLSCC:
				enterOuterAlt(_localctx, 17);
				{
				setState(3781);
				match(CXX_FAST_TLSCC);
				}
				break;
			case FASTCC:
				enterOuterAlt(_localctx, 18);
				{
				setState(3782);
				match(FASTCC);
				}
				break;
			case GHCCC:
				enterOuterAlt(_localctx, 19);
				{
				setState(3783);
				match(GHCCC);
				}
				break;
			case HHVM_CCC:
				enterOuterAlt(_localctx, 20);
				{
				setState(3784);
				match(HHVM_CCC);
				}
				break;
			case HHVMCC:
				enterOuterAlt(_localctx, 21);
				{
				setState(3785);
				match(HHVMCC);
				}
				break;
			case INTEL_OCL_BICC:
				enterOuterAlt(_localctx, 22);
				{
				setState(3786);
				match(INTEL_OCL_BICC);
				}
				break;
			case MSP430_INTRCC:
				enterOuterAlt(_localctx, 23);
				{
				setState(3787);
				match(MSP430_INTRCC);
				}
				break;
			case PRESERVE_ALLCC:
				enterOuterAlt(_localctx, 24);
				{
				setState(3788);
				match(PRESERVE_ALLCC);
				}
				break;
			case PRESERVE_MOSTCC:
				enterOuterAlt(_localctx, 25);
				{
				setState(3789);
				match(PRESERVE_MOSTCC);
				}
				break;
			case PTX_DEVICE:
				enterOuterAlt(_localctx, 26);
				{
				setState(3790);
				match(PTX_DEVICE);
				}
				break;
			case PTX_KERNEL:
				enterOuterAlt(_localctx, 27);
				{
				setState(3791);
				match(PTX_KERNEL);
				}
				break;
			case SPIR_FUNC:
				enterOuterAlt(_localctx, 28);
				{
				setState(3792);
				match(SPIR_FUNC);
				}
				break;
			case SPIR_KERNEL:
				enterOuterAlt(_localctx, 29);
				{
				setState(3793);
				match(SPIR_KERNEL);
				}
				break;
			case SWIFTCC:
				enterOuterAlt(_localctx, 30);
				{
				setState(3794);
				match(SWIFTCC);
				}
				break;
			case WEBKIT_JSCC:
				enterOuterAlt(_localctx, 31);
				{
				setState(3795);
				match(WEBKIT_JSCC);
				}
				break;
			case WIN64CC:
				enterOuterAlt(_localctx, 32);
				{
				setState(3796);
				match(WIN64CC);
				}
				break;
			case X86_64_SYSVCC:
				enterOuterAlt(_localctx, 33);
				{
				setState(3797);
				match(X86_64_SYSVCC);
				}
				break;
			case X86_FASTCALLCC:
				enterOuterAlt(_localctx, 34);
				{
				setState(3798);
				match(X86_FASTCALLCC);
				}
				break;
			case X86_INTRCC:
				enterOuterAlt(_localctx, 35);
				{
				setState(3799);
				match(X86_INTRCC);
				}
				break;
			case X86_REGCALLCC:
				enterOuterAlt(_localctx, 36);
				{
				setState(3800);
				match(X86_REGCALLCC);
				}
				break;
			case X86_STDCALLCC:
				enterOuterAlt(_localctx, 37);
				{
				setState(3801);
				match(X86_STDCALLCC);
				}
				break;
			case X86_THISCALLCC:
				enterOuterAlt(_localctx, 38);
				{
				setState(3802);
				match(X86_THISCALLCC);
				}
				break;
			case X86_VECTORCALLCC:
				enterOuterAlt(_localctx, 39);
				{
				setState(3803);
				match(X86_VECTORCALLCC);
				}
				break;
			case CC:
				enterOuterAlt(_localctx, 40);
				{
				setState(3804);
				match(CC);
				setState(3805);
				match(INT_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptComdatContext extends ParserRuleContext {
		public ComdatContext comdat() {
			return getRuleContext(ComdatContext.class,0);
		}
		public OptComdatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optComdat; }
	}

	public final OptComdatContext optComdat() throws RecognitionException {
		OptComdatContext _localctx = new OptComdatContext(_ctx, getState());
		enterRule(_localctx, 754, RULE_optComdat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(3808);
				comdat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComdatContext extends ParserRuleContext {
		public TerminalNode COMDAT() { return getToken(LLVMParser.COMDAT, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public ComdatNameContext comdatName() {
			return getRuleContext(ComdatNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ComdatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comdat; }
	}

	public final ComdatContext comdat() throws RecognitionException {
		ComdatContext _localctx = new ComdatContext(_ctx, getState());
		enterRule(_localctx, 756, RULE_comdat);
		try {
			setState(3817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3811);
				match(COMDAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3812);
				match(COMDAT);
				setState(3813);
				match(LPAREN);
				setState(3814);
				comdatName();
				setState(3815);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DereferenceableContext extends ParserRuleContext {
		public TerminalNode DEREFERENCEABLE() { return getToken(LLVMParser.DEREFERENCEABLE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public TerminalNode DEREFERENCEABLE_OR_NULL() { return getToken(LLVMParser.DEREFERENCEABLE_OR_NULL, 0); }
		public DereferenceableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereferenceable; }
	}

	public final DereferenceableContext dereferenceable() throws RecognitionException {
		DereferenceableContext _localctx = new DereferenceableContext(_ctx, getState());
		enterRule(_localctx, 758, RULE_dereferenceable);
		try {
			setState(3827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEREFERENCEABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3819);
				match(DEREFERENCEABLE);
				setState(3820);
				match(LPAREN);
				setState(3821);
				match(INT_LIT);
				setState(3822);
				match(RPAREN);
				}
				break;
			case DEREFERENCEABLE_OR_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3823);
				match(DEREFERENCEABLE_OR_NULL);
				setState(3824);
				match(LPAREN);
				setState(3825);
				match(INT_LIT);
				setState(3826);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptDLLStorageClassContext extends ParserRuleContext {
		public DllStorageClassContext dllStorageClass() {
			return getRuleContext(DllStorageClassContext.class,0);
		}
		public OptDLLStorageClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optDLLStorageClass; }
	}

	public final OptDLLStorageClassContext optDLLStorageClass() throws RecognitionException {
		OptDLLStorageClassContext _localctx = new OptDLLStorageClassContext(_ctx, getState());
		enterRule(_localctx, 760, RULE_optDLLStorageClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLLEXPORT || _la==DLLIMPORT) {
				{
				setState(3829);
				dllStorageClass();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DllStorageClassContext extends ParserRuleContext {
		public TerminalNode DLLEXPORT() { return getToken(LLVMParser.DLLEXPORT, 0); }
		public TerminalNode DLLIMPORT() { return getToken(LLVMParser.DLLIMPORT, 0); }
		public DllStorageClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dllStorageClass; }
	}

	public final DllStorageClassContext dllStorageClass() throws RecognitionException {
		DllStorageClassContext _localctx = new DllStorageClassContext(_ctx, getState());
		enterRule(_localctx, 762, RULE_dllStorageClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3832);
			_la = _input.LA(1);
			if ( !(_la==DLLEXPORT || _la==DLLIMPORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptExactContext extends ParserRuleContext {
		public TerminalNode EXACT() { return getToken(LLVMParser.EXACT, 0); }
		public OptExactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optExact; }
	}

	public final OptExactContext optExact() throws RecognitionException {
		OptExactContext _localctx = new OptExactContext(_ctx, getState());
		enterRule(_localctx, 764, RULE_optExact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXACT) {
				{
				setState(3834);
				match(EXACT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionArgsContext extends ParserRuleContext {
		public ExceptionArgListContext exceptionArgList() {
			return getRuleContext(ExceptionArgListContext.class,0);
		}
		public ExceptionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionArgs; }
	}

	public final ExceptionArgsContext exceptionArgs() throws RecognitionException {
		ExceptionArgsContext _localctx = new ExceptionArgsContext(_ctx, getState());
		enterRule(_localctx, 766, RULE_exceptionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LBRACK) | (1L << LBRACE))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (DOUBLE - 126)) | (1L << (FLOAT - 126)) | (1L << (FP128 - 126)) | (1L << (HALF - 126)))) != 0) || _la==LABEL || _la==METADATA || _la==PPC_FP128 || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (TOKEN - 351)) | (1L << (VOID - 351)) | (1L << (X86_FP80 - 351)) | (1L << (X86_MMX - 351)))) != 0) || _la==INT_TYPE || _la==LOCAL_IDENT) {
				{
				setState(3837);
				exceptionArgList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionArgListContext extends ParserRuleContext {
		public ExceptionArgContext exceptionArg() {
			return getRuleContext(ExceptionArgContext.class,0);
		}
		public ExceptionArgListContext exceptionArgList() {
			return getRuleContext(ExceptionArgListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ExceptionArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionArgList; }
	}

	public final ExceptionArgListContext exceptionArgList() throws RecognitionException {
		return exceptionArgList(0);
	}

	private ExceptionArgListContext exceptionArgList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExceptionArgListContext _localctx = new ExceptionArgListContext(_ctx, _parentState);
		ExceptionArgListContext _prevctx = _localctx;
		int _startState = 768;
		enterRecursionRule(_localctx, 768, RULE_exceptionArgList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3841);
			exceptionArg();
			}
			_ctx.stop = _input.LT(-1);
			setState(3848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExceptionArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exceptionArgList);
					setState(3843);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3844);
					match(COMMA);
					setState(3845);
					exceptionArg();
					}
					} 
				}
				setState(3850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExceptionArgContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public OptAddrSpaceContext optAddrSpace() {
			return getRuleContext(OptAddrSpaceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LLVMParser.STAR, 0); }
		public ConcreteNonRecTypeContext concreteNonRecType() {
			return getRuleContext(ConcreteNonRecTypeContext.class,0);
		}
		public MetadataTypeContext metadataType() {
			return getRuleContext(MetadataTypeContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ExceptionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionArg; }
	}

	public final ExceptionArgContext exceptionArg() throws RecognitionException {
		ExceptionArgContext _localctx = new ExceptionArgContext(_ctx, getState());
		enterRule(_localctx, 770, RULE_exceptionArg);
		try {
			setState(3863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(3851);
					llvmType(0);
					setState(3852);
					optAddrSpace();
					setState(3853);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(3855);
					concreteNonRecType();
					}
					break;
				}
				setState(3858);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3860);
				metadataType();
				setState(3861);
				metadata();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionScopeContext extends ParserRuleContext {
		public NoneConstContext noneConst() {
			return getRuleContext(NoneConstContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public ExceptionScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionScope; }
	}

	public final ExceptionScopeContext exceptionScope() throws RecognitionException {
		ExceptionScopeContext _localctx = new ExceptionScopeContext(_ctx, getState());
		enterRule(_localctx, 772, RULE_exceptionScope);
		try {
			setState(3867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3865);
				noneConst();
				}
				break;
			case LOCAL_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3866);
				localIdent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FastMathFlagsContext extends ParserRuleContext {
		public FastMathFlagListContext fastMathFlagList() {
			return getRuleContext(FastMathFlagListContext.class,0);
		}
		public FastMathFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fastMathFlags; }
	}

	public final FastMathFlagsContext fastMathFlags() throws RecognitionException {
		FastMathFlagsContext _localctx = new FastMathFlagsContext(_ctx, getState());
		enterRule(_localctx, 774, RULE_fastMathFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFN || _la==ARCP || _la==CONTRACT || _la==FAST || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (NINF - 240)) | (1L << (NNAN - 240)) | (1L << (NSZ - 240)) | (1L << (REASSOC - 240)))) != 0)) {
				{
				setState(3869);
				fastMathFlagList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FastMathFlagListContext extends ParserRuleContext {
		public FastMathFlagContext fastMathFlag() {
			return getRuleContext(FastMathFlagContext.class,0);
		}
		public FastMathFlagListContext fastMathFlagList() {
			return getRuleContext(FastMathFlagListContext.class,0);
		}
		public FastMathFlagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fastMathFlagList; }
	}

	public final FastMathFlagListContext fastMathFlagList() throws RecognitionException {
		return fastMathFlagList(0);
	}

	private FastMathFlagListContext fastMathFlagList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FastMathFlagListContext _localctx = new FastMathFlagListContext(_ctx, _parentState);
		FastMathFlagListContext _prevctx = _localctx;
		int _startState = 776;
		enterRecursionRule(_localctx, 776, RULE_fastMathFlagList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3873);
			fastMathFlag();
			}
			_ctx.stop = _input.LT(-1);
			setState(3879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FastMathFlagListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fastMathFlagList);
					setState(3875);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3876);
					fastMathFlag();
					}
					} 
				}
				setState(3881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FastMathFlagContext extends ParserRuleContext {
		public TerminalNode AFN() { return getToken(LLVMParser.AFN, 0); }
		public TerminalNode ARCP() { return getToken(LLVMParser.ARCP, 0); }
		public TerminalNode CONTRACT() { return getToken(LLVMParser.CONTRACT, 0); }
		public TerminalNode FAST() { return getToken(LLVMParser.FAST, 0); }
		public TerminalNode NINF() { return getToken(LLVMParser.NINF, 0); }
		public TerminalNode NNAN() { return getToken(LLVMParser.NNAN, 0); }
		public TerminalNode NSZ() { return getToken(LLVMParser.NSZ, 0); }
		public TerminalNode REASSOC() { return getToken(LLVMParser.REASSOC, 0); }
		public FastMathFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fastMathFlag; }
	}

	public final FastMathFlagContext fastMathFlag() throws RecognitionException {
		FastMathFlagContext _localctx = new FastMathFlagContext(_ctx, getState());
		enterRule(_localctx, 778, RULE_fastMathFlag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3882);
			_la = _input.LA(1);
			if ( !(_la==AFN || _la==ARCP || _la==CONTRACT || _la==FAST || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (NINF - 240)) | (1L << (NNAN - 240)) | (1L << (NSZ - 240)) | (1L << (REASSOC - 240)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpredContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(LLVMParser.FALSE, 0); }
		public TerminalNode OEQ() { return getToken(LLVMParser.OEQ, 0); }
		public TerminalNode OGE() { return getToken(LLVMParser.OGE, 0); }
		public TerminalNode OGT() { return getToken(LLVMParser.OGT, 0); }
		public TerminalNode OLE() { return getToken(LLVMParser.OLE, 0); }
		public TerminalNode OLT() { return getToken(LLVMParser.OLT, 0); }
		public TerminalNode ONE() { return getToken(LLVMParser.ONE, 0); }
		public TerminalNode ORD() { return getToken(LLVMParser.ORD, 0); }
		public TerminalNode TRUE() { return getToken(LLVMParser.TRUE, 0); }
		public TerminalNode UEQ() { return getToken(LLVMParser.UEQ, 0); }
		public TerminalNode UGE() { return getToken(LLVMParser.UGE, 0); }
		public TerminalNode UGT() { return getToken(LLVMParser.UGT, 0); }
		public TerminalNode ULE() { return getToken(LLVMParser.ULE, 0); }
		public TerminalNode ULT() { return getToken(LLVMParser.ULT, 0); }
		public TerminalNode UNE() { return getToken(LLVMParser.UNE, 0); }
		public TerminalNode UNO() { return getToken(LLVMParser.UNO, 0); }
		public FpredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpred; }
	}

	public final FpredContext fpred() throws RecognitionException {
		FpredContext _localctx = new FpredContext(_ctx, getState());
		enterRule(_localctx, 780, RULE_fpred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3884);
			_la = _input.LA(1);
			if ( !(_la==FALSE || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (OEQ - 263)) | (1L << (OGE - 263)) | (1L << (OGT - 263)) | (1L << (OLE - 263)) | (1L << (OLT - 263)) | (1L << (ONE - 263)) | (1L << (ORD - 263)))) != 0) || ((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (TRUE - 353)) | (1L << (UEQ - 353)) | (1L << (UGE - 353)) | (1L << (UGT - 353)) | (1L << (ULE - 353)) | (1L << (ULT - 353)) | (1L << (UNE - 353)) | (1L << (UNO - 353)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncAttrsContext extends ParserRuleContext {
		public FuncAttrListContext funcAttrList() {
			return getRuleContext(FuncAttrListContext.class,0);
		}
		public FuncAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAttrs; }
	}

	public final FuncAttrsContext funcAttrs() throws RecognitionException {
		FuncAttrsContext _localctx = new FuncAttrsContext(_ctx, getState());
		enterRule(_localctx, 782, RULE_funcAttrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(3886);
				funcAttrList(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncAttrListContext extends ParserRuleContext {
		public FuncAttrContext funcAttr() {
			return getRuleContext(FuncAttrContext.class,0);
		}
		public FuncAttrListContext funcAttrList() {
			return getRuleContext(FuncAttrListContext.class,0);
		}
		public FuncAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAttrList; }
	}

	public final FuncAttrListContext funcAttrList() throws RecognitionException {
		return funcAttrList(0);
	}

	private FuncAttrListContext funcAttrList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FuncAttrListContext _localctx = new FuncAttrListContext(_ctx, _parentState);
		FuncAttrListContext _prevctx = _localctx;
		int _startState = 784;
		enterRecursionRule(_localctx, 784, RULE_funcAttrList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3890);
			funcAttr();
			}
			_ctx.stop = _input.LT(-1);
			setState(3896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncAttrListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcAttrList);
					setState(3892);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3893);
					funcAttr();
					}
					} 
				}
				setState(3898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncAttrContext extends ParserRuleContext {
		public AttrGroupIDContext attrGroupID() {
			return getRuleContext(AttrGroupIDContext.class,0);
		}
		public TerminalNode ALIGN() { return getToken(LLVMParser.ALIGN, 0); }
		public TerminalNode EQSIGN() { return getToken(LLVMParser.EQSIGN, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode ALIGNSTACK() { return getToken(LLVMParser.ALIGNSTACK, 0); }
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public AllocSizeContext allocSize() {
			return getRuleContext(AllocSizeContext.class,0);
		}
		public StackAlignmentContext stackAlignment() {
			return getRuleContext(StackAlignmentContext.class,0);
		}
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode ALWAYSINLINE() { return getToken(LLVMParser.ALWAYSINLINE, 0); }
		public TerminalNode ARGMEMONLY() { return getToken(LLVMParser.ARGMEMONLY, 0); }
		public TerminalNode BUILTIN() { return getToken(LLVMParser.BUILTIN, 0); }
		public TerminalNode COLD() { return getToken(LLVMParser.COLD, 0); }
		public TerminalNode CONVERGENT() { return getToken(LLVMParser.CONVERGENT, 0); }
		public TerminalNode INACCESSIBLEMEM_OR_ARGMEMONLY() { return getToken(LLVMParser.INACCESSIBLEMEM_OR_ARGMEMONLY, 0); }
		public TerminalNode INACCESSIBLEMEMONLY() { return getToken(LLVMParser.INACCESSIBLEMEMONLY, 0); }
		public TerminalNode INLINEHINT() { return getToken(LLVMParser.INLINEHINT, 0); }
		public TerminalNode JUMPTABLE() { return getToken(LLVMParser.JUMPTABLE, 0); }
		public TerminalNode MINSIZE() { return getToken(LLVMParser.MINSIZE, 0); }
		public TerminalNode NAKED() { return getToken(LLVMParser.NAKED, 0); }
		public TerminalNode NOBUILTIN() { return getToken(LLVMParser.NOBUILTIN, 0); }
		public TerminalNode NODUPLICATE() { return getToken(LLVMParser.NODUPLICATE, 0); }
		public TerminalNode NOIMPLICITFLOAT() { return getToken(LLVMParser.NOIMPLICITFLOAT, 0); }
		public TerminalNode NOINLINE() { return getToken(LLVMParser.NOINLINE, 0); }
		public TerminalNode NONLAZYBIND() { return getToken(LLVMParser.NONLAZYBIND, 0); }
		public TerminalNode NORECURSE() { return getToken(LLVMParser.NORECURSE, 0); }
		public TerminalNode NOREDZONE() { return getToken(LLVMParser.NOREDZONE, 0); }
		public TerminalNode NORETURN() { return getToken(LLVMParser.NORETURN, 0); }
		public TerminalNode NOUNWIND() { return getToken(LLVMParser.NOUNWIND, 0); }
		public TerminalNode OPTNONE() { return getToken(LLVMParser.OPTNONE, 0); }
		public TerminalNode OPTSIZE() { return getToken(LLVMParser.OPTSIZE, 0); }
		public TerminalNode READNONE() { return getToken(LLVMParser.READNONE, 0); }
		public TerminalNode READONLY() { return getToken(LLVMParser.READONLY, 0); }
		public TerminalNode RETURNS_TWICE() { return getToken(LLVMParser.RETURNS_TWICE, 0); }
		public TerminalNode SAFESTACK() { return getToken(LLVMParser.SAFESTACK, 0); }
		public TerminalNode SANITIZE_ADDRESS() { return getToken(LLVMParser.SANITIZE_ADDRESS, 0); }
		public TerminalNode SANITIZE_HWADDRESS() { return getToken(LLVMParser.SANITIZE_HWADDRESS, 0); }
		public TerminalNode SANITIZE_MEMORY() { return getToken(LLVMParser.SANITIZE_MEMORY, 0); }
		public TerminalNode SANITIZE_THREAD() { return getToken(LLVMParser.SANITIZE_THREAD, 0); }
		public TerminalNode SPECULATABLE() { return getToken(LLVMParser.SPECULATABLE, 0); }
		public TerminalNode SSP() { return getToken(LLVMParser.SSP, 0); }
		public TerminalNode SSPREQ() { return getToken(LLVMParser.SSPREQ, 0); }
		public TerminalNode SSPSTRONG() { return getToken(LLVMParser.SSPSTRONG, 0); }
		public TerminalNode STRICTFP() { return getToken(LLVMParser.STRICTFP, 0); }
		public TerminalNode UWTABLE() { return getToken(LLVMParser.UWTABLE, 0); }
		public TerminalNode WRITEONLY() { return getToken(LLVMParser.WRITEONLY, 0); }
		public FuncAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAttr; }
	}

	public final FuncAttrContext funcAttr() throws RecognitionException {
		FuncAttrContext _localctx = new FuncAttrContext(_ctx, getState());
		enterRule(_localctx, 786, RULE_funcAttr);
		try {
			setState(3951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3899);
				attrGroupID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3900);
				match(ALIGN);
				setState(3901);
				match(EQSIGN);
				setState(3902);
				match(INT_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3903);
				match(ALIGNSTACK);
				setState(3904);
				match(EQSIGN);
				setState(3905);
				match(INT_LIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3906);
				alignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3907);
				allocSize();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3908);
				stackAlignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3909);
				stringLit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3910);
				stringLit();
				setState(3911);
				match(EQSIGN);
				setState(3912);
				stringLit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3914);
				match(ALWAYSINLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3915);
				match(ARGMEMONLY);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3916);
				match(BUILTIN);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3917);
				match(COLD);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3918);
				match(CONVERGENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3919);
				match(INACCESSIBLEMEM_OR_ARGMEMONLY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3920);
				match(INACCESSIBLEMEMONLY);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3921);
				match(INLINEHINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3922);
				match(JUMPTABLE);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3923);
				match(MINSIZE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3924);
				match(NAKED);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3925);
				match(NOBUILTIN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3926);
				match(NODUPLICATE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3927);
				match(NOIMPLICITFLOAT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3928);
				match(NOINLINE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3929);
				match(NONLAZYBIND);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3930);
				match(NORECURSE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3931);
				match(NOREDZONE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3932);
				match(NORETURN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3933);
				match(NOUNWIND);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3934);
				match(OPTNONE);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3935);
				match(OPTSIZE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3936);
				match(READNONE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3937);
				match(READONLY);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3938);
				match(RETURNS_TWICE);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3939);
				match(SAFESTACK);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3940);
				match(SANITIZE_ADDRESS);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3941);
				match(SANITIZE_HWADDRESS);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3942);
				match(SANITIZE_MEMORY);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3943);
				match(SANITIZE_THREAD);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3944);
				match(SPECULATABLE);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3945);
				match(SSP);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(3946);
				match(SSPREQ);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(3947);
				match(SSPSTRONG);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(3948);
				match(STRICTFP);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(3949);
				match(UWTABLE);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(3950);
				match(WRITEONLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptInBoundsContext extends ParserRuleContext {
		public TerminalNode INBOUNDS() { return getToken(LLVMParser.INBOUNDS, 0); }
		public OptInBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optInBounds; }
	}

	public final OptInBoundsContext optInBounds() throws RecognitionException {
		OptInBoundsContext _localctx = new OptInBoundsContext(_ctx, getState());
		enterRule(_localctx, 788, RULE_optInBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INBOUNDS) {
				{
				setState(3953);
				match(INBOUNDS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndicesContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public IndicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indices; }
	}

	public final IndicesContext indices() throws RecognitionException {
		IndicesContext _localctx = new IndicesContext(_ctx, getState());
		enterRule(_localctx, 790, RULE_indices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(3956);
				match(COMMA);
				setState(3957);
				indexList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexListContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		return indexList(0);
	}

	private IndexListContext indexList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IndexListContext _localctx = new IndexListContext(_ctx, _parentState);
		IndexListContext _prevctx = _localctx;
		int _startState = 792;
		enterRecursionRule(_localctx, 792, RULE_indexList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3961);
			index();
			}
			_ctx.stop = _input.LT(-1);
			setState(3968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IndexListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_indexList);
					setState(3963);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3964);
					match(COMMA);
					setState(3965);
					index();
					}
					} 
				}
				setState(3970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 794, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3971);
			match(INT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IPredContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LLVMParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LLVMParser.NE, 0); }
		public TerminalNode SGE() { return getToken(LLVMParser.SGE, 0); }
		public TerminalNode SGT() { return getToken(LLVMParser.SGT, 0); }
		public TerminalNode SLE() { return getToken(LLVMParser.SLE, 0); }
		public TerminalNode SLT() { return getToken(LLVMParser.SLT, 0); }
		public TerminalNode UGE() { return getToken(LLVMParser.UGE, 0); }
		public TerminalNode UGT() { return getToken(LLVMParser.UGT, 0); }
		public TerminalNode ULE() { return getToken(LLVMParser.ULE, 0); }
		public TerminalNode ULT() { return getToken(LLVMParser.ULT, 0); }
		public IPredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iPred; }
	}

	public final IPredContext iPred() throws RecognitionException {
		IPredContext _localctx = new IPredContext(_ctx, getState());
		enterRule(_localctx, 796, RULE_iPred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3973);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NE || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (SGE - 314)) | (1L << (SGT - 314)) | (1L << (SLE - 314)) | (1L << (SLT - 314)) | (1L << (UGE - 314)) | (1L << (UGT - 314)) | (1L << (ULE - 314)) | (1L << (ULT - 314)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptLinkageContext extends ParserRuleContext {
		public LinkageContext linkage() {
			return getRuleContext(LinkageContext.class,0);
		}
		public OptLinkageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optLinkage; }
	}

	public final OptLinkageContext optLinkage() throws RecognitionException {
		OptLinkageContext _localctx = new OptLinkageContext(_ctx, getState());
		enterRule(_localctx, 798, RULE_optLinkage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (APPENDING - 39)) | (1L << (AVAILABLE_EXTERNALLY - 39)) | (1L << (COMMON - 39)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (INTERNAL - 201)) | (1L << (LINKONCE - 201)) | (1L << (LINKONCE_ODR - 201)))) != 0) || _la==PRIVATE || _la==WEAK || _la==WEAK_ODR) {
				{
				setState(3975);
				linkage();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkageContext extends ParserRuleContext {
		public TerminalNode APPENDING() { return getToken(LLVMParser.APPENDING, 0); }
		public TerminalNode AVAILABLE_EXTERNALLY() { return getToken(LLVMParser.AVAILABLE_EXTERNALLY, 0); }
		public TerminalNode COMMON() { return getToken(LLVMParser.COMMON, 0); }
		public TerminalNode INTERNAL() { return getToken(LLVMParser.INTERNAL, 0); }
		public TerminalNode LINKONCE() { return getToken(LLVMParser.LINKONCE, 0); }
		public TerminalNode LINKONCE_ODR() { return getToken(LLVMParser.LINKONCE_ODR, 0); }
		public TerminalNode PRIVATE() { return getToken(LLVMParser.PRIVATE, 0); }
		public TerminalNode WEAK() { return getToken(LLVMParser.WEAK, 0); }
		public TerminalNode WEAK_ODR() { return getToken(LLVMParser.WEAK_ODR, 0); }
		public LinkageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage; }
	}

	public final LinkageContext linkage() throws RecognitionException {
		LinkageContext _localctx = new LinkageContext(_ctx, getState());
		enterRule(_localctx, 800, RULE_linkage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3978);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (APPENDING - 39)) | (1L << (AVAILABLE_EXTERNALLY - 39)) | (1L << (COMMON - 39)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (INTERNAL - 201)) | (1L << (LINKONCE - 201)) | (1L << (LINKONCE_ODR - 201)))) != 0) || _la==PRIVATE || _la==WEAK || _la==WEAK_ODR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptExternLinkageContext extends ParserRuleContext {
		public ExternLinkageContext externLinkage() {
			return getRuleContext(ExternLinkageContext.class,0);
		}
		public OptExternLinkageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optExternLinkage; }
	}

	public final OptExternLinkageContext optExternLinkage() throws RecognitionException {
		OptExternLinkageContext _localctx = new OptExternLinkageContext(_ctx, getState());
		enterRule(_localctx, 802, RULE_optExternLinkage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL || _la==EXTERN_WEAK) {
				{
				setState(3980);
				externLinkage();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternLinkageContext extends ParserRuleContext {
		public TerminalNode EXTERN_WEAK() { return getToken(LLVMParser.EXTERN_WEAK, 0); }
		public TerminalNode EXTERNAL() { return getToken(LLVMParser.EXTERNAL, 0); }
		public ExternLinkageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externLinkage; }
	}

	public final ExternLinkageContext externLinkage() throws RecognitionException {
		ExternLinkageContext _localctx = new ExternLinkageContext(_ctx, getState());
		enterRule(_localctx, 804, RULE_externLinkage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3983);
			_la = _input.LA(1);
			if ( !(_la==EXTERNAL || _la==EXTERN_WEAK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandBundlesContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LLVMParser.LBRACK, 0); }
		public OperandBundleListContext operandBundleList() {
			return getRuleContext(OperandBundleListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LLVMParser.RBRACK, 0); }
		public OperandBundlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandBundles; }
	}

	public final OperandBundlesContext operandBundles() throws RecognitionException {
		OperandBundlesContext _localctx = new OperandBundlesContext(_ctx, getState());
		enterRule(_localctx, 806, RULE_operandBundles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(3985);
				match(LBRACK);
				setState(3986);
				operandBundleList(0);
				setState(3987);
				match(RBRACK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandBundleListContext extends ParserRuleContext {
		public OperandBundleContext operandBundle() {
			return getRuleContext(OperandBundleContext.class,0);
		}
		public OperandBundleListContext operandBundleList() {
			return getRuleContext(OperandBundleListContext.class,0);
		}
		public OperandBundleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandBundleList; }
	}

	public final OperandBundleListContext operandBundleList() throws RecognitionException {
		return operandBundleList(0);
	}

	private OperandBundleListContext operandBundleList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperandBundleListContext _localctx = new OperandBundleListContext(_ctx, _parentState);
		OperandBundleListContext _prevctx = _localctx;
		int _startState = 808;
		enterRecursionRule(_localctx, 808, RULE_operandBundleList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3992);
			operandBundle();
			}
			_ctx.stop = _input.LT(-1);
			setState(3998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperandBundleListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operandBundleList);
					setState(3994);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3995);
					operandBundle();
					}
					} 
				}
				setState(4000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperandBundleContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TypeValuesContext typeValues() {
			return getRuleContext(TypeValuesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public OperandBundleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandBundle; }
	}

	public final OperandBundleContext operandBundle() throws RecognitionException {
		OperandBundleContext _localctx = new OperandBundleContext(_ctx, getState());
		enterRule(_localctx, 810, RULE_operandBundle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4001);
			stringLit();
			setState(4002);
			match(LPAREN);
			setState(4003);
			typeValues();
			setState(4004);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverflowFlagsContext extends ParserRuleContext {
		public OverflowFlagListContext overflowFlagList() {
			return getRuleContext(OverflowFlagListContext.class,0);
		}
		public OverflowFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overflowFlags; }
	}

	public final OverflowFlagsContext overflowFlags() throws RecognitionException {
		OverflowFlagsContext _localctx = new OverflowFlagsContext(_ctx, getState());
		enterRule(_localctx, 812, RULE_overflowFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NSW || _la==NUW) {
				{
				setState(4006);
				overflowFlagList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverflowFlagListContext extends ParserRuleContext {
		public OverflowFlagContext overflowFlag() {
			return getRuleContext(OverflowFlagContext.class,0);
		}
		public OverflowFlagListContext overflowFlagList() {
			return getRuleContext(OverflowFlagListContext.class,0);
		}
		public OverflowFlagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overflowFlagList; }
	}

	public final OverflowFlagListContext overflowFlagList() throws RecognitionException {
		return overflowFlagList(0);
	}

	private OverflowFlagListContext overflowFlagList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OverflowFlagListContext _localctx = new OverflowFlagListContext(_ctx, _parentState);
		OverflowFlagListContext _prevctx = _localctx;
		int _startState = 814;
		enterRecursionRule(_localctx, 814, RULE_overflowFlagList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(4010);
			overflowFlag();
			}
			_ctx.stop = _input.LT(-1);
			setState(4016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OverflowFlagListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_overflowFlagList);
					setState(4012);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(4013);
					overflowFlag();
					}
					} 
				}
				setState(4018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OverflowFlagContext extends ParserRuleContext {
		public TerminalNode NSW() { return getToken(LLVMParser.NSW, 0); }
		public TerminalNode NUW() { return getToken(LLVMParser.NUW, 0); }
		public OverflowFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overflowFlag; }
	}

	public final OverflowFlagContext overflowFlag() throws RecognitionException {
		OverflowFlagContext _localctx = new OverflowFlagContext(_ctx, getState());
		enterRule(_localctx, 816, RULE_overflowFlag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4019);
			_la = _input.LA(1);
			if ( !(_la==NSW || _la==NUW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamAttrsContext extends ParserRuleContext {
		public ParamAttrListContext paramAttrList() {
			return getRuleContext(ParamAttrListContext.class,0);
		}
		public ParamAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramAttrs; }
	}

	public final ParamAttrsContext paramAttrs() throws RecognitionException {
		ParamAttrsContext _localctx = new ParamAttrsContext(_ctx, getState());
		enterRule(_localctx, 818, RULE_paramAttrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(4021);
				paramAttrList(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamAttrListContext extends ParserRuleContext {
		public ParamAttrContext paramAttr() {
			return getRuleContext(ParamAttrContext.class,0);
		}
		public ParamAttrListContext paramAttrList() {
			return getRuleContext(ParamAttrListContext.class,0);
		}
		public ParamAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramAttrList; }
	}

	public final ParamAttrListContext paramAttrList() throws RecognitionException {
		return paramAttrList(0);
	}

	private ParamAttrListContext paramAttrList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamAttrListContext _localctx = new ParamAttrListContext(_ctx, _parentState);
		ParamAttrListContext _prevctx = _localctx;
		int _startState = 820;
		enterRecursionRule(_localctx, 820, RULE_paramAttrList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(4025);
			paramAttr();
			}
			_ctx.stop = _input.LT(-1);
			setState(4031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamAttrListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramAttrList);
					setState(4027);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(4028);
					paramAttr();
					}
					} 
				}
				setState(4033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamAttrContext extends ParserRuleContext {
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public DereferenceableContext dereferenceable() {
			return getRuleContext(DereferenceableContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(LLVMParser.BYVAL, 0); }
		public TerminalNode INALLOCA() { return getToken(LLVMParser.INALLOCA, 0); }
		public TerminalNode INREG() { return getToken(LLVMParser.INREG, 0); }
		public TerminalNode NEST() { return getToken(LLVMParser.NEST, 0); }
		public TerminalNode NOALIAS() { return getToken(LLVMParser.NOALIAS, 0); }
		public TerminalNode NOCAPTURE() { return getToken(LLVMParser.NOCAPTURE, 0); }
		public TerminalNode NONNULL() { return getToken(LLVMParser.NONNULL, 0); }
		public TerminalNode READNONE() { return getToken(LLVMParser.READNONE, 0); }
		public TerminalNode READONLY() { return getToken(LLVMParser.READONLY, 0); }
		public TerminalNode RETURNED() { return getToken(LLVMParser.RETURNED, 0); }
		public TerminalNode SIGNEXT() { return getToken(LLVMParser.SIGNEXT, 0); }
		public TerminalNode SRET() { return getToken(LLVMParser.SRET, 0); }
		public TerminalNode SWIFTERROR() { return getToken(LLVMParser.SWIFTERROR, 0); }
		public TerminalNode SWIFTSELF() { return getToken(LLVMParser.SWIFTSELF, 0); }
		public TerminalNode WRITEONLY() { return getToken(LLVMParser.WRITEONLY, 0); }
		public TerminalNode ZEROEXT() { return getToken(LLVMParser.ZEROEXT, 0); }
		public ParamAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramAttr; }
	}

	public final ParamAttrContext paramAttr() throws RecognitionException {
		ParamAttrContext _localctx = new ParamAttrContext(_ctx, getState());
		enterRule(_localctx, 822, RULE_paramAttr);
		try {
			setState(4053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(4034);
				alignment();
				}
				break;
			case DEREFERENCEABLE:
			case DEREFERENCEABLE_OR_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(4035);
				dereferenceable();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(4036);
				stringLit();
				}
				break;
			case BYVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(4037);
				match(BYVAL);
				}
				break;
			case INALLOCA:
				enterOuterAlt(_localctx, 5);
				{
				setState(4038);
				match(INALLOCA);
				}
				break;
			case INREG:
				enterOuterAlt(_localctx, 6);
				{
				setState(4039);
				match(INREG);
				}
				break;
			case NEST:
				enterOuterAlt(_localctx, 7);
				{
				setState(4040);
				match(NEST);
				}
				break;
			case NOALIAS:
				enterOuterAlt(_localctx, 8);
				{
				setState(4041);
				match(NOALIAS);
				}
				break;
			case NOCAPTURE:
				enterOuterAlt(_localctx, 9);
				{
				setState(4042);
				match(NOCAPTURE);
				}
				break;
			case NONNULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(4043);
				match(NONNULL);
				}
				break;
			case READNONE:
				enterOuterAlt(_localctx, 11);
				{
				setState(4044);
				match(READNONE);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 12);
				{
				setState(4045);
				match(READONLY);
				}
				break;
			case RETURNED:
				enterOuterAlt(_localctx, 13);
				{
				setState(4046);
				match(RETURNED);
				}
				break;
			case SIGNEXT:
				enterOuterAlt(_localctx, 14);
				{
				setState(4047);
				match(SIGNEXT);
				}
				break;
			case SRET:
				enterOuterAlt(_localctx, 15);
				{
				setState(4048);
				match(SRET);
				}
				break;
			case SWIFTERROR:
				enterOuterAlt(_localctx, 16);
				{
				setState(4049);
				match(SWIFTERROR);
				}
				break;
			case SWIFTSELF:
				enterOuterAlt(_localctx, 17);
				{
				setState(4050);
				match(SWIFTSELF);
				}
				break;
			case WRITEONLY:
				enterOuterAlt(_localctx, 18);
				{
				setState(4051);
				match(WRITEONLY);
				}
				break;
			case ZEROEXT:
				enterOuterAlt(_localctx, 19);
				{
				setState(4052);
				match(ZEROEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode DOTS() { return getToken(LLVMParser.DOTS, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 824, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(4055);
				match(DOTS);
				}
				break;
			case 2:
				{
				setState(4056);
				paramList(0);
				}
				break;
			case 3:
				{
				setState(4057);
				paramList(0);
				setState(4058);
				match(COMMA);
				setState(4059);
				match(DOTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LLVMParser.COMMA, 0); }
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		return paramList(0);
	}

	private ParamListContext paramList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamListContext _localctx = new ParamListContext(_ctx, _parentState);
		ParamListContext _prevctx = _localctx;
		int _startState = 826;
		enterRecursionRule(_localctx, 826, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(4064);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(4071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(4066);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(4067);
					match(COMMA);
					setState(4068);
					param();
					}
					} 
				}
				setState(4073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public LlvmTypeContext llvmType() {
			return getRuleContext(LlvmTypeContext.class,0);
		}
		public ParamAttrsContext paramAttrs() {
			return getRuleContext(ParamAttrsContext.class,0);
		}
		public LocalIdentContext localIdent() {
			return getRuleContext(LocalIdentContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 828, RULE_param);
		try {
			setState(4081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4074);
				llvmType(0);
				setState(4075);
				paramAttrs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4077);
				llvmType(0);
				setState(4078);
				paramAttrs();
				setState(4079);
				localIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptPreemptionSpecifierContext extends ParserRuleContext {
		public PreemptionSpecifierContext preemptionSpecifier() {
			return getRuleContext(PreemptionSpecifierContext.class,0);
		}
		public OptPreemptionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optPreemptionSpecifier; }
	}

	public final OptPreemptionSpecifierContext optPreemptionSpecifier() throws RecognitionException {
		OptPreemptionSpecifierContext _localctx = new OptPreemptionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 830, RULE_optPreemptionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DSO_LOCAL || _la==DSO_PREEMPTABLE) {
				{
				setState(4083);
				preemptionSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreemptionSpecifierContext extends ParserRuleContext {
		public TerminalNode DSO_LOCAL() { return getToken(LLVMParser.DSO_LOCAL, 0); }
		public TerminalNode DSO_PREEMPTABLE() { return getToken(LLVMParser.DSO_PREEMPTABLE, 0); }
		public PreemptionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preemptionSpecifier; }
	}

	public final PreemptionSpecifierContext preemptionSpecifier() throws RecognitionException {
		PreemptionSpecifierContext _localctx = new PreemptionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 832, RULE_preemptionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4086);
			_la = _input.LA(1);
			if ( !(_la==DSO_LOCAL || _la==DSO_PREEMPTABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnAttrsContext extends ParserRuleContext {
		public ReturnAttrListContext returnAttrList() {
			return getRuleContext(ReturnAttrListContext.class,0);
		}
		public ReturnAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAttrs; }
	}

	public final ReturnAttrsContext returnAttrs() throws RecognitionException {
		ReturnAttrsContext _localctx = new ReturnAttrsContext(_ctx, getState());
		enterRule(_localctx, 834, RULE_returnAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIGN || _la==DEREFERENCEABLE || _la==DEREFERENCEABLE_OR_NULL || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (INREG - 196)) | (1L << (NOALIAS - 196)) | (1L << (NONNULL - 196)))) != 0) || _la==SIGNEXT || _la==ZEROEXT || _la==STRING_LIT) {
				{
				setState(4088);
				returnAttrList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnAttrListContext extends ParserRuleContext {
		public ReturnAttrContext returnAttr() {
			return getRuleContext(ReturnAttrContext.class,0);
		}
		public ReturnAttrListContext returnAttrList() {
			return getRuleContext(ReturnAttrListContext.class,0);
		}
		public ReturnAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAttrList; }
	}

	public final ReturnAttrListContext returnAttrList() throws RecognitionException {
		return returnAttrList(0);
	}

	private ReturnAttrListContext returnAttrList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReturnAttrListContext _localctx = new ReturnAttrListContext(_ctx, _parentState);
		ReturnAttrListContext _prevctx = _localctx;
		int _startState = 836;
		enterRecursionRule(_localctx, 836, RULE_returnAttrList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(4092);
			returnAttr();
			}
			_ctx.stop = _input.LT(-1);
			setState(4098);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReturnAttrListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_returnAttrList);
					setState(4094);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(4095);
					returnAttr();
					}
					} 
				}
				setState(4100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnAttrContext extends ParserRuleContext {
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public DereferenceableContext dereferenceable() {
			return getRuleContext(DereferenceableContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode INREG() { return getToken(LLVMParser.INREG, 0); }
		public TerminalNode NOALIAS() { return getToken(LLVMParser.NOALIAS, 0); }
		public TerminalNode NONNULL() { return getToken(LLVMParser.NONNULL, 0); }
		public TerminalNode SIGNEXT() { return getToken(LLVMParser.SIGNEXT, 0); }
		public TerminalNode ZEROEXT() { return getToken(LLVMParser.ZEROEXT, 0); }
		public ReturnAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAttr; }
	}

	public final ReturnAttrContext returnAttr() throws RecognitionException {
		ReturnAttrContext _localctx = new ReturnAttrContext(_ctx, getState());
		enterRule(_localctx, 838, RULE_returnAttr);
		try {
			setState(4109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(4101);
				alignment();
				}
				break;
			case DEREFERENCEABLE:
			case DEREFERENCEABLE_OR_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(4102);
				dereferenceable();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(4103);
				stringLit();
				}
				break;
			case INREG:
				enterOuterAlt(_localctx, 4);
				{
				setState(4104);
				match(INREG);
				}
				break;
			case NOALIAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(4105);
				match(NOALIAS);
				}
				break;
			case NONNULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(4106);
				match(NONNULL);
				}
				break;
			case SIGNEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(4107);
				match(SIGNEXT);
				}
				break;
			case ZEROEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(4108);
				match(ZEROEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LLVMParser.SECTION, 0); }
		public TerminalNode STRING_LIT() { return getToken(LLVMParser.STRING_LIT, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 840, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4111);
			match(SECTION);
			setState(4112);
			match(STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackAlignmentContext extends ParserRuleContext {
		public TerminalNode ALIGNSTACK() { return getToken(LLVMParser.ALIGNSTACK, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TerminalNode INT_LIT() { return getToken(LLVMParser.INT_LIT, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public StackAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackAlignment; }
	}

	public final StackAlignmentContext stackAlignment() throws RecognitionException {
		StackAlignmentContext _localctx = new StackAlignmentContext(_ctx, getState());
		enterRule(_localctx, 842, RULE_stackAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4114);
			match(ALIGNSTACK);
			setState(4115);
			match(LPAREN);
			setState(4116);
			match(INT_LIT);
			setState(4117);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptSyncScopeContext extends ParserRuleContext {
		public TerminalNode SYNCSCOPE() { return getToken(LLVMParser.SYNCSCOPE, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TerminalNode STRING_LIT() { return getToken(LLVMParser.STRING_LIT, 0); }
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public OptSyncScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optSyncScope; }
	}

	public final OptSyncScopeContext optSyncScope() throws RecognitionException {
		OptSyncScopeContext _localctx = new OptSyncScopeContext(_ctx, getState());
		enterRule(_localctx, 844, RULE_optSyncScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYNCSCOPE) {
				{
				setState(4119);
				match(SYNCSCOPE);
				setState(4120);
				match(LPAREN);
				setState(4121);
				match(STRING_LIT);
				setState(4122);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThreadLocalContext extends ParserRuleContext {
		public TerminalNode THREAD_LOCAL() { return getToken(LLVMParser.THREAD_LOCAL, 0); }
		public TerminalNode LPAREN() { return getToken(LLVMParser.LPAREN, 0); }
		public TlsModelContext tlsModel() {
			return getRuleContext(TlsModelContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LLVMParser.RPAREN, 0); }
		public ThreadLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threadLocal; }
	}

	public final ThreadLocalContext threadLocal() throws RecognitionException {
		ThreadLocalContext _localctx = new ThreadLocalContext(_ctx, getState());
		enterRule(_localctx, 846, RULE_threadLocal);
		try {
			setState(4131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4125);
				match(THREAD_LOCAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4126);
				match(THREAD_LOCAL);
				setState(4127);
				match(LPAREN);
				setState(4128);
				tlsModel();
				setState(4129);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TlsModelContext extends ParserRuleContext {
		public TerminalNode INITIALEXEC() { return getToken(LLVMParser.INITIALEXEC, 0); }
		public TerminalNode LOCALDYNAMIC() { return getToken(LLVMParser.LOCALDYNAMIC, 0); }
		public TerminalNode LOCALEXEC() { return getToken(LLVMParser.LOCALEXEC, 0); }
		public TlsModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tlsModel; }
	}

	public final TlsModelContext tlsModel() throws RecognitionException {
		TlsModelContext _localctx = new TlsModelContext(_ctx, getState());
		enterRule(_localctx, 848, RULE_tlsModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4133);
			_la = _input.LA(1);
			if ( !(((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (INITIALEXEC - 192)) | (1L << (LOCALDYNAMIC - 192)) | (1L << (LOCALEXEC - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedAddrContext extends ParserRuleContext {
		public TerminalNode LOCAL_UNNAMED_ADDR() { return getToken(LLVMParser.LOCAL_UNNAMED_ADDR, 0); }
		public TerminalNode UNNAMED_ADDR() { return getToken(LLVMParser.UNNAMED_ADDR, 0); }
		public UnnamedAddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedAddr; }
	}

	public final UnnamedAddrContext unnamedAddr() throws RecognitionException {
		UnnamedAddrContext _localctx = new UnnamedAddrContext(_ctx, getState());
		enterRule(_localctx, 850, RULE_unnamedAddr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4135);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_UNNAMED_ADDR || _la==UNNAMED_ADDR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(LLVMParser.DEFAULT, 0); }
		public TerminalNode HIDDEN_VISIB() { return getToken(LLVMParser.HIDDEN_VISIB, 0); }
		public TerminalNode PROTECTED() { return getToken(LLVMParser.PROTECTED, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 852, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4137);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==HIDDEN_VISIB || _la==PROTECTED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return topLevelEntityList_sempred((TopLevelEntityListContext)_localctx, predIndex);
		case 16:
			return globalAttrList_sempred((GlobalAttrListContext)_localctx, predIndex);
		case 31:
			return metadataNodeList_sempred((MetadataNodeListContext)_localctx, predIndex);
		case 36:
			return useListOrderList_sempred((UseListOrderListContext)_localctx, predIndex);
		case 46:
			return llvmType_sempred((LlvmTypeContext)_localctx, predIndex);
		case 61:
			return typeList_sempred((TypeListContext)_localctx, predIndex);
		case 111:
			return gepConstIndexList_sempred((GepConstIndexListContext)_localctx, predIndex);
		case 130:
			return basicBlockList_sempred((BasicBlockListContext)_localctx, predIndex);
		case 134:
			return instructionList_sempred((InstructionListContext)_localctx, predIndex);
		case 187:
			return incList_sempred((IncListContext)_localctx, predIndex);
		case 196:
			return clauseList_sempred((ClauseListContext)_localctx, predIndex);
		case 206:
			return caseList_sempred((CaseListContext)_localctx, predIndex);
		case 209:
			return labelList_sempred((LabelListContext)_localctx, predIndex);
		case 220:
			return mdFieldList_sempred((MdFieldListContext)_localctx, predIndex);
		case 227:
			return metadataAttachmentList_sempred((MetadataAttachmentListContext)_localctx, predIndex);
		case 229:
			return commaSepMetadataAttachmentList_sempred((CommaSepMetadataAttachmentListContext)_localctx, predIndex);
		case 233:
			return diCompileUnitFieldList_sempred((DiCompileUnitFieldListContext)_localctx, predIndex);
		case 237:
			return diFileFieldList_sempred((DiFileFieldListContext)_localctx, predIndex);
		case 241:
			return diBasicTypeFieldList_sempred((DiBasicTypeFieldListContext)_localctx, predIndex);
		case 245:
			return diSubroutineTypeFieldList_sempred((DiSubroutineTypeFieldListContext)_localctx, predIndex);
		case 249:
			return diDerivedTypeFieldList_sempred((DiDerivedTypeFieldListContext)_localctx, predIndex);
		case 253:
			return diCompositeTypeFieldList_sempred((DiCompositeTypeFieldListContext)_localctx, predIndex);
		case 257:
			return diSubrangeFieldList_sempred((DiSubrangeFieldListContext)_localctx, predIndex);
		case 261:
			return diEnumeratorFieldList_sempred((DiEnumeratorFieldListContext)_localctx, predIndex);
		case 265:
			return diTemplateTypeParameterFieldList_sempred((DiTemplateTypeParameterFieldListContext)_localctx, predIndex);
		case 269:
			return diTemplateValueParameterFieldList_sempred((DiTemplateValueParameterFieldListContext)_localctx, predIndex);
		case 273:
			return diModuleFieldList_sempred((DiModuleFieldListContext)_localctx, predIndex);
		case 277:
			return diNamespaceFieldList_sempred((DiNamespaceFieldListContext)_localctx, predIndex);
		case 281:
			return diGlobalVariableFieldList_sempred((DiGlobalVariableFieldListContext)_localctx, predIndex);
		case 285:
			return diSubprogramFieldList_sempred((DiSubprogramFieldListContext)_localctx, predIndex);
		case 289:
			return diLexicalBlockFieldList_sempred((DiLexicalBlockFieldListContext)_localctx, predIndex);
		case 293:
			return diLexicalBlockFileFieldList_sempred((DiLexicalBlockFileFieldListContext)_localctx, predIndex);
		case 297:
			return diLocationFieldList_sempred((DiLocationFieldListContext)_localctx, predIndex);
		case 301:
			return diLocalVariableFieldList_sempred((DiLocalVariableFieldListContext)_localctx, predIndex);
		case 305:
			return diExpressionFieldList_sempred((DiExpressionFieldListContext)_localctx, predIndex);
		case 309:
			return diGlobalVariableExpressionFieldList_sempred((DiGlobalVariableExpressionFieldListContext)_localctx, predIndex);
		case 313:
			return diObjCPropertyFieldList_sempred((DiObjCPropertyFieldListContext)_localctx, predIndex);
		case 317:
			return diImportedEntityFieldList_sempred((DiImportedEntityFieldListContext)_localctx, predIndex);
		case 321:
			return diMacroFieldList_sempred((DiMacroFieldListContext)_localctx, predIndex);
		case 325:
			return diMacroFileFieldList_sempred((DiMacroFileFieldListContext)_localctx, predIndex);
		case 329:
			return genericDINodeFieldList_sempred((GenericDINodeFieldListContext)_localctx, predIndex);
		case 352:
			return diFlagList_sempred((DiFlagListContext)_localctx, predIndex);
		case 363:
			return typeValueList_sempred((TypeValueListContext)_localctx, predIndex);
		case 364:
			return commaSepTypeValueList_sempred((CommaSepTypeValueListContext)_localctx, predIndex);
		case 367:
			return typeConstList_sempred((TypeConstListContext)_localctx, predIndex);
		case 372:
			return argList_sempred((ArgListContext)_localctx, predIndex);
		case 384:
			return exceptionArgList_sempred((ExceptionArgListContext)_localctx, predIndex);
		case 388:
			return fastMathFlagList_sempred((FastMathFlagListContext)_localctx, predIndex);
		case 392:
			return funcAttrList_sempred((FuncAttrListContext)_localctx, predIndex);
		case 396:
			return indexList_sempred((IndexListContext)_localctx, predIndex);
		case 404:
			return operandBundleList_sempred((OperandBundleListContext)_localctx, predIndex);
		case 407:
			return overflowFlagList_sempred((OverflowFlagListContext)_localctx, predIndex);
		case 410:
			return paramAttrList_sempred((ParamAttrListContext)_localctx, predIndex);
		case 413:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 418:
			return returnAttrList_sempred((ReturnAttrListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean topLevelEntityList_sempred(TopLevelEntityListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean globalAttrList_sempred(GlobalAttrListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean metadataNodeList_sempred(MetadataNodeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean useListOrderList_sempred(UseListOrderListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean llvmType_sempred(LlvmTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeList_sempred(TypeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean gepConstIndexList_sempred(GepConstIndexListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basicBlockList_sempred(BasicBlockListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instructionList_sempred(InstructionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean incList_sempred(IncListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean clauseList_sempred(ClauseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean caseList_sempred(CaseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean labelList_sempred(LabelListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mdFieldList_sempred(MdFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean metadataAttachmentList_sempred(MetadataAttachmentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean commaSepMetadataAttachmentList_sempred(CommaSepMetadataAttachmentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diCompileUnitFieldList_sempred(DiCompileUnitFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diFileFieldList_sempred(DiFileFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diBasicTypeFieldList_sempred(DiBasicTypeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diSubroutineTypeFieldList_sempred(DiSubroutineTypeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diDerivedTypeFieldList_sempred(DiDerivedTypeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diCompositeTypeFieldList_sempred(DiCompositeTypeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diSubrangeFieldList_sempred(DiSubrangeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diEnumeratorFieldList_sempred(DiEnumeratorFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diTemplateTypeParameterFieldList_sempred(DiTemplateTypeParameterFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diTemplateValueParameterFieldList_sempred(DiTemplateValueParameterFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diModuleFieldList_sempred(DiModuleFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diNamespaceFieldList_sempred(DiNamespaceFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diGlobalVariableFieldList_sempred(DiGlobalVariableFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diSubprogramFieldList_sempred(DiSubprogramFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diLexicalBlockFieldList_sempred(DiLexicalBlockFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diLexicalBlockFileFieldList_sempred(DiLexicalBlockFileFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diLocationFieldList_sempred(DiLocationFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diLocalVariableFieldList_sempred(DiLocalVariableFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diExpressionFieldList_sempred(DiExpressionFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diGlobalVariableExpressionFieldList_sempred(DiGlobalVariableExpressionFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diObjCPropertyFieldList_sempred(DiObjCPropertyFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diImportedEntityFieldList_sempred(DiImportedEntityFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diMacroFieldList_sempred(DiMacroFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diMacroFileFieldList_sempred(DiMacroFileFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean genericDINodeFieldList_sempred(GenericDINodeFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean diFlagList_sempred(DiFlagListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeValueList_sempred(TypeValueListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean commaSepTypeValueList_sempred(CommaSepTypeValueListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeConstList_sempred(TypeConstListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argList_sempred(ArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exceptionArgList_sempred(ExceptionArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fastMathFlagList_sempred(FastMathFlagListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean funcAttrList_sempred(FuncAttrListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean indexList_sempred(IndexListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operandBundleList_sempred(OperandBundleListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean overflowFlagList_sempred(OverflowFlagListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramAttrList_sempred(ParamAttrListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean returnAttrList_sempred(ReturnAttrListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01bf\u102e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119\t\u0119"+
		"\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d\4\u011e"+
		"\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122\t\u0122"+
		"\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126\4\u0127"+
		"\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b\t\u012b"+
		"\4\u012c\t\u012c\4\u012d\t\u012d\4\u012e\t\u012e\4\u012f\t\u012f\4\u0130"+
		"\t\u0130\4\u0131\t\u0131\4\u0132\t\u0132\4\u0133\t\u0133\4\u0134\t\u0134"+
		"\4\u0135\t\u0135\4\u0136\t\u0136\4\u0137\t\u0137\4\u0138\t\u0138\4\u0139"+
		"\t\u0139\4\u013a\t\u013a\4\u013b\t\u013b\4\u013c\t\u013c\4\u013d\t\u013d"+
		"\4\u013e\t\u013e\4\u013f\t\u013f\4\u0140\t\u0140\4\u0141\t\u0141\4\u0142"+
		"\t\u0142\4\u0143\t\u0143\4\u0144\t\u0144\4\u0145\t\u0145\4\u0146\t\u0146"+
		"\4\u0147\t\u0147\4\u0148\t\u0148\4\u0149\t\u0149\4\u014a\t\u014a\4\u014b"+
		"\t\u014b\4\u014c\t\u014c\4\u014d\t\u014d\4\u014e\t\u014e\4\u014f\t\u014f"+
		"\4\u0150\t\u0150\4\u0151\t\u0151\4\u0152\t\u0152\4\u0153\t\u0153\4\u0154"+
		"\t\u0154\4\u0155\t\u0155\4\u0156\t\u0156\4\u0157\t\u0157\4\u0158\t\u0158"+
		"\4\u0159\t\u0159\4\u015a\t\u015a\4\u015b\t\u015b\4\u015c\t\u015c\4\u015d"+
		"\t\u015d\4\u015e\t\u015e\4\u015f\t\u015f\4\u0160\t\u0160\4\u0161\t\u0161"+
		"\4\u0162\t\u0162\4\u0163\t\u0163\4\u0164\t\u0164\4\u0165\t\u0165\4\u0166"+
		"\t\u0166\4\u0167\t\u0167\4\u0168\t\u0168\4\u0169\t\u0169\4\u016a\t\u016a"+
		"\4\u016b\t\u016b\4\u016c\t\u016c\4\u016d\t\u016d\4\u016e\t\u016e\4\u016f"+
		"\t\u016f\4\u0170\t\u0170\4\u0171\t\u0171\4\u0172\t\u0172\4\u0173\t\u0173"+
		"\4\u0174\t\u0174\4\u0175\t\u0175\4\u0176\t\u0176\4\u0177\t\u0177\4\u0178"+
		"\t\u0178\4\u0179\t\u0179\4\u017a\t\u017a\4\u017b\t\u017b\4\u017c\t\u017c"+
		"\4\u017d\t\u017d\4\u017e\t\u017e\4\u017f\t\u017f\4\u0180\t\u0180\4\u0181"+
		"\t\u0181\4\u0182\t\u0182\4\u0183\t\u0183\4\u0184\t\u0184\4\u0185\t\u0185"+
		"\4\u0186\t\u0186\4\u0187\t\u0187\4\u0188\t\u0188\4\u0189\t\u0189\4\u018a"+
		"\t\u018a\4\u018b\t\u018b\4\u018c\t\u018c\4\u018d\t\u018d\4\u018e\t\u018e"+
		"\4\u018f\t\u018f\4\u0190\t\u0190\4\u0191\t\u0191\4\u0192\t\u0192\4\u0193"+
		"\t\u0193\4\u0194\t\u0194\4\u0195\t\u0195\4\u0196\t\u0196\4\u0197\t\u0197"+
		"\4\u0198\t\u0198\4\u0199\t\u0199\4\u019a\t\u019a\4\u019b\t\u019b\4\u019c"+
		"\t\u019c\4\u019d\t\u019d\4\u019e\t\u019e\4\u019f\t\u019f\4\u01a0\t\u01a0"+
		"\4\u01a1\t\u01a1\4\u01a2\t\u01a2\4\u01a3\t\u01a3\4\u01a4\t\u01a4\4\u01a5"+
		"\t\u01a5\4\u01a6\t\u01a6\4\u01a7\t\u01a7\4\u01a8\t\u01a8\4\u01a9\t\u01a9"+
		"\4\u01aa\t\u01aa\4\u01ab\t\u01ab\4\u01ac\t\u01ac\3\2\3\2\5\2\u035b\n\2"+
		"\3\3\3\3\3\4\5\4\u0360\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u0367\n\5\f\5\16\5"+
		"\u036a\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u037b\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0389"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0399"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u03a7\n"+
		"\r\3\r\3\r\5\r\u03ab\n\r\3\r\5\r\u03ae\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u03bc\n\16\3\16\3\16\5\16\u03c0\n\16\3"+
		"\16\5\16\u03c3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17"+
		"\u03ce\n\17\3\20\3\20\3\21\3\21\5\21\u03d4\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u03dc\n\22\f\22\16\22\u03df\13\22\3\23\3\23\3\23\3\23\5"+
		"\23\u03e5\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u03ec\n\24\3\24\3\24\5\24"+
		"\u03f0\n\24\3\24\5\24\u03f3\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0400\n\24\3\24\3\24\5\24\u0404\n\24\3\24\5\24"+
		"\u0407\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u040f\n\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u0420"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u042b\n\30\3\30"+
		"\3\30\5\30\u042f\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0439"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u043f\n\32\3\33\3\33\3\33\3\33\5\33\u0445"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u044b\n\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \5"+
		" \u0461\n \3!\3!\3!\3!\3!\3!\7!\u0469\n!\f!\16!\u046c\13!\3\"\3\"\5\""+
		"\u0470\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u047c\n#\3$\5$\u047f\n$\3"+
		"%\5%\u0482\n%\3&\3&\3&\3&\3&\7&\u0489\n&\f&\16&\u048c\13&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60\u04b1\n\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u04bc\n\60\f\60\16\60\u04bf\13\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04ca\n\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\5\67\u04d7\n\67\38\38\3"+
		"8\38\38\39\39\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0500\n>\3?\3?\3?\3?\3?\3"+
		"?\7?\u0508\n?\f?\16?\u050b\13?\3@\3@\3A\3A\3B\3B\3B\5B\u0514\nB\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3D\5D\u051f\nD\3E\5E\u0522\nE\3F\5F\u0525\nF\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0535\nG\3H\3H\3I\3I\3J\3J\3K"+
		"\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\5O\u0555\nO\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3U\3U\3V\3V"+
		"\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W"+
		"\u0597\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l"+
		"\3l\3l\3m\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o"+
		"\3o\3o\3o\3o\3o\3o\3o\3p\5p\u0681\np\3q\3q\3q\3q\3q\3q\7q\u0689\nq\fq"+
		"\16q\u068c\13q\3r\3r\3r\3r\3s\5s\u0693\ns\3t\3t\3t\3t\3t\3t\3t\3t\3u\3"+
		"u\3u\3u\3u\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3{\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\7\u0084\u0722\n\u0084\f\u0084\16\u0084\u0725\13\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0086\5\u0086\u072c\n\u0086\3\u0087\5\u0087"+
		"\u072f\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0736\n"+
		"\u0088\f\u0088\16\u0088\u0739\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0744\n\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0776\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u087e\n\u00a2"+
		"\3\u00a3\5\u00a3\u0881\n\u00a3\3\u00a4\5\u00a4\u0884\n\u00a4\3\u00a5\3"+
		"\u00a5\5\u00a5\u0888\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u0892\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u089f\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u08ac\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u08b8\n\u00a5\3\u00a6\3\u00a6\5\u00a6\u08bc\n\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u08c7\n"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u08d5\n\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u08e3\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u08f0\n\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u08fa\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\5\u00a9\u090a"+
		"\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u090e\n\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u092e\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u09a7\n\u00bd\f\u00bd"+
		"\16\u00bd\u09aa\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\5\u00c1"+
		"\u09cc\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\5\u00c4\u09dc"+
		"\n\u00c4\3\u00c5\5\u00c5\u09df\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\7\u00c6\u09e6\n\u00c6\f\u00c6\16\u00c6\u09e9\13\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09f3"+
		"\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u0a10\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a1c\n\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u0a21\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\5\u00cf\u0a3f\n\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0a46\n\u00d0\f\u00d0"+
		"\16\u00d0\u0a49\13\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0a60\n\u00d3"+
		"\f\u00d3\16\u00d3\u0a63\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u0aa0\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0aab\n\u00dd\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\7\u00de\u0ab3\n\u00de\f\u00de\16\u00de\u0ab6"+
		"\13\u00de\3\u00df\3\u00df\5\u00df\u0aba\n\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0ac3\n\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0ace"+
		"\n\u00e3\3\u00e4\5\u00e4\u0ad1\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\7\u00e5\u0ad8\n\u00e5\f\u00e5\16\u00e5\u0adb\13\u00e5\3\u00e6"+
		"\3\u00e6\5\u00e6\u0adf\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\7\u00e7\u0ae7\n\u00e7\f\u00e7\16\u00e7\u0aea\13\u00e7\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b05\n\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\5\u00ea\u0b0d\n\u00ea"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b15\n\u00eb"+
		"\f\u00eb\16\u00eb\u0b18\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\5\u00ec\u0b3a\n\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ee"+
		"\5\u00ee\u0b42\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\7\u00ef\u0b4a\n\u00ef\f\u00ef\16\u00ef\u0b4d\13\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b57\n\u00f0"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\5\u00f2\u0b5f\n\u00f2"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b67\n\u00f3"+
		"\f\u00f3\16\u00f3\u0b6a\13\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0b72\n\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f6\5\u00f6\u0b7a\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\7\u00f7\u0b82\n\u00f7\f\u00f7\16\u00f7\u0b85\13\u00f7\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f8\3\u00f8\5\u00f8\u0b8c\n\u00f8\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00fa\5\u00fa\u0b94\n\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u0b9c\n\u00fb\f\u00fb\16\u00fb"+
		"\u0b9f\13\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u0baf"+
		"\n\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fe\5\u00fe\u0bb7"+
		"\n\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\7\u00ff\u0bbf"+
		"\n\u00ff\f\u00ff\16\u00ff\u0bc2\13\u00ff\3\u0100\3\u0100\3\u0100\3\u0100"+
		"\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100"+
		"\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\5\u0100"+
		"\u0bd9\n\u0100\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0102\5\u0102"+
		"\u0be1\n\u0102\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\7\u0103"+
		"\u0be9\n\u0103\f\u0103\16\u0103\u0bec\13\u0103\3\u0104\3\u0104\3\u0104"+
		"\3\u0104\5\u0104\u0bf2\n\u0104\3\u0105\3\u0105\3\u0105\3\u0105\3\u0105"+
		"\3\u0106\5\u0106\u0bfa\n\u0106\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107"+
		"\3\u0107\7\u0107\u0c02\n\u0107\f\u0107\16\u0107\u0c05\13\u0107\3\u0108"+
		"\3\u0108\3\u0108\3\u0108\3\u0108\5\u0108\u0c0c\n\u0108\3\u0109\3\u0109"+
		"\3\u0109\3\u0109\3\u0109\3\u010a\5\u010a\u0c14\n\u010a\3\u010b\3\u010b"+
		"\3\u010b\3\u010b\3\u010b\3\u010b\7\u010b\u0c1c\n\u010b\f\u010b\16\u010b"+
		"\u0c1f\13\u010b\3\u010c\3\u010c\5\u010c\u0c23\n\u010c\3\u010d\3\u010d"+
		"\3\u010d\3\u010d\3\u010d\3\u010e\5\u010e\u0c2b\n\u010e\3\u010f\3\u010f"+
		"\3\u010f\3\u010f\3\u010f\3\u010f\7\u010f\u0c33\n\u010f\f\u010f\16\u010f"+
		"\u0c36\13\u010f\3\u0110\3\u0110\3\u0110\3\u0110\3\u0110\5\u0110\u0c3d"+
		"\n\u0110\3\u0111\3\u0111\3\u0111\3\u0111\3\u0111\3\u0112\5\u0112\u0c45"+
		"\n\u0112\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\7\u0113\u0c4d"+
		"\n\u0113\f\u0113\16\u0113\u0c50\13\u0113\3\u0114\3\u0114\3\u0114\3\u0114"+
		"\3\u0114\3\u0114\3\u0114\3\u0114\5\u0114\u0c5a\n\u0114\3\u0115\3\u0115"+
		"\3\u0115\3\u0115\3\u0115\3\u0116\5\u0116\u0c62\n\u0116\3\u0117\3\u0117"+
		"\3\u0117\3\u0117\3\u0117\3\u0117\7\u0117\u0c6a\n\u0117\f\u0117\16\u0117"+
		"\u0c6d\13\u0117\3\u0118\3\u0118\3\u0118\3\u0118\5\u0118\u0c73\n\u0118"+
		"\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u011a\5\u011a\u0c7b\n\u011a"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\7\u011b\u0c83\n\u011b"+
		"\f\u011b\16\u011b\u0c86\13\u011b\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c"+
		"\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\5\u011c\u0c92\n\u011c\3\u011d"+
		"\3\u011d\3\u011d\3\u011d\3\u011d\3\u011e\5\u011e\u0c9a\n\u011e\3\u011f"+
		"\3\u011f\3\u011f\3\u011f\3\u011f\3\u011f\7\u011f\u0ca2\n\u011f\f\u011f"+
		"\16\u011f\u0ca5\13\u011f\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120"+
		"\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120"+
		"\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120"+
		"\3\u0120\3\u0120\3\u0120\3\u0120\5\u0120\u0cc3\n\u0120\3\u0121\3\u0121"+
		"\3\u0121\3\u0121\3\u0121\3\u0122\5\u0122\u0ccb\n\u0122\3\u0123\3\u0123"+
		"\3\u0123\3\u0123\3\u0123\3\u0123\7\u0123\u0cd3\n\u0123\f\u0123\16\u0123"+
		"\u0cd6\13\u0123\3\u0124\3\u0124\3\u0124\3\u0124\5\u0124\u0cdc\n\u0124"+
		"\3\u0125\3\u0125\3\u0125\3\u0125\3\u0125\3\u0126\5\u0126\u0ce4\n\u0126"+
		"\3\u0127\3\u0127\3\u0127\3\u0127\3\u0127\3\u0127\7\u0127\u0cec\n\u0127"+
		"\f\u0127\16\u0127\u0cef\13\u0127\3\u0128\3\u0128\3\u0128\3\u0128\5\u0128"+
		"\u0cf5\n\u0128\3\u0129\3\u0129\3\u0129\3\u0129\3\u0129\3\u012a\5\u012a"+
		"\u0cfd\n\u012a\3\u012b\3\u012b\3\u012b\3\u012b\3\u012b\3\u012b\7\u012b"+
		"\u0d05\n\u012b\f\u012b\16\u012b\u0d08\13\u012b\3\u012c\3\u012c\3\u012c"+
		"\3\u012c\3\u012c\5\u012c\u0d0f\n\u012c\3\u012d\3\u012d\3\u012d\3\u012d"+
		"\3\u012d\3\u012e\5\u012e\u0d17\n\u012e\3\u012f\3\u012f\3\u012f\3\u012f"+
		"\3\u012f\3\u012f\7\u012f\u0d1f\n\u012f\f\u012f\16\u012f\u0d22\13\u012f"+
		"\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130"+
		"\5\u0130\u0d2d\n\u0130\3\u0131\3\u0131\3\u0131\3\u0131\3\u0131\3\u0132"+
		"\5\u0132\u0d35\n\u0132\3\u0133\3\u0133\3\u0133\3\u0133\3\u0133\3\u0133"+
		"\7\u0133\u0d3d\n\u0133\f\u0133\16\u0133\u0d40\13\u0133\3\u0134\3\u0134"+
		"\5\u0134\u0d44\n\u0134\3\u0135\3\u0135\3\u0135\3\u0135\3\u0135\3\u0136"+
		"\5\u0136\u0d4c\n\u0136\3\u0137\3\u0137\3\u0137\3\u0137\3\u0137\3\u0137"+
		"\7\u0137\u0d54\n\u0137\f\u0137\16\u0137\u0d57\13\u0137\3\u0138\3\u0138"+
		"\3\u0138\3\u0138\5\u0138\u0d5d\n\u0138\3\u0139\3\u0139\3\u0139\3\u0139"+
		"\3\u0139\3\u013a\5\u013a\u0d65\n\u013a\3\u013b\3\u013b\3\u013b\3\u013b"+
		"\3\u013b\3\u013b\7\u013b\u0d6d\n\u013b\f\u013b\16\u013b\u0d70\13\u013b"+
		"\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c"+
		"\3\u013c\5\u013c\u0d7c\n\u013c\3\u013d\3\u013d\3\u013d\3\u013d\3\u013d"+
		"\3\u013e\5\u013e\u0d84\n\u013e\3\u013f\3\u013f\3\u013f\3\u013f\3\u013f"+
		"\3\u013f\7\u013f\u0d8c\n\u013f\f\u013f\16\u013f\u0d8f\13\u013f\3\u0140"+
		"\3\u0140\3\u0140\3\u0140\3\u0140\3\u0140\3\u0140\5\u0140\u0d98\n\u0140"+
		"\3\u0141\3\u0141\3\u0141\3\u0141\3\u0141\3\u0142\5\u0142\u0da0\n\u0142"+
		"\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143\7\u0143\u0da8\n\u0143"+
		"\f\u0143\16\u0143\u0dab\13\u0143\3\u0144\3\u0144\3\u0144\3\u0144\3\u0144"+
		"\5\u0144\u0db2\n\u0144\3\u0145\3\u0145\3\u0145\3\u0145\3\u0145\3\u0146"+
		"\5\u0146\u0dba\n\u0146\3\u0147\3\u0147\3\u0147\3\u0147\3\u0147\3\u0147"+
		"\7\u0147\u0dc2\n\u0147\f\u0147\16\u0147\u0dc5\13\u0147\3\u0148\3\u0148"+
		"\3\u0148\3\u0148\3\u0148\5\u0148\u0dcc\n\u0148\3\u0149\3\u0149\3\u0149"+
		"\3\u0149\3\u0149\3\u014a\5\u014a\u0dd4\n\u014a\3\u014b\3\u014b\3\u014b"+
		"\3\u014b\3\u014b\3\u014b\7\u014b\u0ddc\n\u014b\f\u014b\16\u014b\u0ddf"+
		"\13\u014b\3\u014c\3\u014c\3\u014c\3\u014c\3\u014c\5\u014c\u0de6\n\u014c"+
		"\3\u014d\3\u014d\3\u014d\3\u014e\3\u014e\3\u014e\3\u014f\3\u014f\3\u014f"+
		"\3\u0150\3\u0150\3\u0150\3\u0151\3\u0151\3\u0151\3\u0152\3\u0152\3\u0152"+
		"\3\u0153\3\u0153\3\u0153\3\u0154\3\u0154\3\u0154\3\u0155\3\u0155\3\u0155"+
		"\3\u0156\3\u0156\3\u0156\3\u0157\3\u0157\3\u0157\3\u0158\3\u0158\3\u0158"+
		"\3\u0159\3\u0159\5\u0159\u0e0e\n\u0159\3\u015a\3\u015a\3\u015a\3\u015b"+
		"\3\u015b\3\u015b\3\u015c\3\u015c\3\u015c\3\u015d\3\u015d\3\u015d\3\u015e"+
		"\3\u015e\3\u015e\3\u015f\3\u015f\3\u015f\3\u0160\3\u0160\3\u0160\3\u0161"+
		"\3\u0161\3\u0162\3\u0162\3\u0162\3\u0162\3\u0162\3\u0162\7\u0162\u0e2d"+
		"\n\u0162\f\u0162\16\u0162\u0e30\13\u0162\3\u0163\3\u0163\5\u0163\u0e34"+
		"\n\u0163\3\u0164\3\u0164\5\u0164\u0e38\n\u0164\3\u0165\3\u0165\5\u0165"+
		"\u0e3c\n\u0165\3\u0166\3\u0166\5\u0166\u0e40\n\u0166\3\u0167\3\u0167\5"+
		"\u0167\u0e44\n\u0167\3\u0168\3\u0168\3\u0169\3\u0169\5\u0169\u0e4a\n\u0169"+
		"\3\u016a\3\u016a\5\u016a\u0e4e\n\u016a\3\u016b\3\u016b\3\u016b\3\u016b"+
		"\5\u016b\u0e54\n\u016b\3\u016c\5\u016c\u0e57\n\u016c\3\u016d\3\u016d\3"+
		"\u016d\3\u016d\3\u016d\7\u016d\u0e5e\n\u016d\f\u016d\16\u016d\u0e61\13"+
		"\u016d\3\u016e\3\u016e\3\u016e\3\u016e\3\u016e\3\u016e\7\u016e\u0e69\n"+
		"\u016e\f\u016e\16\u016e\u0e6c\13\u016e\3\u016f\3\u016f\3\u016f\3\u0170"+
		"\5\u0170\u0e72\n\u0170\3\u0171\3\u0171\3\u0171\3\u0171\3\u0171\3\u0171"+
		"\7\u0171\u0e7a\n\u0171\f\u0171\16\u0171\u0e7d\13\u0171\3\u0172\3\u0172"+
		"\3\u0172\3\u0173\3\u0173\3\u0173\3\u0174\3\u0174\3\u0174\3\u0174\3\u0174"+
		"\3\u0174\3\u0174\3\u0174\3\u0174\3\u0174\5\u0174\u0e8f\n\u0174\3\u0175"+
		"\3\u0175\3\u0175\3\u0175\3\u0175\3\u0175\5\u0175\u0e97\n\u0175\3\u0176"+
		"\3\u0176\3\u0176\3\u0176\3\u0176\3\u0176\7\u0176\u0e9f\n\u0176\f\u0176"+
		"\16\u0176\u0ea2\13\u0176\3\u0177\3\u0177\3\u0177\3\u0177\3\u0177\5\u0177"+
		"\u0ea9\n\u0177\3\u0177\3\u0177\3\u0177\3\u0177\3\u0177\3\u0177\5\u0177"+
		"\u0eb1\n\u0177\3\u0178\3\u0178\3\u0179\5\u0179\u0eb6\n\u0179\3\u017a\3"+
		"\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a"+
		"\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a"+
		"\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a"+
		"\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a\3\u017a"+
		"\3\u017a\3\u017a\3\u017a\3\u017a\5\u017a\u0ee1\n\u017a\3\u017b\5\u017b"+
		"\u0ee4\n\u017b\3\u017c\3\u017c\3\u017c\3\u017c\3\u017c\3\u017c\5\u017c"+
		"\u0eec\n\u017c\3\u017d\3\u017d\3\u017d\3\u017d\3\u017d\3\u017d\3\u017d"+
		"\3\u017d\5\u017d\u0ef6\n\u017d\3\u017e\5\u017e\u0ef9\n\u017e\3\u017f\3"+
		"\u017f\3\u0180\5\u0180\u0efe\n\u0180\3\u0181\5\u0181\u0f01\n\u0181\3\u0182"+
		"\3\u0182\3\u0182\3\u0182\3\u0182\3\u0182\7\u0182\u0f09\n\u0182\f\u0182"+
		"\16\u0182\u0f0c\13\u0182\3\u0183\3\u0183\3\u0183\3\u0183\3\u0183\5\u0183"+
		"\u0f13\n\u0183\3\u0183\3\u0183\3\u0183\3\u0183\3\u0183\5\u0183\u0f1a\n"+
		"\u0183\3\u0184\3\u0184\5\u0184\u0f1e\n\u0184\3\u0185\5\u0185\u0f21\n\u0185"+
		"\3\u0186\3\u0186\3\u0186\3\u0186\3\u0186\7\u0186\u0f28\n\u0186\f\u0186"+
		"\16\u0186\u0f2b\13\u0186\3\u0187\3\u0187\3\u0188\3\u0188\3\u0189\5\u0189"+
		"\u0f32\n\u0189\3\u018a\3\u018a\3\u018a\3\u018a\3\u018a\7\u018a\u0f39\n"+
		"\u018a\f\u018a\16\u018a\u0f3c\13\u018a\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b\3\u018b"+
		"\3\u018b\3\u018b\3\u018b\5\u018b\u0f72\n\u018b\3\u018c\5\u018c\u0f75\n"+
		"\u018c\3\u018d\3\u018d\5\u018d\u0f79\n\u018d\3\u018e\3\u018e\3\u018e\3"+
		"\u018e\3\u018e\3\u018e\7\u018e\u0f81\n\u018e\f\u018e\16\u018e\u0f84\13"+
		"\u018e\3\u018f\3\u018f\3\u0190\3\u0190\3\u0191\5\u0191\u0f8b\n\u0191\3"+
		"\u0192\3\u0192\3\u0193\5\u0193\u0f90\n\u0193\3\u0194\3\u0194\3\u0195\3"+
		"\u0195\3\u0195\3\u0195\5\u0195\u0f98\n\u0195\3\u0196\3\u0196\3\u0196\3"+
		"\u0196\3\u0196\7\u0196\u0f9f\n\u0196\f\u0196\16\u0196\u0fa2\13\u0196\3"+
		"\u0197\3\u0197\3\u0197\3\u0197\3\u0197\3\u0198\5\u0198\u0faa\n\u0198\3"+
		"\u0199\3\u0199\3\u0199\3\u0199\3\u0199\7\u0199\u0fb1\n\u0199\f\u0199\16"+
		"\u0199\u0fb4\13\u0199\3\u019a\3\u019a\3\u019b\5\u019b\u0fb9\n\u019b\3"+
		"\u019c\3\u019c\3\u019c\3\u019c\3\u019c\7\u019c\u0fc0\n\u019c\f\u019c\16"+
		"\u019c\u0fc3\13\u019c\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d"+
		"\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d\3\u019d"+
		"\3\u019d\3\u019d\3\u019d\3\u019d\5\u019d\u0fd8\n\u019d\3\u019e\3\u019e"+
		"\3\u019e\3\u019e\3\u019e\3\u019e\5\u019e\u0fe0\n\u019e\3\u019f\3\u019f"+
		"\3\u019f\3\u019f\3\u019f\3\u019f\7\u019f\u0fe8\n\u019f\f\u019f\16\u019f"+
		"\u0feb\13\u019f\3\u01a0\3\u01a0\3\u01a0\3\u01a0\3\u01a0\3\u01a0\3\u01a0"+
		"\5\u01a0\u0ff4\n\u01a0\3\u01a1\5\u01a1\u0ff7\n\u01a1\3\u01a2\3\u01a2\3"+
		"\u01a3\5\u01a3\u0ffc\n\u01a3\3\u01a4\3\u01a4\3\u01a4\3\u01a4\3\u01a4\7"+
		"\u01a4\u1003\n\u01a4\f\u01a4\16\u01a4\u1006\13\u01a4\3\u01a5\3\u01a5\3"+
		"\u01a5\3\u01a5\3\u01a5\3\u01a5\3\u01a5\3\u01a5\5\u01a5\u1010\n\u01a5\3"+
		"\u01a6\3\u01a6\3\u01a6\3\u01a7\3\u01a7\3\u01a7\3\u01a7\3\u01a7\3\u01a8"+
		"\3\u01a8\3\u01a8\3\u01a8\5\u01a8\u101e\n\u01a8\3\u01a9\3\u01a9\3\u01a9"+
		"\3\u01a9\3\u01a9\3\u01a9\5\u01a9\u1026\n\u01a9\3\u01aa\3\u01aa\3\u01ab"+
		"\3\u01ab\3\u01ac\3\u01ac\3\u01ac\29\b\"@J^|\u00e0\u0106\u010e\u0178\u018a"+
		"\u019e\u01a4\u01ba\u01c8\u01cc\u01d4\u01dc\u01e4\u01ec\u01f4\u01fc\u0204"+
		"\u020c\u0214\u021c\u0224\u022c\u0234\u023c\u0244\u024c\u0254\u025c\u0264"+
		"\u026c\u0274\u027c\u0284\u028c\u0294\u02c2\u02d8\u02da\u02e0\u02ea\u0302"+
		"\u030a\u0312\u031a\u032a\u0330\u0336\u033c\u0346\u01ad\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212"+
		"\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a"+
		"\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c\u023e\u0240\u0242"+
		"\u0244\u0246\u0248\u024a\u024c\u024e\u0250\u0252\u0254\u0256\u0258\u025a"+
		"\u025c\u025e\u0260\u0262\u0264\u0266\u0268\u026a\u026c\u026e\u0270\u0272"+
		"\u0274\u0276\u0278\u027a\u027c\u027e\u0280\u0282\u0284\u0286\u0288\u028a"+
		"\u028c\u028e\u0290\u0292\u0294\u0296\u0298\u029a\u029c\u029e\u02a0\u02a2"+
		"\u02a4\u02a6\u02a8\u02aa\u02ac\u02ae\u02b0\u02b2\u02b4\u02b6\u02b8\u02ba"+
		"\u02bc\u02be\u02c0\u02c2\u02c4\u02c6\u02c8\u02ca\u02cc\u02ce\u02d0\u02d2"+
		"\u02d4\u02d6\u02d8\u02da\u02dc\u02de\u02e0\u02e2\u02e4\u02e6\u02e8\u02ea"+
		"\u02ec\u02ee\u02f0\u02f2\u02f4\u02f6\u02f8\u02fa\u02fc\u02fe\u0300\u0302"+
		"\u0304\u0306\u0308\u030a\u030c\u030e\u0310\u0312\u0314\u0316\u0318\u031a"+
		"\u031c\u031e\u0320\u0322\u0324\u0326\u0328\u032a\u032c\u032e\u0330\u0332"+
		"\u0334\u0336\u0338\u033a\u033c\u033e\u0340\u0342\u0344\u0346\u0348\u034a"+
		"\u034c\u034e\u0350\u0352\u0354\u0356\2\25\7\2\'\'\u008c\u008c\u00d7\u00d7"+
		"\u00fa\u00fa\u012f\u012f\4\2UU\u00b0\u00b0\4\2\27\27\u00ba\u00ba\b\2\u0080"+
		"\u0080\u00a0\u00a0\u00a2\u00a2\u00b3\u00b3\u0118\u0118\u018e\u018e\4\2"+
		"\u0096\u0096\u0163\u0163\13\2\23\23&&\u00e4\u00e4\u00e6\u00e6\u00ef\u00ef"+
		"\u0114\u0114\u0153\u0153\u016f\u0170\u0195\u0196\5\2\u00ec\u00ec\u0103"+
		"\u0103\u015a\u015a\7\2\21\22\u00e9\u00e9\u0126\u0126\u0139\u0139\u0176"+
		"\u0176\3\2~\177\t\2\26\26**WW\u0097\u0097\u00f2\u00f3\u0106\u0106\u0125"+
		"\u0125\13\2\u0096\u0096\u0109\u0109\u010b\u010f\u0115\u0115\u0163\u0163"+
		"\u0169\u016b\u016d\u016e\u0172\u0172\u0175\u0175\b\2\u008a\u008a\u00f0"+
		"\u00f0\u013c\u013d\u0144\u0145\u016a\u016b\u016d\u016e\t\2))\66\66SS\u00cb"+
		"\u00cb\u00db\u00dc\u011c\u011c\u0185\u0186\4\2\u008f\u008f\u0091\u0091"+
		"\4\2\u0105\u0105\u0108\u0108\3\2\u0081\u0082\4\2\u00c2\u00c2\u00de\u00df"+
		"\4\2\u00e0\u00e0\u0174\u0174\5\2__\u00b7\u00b7\u011f\u011f\2\u10ee\2\u035a"+
		"\3\2\2\2\4\u035c\3\2\2\2\6\u035f\3\2\2\2\b\u0361\3\2\2\2\n\u037a\3\2\2"+
		"\2\f\u037c\3\2\2\2\16\u0388\3\2\2\2\20\u038a\3\2\2\2\22\u0398\3\2\2\2"+
		"\24\u039a\3\2\2\2\26\u039f\3\2\2\2\30\u03a1\3\2\2\2\32\u03b6\3\2\2\2\34"+
		"\u03cd\3\2\2\2\36\u03cf\3\2\2\2 \u03d3\3\2\2\2\"\u03d5\3\2\2\2$\u03e4"+
		"\3\2\2\2&\u040e\3\2\2\2(\u0410\3\2\2\2*\u0412\3\2\2\2,\u0417\3\2\2\2."+
		"\u041d\3\2\2\2\60\u0438\3\2\2\2\62\u043e\3\2\2\2\64\u0444\3\2\2\2\66\u044a"+
		"\3\2\2\28\u044c\3\2\2\2:\u0451\3\2\2\2<\u0458\3\2\2\2>\u0460\3\2\2\2@"+
		"\u0462\3\2\2\2B\u046f\3\2\2\2D\u047b\3\2\2\2F\u047e\3\2\2\2H\u0481\3\2"+
		"\2\2J\u0483\3\2\2\2L\u048d\3\2\2\2N\u0495\3\2\2\2P\u049e\3\2\2\2R\u04a0"+
		"\3\2\2\2T\u04a2\3\2\2\2V\u04a4\3\2\2\2X\u04a6\3\2\2\2Z\u04a8\3\2\2\2\\"+
		"\u04aa\3\2\2\2^\u04b0\3\2\2\2`\u04c9\3\2\2\2b\u04cb\3\2\2\2d\u04cd\3\2"+
		"\2\2f\u04cf\3\2\2\2h\u04d1\3\2\2\2j\u04d3\3\2\2\2l\u04d6\3\2\2\2n\u04d8"+
		"\3\2\2\2p\u04dd\3\2\2\2r\u04e3\3\2\2\2t\u04e5\3\2\2\2v\u04e7\3\2\2\2x"+
		"\u04e9\3\2\2\2z\u04ff\3\2\2\2|\u0501\3\2\2\2~\u050c\3\2\2\2\u0080\u050e"+
		"\3\2\2\2\u0082\u0513\3\2\2\2\u0084\u0515\3\2\2\2\u0086\u051e\3\2\2\2\u0088"+
		"\u0521\3\2\2\2\u008a\u0524\3\2\2\2\u008c\u0534\3\2\2\2\u008e\u0536\3\2"+
		"\2\2\u0090\u0538\3\2\2\2\u0092\u053a\3\2\2\2\u0094\u053c\3\2\2\2\u0096"+
		"\u053e\3\2\2\2\u0098\u0540\3\2\2\2\u009a\u0542\3\2\2\2\u009c\u0554\3\2"+
		"\2\2\u009e\u0556\3\2\2\2\u00a0\u055a\3\2\2\2\u00a2\u055d\3\2\2\2\u00a4"+
		"\u055f\3\2\2\2\u00a6\u0563\3\2\2\2\u00a8\u0565\3\2\2\2\u00aa\u0567\3\2"+
		"\2\2\u00ac\u0596\3\2\2\2\u00ae\u0598\3\2\2\2\u00b0\u05a2\3\2\2\2\u00b2"+
		"\u05ab\3\2\2\2\u00b4\u05b5\3\2\2\2\u00b6\u05be\3\2\2\2\u00b8\u05c8\3\2"+
		"\2\2\u00ba\u05d1\3\2\2\2\u00bc\u05db\3\2\2\2\u00be\u05e5\3\2\2\2\u00c0"+
		"\u05ee\3\2\2\2\u00c2\u05f7\3\2\2\2\u00c4\u0600\3\2\2\2\u00c6\u0609\3\2"+
		"\2\2\u00c8\u0613\3\2\2\2\u00ca\u061d\3\2\2\2\u00cc\u0627\3\2\2\2\u00ce"+
		"\u0630\3\2\2\2\u00d0\u0639\3\2\2\2\u00d2\u0642\3\2\2\2\u00d4\u064b\3\2"+
		"\2\2\u00d6\u0657\3\2\2\2\u00d8\u0663\3\2\2\2\u00da\u066a\3\2\2\2\u00dc"+
		"\u0674\3\2\2\2\u00de\u0680\3\2\2\2\u00e0\u0682\3\2\2\2\u00e2\u068d\3\2"+
		"\2\2\u00e4\u0692\3\2\2\2\u00e6\u0694\3\2\2\2\u00e8\u069c\3\2\2\2\u00ea"+
		"\u06a4\3\2\2\2\u00ec\u06ac\3\2\2\2\u00ee\u06b4\3\2\2\2\u00f0\u06bc\3\2"+
		"\2\2\u00f2\u06c4\3\2\2\2\u00f4\u06cc\3\2\2\2\u00f6\u06d4\3\2\2\2\u00f8"+
		"\u06dc\3\2\2\2\u00fa\u06e4\3\2\2\2\u00fc\u06ec\3\2\2\2\u00fe\u06f4\3\2"+
		"\2\2\u0100\u06fc\3\2\2\2\u0102\u0706\3\2\2\2\u0104\u0710\3\2\2\2\u0106"+
		"\u071c\3\2\2\2\u0108\u0726\3\2\2\2\u010a\u072b\3\2\2\2\u010c\u072e\3\2"+
		"\2\2\u010e\u0730\3\2\2\2\u0110\u0743\3\2\2\2\u0112\u0775\3\2\2\2\u0114"+
		"\u0777\3\2\2\2\u0116\u077f\3\2\2\2\u0118\u0787\3\2\2\2\u011a\u078f\3\2"+
		"\2\2\u011c\u0797\3\2\2\2\u011e\u079f\3\2\2\2\u0120\u07a7\3\2\2\2\u0122"+
		"\u07af\3\2\2\2\u0124\u07b7\3\2\2\2\u0126\u07bf\3\2\2\2\u0128\u07c6\3\2"+
		"\2\2\u012a\u07cd\3\2\2\2\u012c\u07d5\3\2\2\2\u012e\u07dd\3\2\2\2\u0130"+
		"\u07e5\3\2\2\2\u0132\u07ed\3\2\2\2\u0134\u07f4\3\2\2\2\u0136\u07fb\3\2"+
		"\2\2\u0138\u0802\3\2\2\2\u013a\u080a\3\2\2\2\u013c\u0815\3\2\2\2\u013e"+
		"\u0820\3\2\2\2\u0140\u0827\3\2\2\2\u0142\u087d\3\2\2\2\u0144\u0880\3\2"+
		"\2\2\u0146\u0883\3\2\2\2\u0148\u08b7\3\2\2\2\u014a\u08ef\3\2\2\2\u014c"+
		"\u08f1\3\2\2\2\u014e\u08f6\3\2\2\2\u0150\u0909\3\2\2\2\u0152\u090b\3\2"+
		"\2\2\u0154\u0919\3\2\2\2\u0156\u092d\3\2\2\2\u0158\u092f\3\2\2\2\u015a"+
		"\u0936\3\2\2\2\u015c\u093d\3\2\2\2\u015e\u0944\3\2\2\2\u0160\u094b\3\2"+
		"\2\2\u0162\u0952\3\2\2\2\u0164\u0959\3\2\2\2\u0166\u0960\3\2\2\2\u0168"+
		"\u0967\3\2\2\2\u016a\u096e\3\2\2\2\u016c\u0975\3\2\2\2\u016e\u097c\3\2"+
		"\2\2\u0170\u0983\3\2\2\2\u0172\u098a\3\2\2\2\u0174\u0992\3\2\2\2\u0176"+
		"\u099b\3\2\2\2\u0178\u09a0\3\2\2\2\u017a\u09ab\3\2\2\2\u017c\u09b1\3\2"+
		"\2\2\u017e\u09bc\3\2\2\2\u0180\u09cb\3\2\2\2\u0182\u09cd\3\2\2\2\u0184"+
		"\u09d4\3\2\2\2\u0186\u09db\3\2\2\2\u0188\u09de\3\2\2\2\u018a\u09e0\3\2"+
		"\2\2\u018c\u09f2\3\2\2\2\u018e\u09f4\3\2\2\2\u0190\u09fc\3\2\2\2\u0192"+
		"\u0a0f\3\2\2\2\u0194\u0a20\3\2\2\2\u0196\u0a22\3\2\2\2\u0198\u0a27\3\2"+
		"\2\2\u019a\u0a32\3\2\2\2\u019c\u0a3e\3\2\2\2\u019e\u0a40\3\2\2\2\u01a0"+
		"\u0a4a\3\2\2\2\u01a2\u0a50\3\2\2\2\u01a4\u0a59\3\2\2\2\u01a6\u0a64\3\2"+
		"\2\2\u01a8\u0a67\3\2\2\2\u01aa\u0a79\3\2\2\2\u01ac\u0a7e\3\2\2\2\u01ae"+
		"\u0a88\3\2\2\2\u01b0\u0a90\3\2\2\2\u01b2\u0a97\3\2\2\2\u01b4\u0a9f\3\2"+
		"\2\2\u01b6\u0aa1\3\2\2\2\u01b8\u0aaa\3\2\2\2\u01ba\u0aac\3\2\2\2\u01bc"+
		"\u0ab9\3\2\2\2\u01be\u0ac2\3\2\2\2\u01c0\u0ac4\3\2\2\2\u01c2\u0ac7\3\2"+
		"\2\2\u01c4\u0acd\3\2\2\2\u01c6\u0ad0\3\2\2\2\u01c8\u0ad2\3\2\2\2\u01ca"+
		"\u0ade\3\2\2\2\u01cc\u0ae0\3\2\2\2\u01ce\u0b04\3\2\2\2\u01d0\u0b06\3\2"+
		"\2\2\u01d2\u0b0c\3\2\2\2\u01d4\u0b0e\3\2\2\2\u01d6\u0b39\3\2\2\2\u01d8"+
		"\u0b3b\3\2\2\2\u01da\u0b41\3\2\2\2\u01dc\u0b43\3\2\2\2\u01de\u0b56\3\2"+
		"\2\2\u01e0\u0b58\3\2\2\2\u01e2\u0b5e\3\2\2\2\u01e4\u0b60\3\2\2\2\u01e6"+
		"\u0b71\3\2\2\2\u01e8\u0b73\3\2\2\2\u01ea\u0b79\3\2\2\2\u01ec\u0b7b\3\2"+
		"\2\2\u01ee\u0b8b\3\2\2\2\u01f0\u0b8d\3\2\2\2\u01f2\u0b93\3\2\2\2\u01f4"+
		"\u0b95\3\2\2\2\u01f6\u0bae\3\2\2\2\u01f8\u0bb0\3\2\2\2\u01fa\u0bb6\3\2"+
		"\2\2\u01fc\u0bb8\3\2\2\2\u01fe\u0bd8\3\2\2\2\u0200\u0bda\3\2\2\2\u0202"+
		"\u0be0\3\2\2\2\u0204\u0be2\3\2\2\2\u0206\u0bf1\3\2\2\2\u0208\u0bf3\3\2"+
		"\2\2\u020a\u0bf9\3\2\2\2\u020c\u0bfb\3\2\2\2\u020e\u0c0b\3\2\2\2\u0210"+
		"\u0c0d\3\2\2\2\u0212\u0c13\3\2\2\2\u0214\u0c15\3\2\2\2\u0216\u0c22\3\2"+
		"\2\2\u0218\u0c24\3\2\2\2\u021a\u0c2a\3\2\2\2\u021c\u0c2c\3\2\2\2\u021e"+
		"\u0c3c\3\2\2\2\u0220\u0c3e\3\2\2\2\u0222\u0c44\3\2\2\2\u0224\u0c46\3\2"+
		"\2\2\u0226\u0c59\3\2\2\2\u0228\u0c5b\3\2\2\2\u022a\u0c61\3\2\2\2\u022c"+
		"\u0c63\3\2\2\2\u022e\u0c72\3\2\2\2\u0230\u0c74\3\2\2\2\u0232\u0c7a\3\2"+
		"\2\2\u0234\u0c7c\3\2\2\2\u0236\u0c91\3\2\2\2\u0238\u0c93\3\2\2\2\u023a"+
		"\u0c99\3\2\2\2\u023c\u0c9b\3\2\2\2\u023e\u0cc2\3\2\2\2\u0240\u0cc4\3\2"+
		"\2\2\u0242\u0cca\3\2\2\2\u0244\u0ccc\3\2\2\2\u0246\u0cdb\3\2\2\2\u0248"+
		"\u0cdd\3\2\2\2\u024a\u0ce3\3\2\2\2\u024c\u0ce5\3\2\2\2\u024e\u0cf4\3\2"+
		"\2\2\u0250\u0cf6\3\2\2\2\u0252\u0cfc\3\2\2\2\u0254\u0cfe\3\2\2\2\u0256"+
		"\u0d0e\3\2\2\2\u0258\u0d10\3\2\2\2\u025a\u0d16\3\2\2\2\u025c\u0d18\3\2"+
		"\2\2\u025e\u0d2c\3\2\2\2\u0260\u0d2e\3\2\2\2\u0262\u0d34\3\2\2\2\u0264"+
		"\u0d36\3\2\2\2\u0266\u0d43\3\2\2\2\u0268\u0d45\3\2\2\2\u026a\u0d4b\3\2"+
		"\2\2\u026c\u0d4d\3\2\2\2\u026e\u0d5c\3\2\2\2\u0270\u0d5e\3\2\2\2\u0272"+
		"\u0d64\3\2\2\2\u0274\u0d66\3\2\2\2\u0276\u0d7b\3\2\2\2\u0278\u0d7d\3\2"+
		"\2\2\u027a\u0d83\3\2\2\2\u027c\u0d85\3\2\2\2\u027e\u0d97\3\2\2\2\u0280"+
		"\u0d99\3\2\2\2\u0282\u0d9f\3\2\2\2\u0284\u0da1\3\2\2\2\u0286\u0db1\3\2"+
		"\2\2\u0288\u0db3\3\2\2\2\u028a\u0db9\3\2\2\2\u028c\u0dbb\3\2\2\2\u028e"+
		"\u0dcb\3\2\2\2\u0290\u0dcd\3\2\2\2\u0292\u0dd3\3\2\2\2\u0294\u0dd5\3\2"+
		"\2\2\u0296\u0de5\3\2\2\2\u0298\u0de7\3\2\2\2\u029a\u0dea\3\2\2\2\u029c"+
		"\u0ded\3\2\2\2\u029e\u0df0\3\2\2\2\u02a0\u0df3\3\2\2\2\u02a2\u0df6\3\2"+
		"\2\2\u02a4\u0df9\3\2\2\2\u02a6\u0dfc\3\2\2\2\u02a8\u0dff\3\2\2\2\u02aa"+
		"\u0e02\3\2\2\2\u02ac\u0e05\3\2\2\2\u02ae\u0e08\3\2\2\2\u02b0\u0e0d\3\2"+
		"\2\2\u02b2\u0e0f\3\2\2\2\u02b4\u0e12\3\2\2\2\u02b6\u0e15\3\2\2\2\u02b8"+
		"\u0e18\3\2\2\2\u02ba\u0e1b\3\2\2\2\u02bc\u0e1e\3\2\2\2\u02be\u0e21\3\2"+
		"\2\2\u02c0\u0e24\3\2\2\2\u02c2\u0e26\3\2\2\2\u02c4\u0e33\3\2\2\2\u02c6"+
		"\u0e37\3\2\2\2\u02c8\u0e3b\3\2\2\2\u02ca\u0e3f\3\2\2\2\u02cc\u0e43\3\2"+
		"\2\2\u02ce\u0e45\3\2\2\2\u02d0\u0e49\3\2\2\2\u02d2\u0e4d\3\2\2\2\u02d4"+
		"\u0e53\3\2\2\2\u02d6\u0e56\3\2\2\2\u02d8\u0e58\3\2\2\2\u02da\u0e62\3\2"+
		"\2\2\u02dc\u0e6d\3\2\2\2\u02de\u0e71\3\2\2\2\u02e0\u0e73\3\2\2\2\u02e2"+
		"\u0e7e\3\2\2\2\u02e4\u0e81\3\2\2\2\u02e6\u0e8e\3\2\2\2\u02e8\u0e96\3\2"+
		"\2\2\u02ea\u0e98\3\2\2\2\u02ec\u0eb0\3\2\2\2\u02ee\u0eb2\3\2\2\2\u02f0"+
		"\u0eb5\3\2\2\2\u02f2\u0ee0\3\2\2\2\u02f4\u0ee3\3\2\2\2\u02f6\u0eeb\3\2"+
		"\2\2\u02f8\u0ef5\3\2\2\2\u02fa\u0ef8\3\2\2\2\u02fc\u0efa\3\2\2\2\u02fe"+
		"\u0efd\3\2\2\2\u0300\u0f00\3\2\2\2\u0302\u0f02\3\2\2\2\u0304\u0f19\3\2"+
		"\2\2\u0306\u0f1d\3\2\2\2\u0308\u0f20\3\2\2\2\u030a\u0f22\3\2\2\2\u030c"+
		"\u0f2c\3\2\2\2\u030e\u0f2e\3\2\2\2\u0310\u0f31\3\2\2\2\u0312\u0f33\3\2"+
		"\2\2\u0314\u0f71\3\2\2\2\u0316\u0f74\3\2\2\2\u0318\u0f78\3\2\2\2\u031a"+
		"\u0f7a\3\2\2\2\u031c\u0f85\3\2\2\2\u031e\u0f87\3\2\2\2\u0320\u0f8a\3\2"+
		"\2\2\u0322\u0f8c\3\2\2\2\u0324\u0f8f\3\2\2\2\u0326\u0f91\3\2\2\2\u0328"+
		"\u0f97\3\2\2\2\u032a\u0f99\3\2\2\2\u032c\u0fa3\3\2\2\2\u032e\u0fa9\3\2"+
		"\2\2\u0330\u0fab\3\2\2\2\u0332\u0fb5\3\2\2\2\u0334\u0fb8\3\2\2\2\u0336"+
		"\u0fba\3\2\2\2\u0338\u0fd7\3\2\2\2\u033a\u0fdf\3\2\2\2\u033c\u0fe1\3\2"+
		"\2\2\u033e\u0ff3\3\2\2\2\u0340\u0ff6\3\2\2\2\u0342\u0ff8\3\2\2\2\u0344"+
		"\u0ffb\3\2\2\2\u0346\u0ffd\3\2\2\2\u0348\u100f\3\2\2\2\u034a\u1011\3\2"+
		"\2\2\u034c\u1014\3\2\2\2\u034e\u101d\3\2\2\2\u0350\u1025\3\2\2\2\u0352"+
		"\u1027\3\2\2\2\u0354\u1029\3\2\2\2\u0356\u102b\3\2\2\2\u0358\u035b\5\u0110"+
		"\u0089\2\u0359\u035b\5\u0192\u00ca\2\u035a\u0358\3\2\2\2\u035a\u0359\3"+
		"\2\2\2\u035b\3\3\2\2\2\u035c\u035d\5\6\4\2\u035d\5\3\2\2\2\u035e\u0360"+
		"\5\b\5\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\7\3\2\2\2\u0361"+
		"\u0362\b\5\1\2\u0362\u0363\5\n\6\2\u0363\u0368\3\2\2\2\u0364\u0365\f\3"+
		"\2\2\u0365\u0367\5\n\6\2\u0366\u0364\3\2\2\2\u0367\u036a\3\2\2\2\u0368"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\t\3\2\2\2\u036a\u0368\3\2\2\2"+
		"\u036b\u037b\5\f\7\2\u036c\u037b\5\16\b\2\u036d\u037b\5\20\t\2\u036e\u037b"+
		"\5\22\n\2\u036f\u037b\5\24\13\2\u0370\u037b\5\30\r\2\u0371\u037b\5\32"+
		"\16\2\u0372\u037b\5&\24\2\u0373\u037b\5*\26\2\u0374\u037b\5,\27\2\u0375"+
		"\u037b\5:\36\2\u0376\u037b\5<\37\2\u0377\u037b\5D#\2\u0378\u037b\5L\'"+
		"\2\u0379\u037b\5N(\2\u037a\u036b\3\2\2\2\u037a\u036c\3\2\2\2\u037a\u036d"+
		"\3\2\2\2\u037a\u036e\3\2\2\2\u037a\u036f\3\2\2\2\u037a\u0370\3\2\2\2\u037a"+
		"\u0371\3\2\2\2\u037a\u0372\3\2\2\2\u037a\u0373\3\2\2\2\u037a\u0374\3\2"+
		"\2\2\u037a\u0375\3\2\2\2\u037a\u0376\3\2\2\2\u037a\u0377\3\2\2\2\u037a"+
		"\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037b\13\3\2\2\2\u037c\u037d\7\u0146"+
		"\2\2\u037d\u037e\7\4\2\2\u037e\u037f\5\u00a2R\2\u037f\r\3\2\2\2\u0380"+
		"\u0381\7\u015b\2\2\u0381\u0382\7[\2\2\u0382\u0383\7\4\2\2\u0383\u0389"+
		"\5\u00a2R\2\u0384\u0385\7\u015b\2\2\u0385\u0386\7\u0162\2\2\u0386\u0387"+
		"\7\4\2\2\u0387\u0389\5\u00a2R\2\u0388\u0380\3\2\2\2\u0388\u0384\3\2\2"+
		"\2\u0389\17\3\2\2\2\u038a\u038b\7\u00e8\2\2\u038b\u038c\7\61\2\2\u038c"+
		"\u038d\5\u00a2R\2\u038d\21\3\2\2\2\u038e\u038f\5R*\2\u038f\u0390\7\4\2"+
		"\2\u0390\u0391\7\u0166\2\2\u0391\u0392\5~@\2\u0392\u0399\3\2\2\2\u0393"+
		"\u0394\5R*\2\u0394\u0395\7\4\2\2\u0395\u0396\7\u0166\2\2\u0396\u0397\5"+
		"^\60\2\u0397\u0399\3\2\2\2\u0398\u038e\3\2\2\2\u0398\u0393\3\2\2\2\u0399"+
		"\23\3\2\2\2\u039a\u039b\5X-\2\u039b\u039c\7\4\2\2\u039c\u039d\7R\2\2\u039d"+
		"\u039e\5\26\f\2\u039e\25\3\2\2\2\u039f\u03a0\t\2\2\2\u03a0\27\3\2\2\2"+
		"\u03a1\u03a2\5P)\2\u03a2\u03a3\7\4\2\2\u03a3\u03a4\5\u0326\u0194\2\u03a4"+
		"\u03a6\5\u0340\u01a1\2\u03a5\u03a7\5\u0356\u01ac\2\u03a6\u03a5\3\2\2\2"+
		"\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\5\u02fa\u017e\2\u03a9"+
		"\u03ab\5\u0350\u01a9\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad"+
		"\3\2\2\2\u03ac\u03ae\5\u0354\u01ab\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3"+
		"\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\5l\67\2\u03b0\u03b1\5\34\17\2\u03b1"+
		"\u03b2\5\36\20\2\u03b2\u03b3\5^\60\2\u03b3\u03b4\5 \21\2\u03b4\u03b5\5"+
		"\u0310\u0189\2\u03b5\31\3\2\2\2\u03b6\u03b7\5P)\2\u03b7\u03b8\7\4\2\2"+
		"\u03b8\u03b9\5\u0320\u0191\2\u03b9\u03bb\5\u0340\u01a1\2\u03ba\u03bc\5"+
		"\u0356\u01ac\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2"+
		"\2\2\u03bd\u03bf\5\u02fa\u017e\2\u03be\u03c0\5\u0350\u01a9\2\u03bf\u03be"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03c3\5\u0354\u01ab"+
		"\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5"+
		"\5l\67\2\u03c5\u03c6\5\34\17\2\u03c6\u03c7\5\36\20\2\u03c7\u03c8\5^\60"+
		"\2\u03c8\u03c9\5\u008cG\2\u03c9\u03ca\5 \21\2\u03ca\u03cb\5\u0310\u0189"+
		"\2\u03cb\33\3\2\2\2\u03cc\u03ce\7\u0090\2\2\u03cd\u03cc\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\35\3\2\2\2\u03cf\u03d0\t\3\2\2\u03d0\37\3\2\2\2\u03d1"+
		"\u03d2\7\7\2\2\u03d2\u03d4\5\"\22\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3"+
		"\2\2\2\u03d4!\3\2\2\2\u03d5\u03d6\b\22\1\2\u03d6\u03d7\5$\23\2\u03d7\u03dd"+
		"\3\2\2\2\u03d8\u03d9\f\3\2\2\u03d9\u03da\7\7\2\2\u03da\u03dc\5$\23\2\u03db"+
		"\u03d8\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2"+
		"\2\2\u03de#\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e5\5\u034a\u01a6\2\u03e1"+
		"\u03e5\5\u02f6\u017c\2\u03e2\u03e5\5\u02e4\u0173\2\u03e3\u03e5\5\u01c2"+
		"\u00e2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e1\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4"+
		"\u03e3\3\2\2\2\u03e5%\3\2\2\2\u03e6\u03e7\5P)\2\u03e7\u03e8\7\4\2\2\u03e8"+
		"\u03e9\5\u0326\u0194\2\u03e9\u03eb\5\u0340\u01a1\2\u03ea\u03ec\5\u0356"+
		"\u01ac\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\5\u02fa\u017e\2\u03ee\u03f0\5\u0350\u01a9\2\u03ef\u03ee\3\2\2\2"+
		"\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03f3\5\u0354\u01ab\2\u03f2"+
		"\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\5("+
		"\25\2\u03f5\u03f6\5^\60\2\u03f6\u03f7\7\7\2\2\u03f7\u03f8\5^\60\2\u03f8"+
		"\u03f9\5\u008cG\2\u03f9\u040f\3\2\2\2\u03fa\u03fb\5P)\2\u03fb\u03fc\7"+
		"\4\2\2\u03fc\u03fd\5\u0320\u0191\2\u03fd\u03ff\5\u0340\u01a1\2\u03fe\u0400"+
		"\5\u0356\u01ac\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3"+
		"\2\2\2\u0401\u0403\5\u02fa\u017e\2\u0402\u0404\5\u0350\u01a9\2\u0403\u0402"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0407\5\u0354\u01ab"+
		"\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409"+
		"\5(\25\2\u0409\u040a\5^\60\2\u040a\u040b\7\7\2\2\u040b\u040c\5^\60\2\u040c"+
		"\u040d\5\u008cG\2\u040d\u040f\3\2\2\2\u040e\u03e6\3\2\2\2\u040e\u03fa"+
		"\3\2\2\2\u040f\'\3\2\2\2\u0410\u0411\t\4\2\2\u0411)\3\2\2\2\u0412\u0413"+
		"\7^\2\2\u0413\u0414\5\u01c6\u00e4\2\u0414\u0415\5\u0324\u0193\2\u0415"+
		"\u0416\5.\30\2\u0416+\3\2\2\2\u0417\u0418\7`\2\2\u0418\u0419\5\u0320\u0191"+
		"\2\u0419\u041a\5.\30\2\u041a\u041b\5\u01c6\u00e4\2\u041b\u041c\58\35\2"+
		"\u041c-\3\2\2\2\u041d\u041f\5\u0340\u01a1\2\u041e\u0420\5\u0356\u01ac"+
		"\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422"+
		"\5\u02fa\u017e\2\u0422\u0423\5\u02f0\u0179\2\u0423\u0424\5\u0344\u01a3"+
		"\2\u0424\u0425\5^\60\2\u0425\u0426\5P)\2\u0426\u0427\7\n\2\2\u0427\u0428"+
		"\5\u033a\u019e\2\u0428\u042a\7\13\2\2\u0429\u042b\5\u0354\u01ab\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\5\u0310"+
		"\u0189\2\u042d\u042f\5\u034a\u01a6\2\u042e\u042d\3\2\2\2\u042e\u042f\3"+
		"\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\5\u02f4\u017b\2\u0431\u0432\5\60"+
		"\31\2\u0432\u0433\5\62\32\2\u0433\u0434\5\64\33\2\u0434\u0435\5\66\34"+
		"\2\u0435/\3\2\2\2\u0436\u0437\7\u00ab\2\2\u0437\u0439\5\u00a2R\2\u0438"+
		"\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\61\3\2\2\2\u043a\u043b\7\u0119"+
		"\2\2\u043b\u043c\5^\60\2\u043c\u043d\5\u008cG\2\u043d\u043f\3\2\2\2\u043e"+
		"\u043a\3\2\2\2\u043e\u043f\3\2\2\2\u043f\63\3\2\2\2\u0440\u0441\7\u011e"+
		"\2\2\u0441\u0442\5^\60\2\u0442\u0443\5\u008cG\2\u0443\u0445\3\2\2\2\u0444"+
		"\u0440\3\2\2\2\u0444\u0445\3\2\2\2\u0445\65\3\2\2\2\u0446\u0447\7\u0116"+
		"\2\2\u0447\u0448\5^\60\2\u0448\u0449\5\u008cG\2\u0449\u044b\3\2\2\2\u044a"+
		"\u0446\3\2\2\2\u044a\u044b\3\2\2\2\u044b\67\3\2\2\2\u044c\u044d\7\16\2"+
		"\2\u044d\u044e\5\u0106\u0084\2\u044e\u044f\5H%\2\u044f\u0450\7\17\2\2"+
		"\u04509\3\2\2\2\u0451\u0452\7\65\2\2\u0452\u0453\5V,\2\u0453\u0454\7\4"+
		"\2\2\u0454\u0455\7\16\2\2\u0455\u0456\5\u0310\u0189\2\u0456\u0457\7\17"+
		"\2\2\u0457;\3\2\2\2\u0458\u0459\5Z.\2\u0459\u045a\7\4\2\2\u045a\u045b"+
		"\7\b\2\2\u045b\u045c\7\16\2\2\u045c\u045d\5> \2\u045d\u045e\7\17\2\2\u045e"+
		"=\3\2\2\2\u045f\u0461\5@!\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"?\3\2\2\2\u0462\u0463\b!\1\2\u0463\u0464\5B\"\2\u0464\u046a\3\2\2\2\u0465"+
		"\u0466\f\3\2\2\u0466\u0467\7\7\2\2\u0467\u0469\5B\"\2\u0468\u0465\3\2"+
		"\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"A\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u0470\5\\/\2\u046e\u0470\5\u0260\u0131"+
		"\2\u046f\u046d\3\2\2\2\u046f\u046e\3\2\2\2\u0470C\3\2\2\2\u0471\u0472"+
		"\5\\/\2\u0472\u0473\7\4\2\2\u0473\u0474\5F$\2\u0474\u0475\5\u01b6\u00dc"+
		"\2\u0475\u047c\3\2\2\2\u0476\u0477\5\\/\2\u0477\u0478\7\4\2\2\u0478\u0479"+
		"\5F$\2\u0479\u047a\5\u01ce\u00e8\2\u047a\u047c\3\2\2\2\u047b\u0471\3\2"+
		"\2\2\u047b\u0476\3\2\2\2\u047cE\3\2\2\2\u047d\u047f\7x\2\2\u047e\u047d"+
		"\3\2\2\2\u047e\u047f\3\2\2\2\u047fG\3\2\2\2\u0480\u0482\5J&\2\u0481\u0480"+
		"\3\2\2\2\u0481\u0482\3\2\2\2\u0482I\3\2\2\2\u0483\u0484\b&\1\2\u0484\u0485"+
		"\5L\'\2\u0485\u048a\3\2\2\2\u0486\u0487\f\3\2\2\u0487\u0489\5L\'\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048bK\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7\u017a\2\2\u048e"+
		"\u048f\5^\60\2\u048f\u0490\5\u0082B\2\u0490\u0491\7\7\2\2\u0491\u0492"+
		"\7\16\2\2\u0492\u0493\5\u031a\u018e\2\u0493\u0494\7\17\2\2\u0494M\3\2"+
		"\2\2\u0495\u0496\7\u017b\2\2\u0496\u0497\5P)\2\u0497\u0498\7\7\2\2\u0498"+
		"\u0499\5R*\2\u0499\u049a\7\7\2\2\u049a\u049b\7\16\2\2\u049b\u049c\5\u031a"+
		"\u018e\2\u049c\u049d\7\17\2\2\u049dO\3\2\2\2\u049e\u049f\7\u01b9\2\2\u049f"+
		"Q\3\2\2\2\u04a0\u04a1\7\u01bc\2\2\u04a1S\3\2\2\2\u04a2\u04a3\7\u01bf\2"+
		"\2\u04a3U\3\2\2\2\u04a4\u04a5\7\u019d\2\2\u04a5W\3\2\2\2\u04a6\u04a7\7"+
		"\u019e\2\2\u04a7Y\3\2\2\2\u04a8\u04a9\7\u019f\2\2\u04a9[\3\2\2\2\u04aa"+
		"\u04ab\7\u01a0\2\2\u04ab]\3\2\2\2\u04ac\u04ad\b\60\1\2\u04ad\u04b1\5b"+
		"\62\2\u04ae\u04b1\5`\61\2\u04af\u04b1\5v<\2\u04b0\u04ac\3\2\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1\u04bd\3\2\2\2\u04b2\u04b3\f\5"+
		"\2\2\u04b3\u04b4\7\n\2\2\u04b4\u04b5\5\u033a\u019e\2\u04b5\u04b6\7\13"+
		"\2\2\u04b6\u04bc\3\2\2\2\u04b7\u04b8\f\3\2\2\u04b8\u04b9\5l\67\2\u04b9"+
		"\u04ba\7\20\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b2\3\2\2\2\u04bb\u04b7\3"+
		"\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"_\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04ca\5d\63\2\u04c1\u04ca\5f\64\2"+
		"\u04c2\u04ca\5p9\2\u04c3\u04ca\5r:\2\u04c4\u04ca\5x=\2\u04c5\u04ca\5z"+
		">\2\u04c6\u04ca\5\u0080A\2\u04c7\u04ca\5j\66\2\u04c8\u04ca\5t;\2\u04c9"+
		"\u04c0\3\2\2\2\u04c9\u04c1\3\2\2\2\u04c9\u04c2\3\2\2\2\u04c9\u04c3\3\2"+
		"\2\2\u04c9\u04c4\3\2\2\2\u04c9\u04c5\3\2\2\2\u04c9\u04c6\3\2\2\2\u04c9"+
		"\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04caa\3\2\2\2\u04cb\u04cc\7\u0183"+
		"\2\2\u04ccc\3\2\2\2\u04cd\u04ce\7\u01b4\2\2\u04cee\3\2\2\2\u04cf\u04d0"+
		"\5h\65\2\u04d0g\3\2\2\2\u04d1\u04d2\t\5\2\2\u04d2i\3\2\2\2\u04d3\u04d4"+
		"\7\u0190\2\2\u04d4k\3\2\2\2\u04d5\u04d7\5n8\2\u04d6\u04d5\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7m\3\2\2\2\u04d8\u04d9\7\24\2\2\u04d9\u04da\7\n\2\2"+
		"\u04da\u04db\7\u01aa\2\2\u04db\u04dc\7\13\2\2\u04dco\3\2\2\2\u04dd\u04de"+
		"\7\3\2\2\u04de\u04df\7\u01aa\2\2\u04df\u04e0\7\u018b\2\2\u04e0\u04e1\5"+
		"^\60\2\u04e1\u04e2\7\5\2\2\u04e2q\3\2\2\2\u04e3\u04e4\7\u00d4\2\2\u04e4"+
		"s\3\2\2\2\u04e5\u04e6\7\u0161\2\2\u04e6u\3\2\2\2\u04e7\u04e8\7\u00e5\2"+
		"\2\u04e8w\3\2\2\2\u04e9\u04ea\7\f\2\2\u04ea\u04eb\7\u01aa\2\2\u04eb\u04ec"+
		"\7\u018b\2\2\u04ec\u04ed\5^\60\2\u04ed\u04ee\7\r\2\2\u04eey\3\2\2\2\u04ef"+
		"\u04f0\7\16\2\2\u04f0\u0500\7\17\2\2\u04f1\u04f2\7\16\2\2\u04f2\u04f3"+
		"\5|?\2\u04f3\u04f4\7\17\2\2\u04f4\u0500\3\2\2\2\u04f5\u04f6\7\3\2\2\u04f6"+
		"\u04f7\7\16\2\2\u04f7\u04f8\7\17\2\2\u04f8\u0500\7\5\2\2\u04f9\u04fa\7"+
		"\3\2\2\u04fa\u04fb\7\16\2\2\u04fb\u04fc\5|?\2\u04fc\u04fd\7\17\2\2\u04fd"+
		"\u04fe\7\5\2\2\u04fe\u0500\3\2\2\2\u04ff\u04ef\3\2\2\2\u04ff\u04f1\3\2"+
		"\2\2\u04ff\u04f5\3\2\2\2\u04ff\u04f9\3\2\2\2\u0500{\3\2\2\2\u0501\u0502"+
		"\b?\1\2\u0502\u0503\5^\60\2\u0503\u0509\3\2\2\2\u0504\u0505\f\3\2\2\u0505"+
		"\u0506\7\7\2\2\u0506\u0508\5^\60\2\u0507\u0504\3\2\2\2\u0508\u050b\3\2"+
		"\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a}\3\2\2\2\u050b\u0509"+
		"\3\2\2\2\u050c\u050d\7\u0110\2\2\u050d\177\3\2\2\2\u050e\u050f\5R*\2\u050f"+
		"\u0081\3\2\2\2\u0510\u0514\5\u008cG\2\u0511\u0514\5R*\2\u0512\u0514\5"+
		"\u0084C\2\u0513\u0510\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0512\3\2\2\2"+
		"\u0514\u0083\3\2\2\2\u0515\u0516\7\61\2\2\u0516\u0517\5\u0086D\2\u0517"+
		"\u0518\5\u0088E\2\u0518\u0519\5\u008aF\2\u0519\u051a\5\u00a2R\2\u051a"+
		"\u051b\7\7\2\2\u051b\u051c\5\u00a2R\2\u051c\u0085\3\2\2\2\u051d\u051f"+
		"\7\u0140\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0087\3\2\2"+
		"\2\u0520\u0522\7\32\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0089\3\2\2\2\u0523\u0525\7\u00c9\2\2\u0524\u0523\3\2\2\2\u0524\u0525"+
		"\3\2\2\2\u0525\u008b\3\2\2\2\u0526\u0535\5\u008eH\2\u0527\u0535\5\u0092"+
		"J\2\u0528\u0535\5\u0096L\2\u0529\u0535\5\u0098M\2\u052a\u0535\5\u009a"+
		"N\2\u052b\u0535\5\u009cO\2\u052c\u0535\5\u009eP\2\u052d\u0535\5\u00a0"+
		"Q\2\u052e\u0535\5\u00a4S\2\u052f\u0535\5\u00a6T\2\u0530\u0535\5P)\2\u0531"+
		"\u0535\5\u00a8U\2\u0532\u0535\5\u00aaV\2\u0533\u0535\5\u00acW\2\u0534"+
		"\u0526\3\2\2\2\u0534\u0527\3\2\2\2\u0534\u0528\3\2\2\2\u0534\u0529\3\2"+
		"\2\2\u0534\u052a\3\2\2\2\u0534\u052b\3\2\2\2\u0534\u052c\3\2\2\2\u0534"+
		"\u052d\3\2\2\2\u0534\u052e\3\2\2\2\u0534\u052f\3\2\2\2\u0534\u0530\3\2"+
		"\2\2\u0534\u0531\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535"+
		"\u008d\3\2\2\2\u0536\u0537\5\u0090I\2\u0537\u008f\3\2\2\2\u0538\u0539"+
		"\t\6\2\2\u0539\u0091\3\2\2\2\u053a\u053b\7\u01aa\2\2\u053b\u0093\3\2\2"+
		"\2\u053c\u053d\7\u01aa\2\2\u053d\u0095\3\2\2\2\u053e\u053f\7\u01ad\2\2"+
		"\u053f\u0097\3\2\2\2\u0540\u0541\7\u0107\2\2\u0541\u0099\3\2\2\2\u0542"+
		"\u0543\7\u00fd\2\2\u0543\u009b\3\2\2\2\u0544\u0545\7\16\2\2\u0545\u0555"+
		"\7\17\2\2\u0546\u0547\7\16\2\2\u0547\u0548\5\u02e0\u0171\2\u0548\u0549"+
		"\7\17\2\2\u0549\u0555\3\2\2\2\u054a\u054b\7\3\2\2\u054b\u054c\7\16\2\2"+
		"\u054c\u054d\7\17\2\2\u054d\u0555\7\5\2\2\u054e\u054f\7\3\2\2\u054f\u0550"+
		"\7\16\2\2\u0550\u0551\5\u02e0\u0171\2\u0551\u0552\7\17\2\2\u0552\u0553"+
		"\7\5\2\2\u0553\u0555\3\2\2\2\u0554\u0544\3\2\2\2\u0554\u0546\3\2\2\2\u0554"+
		"\u054a\3\2\2\2\u0554\u054e\3\2\2\2\u0555\u009d\3\2\2\2\u0556\u0557\7\f"+
		"\2\2\u0557\u0558\5\u02de\u0170\2\u0558\u0559\7\r\2\2\u0559\u009f\3\2\2"+
		"\2\u055a\u055b\7?\2\2\u055b\u055c\5\u00a2R\2\u055c\u00a1\3\2\2\2\u055d"+
		"\u055e\7\u01b2\2\2\u055e\u00a3\3\2\2\2\u055f\u0560\7\3\2\2\u0560\u0561"+
		"\5\u02de\u0170\2\u0561\u0562\7\5\2\2\u0562\u00a5\3\2\2\2\u0563\u0564\7"+
		"\u0198\2\2\u0564\u00a7\3\2\2\2\u0565\u0566\7\u0171\2\2\u0566\u00a9\3\2"+
		"\2\2\u0567\u0568\7;\2\2\u0568\u0569\7\n\2\2\u0569\u056a\5P)\2\u056a\u056b"+
		"\7\7\2\2\u056b\u056c\5R*\2\u056c\u056d\7\13\2\2\u056d\u00ab\3\2\2\2\u056e"+
		"\u0597\5\u00aeX\2\u056f\u0597\5\u00b0Y\2\u0570\u0597\5\u00b2Z\2\u0571"+
		"\u0597\5\u00b4[\2\u0572\u0597\5\u00b6\\\2\u0573\u0597\5\u00b8]\2\u0574"+
		"\u0597\5\u00ba^\2\u0575\u0597\5\u00bc_\2\u0576\u0597\5\u00be`\2\u0577"+
		"\u0597\5\u00c0a\2\u0578\u0597\5\u00c2b\2\u0579\u0597\5\u00c4c\2\u057a"+
		"\u0597\5\u00c6d\2\u057b\u0597\5\u00c8e\2\u057c\u0597\5\u00caf\2\u057d"+
		"\u0597\5\u00ccg\2\u057e\u0597\5\u00ceh\2\u057f\u0597\5\u00d0i\2\u0580"+
		"\u0597\5\u00d2j\2\u0581\u0597\5\u00d4k\2\u0582\u0597\5\u00d6l\2\u0583"+
		"\u0597\5\u00d8m\2\u0584\u0597\5\u00dan\2\u0585\u0597\5\u00dco\2\u0586"+
		"\u0597\5\u00e6t\2\u0587\u0597\5\u00e8u\2\u0588\u0597\5\u00eav\2\u0589"+
		"\u0597\5\u00ecw\2\u058a\u0597\5\u00eex\2\u058b\u0597\5\u00f0y\2\u058c"+
		"\u0597\5\u00f2z\2\u058d\u0597\5\u00f4{\2\u058e\u0597\5\u00f6|\2\u058f"+
		"\u0597\5\u00f8}\2\u0590\u0597\5\u00fa~\2\u0591\u0597\5\u00fc\177\2\u0592"+
		"\u0597\5\u00fe\u0080\2\u0593\u0597\5\u0100\u0081\2\u0594\u0597\5\u0102"+
		"\u0082\2\u0595\u0597\5\u0104\u0083\2\u0596\u056e\3\2\2\2\u0596\u056f\3"+
		"\2\2\2\u0596\u0570\3\2\2\2\u0596\u0571\3\2\2\2\u0596\u0572\3\2\2\2\u0596"+
		"\u0573\3\2\2\2\u0596\u0574\3\2\2\2\u0596\u0575\3\2\2\2\u0596\u0576\3\2"+
		"\2\2\u0596\u0577\3\2\2\2\u0596\u0578\3\2\2\2\u0596\u0579\3\2\2\2\u0596"+
		"\u057a\3\2\2\2\u0596\u057b\3\2\2\2\u0596\u057c\3\2\2\2\u0596\u057d\3\2"+
		"\2\2\u0596\u057e\3\2\2\2\u0596\u057f\3\2\2\2\u0596\u0580\3\2\2\2\u0596"+
		"\u0581\3\2\2\2\u0596\u0582\3\2\2\2\u0596\u0583\3\2\2\2\u0596\u0584\3\2"+
		"\2\2\u0596\u0585\3\2\2\2\u0596\u0586\3\2\2\2\u0596\u0587\3\2\2\2\u0596"+
		"\u0588\3\2\2\2\u0596\u0589\3\2\2\2\u0596\u058a\3\2\2\2\u0596\u058b\3\2"+
		"\2\2\u0596\u058c\3\2\2\2\u0596\u058d\3\2\2\2\u0596\u058e\3\2\2\2\u0596"+
		"\u058f\3\2\2\2\u0596\u0590\3\2\2\2\u0596\u0591\3\2\2\2\u0596\u0592\3\2"+
		"\2\2\u0596\u0593\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597"+
		"\u00ad\3\2\2\2\u0598\u0599\7\23\2\2\u0599\u059a\5\u032e\u0198\2\u059a"+
		"\u059b\7\n\2\2\u059b\u059c\5^\60\2\u059c\u059d\5\u008cG\2\u059d\u059e"+
		"\7\7\2\2\u059e\u059f\5^\60\2\u059f\u05a0\5\u008cG\2\u05a0\u05a1\7\13\2"+
		"\2\u05a1\u00af\3\2\2\2\u05a2\u05a3\7\u0095\2\2\u05a3\u05a4\7\n\2\2\u05a4"+
		"\u05a5\5^\60\2\u05a5\u05a6\5\u008cG\2\u05a6\u05a7\7\7\2\2\u05a7\u05a8"+
		"\5^\60\2\u05a8\u05a9\5\u008cG\2\u05a9\u05aa\7\13\2\2\u05aa\u00b1\3\2\2"+
		"\2\u05ab\u05ac\7\u0153\2\2\u05ac\u05ad\5\u032e\u0198\2\u05ad\u05ae\7\n"+
		"\2\2\u05ae\u05af\5^\60\2\u05af\u05b0\5\u008cG\2\u05b0\u05b1\7\7\2\2\u05b1"+
		"\u05b2\5^\60\2\u05b2\u05b3\5\u008cG\2\u05b3\u05b4\7\13\2\2\u05b4\u00b3"+
		"\3\2\2\2\u05b5\u05b6\7\u00a9\2\2\u05b6\u05b7\7\n\2\2\u05b7\u05b8\5^\60"+
		"\2\u05b8\u05b9\5\u008cG\2\u05b9\u05ba\7\7\2\2\u05ba\u05bb\5^\60\2\u05bb"+
		"\u05bc\5\u008cG\2\u05bc\u05bd\7\13\2\2\u05bd\u00b5\3\2\2\2\u05be\u05bf"+
		"\7\u00eb\2\2\u05bf\u05c0\5\u032e\u0198\2\u05c0\u05c1\7\n\2\2\u05c1\u05c2"+
		"\5^\60\2\u05c2\u05c3\5\u008cG\2\u05c3\u05c4\7\7\2\2\u05c4\u05c5\5^\60"+
		"\2\u05c5\u05c6\5\u008cG\2\u05c6\u05c7\7\13\2\2\u05c7\u00b7\3\2\2\2\u05c8"+
		"\u05c9\7\u00a1\2\2\u05c9\u05ca\7\n\2\2\u05ca\u05cb\5^\60\2\u05cb\u05cc"+
		"\5\u008cG\2\u05cc\u05cd\7\7\2\2\u05cd\u05ce\5^\60\2\u05ce\u05cf\5\u008c"+
		"G\2\u05cf\u05d0\7\13\2\2\u05d0\u00b9\3\2\2\2\u05d1\u05d2\7\u0168\2\2\u05d2"+
		"\u05d3\5\u02fe\u0180\2\u05d3\u05d4\7\n\2\2\u05d4\u05d5\5^\60\2\u05d5\u05d6"+
		"\5\u008cG\2\u05d6\u05d7\7\7\2\2\u05d7\u05d8\5^\60\2\u05d8\u05d9\5\u008c"+
		"G\2\u05d9\u05da\7\13\2\2\u05da\u00bb\3\2\2\2\u05db\u05dc\7\u0136\2\2\u05dc"+
		"\u05dd\5\u02fe\u0180\2\u05dd\u05de\7\n\2\2\u05de\u05df\5^\60\2\u05df\u05e0"+
		"\5\u008cG\2\u05e0\u05e1\7\7\2\2\u05e1\u05e2\5^\60\2\u05e2\u05e3\5\u008c"+
		"G\2\u05e3\u05e4\7\13\2\2\u05e4\u00bd\3\2\2\2\u05e5\u05e6\7\u009a\2\2\u05e6"+
		"\u05e7\7\n\2\2\u05e7\u05e8\5^\60\2\u05e8\u05e9\5\u008cG\2\u05e9\u05ea"+
		"\7\7\2\2\u05ea\u05eb\5^\60\2\u05eb\u05ec\5\u008cG\2\u05ec\u05ed\7\13\2"+
		"\2\u05ed\u00bf\3\2\2\2\u05ee\u05ef\7\u0179\2\2\u05ef\u05f0\7\n\2\2\u05f0"+
		"\u05f1\5^\60\2\u05f1\u05f2\5\u008cG\2\u05f2\u05f3\7\7\2\2\u05f3\u05f4"+
		"\5^\60\2\u05f4\u05f5\5\u008cG\2\u05f5\u05f6\7\13\2\2\u05f6\u00c1\3\2\2"+
		"\2\u05f7\u05f8\7\u014c\2\2\u05f8\u05f9\7\n\2\2\u05f9\u05fa\5^\60\2\u05fa"+
		"\u05fb\5\u008cG\2\u05fb\u05fc\7\7\2\2\u05fc\u05fd\5^\60\2\u05fd\u05fe"+
		"\5\u008cG\2\u05fe\u05ff\7\13\2\2\u05ff\u00c3\3\2\2\2\u0600\u0601\7\u00a7"+
		"\2\2\u0601\u0602\7\n\2\2\u0602\u0603\5^\60\2\u0603\u0604\5\u008cG\2\u0604"+
		"\u0605\7\7\2\2\u0605\u0606\5^\60\2\u0606\u0607\5\u008cG\2\u0607\u0608"+
		"\7\13\2\2\u0608\u00c5\3\2\2\2\u0609\u060a\7\u013e\2\2\u060a\u060b\5\u032e"+
		"\u0198\2\u060b\u060c\7\n\2\2\u060c\u060d\5^\60\2\u060d\u060e\5\u008cG"+
		"\2\u060e\u060f\7\7\2\2\u060f\u0610\5^\60\2\u0610\u0611\5\u008cG\2\u0611"+
		"\u0612\7\13\2\2\u0612\u00c7\3\2\2\2\u0613\u0614\7\u00e2\2\2\u0614\u0615"+
		"\5\u02fe\u0180\2\u0615\u0616\7\n\2\2\u0616\u0617\5^\60\2\u0617\u0618\5"+
		"\u008cG\2\u0618\u0619\7\7\2\2\u0619\u061a\5^\60\2\u061a\u061b\5\u008c"+
		"G\2\u061b\u061c\7\13\2\2\u061c\u00c9\3\2\2\2\u061d\u061e\7\60\2\2\u061e"+
		"\u061f\5\u02fe\u0180\2\u061f\u0620\7\n\2\2\u0620\u0621\5^\60\2\u0621\u0622"+
		"\5\u008cG\2\u0622\u0623\7\7\2\2\u0623\u0624\5^\60\2\u0624\u0625\5\u008c"+
		"G\2\u0625\u0626\7\13\2\2\u0626\u00cb\3\2\2\2\u0627\u0628\7&\2\2\u0628"+
		"\u0629\7\n\2\2\u0629\u062a\5^\60\2\u062a\u062b\5\u008cG\2\u062b\u062c"+
		"\7\7\2\2\u062c\u062d\5^\60\2\u062d\u062e\5\u008cG\2\u062e\u062f\7\13\2"+
		"\2\u062f\u00cd\3\2\2\2\u0630\u0631\7\u0114\2\2\u0631\u0632\7\n\2\2\u0632"+
		"\u0633\5^\60\2\u0633\u0634\5\u008cG\2\u0634\u0635\7\7\2\2\u0635\u0636"+
		"\5^\60\2\u0636\u0637\5\u008cG\2\u0637\u0638\7\13\2\2\u0638\u00cf\3\2\2"+
		"\2\u0639\u063a\7\u0196\2\2\u063a\u063b\7\n\2\2\u063b\u063c\5^\60\2\u063c"+
		"\u063d\5\u008cG\2\u063d\u063e\7\7\2\2\u063e\u063f\5^\60\2\u063f\u0640"+
		"\5\u008cG\2\u0640\u0641\7\13\2\2\u0641\u00d1\3\2\2\2\u0642\u0643\7\u0092"+
		"\2\2\u0643\u0644\7\n\2\2\u0644\u0645\5^\60\2\u0645\u0646\5\u008cG\2\u0646"+
		"\u0647\7\7\2\2\u0647\u0648\5^\60\2\u0648\u0649\5\u008cG\2\u0649\u064a"+
		"\7\13\2\2\u064a\u00d3\3\2\2\2\u064b\u064c\7\u00c7\2\2\u064c\u064d\7\n"+
		"\2\2\u064d\u064e\5^\60\2\u064e\u064f\5\u008cG\2\u064f\u0650\7\7\2\2\u0650"+
		"\u0651\5^\60\2\u0651\u0652\5\u008cG\2\u0652\u0653\7\7\2\2\u0653\u0654"+
		"\5^\60\2\u0654\u0655\5\u008cG\2\u0655\u0656\7\13\2\2\u0656\u00d5\3\2\2"+
		"\2\u0657\u0658\7\u013f\2\2\u0658\u0659\7\n\2\2\u0659\u065a\5^\60\2\u065a"+
		"\u065b\5\u008cG\2\u065b\u065c\7\7\2\2\u065c\u065d\5^\60\2\u065d\u065e"+
		"\5\u008cG\2\u065e\u065f\7\7\2\2\u065f\u0660\5^\60\2\u0660\u0661\5\u008c"+
		"G\2\u0661\u0662\7\13\2\2\u0662\u00d7\3\2\2\2\u0663\u0664\7\u0093\2\2\u0664"+
		"\u0665\7\n\2\2\u0665\u0666\5^\60\2\u0666\u0667\5\u008cG\2\u0667\u0668"+
		"\5\u0318\u018d\2\u0668\u0669\7\13\2\2\u0669\u00d9\3\2\2\2\u066a\u066b"+
		"\7\u00c8\2\2\u066b\u066c\7\n\2\2\u066c\u066d\5^\60\2\u066d\u066e\5\u008c"+
		"G\2\u066e\u066f\7\7\2\2\u066f\u0670\5^\60\2\u0670\u0671\5\u008cG\2\u0671"+
		"\u0672\5\u0318\u018d\2\u0672\u0673\7\13\2\2\u0673\u00db\3\2\2\2\u0674"+
		"\u0675\7\u00ad\2\2\u0675\u0676\5\u0316\u018c\2\u0676\u0677\7\n\2\2\u0677"+
		"\u0678\5^\60\2\u0678\u0679\7\7\2\2\u0679\u067a\5^\60\2\u067a\u067b\5\u008c"+
		"G\2\u067b\u067c\7\7\2\2\u067c\u067d\5\u00dep\2\u067d\u067e\7\13\2\2\u067e"+
		"\u00dd\3\2\2\2\u067f\u0681\5\u00e0q\2\u0680\u067f\3\2\2\2\u0680\u0681"+
		"\3\2\2\2\u0681\u00df\3\2\2\2\u0682\u0683\bq\1\2\u0683\u0684\5\u00e2r\2"+
		"\u0684\u068a\3\2\2\2\u0685\u0686\f\3\2\2\u0686\u0687\7\7\2\2\u0687\u0689"+
		"\5\u00e2r\2\u0688\u0685\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2"+
		"\2\u068a\u068b\3\2\2\2\u068b\u00e1\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u068e"+
		"\5\u00e4s\2\u068e\u068f\5^\60\2\u068f\u0690\5\u008cG\2\u0690\u00e3\3\2"+
		"\2\2\u0691\u0693\7\u00c5\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693"+
		"\u00e5\3\2\2\2\u0694\u0695\7\u0164\2\2\u0695\u0696\7\n\2\2\u0696\u0697"+
		"\5^\60\2\u0697\u0698\5\u008cG\2\u0698\u0699\7\u0160\2\2\u0699\u069a\5"+
		"^\60\2\u069a\u069b\7\13\2\2\u069b\u00e7\3\2\2\2\u069c\u069d\7\u0199\2"+
		"\2\u069d\u069e\7\n\2\2\u069e\u069f\5^\60\2\u069f\u06a0\5\u008cG\2\u06a0"+
		"\u06a1\7\u0160\2\2\u06a1\u06a2\5^\60\2\u06a2\u06a3\7\13\2\2\u06a3\u00e9"+
		"\3\2\2\2\u06a4\u06a5\7\u013b\2\2\u06a5\u06a6\7\n\2\2\u06a6\u06a7\5^\60"+
		"\2\u06a7\u06a8\5\u008cG\2\u06a8\u06a9\7\u0160\2\2\u06a9\u06aa\5^\60\2"+
		"\u06aa\u06ab\7\13\2\2\u06ab\u00eb\3\2\2\2\u06ac\u06ad\7\u00a6\2\2\u06ad"+
		"\u06ae\7\n\2\2\u06ae\u06af\5^\60\2\u06af\u06b0\5\u008cG\2\u06b0\u06b1"+
		"\7\u0160\2\2\u06b1\u06b2\5^\60\2\u06b2\u06b3\7\13\2\2\u06b3\u00ed\3\2"+
		"\2\2\u06b4\u06b5\7\u00a3\2\2\u06b5\u06b6\7\n\2\2\u06b6\u06b7\5^\60\2\u06b7"+
		"\u06b8\5\u008cG\2\u06b8\u06b9\7\u0160\2\2\u06b9\u06ba\5^\60\2\u06ba\u06bb"+
		"\7\13\2\2\u06bb\u00ef\3\2\2\2\u06bc\u06bd\7\u00a5\2\2\u06bd\u06be\7\n"+
		"\2\2\u06be\u06bf\5^\60\2\u06bf\u06c0\5\u008cG\2\u06c0\u06c1\7\u0160\2"+
		"\2\u06c1\u06c2\5^\60\2\u06c2\u06c3\7\13\2\2\u06c3\u00f1\3\2\2\2\u06c4"+
		"\u06c5\7\u00a4\2\2\u06c5\u06c6\7\n\2\2\u06c6\u06c7\5^\60\2\u06c7\u06c8"+
		"\5\u008cG\2\u06c8\u06c9\7\u0160\2\2\u06c9\u06ca\5^\60\2\u06ca\u06cb\7"+
		"\13\2\2\u06cb\u00f3\3\2\2\2\u06cc\u06cd\7\u016c\2\2\u06cd\u06ce\7\n\2"+
		"\2\u06ce\u06cf\5^\60\2\u06cf\u06d0\5\u008cG\2\u06d0\u06d1\7\u0160\2\2"+
		"\u06d1\u06d2\5^\60\2\u06d2\u06d3\7\13\2\2\u06d3\u00f5\3\2\2\2\u06d4\u06d5"+
		"\7\u0142\2\2\u06d5\u06d6\7\n\2\2\u06d6\u06d7\5^\60\2\u06d7\u06d8\5\u008c"+
		"G\2\u06d8\u06d9\7\u0160\2\2\u06d9\u06da\5^\60\2\u06da\u06db\7\13\2\2\u06db"+
		"\u00f7\3\2\2\2\u06dc\u06dd\7\u0120\2\2\u06dd\u06de\7\n\2\2\u06de\u06df"+
		"\5^\60\2\u06df\u06e0\5\u008cG\2\u06e0\u06e1\7\u0160\2\2\u06e1\u06e2\5"+
		"^\60\2\u06e2\u06e3\7\13\2\2\u06e3\u00f9\3\2\2\2\u06e4\u06e5\7\u00cc\2"+
		"\2\u06e5\u06e6\7\n\2\2\u06e6\u06e7\5^\60\2\u06e7\u06e8\5\u008cG\2\u06e8"+
		"\u06e9\7\u0160\2\2\u06e9\u06ea\5^\60\2\u06ea\u06eb\7\13\2\2\u06eb\u00fb"+
		"\3\2\2\2\u06ec\u06ed\7:\2\2\u06ed\u06ee\7\n\2\2\u06ee\u06ef\5^\60\2\u06ef"+
		"\u06f0\5\u008cG\2\u06f0\u06f1\7\u0160\2\2\u06f1\u06f2\5^\60\2\u06f2\u06f3"+
		"\7\13\2\2\u06f3\u00fd\3\2\2\2\u06f4\u06f5\7\25\2\2\u06f5\u06f6\7\n\2\2"+
		"\u06f6\u06f7\5^\60\2\u06f7\u06f8\5\u008cG\2\u06f8\u06f9\7\u0160\2\2\u06f9"+
		"\u06fa\5^\60\2\u06fa\u06fb\7\13\2\2\u06fb\u00ff\3\2\2\2\u06fc\u06fd\7"+
		"\u00b8\2\2\u06fd\u06fe\5\u031e\u0190\2\u06fe\u06ff\7\n\2\2\u06ff\u0700"+
		"\5^\60\2\u0700\u0701\5\u008cG\2\u0701\u0702\7\7\2\2\u0702\u0703\5^\60"+
		"\2\u0703\u0704\5\u008cG\2\u0704\u0705\7\13\2\2\u0705\u0101\3\2\2\2\u0706"+
		"\u0707\7\u0099\2\2\u0707\u0708\5\u030e\u0188\2\u0708\u0709\7\n\2\2\u0709"+
		"\u070a\5^\60\2\u070a\u070b\5\u008cG\2\u070b\u070c\7\7\2\2\u070c\u070d"+
		"\5^\60\2\u070d\u070e\5\u008cG\2\u070e\u070f\7\13\2\2\u070f\u0103\3\2\2"+
		"\2\u0710\u0711\7\u0138\2\2\u0711\u0712\7\n\2\2\u0712\u0713\5^\60\2\u0713"+
		"\u0714\5\u008cG\2\u0714\u0715\7\7\2\2\u0715\u0716\5^\60\2\u0716\u0717"+
		"\5\u008cG\2\u0717\u0718\7\7\2\2\u0718\u0719\5^\60\2\u0719\u071a\5\u008c"+
		"G\2\u071a\u071b\7\13\2\2\u071b\u0105\3\2\2\2\u071c\u071d\b\u0084\1\2\u071d"+
		"\u071e\5\u0108\u0085\2\u071e\u0723\3\2\2\2\u071f\u0720\f\3\2\2\u0720\u0722"+
		"\5\u0108\u0085\2\u0721\u071f\3\2\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3"+
		"\2\2\2\u0723\u0724\3\2\2\2\u0724\u0107\3\2\2\2\u0725\u0723\3\2\2\2\u0726"+
		"\u0727\5\u010a\u0086\2\u0727\u0728\5\u010c\u0087\2\u0728\u0729\5\u0192"+
		"\u00ca\2\u0729\u0109\3\2\2\2\u072a\u072c\5T+\2\u072b\u072a\3\2\2\2\u072b"+
		"\u072c\3\2\2\2\u072c\u010b\3\2\2\2\u072d\u072f\5\u010e\u0088\2\u072e\u072d"+
		"\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u010d\3\2\2\2\u0730\u0731\b\u0088\1"+
		"\2\u0731\u0732\5\u0110\u0089\2\u0732\u0737\3\2\2\2\u0733\u0734\f\3\2\2"+
		"\u0734\u0736\5\u0110\u0089\2\u0735\u0733\3\2\2\2\u0736\u0739\3\2\2\2\u0737"+
		"\u0735\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u010f\3\2\2\2\u0739\u0737\3\2"+
		"\2\2\u073a\u0744\5\u014a\u00a6\2\u073b\u0744\5\u014c\u00a7\2\u073c\u0744"+
		"\5\u014e\u00a8\2\u073d\u0744\5\u0152\u00aa\2\u073e\u073f\5R*\2\u073f\u0740"+
		"\7\4\2\2\u0740\u0741\5\u0112\u008a\2\u0741\u0744\3\2\2\2\u0742\u0744\5"+
		"\u0112\u008a\2\u0743\u073a\3\2\2\2\u0743\u073b\3\2\2\2\u0743\u073c\3\2"+
		"\2\2\u0743\u073d\3\2\2\2\u0743\u073e\3\2\2\2\u0743\u0742\3\2\2\2\u0744"+
		"\u0111\3\2\2\2\u0745\u0776\5\u0114\u008b\2\u0746\u0776\5\u0116\u008c\2"+
		"\u0747\u0776\5\u0118\u008d\2\u0748\u0776\5\u011a\u008e\2\u0749\u0776\5"+
		"\u011c\u008f\2\u074a\u0776\5\u011e\u0090\2\u074b\u0776\5\u0120\u0091\2"+
		"\u074c\u0776\5\u0122\u0092\2\u074d\u0776\5\u0124\u0093\2\u074e\u0776\5"+
		"\u0126\u0094\2\u074f\u0776\5\u0128\u0095\2\u0750\u0776\5\u012a\u0096\2"+
		"\u0751\u0776\5\u012c\u0097\2\u0752\u0776\5\u012e\u0098\2\u0753\u0776\5"+
		"\u0130\u0099\2\u0754\u0776\5\u0132\u009a\2\u0755\u0776\5\u0134\u009b\2"+
		"\u0756\u0776\5\u0136\u009c\2\u0757\u0776\5\u0138\u009d\2\u0758\u0776\5"+
		"\u013a\u009e\2\u0759\u0776\5\u013c\u009f\2\u075a\u0776\5\u013e\u00a0\2"+
		"\u075b\u0776\5\u0140\u00a1\2\u075c\u0776\5\u0142\u00a2\2\u075d\u0776\5"+
		"\u0148\u00a5\2\u075e\u0776\5\u0156\u00ac\2\u075f\u0776\5\u0158\u00ad\2"+
		"\u0760\u0776\5\u015a\u00ae\2\u0761\u0776\5\u015c\u00af\2\u0762\u0776\5"+
		"\u015e\u00b0\2\u0763\u0776\5\u0160\u00b1\2\u0764\u0776\5\u0162\u00b2\2"+
		"\u0765\u0776\5\u0164\u00b3\2\u0766\u0776\5\u0166\u00b4\2\u0767\u0776\5"+
		"\u0168\u00b5\2\u0768\u0776\5\u016a\u00b6\2\u0769\u0776\5\u016c\u00b7\2"+
		"\u076a\u0776\5\u016e\u00b8\2\u076b\u0776\5\u0170\u00b9\2\u076c\u0776\5"+
		"\u0172\u00ba\2\u076d\u0776\5\u0174\u00bb\2\u076e\u0776\5\u0176\u00bc\2"+
		"\u076f\u0776\5\u017c\u00bf\2\u0770\u0776\5\u017e\u00c0\2\u0771\u0776\5"+
		"\u0182\u00c2\2\u0772\u0776\5\u0184\u00c3\2\u0773\u0776\5\u018e\u00c8\2"+
		"\u0774\u0776\5\u0190\u00c9\2\u0775\u0745\3\2\2\2\u0775\u0746\3\2\2\2\u0775"+
		"\u0747\3\2\2\2\u0775\u0748\3\2\2\2\u0775\u0749\3\2\2\2\u0775\u074a\3\2"+
		"\2\2\u0775\u074b\3\2\2\2\u0775\u074c\3\2\2\2\u0775\u074d\3\2\2\2\u0775"+
		"\u074e\3\2\2\2\u0775\u074f\3\2\2\2\u0775\u0750\3\2\2\2\u0775\u0751\3\2"+
		"\2\2\u0775\u0752\3\2\2\2\u0775\u0753\3\2\2\2\u0775\u0754\3\2\2\2\u0775"+
		"\u0755\3\2\2\2\u0775\u0756\3\2\2\2\u0775\u0757\3\2\2\2\u0775\u0758\3\2"+
		"\2\2\u0775\u0759\3\2\2\2\u0775\u075a\3\2\2\2\u0775\u075b\3\2\2\2\u0775"+
		"\u075c\3\2\2\2\u0775\u075d\3\2\2\2\u0775\u075e\3\2\2\2\u0775\u075f\3\2"+
		"\2\2\u0775\u0760\3\2\2\2\u0775\u0761\3\2\2\2\u0775\u0762\3\2\2\2\u0775"+
		"\u0763\3\2\2\2\u0775\u0764\3\2\2\2\u0775\u0765\3\2\2\2\u0775\u0766\3\2"+
		"\2\2\u0775\u0767\3\2\2\2\u0775\u0768\3\2\2\2\u0775\u0769\3\2\2\2\u0775"+
		"\u076a\3\2\2\2\u0775\u076b\3\2\2\2\u0775\u076c\3\2\2\2\u0775\u076d\3\2"+
		"\2\2\u0775\u076e\3\2\2\2\u0775\u076f\3\2\2\2\u0775\u0770\3\2\2\2\u0775"+
		"\u0771\3\2\2\2\u0775\u0772\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0774\3\2"+
		"\2\2\u0776\u0113\3\2\2\2\u0777\u0778\7\23\2\2\u0778\u0779\5\u032e\u0198"+
		"\2\u0779\u077a\5^\60\2\u077a\u077b\5\u0082B\2\u077b\u077c\7\7\2\2\u077c"+
		"\u077d\5\u0082B\2\u077d\u077e\5\u01ca\u00e6\2\u077e\u0115\3\2\2\2\u077f"+
		"\u0780\7\u0095\2\2\u0780\u0781\5\u0308\u0185\2\u0781\u0782\5^\60\2\u0782"+
		"\u0783\5\u0082B\2\u0783\u0784\7\7\2\2\u0784\u0785\5\u0082B\2\u0785\u0786"+
		"\5\u01ca\u00e6\2\u0786\u0117\3\2\2\2\u0787\u0788\7\u0153\2\2\u0788\u0789"+
		"\5\u032e\u0198\2\u0789\u078a\5^\60\2\u078a\u078b\5\u0082B\2\u078b\u078c"+
		"\7\7\2\2\u078c\u078d\5\u0082B\2\u078d\u078e\5\u01ca\u00e6\2\u078e\u0119"+
		"\3\2\2\2\u078f\u0790\7\u00a9\2\2\u0790\u0791\5\u0308\u0185\2\u0791\u0792"+
		"\5^\60\2\u0792\u0793\5\u0082B\2\u0793\u0794\7\7\2\2\u0794\u0795\5\u0082"+
		"B\2\u0795\u0796\5\u01ca\u00e6\2\u0796\u011b\3\2\2\2\u0797\u0798\7\u00eb"+
		"\2\2\u0798\u0799\5\u032e\u0198\2\u0799\u079a\5^\60\2\u079a\u079b\5\u0082"+
		"B\2\u079b\u079c\7\7\2\2\u079c\u079d\5\u0082B\2\u079d\u079e\5\u01ca\u00e6"+
		"\2\u079e\u011d\3\2\2\2\u079f\u07a0\7\u00a1\2\2\u07a0\u07a1\5\u0308\u0185"+
		"\2\u07a1\u07a2\5^\60\2\u07a2\u07a3\5\u0082B\2\u07a3\u07a4\7\7\2\2\u07a4"+
		"\u07a5\5\u0082B\2\u07a5\u07a6\5\u01ca\u00e6\2\u07a6\u011f\3\2\2\2\u07a7"+
		"\u07a8\7\u0168\2\2\u07a8\u07a9\5\u02fe\u0180\2\u07a9\u07aa\5^\60\2\u07aa"+
		"\u07ab\5\u0082B\2\u07ab\u07ac\7\7\2\2\u07ac\u07ad\5\u0082B\2\u07ad\u07ae"+
		"\5\u01ca\u00e6\2\u07ae\u0121\3\2\2\2\u07af\u07b0\7\u0136\2\2\u07b0\u07b1"+
		"\5\u02fe\u0180\2\u07b1\u07b2\5^\60\2\u07b2\u07b3\5\u0082B\2\u07b3\u07b4"+
		"\7\7\2\2\u07b4\u07b5\5\u0082B\2\u07b5\u07b6\5\u01ca\u00e6\2\u07b6\u0123"+
		"\3\2\2\2\u07b7\u07b8\7\u009a\2\2\u07b8\u07b9\5\u0308\u0185\2\u07b9\u07ba"+
		"\5^\60\2\u07ba\u07bb\5\u0082B\2\u07bb\u07bc\7\7\2\2\u07bc\u07bd\5\u0082"+
		"B\2\u07bd\u07be\5\u01ca\u00e6\2\u07be\u0125\3\2\2\2\u07bf\u07c0\7\u0179"+
		"\2\2\u07c0\u07c1\5^\60\2\u07c1\u07c2\5\u0082B\2\u07c2\u07c3\7\7\2\2\u07c3"+
		"\u07c4\5\u0082B\2\u07c4\u07c5\5\u01ca\u00e6\2\u07c5\u0127\3\2\2\2\u07c6"+
		"\u07c7\7\u014c\2\2\u07c7\u07c8\5^\60\2\u07c8\u07c9\5\u0082B\2\u07c9\u07ca"+
		"\7\7\2\2\u07ca\u07cb\5\u0082B\2\u07cb\u07cc\5\u01ca\u00e6\2\u07cc\u0129"+
		"\3\2\2\2\u07cd\u07ce\7\u00a7\2\2\u07ce\u07cf\5\u0308\u0185\2\u07cf\u07d0"+
		"\5^\60\2\u07d0\u07d1\5\u0082B\2\u07d1\u07d2\7\7\2\2\u07d2\u07d3\5\u0082"+
		"B\2\u07d3\u07d4\5\u01ca\u00e6\2\u07d4\u012b\3\2\2\2\u07d5\u07d6\7\u013e"+
		"\2\2\u07d6\u07d7\5\u032e\u0198\2\u07d7\u07d8\5^\60\2\u07d8\u07d9\5\u0082"+
		"B\2\u07d9\u07da\7\7\2\2\u07da\u07db\5\u0082B\2\u07db\u07dc\5\u01ca\u00e6"+
		"\2\u07dc\u012d\3\2\2\2\u07dd\u07de\7\u00e2\2\2\u07de\u07df\5\u02fe\u0180"+
		"\2\u07df\u07e0\5^\60\2\u07e0\u07e1\5\u0082B\2\u07e1\u07e2\7\7\2\2\u07e2"+
		"\u07e3\5\u0082B\2\u07e3\u07e4\5\u01ca\u00e6\2\u07e4\u012f\3\2\2\2\u07e5"+
		"\u07e6\7\60\2\2\u07e6\u07e7\5\u02fe\u0180\2\u07e7\u07e8\5^\60\2\u07e8"+
		"\u07e9\5\u0082B\2\u07e9\u07ea\7\7\2\2\u07ea\u07eb\5\u0082B\2\u07eb\u07ec"+
		"\5\u01ca\u00e6\2\u07ec\u0131\3\2\2\2\u07ed\u07ee\7&\2\2\u07ee\u07ef\5"+
		"^\60\2\u07ef\u07f0\5\u0082B\2\u07f0\u07f1\7\7\2\2\u07f1\u07f2\5\u0082"+
		"B\2\u07f2\u07f3\5\u01ca\u00e6\2\u07f3\u0133\3\2\2\2\u07f4\u07f5\7\u0114"+
		"\2\2\u07f5\u07f6\5^\60\2\u07f6\u07f7\5\u0082B\2\u07f7\u07f8\7\7\2\2\u07f8"+
		"\u07f9\5\u0082B\2\u07f9\u07fa\5\u01ca\u00e6\2\u07fa\u0135\3\2\2\2\u07fb"+
		"\u07fc\7\u0196\2\2\u07fc\u07fd\5^\60\2\u07fd\u07fe\5\u0082B\2\u07fe\u07ff"+
		"\7\7\2\2\u07ff\u0800\5\u0082B\2\u0800\u0801\5\u01ca\u00e6\2\u0801\u0137"+
		"\3\2\2\2\u0802\u0803\7\u0092\2\2\u0803\u0804\5^\60\2\u0804\u0805\5\u0082"+
		"B\2\u0805\u0806\7\7\2\2\u0806\u0807\5^\60\2\u0807\u0808\5\u0082B\2\u0808"+
		"\u0809\5\u01ca\u00e6\2\u0809\u0139\3\2\2\2\u080a\u080b\7\u00c7\2\2\u080b"+
		"\u080c\5^\60\2\u080c\u080d\5\u0082B\2\u080d\u080e\7\7\2\2\u080e\u080f"+
		"\5^\60\2\u080f\u0810\5\u0082B\2\u0810\u0811\7\7\2\2\u0811\u0812\5^\60"+
		"\2\u0812\u0813\5\u0082B\2\u0813\u0814\5\u01ca\u00e6\2\u0814\u013b\3\2"+
		"\2\2\u0815\u0816\7\u013f\2\2\u0816\u0817\5^\60\2\u0817\u0818\5\u0082B"+
		"\2\u0818\u0819\7\7\2\2\u0819\u081a\5^\60\2\u081a\u081b\5\u0082B\2\u081b"+
		"\u081c\7\7\2\2\u081c\u081d\5^\60\2\u081d\u081e\5\u0082B\2\u081e\u081f"+
		"\5\u01ca\u00e6\2\u081f\u013d\3\2\2\2\u0820\u0821\7\u0093\2\2\u0821\u0822"+
		"\5^\60\2\u0822\u0823\5\u0082B\2\u0823\u0824\7\7\2\2\u0824\u0825\5\u031a"+
		"\u018e\2\u0825\u0826\5\u01ca\u00e6\2\u0826\u013f\3\2\2\2\u0827\u0828\7"+
		"\u00c8\2\2\u0828\u0829\5^\60\2\u0829\u082a\5\u0082B\2\u082a\u082b\7\7"+
		"\2\2\u082b\u082c\5^\60\2\u082c\u082d\5\u0082B\2\u082d\u082e\7\7\2\2\u082e"+
		"\u082f\5\u031a\u018e\2\u082f\u0830\5\u01ca\u00e6\2\u0830\u0141\3\2\2\2"+
		"\u0831\u0832\7\33\2\2\u0832\u0833\5\u0144\u00a3\2\u0833\u0834\5\u0146"+
		"\u00a4\2\u0834\u0835\5^\60\2\u0835\u0836\5\u01ca\u00e6\2\u0836\u087e\3"+
		"\2\2\2\u0837\u0838\7\33\2\2\u0838\u0839\5\u0144\u00a3\2\u0839\u083a\5"+
		"\u0146\u00a4\2\u083a\u083b\5^\60\2\u083b\u083c\7\7\2\2\u083c\u083d\5\u02e4"+
		"\u0173\2\u083d\u083e\5\u01ca\u00e6\2\u083e\u087e\3\2\2\2\u083f\u0840\7"+
		"\33\2\2\u0840\u0841\5\u0144\u00a3\2\u0841\u0842\5\u0146\u00a4\2\u0842"+
		"\u0843\5^\60\2\u0843\u0844\7\7\2\2\u0844\u0845\5^\60\2\u0845\u0846\5\u0082"+
		"B\2\u0846\u0847\5\u01ca\u00e6\2\u0847\u087e\3\2\2\2\u0848\u0849\7\33\2"+
		"\2\u0849\u084a\5\u0144\u00a3\2\u084a\u084b\5\u0146\u00a4\2\u084b\u084c"+
		"\5^\60\2\u084c\u084d\7\7\2\2\u084d\u084e\5^\60\2\u084e\u084f\5\u0082B"+
		"\2\u084f\u0850\7\7\2\2\u0850\u0851\5\u02e4\u0173\2\u0851\u0852\5\u01ca"+
		"\u00e6\2\u0852\u087e\3\2\2\2\u0853\u0854\7\33\2\2\u0854\u0855\5\u0144"+
		"\u00a3\2\u0855\u0856\5\u0146\u00a4\2\u0856\u0857\5^\60\2\u0857\u0858\7"+
		"\7\2\2\u0858\u0859\5n8\2\u0859\u085a\5\u01ca\u00e6\2\u085a\u087e\3\2\2"+
		"\2\u085b\u085c\7\33\2\2\u085c\u085d\5\u0144\u00a3\2\u085d\u085e\5\u0146"+
		"\u00a4\2\u085e\u085f\5^\60\2\u085f\u0860\7\7\2\2\u0860\u0861\5\u02e4\u0173"+
		"\2\u0861\u0862\7\7\2\2\u0862\u0863\5n8\2\u0863\u0864\5\u01ca\u00e6\2\u0864"+
		"\u087e\3\2\2\2\u0865\u0866\7\33\2\2\u0866\u0867\5\u0144\u00a3\2\u0867"+
		"\u0868\5\u0146\u00a4\2\u0868\u0869\5^\60\2\u0869\u086a\7\7\2\2\u086a\u086b"+
		"\5^\60\2\u086b\u086c\5\u0082B\2\u086c\u086d\7\7\2\2\u086d\u086e\5n8\2"+
		"\u086e\u086f\5\u01ca\u00e6\2\u086f\u087e\3\2\2\2\u0870\u0871\7\33\2\2"+
		"\u0871\u0872\5\u0144\u00a3\2\u0872\u0873\5\u0146\u00a4\2\u0873\u0874\5"+
		"^\60\2\u0874\u0875\7\7\2\2\u0875\u0876\5^\60\2\u0876\u0877\5\u0082B\2"+
		"\u0877\u0878\7\7\2\2\u0878\u0879\5\u02e4\u0173\2\u0879\u087a\7\7\2\2\u087a"+
		"\u087b\5n8\2\u087b\u087c\5\u01ca\u00e6\2\u087c\u087e\3\2\2\2\u087d\u0831"+
		"\3\2\2\2\u087d\u0837\3\2\2\2\u087d\u083f\3\2\2\2\u087d\u0848\3\2\2\2\u087d"+
		"\u0853\3\2\2\2\u087d\u085b\3\2\2\2\u087d\u0865\3\2\2\2\u087d\u0870\3\2"+
		"\2\2\u087e\u0143\3\2\2\2\u087f\u0881\7\u00be\2\2\u0880\u087f\3\2\2\2\u0880"+
		"\u0881\3\2\2\2\u0881\u0145\3\2\2\2\u0882\u0884\7\u0155\2\2\u0883\u0882"+
		"\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0147\3\2\2\2\u0885\u0887\7\u00dd\2"+
		"\2\u0886\u0888\7\u019a\2\2\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888"+
		"\u0889\3\2\2\2\u0889\u088a\5^\60\2\u088a\u088b\7\7\2\2\u088b\u088c\5^"+
		"\60\2\u088c\u088d\5\u0082B\2\u088d\u088e\5\u01ca\u00e6\2\u088e\u08b8\3"+
		"\2\2\2\u088f\u0891\7\u00dd\2\2\u0890\u0892\7\u019a\2\2\u0891\u0890\3\2"+
		"\2\2\u0891\u0892\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0894\5^\60\2\u0894"+
		"\u0895\7\7\2\2\u0895\u0896\5^\60\2\u0896\u0897\5\u0082B\2\u0897\u0898"+
		"\7\7\2\2\u0898\u0899\5\u02e4\u0173\2\u0899\u089a\5\u01ca\u00e6\2\u089a"+
		"\u08b8\3\2\2\2\u089b\u089c\7\u00dd\2\2\u089c\u089e\7\62\2\2\u089d\u089f"+
		"\7\u019a\2\2\u089e\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2"+
		"\2\u08a0\u08a1\5^\60\2\u08a1\u08a2\7\7\2\2\u08a2\u08a3\5^\60\2\u08a3\u08a4"+
		"\5\u0082B\2\u08a4\u08a5\5\u034e\u01a8\2\u08a5\u08a6\5\u02ee\u0178\2\u08a6"+
		"\u08a7\5\u01ca\u00e6\2\u08a7\u08b8\3\2\2\2\u08a8\u08a9\7\u00dd\2\2\u08a9"+
		"\u08ab\7\62\2\2\u08aa\u08ac\7\u019a\2\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac"+
		"\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\5^\60\2\u08ae\u08af\7\7\2\2\u08af"+
		"\u08b0\5^\60\2\u08b0\u08b1\5\u0082B\2\u08b1\u08b2\5\u034e\u01a8\2\u08b2"+
		"\u08b3\5\u02ee\u0178\2\u08b3\u08b4\7\7\2\2\u08b4\u08b5\5\u02e4\u0173\2"+
		"\u08b5\u08b6\5\u01ca\u00e6\2\u08b6\u08b8\3\2\2\2\u08b7\u0885\3\2\2\2\u08b7"+
		"\u088f\3\2\2\2\u08b7\u089b\3\2\2\2\u08b7\u08a8\3\2\2\2\u08b8\u0149\3\2"+
		"\2\2\u08b9\u08bb\7\u0151\2\2\u08ba\u08bc\7\u019a\2\2\u08bb\u08ba\3\2\2"+
		"\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08be\5^\60\2\u08be\u08bf"+
		"\5\u0082B\2\u08bf\u08c0\7\7\2\2\u08c0\u08c1\5^\60\2\u08c1\u08c2\5\u0082"+
		"B\2\u08c2\u08c3\5\u01ca\u00e6\2\u08c3\u08f0\3\2\2\2\u08c4\u08c6\7\u0151"+
		"\2\2\u08c5\u08c7\7\u019a\2\2\u08c6\u08c5\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7"+
		"\u08c8\3\2\2\2\u08c8\u08c9\5^\60\2\u08c9\u08ca\5\u0082B\2\u08ca\u08cb"+
		"\7\7\2\2\u08cb\u08cc\5^\60\2\u08cc\u08cd\5\u0082B\2\u08cd\u08ce\7\7\2"+
		"\2\u08ce\u08cf\5\u02e4\u0173\2\u08cf\u08d0\5\u01ca\u00e6\2\u08d0\u08f0"+
		"\3\2\2\2\u08d1\u08d2\7\u0151\2\2\u08d2\u08d4\7\62\2\2\u08d3\u08d5\7\u019a"+
		"\2\2\u08d4\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6"+
		"\u08d7\5^\60\2\u08d7\u08d8\5\u0082B\2\u08d8\u08d9\7\7\2\2\u08d9\u08da"+
		"\5^\60\2\u08da\u08db\5\u0082B\2\u08db\u08dc\5\u034e\u01a8\2\u08dc\u08dd"+
		"\5\u02ee\u0178\2\u08dd\u08de\5\u01ca\u00e6\2\u08de\u08f0\3\2\2\2\u08df"+
		"\u08e0\7\u0151\2\2\u08e0\u08e2\7\62\2\2\u08e1\u08e3\7\u019a\2\2\u08e2"+
		"\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\5^"+
		"\60\2\u08e5\u08e6\5\u0082B\2\u08e6\u08e7\7\7\2\2\u08e7\u08e8\5^\60\2\u08e8"+
		"\u08e9\5\u0082B\2\u08e9\u08ea\5\u034e\u01a8\2\u08ea\u08eb\5\u02ee\u0178"+
		"\2\u08eb\u08ec\7\7\2\2\u08ec\u08ed\5\u02e4\u0173\2\u08ed\u08ee\5\u01ca"+
		"\u00e6\2\u08ee\u08f0\3\2\2\2\u08ef\u08b9\3\2\2\2\u08ef\u08c4\3\2\2\2\u08ef"+
		"\u08d1\3\2\2\2\u08ef\u08df\3\2\2\2\u08f0\u014b\3\2\2\2\u08f1\u08f2\7\u009b"+
		"\2\2\u08f2\u08f3\5\u034e\u01a8\2\u08f3\u08f4\5\u02ee\u0178\2\u08f4\u08f5"+
		"\5\u01ca\u00e6\2\u08f5\u014d\3\2\2\2\u08f6\u08f7\7N\2\2\u08f7\u08f9\5"+
		"\u0150\u00a9\2\u08f8\u08fa\7\u019a\2\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\5^\60\2\u08fc\u08fd\5\u0082B"+
		"\2\u08fd\u08fe\7\7\2\2\u08fe\u08ff\5^\60\2\u08ff\u0900\5\u0082B\2\u0900"+
		"\u0901\7\7\2\2\u0901\u0902\5^\60\2\u0902\u0903\5\u0082B\2\u0903\u0904"+
		"\5\u034e\u01a8\2\u0904\u0905\5\u02ee\u0178\2\u0905\u0906\5\u02ee\u0178"+
		"\2\u0906\u0907\5\u01ca\u00e6\2\u0907\u014f\3\2\2\2\u0908\u090a\7\u0185"+
		"\2\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u090a\u0151\3\2\2\2\u090b\u090d\7\63\2\2\u090c\u090e\7\u019a\2\2\u090d"+
		"\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\5\u0154"+
		"\u00ab\2\u0910\u0911\5^\60\2\u0911\u0912\5\u0082B\2\u0912\u0913\7\7\2"+
		"\2\u0913\u0914\5^\60\2\u0914\u0915\5\u0082B\2\u0915\u0916\5\u034e\u01a8"+
		"\2\u0916\u0917\5\u02ee\u0178\2\u0917\u0918\5\u01ca\u00e6\2\u0918\u0153"+
		"\3\2\2\2\u0919\u091a\t\7\2\2\u091a\u0155\3\2\2\2\u091b\u091c\7\u00ad\2"+
		"\2\u091c\u091d\5\u0316\u018c\2\u091d\u091e\5^\60\2\u091e\u091f\7\7\2\2"+
		"\u091f\u0920\5^\60\2\u0920\u0921\5\u0082B\2\u0921\u0922\5\u01ca\u00e6"+
		"\2\u0922\u092e\3\2\2\2\u0923\u0924\7\u00ad\2\2\u0924\u0925\5\u0316\u018c"+
		"\2\u0925\u0926\5^\60\2\u0926\u0927\7\7\2\2\u0927\u0928\5^\60\2\u0928\u0929"+
		"\5\u0082B\2\u0929\u092a\7\7\2\2\u092a\u092b\5\u02da\u016e\2\u092b\u092c"+
		"\5\u01ca\u00e6\2\u092c\u092e\3\2\2\2\u092d\u091b\3\2\2\2\u092d\u0923\3"+
		"\2\2\2\u092e\u0157\3\2\2\2\u092f\u0930\7\u0164\2\2\u0930\u0931\5^\60\2"+
		"\u0931\u0932\5\u0082B\2\u0932\u0933\7\u0160\2\2\u0933\u0934\5^\60\2\u0934"+
		"\u0935\5\u01ca\u00e6\2\u0935\u0159\3\2\2\2\u0936\u0937\7\u0199\2\2\u0937"+
		"\u0938\5^\60\2\u0938\u0939\5\u0082B\2\u0939\u093a\7\u0160\2\2\u093a\u093b"+
		"\5^\60\2\u093b\u093c\5\u01ca\u00e6\2\u093c\u015b\3\2\2\2\u093d\u093e\7"+
		"\u013b\2\2\u093e\u093f\5^\60\2\u093f\u0940\5\u0082B\2\u0940\u0941\7\u0160"+
		"\2\2\u0941\u0942\5^\60\2\u0942\u0943\5\u01ca\u00e6\2\u0943\u015d\3\2\2"+
		"\2\u0944\u0945\7\u00a6\2\2\u0945\u0946\5^\60\2\u0946\u0947\5\u0082B\2"+
		"\u0947\u0948\7\u0160\2\2\u0948\u0949\5^\60\2\u0949\u094a\5\u01ca\u00e6"+
		"\2\u094a\u015f\3\2\2\2\u094b\u094c\7\u00a3\2\2\u094c\u094d\5^\60\2\u094d"+
		"\u094e\5\u0082B\2\u094e\u094f\7\u0160\2\2\u094f\u0950\5^\60\2\u0950\u0951"+
		"\5\u01ca\u00e6\2\u0951\u0161\3\2\2\2\u0952\u0953\7\u00a5\2\2\u0953\u0954"+
		"\5^\60\2\u0954\u0955\5\u0082B\2\u0955\u0956\7\u0160\2\2\u0956\u0957\5"+
		"^\60\2\u0957\u0958\5\u01ca\u00e6\2\u0958\u0163\3\2\2\2\u0959\u095a\7\u00a4"+
		"\2\2\u095a\u095b\5^\60\2\u095b\u095c\5\u0082B\2\u095c\u095d\7\u0160\2"+
		"\2\u095d\u095e\5^\60\2\u095e\u095f\5\u01ca\u00e6\2\u095f\u0165\3\2\2\2"+
		"\u0960\u0961\7\u016c\2\2\u0961\u0962\5^\60\2\u0962\u0963\5\u0082B\2\u0963"+
		"\u0964\7\u0160\2\2\u0964\u0965\5^\60\2\u0965\u0966\5\u01ca\u00e6\2\u0966"+
		"\u0167\3\2\2\2\u0967\u0968\7\u0142\2\2\u0968\u0969\5^\60\2\u0969\u096a"+
		"\5\u0082B\2\u096a\u096b\7\u0160\2\2\u096b\u096c\5^\60\2\u096c\u096d\5"+
		"\u01ca\u00e6\2\u096d\u0169\3\2\2\2\u096e\u096f\7\u0120\2\2\u096f\u0970"+
		"\5^\60\2\u0970\u0971\5\u0082B\2\u0971\u0972\7\u0160\2\2\u0972\u0973\5"+
		"^\60\2\u0973\u0974\5\u01ca\u00e6\2\u0974\u016b\3\2\2\2\u0975\u0976\7\u00cc"+
		"\2\2\u0976\u0977\5^\60\2\u0977\u0978\5\u0082B\2\u0978\u0979\7\u0160\2"+
		"\2\u0979\u097a\5^\60\2\u097a\u097b\5\u01ca\u00e6\2\u097b\u016d\3\2\2\2"+
		"\u097c\u097d\7:\2\2\u097d\u097e\5^\60\2\u097e\u097f\5\u0082B\2\u097f\u0980"+
		"\7\u0160\2\2\u0980\u0981\5^\60\2\u0981\u0982\5\u01ca\u00e6\2\u0982\u016f"+
		"\3\2\2\2\u0983\u0984\7\25\2\2\u0984\u0985\5^\60\2\u0985\u0986\5\u0082"+
		"B\2\u0986\u0987\7\u0160\2\2\u0987\u0988\5^\60\2\u0988\u0989\5\u01ca\u00e6"+
		"\2\u0989\u0171\3\2\2\2\u098a\u098b\7\u00b8\2\2\u098b\u098c\5\u031e\u0190"+
		"\2\u098c\u098d\5^\60\2\u098d\u098e\5\u0082B\2\u098e\u098f\7\7\2\2\u098f"+
		"\u0990\5\u0082B\2\u0990\u0991\5\u01ca\u00e6\2\u0991\u0173\3\2\2\2\u0992"+
		"\u0993\7\u0099\2\2\u0993\u0994\5\u0308\u0185\2\u0994\u0995\5\u030e\u0188"+
		"\2\u0995\u0996\5^\60\2\u0996\u0997\5\u0082B\2\u0997\u0998\7\7\2\2\u0998"+
		"\u0999\5\u0082B\2\u0999\u099a\5\u01ca\u00e6\2\u099a\u0175\3\2\2\2\u099b"+
		"\u099c\7\u0117\2\2\u099c\u099d\5^\60\2\u099d\u099e\5\u0178\u00bd\2\u099e"+
		"\u099f\5\u01ca\u00e6\2\u099f\u0177\3\2\2\2\u09a0\u09a1\b\u00bd\1\2\u09a1"+
		"\u09a2\5\u017a\u00be\2\u09a2\u09a8\3\2\2\2\u09a3\u09a4\f\3\2\2\u09a4\u09a5"+
		"\7\7\2\2\u09a5\u09a7\5\u017a\u00be\2\u09a6\u09a3\3\2\2\2\u09a7\u09aa\3"+
		"\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u0179\3\2\2\2\u09aa"+
		"\u09a8\3\2\2\2\u09ab\u09ac\7\f\2\2\u09ac\u09ad\5\u0082B\2\u09ad\u09ae"+
		"\7\7\2\2\u09ae\u09af\5R*\2\u09af\u09b0\7\r\2\2\u09b0\u017b\3\2\2\2\u09b1"+
		"\u09b2\7\u0138\2\2\u09b2\u09b3\5^\60\2\u09b3\u09b4\5\u0082B\2\u09b4\u09b5"+
		"\7\7\2\2\u09b5\u09b6\5^\60\2\u09b6\u09b7\5\u0082B\2\u09b7\u09b8\7\7\2"+
		"\2\u09b8\u09b9\5^\60\2\u09b9\u09ba\5\u0082B\2\u09ba\u09bb\5\u01ca\u00e6"+
		"\2\u09bb\u017d\3\2\2\2\u09bc\u09bd\5\u0180\u00c1\2\u09bd\u09be\7@\2\2"+
		"\u09be\u09bf\5\u0308\u0185\2\u09bf\u09c0\5\u02f0\u0179\2\u09c0\u09c1\5"+
		"\u0344\u01a3\2\u09c1\u09c2\5^\60\2\u09c2\u09c3\5\u0082B\2\u09c3\u09c4"+
		"\7\n\2\2\u09c4\u09c5\5\u02e8\u0175\2\u09c5\u09c6\7\13\2\2\u09c6\u09c7"+
		"\5\u0310\u0189\2\u09c7\u09c8\5\u0328\u0195\2\u09c8\u09c9\5\u01ca\u00e6"+
		"\2\u09c9\u017f\3\2\2\2\u09ca\u09cc\t\b\2\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc"+
		"\3\2\2\2\u09cc\u0181\3\2\2\2\u09cd\u09ce\7\u017d\2\2\u09ce\u09cf\5^\60"+
		"\2\u09cf\u09d0\5\u0082B\2\u09d0\u09d1\7\7\2\2\u09d1\u09d2\5^\60\2\u09d2"+
		"\u09d3\5\u01ca\u00e6\2\u09d3\u0183\3\2\2\2\u09d4\u09d5\7\u00d5\2\2\u09d5"+
		"\u09d6\5^\60\2\u09d6\u09d7\5\u0186\u00c4\2\u09d7\u09d8\5\u0188\u00c5\2"+
		"\u09d8\u09d9\5\u01ca\u00e6\2\u09d9\u0185\3\2\2\2\u09da\u09dc\7K\2\2\u09db"+
		"\u09da\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u0187\3\2\2\2\u09dd\u09df\5\u018a"+
		"\u00c6\2\u09de\u09dd\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u0189\3\2\2\2\u09e0"+
		"\u09e1\b\u00c6\1\2\u09e1\u09e2\5\u018c\u00c7\2\u09e2\u09e7\3\2\2\2\u09e3"+
		"\u09e4\f\3\2\2\u09e4\u09e6\5\u018c\u00c7\2\u09e5\u09e3\3\2\2\2\u09e6\u09e9"+
		"\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u018b\3\2\2\2\u09e9"+
		"\u09e7\3\2\2\2\u09ea\u09eb\7B\2\2\u09eb\u09ec\5^\60\2\u09ec\u09ed\5\u0082"+
		"B\2\u09ed\u09f3\3\2\2\2\u09ee\u09ef\7\u009e\2\2\u09ef\u09f0\5^\60\2\u09f0"+
		"\u09f1\5\u009eP\2\u09f1\u09f3\3\2\2\2\u09f2\u09ea\3\2\2\2\u09f2\u09ee"+
		"\3\2\2\2\u09f3\u018d\3\2\2\2\u09f4\u09f5\7C\2\2\u09f5\u09f6\7\u0189\2"+
		"\2\u09f6\u09f7\5R*\2\u09f7\u09f8\7\f\2\2\u09f8\u09f9\5\u0300\u0181\2\u09f9"+
		"\u09fa\7\r\2\2\u09fa\u09fb\5\u01ca\u00e6\2\u09fb\u018f\3\2\2\2\u09fc\u09fd"+
		"\7L\2\2\u09fd\u09fe\7\u0189\2\2\u09fe\u09ff\5\u0306\u0184\2\u09ff\u0a00"+
		"\7\f\2\2\u0a00\u0a01\5\u0300\u0181\2\u0a01\u0a02\7\r\2\2\u0a02\u0a03\5"+
		"\u01ca\u00e6\2\u0a03\u0191\3\2\2\2\u0a04\u0a10\5\u0194\u00cb\2\u0a05\u0a10"+
		"\5\u0196\u00cc\2\u0a06\u0a10\5\u0198\u00cd\2\u0a07\u0a10\5\u019a\u00ce"+
		"\2\u0a08\u0a10\5\u01a2\u00d2\2\u0a09\u0a10\5\u01a8\u00d5\2\u0a0a\u0a10"+
		"\5\u01aa\u00d6\2\u0a0b\u0a10\5\u01ac\u00d7\2\u0a0c\u0a10\5\u01ae\u00d8"+
		"\2\u0a0d\u0a10\5\u01b0\u00d9\2\u0a0e\u0a10\5\u01b2\u00da\2\u0a0f\u0a04"+
		"\3\2\2\2\u0a0f\u0a05\3\2\2\2\u0a0f\u0a06\3\2\2\2\u0a0f\u0a07\3\2\2\2\u0a0f"+
		"\u0a08\3\2\2\2\u0a0f\u0a09\3\2\2\2\u0a0f\u0a0a\3\2\2\2\u0a0f\u0a0b\3\2"+
		"\2\2\u0a0f\u0a0c\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a0f\u0a0e\3\2\2\2\u0a10"+
		"\u0193\3\2\2\2\u0a11\u0a12\7\u0128\2\2\u0a12\u0a13\5b\62\2\u0a13\u0a14"+
		"\5\u01ca\u00e6\2\u0a14\u0a21\3\2\2\2\u0a15\u0a1b\7\u0128\2\2\u0a16\u0a17"+
		"\5^\60\2\u0a17\u0a18\5l\67\2\u0a18\u0a19\7\20\2\2\u0a19\u0a1c\3\2\2\2"+
		"\u0a1a\u0a1c\5`\61\2\u0a1b\u0a16\3\2\2\2\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a1d"+
		"\3\2\2\2\u0a1d\u0a1e\5\u0082B\2\u0a1e\u0a1f\5\u01ca\u00e6\2\u0a1f\u0a21"+
		"\3\2\2\2\u0a20\u0a11\3\2\2\2\u0a20\u0a15\3\2\2\2\u0a21\u0195\3\2\2\2\u0a22"+
		"\u0a23\7<\2\2\u0a23\u0a24\5r:\2\u0a24\u0a25\5R*\2\u0a25\u0a26\5\u01ca"+
		"\u00e6\2\u0a26\u0197\3\2\2\2\u0a27\u0a28\7<\2\2\u0a28\u0a29\5d\63\2\u0a29"+
		"\u0a2a\5\u0082B\2\u0a2a\u0a2b\7\7\2\2\u0a2b\u0a2c\5r:\2\u0a2c\u0a2d\5"+
		"R*\2\u0a2d\u0a2e\7\7\2\2\u0a2e\u0a2f\5r:\2\u0a2f\u0a30\5R*\2\u0a30\u0a31"+
		"\5\u01ca\u00e6\2\u0a31\u0199\3\2\2\2\u0a32\u0a33\7\u0157\2\2\u0a33\u0a34"+
		"\5^\60\2\u0a34\u0a35\5\u0082B\2\u0a35\u0a36\7\7\2\2\u0a36\u0a37\5r:\2"+
		"\u0a37\u0a38\5R*\2\u0a38\u0a39\7\f\2\2\u0a39\u0a3a\5\u019c\u00cf\2\u0a3a"+
		"\u0a3b\7\r\2\2\u0a3b\u0a3c\5\u01ca\u00e6\2\u0a3c\u019b\3\2\2\2\u0a3d\u0a3f"+
		"\5\u019e\u00d0\2\u0a3e\u0a3d\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u019d\3"+
		"\2\2\2\u0a40\u0a41\b\u00d0\1\2\u0a41\u0a42\5\u01a0\u00d1\2\u0a42\u0a47"+
		"\3\2\2\2\u0a43\u0a44\f\3\2\2\u0a44\u0a46\5\u01a0\u00d1\2\u0a45\u0a43\3"+
		"\2\2\2\u0a46\u0a49\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48"+
		"\u019f\3\2\2\2\u0a49\u0a47\3\2\2\2\u0a4a\u0a4b\5^\60\2\u0a4b\u0a4c\5\u0092"+
		"J\2\u0a4c\u0a4d\7\7\2\2\u0a4d\u0a4e\5r:\2\u0a4e\u0a4f\5R*\2\u0a4f\u01a1"+
		"\3\2\2\2\u0a50\u0a51\7\u00c1\2\2\u0a51\u0a52\5^\60\2\u0a52\u0a53\5\u0082"+
		"B\2\u0a53\u0a54\7\7\2\2\u0a54\u0a55\7\f\2\2\u0a55\u0a56\5\u01a4\u00d3"+
		"\2\u0a56\u0a57\7\r\2\2\u0a57\u0a58\5\u01ca\u00e6\2\u0a58\u01a3\3\2\2\2"+
		"\u0a59\u0a5a\b\u00d3\1\2\u0a5a\u0a5b\5\u01a6\u00d4\2\u0a5b\u0a61\3\2\2"+
		"\2\u0a5c\u0a5d\f\3\2\2\u0a5d\u0a5e\7\7\2\2\u0a5e\u0a60\5\u01a6\u00d4\2"+
		"\u0a5f\u0a5c\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a61\u0a62"+
		"\3\2\2\2\u0a62\u01a5\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a64\u0a65\5r:\2\u0a65"+
		"\u0a66\5R*\2\u0a66\u01a7\3\2\2\2\u0a67\u0a68\7\u00cd\2\2\u0a68\u0a69\5"+
		"\u02f0\u0179\2\u0a69\u0a6a\5\u0344\u01a3\2\u0a6a\u0a6b\5^\60\2\u0a6b\u0a6c"+
		"\5\u0082B\2\u0a6c\u0a6d\7\n\2\2\u0a6d\u0a6e\5\u02e8\u0175\2\u0a6e\u0a6f"+
		"\7\13\2\2\u0a6f\u0a70\5\u0310\u0189\2\u0a70\u0a71\5\u0328\u0195\2\u0a71"+
		"\u0a72\7\u0160\2\2\u0a72\u0a73\5r:\2\u0a73\u0a74\5R*\2\u0a74\u0a75\7\u0178"+
		"\2\2\u0a75\u0a76\5r:\2\u0a76\u0a77\5R*\2\u0a77\u0a78\5\u01ca\u00e6\2\u0a78"+
		"\u01a9\3\2\2\2\u0a79\u0a7a\7\u0127\2\2\u0a7a\u0a7b\5^\60\2\u0a7b\u0a7c"+
		"\5\u0082B\2\u0a7c\u0a7d\5\u01ca\u00e6\2\u0a7d\u01ab\3\2\2\2\u0a7e\u0a7f"+
		"\7E\2\2\u0a7f\u0a80\7\u0189\2\2\u0a80\u0a81\5\u0306\u0184\2\u0a81\u0a82"+
		"\7\f\2\2\u0a82\u0a83\5\u01a4\u00d3\2\u0a83\u0a84\7\r\2\2\u0a84\u0a85\7"+
		"\u0178\2\2\u0a85\u0a86\5\u01b4\u00db\2\u0a86\u0a87\5\u01ca\u00e6\2\u0a87"+
		"\u01ad\3\2\2\2\u0a88\u0a89\7D\2\2\u0a89\u0a8a\7\u00a8\2\2\u0a8a\u0a8b"+
		"\5\u0082B\2\u0a8b\u0a8c\7\u0160\2\2\u0a8c\u0a8d\5r:\2\u0a8d\u0a8e\5R*"+
		"\2\u0a8e\u0a8f\5\u01ca\u00e6\2\u0a8f\u01af\3\2\2\2\u0a90\u0a91\7M\2\2"+
		"\u0a91\u0a92\7\u00a8\2\2\u0a92\u0a93\5\u0082B\2\u0a93\u0a94\7\u0178\2"+
		"\2\u0a94\u0a95\5\u01b4\u00db\2\u0a95\u0a96\5\u01ca\u00e6\2\u0a96\u01b1"+
		"\3\2\2\2\u0a97\u0a98\7\u0177\2\2\u0a98\u0a99\5\u01ca\u00e6\2\u0a99\u01b3"+
		"\3\2\2\2\u0a9a\u0a9b\7\u0160\2\2\u0a9b\u0aa0\7A\2\2\u0a9c\u0a9d\5r:\2"+
		"\u0a9d\u0a9e\5R*\2\u0a9e\u0aa0\3\2\2\2\u0a9f\u0a9a\3\2\2\2\u0a9f\u0a9c"+
		"\3\2\2\2\u0aa0\u01b5\3\2\2\2\u0aa1\u0aa2\7\b\2\2\u0aa2\u0aa3\5\u01b8\u00dd"+
		"\2\u0aa3\u01b7\3\2\2\2\u0aa4\u0aa5\7\16\2\2\u0aa5\u0aab\7\17\2\2\u0aa6"+
		"\u0aa7\7\16\2\2\u0aa7\u0aa8\5\u01ba\u00de\2\u0aa8\u0aa9\7\17\2\2\u0aa9"+
		"\u0aab\3\2\2\2\u0aaa\u0aa4\3\2\2\2\u0aaa\u0aa6\3\2\2\2\u0aab\u01b9\3\2"+
		"\2\2\u0aac\u0aad\b\u00de\1\2\u0aad\u0aae\5\u01bc\u00df\2\u0aae\u0ab4\3"+
		"\2\2\2\u0aaf\u0ab0\f\3\2\2\u0ab0\u0ab1\7\7\2\2\u0ab1\u0ab3\5\u01bc\u00df"+
		"\2\u0ab2\u0aaf\3\2\2\2\u0ab3\u0ab6\3\2\2\2\u0ab4\u0ab2\3\2\2\2\u0ab4\u0ab5"+
		"\3\2\2\2\u0ab5\u01bb\3\2\2\2\u0ab6\u0ab4\3\2\2\2\u0ab7\u0aba\7\u0107\2"+
		"\2\u0ab8\u0aba\5\u01be\u00e0\2\u0ab9\u0ab7\3\2\2\2\u0ab9\u0ab8\3\2\2\2"+
		"\u0aba\u01bd\3\2\2\2\u0abb\u0abc\5^\60\2\u0abc\u0abd\5\u0082B\2\u0abd"+
		"\u0ac3\3\2\2\2\u0abe\u0ac3\5\u01c0\u00e1\2\u0abf\u0ac3\5\u01b6\u00dc\2"+
		"\u0ac0\u0ac3\5\\/\2\u0ac1\u0ac3\5\u01ce\u00e8\2\u0ac2\u0abb\3\2\2\2\u0ac2"+
		"\u0abe\3\2\2\2\u0ac2\u0abf\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac2\u0ac1\3\2"+
		"\2\2\u0ac3\u01bf\3\2\2\2\u0ac4\u0ac5\7\b\2\2\u0ac5\u0ac6\5\u00a2R\2\u0ac6"+
		"\u01c1\3\2\2\2\u0ac7\u0ac8\5Z.\2\u0ac8\u0ac9\5\u01c4\u00e3\2\u0ac9\u01c3"+
		"\3\2\2\2\u0aca\u0ace\5\u01b6\u00dc\2\u0acb\u0ace\5\\/\2\u0acc\u0ace\5"+
		"\u01ce\u00e8\2\u0acd\u0aca\3\2\2\2\u0acd\u0acb\3\2\2\2\u0acd\u0acc\3\2"+
		"\2\2\u0ace\u01c5\3\2\2\2\u0acf\u0ad1\5\u01c8\u00e5\2\u0ad0\u0acf\3\2\2"+
		"\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u01c7\3\2\2\2\u0ad2\u0ad3\b\u00e5\1\2\u0ad3"+
		"\u0ad4\5\u01c2\u00e2\2\u0ad4\u0ad9\3\2\2\2\u0ad5\u0ad6\f\3\2\2\u0ad6\u0ad8"+
		"\5\u01c2\u00e2\2\u0ad7\u0ad5\3\2\2\2\u0ad8\u0adb\3\2\2\2\u0ad9\u0ad7\3"+
		"\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u01c9\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adc"+
		"\u0add\7\7\2\2\u0add\u0adf\5\u01cc\u00e7\2\u0ade\u0adc\3\2\2\2\u0ade\u0adf"+
		"\3\2\2\2\u0adf\u01cb\3\2\2\2\u0ae0\u0ae1\b\u00e7\1\2\u0ae1\u0ae2\5\u01c2"+
		"\u00e2\2\u0ae2\u0ae8\3\2\2\2\u0ae3\u0ae4\f\3\2\2\u0ae4\u0ae5\7\7\2\2\u0ae5"+
		"\u0ae7\5\u01c2\u00e2\2\u0ae6\u0ae3\3\2\2\2\u0ae7\u0aea\3\2\2\2\u0ae8\u0ae6"+
		"\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u01cd\3\2\2\2\u0aea\u0ae8\3\2\2\2\u0aeb"+
		"\u0b05\5\u01d0\u00e9\2\u0aec\u0b05\5\u01d8\u00ed\2\u0aed\u0b05\5\u01e0"+
		"\u00f1\2\u0aee\u0b05\5\u01e8\u00f5\2\u0aef\u0b05\5\u01f0\u00f9\2\u0af0"+
		"\u0b05\5\u01f8\u00fd\2\u0af1\u0b05\5\u0200\u0101\2\u0af2\u0b05\5\u0208"+
		"\u0105\2\u0af3\u0b05\5\u0210\u0109\2\u0af4\u0b05\5\u0218\u010d\2\u0af5"+
		"\u0b05\5\u0220\u0111\2\u0af6\u0b05\5\u0228\u0115\2\u0af7\u0b05\5\u0230"+
		"\u0119\2\u0af8\u0b05\5\u0238\u011d\2\u0af9\u0b05\5\u0240\u0121\2\u0afa"+
		"\u0b05\5\u0248\u0125\2\u0afb\u0b05\5\u0250\u0129\2\u0afc\u0b05\5\u0258"+
		"\u012d\2\u0afd\u0b05\5\u0260\u0131\2\u0afe\u0b05\5\u0268\u0135\2\u0aff"+
		"\u0b05\5\u0270\u0139\2\u0b00\u0b05\5\u0278\u013d\2\u0b01\u0b05\5\u0280"+
		"\u0141\2\u0b02\u0b05\5\u0288\u0145\2\u0b03\u0b05\5\u0290\u0149\2\u0b04"+
		"\u0aeb\3\2\2\2\u0b04\u0aec\3\2\2\2\u0b04\u0aed\3\2\2\2\u0b04\u0aee\3\2"+
		"\2\2\u0b04\u0aef\3\2\2\2\u0b04\u0af0\3\2\2\2\u0b04\u0af1\3\2\2\2\u0b04"+
		"\u0af2\3\2\2\2\u0b04\u0af3\3\2\2\2\u0b04\u0af4\3\2\2\2\u0b04\u0af5\3\2"+
		"\2\2\u0b04\u0af6\3\2\2\2\u0b04\u0af7\3\2\2\2\u0b04\u0af8\3\2\2\2\u0b04"+
		"\u0af9\3\2\2\2\u0b04\u0afa\3\2\2\2\u0b04\u0afb\3\2\2\2\u0b04\u0afc\3\2"+
		"\2\2\u0b04\u0afd\3\2\2\2\u0b04\u0afe\3\2\2\2\u0b04\u0aff\3\2\2\2\u0b04"+
		"\u0b00\3\2\2\2\u0b04\u0b01\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b04\u0b03\3\2"+
		"\2\2\u0b05\u01cf\3\2\2\2\u0b06\u0b07\7d\2\2\u0b07\u0b08\7\n\2\2\u0b08"+
		"\u0b09\5\u01d2\u00ea\2\u0b09\u0b0a\7\13\2\2\u0b0a\u01d1\3\2\2\2\u0b0b"+
		"\u0b0d\5\u01d4\u00eb\2\u0b0c\u0b0b\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u01d3"+
		"\3\2\2\2\u0b0e\u0b0f\b\u00eb\1\2\u0b0f\u0b10\5\u01d6\u00ec\2\u0b10\u0b16"+
		"\3\2\2\2\u0b11\u0b12\f\3\2\2\u0b12\u0b13\7\7\2\2\u0b13\u0b15\5\u01d6\u00ec"+
		"\2\u0b14\u0b11\3\2\2\2\u0b15\u0b18\3\2\2\2\u0b16\u0b14\3\2\2\2\u0b16\u0b17"+
		"\3\2\2\2\u0b17\u01d5\3\2\2\2\u0b18\u0b16\3\2\2\2\u0b19\u0b1a\7\u00d6\2"+
		"\2\u0b1a\u0b3a\5\u02ca\u0166\2\u0b1b\u0b3a\5\u0298\u014d\2\u0b1c\u0b1d"+
		"\7\u011d\2\2\u0b1d\u0b3a\5\u00a2R\2\u0b1e\u0b3a\5\u029a\u014e\2\u0b1f"+
		"\u0b20\7\u009f\2\2\u0b20\u0b3a\5\u00a2R\2\u0b21\u0b22\7\u012d\2\2\u0b22"+
		"\u0b3a\5\u0094K\2\u0b23\u0b24\7\u014a\2\2\u0b24\u0b3a\5\u00a2R\2\u0b25"+
		"\u0b26\7\u0086\2\2\u0b26\u0b3a\5\u02d4\u016b\2\u0b27\u0b28\7\u0089\2\2"+
		"\u0b28\u0b3a\5\u01bc\u00df\2\u0b29\u0b2a\7\u0129\2\2\u0b2a\u0b3a\5\u01bc"+
		"\u00df\2\u0b2b\u0b2c\7\u00b1\2\2\u0b2c\u0b3a\5\u01bc\u00df\2\u0b2d\u0b2e"+
		"\7\u00bb\2\2\u0b2e\u0b3a\5\u01bc\u00df\2\u0b2f\u0b30\7\u00e3\2\2\u0b30"+
		"\u0b3a\5\u01bc\u00df\2\u0b31\u0b32\7\u0084\2\2\u0b32\u0b3a\5\u0094K\2"+
		"\u0b33\u0b34\7\u014b\2\2\u0b34\u0b3a\5\u0090I\2\u0b35\u0b36\7\\\2\2\u0b36"+
		"\u0b3a\5\u0090I\2\u0b37\u0b38\7\u00b2\2\2\u0b38\u0b3a\5\u0090I\2\u0b39"+
		"\u0b19\3\2\2\2\u0b39\u0b1b\3\2\2\2\u0b39\u0b1c\3\2\2\2\u0b39\u0b1e\3\2"+
		"\2\2\u0b39\u0b1f\3\2\2\2\u0b39\u0b21\3\2\2\2\u0b39\u0b23\3\2\2\2\u0b39"+
		"\u0b25\3\2\2\2\u0b39\u0b27\3\2\2\2\u0b39\u0b29\3\2\2\2\u0b39\u0b2b\3\2"+
		"\2\2\u0b39\u0b2d\3\2\2\2\u0b39\u0b2f\3\2\2\2\u0b39\u0b31\3\2\2\2\u0b39"+
		"\u0b33\3\2\2\2\u0b39\u0b35\3\2\2\2\u0b39\u0b37\3\2\2\2\u0b3a\u01d7\3\2"+
		"\2\2\u0b3b\u0b3c\7i\2\2\u0b3c\u0b3d\7\n\2\2\u0b3d\u0b3e\5\u01da\u00ee"+
		"\2\u0b3e\u0b3f\7\13\2\2\u0b3f\u01d9\3\2\2\2\u0b40\u0b42\5\u01dc\u00ef"+
		"\2\u0b41\u0b40\3\2\2\2\u0b41\u0b42\3\2\2\2\u0b42\u01db\3\2\2\2\u0b43\u0b44"+
		"\b\u00ef\1\2\u0b44\u0b45\5\u01de\u00f0\2\u0b45\u0b4b\3\2\2\2\u0b46\u0b47"+
		"\f\3\2\2\u0b47\u0b48\7\7\2\2\u0b48\u0b4a\5\u01de\u00f0\2\u0b49\u0b46\3"+
		"\2\2\2\u0b4a\u0b4d\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c"+
		"\u01dd\3\2\2\2\u0b4d\u0b4b\3\2\2\2\u0b4e\u0b4f\7\u009d\2\2\u0b4f\u0b57"+
		"\5\u00a2R\2\u0b50\u0b51\7v\2\2\u0b51\u0b57\5\u00a2R\2\u0b52\u0b53\7J\2"+
		"\2\u0b53\u0b57\5\u02c0\u0161\2\u0b54\u0b55\7I\2\2\u0b55\u0b57\5\u00a2"+
		"R\2\u0b56\u0b4e\3\2\2\2\u0b56\u0b50\3\2\2\2\u0b56\u0b52\3\2\2\2\u0b56"+
		"\u0b54\3\2\2\2\u0b57\u01df\3\2\2\2\u0b58\u0b59\7c\2\2\u0b59\u0b5a\7\n"+
		"\2\2\u0b5a\u0b5b\5\u01e2\u00f2\2\u0b5b\u0b5c\7\13\2\2\u0b5c\u01e1\3\2"+
		"\2\2\u0b5d\u0b5f\5\u01e4\u00f3\2\u0b5e\u0b5d\3\2\2\2\u0b5e\u0b5f\3\2\2"+
		"\2\u0b5f\u01e3\3\2\2\2\u0b60\u0b61\b\u00f3\1\2\u0b61\u0b62\5\u01e6\u00f4"+
		"\2\u0b62\u0b68\3\2\2\2\u0b63\u0b64\f\3\2\2\u0b64\u0b65\7\7\2\2\u0b65\u0b67"+
		"\5\u01e6\u00f4\2\u0b66\u0b63\3\2\2\2\u0b67\u0b6a\3\2\2\2\u0b68\u0b66\3"+
		"\2\2\2\u0b68\u0b69\3\2\2\2\u0b69\u01e5\3\2\2\2\u0b6a\u0b68\3\2\2\2\u0b6b"+
		"\u0b72\5\u029c\u014f\2\u0b6c\u0b72\5\u029e\u0150\2\u0b6d\u0b72\5\u02a0"+
		"\u0151\2\u0b6e\u0b72\5\u02a2\u0152\2\u0b6f\u0b70\7\u0087\2\2\u0b70\u0b72"+
		"\5\u02c6\u0164\2\u0b71\u0b6b\3\2\2\2\u0b71\u0b6c\3\2\2\2\u0b71\u0b6d\3"+
		"\2\2\2\u0b71\u0b6e\3\2\2\2\u0b71\u0b6f\3\2\2\2\u0b72\u01e7\3\2\2\2\u0b73"+
		"\u0b74\7{\2\2\u0b74\u0b75\7\n\2\2\u0b75\u0b76\5\u01ea\u00f6\2\u0b76\u0b77"+
		"\7\13\2\2\u0b77\u01e9\3\2\2\2\u0b78\u0b7a\5\u01ec\u00f7\2\u0b79\u0b78"+
		"\3\2\2\2\u0b79\u0b7a\3\2\2\2\u0b7a\u01eb\3\2\2\2\u0b7b\u0b7c\b\u00f7\1"+
		"\2\u0b7c\u0b7d\5\u01ee\u00f8\2\u0b7d\u0b83\3\2\2\2\u0b7e\u0b7f\f\3\2\2"+
		"\u0b7f\u0b80\7\7\2\2\u0b80\u0b82\5\u01ee\u00f8\2\u0b81\u0b7e\3\2\2\2\u0b82"+
		"\u0b85\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u01ed\3\2"+
		"\2\2\u0b85\u0b83\3\2\2\2\u0b86\u0b8c\5\u02a4\u0153\2\u0b87\u0b88\7F\2"+
		"\2\u0b88\u0b8c\5\u02c8\u0165\2\u0b89\u0b8a\7\u0167\2\2\u0b8a\u0b8c\5\u01bc"+
		"\u00df\2\u0b8b\u0b86\3\2\2\2\u0b8b\u0b87\3\2\2\2\u0b8b\u0b89\3\2\2\2\u0b8c"+
		"\u01ef\3\2\2\2\u0b8d\u0b8e\7f\2\2\u0b8e\u0b8f\7\n\2\2\u0b8f\u0b90\5\u01f2"+
		"\u00fa\2\u0b90\u0b91\7\13\2\2\u0b91\u01f1\3\2\2\2\u0b92\u0b94\5\u01f4"+
		"\u00fb\2\u0b93\u0b92\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94\u01f3\3\2\2\2\u0b95"+
		"\u0b96\b\u00fb\1\2\u0b96\u0b97\5\u01f6\u00fc\2\u0b97\u0b9d\3\2\2\2\u0b98"+
		"\u0b99\f\3\2\2\u0b99\u0b9a\7\7\2\2\u0b9a\u0b9c\5\u01f6\u00fc\2\u0b9b\u0b98"+
		"\3\2\2\2\u0b9c\u0b9f\3\2\2\2\u0b9d\u0b9b\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e"+
		"\u01f5\3\2\2\2\u0b9f\u0b9d\3\2\2\2\u0ba0\u0baf\5\u029c\u014f\2\u0ba1\u0baf"+
		"\5\u029e\u0150\2\u0ba2\u0baf\5\u02a8\u0155\2\u0ba3\u0baf\5\u0298\u014d"+
		"\2\u0ba4\u0baf\5\u02a6\u0154\2\u0ba5\u0baf\5\u02aa\u0156\2\u0ba6\u0baf"+
		"\5\u02a0\u0151\2\u0ba7\u0baf\5\u02a2\u0152\2\u0ba8\u0baf\5\u02ac\u0157"+
		"\2\u0ba9\u0baf\5\u02a4\u0153\2\u0baa\u0bab\7\u0094\2\2\u0bab\u0baf\5\u01bc"+
		"\u00df\2\u0bac\u0bad\7\u0083\2\2\u0bad\u0baf\5\u0094K\2\u0bae\u0ba0\3"+
		"\2\2\2\u0bae\u0ba1\3\2\2\2\u0bae\u0ba2\3\2\2\2\u0bae\u0ba3\3\2\2\2\u0bae"+
		"\u0ba4\3\2\2\2\u0bae\u0ba5\3\2\2\2\u0bae\u0ba6\3\2\2\2\u0bae\u0ba7\3\2"+
		"\2\2\u0bae\u0ba8\3\2\2\2\u0bae\u0ba9\3\2\2\2\u0bae\u0baa\3\2\2\2\u0bae"+
		"\u0bac\3\2\2\2\u0baf\u01f7\3\2\2\2\u0bb0\u0bb1\7e\2\2\u0bb1\u0bb2\7\n"+
		"\2\2\u0bb2\u0bb3\5\u01fa\u00fe\2\u0bb3\u0bb4\7\13\2\2\u0bb4\u01f9\3\2"+
		"\2\2\u0bb5\u0bb7\5\u01fc\u00ff\2\u0bb6\u0bb5\3\2\2\2\u0bb6\u0bb7\3\2\2"+
		"\2\u0bb7\u01fb\3\2\2\2\u0bb8\u0bb9\b\u00ff\1\2\u0bb9\u0bba\5\u01fe\u0100"+
		"\2\u0bba\u0bc0\3\2\2\2\u0bbb\u0bbc\f\3\2\2\u0bbc\u0bbd\7\7\2\2\u0bbd\u0bbf"+
		"\5\u01fe\u0100\2\u0bbe\u0bbb\3\2\2\2\u0bbf\u0bc2\3\2\2\2\u0bc0\u0bbe\3"+
		"\2\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u01fd\3\2\2\2\u0bc2\u0bc0\3\2\2\2\u0bc3"+
		"\u0bd9\5\u029c\u014f\2\u0bc4\u0bd9\5\u029e\u0150\2\u0bc5\u0bd9\5\u02a8"+
		"\u0155\2\u0bc6\u0bd9\5\u0298\u014d\2\u0bc7\u0bd9\5\u02a6\u0154\2\u0bc8"+
		"\u0bd9\5\u02aa\u0156\2\u0bc9\u0bd9\5\u02a0\u0151\2\u0bca\u0bd9\5\u02a2"+
		"\u0152\2\u0bcb\u0bd9\5\u02ac\u0157\2\u0bcc\u0bd9\5\u02a4\u0153\2\u0bcd"+
		"\u0bce\7\u0085\2\2\u0bce\u0bd9\5\u01bc\u00df\2\u0bcf\u0bd0\7\u012c\2\2"+
		"\u0bd0\u0bd9\5\u02ca\u0166\2\u0bd1\u0bd2\7\u0184\2\2\u0bd2\u0bd9\5\u01bc"+
		"\u00df\2\u0bd3\u0bd9\5\u02ae\u0158\2\u0bd4\u0bd5\7\u00b9\2\2\u0bd5\u0bd9"+
		"\5\u00a2R\2\u0bd6\u0bd7\7w\2\2\u0bd7\u0bd9\5\u01bc\u00df\2\u0bd8\u0bc3"+
		"\3\2\2\2\u0bd8\u0bc4\3\2\2\2\u0bd8\u0bc5\3\2\2\2\u0bd8\u0bc6\3\2\2\2\u0bd8"+
		"\u0bc7\3\2\2\2\u0bd8\u0bc8\3\2\2\2\u0bd8\u0bc9\3\2\2\2\u0bd8\u0bca\3\2"+
		"\2\2\u0bd8\u0bcb\3\2\2\2\u0bd8\u0bcc\3\2\2\2\u0bd8\u0bcd\3\2\2\2\u0bd8"+
		"\u0bcf\3\2\2\2\u0bd8\u0bd1\3\2\2\2\u0bd8\u0bd3\3\2\2\2\u0bd8\u0bd4\3\2"+
		"\2\2\u0bd8\u0bd6\3\2\2\2\u0bd9\u01ff\3\2\2\2\u0bda\u0bdb\7z\2\2\u0bdb"+
		"\u0bdc\7\n\2\2\u0bdc\u0bdd\5\u0202\u0102\2\u0bdd\u0bde\7\13\2\2\u0bde"+
		"\u0201\3\2\2\2\u0bdf\u0be1\5\u0204\u0103\2\u0be0\u0bdf\3\2\2\2\u0be0\u0be1"+
		"\3\2\2\2\u0be1\u0203\3\2\2\2\u0be2\u0be3\b\u0103\1\2\u0be3\u0be4\5\u0206"+
		"\u0104\2\u0be4\u0bea\3\2\2\2\u0be5\u0be6\f\3\2\2\u0be6\u0be7\7\7\2\2\u0be7"+
		"\u0be9\5\u0206\u0104\2\u0be8\u0be5\3\2\2\2\u0be9\u0bec\3\2\2\2\u0bea\u0be8"+
		"\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0205\3\2\2\2\u0bec\u0bea\3\2\2\2\u0bed"+
		"\u0bee\7Y\2\2\u0bee\u0bf2\5\u02b0\u0159\2\u0bef\u0bf0\7\u00e1\2\2\u0bf0"+
		"\u0bf2\5\u0094K\2\u0bf1\u0bed\3\2\2\2\u0bf1\u0bef\3\2\2\2\u0bf2\u0207"+
		"\3\2\2\2\u0bf3\u0bf4\7g\2\2\u0bf4\u0bf5\7\n\2\2\u0bf5\u0bf6\5\u020a\u0106"+
		"\2\u0bf6\u0bf7\7\13\2\2\u0bf7\u0209\3\2\2\2\u0bf8\u0bfa\5\u020c\u0107"+
		"\2\u0bf9\u0bf8\3\2\2\2\u0bf9\u0bfa\3\2\2\2\u0bfa\u020b\3\2\2\2\u0bfb\u0bfc"+
		"\b\u0107\1\2\u0bfc\u0bfd\5\u020e\u0108\2\u0bfd\u0c03\3\2\2\2\u0bfe\u0bff"+
		"\f\3\2\2\u0bff\u0c00\7\7\2\2\u0c00\u0c02\5\u020e\u0108\2\u0c01\u0bfe\3"+
		"\2\2\2\u0c02\u0c05\3\2\2\2\u0c03\u0c01\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04"+
		"\u020d\3\2\2\2\u0c05\u0c03\3\2\2\2\u0c06\u0c0c\5\u029e\u0150\2\u0c07\u0c08"+
		"\7\u017e\2\2\u0c08\u0c0c\5\u0094K\2\u0c09\u0c0a\7\u00d1\2\2\u0c0a\u0c0c"+
		"\5\u0090I\2\u0c0b\u0c06\3\2\2\2\u0c0b\u0c07\3\2\2\2\u0c0b\u0c09\3\2\2"+
		"\2\u0c0c\u020f\3\2\2\2\u0c0d\u0c0e\7|\2\2\u0c0e\u0c0f\7\n\2\2\u0c0f\u0c10"+
		"\5\u0212\u010a\2\u0c10\u0c11\7\13\2\2\u0c11\u0211\3\2\2\2\u0c12\u0c14"+
		"\5\u0214\u010b\2\u0c13\u0c12\3\2\2\2\u0c13\u0c14\3\2\2\2\u0c14\u0213\3"+
		"\2\2\2\u0c15\u0c16\b\u010b\1\2\u0c16\u0c17\5\u0216\u010c\2\u0c17\u0c1d"+
		"\3\2\2\2\u0c18\u0c19\f\3\2\2\u0c19\u0c1a\7\7\2\2\u0c1a\u0c1c\5\u0216\u010c"+
		"\2\u0c1b\u0c18\3\2\2\2\u0c1c\u0c1f\3\2\2\2\u0c1d\u0c1b\3\2\2\2\u0c1d\u0c1e"+
		"\3\2\2\2\u0c1e\u0215\3\2\2\2\u0c1f\u0c1d\3\2\2\2\u0c20\u0c23\5\u029e\u0150"+
		"\2\u0c21\u0c23\5\u02b2\u015a\2\u0c22\u0c20\3\2\2\2\u0c22\u0c21\3\2\2\2"+
		"\u0c23\u0217\3\2\2\2\u0c24\u0c25\7}\2\2\u0c25\u0c26\7\n\2\2\u0c26\u0c27"+
		"\5\u021a\u010e\2\u0c27\u0c28\7\13\2\2\u0c28\u0219\3\2\2\2\u0c29\u0c2b"+
		"\5\u021c\u010f\2\u0c2a\u0c29\3\2\2\2\u0c2a\u0c2b\3\2\2\2\u0c2b\u021b\3"+
		"\2\2\2\u0c2c\u0c2d\b\u010f\1\2\u0c2d\u0c2e\5\u021e\u0110\2\u0c2e\u0c34"+
		"\3\2\2\2\u0c2f\u0c30\f\3\2\2\u0c30\u0c31\7\7\2\2\u0c31\u0c33\5\u021e\u0110"+
		"\2\u0c32\u0c2f\3\2\2\2\u0c33\u0c36\3\2\2\2\u0c34\u0c32\3\2\2\2\u0c34\u0c35"+
		"\3\2\2\2\u0c35\u021d\3\2\2\2\u0c36\u0c34\3\2\2\2\u0c37\u0c3d\5\u029c\u014f"+
		"\2\u0c38\u0c3d\5\u029e\u0150\2\u0c39\u0c3d\5\u02b2\u015a\2\u0c3a\u0c3b"+
		"\7\u017e\2\2\u0c3b\u0c3d\5\u01bc\u00df\2\u0c3c\u0c37\3\2\2\2\u0c3c\u0c38"+
		"\3\2\2\2\u0c3c\u0c39\3\2\2\2\u0c3c\u0c3a\3\2\2\2\u0c3d\u021f\3\2\2\2\u0c3e"+
		"\u0c3f\7s\2\2\u0c3f\u0c40\7\n\2\2\u0c40\u0c41\5\u0222\u0112\2\u0c41\u0c42"+
		"\7\13\2\2\u0c42\u0221\3\2\2\2\u0c43\u0c45\5\u0224\u0113\2\u0c44\u0c43"+
		"\3\2\2\2\u0c44\u0c45\3\2\2\2\u0c45\u0223\3\2\2\2\u0c46\u0c47\b\u0113\1"+
		"\2\u0c47\u0c48\5\u0226\u0114\2\u0c48\u0c4e\3\2\2\2\u0c49\u0c4a\f\3\2\2"+
		"\u0c4a\u0c4b\7\7\2\2\u0c4b\u0c4d\5\u0226\u0114\2\u0c4c\u0c49\3\2\2\2\u0c4d"+
		"\u0c50\3\2\2\2\u0c4e\u0c4c\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0225\3\2"+
		"\2\2\u0c50\u0c4e\3\2\2\2\u0c51\u0c5a\5\u02a8\u0155\2\u0c52\u0c5a\5\u029e"+
		"\u0150\2\u0c53\u0c54\7T\2\2\u0c54\u0c5a\5\u00a2R\2\u0c55\u0c56\7\u00c0"+
		"\2\2\u0c56\u0c5a\5\u00a2R\2\u0c57\u0c58\7\u00d2\2\2\u0c58\u0c5a\5\u00a2"+
		"R\2\u0c59\u0c51\3\2\2\2\u0c59\u0c52\3\2\2\2\u0c59\u0c53\3\2\2\2\u0c59"+
		"\u0c55\3\2\2\2\u0c59\u0c57\3\2\2\2\u0c5a\u0227\3\2\2\2\u0c5b\u0c5c\7t"+
		"\2\2\u0c5c\u0c5d\7\n\2\2\u0c5d\u0c5e\5\u022a\u0116\2\u0c5e\u0c5f\7\13"+
		"\2\2\u0c5f\u0229\3\2\2\2\u0c60\u0c62\5\u022c\u0117\2\u0c61\u0c60\3\2\2"+
		"\2\u0c61\u0c62\3\2\2\2\u0c62\u022b\3\2\2\2\u0c63\u0c64\b\u0117\1\2\u0c64"+
		"\u0c65\5\u022e\u0118\2\u0c65\u0c6b\3\2\2\2\u0c66\u0c67\f\3\2\2\u0c67\u0c68"+
		"\7\7\2\2\u0c68\u0c6a\5\u022e\u0118\2\u0c69\u0c66\3\2\2\2\u0c6a\u0c6d\3"+
		"\2\2\2\u0c6b\u0c69\3\2\2\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u022d\3\2\2\2\u0c6d"+
		"\u0c6b\3\2\2\2\u0c6e\u0c73\5\u02a8\u0155\2\u0c6f\u0c73\5\u029e\u0150\2"+
		"\u0c70\u0c71\7\u008d\2\2\u0c71\u0c73\5\u0090I\2\u0c72\u0c6e\3\2\2\2\u0c72"+
		"\u0c6f\3\2\2\2\u0c72\u0c70\3\2\2\2\u0c73\u022f\3\2\2\2\u0c74\u0c75\7j"+
		"\2\2\u0c75\u0c76\7\n\2\2\u0c76\u0c77\5\u0232\u011a\2\u0c77\u0c78\7\13"+
		"\2\2\u0c78\u0231\3\2\2\2\u0c79\u0c7b\5\u0234\u011b\2\u0c7a\u0c79\3\2\2"+
		"\2\u0c7a\u0c7b\3\2\2\2\u0c7b\u0233\3\2\2\2\u0c7c\u0c7d\b\u011b\1\2\u0c7d"+
		"\u0c7e\5\u0236\u011c\2\u0c7e\u0c84\3\2\2\2\u0c7f\u0c80\f\3\2\2\u0c80\u0c81"+
		"\7\7\2\2\u0c81\u0c83\5\u0236\u011c\2\u0c82\u0c7f\3\2\2\2\u0c83\u0c86\3"+
		"\2\2\2\u0c84\u0c82\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85\u0235\3\2\2\2\u0c86"+
		"\u0c84\3\2\2\2\u0c87\u0c92\5\u029e\u0150\2\u0c88\u0c92\5\u02a8\u0155\2"+
		"\u0c89\u0c92\5\u02b4\u015b\2\u0c8a\u0c92\5\u0298\u014d\2\u0c8b\u0c92\5"+
		"\u02a6\u0154\2\u0c8c\u0c92\5\u02b2\u015a\2\u0c8d\u0c92\5\u02b6\u015c\2"+
		"\u0c8e\u0c92\5\u02b8\u015d\2\u0c8f\u0c92\5\u02ba\u015e\2\u0c90\u0c92\5"+
		"\u02a2\u0152\2\u0c91\u0c87\3\2\2\2\u0c91\u0c88\3\2\2\2\u0c91\u0c89\3\2"+
		"\2\2\u0c91\u0c8a\3\2\2\2\u0c91\u0c8b\3\2\2\2\u0c91\u0c8c\3\2\2\2\u0c91"+
		"\u0c8d\3\2\2\2\u0c91\u0c8e\3\2\2\2\u0c91\u0c8f\3\2\2\2\u0c91\u0c90\3\2"+
		"\2\2\u0c92\u0237\3\2\2\2\u0c93\u0c94\7y\2\2\u0c94\u0c95\7\n\2\2\u0c95"+
		"\u0c96\5\u023a\u011e\2\u0c96\u0c97\7\13\2\2\u0c97\u0239\3\2\2\2\u0c98"+
		"\u0c9a\5\u023c\u011f\2\u0c99\u0c98\3\2\2\2\u0c99\u0c9a\3\2\2\2\u0c9a\u023b"+
		"\3\2\2\2\u0c9b\u0c9c\b\u011f\1\2\u0c9c\u0c9d\5\u023e\u0120\2\u0c9d\u0ca3"+
		"\3\2\2\2\u0c9e\u0c9f\f\3\2\2\u0c9f\u0ca0\7\7\2\2\u0ca0\u0ca2\5\u023e\u0120"+
		"\2\u0ca1\u0c9e\3\2\2\2\u0ca2\u0ca5\3\2\2\2\u0ca3\u0ca1\3\2\2\2\u0ca3\u0ca4"+
		"\3\2\2\2\u0ca4\u023d\3\2\2\2\u0ca5\u0ca3\3\2\2\2\u0ca6\u0cc3\5\u029e\u0150"+
		"\2\u0ca7\u0cc3\5\u02a8\u0155\2\u0ca8\u0cc3\5\u02b4\u015b\2\u0ca9\u0cc3"+
		"\5\u0298\u014d\2\u0caa\u0cc3\5\u02a6\u0154\2\u0cab\u0cc3\5\u02b2\u015a"+
		"\2\u0cac\u0cc3\5\u02b6\u015c\2\u0cad\u0cc3\5\u02b8\u015d\2\u0cae\u0caf"+
		"\7\u0135\2\2\u0caf\u0cc3\5\u0094K\2\u0cb0\u0cb1\7V\2\2\u0cb1\u0cc3\5\u01bc"+
		"\u00df\2\u0cb2\u0cb3\7\u0182\2\2\u0cb3\u0cc3\5\u02d2\u016a\2\u0cb4\u0cb5"+
		"\7\u0181\2\2\u0cb5\u0cc3\5\u0094K\2\u0cb6\u0cb7\7\u015d\2\2\u0cb7\u0cc3"+
		"\5\u0094K\2\u0cb8\u0cc3\5\u02a4\u0153\2\u0cb9\u0cc3\5\u029a\u014e\2\u0cba"+
		"\u0cbb\7\u0173\2\2\u0cbb\u0cc3\5\u01bc\u00df\2\u0cbc\u0cc3\5\u02ae\u0158"+
		"\2\u0cbd\u0cc3\5\u02ba\u015e\2\u0cbe\u0cbf\7\u0180\2\2\u0cbf\u0cc3\5\u01bc"+
		"\u00df\2\u0cc0\u0cc1\7\u015f\2\2\u0cc1\u0cc3\5\u01bc\u00df\2\u0cc2\u0ca6"+
		"\3\2\2\2\u0cc2\u0ca7\3\2\2\2\u0cc2\u0ca8\3\2\2\2\u0cc2\u0ca9\3\2\2\2\u0cc2"+
		"\u0caa\3\2\2\2\u0cc2\u0cab\3\2\2\2\u0cc2\u0cac\3\2\2\2\u0cc2\u0cad\3\2"+
		"\2\2\u0cc2\u0cae\3\2\2\2\u0cc2\u0cb0\3\2\2\2\u0cc2\u0cb2\3\2\2\2\u0cc2"+
		"\u0cb4\3\2\2\2\u0cc2\u0cb6\3\2\2\2\u0cc2\u0cb8\3\2\2\2\u0cc2\u0cb9\3\2"+
		"\2\2\u0cc2\u0cba\3\2\2\2\u0cc2\u0cbc\3\2\2\2\u0cc2\u0cbd\3\2\2\2\u0cc2"+
		"\u0cbe\3\2\2\2\u0cc2\u0cc0\3\2\2\2\u0cc3\u023f\3\2\2\2\u0cc4\u0cc5\7m"+
		"\2\2\u0cc5\u0cc6\7\n\2\2\u0cc6\u0cc7\5\u0242\u0122\2\u0cc7\u0cc8\7\13"+
		"\2\2\u0cc8\u0241\3\2\2\2\u0cc9\u0ccb\5\u0244\u0123\2\u0cca\u0cc9\3\2\2"+
		"\2\u0cca\u0ccb\3\2\2\2\u0ccb\u0243\3\2\2\2\u0ccc\u0ccd\b\u0123\1\2\u0ccd"+
		"\u0cce\5\u0246\u0124\2\u0cce\u0cd4\3\2\2\2\u0ccf\u0cd0\f\3\2\2\u0cd0\u0cd1"+
		"\7\7\2\2\u0cd1\u0cd3\5\u0246\u0124\2\u0cd2\u0ccf\3\2\2\2\u0cd3\u0cd6\3"+
		"\2\2\2\u0cd4\u0cd2\3\2\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5\u0245\3\2\2\2\u0cd6"+
		"\u0cd4\3\2\2\2\u0cd7\u0cdc\5\u02a8\u0155\2\u0cd8\u0cdc\5\u0298\u014d\2"+
		"\u0cd9\u0cdc\5\u02a6\u0154\2\u0cda\u0cdc\5\u02bc\u015f\2\u0cdb\u0cd7\3"+
		"\2\2\2\u0cdb\u0cd8\3\2\2\2\u0cdb\u0cd9\3\2\2\2\u0cdb\u0cda\3\2\2\2\u0cdc"+
		"\u0247\3\2\2\2\u0cdd\u0cde\7n\2\2\u0cde\u0cdf\7\n\2\2\u0cdf\u0ce0\5\u024a"+
		"\u0126\2\u0ce0\u0ce1\7\13\2\2\u0ce1\u0249\3\2\2\2\u0ce2\u0ce4\5\u024c"+
		"\u0127\2\u0ce3\u0ce2\3\2\2\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u024b\3\2\2\2\u0ce5"+
		"\u0ce6\b\u0127\1\2\u0ce6\u0ce7\5\u024e\u0128\2\u0ce7\u0ced\3\2\2\2\u0ce8"+
		"\u0ce9\f\3\2\2\u0ce9\u0cea\7\7\2\2\u0cea\u0cec\5\u024e\u0128\2\u0ceb\u0ce8"+
		"\3\2\2\2\u0cec\u0cef\3\2\2\2\u0ced\u0ceb\3\2\2\2\u0ced\u0cee\3\2\2\2\u0cee"+
		"\u024d\3\2\2\2\u0cef\u0ced\3\2\2\2\u0cf0\u0cf5\5\u02a8\u0155\2\u0cf1\u0cf5"+
		"\5\u0298\u014d\2\u0cf2\u0cf3\7w\2\2\u0cf3\u0cf5\5\u0094K\2\u0cf4\u0cf0"+
		"\3\2\2\2\u0cf4\u0cf1\3\2\2\2\u0cf4\u0cf2\3\2\2\2\u0cf5\u024f\3\2\2\2\u0cf6"+
		"\u0cf7\7p\2\2\u0cf7\u0cf8\7\n\2\2\u0cf8\u0cf9\5\u0252\u012a\2\u0cf9\u0cfa"+
		"\7\13\2\2\u0cfa\u0251\3\2\2\2\u0cfb\u0cfd\5\u0254\u012b\2\u0cfc\u0cfb"+
		"\3\2\2\2\u0cfc\u0cfd\3\2\2\2\u0cfd\u0253\3\2\2\2\u0cfe\u0cff\b\u012b\1"+
		"\2\u0cff\u0d00\5\u0256\u012c\2\u0d00\u0d06\3\2\2\2\u0d01\u0d02\f\3\2\2"+
		"\u0d02\u0d03\7\7\2\2\u0d03\u0d05\5\u0256\u012c\2\u0d04\u0d01\3\2\2\2\u0d05"+
		"\u0d08\3\2\2\2\u0d06\u0d04\3\2\2\2\u0d06\u0d07\3\2\2\2\u0d07\u0255\3\2"+
		"\2\2\u0d08\u0d06\3\2\2\2\u0d09\u0d0f\5\u02a6\u0154\2\u0d0a\u0d0f\5\u02bc"+
		"\u015f\2\u0d0b\u0d0f\5\u02a8\u0155\2\u0d0c\u0d0d\7\u00c3\2\2\u0d0d\u0d0f"+
		"\5\u01bc\u00df\2\u0d0e\u0d09\3\2\2\2\u0d0e\u0d0a\3\2\2\2\u0d0e\u0d0b\3"+
		"\2\2\2\u0d0e\u0d0c\3\2\2\2\u0d0f\u0257\3\2\2\2\u0d10\u0d11\7o\2\2\u0d11"+
		"\u0d12\7\n\2\2\u0d12\u0d13\5\u025a\u012e\2\u0d13\u0d14\7\13\2\2\u0d14"+
		"\u0259\3\2\2\2\u0d15\u0d17\5\u025c\u012f\2\u0d16\u0d15\3\2\2\2\u0d16\u0d17"+
		"\3\2\2\2\u0d17\u025b\3\2\2\2\u0d18\u0d19\b\u012f\1\2\u0d19\u0d1a\5\u025e"+
		"\u0130\2\u0d1a\u0d20\3\2\2\2\u0d1b\u0d1c\f\3\2\2\u0d1c\u0d1d\7\7\2\2\u0d1d"+
		"\u0d1f\5\u025e\u0130\2\u0d1e\u0d1b\3\2\2\2\u0d1f\u0d22\3\2\2\2\u0d20\u0d1e"+
		"\3\2\2\2\u0d20\u0d21\3\2\2\2\u0d21\u025d\3\2\2\2\u0d22\u0d20\3\2\2\2\u0d23"+
		"\u0d2d\5\u029e\u0150\2\u0d24\u0d25\7+\2\2\u0d25\u0d2d\5\u0094K\2\u0d26"+
		"\u0d2d\5\u02a8\u0155\2\u0d27\u0d2d\5\u0298\u014d\2\u0d28\u0d2d\5\u02a6"+
		"\u0154\2\u0d29\u0d2d\5\u02b2\u015a\2\u0d2a\u0d2d\5\u02a4\u0153\2\u0d2b"+
		"\u0d2d\5\u02a2\u0152\2\u0d2c\u0d23\3\2\2\2\u0d2c\u0d24\3\2\2\2\u0d2c\u0d26"+
		"\3\2\2\2\u0d2c\u0d27\3\2\2\2\u0d2c\u0d28\3\2\2\2\u0d2c\u0d29\3\2\2\2\u0d2c"+
		"\u0d2a\3\2\2\2\u0d2c\u0d2b\3\2\2\2\u0d2d\u025f\3\2\2\2\u0d2e\u0d2f\7h"+
		"\2\2\u0d2f\u0d30\7\n\2\2\u0d30\u0d31\5\u0262\u0132\2\u0d31\u0d32\7\13"+
		"\2\2\u0d32\u0261\3\2\2\2\u0d33\u0d35\5\u0264\u0133\2\u0d34\u0d33\3\2\2"+
		"\2\u0d34\u0d35\3\2\2\2\u0d35\u0263\3\2\2\2\u0d36\u0d37\b\u0133\1\2\u0d37"+
		"\u0d38\5\u0266\u0134\2\u0d38\u0d3e\3\2\2\2\u0d39\u0d3a\f\3\2\2\u0d3a\u0d3b"+
		"\7\7\2\2\u0d3b\u0d3d\5\u0266\u0134\2\u0d3c\u0d39\3\2\2\2\u0d3d\u0d40\3"+
		"\2\2\2\u0d3e\u0d3c\3\2\2\2\u0d3e\u0d3f\3\2\2\2\u0d3f\u0265\3\2\2\2\u0d40"+
		"\u0d3e\3\2\2\2\u0d41\u0d44\7\u01aa\2\2\u0d42\u0d44\5\u02ce\u0168\2\u0d43"+
		"\u0d41\3\2\2\2\u0d43\u0d42\3\2\2\2\u0d44\u0267\3\2\2\2\u0d45\u0d46\7k"+
		"\2\2\u0d46\u0d47\7\n\2\2\u0d47\u0d48\5\u026a\u0136\2\u0d48\u0d49\7\13"+
		"\2\2\u0d49\u0269\3\2\2\2\u0d4a\u0d4c\5\u026c\u0137\2\u0d4b\u0d4a\3\2\2"+
		"\2\u0d4b\u0d4c\3\2\2\2\u0d4c\u026b\3\2\2\2\u0d4d\u0d4e\b\u0137\1\2\u0d4e"+
		"\u0d4f\5\u026e\u0138\2\u0d4f\u0d55\3\2\2\2\u0d50\u0d51\f\3\2\2\u0d51\u0d52"+
		"\7\7\2\2\u0d52\u0d54\5\u026e\u0138\2\u0d53\u0d50\3\2\2\2\u0d54\u0d57\3"+
		"\2\2\2\u0d55\u0d53\3\2\2\2\u0d55\u0d56\3\2\2\2\u0d56\u026d\3\2\2\2\u0d57"+
		"\u0d55\3\2\2\2\u0d58\u0d59\7\u017f\2\2\u0d59\u0d5d\5\u01bc\u00df\2\u0d5a"+
		"\u0d5b\7\u008e\2\2\u0d5b\u0d5d\5\u01bc\u00df\2\u0d5c\u0d58\3\2\2\2\u0d5c"+
		"\u0d5a\3\2\2\2\u0d5d\u026f\3\2\2\2\u0d5e\u0d5f\7u\2\2\u0d5f\u0d60\7\n"+
		"\2\2\u0d60\u0d61\5\u0272\u013a\2\u0d61\u0d62\7\13\2\2\u0d62\u0271\3\2"+
		"\2\2\u0d63\u0d65\5\u0274\u013b\2\u0d64\u0d63\3\2\2\2\u0d64\u0d65\3\2\2"+
		"\2\u0d65\u0273\3\2\2\2\u0d66\u0d67\b\u013b\1\2\u0d67\u0d68\5\u0276\u013c"+
		"\2\u0d68\u0d6e\3\2\2\2\u0d69\u0d6a\f\3\2\2\u0d6a\u0d6b\7\7\2\2\u0d6b\u0d6d"+
		"\5\u0276\u013c\2\u0d6c\u0d69\3\2\2\2\u0d6d\u0d70\3\2\2\2\u0d6e\u0d6c\3"+
		"\2\2\2\u0d6e\u0d6f\3\2\2\2\u0d6f\u0275\3\2\2\2\u0d70\u0d6e\3\2\2\2\u0d71"+
		"\u0d7c\5\u029e\u0150\2\u0d72\u0d7c\5\u0298\u014d\2\u0d73\u0d7c\5\u02a6"+
		"\u0154\2\u0d74\u0d75\7\u013a\2\2\u0d75\u0d7c\5\u00a2R\2\u0d76\u0d77\7"+
		"\u00ae\2\2\u0d77\u0d7c\5\u00a2R\2\u0d78\u0d79\7\64\2\2\u0d79\u0d7c\5\u0094"+
		"K\2\u0d7a\u0d7c\5\u02b2\u015a\2\u0d7b\u0d71\3\2\2\2\u0d7b\u0d72\3\2\2"+
		"\2\u0d7b\u0d73\3\2\2\2\u0d7b\u0d74\3\2\2\2\u0d7b\u0d76\3\2\2\2\u0d7b\u0d78"+
		"\3\2\2\2\u0d7b\u0d7a\3\2\2\2\u0d7c\u0277\3\2\2\2\u0d7d\u0d7e\7l\2\2\u0d7e"+
		"\u0d7f\7\n\2\2\u0d7f\u0d80\5\u027a\u013e\2\u0d80\u0d81\7\13\2\2\u0d81"+
		"\u0279\3\2\2\2\u0d82\u0d84\5\u027c\u013f\2\u0d83\u0d82\3\2\2\2\u0d83\u0d84"+
		"\3\2\2\2\u0d84\u027b\3\2\2\2\u0d85\u0d86\b\u013f\1\2\u0d86\u0d87\5\u027e"+
		"\u0140\2\u0d87\u0d8d\3\2\2\2\u0d88\u0d89\f\3\2\2\u0d89\u0d8a\7\7\2\2\u0d8a"+
		"\u0d8c\5\u027e\u0140\2\u0d8b\u0d88\3\2\2\2\u0d8c\u0d8f\3\2\2\2\u0d8d\u0d8b"+
		"\3\2\2\2\u0d8d\u0d8e\3\2\2\2\u0d8e\u027d\3\2\2\2\u0d8f\u0d8d\3\2\2\2\u0d90"+
		"\u0d98\5\u029c\u014f\2\u0d91\u0d98\5\u02a8\u0155\2\u0d92\u0d93\7\u0088"+
		"\2\2\u0d93\u0d98\5\u01bc\u00df\2\u0d94\u0d98\5\u0298\u014d\2\u0d95\u0d98"+
		"\5\u02a6\u0154\2\u0d96\u0d98\5\u029e\u0150\2\u0d97\u0d90\3\2\2\2\u0d97"+
		"\u0d91\3\2\2\2\u0d97\u0d92\3\2\2\2\u0d97\u0d94\3\2\2\2\u0d97\u0d95\3\2"+
		"\2\2\u0d97\u0d96\3\2\2\2\u0d98\u027f\3\2\2\2\u0d99\u0d9a\7q\2\2\u0d9a"+
		"\u0d9b\7\n\2\2\u0d9b\u0d9c\5\u0282\u0142\2\u0d9c\u0d9d\7\13\2\2\u0d9d"+
		"\u0281\3\2\2\2\u0d9e\u0da0\5\u0284\u0143\2\u0d9f\u0d9e\3\2\2\2\u0d9f\u0da0"+
		"\3\2\2\2\u0da0\u0283\3\2\2\2\u0da1\u0da2\b\u0143\1\2\u0da2\u0da3\5\u0286"+
		"\u0144\2\u0da3\u0da9\3\2\2\2\u0da4\u0da5\f\3\2\2\u0da5\u0da6\7\7\2\2\u0da6"+
		"\u0da8\5\u0286\u0144\2\u0da7\u0da4\3\2\2\2\u0da8\u0dab\3\2\2\2\u0da9\u0da7"+
		"\3\2\2\2\u0da9\u0daa\3\2\2\2\u0daa\u0285\3\2\2\2\u0dab\u0da9\3\2\2\2\u0dac"+
		"\u0db2\5\u02be\u0160\2\u0dad\u0db2\5\u02a6\u0154\2\u0dae\u0db2\5\u029e"+
		"\u0150\2\u0daf\u0db0\7\u017e\2\2\u0db0\u0db2\5\u00a2R\2\u0db1\u0dac\3"+
		"\2\2\2\u0db1\u0dad\3\2\2\2\u0db1\u0dae\3\2\2\2\u0db1\u0daf\3\2\2\2\u0db2"+
		"\u0287\3\2\2\2\u0db3\u0db4\7r\2\2\u0db4\u0db5\7\n\2\2\u0db5\u0db6\5\u028a"+
		"\u0146\2\u0db6\u0db7\7\13\2\2\u0db7\u0289\3\2\2\2\u0db8\u0dba\5\u028c"+
		"\u0147\2\u0db9\u0db8\3\2\2\2\u0db9\u0dba\3\2\2\2\u0dba\u028b\3\2\2\2\u0dbb"+
		"\u0dbc\b\u0147\1\2\u0dbc\u0dbd\5\u028e\u0148\2\u0dbd\u0dc3\3\2\2\2\u0dbe"+
		"\u0dbf\f\3\2\2\u0dbf\u0dc0\7\7\2\2\u0dc0\u0dc2\5\u028e\u0148\2\u0dc1\u0dbe"+
		"\3\2\2\2\u0dc2\u0dc5\3\2\2\2\u0dc3\u0dc1\3\2\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4"+
		"\u028d\3\2\2\2\u0dc5\u0dc3\3\2\2\2\u0dc6\u0dcc\5\u02be\u0160\2\u0dc7\u0dcc"+
		"\5\u02a6\u0154\2\u0dc8\u0dcc\5\u0298\u014d\2\u0dc9\u0dca\7\u00f8\2\2\u0dca"+
		"\u0dcc\5\u01bc\u00df\2\u0dcb\u0dc6\3\2\2\2\u0dcb\u0dc7\3\2\2\2\u0dcb\u0dc8"+
		"\3\2\2\2\u0dcb\u0dc9\3\2\2\2\u0dcc\u028f\3\2\2\2\u0dcd\u0dce\7\u00ac\2"+
		"\2\u0dce\u0dcf\7\n\2\2\u0dcf\u0dd0\5\u0292\u014a\2\u0dd0\u0dd1\7\13\2"+
		"\2\u0dd1\u0291\3\2\2\2\u0dd2\u0dd4\5\u0294\u014b\2\u0dd3\u0dd2\3\2\2\2"+
		"\u0dd3\u0dd4\3\2\2\2\u0dd4\u0293\3\2\2\2\u0dd5\u0dd6\b\u014b\1\2\u0dd6"+
		"\u0dd7\5\u0296\u014c\2\u0dd7\u0ddd\3\2\2\2\u0dd8\u0dd9\f\3\2\2\u0dd9\u0dda"+
		"\7\7\2\2\u0dda\u0ddc\5\u0296\u014c\2\u0ddb\u0dd8\3\2\2\2\u0ddc\u0ddf\3"+
		"\2\2\2\u0ddd\u0ddb\3\2\2\2\u0ddd\u0dde\3\2\2\2\u0dde\u0295\3\2\2\2\u0ddf"+
		"\u0ddd\3\2\2\2\u0de0\u0de6\5\u029c\u014f\2\u0de1\u0de2\7\u00b4\2\2\u0de2"+
		"\u0de6\5\u00a2R\2\u0de3\u0de4\7\u0111\2\2\u0de4\u0de6\5\u01b8\u00dd\2"+
		"\u0de5\u0de0\3\2\2\2\u0de5\u0de1\3\2\2\2\u0de5\u0de3\3\2\2\2\u0de6\u0297"+
		"\3\2\2\2\u0de7\u0de8\7\u009c\2\2\u0de8\u0de9\5\u01bc\u00df\2\u0de9\u0299"+
		"\3\2\2\2\u0dea\u0deb\7\u00d0\2\2\u0deb\u0dec\5\u0090I\2\u0dec\u029b\3"+
		"\2\2\2\u0ded\u0dee\7\u0159\2\2\u0dee\u0def\5\u02d0\u0169\2\u0def\u029d"+
		"\3\2\2\2\u0df0\u0df1\7\u00ee\2\2\u0df1\u0df2\5\u00a2R\2\u0df2\u029f\3"+
		"\2\2\2\u0df3\u0df4\7\u0143\2\2\u0df4\u0df5\5\u0094K\2\u0df5\u02a1\3\2"+
		"\2\2\u0df6\u0df7\7\30\2\2\u0df7\u0df8\5\u0094K\2\u0df8\u02a3\3\2\2\2\u0df9"+
		"\u0dfa\7\u009f\2\2\u0dfa\u0dfb\5\u02c2\u0162\2\u0dfb\u02a5\3\2\2\2\u0dfc"+
		"\u0dfd\7\u00d8\2\2\u0dfd\u0dfe\5\u0094K\2\u0dfe\u02a7\3\2\2\2\u0dff\u0e00"+
		"\7\u0134\2\2\u0e00\u0e01\5\u01bc\u00df\2\u0e01\u02a9\3\2\2\2\u0e02\u0e03"+
		"\79\2\2\u0e03\u0e04\5\u01bc\u00df\2\u0e04\u02ab\3\2\2\2\u0e05\u0e06\7"+
		"\u010a\2\2\u0e06\u0e07\5\u0094K\2\u0e07\u02ad\3\2\2\2\u0e08\u0e09\7\u015c"+
		"\2\2\u0e09\u0e0a\5\u01bc\u00df\2\u0e0a\u02af\3\2\2\2\u0e0b\u0e0e\7\u01aa"+
		"\2\2\u0e0c\u0e0e\5\u01bc\u00df\2\u0e0d\u0e0b\3\2\2\2\u0e0d\u0e0c\3\2\2"+
		"\2\u0e0e\u02b1\3\2\2\2\u0e0f\u0e10\7\u0165\2\2\u0e10\u0e11\5\u01bc\u00df"+
		"\2\u0e11\u02b3\3\2\2\2\u0e12\u0e13\7\u00da\2\2\u0e13\u0e14\5\u00a2R\2"+
		"\u0e14\u02b5\3\2\2\2\u0e15\u0e16\7\u00cf\2\2\u0e16\u0e17\5\u0090I\2\u0e17"+
		"\u02b7\3\2\2\2\u0e18\u0e19\7\u00ce\2\2\u0e19\u0e1a\5\u0090I\2\u0e1a\u02b9"+
		"\3\2\2\2\u0e1b\u0e1c\7]\2\2\u0e1c\u0e1d\5\u01bc\u00df\2\u0e1d\u02bb\3"+
		"\2\2\2\u0e1e\u0e1f\7Q\2\2\u0e1f\u0e20\5\u0094K\2\u0e20\u02bd\3\2\2\2\u0e21"+
		"\u0e22\7\u0165\2\2\u0e22\u0e23\5\u02cc\u0167\2\u0e23\u02bf\3\2\2\2\u0e24"+
		"\u0e25\7\u01a6\2\2\u0e25\u02c1\3\2\2\2\u0e26\u0e27\b\u0162\1\2\u0e27\u0e28"+
		"\5\u02c4\u0163\2\u0e28\u0e2e\3\2\2\2\u0e29\u0e2a\f\3\2\2\u0e2a\u0e2b\7"+
		"\6\2\2\u0e2b\u0e2d\5\u02c4\u0163\2\u0e2c\u0e29\3\2\2\2\u0e2d\u0e30\3\2"+
		"\2\2\u0e2e\u0e2c\3\2\2\2\u0e2e\u0e2f\3\2\2\2\u0e2f\u02c3\3\2\2\2\u0e30"+
		"\u0e2e\3\2\2\2\u0e31\u0e34\5\u0094K\2\u0e32\u0e34\7\u01a3\2\2\u0e33\u0e31"+
		"\3\2\2\2\u0e33\u0e32\3\2\2\2\u0e34\u02c5\3\2\2\2\u0e35\u0e38\5\u0094K"+
		"\2\u0e36\u0e38\7\u01a2\2\2\u0e37\u0e35\3\2\2\2\u0e37\u0e36\3\2\2\2\u0e38"+
		"\u02c7\3\2\2\2\u0e39\u0e3c\5\u0094K\2\u0e3a\u0e3c\7\u01a5\2\2\u0e3b\u0e39"+
		"\3\2\2\2\u0e3b\u0e3a\3\2\2\2\u0e3c\u02c9\3\2\2\2\u0e3d\u0e40\5\u0094K"+
		"\2\u0e3e\u0e40\7\u01a4\2\2\u0e3f\u0e3d\3\2\2\2\u0e3f\u0e3e\3\2\2\2\u0e40"+
		"\u02cb\3\2\2\2\u0e41\u0e44\5\u0094K\2\u0e42\u0e44\7\u01a8\2\2\u0e43\u0e41"+
		"\3\2\2\2\u0e43\u0e42\3\2\2\2\u0e44\u02cd\3\2\2\2\u0e45\u0e46\7\u01a9\2"+
		"\2\u0e46\u02cf\3\2\2\2\u0e47\u0e4a\5\u0094K\2\u0e48\u0e4a\7\u01a1\2\2"+
		"\u0e49\u0e47\3\2\2\2\u0e49\u0e48\3\2\2\2\u0e4a\u02d1\3\2\2\2\u0e4b\u0e4e"+
		"\5\u0094K\2\u0e4c\u0e4e\7\u01a7\2\2\u0e4d\u0e4b\3\2\2\2\u0e4d\u0e4c\3"+
		"\2\2\2\u0e4e\u02d3\3\2\2\2\u0e4f\u0e54\5\u0094K\2\u0e50\u0e54\7\u00aa"+
		"\2\2\u0e51\u0e54\7\u00d9\2\2\u0e52\u0e54\7\u00f7\2\2\u0e53\u0e4f\3\2\2"+
		"\2\u0e53\u0e50\3\2\2\2\u0e53\u0e51\3\2\2\2\u0e53\u0e52\3\2\2\2\u0e54\u02d5"+
		"\3\2\2\2\u0e55\u0e57\5\u02d8\u016d\2\u0e56\u0e55\3\2\2\2\u0e56\u0e57\3"+
		"\2\2\2\u0e57\u02d7\3\2\2\2\u0e58\u0e59\b\u016d\1\2\u0e59\u0e5a\5\u02dc"+
		"\u016f\2\u0e5a\u0e5f\3\2\2\2\u0e5b\u0e5c\f\3\2\2\u0e5c\u0e5e\5\u02dc\u016f"+
		"\2\u0e5d\u0e5b\3\2\2\2\u0e5e\u0e61\3\2\2\2\u0e5f\u0e5d\3\2\2\2\u0e5f\u0e60"+
		"\3\2\2\2\u0e60\u02d9\3\2\2\2\u0e61\u0e5f\3\2\2\2\u0e62\u0e63\b\u016e\1"+
		"\2\u0e63\u0e64\5\u02dc\u016f\2\u0e64\u0e6a\3\2\2\2\u0e65\u0e66\f\3\2\2"+
		"\u0e66\u0e67\7\7\2\2\u0e67\u0e69\5\u02dc\u016f\2\u0e68\u0e65\3\2\2\2\u0e69"+
		"\u0e6c\3\2\2\2\u0e6a\u0e68\3\2\2\2\u0e6a\u0e6b\3\2\2\2\u0e6b\u02db\3\2"+
		"\2\2\u0e6c\u0e6a\3\2\2\2\u0e6d\u0e6e\5^\60\2\u0e6e\u0e6f\5\u0082B\2\u0e6f"+
		"\u02dd\3\2\2\2\u0e70\u0e72\5\u02e0\u0171\2\u0e71\u0e70\3\2\2\2\u0e71\u0e72"+
		"\3\2\2\2\u0e72\u02df\3\2\2\2\u0e73\u0e74\b\u0171\1\2\u0e74\u0e75\5\u02e2"+
		"\u0172\2\u0e75\u0e7b\3\2\2\2\u0e76\u0e77\f\3\2\2\u0e77\u0e78\7\7\2\2\u0e78"+
		"\u0e7a\5\u02e2\u0172\2\u0e79\u0e76\3\2\2\2\u0e7a\u0e7d\3\2\2\2\u0e7b\u0e79"+
		"\3\2\2\2\u0e7b\u0e7c\3\2\2\2\u0e7c\u02e1\3\2\2\2\u0e7d\u0e7b\3\2\2\2\u0e7e"+
		"\u0e7f\5^\60\2\u0e7f\u0e80\5\u008cG\2\u0e80\u02e3\3\2\2\2\u0e81\u0e82"+
		"\7\31\2\2\u0e82\u0e83\7\u01aa\2\2\u0e83\u02e5\3\2\2\2\u0e84\u0e85\7\34"+
		"\2\2\u0e85\u0e86\7\n\2\2\u0e86\u0e87\7\u01aa\2\2\u0e87\u0e8f\7\13\2\2"+
		"\u0e88\u0e89\7\34\2\2\u0e89\u0e8a\7\n\2\2\u0e8a\u0e8b\7\u01aa\2\2\u0e8b"+
		"\u0e8c\7\7\2\2\u0e8c\u0e8d\7\u01aa\2\2\u0e8d\u0e8f\7\13\2\2\u0e8e\u0e84"+
		"\3\2\2\2\u0e8e\u0e88\3\2\2\2\u0e8f\u02e7\3\2\2\2\u0e90\u0e97\7\t\2\2\u0e91"+
		"\u0e97\5\u02ea\u0176\2\u0e92\u0e93\5\u02ea\u0176\2\u0e93\u0e94\7\7\2\2"+
		"\u0e94\u0e95\7\t\2\2\u0e95\u0e97\3\2\2\2\u0e96\u0e90\3\2\2\2\u0e96\u0e91"+
		"\3\2\2\2\u0e96\u0e92\3\2\2\2\u0e96\u0e97\3\2\2\2\u0e97\u02e9\3\2\2\2\u0e98"+
		"\u0e99\b\u0176\1\2\u0e99\u0e9a\5\u02ec\u0177\2\u0e9a\u0ea0\3\2\2\2\u0e9b"+
		"\u0e9c\f\3\2\2\u0e9c\u0e9d\7\7\2\2\u0e9d\u0e9f\5\u02ec\u0177\2\u0e9e\u0e9b"+
		"\3\2\2\2\u0e9f\u0ea2\3\2\2\2\u0ea0\u0e9e\3\2\2\2\u0ea0\u0ea1\3\2\2\2\u0ea1"+
		"\u02eb\3\2\2\2\u0ea2\u0ea0\3\2\2\2\u0ea3\u0ea4\5^\60\2\u0ea4\u0ea5\5l"+
		"\67\2\u0ea5\u0ea6\7\20\2\2\u0ea6\u0ea9\3\2\2\2\u0ea7\u0ea9\5`\61\2\u0ea8"+
		"\u0ea3\3\2\2\2\u0ea8\u0ea7\3\2\2\2\u0ea9\u0eaa\3\2\2\2\u0eaa\u0eab\5\u0334"+
		"\u019b\2\u0eab\u0eac\5\u0082B\2\u0eac\u0eb1\3\2\2\2\u0ead\u0eae\5v<\2"+
		"\u0eae\u0eaf\5\u01be\u00e0\2\u0eaf\u0eb1\3\2\2\2\u0eb0\u0ea8\3\2\2\2\u0eb0"+
		"\u0ead\3\2\2\2\u0eb1\u02ed\3\2\2\2\u0eb2\u0eb3\t\t\2\2\u0eb3\u02ef\3\2"+
		"\2\2\u0eb4\u0eb6\5\u02f2\u017a\2\u0eb5\u0eb4\3\2\2\2\u0eb5\u0eb6\3\2\2"+
		"\2\u0eb6\u02f1\3\2\2\2\u0eb7\u0ee1\7\36\2\2\u0eb8\u0ee1\7\37\2\2\u0eb9"+
		"\u0ee1\7 \2\2\u0eba\u0ee1\7!\2\2\u0ebb\u0ee1\7\"\2\2\u0ebc\u0ee1\7#\2"+
		"\2\u0ebd\u0ee1\7$\2\2\u0ebe\u0ee1\7%\2\2\u0ebf\u0ee1\7(\2\2\u0ec0\u0ee1"+
		"\7.\2\2\u0ec1\u0ee1\7-\2\2\u0ec2\u0ee1\7/\2\2\u0ec3\u0ee1\7\67\2\2\u0ec4"+
		"\u0ee1\78\2\2\u0ec5\u0ee1\7H\2\2\u0ec6\u0ee1\7P\2\2\u0ec7\u0ee1\7Z\2\2"+
		"\u0ec8\u0ee1\7\u0098\2\2\u0ec9\u0ee1\7\u00af\2\2\u0eca\u0ee1\7\u00b6\2"+
		"\2\u0ecb\u0ee1\7\u00b5\2\2\u0ecc\u0ee1\7\u00ca\2\2\u0ecd\u0ee1\7\u00ea"+
		"\2\2\u0ece\u0ee1\7\u011a\2\2\u0ecf\u0ee1\7\u011b\2\2\u0ed0\u0ee1\7\u0121"+
		"\2\2\u0ed1\u0ee1\7\u0122\2\2\u0ed2\u0ee1\7\u0148\2\2\u0ed3\u0ee1\7\u0149"+
		"\2\2\u0ed4\u0ee1\7\u0154\2\2\u0ed5\u0ee1\7\u0187\2\2\u0ed6\u0ee1\7\u0188"+
		"\2\2\u0ed7\u0ee1\7\u018c\2\2\u0ed8\u0ee1\7\u018d\2\2\u0ed9\u0ee1\7\u018f"+
		"\2\2\u0eda\u0ee1\7\u0191\2\2\u0edb\u0ee1\7\u0192\2\2\u0edc\u0ee1\7\u0193"+
		"\2\2\u0edd\u0ee1\7\u0194\2\2\u0ede\u0edf\7G\2\2\u0edf\u0ee1\7\u01aa\2"+
		"\2\u0ee0\u0eb7\3\2\2\2\u0ee0\u0eb8\3\2\2\2\u0ee0\u0eb9\3\2\2\2\u0ee0\u0eba"+
		"\3\2\2\2\u0ee0\u0ebb\3\2\2\2\u0ee0\u0ebc\3\2\2\2\u0ee0\u0ebd\3\2\2\2\u0ee0"+
		"\u0ebe\3\2\2\2\u0ee0\u0ebf\3\2\2\2\u0ee0\u0ec0\3\2\2\2\u0ee0\u0ec1\3\2"+
		"\2\2\u0ee0\u0ec2\3\2\2\2\u0ee0\u0ec3\3\2\2\2\u0ee0\u0ec4\3\2\2\2\u0ee0"+
		"\u0ec5\3\2\2\2\u0ee0\u0ec6\3\2\2\2\u0ee0\u0ec7\3\2\2\2\u0ee0\u0ec8\3\2"+
		"\2\2\u0ee0\u0ec9\3\2\2\2\u0ee0\u0eca\3\2\2\2\u0ee0\u0ecb\3\2\2\2\u0ee0"+
		"\u0ecc\3\2\2\2\u0ee0\u0ecd\3\2\2\2\u0ee0\u0ece\3\2\2\2\u0ee0\u0ecf\3\2"+
		"\2\2\u0ee0\u0ed0\3\2\2\2\u0ee0\u0ed1\3\2\2\2\u0ee0\u0ed2\3\2\2\2\u0ee0"+
		"\u0ed3\3\2\2\2\u0ee0\u0ed4\3\2\2\2\u0ee0\u0ed5\3\2\2\2\u0ee0\u0ed6\3\2"+
		"\2\2\u0ee0\u0ed7\3\2\2\2\u0ee0\u0ed8\3\2\2\2\u0ee0\u0ed9\3\2\2\2\u0ee0"+
		"\u0eda\3\2\2\2\u0ee0\u0edb\3\2\2\2\u0ee0\u0edc\3\2\2\2\u0ee0\u0edd\3\2"+
		"\2\2\u0ee0\u0ede\3\2\2\2\u0ee1\u02f3\3\2\2\2\u0ee2\u0ee4\5\u02f6\u017c"+
		"\2\u0ee3\u0ee2\3\2\2\2\u0ee3\u0ee4\3\2\2\2\u0ee4\u02f5\3\2\2\2\u0ee5\u0eec"+
		"\7R\2\2\u0ee6\u0ee7\7R\2\2\u0ee7\u0ee8\7\n\2\2\u0ee8\u0ee9\5X-\2\u0ee9"+
		"\u0eea\7\13\2\2\u0eea\u0eec\3\2\2\2\u0eeb\u0ee5\3\2\2\2\u0eeb\u0ee6\3"+
		"\2\2\2\u0eec\u02f7\3\2\2\2\u0eed\u0eee\7a\2\2\u0eee\u0eef\7\n\2\2\u0eef"+
		"\u0ef0\7\u01aa\2\2\u0ef0\u0ef6\7\13\2\2\u0ef1\u0ef2\7b\2\2\u0ef2\u0ef3"+
		"\7\n\2\2\u0ef3\u0ef4\7\u01aa\2\2\u0ef4\u0ef6\7\13\2\2\u0ef5\u0eed\3\2"+
		"\2\2\u0ef5\u0ef1\3\2\2\2\u0ef6\u02f9\3\2\2\2\u0ef7\u0ef9\5\u02fc\u017f"+
		"\2\u0ef8\u0ef7\3\2\2\2\u0ef8\u0ef9\3\2\2\2\u0ef9\u02fb\3\2\2\2\u0efa\u0efb"+
		"\t\n\2\2\u0efb\u02fd\3\2\2\2\u0efc\u0efe\7\u008b\2\2\u0efd\u0efc\3\2\2"+
		"\2\u0efd\u0efe\3\2\2\2\u0efe\u02ff\3\2\2\2\u0eff\u0f01\5\u0302\u0182\2"+
		"\u0f00\u0eff\3\2\2\2\u0f00\u0f01\3\2\2\2\u0f01\u0301\3\2\2\2\u0f02\u0f03"+
		"\b\u0182\1\2\u0f03\u0f04\5\u0304\u0183\2\u0f04\u0f0a\3\2\2\2\u0f05\u0f06"+
		"\f\3\2\2\u0f06\u0f07\7\7\2\2\u0f07\u0f09\5\u0304\u0183\2\u0f08\u0f05\3"+
		"\2\2\2\u0f09\u0f0c\3\2\2\2\u0f0a\u0f08\3\2\2\2\u0f0a\u0f0b\3\2\2\2\u0f0b"+
		"\u0303\3\2\2\2\u0f0c\u0f0a\3\2\2\2\u0f0d\u0f0e\5^\60\2\u0f0e\u0f0f\5l"+
		"\67\2\u0f0f\u0f10\7\20\2\2\u0f10\u0f13\3\2\2\2\u0f11\u0f13\5`\61\2\u0f12"+
		"\u0f0d\3\2\2\2\u0f12\u0f11\3\2\2\2\u0f13\u0f14\3\2\2\2\u0f14\u0f15\5\u0082"+
		"B\2\u0f15\u0f1a\3\2\2\2\u0f16\u0f17\5v<\2\u0f17\u0f18\5\u01be\u00e0\2"+
		"\u0f18\u0f1a\3\2\2\2\u0f19\u0f12\3\2\2\2\u0f19\u0f16\3\2\2\2\u0f1a\u0305"+
		"\3\2\2\2\u0f1b\u0f1e\5\u009aN\2\u0f1c\u0f1e\5R*\2\u0f1d\u0f1b\3\2\2\2"+
		"\u0f1d\u0f1c\3\2\2\2\u0f1e\u0307\3\2\2\2\u0f1f\u0f21\5\u030a\u0186\2\u0f20"+
		"\u0f1f\3\2\2\2\u0f20\u0f21\3\2\2\2\u0f21\u0309\3\2\2\2\u0f22\u0f23\b\u0186"+
		"\1\2\u0f23\u0f24\5\u030c\u0187\2\u0f24\u0f29\3\2\2\2\u0f25\u0f26\f\3\2"+
		"\2\u0f26\u0f28\5\u030c\u0187\2\u0f27\u0f25\3\2\2\2\u0f28\u0f2b\3\2\2\2"+
		"\u0f29\u0f27\3\2\2\2\u0f29\u0f2a\3\2\2\2\u0f2a\u030b\3\2\2\2\u0f2b\u0f29"+
		"\3\2\2\2\u0f2c\u0f2d\t\13\2\2\u0f2d\u030d\3\2\2\2\u0f2e\u0f2f\t\f\2\2"+
		"\u0f2f\u030f\3\2\2\2\u0f30\u0f32\5\u0312\u018a\2\u0f31\u0f30\3\2\2\2\u0f31"+
		"\u0f32\3\2\2\2\u0f32\u0311\3\2\2\2\u0f33\u0f34\b\u018a\1\2\u0f34\u0f35"+
		"\5\u0314\u018b\2\u0f35\u0f3a\3\2\2\2\u0f36\u0f37\f\3\2\2\u0f37\u0f39\5"+
		"\u0314\u018b\2\u0f38\u0f36\3\2\2\2\u0f39\u0f3c\3\2\2\2\u0f3a\u0f38\3\2"+
		"\2\2\u0f3a\u0f3b\3\2\2\2\u0f3b\u0313\3\2\2\2\u0f3c\u0f3a\3\2\2\2\u0f3d"+
		"\u0f72\5V,\2\u0f3e\u0f3f\7\31\2\2\u0f3f\u0f40\7\4\2\2\u0f40\u0f72\7\u01aa"+
		"\2\2\u0f41\u0f42\7\32\2\2\u0f42\u0f43\7\4\2\2\u0f43\u0f72\7\u01aa\2\2"+
		"\u0f44\u0f72\5\u02e4\u0173\2\u0f45\u0f72\5\u02e6\u0174\2\u0f46\u0f72\5"+
		"\u034c\u01a7\2\u0f47\u0f72\5\u00a2R\2\u0f48\u0f49\5\u00a2R\2\u0f49\u0f4a"+
		"\7\4\2\2\u0f4a\u0f4b\5\u00a2R\2\u0f4b\u0f72\3\2\2\2\u0f4c\u0f72\7\35\2"+
		"\2\u0f4d\u0f72\7,\2\2\u0f4e\u0f72\7=\2\2\u0f4f\u0f72\7O\2\2\u0f50\u0f72"+
		"\7X\2\2\u0f51\u0f72\7\u00bd\2\2\u0f52\u0f72\7\u00bc\2\2\u0f53\u0f72\7"+
		"\u00c4\2\2\u0f54\u0f72\7\u00d3\2\2\u0f55\u0f72\7\u00e7\2\2\u0f56\u0f72"+
		"\7\u00ed\2\2\u0f57\u0f72\7\u00f5\2\2\u0f58\u0f72\7\u00f9\2\2\u0f59\u0f72"+
		"\7\u00fb\2\2\u0f5a\u0f72\7\u00fc\2\2\u0f5b\u0f72\7\u00fe\2\2\u0f5c\u0f72"+
		"\7\u0100\2\2\u0f5d\u0f72\7\u0101\2\2\u0f5e\u0f72\7\u0102\2\2\u0f5f\u0f72"+
		"\7\u0104\2\2\u0f60\u0f72\7\u0112\2\2\u0f61\u0f72\7\u0113\2\2\u0f62\u0f72"+
		"\7\u0123\2\2\u0f63\u0f72\7\u0124\2\2\u0f64\u0f72\7\u012b\2\2\u0f65\u0f72"+
		"\7\u012e\2\2\u0f66\u0f72\7\u0130\2\2\u0f67\u0f72\7\u0131\2\2\u0f68\u0f72"+
		"\7\u0132\2\2\u0f69\u0f72\7\u0133\2\2\u0f6a\u0f72\7\u0147\2\2\u0f6b\u0f72"+
		"\7\u014e\2\2\u0f6c\u0f72\7\u014f\2\2\u0f6d\u0f72\7\u0150\2\2\u0f6e\u0f72"+
		"\7\u0152\2\2\u0f6f\u0f72\7\u017c\2\2\u0f70\u0f72\7\u018a\2\2\u0f71\u0f3d"+
		"\3\2\2\2\u0f71\u0f3e\3\2\2\2\u0f71\u0f41\3\2\2\2\u0f71\u0f44\3\2\2\2\u0f71"+
		"\u0f45\3\2\2\2\u0f71\u0f46\3\2\2\2\u0f71\u0f47\3\2\2\2\u0f71\u0f48\3\2"+
		"\2\2\u0f71\u0f4c\3\2\2\2\u0f71\u0f4d\3\2\2\2\u0f71\u0f4e\3\2\2\2\u0f71"+
		"\u0f4f\3\2\2\2\u0f71\u0f50\3\2\2\2\u0f71\u0f51\3\2\2\2\u0f71\u0f52\3\2"+
		"\2\2\u0f71\u0f53\3\2\2\2\u0f71\u0f54\3\2\2\2\u0f71\u0f55\3\2\2\2\u0f71"+
		"\u0f56\3\2\2\2\u0f71\u0f57\3\2\2\2\u0f71\u0f58\3\2\2\2\u0f71\u0f59\3\2"+
		"\2\2\u0f71\u0f5a\3\2\2\2\u0f71\u0f5b\3\2\2\2\u0f71\u0f5c\3\2\2\2\u0f71"+
		"\u0f5d\3\2\2\2\u0f71\u0f5e\3\2\2\2\u0f71\u0f5f\3\2\2\2\u0f71\u0f60\3\2"+
		"\2\2\u0f71\u0f61\3\2\2\2\u0f71\u0f62\3\2\2\2\u0f71\u0f63\3\2\2\2\u0f71"+
		"\u0f64\3\2\2\2\u0f71\u0f65\3\2\2\2\u0f71\u0f66\3\2\2\2\u0f71\u0f67\3\2"+
		"\2\2\u0f71\u0f68\3\2\2\2\u0f71\u0f69\3\2\2\2\u0f71\u0f6a\3\2\2\2\u0f71"+
		"\u0f6b\3\2\2\2\u0f71\u0f6c\3\2\2\2\u0f71\u0f6d\3\2\2\2\u0f71\u0f6e\3\2"+
		"\2\2\u0f71\u0f6f\3\2\2\2\u0f71\u0f70\3\2\2\2\u0f72\u0315\3\2\2\2\u0f73"+
		"\u0f75\7\u00bf\2\2\u0f74\u0f73\3\2\2\2\u0f74\u0f75\3\2\2\2\u0f75\u0317"+
		"\3\2\2\2\u0f76\u0f77\7\7\2\2\u0f77\u0f79\5\u031a\u018e\2\u0f78\u0f76\3"+
		"\2\2\2\u0f78\u0f79\3\2\2\2\u0f79\u0319\3\2\2\2\u0f7a\u0f7b\b\u018e\1\2"+
		"\u0f7b\u0f7c\5\u031c\u018f\2\u0f7c\u0f82\3\2\2\2\u0f7d\u0f7e\f\3\2\2\u0f7e"+
		"\u0f7f\7\7\2\2\u0f7f\u0f81\5\u031c\u018f\2\u0f80\u0f7d\3\2\2\2\u0f81\u0f84"+
		"\3\2\2\2\u0f82\u0f80\3\2\2\2\u0f82\u0f83\3\2\2\2\u0f83\u031b\3\2\2\2\u0f84"+
		"\u0f82\3\2\2\2\u0f85\u0f86\7\u01aa\2\2\u0f86\u031d\3\2\2\2\u0f87\u0f88"+
		"\t\r\2\2\u0f88\u031f\3\2\2\2\u0f89\u0f8b\5\u0322\u0192\2\u0f8a\u0f89\3"+
		"\2\2\2\u0f8a\u0f8b\3\2\2\2\u0f8b\u0321\3\2\2\2\u0f8c\u0f8d\t\16\2\2\u0f8d"+
		"\u0323\3\2\2\2\u0f8e\u0f90\5\u0326\u0194\2\u0f8f\u0f8e\3\2\2\2\u0f8f\u0f90"+
		"\3\2\2\2\u0f90\u0325\3\2\2\2\u0f91\u0f92\t\17\2\2\u0f92\u0327\3\2\2\2"+
		"\u0f93\u0f94\7\f\2\2\u0f94\u0f95\5\u032a\u0196\2\u0f95\u0f96\7\r\2\2\u0f96"+
		"\u0f98\3\2\2\2\u0f97\u0f93\3\2\2\2\u0f97\u0f98\3\2\2\2\u0f98\u0329\3\2"+
		"\2\2\u0f99\u0f9a\b\u0196\1\2\u0f9a\u0f9b\5\u032c\u0197\2\u0f9b\u0fa0\3"+
		"\2\2\2\u0f9c\u0f9d\f\3\2\2\u0f9d\u0f9f\5\u032c\u0197\2\u0f9e\u0f9c\3\2"+
		"\2\2\u0f9f\u0fa2\3\2\2\2\u0fa0\u0f9e\3\2\2\2\u0fa0\u0fa1\3\2\2\2\u0fa1"+
		"\u032b\3\2\2\2\u0fa2\u0fa0\3\2\2\2\u0fa3\u0fa4\5\u00a2R\2\u0fa4\u0fa5"+
		"\7\n\2\2\u0fa5\u0fa6\5\u02d6\u016c\2\u0fa6\u0fa7\7\13\2\2\u0fa7\u032d"+
		"\3\2\2\2\u0fa8\u0faa\5\u0330\u0199\2\u0fa9\u0fa8\3\2\2\2\u0fa9\u0faa\3"+
		"\2\2\2\u0faa\u032f\3\2\2\2\u0fab\u0fac\b\u0199\1\2\u0fac\u0fad\5\u0332"+
		"\u019a\2\u0fad\u0fb2\3\2\2\2\u0fae\u0faf\f\3\2\2\u0faf\u0fb1\5\u0332\u019a"+
		"\2\u0fb0\u0fae\3\2\2\2\u0fb1\u0fb4\3\2\2\2\u0fb2\u0fb0\3\2\2\2\u0fb2\u0fb3"+
		"\3\2\2\2\u0fb3\u0331\3\2\2\2\u0fb4\u0fb2\3\2\2\2\u0fb5\u0fb6\t\20\2\2"+
		"\u0fb6\u0333\3\2\2\2\u0fb7\u0fb9\5\u0336\u019c\2\u0fb8\u0fb7\3\2\2\2\u0fb8"+
		"\u0fb9\3\2\2\2\u0fb9\u0335\3\2\2\2\u0fba\u0fbb\b\u019c\1\2\u0fbb\u0fbc"+
		"\5\u0338\u019d\2\u0fbc\u0fc1\3\2\2\2\u0fbd\u0fbe\f\3\2\2\u0fbe\u0fc0\5"+
		"\u0338\u019d\2\u0fbf\u0fbd\3\2\2\2\u0fc0\u0fc3\3\2\2\2\u0fc1\u0fbf\3\2"+
		"\2\2\u0fc1\u0fc2\3\2\2\2\u0fc2\u0337\3\2\2\2\u0fc3\u0fc1\3\2\2\2\u0fc4"+
		"\u0fd8\5\u02e4\u0173\2\u0fc5\u0fd8\5\u02f8\u017d\2\u0fc6\u0fd8\5\u00a2"+
		"R\2\u0fc7\u0fd8\7>\2\2\u0fc8\u0fd8\7\u00be\2\2\u0fc9\u0fd8\7\u00c6\2\2"+
		"\u0fca\u0fd8\7\u00f1\2\2\u0fcb\u0fd8\7\u00f4\2\2\u0fcc\u0fd8\7\u00f6\2"+
		"\2\u0fcd\u0fd8\7\u00ff\2\2\u0fce\u0fd8\7\u0123\2\2\u0fcf\u0fd8\7\u0124"+
		"\2\2\u0fd0\u0fd8\7\u012a\2\2\u0fd1\u0fd8\7\u0141\2\2\u0fd2\u0fd8\7\u014d"+
		"\2\2\u0fd3\u0fd8\7\u0155\2\2\u0fd4\u0fd8\7\u0156\2\2\u0fd5\u0fd8\7\u018a"+
		"\2\2\u0fd6\u0fd8\7\u0197\2\2\u0fd7\u0fc4\3\2\2\2\u0fd7\u0fc5\3\2\2\2\u0fd7"+
		"\u0fc6\3\2\2\2\u0fd7\u0fc7\3\2\2\2\u0fd7\u0fc8\3\2\2\2\u0fd7\u0fc9\3\2"+
		"\2\2\u0fd7\u0fca\3\2\2\2\u0fd7\u0fcb\3\2\2\2\u0fd7\u0fcc\3\2\2\2\u0fd7"+
		"\u0fcd\3\2\2\2\u0fd7\u0fce\3\2\2\2\u0fd7\u0fcf\3\2\2\2\u0fd7\u0fd0\3\2"+
		"\2\2\u0fd7\u0fd1\3\2\2\2\u0fd7\u0fd2\3\2\2\2\u0fd7\u0fd3\3\2\2\2\u0fd7"+
		"\u0fd4\3\2\2\2\u0fd7\u0fd5\3\2\2\2\u0fd7\u0fd6\3\2\2\2\u0fd8\u0339\3\2"+
		"\2\2\u0fd9\u0fe0\7\t\2\2\u0fda\u0fe0\5\u033c\u019f\2\u0fdb\u0fdc\5\u033c"+
		"\u019f\2\u0fdc\u0fdd\7\7\2\2\u0fdd\u0fde\7\t\2\2\u0fde\u0fe0\3\2\2\2\u0fdf"+
		"\u0fd9\3\2\2\2\u0fdf\u0fda\3\2\2\2\u0fdf\u0fdb\3\2\2\2\u0fdf\u0fe0\3\2"+
		"\2\2\u0fe0\u033b\3\2\2\2\u0fe1\u0fe2\b\u019f\1\2\u0fe2\u0fe3\5\u033e\u01a0"+
		"\2\u0fe3\u0fe9\3\2\2\2\u0fe4\u0fe5\f\3\2\2\u0fe5\u0fe6\7\7\2\2\u0fe6\u0fe8"+
		"\5\u033e\u01a0\2\u0fe7\u0fe4\3\2\2\2\u0fe8\u0feb\3\2\2\2\u0fe9\u0fe7\3"+
		"\2\2\2\u0fe9\u0fea\3\2\2\2\u0fea\u033d\3\2\2\2\u0feb\u0fe9\3\2\2\2\u0fec"+
		"\u0fed\5^\60\2\u0fed\u0fee\5\u0334\u019b\2\u0fee\u0ff4\3\2\2\2\u0fef\u0ff0"+
		"\5^\60\2\u0ff0\u0ff1\5\u0334\u019b\2\u0ff1\u0ff2\5R*\2\u0ff2\u0ff4\3\2"+
		"\2\2\u0ff3\u0fec\3\2\2\2\u0ff3\u0fef\3\2\2\2\u0ff4\u033f\3\2\2\2\u0ff5"+
		"\u0ff7\5\u0342\u01a2\2\u0ff6\u0ff5\3\2\2\2\u0ff6\u0ff7\3\2\2\2\u0ff7\u0341"+
		"\3\2\2\2\u0ff8\u0ff9\t\21\2\2\u0ff9\u0343\3\2\2\2\u0ffa\u0ffc\5\u0346"+
		"\u01a4\2\u0ffb\u0ffa\3\2\2\2\u0ffb\u0ffc\3\2\2\2\u0ffc\u0345\3\2\2\2\u0ffd"+
		"\u0ffe\b\u01a4\1\2\u0ffe\u0fff\5\u0348\u01a5\2\u0fff\u1004\3\2\2\2\u1000"+
		"\u1001\f\3\2\2\u1001\u1003\5\u0348\u01a5\2\u1002\u1000\3\2\2\2\u1003\u1006"+
		"\3\2\2\2\u1004\u1002\3\2\2\2\u1004\u1005\3\2\2\2\u1005\u0347\3\2\2\2\u1006"+
		"\u1004\3\2\2\2\u1007\u1010\5\u02e4\u0173\2\u1008\u1010\5\u02f8\u017d\2"+
		"\u1009\u1010\5\u00a2R\2\u100a\u1010\7\u00c6\2\2\u100b\u1010\7\u00f4\2"+
		"\2\u100c\u1010\7\u00ff\2\2\u100d\u1010\7\u0141\2\2\u100e\u1010\7\u0197"+
		"\2\2\u100f\u1007\3\2\2\2\u100f\u1008\3\2\2\2\u100f\u1009\3\2\2\2\u100f"+
		"\u100a\3\2\2\2\u100f\u100b\3\2\2\2\u100f\u100c\3\2\2\2\u100f\u100d\3\2"+
		"\2\2\u100f\u100e\3\2\2\2\u1010\u0349\3\2\2\2\u1011\u1012\7\u0137\2\2\u1012"+
		"\u1013\7\u01b2\2\2\u1013\u034b\3\2\2\2\u1014\u1015\7\32\2\2\u1015\u1016"+
		"\7\n\2\2\u1016\u1017\7\u01aa\2\2\u1017\u1018\7\13\2\2\u1018\u034d\3\2"+
		"\2\2\u1019\u101a\7\u0158\2\2\u101a\u101b\7\n\2\2\u101b\u101c\7\u01b2\2"+
		"\2\u101c\u101e\7\13\2\2\u101d\u1019\3\2\2\2\u101d\u101e\3\2\2\2\u101e"+
		"\u034f\3\2\2\2\u101f\u1026\7\u015e\2\2\u1020\u1021\7\u015e\2\2\u1021\u1022"+
		"\7\n\2\2\u1022\u1023\5\u0352\u01aa\2\u1023\u1024\7\13\2\2\u1024\u1026"+
		"\3\2\2\2\u1025\u101f\3\2\2\2\u1025\u1020\3\2\2\2\u1026\u0351\3\2\2\2\u1027"+
		"\u1028\t\22\2\2\u1028\u0353\3\2\2\2\u1029\u102a\t\23\2\2\u102a\u0355\3"+
		"\2\2\2\u102b\u102c\t\24\2\2\u102c\u0357\3\2\2\2\u00eb\u035a\u035f\u0368"+
		"\u037a\u0388\u0398\u03a6\u03aa\u03ad\u03bb\u03bf\u03c2\u03cd\u03d3\u03dd"+
		"\u03e4\u03eb\u03ef\u03f2\u03ff\u0403\u0406\u040e\u041f\u042a\u042e\u0438"+
		"\u043e\u0444\u044a\u0460\u046a\u046f\u047b\u047e\u0481\u048a\u04b0\u04bb"+
		"\u04bd\u04c9\u04d6\u04ff\u0509\u0513\u051e\u0521\u0524\u0534\u0554\u0596"+
		"\u0680\u068a\u0692\u0723\u072b\u072e\u0737\u0743\u0775\u087d\u0880\u0883"+
		"\u0887\u0891\u089e\u08ab\u08b7\u08bb\u08c6\u08d4\u08e2\u08ef\u08f9\u0909"+
		"\u090d\u092d\u09a8\u09cb\u09db\u09de\u09e7\u09f2\u0a0f\u0a1b\u0a20\u0a3e"+
		"\u0a47\u0a61\u0a9f\u0aaa\u0ab4\u0ab9\u0ac2\u0acd\u0ad0\u0ad9\u0ade\u0ae8"+
		"\u0b04\u0b0c\u0b16\u0b39\u0b41\u0b4b\u0b56\u0b5e\u0b68\u0b71\u0b79\u0b83"+
		"\u0b8b\u0b93\u0b9d\u0bae\u0bb6\u0bc0\u0bd8\u0be0\u0bea\u0bf1\u0bf9\u0c03"+
		"\u0c0b\u0c13\u0c1d\u0c22\u0c2a\u0c34\u0c3c\u0c44\u0c4e\u0c59\u0c61\u0c6b"+
		"\u0c72\u0c7a\u0c84\u0c91\u0c99\u0ca3\u0cc2\u0cca\u0cd4\u0cdb\u0ce3\u0ced"+
		"\u0cf4\u0cfc\u0d06\u0d0e\u0d16\u0d20\u0d2c\u0d34\u0d3e\u0d43\u0d4b\u0d55"+
		"\u0d5c\u0d64\u0d6e\u0d7b\u0d83\u0d8d\u0d97\u0d9f\u0da9\u0db1\u0db9\u0dc3"+
		"\u0dcb\u0dd3\u0ddd\u0de5\u0e0d\u0e2e\u0e33\u0e37\u0e3b\u0e3f\u0e43\u0e49"+
		"\u0e4d\u0e53\u0e56\u0e5f\u0e6a\u0e71\u0e7b\u0e8e\u0e96\u0ea0\u0ea8\u0eb0"+
		"\u0eb5\u0ee0\u0ee3\u0eeb\u0ef5\u0ef8\u0efd\u0f00\u0f0a\u0f12\u0f19\u0f1d"+
		"\u0f20\u0f29\u0f31\u0f3a\u0f71\u0f74\u0f78\u0f82\u0f8a\u0f8f\u0f97\u0fa0"+
		"\u0fa9\u0fb2\u0fb8\u0fc1\u0fd7\u0fdf\u0fe9\u0ff3\u0ff6\u0ffb\u1004\u100f"+
		"\u101d\u1025";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}