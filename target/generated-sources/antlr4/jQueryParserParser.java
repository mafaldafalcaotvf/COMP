// Generated from jQueryParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jQueryParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, IntegerLiteral=90, FloatingPointLiteral=91, BooleanLiteral=92, 
		CharacterLiteral=93, StringLiteral=94, NullLiteral=95, Identifier=96, 
		AT=97, ELLIPSIS=98, ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, 
		CASE=6, CATCH=7, CHAR=8, CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, 
		DOUBLE=14, ELSE=15, ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, 
		FOR=21, IF=22, GOTO=23, IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, 
		INTERFACE=28, LONG=29, NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, 
		PUBLIC=35, RETURN=36, SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, 
		SYNCHRONIZED=42, THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, 
		VOLATILE=49, WHILE=50, LPAREN=51, RPAREN=52, LBRACE=53, RBRACE=54, LBRACK=55, 
		RBRACK=56, SEMI=57, COMMA=58, DOT=59, ASSIGN=60, GT=61, LT=62, BANG=63, 
		TILDE=64, QUESTION=65, COLON=66, EQUAL=67, LE=68, GE=69, NOTEQUAL=70, 
		AND=71, OR=72, INC=73, DEC=74, ADD=75, SUB=76, MUL=77, DIV=78, BITAND=79, 
		BITOR=80, CARET=81, MOD=82, ADD_ASSIGN=83, SUB_ASSIGN=84, MUL_ASSIGN=85, 
		DIV_ASSIGN=86, AND_ASSIGN=87, OR_ASSIGN=88, XOR_ASSIGN=89, MOD_ASSIGN=90, 
		LSHIFT_ASSIGN=91, RSHIFT_ASSIGN=92, URSHIFT_ASSIGN=93, WS=94, COMMENT=95, 
		LINE_COMMENT=96, JQBEGIN=97, JQEND=98, DOLLAR=99, LETTER=100, DIGIT=101, 
		NUMBER=102, VAR=103, STRING=104, END=105, OPENP=106, CLOSEP=107, OPENB=108, 
		CLOSEB=109, OPENC=110, CLOSEC=111, IN=112, OUT=113, QUOTES=114, CONTAINS_SUB_STRING=115, 
		CONTAINS_WORD=116, CONTAINS_PREFIX=117, EQUALS=118, NOT_EQUALS=119, STARTS_WITH=120, 
		ENDS_WITH=121, BASIC_FILTER=122, CONTENT_FILTER=123, HIERARCHY_SELECTOR=124, 
		CHILD_FILTER=125, EVENT=126, ADDFUNCS=127, OPERATION=128;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37, 
		RULE_type = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40, 
		RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43, 
		RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46, 
		RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49, 
		RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_statement = 70, RULE_catchClause = 71, 
		RULE_catchType = 72, RULE_finallyBlock = 73, RULE_resourceSpecification = 74, 
		RULE_resources = 75, RULE_resource = 76, RULE_switchBlockStatementGroup = 77, 
		RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		RULE_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, 
		RULE_nonWildcardTypeArguments = 95, RULE_typeArgumentsOrDiamond = 96, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 97, RULE_superSuffix = 98, RULE_explicitGenericInvocationSuffix = 99, 
		RULE_arguments = 100, RULE_main = 101, RULE_code = 102, RULE_ops = 103, 
		RULE_filter = 104, RULE_variable = 105, RULE_assign_selection = 106, RULE_selector = 107, 
		RULE_input = 108, RULE_output = 109;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "type", "classOrInterfaceType", "primitiveType", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "methodBody", "constructorBody", 
		"qualifiedName", "literal", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments", "main", "code", "ops", 
		"filter", "variable", "assign_selection", "selector", "input", "output"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'assert'", "'import'", "'static'", "'.'", "'*'", "'native'", 
		"'synchronized'", "'transient'", "'const'", "'public'", "'protected'", 
		"'private'", "'abstract'", "'final'", "'enum'", "'class'", "'extends'", 
		"'implements'", "'<'", "','", "'>'", "'goto'", "'{'", "'}'", "'interface'", 
		"'void'", "'['", "']'", "'throws'", "'='", "'boolean'", "'char'", "'byte'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "'super'", 
		"'('", "')'", "'default'", "':'", "'if'", "'else'", "'for'", "'while'", 
		"'do'", "'try'", "'switch'", "'return'", "'throw'", "'break'", "'continue'", 
		"'catch'", "'|'", "'finally'", "'case'", "'this'", "'new'", "'++'", "'--'", 
		"'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<='", "'>='", "'instanceof'", 
		"'=='", "'!='", "'^'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", null, null, 
		null, null, null, "'null'", null, "'/*@JQ'", "'@JQ*/'", "'$'", null, null, 
		null, null, null, null, null, null, null, null, null, null, "'in'", "'out'", 
		"'\"'", null, "'~='", null, null, null, null, "'$='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"Identifier", "AT", "ELLIPSIS", "DOLLAR", "LETTER", "DIGIT", "NUMBER", 
		"VAR", "STRING", "END", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "OPENC", 
		"CLOSEC", "IN", "OUT", "QUOTES", "CONTAINS_SUB_STRING", "CONTAINS_WORD", 
		"CONTAINS_PREFIX", "EQUALS", "NOT_EQUALS", "STARTS_WITH", "ENDS_WITH", 
		"BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", "CHILD_FILTER", 
		"EVENT", "ADDFUNCS", "OPERATION"
	};
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
	public String getGrammarFileName() { return "jQueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jQueryParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jQueryParserParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(220);
				packageDeclaration();
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(223);
				importDeclaration();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25))) != 0) || _la==AT) {
				{
				{
				setState(229);
				typeDeclaration();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(237);
				annotation();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(T__0);
			setState(244);
			qualifiedName();
			setState(245);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__2);
			setState(249);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(248);
				match(T__3);
				}
			}

			setState(251);
			qualifiedName();
			setState(254);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(252);
				match(T__4);
				setState(253);
				match(T__5);
				}
			}

			setState(256);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0) || _la==AT) {
					{
					{
					setState(258);
					classOrInterfaceModifier();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(271);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0) || _la==AT) {
					{
					{
					setState(272);
					classOrInterfaceModifier();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(285);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(T__1);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(291);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				classOrInterfaceModifier();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(295);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				annotation();
				}
				break;
			case T__3:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__14);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__16);
			setState(302);
			match(Identifier);
			setState(304);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(303);
				typeParameters();
				}
			}

			setState(308);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(306);
				match(T__17);
				setState(307);
				type();
				}
			}

			setState(312);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(310);
				match(T__18);
				setState(311);
				typeList();
				}
			}

			setState(314);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__19);
			setState(317);
			typeParameter();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(318);
				match(T__20);
				setState(319);
				typeParameter();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(Identifier);
			setState(330);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(328);
				match(T__17);
				setState(329);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			type();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(333);
				match(T__22);
				setState(334);
				type();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(jQueryParserParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__15);
			setState(341);
			match(Identifier);
			setState(344);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(342);
				match(T__18);
				setState(343);
				typeList();
				}
			}

			setState(346);
			match(T__23);
			setState(348);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(347);
				enumConstants();
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(350);
				match(T__20);
				}
			}

			setState(354);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(353);
				enumBodyDeclarations();
				}
			}

			setState(356);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			enumConstant();
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(T__20);
					setState(360);
					enumConstant();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(366);
				annotation();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(Identifier);
			setState(374);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(373);
				arguments();
				}
			}

			setState(377);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(376);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__1);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(380);
				classBodyDeclaration();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__25);
			setState(387);
			match(Identifier);
			setState(389);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(388);
				typeParameters();
				}
			}

			setState(393);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(391);
				match(T__17);
				setState(392);
				typeList();
				}
			}

			setState(395);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			type();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(398);
				match(T__20);
				setState(399);
				type();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__23);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(406);
				classBodyDeclaration();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__23);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(415);
				interfaceBodyDeclaration();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(424);
					match(T__3);
					}
				}

				setState(427);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(428);
						modifier();
						}
						} 
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(434);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(443);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(444);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(445);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				{
				setState(448);
				type();
				}
				break;
			case T__26:
				{
				setState(449);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(452);
			match(Identifier);
			setState(453);
			formalParameters();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(454);
				match(T__27);
				setState(455);
				match(T__28);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(461);
				match(T__29);
				setState(462);
				qualifiedNameList();
				}
			}

			setState(467);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(465);
				methodBody();
				}
				break;
			case T__1:
				{
				setState(466);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			typeParameters();
			setState(470);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(Identifier);
			setState(473);
			formalParameters();
			setState(476);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(474);
				match(T__29);
				setState(475);
				qualifiedNameList();
				}
			}

			setState(478);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			typeParameters();
			setState(481);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			type();
			setState(484);
			variableDeclarators();
			setState(485);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(495);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__25:
			case T__26:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						modifier();
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(493);
				interfaceMemberDeclaration();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(T__1);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			type();
			setState(507);
			constantDeclarator();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(508);
				match(T__20);
				setState(509);
				constantDeclarator();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(Identifier);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(518);
				match(T__27);
				setState(519);
				match(T__28);
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(T__30);
			setState(526);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				{
				setState(528);
				type();
				}
				break;
			case T__26:
				{
				setState(529);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532);
			match(Identifier);
			setState(533);
			formalParameters();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(534);
				match(T__27);
				setState(535);
				match(T__28);
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(541);
				match(T__29);
				setState(542);
				qualifiedNameList();
				}
			}

			setState(545);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			typeParameters();
			setState(548);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			variableDeclarator();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(551);
				match(T__20);
				setState(552);
				variableDeclarator();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			variableDeclaratorId();
			setState(561);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(559);
				match(T__30);
				setState(560);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(Identifier);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(564);
				match(T__27);
				setState(565);
				match(T__28);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(573);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				arrayInitializer();
				}
				break;
			case T__19:
			case T__26:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__23);
			setState(587);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(576);
				variableInitializer();
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(577);
						match(T__20);
						setState(578);
						variableInitializer();
						}
						} 
					}
					setState(583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(585);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(584);
					match(T__20);
					}
				}

				}
			}

			setState(589);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			int _alt;
			setState(609);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				classOrInterfaceType();
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(T__27);
						setState(595);
						match(T__28);
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				primitiveType();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(T__27);
						setState(603);
						match(T__28);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(jQueryParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(jQueryParserParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(Identifier);
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(612);
				typeArguments();
				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615);
					match(T__4);
					setState(616);
					match(Identifier);
					setState(618);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(617);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__19);
			setState(628);
			typeArgument();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(629);
				match(T__20);
				setState(630);
				typeArgument();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(644);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				type();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(T__39);
				setState(642);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__40) {
					{
					setState(640);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__40) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(641);
					type();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			qualifiedName();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(647);
				match(T__20);
				setState(648);
				qualifiedName();
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(T__41);
			setState(656);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(655);
				formalParameterList();
				}
			}

			setState(658);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				formalParameter();
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						match(T__20);
						setState(662);
						formalParameter();
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(670);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(668);
					match(T__20);
					setState(669);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(675);
				variableModifier();
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			type();
			setState(682);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(684);
				variableModifier();
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			type();
			setState(691);
			match(ELLIPSIS);
			setState(692);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(jQueryParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(jQueryParserParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(Identifier);
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(699);
					match(T__4);
					setState(700);
					match(Identifier);
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(jQueryParserParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(jQueryParserParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(jQueryParserParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(jQueryParserParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(jQueryParserParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IntegerLiteral - 90)) | (1L << (FloatingPointLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (CharacterLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (NullLiteral - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(AT);
			setState(709);
			annotationName();
			setState(716);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(710);
				match(T__41);
				setState(713);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(711);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(712);
					elementValue();
					}
					break;
				}
				setState(715);
				match(T__42);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			elementValuePair();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(721);
				match(T__20);
				setState(722);
				elementValuePair();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(Identifier);
			setState(729);
			match(T__30);
			setState(730);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValue);
		try {
			setState(735);
			switch (_input.LA(1)) {
			case T__19:
			case T__26:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				annotation();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(T__23);
			setState(746);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(738);
				elementValue();
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(T__20);
						setState(740);
						elementValue();
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(749);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(748);
				match(T__20);
				}
			}

			setState(751);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(AT);
			setState(754);
			match(T__25);
			setState(755);
			match(Identifier);
			setState(756);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__23);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(759);
				annotationTypeElementDeclaration();
				}
				}
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(765);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(775);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__25:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(767);
						modifier();
						}
						} 
					}
					setState(772);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(773);
				annotationTypeElementRest();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(T__1);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementRest);
		try {
			setState(797);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				type();
				setState(778);
				annotationMethodOrConstantRest();
				setState(779);
				match(T__1);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				classDeclaration();
				setState(783);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(782);
					match(T__1);
					}
					break;
				}
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				interfaceDeclaration();
				setState(787);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(786);
					match(T__1);
					}
					break;
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				enumDeclaration();
				setState(791);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(790);
					match(T__1);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(793);
				annotationTypeDeclaration();
				setState(795);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(794);
					match(T__1);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationMethodOrConstantRest);
		try {
			setState(801);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(Identifier);
			setState(804);
			match(T__41);
			setState(805);
			match(T__42);
			setState(807);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(806);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T__43);
			setState(812);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(T__23);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(815);
				blockStatement();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				typeDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			localVariableDeclaration();
			setState(829);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(831);
				variableModifier();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837);
			type();
			setState(838);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(jQueryParserParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(T__1);
				setState(842);
				expression(0);
				setState(845);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(843);
					match(T__44);
					setState(844);
					expression(0);
					}
				}

				setState(847);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(T__45);
				setState(850);
				parExpression();
				setState(851);
				statement();
				setState(854);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(852);
					match(T__46);
					setState(853);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				match(T__47);
				setState(857);
				match(T__41);
				setState(858);
				forControl();
				setState(859);
				match(T__42);
				setState(860);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(862);
				match(T__48);
				setState(863);
				parExpression();
				setState(864);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				match(T__49);
				setState(867);
				statement();
				setState(868);
				match(T__48);
				setState(869);
				parExpression();
				setState(870);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				match(T__50);
				setState(873);
				block();
				setState(883);
				switch (_input.LA(1)) {
				case T__56:
					{
					setState(875); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(874);
						catchClause();
						}
						}
						setState(877); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__56 );
					setState(880);
					_la = _input.LA(1);
					if (_la==T__58) {
						{
						setState(879);
						finallyBlock();
						}
					}

					}
					break;
				case T__58:
					{
					setState(882);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(885);
				match(T__50);
				setState(886);
				resourceSpecification();
				setState(887);
				block();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__56) {
					{
					{
					setState(888);
					catchClause();
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(895);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(894);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(897);
				match(T__51);
				setState(898);
				parExpression();
				setState(899);
				match(T__23);
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(900);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(905);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43 || _la==T__59) {
					{
					{
					setState(906);
					switchLabel();
					}
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(912);
				match(T__24);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(914);
				match(T__7);
				setState(915);
				parExpression();
				setState(916);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(918);
				match(T__52);
				setState(920);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(919);
					expression(0);
					}
				}

				setState(922);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(923);
				match(T__53);
				setState(924);
				expression(0);
				setState(925);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(927);
				match(T__54);
				setState(929);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(928);
					match(Identifier);
					}
				}

				setState(931);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(932);
				match(T__55);
				setState(934);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(933);
					match(Identifier);
					}
				}

				setState(936);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(937);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(938);
				statementExpression();
				setState(939);
				match(T__1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(941);
				match(Identifier);
				setState(942);
				match(T__44);
				setState(943);
				statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(T__56);
			setState(947);
			match(T__41);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(948);
				variableModifier();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
			catchType();
			setState(955);
			match(Identifier);
			setState(956);
			match(T__42);
			setState(957);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			qualifiedName();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__57) {
				{
				{
				setState(960);
				match(T__57);
				setState(961);
				qualifiedName();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(T__58);
			setState(968);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T__41);
			setState(971);
			resources();
			setState(973);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(972);
				match(T__1);
				}
			}

			setState(975);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			resource();
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(978);
					match(T__1);
					setState(979);
					resource();
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(985);
				variableModifier();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			classOrInterfaceType();
			setState(992);
			variableDeclaratorId();
			setState(993);
			match(T__30);
			setState(994);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(996);
				switchLabel();
				}
				}
				setState(999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 || _la==T__59 );
			setState(1002); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1001);
				blockStatement();
				}
				}
				setState(1004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchLabel);
		try {
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(T__59);
				setState(1007);
				constantExpression();
				setState(1008);
				match(T__44);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				match(T__59);
				setState(1011);
				enumConstantName();
				setState(1012);
				match(T__44);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				match(T__43);
				setState(1015);
				match(T__44);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forControl);
		int _la;
		try {
			setState(1030);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1019);
					forInit();
					}
				}

				setState(1022);
				match(T__1);
				setState(1024);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1023);
					expression(0);
					}
				}

				setState(1026);
				match(T__1);
				setState(1028);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1027);
					forUpdate();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forInit);
		try {
			setState(1034);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==AT) {
				{
				{
				setState(1036);
				variableModifier();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			type();
			setState(1043);
			variableDeclaratorId();
			setState(1044);
			match(T__44);
			setState(1045);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(T__41);
			setState(1050);
			expression(0);
			setState(1051);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			expression(0);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(1054);
				match(T__20);
				setState(1055);
				expression(0);
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1066);
				match(T__41);
				setState(1067);
				type();
				setState(1068);
				match(T__42);
				setState(1069);
				expression(17);
				}
				break;
			case 2:
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1072);
				expression(15);
				}
				break;
			case 3:
				{
				setState(1073);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1074);
				expression(14);
				}
				break;
			case 4:
				{
				setState(1075);
				primary();
				}
				break;
			case 5:
				{
				setState(1076);
				match(T__61);
				setState(1077);
				creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1163);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1080);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1081);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__68 || _la==T__69) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1082);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1083);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1084);
						_la = _input.LA(1);
						if ( !(_la==T__64 || _la==T__65) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1085);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1094);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1087);
							match(T__19);
							setState(1088);
							match(T__19);
							}
							break;
						case 2:
							{
							setState(1089);
							match(T__21);
							setState(1090);
							match(T__21);
							setState(1091);
							match(T__21);
							}
							break;
						case 3:
							{
							setState(1092);
							match(T__21);
							setState(1093);
							match(T__21);
							}
							break;
						}
						setState(1096);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1098);
						_la = _input.LA(1);
						if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__21 - 20)) | (1L << (T__70 - 20)) | (1L << (T__71 - 20)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1099);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1100);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1101);
						_la = _input.LA(1);
						if ( !(_la==T__73 || _la==T__74) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1102);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1104);
						match(T__22);
						setState(1105);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1107);
						match(T__75);
						setState(1108);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1110);
						match(T__57);
						setState(1111);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1113);
						match(T__76);
						setState(1114);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1116);
						match(T__77);
						setState(1117);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1119);
						match(T__39);
						setState(1120);
						expression(0);
						setState(1121);
						match(T__44);
						setState(1122);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1125);
						_la = _input.LA(1);
						if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__78 - 31)) | (1L << (T__79 - 31)) | (1L << (T__80 - 31)) | (1L << (T__81 - 31)) | (1L << (T__82 - 31)) | (1L << (T__83 - 31)) | (1L << (T__84 - 31)) | (1L << (T__85 - 31)) | (1L << (T__86 - 31)) | (1L << (T__87 - 31)) | (1L << (T__88 - 31)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1126);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1128);
						match(T__4);
						setState(1129);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1131);
						match(T__4);
						setState(1132);
						match(T__60);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1133);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1134);
						match(T__4);
						setState(1135);
						match(T__61);
						setState(1137);
						_la = _input.LA(1);
						if (_la==T__19) {
							{
							setState(1136);
							nonWildcardTypeArguments();
							}
						}

						setState(1139);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1141);
						match(T__4);
						setState(1142);
						match(T__40);
						setState(1143);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1145);
						match(T__4);
						setState(1146);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1148);
						match(T__27);
						setState(1149);
						expression(0);
						setState(1150);
						match(T__28);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1153);
						match(T__41);
						setState(1155);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(1154);
							expressionList();
							}
						}

						setState(1157);
						match(T__42);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1159);
						_la = _input.LA(1);
						if ( !(_la==T__62 || _la==T__63) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1161);
						match(T__72);
						setState(1162);
						type();
						}
						break;
					}
					} 
				}
				setState(1167);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primary);
		try {
			setState(1189);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				match(T__41);
				setState(1169);
				expression(0);
				setState(1170);
				match(T__42);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(T__60);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1175);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1176);
				type();
				setState(1177);
				match(T__4);
				setState(1178);
				match(T__16);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1180);
				match(T__26);
				setState(1181);
				match(T__4);
				setState(1182);
				match(T__16);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1183);
				nonWildcardTypeArguments();
				setState(1187);
				switch (_input.LA(1)) {
				case T__40:
				case Identifier:
					{
					setState(1184);
					explicitGenericInvocationSuffix();
					}
					break;
				case T__60:
					{
					setState(1185);
					match(T__60);
					setState(1186);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creator);
		try {
			setState(1200);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				nonWildcardTypeArguments();
				setState(1192);
				createdName();
				setState(1193);
				classCreatorRest();
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				createdName();
				setState(1198);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(1196);
					arrayCreatorRest();
					}
					break;
				case T__41:
					{
					setState(1197);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(jQueryParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(jQueryParserParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_createdName);
		int _la;
		try {
			setState(1217);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(Identifier);
				setState(1204);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(1203);
					typeArgumentsOrDiamond();
					}
				}

				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1206);
					match(T__4);
					setState(1207);
					match(Identifier);
					setState(1209);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(1208);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(Identifier);
			setState(1221);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1220);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1223);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(T__27);
			setState(1253);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(1226);
				match(T__28);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(1227);
					match(T__27);
					setState(1228);
					match(T__28);
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1234);
				arrayInitializer();
				}
				break;
			case T__19:
			case T__26:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				{
				setState(1235);
				expression(0);
				setState(1236);
				match(T__28);
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1237);
						match(T__27);
						setState(1238);
						expression(0);
						setState(1239);
						match(T__28);
						}
						} 
					}
					setState(1245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1246);
						match(T__27);
						setState(1247);
						match(T__28);
						}
						} 
					}
					setState(1252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			arguments();
			setState(1257);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1256);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			nonWildcardTypeArguments();
			setState(1260);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(T__19);
			setState(1263);
			typeList();
			setState(1264);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeArgumentsOrDiamond);
		try {
			setState(1269);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(T__19);
				setState(1267);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				match(T__19);
				setState(1272);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				nonWildcardTypeArguments();
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_superSuffix);
		try {
			setState(1282);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				arguments();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				match(T__4);
				setState(1278);
				match(Identifier);
				setState(1280);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1279);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(jQueryParserParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1288);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				match(T__40);
				setState(1285);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				match(Identifier);
				setState(1287);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(T__41);
			setState(1292);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1291);
				expressionList();
				}
			}

			setState(1294);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode JQBEGIN() { return getToken(jQueryParserParser.JQBEGIN, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode JQEND() { return getToken(jQueryParserParser.JQEND, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(AT);
			setState(1297);
			code();
			setState(1298);
			match(ELLIPSIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_code);
		try {
			setState(1303);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				input();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				output();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1302);
				selector();
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

	public static class OpsContext extends ParserRuleContext {
		public TerminalNode CONTAINS_SUB_STRING() { return getToken(jQueryParserParser.CONTAINS_SUB_STRING, 0); }
		public List<TerminalNode> CONTAINS_WORD() { return getTokens(jQueryParserParser.CONTAINS_WORD); }
		public TerminalNode CONTAINS_WORD(int i) {
			return getToken(jQueryParserParser.CONTAINS_WORD, i);
		}
		public TerminalNode CONTAINS_PREFIX() { return getToken(jQueryParserParser.CONTAINS_PREFIX, 0); }
		public TerminalNode EQUALS() { return getToken(jQueryParserParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(jQueryParserParser.NOT_EQUALS, 0); }
		public TerminalNode STARTS_WITH() { return getToken(jQueryParserParser.STARTS_WITH, 0); }
		public TerminalNode ENDS_WITH() { return getToken(jQueryParserParser.ENDS_WITH, 0); }
		public TerminalNode ADDFUNCS() { return getToken(jQueryParserParser.ADDFUNCS, 0); }
		public TerminalNode EVENT() { return getToken(jQueryParserParser.EVENT, 0); }
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (CONTAINS_SUB_STRING - 115)) | (1L << (CONTAINS_WORD - 115)) | (1L << (CONTAINS_PREFIX - 115)) | (1L << (EQUALS - 115)) | (1L << (NOT_EQUALS - 115)) | (1L << (STARTS_WITH - 115)) | (1L << (ENDS_WITH - 115)) | (1L << (EVENT - 115)) | (1L << (ADDFUNCS - 115)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode BASIC_FILTER() { return getToken(jQueryParserParser.BASIC_FILTER, 0); }
		public TerminalNode CHILD_FILTER() { return getToken(jQueryParserParser.CHILD_FILTER, 0); }
		public TerminalNode HIERARCHY_SELECTOR() { return getToken(jQueryParserParser.HIERARCHY_SELECTOR, 0); }
		public TerminalNode CONTENT_FILTER() { return getToken(jQueryParserParser.CONTENT_FILTER, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (BASIC_FILTER - 122)) | (1L << (CONTENT_FILTER - 122)) | (1L << (HIERARCHY_SELECTOR - 122)) | (1L << (CHILD_FILTER - 122)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jQueryParserParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_selectionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(jQueryParserParser.EQUALS, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Assign_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterAssign_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitAssign_selection(this);
		}
	}

	public final Assign_selectionContext assign_selection() throws RecognitionException {
		Assign_selectionContext _localctx = new Assign_selectionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assign_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			variable();
			setState(1312);
			match(EQUALS);
			setState(1313);
			selector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(jQueryParserParser.DOLLAR, 0); }
		public TerminalNode OPENP() { return getToken(jQueryParserParser.OPENP, 0); }
		public TerminalNode VAR() { return getToken(jQueryParserParser.VAR, 0); }
		public TerminalNode CLOSEP() { return getToken(jQueryParserParser.CLOSEP, 0); }
		public TerminalNode END() { return getToken(jQueryParserParser.END, 0); }
		public TerminalNode OPENB() { return getToken(jQueryParserParser.OPENB, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(jQueryParserParser.STRING, 0); }
		public TerminalNode CLOSEB() { return getToken(jQueryParserParser.CLOSEB, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode OPERATION() { return getToken(jQueryParserParser.OPERATION, 0); }
		public TerminalNode ADDFUNCS() { return getToken(jQueryParserParser.ADDFUNCS, 0); }
		public TerminalNode EVENT() { return getToken(jQueryParserParser.EVENT, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(DOLLAR);
			setState(1316);
			match(OPENP);
			setState(1317);
			match(VAR);
			setState(1324);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(1318);
				match(OPENB);
				setState(1319);
				ops();
				setState(1320);
				match(STRING);
				setState(1321);
				match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(1323);
				filter();
				}
				break;
			case CLOSEP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1326);
			match(CLOSEP);
			setState(1327);
			match(T__4);
			setState(1329);
			_la = _input.LA(1);
			if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (EVENT - 126)) | (1L << (ADDFUNCS - 126)) | (1L << (OPERATION - 126)))) != 0)) {
				{
				setState(1328);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (EVENT - 126)) | (1L << (ADDFUNCS - 126)) | (1L << (OPERATION - 126)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1331);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(jQueryParserParser.IN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(IN);
			setState(1334);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(jQueryParserParser.OUT, 0); }
		public Assign_selectionContext assign_selection() {
			return getRuleContext(Assign_selectionContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(OUT);
			setState(1337);
			assign_selection();
			}
		}
		catch (RecognitionException re) {
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
		case 87:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		case 16:
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0082\u053e\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\5\2\u00e0\n\2\3\2\7\2\u00e3\n\2\f\2\16\2"+
		"\u00e6\13\2\3\2\7\2\u00e9\n\2\f\2\16\2\u00ec\13\2\3\2\3\2\3\3\7\3\u00f1"+
		"\n\3\f\3\16\3\u00f4\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00fc\n\4\3\4\3\4"+
		"\3\4\5\4\u0101\n\4\3\4\3\4\3\5\7\5\u0106\n\5\f\5\16\5\u0109\13\5\3\5\3"+
		"\5\7\5\u010d\n\5\f\5\16\5\u0110\13\5\3\5\3\5\7\5\u0114\n\5\f\5\16\5\u0117"+
		"\13\5\3\5\3\5\7\5\u011b\n\5\f\5\16\5\u011e\13\5\3\5\3\5\5\5\u0122\n\5"+
		"\3\6\3\6\5\6\u0126\n\6\3\7\3\7\5\7\u012a\n\7\3\b\3\b\5\b\u012e\n\b\3\t"+
		"\3\t\3\t\5\t\u0133\n\t\3\t\3\t\5\t\u0137\n\t\3\t\3\t\5\t\u013b\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u0143\n\n\f\n\16\n\u0146\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\5\13\u014d\n\13\3\f\3\f\3\f\7\f\u0152\n\f\f\f\16\f\u0155\13\f"+
		"\3\r\3\r\3\r\3\r\5\r\u015b\n\r\3\r\3\r\5\r\u015f\n\r\3\r\5\r\u0162\n\r"+
		"\3\r\5\r\u0165\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u016c\n\16\f\16\16\16\u016f"+
		"\13\16\3\17\7\17\u0172\n\17\f\17\16\17\u0175\13\17\3\17\3\17\5\17\u0179"+
		"\n\17\3\17\5\17\u017c\n\17\3\20\3\20\7\20\u0180\n\20\f\20\16\20\u0183"+
		"\13\20\3\21\3\21\3\21\5\21\u0188\n\21\3\21\3\21\5\21\u018c\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u0193\n\22\f\22\16\22\u0196\13\22\3\23\3\23\7"+
		"\23\u019a\n\23\f\23\16\23\u019d\13\23\3\23\3\23\3\24\3\24\7\24\u01a3\n"+
		"\24\f\24\16\24\u01a6\13\24\3\24\3\24\3\25\3\25\5\25\u01ac\n\25\3\25\3"+
		"\25\7\25\u01b0\n\25\f\25\16\25\u01b3\13\25\3\25\5\25\u01b6\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c1\n\26\3\27\3\27\5\27"+
		"\u01c5\n\27\3\27\3\27\3\27\3\27\7\27\u01cb\n\27\f\27\16\27\u01ce\13\27"+
		"\3\27\3\27\5\27\u01d2\n\27\3\27\3\27\5\27\u01d6\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\5\31\u01df\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\7\34\u01eb\n\34\f\34\16\34\u01ee\13\34\3\34\3\34\5\34"+
		"\u01f2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01fb\n\35\3\36\3"+
		"\36\3\36\3\36\7\36\u0201\n\36\f\36\16\36\u0204\13\36\3\36\3\36\3\37\3"+
		"\37\3\37\7\37\u020b\n\37\f\37\16\37\u020e\13\37\3\37\3\37\3\37\3 \3 \5"+
		" \u0215\n \3 \3 \3 \3 \7 \u021b\n \f \16 \u021e\13 \3 \3 \5 \u0222\n "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u022c\n\"\f\"\16\"\u022f\13\"\3#\3#\3"+
		"#\5#\u0234\n#\3$\3$\3$\7$\u0239\n$\f$\16$\u023c\13$\3%\3%\5%\u0240\n%"+
		"\3&\3&\3&\3&\7&\u0246\n&\f&\16&\u0249\13&\3&\5&\u024c\n&\5&\u024e\n&\3"+
		"&\3&\3\'\3\'\3(\3(\3(\7(\u0257\n(\f(\16(\u025a\13(\3(\3(\3(\7(\u025f\n"+
		"(\f(\16(\u0262\13(\5(\u0264\n(\3)\3)\5)\u0268\n)\3)\3)\3)\5)\u026d\n)"+
		"\7)\u026f\n)\f)\16)\u0272\13)\3*\3*\3+\3+\3+\3+\7+\u027a\n+\f+\16+\u027d"+
		"\13+\3+\3+\3,\3,\3,\3,\5,\u0285\n,\5,\u0287\n,\3-\3-\3-\7-\u028c\n-\f"+
		"-\16-\u028f\13-\3.\3.\5.\u0293\n.\3.\3.\3/\3/\3/\7/\u029a\n/\f/\16/\u029d"+
		"\13/\3/\3/\5/\u02a1\n/\3/\5/\u02a4\n/\3\60\7\60\u02a7\n\60\f\60\16\60"+
		"\u02aa\13\60\3\60\3\60\3\60\3\61\7\61\u02b0\n\61\f\61\16\61\u02b3\13\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\7\64\u02c0\n\64"+
		"\f\64\16\64\u02c3\13\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u02cc"+
		"\n\66\3\66\5\66\u02cf\n\66\3\67\3\67\38\38\38\78\u02d6\n8\f8\168\u02d9"+
		"\138\39\39\39\39\3:\3:\3:\5:\u02e2\n:\3;\3;\3;\3;\7;\u02e8\n;\f;\16;\u02eb"+
		"\13;\5;\u02ed\n;\3;\5;\u02f0\n;\3;\3;\3<\3<\3<\3<\3<\3=\3=\7=\u02fb\n"+
		"=\f=\16=\u02fe\13=\3=\3=\3>\7>\u0303\n>\f>\16>\u0306\13>\3>\3>\5>\u030a"+
		"\n>\3?\3?\3?\3?\3?\3?\5?\u0312\n?\3?\3?\5?\u0316\n?\3?\3?\5?\u031a\n?"+
		"\3?\3?\5?\u031e\n?\5?\u0320\n?\3@\3@\5@\u0324\n@\3A\3A\3A\3A\5A\u032a"+
		"\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0333\nD\fD\16D\u0336\13D\3D\3D\3E\3E\3E\5"+
		"E\u033d\nE\3F\3F\3F\3G\7G\u0343\nG\fG\16G\u0346\13G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\5H\u0350\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0359\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\6H\u036e\nH\rH\16H\u036f\3H\5"+
		"H\u0373\nH\3H\5H\u0376\nH\3H\3H\3H\3H\7H\u037c\nH\fH\16H\u037f\13H\3H"+
		"\5H\u0382\nH\3H\3H\3H\3H\7H\u0388\nH\fH\16H\u038b\13H\3H\7H\u038e\nH\f"+
		"H\16H\u0391\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u039b\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u03a4\nH\3H\3H\3H\5H\u03a9\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03b3"+
		"\nH\3I\3I\3I\7I\u03b8\nI\fI\16I\u03bb\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u03c5"+
		"\nJ\fJ\16J\u03c8\13J\3K\3K\3K\3L\3L\3L\5L\u03d0\nL\3L\3L\3M\3M\3M\7M\u03d7"+
		"\nM\fM\16M\u03da\13M\3N\7N\u03dd\nN\fN\16N\u03e0\13N\3N\3N\3N\3N\3N\3"+
		"O\6O\u03e8\nO\rO\16O\u03e9\3O\6O\u03ed\nO\rO\16O\u03ee\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u03fb\nP\3Q\3Q\5Q\u03ff\nQ\3Q\3Q\5Q\u0403\nQ\3Q\3Q"+
		"\5Q\u0407\nQ\5Q\u0409\nQ\3R\3R\5R\u040d\nR\3S\7S\u0410\nS\fS\16S\u0413"+
		"\13S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u0423\nV\fV\16V\u0426"+
		"\13V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0439\nY\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0449\nY\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0474\nY\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0486\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u048e\n"+
		"Y\fY\16Y\u0491\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\5Z\u04a6\nZ\5Z\u04a8\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04b1\n[\5[\u04b3"+
		"\n[\3\\\3\\\5\\\u04b7\n\\\3\\\3\\\3\\\5\\\u04bc\n\\\7\\\u04be\n\\\f\\"+
		"\16\\\u04c1\13\\\3\\\5\\\u04c4\n\\\3]\3]\5]\u04c8\n]\3]\3]\3^\3^\3^\3"+
		"^\7^\u04d0\n^\f^\16^\u04d3\13^\3^\3^\3^\3^\3^\3^\3^\7^\u04dc\n^\f^\16"+
		"^\u04df\13^\3^\3^\7^\u04e3\n^\f^\16^\u04e6\13^\5^\u04e8\n^\3_\3_\5_\u04ec"+
		"\n_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\5b\u04f8\nb\3c\3c\3c\5c\u04fd\nc\3d"+
		"\3d\3d\3d\5d\u0503\nd\5d\u0505\nd\3e\3e\3e\3e\5e\u050b\ne\3f\3f\5f\u050f"+
		"\nf\3f\3f\3g\3g\3g\3g\3h\3h\3h\5h\u051a\nh\3i\3i\3j\3j\3k\3k\3l\3l\3l"+
		"\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u052f\nm\3m\3m\3m\5m\u0534\nm\3m\3m"+
		"\3n\3n\3n\3o\3o\3o\3o\2\3\u00b0p\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\2\22\3\2\t\f\4"+
		"\2\6\6\r\22\3\2\")\4\2\24\24++\3\2\\a\3\2AD\3\2EF\4\2\b\bGH\3\2CD\5\2"+
		"\26\26\30\30IJ\3\2LM\4\2!!Q[\3\2AB\4\2u{\u0080\u0081\3\2|\177\3\2\u0080"+
		"\u0082\u05ac\2\u00df\3\2\2\2\4\u00f2\3\2\2\2\6\u00f9\3\2\2\2\b\u0121\3"+
		"\2\2\2\n\u0125\3\2\2\2\f\u0129\3\2\2\2\16\u012d\3\2\2\2\20\u012f\3\2\2"+
		"\2\22\u013e\3\2\2\2\24\u0149\3\2\2\2\26\u014e\3\2\2\2\30\u0156\3\2\2\2"+
		"\32\u0168\3\2\2\2\34\u0173\3\2\2\2\36\u017d\3\2\2\2 \u0184\3\2\2\2\"\u018f"+
		"\3\2\2\2$\u0197\3\2\2\2&\u01a0\3\2\2\2(\u01b5\3\2\2\2*\u01c0\3\2\2\2,"+
		"\u01c4\3\2\2\2.\u01d7\3\2\2\2\60\u01da\3\2\2\2\62\u01e2\3\2\2\2\64\u01e5"+
		"\3\2\2\2\66\u01f1\3\2\2\28\u01fa\3\2\2\2:\u01fc\3\2\2\2<\u0207\3\2\2\2"+
		">\u0214\3\2\2\2@\u0225\3\2\2\2B\u0228\3\2\2\2D\u0230\3\2\2\2F\u0235\3"+
		"\2\2\2H\u023f\3\2\2\2J\u0241\3\2\2\2L\u0251\3\2\2\2N\u0263\3\2\2\2P\u0265"+
		"\3\2\2\2R\u0273\3\2\2\2T\u0275\3\2\2\2V\u0286\3\2\2\2X\u0288\3\2\2\2Z"+
		"\u0290\3\2\2\2\\\u02a3\3\2\2\2^\u02a8\3\2\2\2`\u02b1\3\2\2\2b\u02b8\3"+
		"\2\2\2d\u02ba\3\2\2\2f\u02bc\3\2\2\2h\u02c4\3\2\2\2j\u02c6\3\2\2\2l\u02d0"+
		"\3\2\2\2n\u02d2\3\2\2\2p\u02da\3\2\2\2r\u02e1\3\2\2\2t\u02e3\3\2\2\2v"+
		"\u02f3\3\2\2\2x\u02f8\3\2\2\2z\u0309\3\2\2\2|\u031f\3\2\2\2~\u0323\3\2"+
		"\2\2\u0080\u0325\3\2\2\2\u0082\u032b\3\2\2\2\u0084\u032d\3\2\2\2\u0086"+
		"\u0330\3\2\2\2\u0088\u033c\3\2\2\2\u008a\u033e\3\2\2\2\u008c\u0344\3\2"+
		"\2\2\u008e\u03b2\3\2\2\2\u0090\u03b4\3\2\2\2\u0092\u03c1\3\2\2\2\u0094"+
		"\u03c9\3\2\2\2\u0096\u03cc\3\2\2\2\u0098\u03d3\3\2\2\2\u009a\u03de\3\2"+
		"\2\2\u009c\u03e7\3\2\2\2\u009e\u03fa\3\2\2\2\u00a0\u0408\3\2\2\2\u00a2"+
		"\u040c\3\2\2\2\u00a4\u0411\3\2\2\2\u00a6\u0419\3\2\2\2\u00a8\u041b\3\2"+
		"\2\2\u00aa\u041f\3\2\2\2\u00ac\u0427\3\2\2\2\u00ae\u0429\3\2\2\2\u00b0"+
		"\u0438\3\2\2\2\u00b2\u04a7\3\2\2\2\u00b4\u04b2\3\2\2\2\u00b6\u04c3\3\2"+
		"\2\2\u00b8\u04c5\3\2\2\2\u00ba\u04cb\3\2\2\2\u00bc\u04e9\3\2\2\2\u00be"+
		"\u04ed\3\2\2\2\u00c0\u04f0\3\2\2\2\u00c2\u04f7\3\2\2\2\u00c4\u04fc\3\2"+
		"\2\2\u00c6\u0504\3\2\2\2\u00c8\u050a\3\2\2\2\u00ca\u050c\3\2\2\2\u00cc"+
		"\u0512\3\2\2\2\u00ce\u0519\3\2\2\2\u00d0\u051b\3\2\2\2\u00d2\u051d\3\2"+
		"\2\2\u00d4\u051f\3\2\2\2\u00d6\u0521\3\2\2\2\u00d8\u0525\3\2\2\2\u00da"+
		"\u0537\3\2\2\2\u00dc\u053a\3\2\2\2\u00de\u00e0\5\4\3\2\u00df\u00de\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\5\6\4\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00ea\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5\b\5\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\2\2\3\u00ee"+
		"\3\3\2\2\2\u00ef\u00f1\5j\66\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\5f\64\2\u00f7\u00f8\7\4\2\2\u00f8"+
		"\5\3\2\2\2\u00f9\u00fb\7\5\2\2\u00fa\u00fc\7\6\2\2\u00fb\u00fa\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\5f\64\2\u00fe\u00ff"+
		"\7\7\2\2\u00ff\u0101\7\b\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7\4\2\2\u0103\7\3\2\2\2\u0104\u0106\5\f\7\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0122\5\20\t\2"+
		"\u010b\u010d\5\f\7\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0122\5\30\r\2\u0112\u0114\5\f\7\2\u0113\u0112\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0122\5 \21\2\u0119\u011b\5\f\7\2\u011a\u0119\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\5v<\2\u0120\u0122\7\4\2"+
		"\2\u0121\u0107\3\2\2\2\u0121\u010e\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u011c"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122\t\3\2\2\2\u0123\u0126\5\f\7\2\u0124"+
		"\u0126\t\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\13\3\2\2"+
		"\2\u0127\u012a\5j\66\2\u0128\u012a\t\3\2\2\u0129\u0127\3\2\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\r\3\2\2\2\u012b\u012e\7\21\2\2\u012c\u012e\5j\66\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\17\3\2\2\2\u012f\u0130\7\23\2"+
		"\2\u0130\u0132\7b\2\2\u0131\u0133\5\22\n\2\u0132\u0131\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0135\7\24\2\2\u0135\u0137\5N(\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\7\25"+
		"\2\2\u0139\u013b\5\"\22\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\5$\23\2\u013d\21\3\2\2\2\u013e\u013f\7\26\2"+
		"\2\u013f\u0144\5\24\13\2\u0140\u0141\7\27\2\2\u0141\u0143\5\24\13\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\30\2\2\u0148"+
		"\23\3\2\2\2\u0149\u014c\7b\2\2\u014a\u014b\7\24\2\2\u014b\u014d\5\26\f"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\25\3\2\2\2\u014e\u0153"+
		"\5N(\2\u014f\u0150\7\31\2\2\u0150\u0152\5N(\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\27\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0156\u0157\7\22\2\2\u0157\u015a\7b\2\2\u0158\u0159"+
		"\7\25\2\2\u0159\u015b\5\"\22\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015e\7\32\2\2\u015d\u015f\5\32\16\2\u015e"+
		"\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0162\7\27"+
		"\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0165\5\36\20\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0167\7\33\2\2\u0167\31\3\2\2\2\u0168\u016d\5\34\17\2\u0169"+
		"\u016a\7\27\2\2\u016a\u016c\5\34\17\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\33\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0172\5j\66\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\7b\2\2\u0177\u0179\5\u00caf\2\u0178\u0177\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\5$\23\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\35\3\2\2\2\u017d\u0181\7\4\2"+
		"\2\u017e\u0180\5(\25\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\37\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0185\7\34\2\2\u0185\u0187\7b\2\2\u0186\u0188\5\22\n\2\u0187\u0186\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a\7\24\2\2\u018a"+
		"\u018c\5\"\22\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018e\5&\24\2\u018e!\3\2\2\2\u018f\u0194\5N(\2\u0190\u0191"+
		"\7\27\2\2\u0191\u0193\5N(\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195#\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0197\u019b\7\32\2\2\u0198\u019a\5(\25\2\u0199\u0198\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7\33\2\2\u019f%\3\2\2\2\u01a0\u01a4\7\32\2"+
		"\2\u01a1\u01a3\5\66\34\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a8\7\33\2\2\u01a8\'\3\2\2\2\u01a9\u01b6\7\4\2\2\u01aa\u01ac"+
		"\7\6\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b6\5\u0086D\2\u01ae\u01b0\5\n\6\2\u01af\u01ae\3\2\2\2\u01b0\u01b3"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b6\5*\26\2\u01b5\u01a9\3\2\2\2\u01b5\u01ab\3\2"+
		"\2\2\u01b5\u01b1\3\2\2\2\u01b6)\3\2\2\2\u01b7\u01c1\5,\27\2\u01b8\u01c1"+
		"\5.\30\2\u01b9\u01c1\5\64\33\2\u01ba\u01c1\5\60\31\2\u01bb\u01c1\5\62"+
		"\32\2\u01bc\u01c1\5 \21\2\u01bd\u01c1\5v<\2\u01be\u01c1\5\20\t\2\u01bf"+
		"\u01c1\5\30\r\2\u01c0\u01b7\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01b9\3"+
		"\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0"+
		"\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1+\3\2\2\2"+
		"\u01c2\u01c5\5N(\2\u01c3\u01c5\7\35\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7b\2\2\u01c7\u01cc\5Z.\2\u01c8"+
		"\u01c9\7\36\2\2\u01c9\u01cb\7\37\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d0\7 \2\2\u01d0\u01d2\5X-\2\u01d1\u01cf\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d6\5b\62\2\u01d4\u01d6"+
		"\7\4\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6-\3\2\2\2\u01d7"+
		"\u01d8\5\22\n\2\u01d8\u01d9\5,\27\2\u01d9/\3\2\2\2\u01da\u01db\7b\2\2"+
		"\u01db\u01de\5Z.\2\u01dc\u01dd\7 \2\2\u01dd\u01df\5X-\2\u01de\u01dc\3"+
		"\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5d\63\2\u01e1"+
		"\61\3\2\2\2\u01e2\u01e3\5\22\n\2\u01e3\u01e4\5\60\31\2\u01e4\63\3\2\2"+
		"\2\u01e5\u01e6\5N(\2\u01e6\u01e7\5B\"\2\u01e7\u01e8\7\4\2\2\u01e8\65\3"+
		"\2\2\2\u01e9\u01eb\5\n\6\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ef\u01f2\58\35\2\u01f0\u01f2\7\4\2\2\u01f1\u01ec\3\2\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\67\3\2\2\2\u01f3\u01fb\5:\36\2\u01f4\u01fb\5> \2"+
		"\u01f5\u01fb\5@!\2\u01f6\u01fb\5 \21\2\u01f7\u01fb\5v<\2\u01f8\u01fb\5"+
		"\20\t\2\u01f9\u01fb\5\30\r\2\u01fa\u01f3\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa"+
		"\u01f5\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01f9\3\2\2\2\u01fb9\3\2\2\2\u01fc\u01fd\5N(\2\u01fd\u0202"+
		"\5<\37\2\u01fe\u01ff\7\27\2\2\u01ff\u0201\5<\37\2\u0200\u01fe\3\2\2\2"+
		"\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\4\2\2\u0206;\3\2\2\2\u0207"+
		"\u020c\7b\2\2\u0208\u0209\7\36\2\2\u0209\u020b\7\37\2\2\u020a\u0208\3"+
		"\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7!\2\2\u0210\u0211\5H%"+
		"\2\u0211=\3\2\2\2\u0212\u0215\5N(\2\u0213\u0215\7\35\2\2\u0214\u0212\3"+
		"\2\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7b\2\2\u0217"+
		"\u021c\5Z.\2\u0218\u0219\7\36\2\2\u0219\u021b\7\37\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u0221\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7 \2\2\u0220\u0222\5X-"+
		"\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224"+
		"\7\4\2\2\u0224?\3\2\2\2\u0225\u0226\5\22\n\2\u0226\u0227\5> \2\u0227A"+
		"\3\2\2\2\u0228\u022d\5D#\2\u0229\u022a\7\27\2\2\u022a\u022c\5D#\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022eC\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0233\5F$\2\u0231\u0232"+
		"\7!\2\2\u0232\u0234\5H%\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"E\3\2\2\2\u0235\u023a\7b\2\2\u0236\u0237\7\36\2\2\u0237\u0239\7\37\2\2"+
		"\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023bG\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0240\5J&\2\u023e\u0240"+
		"\5\u00b0Y\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240I\3\2\2\2\u0241"+
		"\u024d\7\32\2\2\u0242\u0247\5H%\2\u0243\u0244\7\27\2\2\u0244\u0246\5H"+
		"%\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\7\27"+
		"\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u0242\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\33"+
		"\2\2\u0250K\3\2\2\2\u0251\u0252\7b\2\2\u0252M\3\2\2\2\u0253\u0258\5P)"+
		"\2\u0254\u0255\7\36\2\2\u0255\u0257\7\37\2\2\u0256\u0254\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0264\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025b\u0260\5R*\2\u025c\u025d\7\36\2\2\u025d"+
		"\u025f\7\37\2\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3"+
		"\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0253\3\2\2\2\u0263\u025b\3\2\2\2\u0264O\3\2\2\2\u0265\u0267\7b\2\2\u0266"+
		"\u0268\5T+\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0270\3\2\2"+
		"\2\u0269\u026a\7\7\2\2\u026a\u026c\7b\2\2\u026b\u026d\5T+\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u0269\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271Q\3\2\2\2"+
		"\u0272\u0270\3\2\2\2\u0273\u0274\t\4\2\2\u0274S\3\2\2\2\u0275\u0276\7"+
		"\26\2\2\u0276\u027b\5V,\2\u0277\u0278\7\27\2\2\u0278\u027a\5V,\2\u0279"+
		"\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7\30\2\2\u027f"+
		"U\3\2\2\2\u0280\u0287\5N(\2\u0281\u0284\7*\2\2\u0282\u0283\t\5\2\2\u0283"+
		"\u0285\5N(\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2"+
		"\2\u0286\u0280\3\2\2\2\u0286\u0281\3\2\2\2\u0287W\3\2\2\2\u0288\u028d"+
		"\5f\64\2\u0289\u028a\7\27\2\2\u028a\u028c\5f\64\2\u028b\u0289\3\2\2\2"+
		"\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028eY\3"+
		"\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\7,\2\2\u0291\u0293\5\\/\2\u0292"+
		"\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7-"+
		"\2\2\u0295[\3\2\2\2\u0296\u029b\5^\60\2\u0297\u0298\7\27\2\2\u0298\u029a"+
		"\5^\60\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u02a0\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7\27"+
		"\2\2\u029f\u02a1\5`\61\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a4\3\2\2\2\u02a2\u02a4\5`\61\2\u02a3\u0296\3\2\2\2\u02a3\u02a2\3\2"+
		"\2\2\u02a4]\3\2\2\2\u02a5\u02a7\5\16\b\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa"+
		"\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02ab\u02ac\5N(\2\u02ac\u02ad\5F$\2\u02ad_\3\2\2\2\u02ae"+
		"\u02b0\5\16\b\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3"+
		"\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"\u02b5\5N(\2\u02b5\u02b6\7d\2\2\u02b6\u02b7\5F$\2\u02b7a\3\2\2\2\u02b8"+
		"\u02b9\5\u0086D\2\u02b9c\3\2\2\2\u02ba\u02bb\5\u0086D\2\u02bbe\3\2\2\2"+
		"\u02bc\u02c1\7b\2\2\u02bd\u02be\7\7\2\2\u02be\u02c0\7b\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"g\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\t\6\2\2\u02c5i\3\2\2\2\u02c6"+
		"\u02c7\7c\2\2\u02c7\u02ce\5l\67\2\u02c8\u02cb\7,\2\2\u02c9\u02cc\5n8\2"+
		"\u02ca\u02cc\5r:\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\7-\2\2\u02ce\u02c8\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cfk\3\2\2\2\u02d0\u02d1\5f\64\2\u02d1m\3\2\2\2\u02d2"+
		"\u02d7\5p9\2\u02d3\u02d4\7\27\2\2\u02d4\u02d6\5p9\2\u02d5\u02d3\3\2\2"+
		"\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8o"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7b\2\2\u02db\u02dc\7!\2\2\u02dc"+
		"\u02dd\5r:\2\u02ddq\3\2\2\2\u02de\u02e2\5\u00b0Y\2\u02df\u02e2\5j\66\2"+
		"\u02e0\u02e2\5t;\2\u02e1\u02de\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e0"+
		"\3\2\2\2\u02e2s\3\2\2\2\u02e3\u02ec\7\32\2\2\u02e4\u02e9\5r:\2\u02e5\u02e6"+
		"\7\27\2\2\u02e6\u02e8\5r:\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee"+
		"\u02f0\7\27\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3"+
		"\2\2\2\u02f1\u02f2\7\33\2\2\u02f2u\3\2\2\2\u02f3\u02f4\7c\2\2\u02f4\u02f5"+
		"\7\34\2\2\u02f5\u02f6\7b\2\2\u02f6\u02f7\5x=\2\u02f7w\3\2\2\2\u02f8\u02fc"+
		"\7\32\2\2\u02f9\u02fb\5z>\2\u02fa\u02f9\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02ff\u0300\7\33\2\2\u0300y\3\2\2\2\u0301\u0303\5\n\6\2\u0302\u0301"+
		"\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u030a\5|?\2\u0308\u030a\7\4\2"+
		"\2\u0309\u0304\3\2\2\2\u0309\u0308\3\2\2\2\u030a{\3\2\2\2\u030b\u030c"+
		"\5N(\2\u030c\u030d\5~@\2\u030d\u030e\7\4\2\2\u030e\u0320\3\2\2\2\u030f"+
		"\u0311\5\20\t\2\u0310\u0312\7\4\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3"+
		"\2\2\2\u0312\u0320\3\2\2\2\u0313\u0315\5 \21\2\u0314\u0316\7\4\2\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0320\3\2\2\2\u0317\u0319\5\30"+
		"\r\2\u0318\u031a\7\4\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0320\3\2\2\2\u031b\u031d\5v<\2\u031c\u031e\7\4\2\2\u031d\u031c\3\2\2"+
		"\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u030b\3\2\2\2\u031f\u030f"+
		"\3\2\2\2\u031f\u0313\3\2\2\2\u031f\u0317\3\2\2\2\u031f\u031b\3\2\2\2\u0320"+
		"}\3\2\2\2\u0321\u0324\5\u0080A\2\u0322\u0324\5\u0082B\2\u0323\u0321\3"+
		"\2\2\2\u0323\u0322\3\2\2\2\u0324\177\3\2\2\2\u0325\u0326\7b\2\2\u0326"+
		"\u0327\7,\2\2\u0327\u0329\7-\2\2\u0328\u032a\5\u0084C\2\u0329\u0328\3"+
		"\2\2\2\u0329\u032a\3\2\2\2\u032a\u0081\3\2\2\2\u032b\u032c\5B\"\2\u032c"+
		"\u0083\3\2\2\2\u032d\u032e\7.\2\2\u032e\u032f\5r:\2\u032f\u0085\3\2\2"+
		"\2\u0330\u0334\7\32\2\2\u0331\u0333\5\u0088E\2\u0332\u0331\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0337\u0338\7\33\2\2\u0338\u0087\3\2\2\2\u0339"+
		"\u033d\5\u008aF\2\u033a\u033d\5\u008eH\2\u033b\u033d\5\b\5\2\u033c\u0339"+
		"\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d\u0089\3\2\2\2\u033e"+
		"\u033f\5\u008cG\2\u033f\u0340\7\4\2\2\u0340\u008b\3\2\2\2\u0341\u0343"+
		"\5\16\b\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2"+
		"\u0344\u0345\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348"+
		"\5N(\2\u0348\u0349\5B\"\2\u0349\u008d\3\2\2\2\u034a\u03b3\5\u0086D\2\u034b"+
		"\u034c\7\4\2\2\u034c\u034f\5\u00b0Y\2\u034d\u034e\7/\2\2\u034e\u0350\5"+
		"\u00b0Y\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2"+
		"\u0351\u0352\7\4\2\2\u0352\u03b3\3\2\2\2\u0353\u0354\7\60\2\2\u0354\u0355"+
		"\5\u00a8U\2\u0355\u0358\5\u008eH\2\u0356\u0357\7\61\2\2\u0357\u0359\5"+
		"\u008eH\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u03b3\3\2\2\2"+
		"\u035a\u035b\7\62\2\2\u035b\u035c\7,\2\2\u035c\u035d\5\u00a0Q\2\u035d"+
		"\u035e\7-\2\2\u035e\u035f\5\u008eH\2\u035f\u03b3\3\2\2\2\u0360\u0361\7"+
		"\63\2\2\u0361\u0362\5\u00a8U\2\u0362\u0363\5\u008eH\2\u0363\u03b3\3\2"+
		"\2\2\u0364\u0365\7\64\2\2\u0365\u0366\5\u008eH\2\u0366\u0367\7\63\2\2"+
		"\u0367\u0368\5\u00a8U\2\u0368\u0369\7\4\2\2\u0369\u03b3\3\2\2\2\u036a"+
		"\u036b\7\65\2\2\u036b\u0375\5\u0086D\2\u036c\u036e\5\u0090I\2\u036d\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u0373\5\u0094K\2\u0372\u0371\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0376\5\u0094K\2\u0375\u036d\3\2\2"+
		"\2\u0375\u0374\3\2\2\2\u0376\u03b3\3\2\2\2\u0377\u0378\7\65\2\2\u0378"+
		"\u0379\5\u0096L\2\u0379\u037d\5\u0086D\2\u037a\u037c\5\u0090I\2\u037b"+
		"\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0382\5\u0094K\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u03b3\3\2\2\2\u0383\u0384\7\66"+
		"\2\2\u0384\u0385\5\u00a8U\2\u0385\u0389\7\32\2\2\u0386\u0388\5\u009cO"+
		"\2\u0387\u0386\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u038f\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038e\5\u009eP"+
		"\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0393\7\33\2\2"+
		"\u0393\u03b3\3\2\2\2\u0394\u0395\7\n\2\2\u0395\u0396\5\u00a8U\2\u0396"+
		"\u0397\5\u0086D\2\u0397\u03b3\3\2\2\2\u0398\u039a\7\67\2\2\u0399\u039b"+
		"\5\u00b0Y\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2"+
		"\2\u039c\u03b3\7\4\2\2\u039d\u039e\78\2\2\u039e\u039f\5\u00b0Y\2\u039f"+
		"\u03a0\7\4\2\2\u03a0\u03b3\3\2\2\2\u03a1\u03a3\79\2\2\u03a2\u03a4\7b\2"+
		"\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03b3"+
		"\7\4\2\2\u03a6\u03a8\7:\2\2\u03a7\u03a9\7b\2\2\u03a8\u03a7\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03b3\7\4\2\2\u03ab\u03b3\7\4"+
		"\2\2\u03ac\u03ad\5\u00acW\2\u03ad\u03ae\7\4\2\2\u03ae\u03b3\3\2\2\2\u03af"+
		"\u03b0\7b\2\2\u03b0\u03b1\7/\2\2\u03b1\u03b3\5\u008eH\2\u03b2\u034a\3"+
		"\2\2\2\u03b2\u034b\3\2\2\2\u03b2\u0353\3\2\2\2\u03b2\u035a\3\2\2\2\u03b2"+
		"\u0360\3\2\2\2\u03b2\u0364\3\2\2\2\u03b2\u036a\3\2\2\2\u03b2\u0377\3\2"+
		"\2\2\u03b2\u0383\3\2\2\2\u03b2\u0394\3\2\2\2\u03b2\u0398\3\2\2\2\u03b2"+
		"\u039d\3\2\2\2\u03b2\u03a1\3\2\2\2\u03b2\u03a6\3\2\2\2\u03b2\u03ab\3\2"+
		"\2\2\u03b2\u03ac\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3\u008f\3\2\2\2\u03b4"+
		"\u03b5\7;\2\2\u03b5\u03b9\7,\2\2\u03b6\u03b8\5\16\b\2\u03b7\u03b6\3\2"+
		"\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\5\u0092J\2\u03bd\u03be"+
		"\7b\2\2\u03be\u03bf\7-\2\2\u03bf\u03c0\5\u0086D\2\u03c0\u0091\3\2\2\2"+
		"\u03c1\u03c6\5f\64\2\u03c2\u03c3\7<\2\2\u03c3\u03c5\5f\64\2\u03c4\u03c2"+
		"\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u0093\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\7=\2\2\u03ca\u03cb\5\u0086"+
		"D\2\u03cb\u0095\3\2\2\2\u03cc\u03cd\7,\2\2\u03cd\u03cf\5\u0098M\2\u03ce"+
		"\u03d0\7\4\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03d2\7-\2\2\u03d2\u0097\3\2\2\2\u03d3\u03d8\5\u009aN\2\u03d4"+
		"\u03d5\7\4\2\2\u03d5\u03d7\5\u009aN\2\u03d6\u03d4\3\2\2\2\u03d7\u03da"+
		"\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u0099\3\2\2\2\u03da"+
		"\u03d8\3\2\2\2\u03db\u03dd\5\16\b\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3"+
		"\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e1\u03e2\5P)\2\u03e2\u03e3\5F$\2\u03e3\u03e4\7!\2\2"+
		"\u03e4\u03e5\5\u00b0Y\2\u03e5\u009b\3\2\2\2\u03e6\u03e8\5\u009eP\2\u03e7"+
		"\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2"+
		"\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\5\u0088E\2\u03ec\u03eb\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u009d\3\2"+
		"\2\2\u03f0\u03f1\7>\2\2\u03f1\u03f2\5\u00aeX\2\u03f2\u03f3\7/\2\2\u03f3"+
		"\u03fb\3\2\2\2\u03f4\u03f5\7>\2\2\u03f5\u03f6\5L\'\2\u03f6\u03f7\7/\2"+
		"\2\u03f7\u03fb\3\2\2\2\u03f8\u03f9\7.\2\2\u03f9\u03fb\7/\2\2\u03fa\u03f0"+
		"\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u009f\3\2\2\2\u03fc"+
		"\u0409\5\u00a4S\2\u03fd\u03ff\5\u00a2R\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\7\4\2\2\u0401\u0403\5\u00b0Y"+
		"\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406"+
		"\7\4\2\2\u0405\u0407\5\u00a6T\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0409\3\2\2\2\u0408\u03fc\3\2\2\2\u0408\u03fe\3\2\2\2\u0409\u00a1"+
		"\3\2\2\2\u040a\u040d\5\u008cG\2\u040b\u040d\5\u00aaV\2\u040c\u040a\3\2"+
		"\2\2\u040c\u040b\3\2\2\2\u040d\u00a3\3\2\2\2\u040e\u0410\5\16\b\2\u040f"+
		"\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2"+
		"\2\2\u0412\u0414\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0415\5N(\2\u0415\u0416"+
		"\5F$\2\u0416\u0417\7/\2\2\u0417\u0418\5\u00b0Y\2\u0418\u00a5\3\2\2\2\u0419"+
		"\u041a\5\u00aaV\2\u041a\u00a7\3\2\2\2\u041b\u041c\7,\2\2\u041c\u041d\5"+
		"\u00b0Y\2\u041d\u041e\7-\2\2\u041e\u00a9\3\2\2\2\u041f\u0424\5\u00b0Y"+
		"\2\u0420\u0421\7\27\2\2\u0421\u0423\5\u00b0Y\2\u0422\u0420\3\2\2\2\u0423"+
		"\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u00ab\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0427\u0428\5\u00b0Y\2\u0428\u00ad\3\2\2\2\u0429"+
		"\u042a\5\u00b0Y\2\u042a\u00af\3\2\2\2\u042b\u042c\bY\1\2\u042c\u042d\7"+
		",\2\2\u042d\u042e\5N(\2\u042e\u042f\7-\2\2\u042f\u0430\5\u00b0Y\23\u0430"+
		"\u0439\3\2\2\2\u0431\u0432\t\7\2\2\u0432\u0439\5\u00b0Y\21\u0433\u0434"+
		"\t\b\2\2\u0434\u0439\5\u00b0Y\20\u0435\u0439\5\u00b2Z\2\u0436\u0437\7"+
		"@\2\2\u0437\u0439\5\u00b4[\2\u0438\u042b\3\2\2\2\u0438\u0431\3\2\2\2\u0438"+
		"\u0433\3\2\2\2\u0438\u0435\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u048f\3\2"+
		"\2\2\u043a\u043b\f\17\2\2\u043b\u043c\t\t\2\2\u043c\u048e\5\u00b0Y\20"+
		"\u043d\u043e\f\16\2\2\u043e\u043f\t\n\2\2\u043f\u048e\5\u00b0Y\17\u0440"+
		"\u0448\f\r\2\2\u0441\u0442\7\26\2\2\u0442\u0449\7\26\2\2\u0443\u0444\7"+
		"\30\2\2\u0444\u0445\7\30\2\2\u0445\u0449\7\30\2\2\u0446\u0447\7\30\2\2"+
		"\u0447\u0449\7\30\2\2\u0448\u0441\3\2\2\2\u0448\u0443\3\2\2\2\u0448\u0446"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u048e\5\u00b0Y\16\u044b\u044c\f\f\2"+
		"\2\u044c\u044d\t\13\2\2\u044d\u048e\5\u00b0Y\r\u044e\u044f\f\n\2\2\u044f"+
		"\u0450\t\f\2\2\u0450\u048e\5\u00b0Y\13\u0451\u0452\f\t\2\2\u0452\u0453"+
		"\7\31\2\2\u0453\u048e\5\u00b0Y\n\u0454\u0455\f\b\2\2\u0455\u0456\7N\2"+
		"\2\u0456\u048e\5\u00b0Y\t\u0457\u0458\f\7\2\2\u0458\u0459\7<\2\2\u0459"+
		"\u048e\5\u00b0Y\b\u045a\u045b\f\6\2\2\u045b\u045c\7O\2\2\u045c\u048e\5"+
		"\u00b0Y\7\u045d\u045e\f\5\2\2\u045e\u045f\7P\2\2\u045f\u048e\5\u00b0Y"+
		"\6\u0460\u0461\f\4\2\2\u0461\u0462\7*\2\2\u0462\u0463\5\u00b0Y\2\u0463"+
		"\u0464\7/\2\2\u0464\u0465\5\u00b0Y\5\u0465\u048e\3\2\2\2\u0466\u0467\f"+
		"\3\2\2\u0467\u0468\t\r\2\2\u0468\u048e\5\u00b0Y\3\u0469\u046a\f\33\2\2"+
		"\u046a\u046b\7\7\2\2\u046b\u048e\7b\2\2\u046c\u046d\f\32\2\2\u046d\u046e"+
		"\7\7\2\2\u046e\u048e\7?\2\2\u046f\u0470\f\31\2\2\u0470\u0471\7\7\2\2\u0471"+
		"\u0473\7@\2\2\u0472\u0474\5\u00c0a\2\u0473\u0472\3\2\2\2\u0473\u0474\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u048e\5\u00b8]\2\u0476\u0477\f\30\2\2"+
		"\u0477\u0478\7\7\2\2\u0478\u0479\7+\2\2\u0479\u048e\5\u00c6d\2\u047a\u047b"+
		"\f\27\2\2\u047b\u047c\7\7\2\2\u047c\u048e\5\u00be`\2\u047d\u047e\f\26"+
		"\2\2\u047e\u047f\7\36\2\2\u047f\u0480\5\u00b0Y\2\u0480\u0481\7\37\2\2"+
		"\u0481\u048e\3\2\2\2\u0482\u0483\f\25\2\2\u0483\u0485\7,\2\2\u0484\u0486"+
		"\5\u00aaV\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2"+
		"\2\u0487\u048e\7-\2\2\u0488\u0489\f\22\2\2\u0489\u048e\t\16\2\2\u048a"+
		"\u048b\f\13\2\2\u048b\u048c\7K\2\2\u048c\u048e\5N(\2\u048d\u043a\3\2\2"+
		"\2\u048d\u043d\3\2\2\2\u048d\u0440\3\2\2\2\u048d\u044b\3\2\2\2\u048d\u044e"+
		"\3\2\2\2\u048d\u0451\3\2\2\2\u048d\u0454\3\2\2\2\u048d\u0457\3\2\2\2\u048d"+
		"\u045a\3\2\2\2\u048d\u045d\3\2\2\2\u048d\u0460\3\2\2\2\u048d\u0466\3\2"+
		"\2\2\u048d\u0469\3\2\2\2\u048d\u046c\3\2\2\2\u048d\u046f\3\2\2\2\u048d"+
		"\u0476\3\2\2\2\u048d\u047a\3\2\2\2\u048d\u047d\3\2\2\2\u048d\u0482\3\2"+
		"\2\2\u048d\u0488\3\2\2\2\u048d\u048a\3\2\2\2\u048e\u0491\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u00b1\3\2\2\2\u0491\u048f\3\2"+
		"\2\2\u0492\u0493\7,\2\2\u0493\u0494\5\u00b0Y\2\u0494\u0495\7-\2\2\u0495"+
		"\u04a8\3\2\2\2\u0496\u04a8\7?\2\2\u0497\u04a8\7+\2\2\u0498\u04a8\5h\65"+
		"\2\u0499\u04a8\7b\2\2\u049a\u049b\5N(\2\u049b\u049c\7\7\2\2\u049c\u049d"+
		"\7\23\2\2\u049d\u04a8\3\2\2\2\u049e\u049f\7\35\2\2\u049f\u04a0\7\7\2\2"+
		"\u04a0\u04a8\7\23\2\2\u04a1\u04a5\5\u00c0a\2\u04a2\u04a6\5\u00c8e\2\u04a3"+
		"\u04a4\7?\2\2\u04a4\u04a6\5\u00caf\2\u04a5\u04a2\3\2\2\2\u04a5\u04a3\3"+
		"\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u0492\3\2\2\2\u04a7\u0496\3\2\2\2\u04a7"+
		"\u0497\3\2\2\2\u04a7\u0498\3\2\2\2\u04a7\u0499\3\2\2\2\u04a7\u049a\3\2"+
		"\2\2\u04a7\u049e\3\2\2\2\u04a7\u04a1\3\2\2\2\u04a8\u00b3\3\2\2\2\u04a9"+
		"\u04aa\5\u00c0a\2\u04aa\u04ab\5\u00b6\\\2\u04ab\u04ac\5\u00bc_\2\u04ac"+
		"\u04b3\3\2\2\2\u04ad\u04b0\5\u00b6\\\2\u04ae\u04b1\5\u00ba^\2\u04af\u04b1"+
		"\5\u00bc_\2\u04b0\u04ae\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b3\3\2\2"+
		"\2\u04b2\u04a9\3\2\2\2\u04b2\u04ad\3\2\2\2\u04b3\u00b5\3\2\2\2\u04b4\u04b6"+
		"\7b\2\2\u04b5\u04b7\5\u00c2b\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2"+
		"\u04b7\u04bf\3\2\2\2\u04b8\u04b9\7\7\2\2\u04b9\u04bb\7b\2\2\u04ba\u04bc"+
		"\5\u00c2b\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2"+
		"\2\u04bd\u04b8\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04c4\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c4\5R*\2\u04c3"+
		"\u04b4\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4\u00b7\3\2\2\2\u04c5\u04c7\7b"+
		"\2\2\u04c6\u04c8\5\u00c4c\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04ca\5\u00bc_\2\u04ca\u00b9\3\2\2\2\u04cb\u04e7"+
		"\7\36\2\2\u04cc\u04d1\7\37\2\2\u04cd\u04ce\7\36\2\2\u04ce\u04d0\7\37\2"+
		"\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2"+
		"\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04e8\5J&\2\u04d5"+
		"\u04d6\5\u00b0Y\2\u04d6\u04dd\7\37\2\2\u04d7\u04d8\7\36\2\2\u04d8\u04d9"+
		"\5\u00b0Y\2\u04d9\u04da\7\37\2\2\u04da\u04dc\3\2\2\2\u04db\u04d7\3\2\2"+
		"\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e4"+
		"\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e1\7\36\2\2\u04e1\u04e3\7\37\2\2"+
		"\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5"+
		"\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04cc\3\2\2\2\u04e7"+
		"\u04d5\3\2\2\2\u04e8\u00bb\3\2\2\2\u04e9\u04eb\5\u00caf\2\u04ea\u04ec"+
		"\5$\23\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u00bd\3\2\2\2\u04ed"+
		"\u04ee\5\u00c0a\2\u04ee\u04ef\5\u00c8e\2\u04ef\u00bf\3\2\2\2\u04f0\u04f1"+
		"\7\26\2\2\u04f1\u04f2\5\"\22\2\u04f2\u04f3\7\30\2\2\u04f3\u00c1\3\2\2"+
		"\2\u04f4\u04f5\7\26\2\2\u04f5\u04f8\7\30\2\2\u04f6\u04f8\5T+\2\u04f7\u04f4"+
		"\3\2\2\2\u04f7\u04f6\3\2\2\2\u04f8\u00c3\3\2\2\2\u04f9\u04fa\7\26\2\2"+
		"\u04fa\u04fd\7\30\2\2\u04fb\u04fd\5\u00c0a\2\u04fc\u04f9\3\2\2\2\u04fc"+
		"\u04fb\3\2\2\2\u04fd\u00c5\3\2\2\2\u04fe\u0505\5\u00caf\2\u04ff\u0500"+
		"\7\7\2\2\u0500\u0502\7b\2\2\u0501\u0503\5\u00caf\2\u0502\u0501\3\2\2\2"+
		"\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u04fe\3\2\2\2\u0504\u04ff"+
		"\3\2\2\2\u0505\u00c7\3\2\2\2\u0506\u0507\7+\2\2\u0507\u050b\5\u00c6d\2"+
		"\u0508\u0509\7b\2\2\u0509\u050b\5\u00caf\2\u050a\u0506\3\2\2\2\u050a\u0508"+
		"\3\2\2\2\u050b\u00c9\3\2\2\2\u050c\u050e\7,\2\2\u050d\u050f\5\u00aaV\2"+
		"\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511"+
		"\7-\2\2\u0511\u00cb\3\2\2\2\u0512\u0513\7c\2\2\u0513\u0514\5\u00ceh\2"+
		"\u0514\u0515\7d\2\2\u0515\u00cd\3\2\2\2\u0516\u051a\5\u00dan\2\u0517\u051a"+
		"\5\u00dco\2\u0518\u051a\5\u00d8m\2\u0519\u0516\3\2\2\2\u0519\u0517\3\2"+
		"\2\2\u0519\u0518\3\2\2\2\u051a\u00cf\3\2\2\2\u051b\u051c\t\17\2\2\u051c"+
		"\u00d1\3\2\2\2\u051d\u051e\t\20\2\2\u051e\u00d3\3\2\2\2\u051f\u0520\7"+
		"i\2\2\u0520\u00d5\3\2\2\2\u0521\u0522\5\u00d4k\2\u0522\u0523\7x\2\2\u0523"+
		"\u0524\5\u00d8m\2\u0524\u00d7\3\2\2\2\u0525\u0526\7e\2\2\u0526\u0527\7"+
		"l\2\2\u0527\u052e\7i\2\2\u0528\u0529\7n\2\2\u0529\u052a\5\u00d0i\2\u052a"+
		"\u052b\7j\2\2\u052b\u052c\7o\2\2\u052c\u052f\3\2\2\2\u052d\u052f\5\u00d2"+
		"j\2\u052e\u0528\3\2\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0530\3\2\2\2\u0530\u0531\7m\2\2\u0531\u0533\7\7\2\2\u0532\u0534\t\21"+
		"\2\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\7k\2\2\u0536\u00d9\3\2\2\2\u0537\u0538\7r\2\2\u0538\u0539\5\u00d4"+
		"k\2\u0539\u00db\3\2\2\2\u053a\u053b\7s\2\2\u053b\u053c\5\u00d6l\2\u053c"+
		"\u00dd\3\2\2\2\u009a\u00df\u00e4\u00ea\u00f2\u00fb\u0100\u0107\u010e\u0115"+
		"\u011c\u0121\u0125\u0129\u012d\u0132\u0136\u013a\u0144\u014c\u0153\u015a"+
		"\u015e\u0161\u0164\u016d\u0173\u0178\u017b\u0181\u0187\u018b\u0194\u019b"+
		"\u01a4\u01ab\u01b1\u01b5\u01c0\u01c4\u01cc\u01d1\u01d5\u01de\u01ec\u01f1"+
		"\u01fa\u0202\u020c\u0214\u021c\u0221\u022d\u0233\u023a\u023f\u0247\u024b"+
		"\u024d\u0258\u0260\u0263\u0267\u026c\u0270\u027b\u0284\u0286\u028d\u0292"+
		"\u029b\u02a0\u02a3\u02a8\u02b1\u02c1\u02cb\u02ce\u02d7\u02e1\u02e9\u02ec"+
		"\u02ef\u02fc\u0304\u0309\u0311\u0315\u0319\u031d\u031f\u0323\u0329\u0334"+
		"\u033c\u0344\u034f\u0358\u036f\u0372\u0375\u037d\u0381\u0389\u038f\u039a"+
		"\u03a3\u03a8\u03b2\u03b9\u03c6\u03cf\u03d8\u03de\u03e9\u03ee\u03fa\u03fe"+
		"\u0402\u0406\u0408\u040c\u0411\u0424\u0438\u0448\u0473\u0485\u048d\u048f"+
		"\u04a5\u04a7\u04b0\u04b2\u04b6\u04bb\u04bf\u04c3\u04c7\u04d1\u04dd\u04e4"+
		"\u04e7\u04eb\u04f7\u04fc\u0502\u0504\u050a\u050e\u0519\u052e\u0533";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}