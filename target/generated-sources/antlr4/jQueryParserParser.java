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
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, ABSTRACT=1, ASSERT=2, 
		BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, CLASS=9, CONST=10, 
		CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, ENUM=16, EXTENDS=17, 
		FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, IMPLEMENTS=24, 
		IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, NATIVE=30, NEW=31, 
		PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, SHORT=37, 
		STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, THIS=43, 
		THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, WHILE=50, 
		IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, CharacterLiteral=54, 
		StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, LBRACE=59, RBRACE=60, 
		LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, ASSIGN=66, GT=67, LT=68, 
		BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, LE=74, GE=75, NOTEQUAL=76, 
		AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, MUL=83, DIV=84, BITAND=85, 
		BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, SUB_ASSIGN=90, MUL_ASSIGN=91, 
		DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, XOR_ASSIGN=95, MOD_ASSIGN=96, 
		LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, Identifier=100, 
		AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105, JQBEGIN=106, 
		JQEND=107, OPENS=108, CLOSES=109, DIGIT=110, NUMBER=111, STRING=112, END=113, 
		OPENP=114, CLOSEP=115, OPENB=116, CLOSEB=117, OPENC=118, CLOSEC=119, IN=120, 
		OUT=121, QUOTES=122, CONTAINS_SUB_STRING=123, CONTAINS_WORD=124, CONTAINS_PREFIX=125, 
		EQUALS=126, NOT_EQUALS=127, STARTS_WITH=128, ENDS_WITH=129, BASIC_FILTER=130, 
		CONTENT_FILTER=131, HIERARCHY_SELECTOR=132, CHILD_FILTER=133, EVENT=134, 
		ADDFUNCS=135, OPERATION=136, JQWS=137, JQCOMMENT=138, JQLINE_COMMENT=139;
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
		RULE_arguments = 100, RULE_start = 101, RULE_code = 102, RULE_ops = 103, 
		RULE_filter = 104, RULE_assign_selection = 105, RULE_selector = 106, RULE_input = 107, 
		RULE_output = 108;
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
		"explicitGenericInvocationSuffix", "arguments", "start", "code", "ops", 
		"filter", "assign_selection", "selector", "input", "output"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'assert'", "'import'", "'static'", "'.'", "'*'", "'native'", 
		"'synchronized'", "'transient'", "'const'", "'public'", "'protected'", 
		"'private'", "'abstract'", "'final'", "'enum'", "'class'", "'extends'", 
		"'implements'", "'<'", "','", "'>'", "'goto'", "'{'", "'}'", "'interface'", 
		"'void'", "'['", "']'", "'throws'", "'='", "'boolean'", "'char'", "'byte'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "'super'", 
		"'('", "')'", "'...'", "'null'", "'@'", "'default'", "':'", "'if'", "'else'", 
		"'for'", "'while'", "'do'", "'try'", "'switch'", "'return'", "'throw'", 
		"'break'", "'continue'", "'catch'", "'|'", "'finally'", "'case'", "'this'", 
		"'new'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<='", 
		"'>='", "'instanceof'", "'=='", "'!='", "'^'", "'&&'", "'||'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", 
		"'%='", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'<-@JQ'", "'@JQ->'", "'$(\"'", "'\")'", null, null, null, 
		null, null, null, null, null, null, null, "'in'", "'out'", "'\"'", null, 
		"'~='", null, null, null, null, "'$='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "AND_ASSIGN", "OR_ASSIGN", 
		"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
		"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "JQBEGIN", 
		"JQEND", "OPENS", "CLOSES", "DIGIT", "NUMBER", "STRING", "END", "OPENP", 
		"CLOSEP", "OPENB", "CLOSEB", "OPENC", "CLOSEC", "IN", "OUT", "QUOTES", 
		"CONTAINS_SUB_STRING", "CONTAINS_WORD", "CONTAINS_PREFIX", "EQUALS", "NOT_EQUALS", 
		"STARTS_WITH", "ENDS_WITH", "BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", 
		"CHILD_FILTER", "EVENT", "ADDFUNCS", "OPERATION", "JQWS", "JQCOMMENT", 
		"JQLINE_COMMENT"
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
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(218);
				packageDeclaration();
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(221);
				importDeclaration();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__45))) != 0)) {
				{
				{
				setState(227);
				typeDeclaration();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(235);
				annotation();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__0);
			setState(242);
			qualifiedName();
			setState(243);
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
			setState(245);
			match(T__2);
			setState(247);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(246);
				match(T__3);
				}
			}

			setState(249);
			qualifiedName();
			setState(252);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(250);
				match(T__4);
				setState(251);
				match(T__5);
				}
			}

			setState(254);
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
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__45))) != 0)) {
					{
					{
					setState(256);
					classOrInterfaceModifier();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(269);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__45))) != 0)) {
					{
					{
					setState(270);
					classOrInterfaceModifier();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(283);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
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
			setState(289);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				classOrInterfaceModifier();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
			setState(293);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
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
				setState(292);
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
			setState(297);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__14);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
			setState(299);
			match(T__16);
			setState(300);
			match(Identifier);
			setState(302);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(301);
				typeParameters();
				}
			}

			setState(306);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(304);
				match(T__17);
				setState(305);
				type();
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(308);
				match(T__18);
				setState(309);
				typeList();
				}
			}

			setState(312);
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
			setState(314);
			match(T__19);
			setState(315);
			typeParameter();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(316);
				match(T__20);
				setState(317);
				typeParameter();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
			setState(325);
			match(Identifier);
			setState(328);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(326);
				match(T__17);
				setState(327);
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
			setState(330);
			type();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(331);
				match(T__22);
				setState(332);
				type();
				}
				}
				setState(337);
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
			setState(338);
			match(T__15);
			setState(339);
			match(Identifier);
			setState(342);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(340);
				match(T__18);
				setState(341);
				typeList();
				}
			}

			setState(344);
			match(T__23);
			setState(346);
			_la = _input.LA(1);
			if (_la==T__45 || _la==Identifier) {
				{
				setState(345);
				enumConstants();
				}
			}

			setState(349);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(348);
				match(T__20);
				}
			}

			setState(352);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(351);
				enumBodyDeclarations();
				}
			}

			setState(354);
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
			setState(356);
			enumConstant();
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					match(T__20);
					setState(358);
					enumConstant();
					}
					} 
				}
				setState(363);
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
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(364);
				annotation();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(Identifier);
			setState(372);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(371);
				arguments();
				}
			}

			setState(375);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(374);
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
			setState(377);
			match(T__1);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45))) != 0) || _la==Identifier) {
				{
				{
				setState(378);
				classBodyDeclaration();
				}
				}
				setState(383);
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
			setState(384);
			match(T__25);
			setState(385);
			match(Identifier);
			setState(387);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(386);
				typeParameters();
				}
			}

			setState(391);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(389);
				match(T__17);
				setState(390);
				typeList();
				}
			}

			setState(393);
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
			setState(395);
			type();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(396);
				match(T__20);
				setState(397);
				type();
				}
				}
				setState(402);
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
			setState(403);
			match(T__23);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45))) != 0) || _la==Identifier) {
				{
				{
				setState(404);
				classBodyDeclaration();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
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
			setState(412);
			match(T__23);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45))) != 0) || _la==Identifier) {
				{
				{
				setState(413);
				interfaceBodyDeclaration();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
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
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(422);
					match(T__3);
					}
				}

				setState(425);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(426);
						modifier();
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(432);
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
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
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
			setState(448);
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
				setState(446);
				type();
				}
				break;
			case T__26:
				{
				setState(447);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			match(Identifier);
			setState(451);
			formalParameters();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(452);
				match(T__27);
				setState(453);
				match(T__28);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(459);
				match(T__29);
				setState(460);
				qualifiedNameList();
				}
			}

			setState(465);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(463);
				methodBody();
				}
				break;
			case T__1:
				{
				setState(464);
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
			setState(467);
			typeParameters();
			setState(468);
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
			setState(470);
			match(Identifier);
			setState(471);
			formalParameters();
			setState(474);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(472);
				match(T__29);
				setState(473);
				qualifiedNameList();
				}
			}

			setState(476);
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
			setState(478);
			typeParameters();
			setState(479);
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
			setState(481);
			type();
			setState(482);
			variableDeclarators();
			setState(483);
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
			setState(493);
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
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						modifier();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(491);
				interfaceMemberDeclaration();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
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
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(500);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(501);
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
			setState(504);
			type();
			setState(505);
			constantDeclarator();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(506);
				match(T__20);
				setState(507);
				constantDeclarator();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
			setState(515);
			match(Identifier);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(516);
				match(T__27);
				setState(517);
				match(T__28);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(T__30);
			setState(524);
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
			setState(528);
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
				setState(526);
				type();
				}
				break;
			case T__26:
				{
				setState(527);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(Identifier);
			setState(531);
			formalParameters();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(532);
				match(T__27);
				setState(533);
				match(T__28);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(539);
				match(T__29);
				setState(540);
				qualifiedNameList();
				}
			}

			setState(543);
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
			setState(545);
			typeParameters();
			setState(546);
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
			setState(548);
			variableDeclarator();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(549);
				match(T__20);
				setState(550);
				variableDeclarator();
				}
				}
				setState(555);
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
			setState(556);
			variableDeclaratorId();
			setState(559);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(557);
				match(T__30);
				setState(558);
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
			setState(561);
			match(Identifier);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(562);
				match(T__27);
				setState(563);
				match(T__28);
				}
				}
				setState(568);
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
			setState(571);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
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
			case T__44:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
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
			setState(573);
			match(T__23);
			setState(585);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(574);
				variableInitializer();
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(T__20);
						setState(576);
						variableInitializer();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(583);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(582);
					match(T__20);
					}
				}

				}
			}

			setState(587);
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
			setState(589);
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
			setState(607);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				classOrInterfaceType();
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(T__27);
						setState(593);
						match(T__28);
						}
						} 
					}
					setState(598);
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
				setState(599);
				primitiveType();
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(T__27);
						setState(601);
						match(T__28);
						}
						} 
					}
					setState(606);
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
			setState(609);
			match(Identifier);
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(610);
				typeArguments();
				}
				break;
			}
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(T__4);
					setState(614);
					match(Identifier);
					setState(616);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(615);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(622);
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
			setState(623);
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
			setState(625);
			match(T__19);
			setState(626);
			typeArgument();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(627);
				match(T__20);
				setState(628);
				typeArgument();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
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
			setState(642);
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
				setState(636);
				type();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(T__39);
				setState(640);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__40) {
					{
					setState(638);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__40) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(639);
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
			setState(644);
			qualifiedName();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(645);
				match(T__20);
				setState(646);
				qualifiedName();
				}
				}
				setState(651);
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
			setState(652);
			match(T__41);
			setState(654);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45))) != 0) || _la==Identifier) {
				{
				setState(653);
				formalParameterList();
				}
			}

			setState(656);
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
			setState(671);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				formalParameter();
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(659);
						match(T__20);
						setState(660);
						formalParameter();
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(668);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(666);
					match(T__20);
					setState(667);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
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
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(673);
				variableModifier();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			type();
			setState(680);
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
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(682);
				variableModifier();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
			type();
			setState(689);
			match(T__43);
			setState(690);
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
			setState(692);
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
			setState(696);
			match(Identifier);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(697);
					match(T__4);
					setState(698);
					match(Identifier);
					}
					} 
				}
				setState(703);
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
			setState(704);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
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
			setState(706);
			match(T__45);
			setState(707);
			annotationName();
			setState(714);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(708);
				match(T__41);
				setState(711);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(709);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(710);
					elementValue();
					}
					break;
				}
				setState(713);
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
			setState(716);
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
			setState(718);
			elementValuePair();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(719);
				match(T__20);
				setState(720);
				elementValuePair();
				}
				}
				setState(725);
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
			setState(726);
			match(Identifier);
			setState(727);
			match(T__30);
			setState(728);
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
			setState(733);
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
			case T__44:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				expression(0);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				annotation();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
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
			setState(735);
			match(T__23);
			setState(744);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(736);
				elementValue();
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(737);
						match(T__20);
						setState(738);
						elementValue();
						}
						} 
					}
					setState(743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(747);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(746);
				match(T__20);
				}
			}

			setState(749);
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
			setState(751);
			match(T__45);
			setState(752);
			match(T__25);
			setState(753);
			match(Identifier);
			setState(754);
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
			setState(756);
			match(T__23);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45))) != 0) || _la==Identifier) {
				{
				{
				setState(757);
				annotationTypeElementDeclaration();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
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
			setState(773);
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
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(765);
						modifier();
						}
						} 
					}
					setState(770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(771);
				annotationTypeElementRest();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
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
			setState(795);
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
				setState(775);
				type();
				setState(776);
				annotationMethodOrConstantRest();
				setState(777);
				match(T__1);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				classDeclaration();
				setState(781);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(780);
					match(T__1);
					}
					break;
				}
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				interfaceDeclaration();
				setState(785);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(784);
					match(T__1);
					}
					break;
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				enumDeclaration();
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(788);
					match(T__1);
					}
					break;
				}
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(791);
				annotationTypeDeclaration();
				setState(793);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(792);
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
			setState(799);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
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
			setState(801);
			match(Identifier);
			setState(802);
			match(T__41);
			setState(803);
			match(T__42);
			setState(805);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(804);
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
			setState(807);
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
			setState(809);
			match(T__46);
			setState(810);
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
			setState(812);
			match(T__23);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(813);
				blockStatement();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
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
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
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
			setState(826);
			localVariableDeclaration();
			setState(827);
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
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(829);
				variableModifier();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			type();
			setState(836);
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
			setState(942);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(T__1);
				setState(840);
				expression(0);
				setState(843);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(841);
					match(T__47);
					setState(842);
					expression(0);
					}
				}

				setState(845);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(T__48);
				setState(848);
				parExpression();
				setState(849);
				statement();
				setState(852);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(850);
					match(T__49);
					setState(851);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(T__50);
				setState(855);
				match(T__41);
				setState(856);
				forControl();
				setState(857);
				match(T__42);
				setState(858);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				match(T__51);
				setState(861);
				parExpression();
				setState(862);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				match(T__52);
				setState(865);
				statement();
				setState(866);
				match(T__51);
				setState(867);
				parExpression();
				setState(868);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870);
				match(T__53);
				setState(871);
				block();
				setState(881);
				switch (_input.LA(1)) {
				case T__59:
					{
					setState(873); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(872);
						catchClause();
						}
						}
						setState(875); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__59 );
					setState(878);
					_la = _input.LA(1);
					if (_la==T__61) {
						{
						setState(877);
						finallyBlock();
						}
					}

					}
					break;
				case T__61:
					{
					setState(880);
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
				setState(883);
				match(T__53);
				setState(884);
				resourceSpecification();
				setState(885);
				block();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(886);
					catchClause();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				_la = _input.LA(1);
				if (_la==T__61) {
					{
					setState(892);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(895);
				match(T__54);
				setState(896);
				parExpression();
				setState(897);
				match(T__23);
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__46 || _la==T__62) {
					{
					{
					setState(904);
					switchLabel();
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(T__24);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(912);
				match(T__7);
				setState(913);
				parExpression();
				setState(914);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(916);
				match(T__55);
				setState(918);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(917);
					expression(0);
					}
				}

				setState(920);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(921);
				match(T__56);
				setState(922);
				expression(0);
				setState(923);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(925);
				match(T__57);
				setState(927);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(926);
					match(Identifier);
					}
				}

				setState(929);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(930);
				match(T__58);
				setState(932);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(931);
					match(Identifier);
					}
				}

				setState(934);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(935);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(936);
				statementExpression();
				setState(937);
				match(T__1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(939);
				match(Identifier);
				setState(940);
				match(T__47);
				setState(941);
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
			setState(944);
			match(T__59);
			setState(945);
			match(T__41);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(946);
				variableModifier();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			catchType();
			setState(953);
			match(Identifier);
			setState(954);
			match(T__42);
			setState(955);
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
			setState(957);
			qualifiedName();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(958);
				match(T__60);
				setState(959);
				qualifiedName();
				}
				}
				setState(964);
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
			setState(965);
			match(T__61);
			setState(966);
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
			setState(968);
			match(T__41);
			setState(969);
			resources();
			setState(971);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(970);
				match(T__1);
				}
			}

			setState(973);
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
			setState(975);
			resource();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(976);
					match(T__1);
					setState(977);
					resource();
					}
					} 
				}
				setState(982);
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
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(983);
				variableModifier();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			classOrInterfaceType();
			setState(990);
			variableDeclaratorId();
			setState(991);
			match(T__30);
			setState(992);
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
			setState(995); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(994);
				switchLabel();
				}
				}
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__46 || _la==T__62 );
			setState(1000); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(999);
				blockStatement();
				}
				}
				setState(1002); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(1014);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(T__62);
				setState(1005);
				constantExpression();
				setState(1006);
				match(T__47);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(T__62);
				setState(1009);
				enumConstantName();
				setState(1010);
				match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				match(T__46);
				setState(1013);
				match(T__47);
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
			setState(1028);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1017);
					forInit();
					}
				}

				setState(1020);
				match(T__1);
				setState(1022);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1021);
					expression(0);
					}
				}

				setState(1024);
				match(T__1);
				setState(1026);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1025);
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
			setState(1032);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
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
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__45) {
				{
				{
				setState(1034);
				variableModifier();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1040);
			type();
			setState(1041);
			variableDeclaratorId();
			setState(1042);
			match(T__47);
			setState(1043);
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
			setState(1045);
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
			setState(1047);
			match(T__41);
			setState(1048);
			expression(0);
			setState(1049);
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
			setState(1051);
			expression(0);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(1052);
				match(T__20);
				setState(1053);
				expression(0);
				}
				}
				setState(1058);
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
			setState(1059);
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
			setState(1076);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1064);
				match(T__41);
				setState(1065);
				type();
				setState(1066);
				match(T__42);
				setState(1067);
				expression(17);
				}
				break;
			case 2:
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1070);
				expression(15);
				}
				break;
			case 3:
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(_la==T__69 || _la==T__70) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1072);
				expression(14);
				}
				break;
			case 4:
				{
				setState(1073);
				primary();
				}
				break;
			case 5:
				{
				setState(1074);
				match(T__64);
				setState(1075);
				creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1161);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1078);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1079);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__71 || _la==T__72) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1080);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1081);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1082);
						_la = _input.LA(1);
						if ( !(_la==T__67 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1083);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1084);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1092);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1085);
							match(T__19);
							setState(1086);
							match(T__19);
							}
							break;
						case 2:
							{
							setState(1087);
							match(T__21);
							setState(1088);
							match(T__21);
							setState(1089);
							match(T__21);
							}
							break;
						case 3:
							{
							setState(1090);
							match(T__21);
							setState(1091);
							match(T__21);
							}
							break;
						}
						setState(1094);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1095);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1096);
						_la = _input.LA(1);
						if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__21 - 20)) | (1L << (T__73 - 20)) | (1L << (T__74 - 20)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1097);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1098);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1099);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__77) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1100);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1102);
						match(T__22);
						setState(1103);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1105);
						match(T__78);
						setState(1106);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1108);
						match(T__60);
						setState(1109);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1111);
						match(T__79);
						setState(1112);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1114);
						match(T__80);
						setState(1115);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1117);
						match(T__39);
						setState(1118);
						expression(0);
						setState(1119);
						match(T__47);
						setState(1120);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1123);
						_la = _input.LA(1);
						if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__81 - 31)) | (1L << (T__82 - 31)) | (1L << (T__83 - 31)) | (1L << (T__84 - 31)) | (1L << (T__85 - 31)) | (1L << (T__86 - 31)) | (1L << (T__87 - 31)) | (1L << (T__88 - 31)) | (1L << (T__89 - 31)) | (1L << (T__90 - 31)) | (1L << (T__91 - 31)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1124);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1126);
						match(T__4);
						setState(1127);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1128);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1129);
						match(T__4);
						setState(1130);
						match(T__63);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1132);
						match(T__4);
						setState(1133);
						match(T__64);
						setState(1135);
						_la = _input.LA(1);
						if (_la==T__19) {
							{
							setState(1134);
							nonWildcardTypeArguments();
							}
						}

						setState(1137);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1139);
						match(T__4);
						setState(1140);
						match(T__40);
						setState(1141);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1142);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1143);
						match(T__4);
						setState(1144);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1145);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1146);
						match(T__27);
						setState(1147);
						expression(0);
						setState(1148);
						match(T__28);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1151);
						match(T__41);
						setState(1153);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(1152);
							expressionList();
							}
						}

						setState(1155);
						match(T__42);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1157);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__66) ) {
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
						setState(1158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1159);
						match(T__75);
						setState(1160);
						type();
						}
						break;
					}
					} 
				}
				setState(1165);
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
			setState(1187);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				match(T__41);
				setState(1167);
				expression(0);
				setState(1168);
				match(T__42);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(T__63);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1172);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1173);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1174);
				type();
				setState(1175);
				match(T__4);
				setState(1176);
				match(T__16);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1178);
				match(T__26);
				setState(1179);
				match(T__4);
				setState(1180);
				match(T__16);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1181);
				nonWildcardTypeArguments();
				setState(1185);
				switch (_input.LA(1)) {
				case T__40:
				case Identifier:
					{
					setState(1182);
					explicitGenericInvocationSuffix();
					}
					break;
				case T__63:
					{
					setState(1183);
					match(T__63);
					setState(1184);
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
			setState(1198);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				nonWildcardTypeArguments();
				setState(1190);
				createdName();
				setState(1191);
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
				setState(1193);
				createdName();
				setState(1196);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(1194);
					arrayCreatorRest();
					}
					break;
				case T__41:
					{
					setState(1195);
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
			setState(1215);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(Identifier);
				setState(1202);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(1201);
					typeArgumentsOrDiamond();
					}
				}

				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1204);
					match(T__4);
					setState(1205);
					match(Identifier);
					setState(1207);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(1206);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1213);
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
				setState(1214);
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
			setState(1217);
			match(Identifier);
			setState(1219);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1218);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1221);
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
			setState(1223);
			match(T__27);
			setState(1251);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(1224);
				match(T__28);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(1225);
					match(T__27);
					setState(1226);
					match(T__28);
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1232);
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
			case T__44:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case Identifier:
				{
				setState(1233);
				expression(0);
				setState(1234);
				match(T__28);
				setState(1241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1235);
						match(T__27);
						setState(1236);
						expression(0);
						setState(1237);
						match(T__28);
						}
						} 
					}
					setState(1243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1244);
						match(T__27);
						setState(1245);
						match(T__28);
						}
						} 
					}
					setState(1250);
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
			setState(1253);
			arguments();
			setState(1255);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1254);
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
			setState(1257);
			nonWildcardTypeArguments();
			setState(1258);
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
			setState(1260);
			match(T__19);
			setState(1261);
			typeList();
			setState(1262);
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
			setState(1267);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(T__19);
				setState(1265);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
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
			setState(1272);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				match(T__19);
				setState(1270);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
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
			setState(1280);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				arguments();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				match(T__4);
				setState(1276);
				match(Identifier);
				setState(1278);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1277);
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
			setState(1286);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(T__40);
				setState(1283);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				match(Identifier);
				setState(1285);
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
			setState(1288);
			match(T__41);
			setState(1290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1289);
				expressionList();
				}
			}

			setState(1292);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode JQBEGIN() { return getToken(jQueryParserParser.JQBEGIN, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode JQEND() { return getToken(jQueryParserParser.JQEND, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(JQBEGIN);
			setState(1295);
			code();
			setState(1296);
			match(JQEND);
			}
		}
		catch (RecognitionException re) {
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
		int _la;
		try {
			setState(1310);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				input();
				setState(1300);
				_la = _input.LA(1);
				if (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (OPENS - 108)) | (1L << (IN - 108)) | (1L << (OUT - 108)))) != 0)) {
					{
					setState(1299);
					code();
					}
				}

				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				output();
				setState(1304);
				_la = _input.LA(1);
				if (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (OPENS - 108)) | (1L << (IN - 108)) | (1L << (OUT - 108)))) != 0)) {
					{
					setState(1303);
					code();
					}
				}

				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				selector();
				setState(1308);
				_la = _input.LA(1);
				if (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (OPENS - 108)) | (1L << (IN - 108)) | (1L << (OUT - 108)))) != 0)) {
					{
					setState(1307);
					code();
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
			setState(1312);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (CONTAINS_SUB_STRING - 123)) | (1L << (CONTAINS_WORD - 123)) | (1L << (CONTAINS_PREFIX - 123)) | (1L << (EQUALS - 123)) | (1L << (NOT_EQUALS - 123)) | (1L << (STARTS_WITH - 123)) | (1L << (ENDS_WITH - 123)) | (1L << (EVENT - 123)) | (1L << (ADDFUNCS - 123)))) != 0)) ) {
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
			setState(1314);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (BASIC_FILTER - 130)) | (1L << (CONTENT_FILTER - 130)) | (1L << (HIERARCHY_SELECTOR - 130)) | (1L << (CHILD_FILTER - 130)))) != 0)) ) {
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

	public static class Assign_selectionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(jQueryParserParser.STRING, 0); }
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
		enterRule(_localctx, 210, RULE_assign_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(STRING);
			setState(1317);
			match(EQUALS);
			setState(1318);
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
		public TerminalNode OPENS() { return getToken(jQueryParserParser.OPENS, 0); }
		public List<TerminalNode> STRING() { return getTokens(jQueryParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(jQueryParserParser.STRING, i);
		}
		public TerminalNode CLOSES() { return getToken(jQueryParserParser.CLOSES, 0); }
		public TerminalNode END() { return getToken(jQueryParserParser.END, 0); }
		public TerminalNode OPENB() { return getToken(jQueryParserParser.OPENB, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
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
		enterRule(_localctx, 212, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(OPENS);
			setState(1321);
			match(STRING);
			setState(1328);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(1322);
				match(OPENB);
				setState(1323);
				ops();
				setState(1324);
				match(STRING);
				setState(1325);
				match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(1327);
				filter();
				}
				break;
			case CLOSES:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1330);
			match(CLOSES);
			setState(1331);
			match(T__4);
			setState(1333);
			_la = _input.LA(1);
			if (((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (EVENT - 134)) | (1L << (ADDFUNCS - 134)) | (1L << (OPERATION - 134)))) != 0)) {
				{
				setState(1332);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (EVENT - 134)) | (1L << (ADDFUNCS - 134)) | (1L << (OPERATION - 134)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1335);
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
		public TerminalNode STRING() { return getToken(jQueryParserParser.STRING, 0); }
		public TerminalNode END() { return getToken(jQueryParserParser.END, 0); }
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
		enterRule(_localctx, 214, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(IN);
			setState(1338);
			match(STRING);
			setState(1339);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(jQueryParserParser.OUT, 0); }
		public Assign_selectionContext assign_selection() {
			return getRuleContext(Assign_selectionContext.class,0);
		}
		public TerminalNode END() { return getToken(jQueryParserParser.END, 0); }
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
		enterRule(_localctx, 216, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(OUT);
			setState(1342);
			assign_selection();
			setState(1343);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u008d\u0544\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\3\2\5\2\u00de\n\2\3\2\7\2\u00e1\n\2\f\2\16\2\u00e4"+
		"\13\2\3\2\7\2\u00e7\n\2\f\2\16\2\u00ea\13\2\3\2\3\2\3\3\7\3\u00ef\n\3"+
		"\f\3\16\3\u00f2\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00fa\n\4\3\4\3\4\3\4"+
		"\5\4\u00ff\n\4\3\4\3\4\3\5\7\5\u0104\n\5\f\5\16\5\u0107\13\5\3\5\3\5\7"+
		"\5\u010b\n\5\f\5\16\5\u010e\13\5\3\5\3\5\7\5\u0112\n\5\f\5\16\5\u0115"+
		"\13\5\3\5\3\5\7\5\u0119\n\5\f\5\16\5\u011c\13\5\3\5\3\5\5\5\u0120\n\5"+
		"\3\6\3\6\5\6\u0124\n\6\3\7\3\7\5\7\u0128\n\7\3\b\3\b\5\b\u012c\n\b\3\t"+
		"\3\t\3\t\5\t\u0131\n\t\3\t\3\t\5\t\u0135\n\t\3\t\3\t\5\t\u0139\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u0141\n\n\f\n\16\n\u0144\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\5\13\u014b\n\13\3\f\3\f\3\f\7\f\u0150\n\f\f\f\16\f\u0153\13\f"+
		"\3\r\3\r\3\r\3\r\5\r\u0159\n\r\3\r\3\r\5\r\u015d\n\r\3\r\5\r\u0160\n\r"+
		"\3\r\5\r\u0163\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u016a\n\16\f\16\16\16\u016d"+
		"\13\16\3\17\7\17\u0170\n\17\f\17\16\17\u0173\13\17\3\17\3\17\5\17\u0177"+
		"\n\17\3\17\5\17\u017a\n\17\3\20\3\20\7\20\u017e\n\20\f\20\16\20\u0181"+
		"\13\20\3\21\3\21\3\21\5\21\u0186\n\21\3\21\3\21\5\21\u018a\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u0191\n\22\f\22\16\22\u0194\13\22\3\23\3\23\7"+
		"\23\u0198\n\23\f\23\16\23\u019b\13\23\3\23\3\23\3\24\3\24\7\24\u01a1\n"+
		"\24\f\24\16\24\u01a4\13\24\3\24\3\24\3\25\3\25\5\25\u01aa\n\25\3\25\3"+
		"\25\7\25\u01ae\n\25\f\25\16\25\u01b1\13\25\3\25\5\25\u01b4\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01bf\n\26\3\27\3\27\5\27"+
		"\u01c3\n\27\3\27\3\27\3\27\3\27\7\27\u01c9\n\27\f\27\16\27\u01cc\13\27"+
		"\3\27\3\27\5\27\u01d0\n\27\3\27\3\27\5\27\u01d4\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\5\31\u01dd\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\7\34\u01e9\n\34\f\34\16\34\u01ec\13\34\3\34\3\34\5\34"+
		"\u01f0\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01f9\n\35\3\36\3"+
		"\36\3\36\3\36\7\36\u01ff\n\36\f\36\16\36\u0202\13\36\3\36\3\36\3\37\3"+
		"\37\3\37\7\37\u0209\n\37\f\37\16\37\u020c\13\37\3\37\3\37\3\37\3 \3 \5"+
		" \u0213\n \3 \3 \3 \3 \7 \u0219\n \f \16 \u021c\13 \3 \3 \5 \u0220\n "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u022a\n\"\f\"\16\"\u022d\13\"\3#\3#\3"+
		"#\5#\u0232\n#\3$\3$\3$\7$\u0237\n$\f$\16$\u023a\13$\3%\3%\5%\u023e\n%"+
		"\3&\3&\3&\3&\7&\u0244\n&\f&\16&\u0247\13&\3&\5&\u024a\n&\5&\u024c\n&\3"+
		"&\3&\3\'\3\'\3(\3(\3(\7(\u0255\n(\f(\16(\u0258\13(\3(\3(\3(\7(\u025d\n"+
		"(\f(\16(\u0260\13(\5(\u0262\n(\3)\3)\5)\u0266\n)\3)\3)\3)\5)\u026b\n)"+
		"\7)\u026d\n)\f)\16)\u0270\13)\3*\3*\3+\3+\3+\3+\7+\u0278\n+\f+\16+\u027b"+
		"\13+\3+\3+\3,\3,\3,\3,\5,\u0283\n,\5,\u0285\n,\3-\3-\3-\7-\u028a\n-\f"+
		"-\16-\u028d\13-\3.\3.\5.\u0291\n.\3.\3.\3/\3/\3/\7/\u0298\n/\f/\16/\u029b"+
		"\13/\3/\3/\5/\u029f\n/\3/\5/\u02a2\n/\3\60\7\60\u02a5\n\60\f\60\16\60"+
		"\u02a8\13\60\3\60\3\60\3\60\3\61\7\61\u02ae\n\61\f\61\16\61\u02b1\13\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\7\64\u02be\n\64"+
		"\f\64\16\64\u02c1\13\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u02ca"+
		"\n\66\3\66\5\66\u02cd\n\66\3\67\3\67\38\38\38\78\u02d4\n8\f8\168\u02d7"+
		"\138\39\39\39\39\3:\3:\3:\5:\u02e0\n:\3;\3;\3;\3;\7;\u02e6\n;\f;\16;\u02e9"+
		"\13;\5;\u02eb\n;\3;\5;\u02ee\n;\3;\3;\3<\3<\3<\3<\3<\3=\3=\7=\u02f9\n"+
		"=\f=\16=\u02fc\13=\3=\3=\3>\7>\u0301\n>\f>\16>\u0304\13>\3>\3>\5>\u0308"+
		"\n>\3?\3?\3?\3?\3?\3?\5?\u0310\n?\3?\3?\5?\u0314\n?\3?\3?\5?\u0318\n?"+
		"\3?\3?\5?\u031c\n?\5?\u031e\n?\3@\3@\5@\u0322\n@\3A\3A\3A\3A\5A\u0328"+
		"\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0331\nD\fD\16D\u0334\13D\3D\3D\3E\3E\3E\5"+
		"E\u033b\nE\3F\3F\3F\3G\7G\u0341\nG\fG\16G\u0344\13G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\5H\u034e\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0357\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\6H\u036c\nH\rH\16H\u036d\3H\5"+
		"H\u0371\nH\3H\5H\u0374\nH\3H\3H\3H\3H\7H\u037a\nH\fH\16H\u037d\13H\3H"+
		"\5H\u0380\nH\3H\3H\3H\3H\7H\u0386\nH\fH\16H\u0389\13H\3H\7H\u038c\nH\f"+
		"H\16H\u038f\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0399\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u03a2\nH\3H\3H\3H\5H\u03a7\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03b1"+
		"\nH\3I\3I\3I\7I\u03b6\nI\fI\16I\u03b9\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u03c3"+
		"\nJ\fJ\16J\u03c6\13J\3K\3K\3K\3L\3L\3L\5L\u03ce\nL\3L\3L\3M\3M\3M\7M\u03d5"+
		"\nM\fM\16M\u03d8\13M\3N\7N\u03db\nN\fN\16N\u03de\13N\3N\3N\3N\3N\3N\3"+
		"O\6O\u03e6\nO\rO\16O\u03e7\3O\6O\u03eb\nO\rO\16O\u03ec\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u03f9\nP\3Q\3Q\5Q\u03fd\nQ\3Q\3Q\5Q\u0401\nQ\3Q\3Q"+
		"\5Q\u0405\nQ\5Q\u0407\nQ\3R\3R\5R\u040b\nR\3S\7S\u040e\nS\fS\16S\u0411"+
		"\13S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u0421\nV\fV\16V\u0424"+
		"\13V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0437\nY\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0447\nY\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0472\nY\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0484\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u048c\n"+
		"Y\fY\16Y\u048f\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\5Z\u04a4\nZ\5Z\u04a6\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04af\n[\5[\u04b1"+
		"\n[\3\\\3\\\5\\\u04b5\n\\\3\\\3\\\3\\\5\\\u04ba\n\\\7\\\u04bc\n\\\f\\"+
		"\16\\\u04bf\13\\\3\\\5\\\u04c2\n\\\3]\3]\5]\u04c6\n]\3]\3]\3^\3^\3^\3"+
		"^\7^\u04ce\n^\f^\16^\u04d1\13^\3^\3^\3^\3^\3^\3^\3^\7^\u04da\n^\f^\16"+
		"^\u04dd\13^\3^\3^\7^\u04e1\n^\f^\16^\u04e4\13^\5^\u04e6\n^\3_\3_\5_\u04ea"+
		"\n_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\5b\u04f6\nb\3c\3c\3c\5c\u04fb\nc\3d"+
		"\3d\3d\3d\5d\u0501\nd\5d\u0503\nd\3e\3e\3e\3e\5e\u0509\ne\3f\3f\5f\u050d"+
		"\nf\3f\3f\3g\3g\3g\3g\3h\3h\5h\u0517\nh\3h\3h\5h\u051b\nh\3h\3h\5h\u051f"+
		"\nh\5h\u0521\nh\3i\3i\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0533"+
		"\nl\3l\3l\3l\5l\u0538\nl\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3n\2\3\u00b0o\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\2\22\3\2\t\f\4\2\6\6\r\22\3\2\")\4\2\24\24++\4\2//\659\3"+
		"\2DG\3\2HI\4\2\b\bJK\3\2FG\5\2\26\26\30\30LM\3\2OP\4\2!!T^\3\2DE\4\2}"+
		"\u0083\u0088\u0089\3\2\u0084\u0087\3\2\u0088\u008a\u05b6\2\u00dd\3\2\2"+
		"\2\4\u00f0\3\2\2\2\6\u00f7\3\2\2\2\b\u011f\3\2\2\2\n\u0123\3\2\2\2\f\u0127"+
		"\3\2\2\2\16\u012b\3\2\2\2\20\u012d\3\2\2\2\22\u013c\3\2\2\2\24\u0147\3"+
		"\2\2\2\26\u014c\3\2\2\2\30\u0154\3\2\2\2\32\u0166\3\2\2\2\34\u0171\3\2"+
		"\2\2\36\u017b\3\2\2\2 \u0182\3\2\2\2\"\u018d\3\2\2\2$\u0195\3\2\2\2&\u019e"+
		"\3\2\2\2(\u01b3\3\2\2\2*\u01be\3\2\2\2,\u01c2\3\2\2\2.\u01d5\3\2\2\2\60"+
		"\u01d8\3\2\2\2\62\u01e0\3\2\2\2\64\u01e3\3\2\2\2\66\u01ef\3\2\2\28\u01f8"+
		"\3\2\2\2:\u01fa\3\2\2\2<\u0205\3\2\2\2>\u0212\3\2\2\2@\u0223\3\2\2\2B"+
		"\u0226\3\2\2\2D\u022e\3\2\2\2F\u0233\3\2\2\2H\u023d\3\2\2\2J\u023f\3\2"+
		"\2\2L\u024f\3\2\2\2N\u0261\3\2\2\2P\u0263\3\2\2\2R\u0271\3\2\2\2T\u0273"+
		"\3\2\2\2V\u0284\3\2\2\2X\u0286\3\2\2\2Z\u028e\3\2\2\2\\\u02a1\3\2\2\2"+
		"^\u02a6\3\2\2\2`\u02af\3\2\2\2b\u02b6\3\2\2\2d\u02b8\3\2\2\2f\u02ba\3"+
		"\2\2\2h\u02c2\3\2\2\2j\u02c4\3\2\2\2l\u02ce\3\2\2\2n\u02d0\3\2\2\2p\u02d8"+
		"\3\2\2\2r\u02df\3\2\2\2t\u02e1\3\2\2\2v\u02f1\3\2\2\2x\u02f6\3\2\2\2z"+
		"\u0307\3\2\2\2|\u031d\3\2\2\2~\u0321\3\2\2\2\u0080\u0323\3\2\2\2\u0082"+
		"\u0329\3\2\2\2\u0084\u032b\3\2\2\2\u0086\u032e\3\2\2\2\u0088\u033a\3\2"+
		"\2\2\u008a\u033c\3\2\2\2\u008c\u0342\3\2\2\2\u008e\u03b0\3\2\2\2\u0090"+
		"\u03b2\3\2\2\2\u0092\u03bf\3\2\2\2\u0094\u03c7\3\2\2\2\u0096\u03ca\3\2"+
		"\2\2\u0098\u03d1\3\2\2\2\u009a\u03dc\3\2\2\2\u009c\u03e5\3\2\2\2\u009e"+
		"\u03f8\3\2\2\2\u00a0\u0406\3\2\2\2\u00a2\u040a\3\2\2\2\u00a4\u040f\3\2"+
		"\2\2\u00a6\u0417\3\2\2\2\u00a8\u0419\3\2\2\2\u00aa\u041d\3\2\2\2\u00ac"+
		"\u0425\3\2\2\2\u00ae\u0427\3\2\2\2\u00b0\u0436\3\2\2\2\u00b2\u04a5\3\2"+
		"\2\2\u00b4\u04b0\3\2\2\2\u00b6\u04c1\3\2\2\2\u00b8\u04c3\3\2\2\2\u00ba"+
		"\u04c9\3\2\2\2\u00bc\u04e7\3\2\2\2\u00be\u04eb\3\2\2\2\u00c0\u04ee\3\2"+
		"\2\2\u00c2\u04f5\3\2\2\2\u00c4\u04fa\3\2\2\2\u00c6\u0502\3\2\2\2\u00c8"+
		"\u0508\3\2\2\2\u00ca\u050a\3\2\2\2\u00cc\u0510\3\2\2\2\u00ce\u0520\3\2"+
		"\2\2\u00d0\u0522\3\2\2\2\u00d2\u0524\3\2\2\2\u00d4\u0526\3\2\2\2\u00d6"+
		"\u052a\3\2\2\2\u00d8\u053b\3\2\2\2\u00da\u053f\3\2\2\2\u00dc\u00de\5\4"+
		"\3\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\3\2\2\2\u00df"+
		"\u00e1\5\6\4\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e7\5\b\5\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00ef\5j\66\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5f\64\2\u00f5"+
		"\u00f6\7\4\2\2\u00f6\5\3\2\2\2\u00f7\u00f9\7\5\2\2\u00f8\u00fa\7\6\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe"+
		"\5f\64\2\u00fc\u00fd\7\7\2\2\u00fd\u00ff\7\b\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\4\2\2\u0101\7\3\2\2\2"+
		"\u0102\u0104\5\f\7\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0120\5\20\t\2\u0109\u010b\5\f\7\2\u010a\u0109\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0120\5\30\r\2\u0110\u0112\5\f\7\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0120\5 \21\2\u0117\u0119\5\f"+
		"\7\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0120\5v"+
		"<\2\u011e\u0120\7\4\2\2\u011f\u0105\3\2\2\2\u011f\u010c\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2\2\2\u0120\t\3\2\2\2"+
		"\u0121\u0124\5\f\7\2\u0122\u0124\t\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\13\3\2\2\2\u0125\u0128\5j\66\2\u0126\u0128\t\3\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\r\3\2\2\2\u0129\u012c\7\21\2"+
		"\2\u012a\u012c\5j\66\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\17"+
		"\3\2\2\2\u012d\u012e\7\23\2\2\u012e\u0130\7f\2\2\u012f\u0131\5\22\n\2"+
		"\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133"+
		"\7\24\2\2\u0133\u0135\5N(\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0137\7\25\2\2\u0137\u0139\5\"\22\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\5$\23\2\u013b"+
		"\21\3\2\2\2\u013c\u013d\7\26\2\2\u013d\u0142\5\24\13\2\u013e\u013f\7\27"+
		"\2\2\u013f\u0141\5\24\13\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7\30\2\2\u0146\23\3\2\2\2\u0147\u014a\7f\2\2\u0148\u0149"+
		"\7\24\2\2\u0149\u014b\5\26\f\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\25\3\2\2\2\u014c\u0151\5N(\2\u014d\u014e\7\31\2\2\u014e\u0150\5"+
		"N(\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\27\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\22\2"+
		"\2\u0155\u0158\7f\2\2\u0156\u0157\7\25\2\2\u0157\u0159\5\"\22\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\7\32"+
		"\2\2\u015b\u015d\5\32\16\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0160\7\27\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5\36\20\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\33\2\2\u0165\31\3\2\2"+
		"\2\u0166\u016b\5\34\17\2\u0167\u0168\7\27\2\2\u0168\u016a\5\34\17\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\33\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5j\66\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7f\2\2\u0175\u0177\5\u00ca"+
		"f\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u017a\5$\23\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\35\3\2\2"+
		"\2\u017b\u017f\7\4\2\2\u017c\u017e\5(\25\2\u017d\u017c\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\37\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0183\7\34\2\2\u0183\u0185\7f\2\2\u0184\u0186\5\22"+
		"\n\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0188\7\24\2\2\u0188\u018a\5\"\22\2\u0189\u0187\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5&\24\2\u018c!\3\2\2\2\u018d\u0192"+
		"\5N(\2\u018e\u018f\7\27\2\2\u018f\u0191\5N(\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193#\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0195\u0199\7\32\2\2\u0196\u0198\5(\25\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\33\2\2\u019d%\3\2\2\2"+
		"\u019e\u01a2\7\32\2\2\u019f\u01a1\5\66\34\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7\33\2\2\u01a6\'\3\2\2\2\u01a7\u01b4"+
		"\7\4\2\2\u01a8\u01aa\7\6\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01b4\5\u0086D\2\u01ac\u01ae\5\n\6\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\5*\26\2\u01b3\u01a7\3\2"+
		"\2\2\u01b3\u01a9\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4)\3\2\2\2\u01b5\u01bf"+
		"\5,\27\2\u01b6\u01bf\5.\30\2\u01b7\u01bf\5\64\33\2\u01b8\u01bf\5\60\31"+
		"\2\u01b9\u01bf\5\62\32\2\u01ba\u01bf\5 \21\2\u01bb\u01bf\5v<\2\u01bc\u01bf"+
		"\5\20\t\2\u01bd\u01bf\5\30\r\2\u01be\u01b5\3\2\2\2\u01be\u01b6\3\2\2\2"+
		"\u01be\u01b7\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba"+
		"\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"+\3\2\2\2\u01c0\u01c3\5N(\2\u01c1\u01c3\7\35\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\7f\2\2\u01c5\u01ca\5Z."+
		"\2\u01c6\u01c7\7\36\2\2\u01c7\u01c9\7\37\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7 \2\2\u01ce\u01d0\5X-\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d4\5b\62\2\u01d2"+
		"\u01d4\7\4\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4-\3\2\2\2"+
		"\u01d5\u01d6\5\22\n\2\u01d6\u01d7\5,\27\2\u01d7/\3\2\2\2\u01d8\u01d9\7"+
		"f\2\2\u01d9\u01dc\5Z.\2\u01da\u01db\7 \2\2\u01db\u01dd\5X-\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5d\63\2\u01df"+
		"\61\3\2\2\2\u01e0\u01e1\5\22\n\2\u01e1\u01e2\5\60\31\2\u01e2\63\3\2\2"+
		"\2\u01e3\u01e4\5N(\2\u01e4\u01e5\5B\"\2\u01e5\u01e6\7\4\2\2\u01e6\65\3"+
		"\2\2\2\u01e7\u01e9\5\n\6\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01f0\58\35\2\u01ee\u01f0\7\4\2\2\u01ef\u01ea\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\67\3\2\2\2\u01f1\u01f9\5:\36\2\u01f2\u01f9\5> \2"+
		"\u01f3\u01f9\5@!\2\u01f4\u01f9\5 \21\2\u01f5\u01f9\5v<\2\u01f6\u01f9\5"+
		"\20\t\2\u01f7\u01f9\5\30\r\2\u01f8\u01f1\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8"+
		"\u01f3\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f7\3\2\2\2\u01f99\3\2\2\2\u01fa\u01fb\5N(\2\u01fb\u0200"+
		"\5<\37\2\u01fc\u01fd\7\27\2\2\u01fd\u01ff\5<\37\2\u01fe\u01fc\3\2\2\2"+
		"\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\4\2\2\u0204;\3\2\2\2\u0205"+
		"\u020a\7f\2\2\u0206\u0207\7\36\2\2\u0207\u0209\7\37\2\2\u0208\u0206\3"+
		"\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7!\2\2\u020e\u020f\5H%"+
		"\2\u020f=\3\2\2\2\u0210\u0213\5N(\2\u0211\u0213\7\35\2\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7f\2\2\u0215"+
		"\u021a\5Z.\2\u0216\u0217\7\36\2\2\u0217\u0219\7\37\2\2\u0218\u0216\3\2"+
		"\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021f\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7 \2\2\u021e\u0220\5X-"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\7\4\2\2\u0222?\3\2\2\2\u0223\u0224\5\22\n\2\u0224\u0225\5> \2\u0225A"+
		"\3\2\2\2\u0226\u022b\5D#\2\u0227\u0228\7\27\2\2\u0228\u022a\5D#\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022cC\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0231\5F$\2\u022f\u0230"+
		"\7!\2\2\u0230\u0232\5H%\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"E\3\2\2\2\u0233\u0238\7f\2\2\u0234\u0235\7\36\2\2\u0235\u0237\7\37\2\2"+
		"\u0236\u0234\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239G\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023e\5J&\2\u023c\u023e"+
		"\5\u00b0Y\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023eI\3\2\2\2\u023f"+
		"\u024b\7\32\2\2\u0240\u0245\5H%\2\u0241\u0242\7\27\2\2\u0242\u0244\5H"+
		"%\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\7\27"+
		"\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b"+
		"\u0240\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\33"+
		"\2\2\u024eK\3\2\2\2\u024f\u0250\7f\2\2\u0250M\3\2\2\2\u0251\u0256\5P)"+
		"\2\u0252\u0253\7\36\2\2\u0253\u0255\7\37\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0262\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259\u025e\5R*\2\u025a\u025b\7\36\2\2\u025b"+
		"\u025d\7\37\2\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3"+
		"\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0251\3\2\2\2\u0261\u0259\3\2\2\2\u0262O\3\2\2\2\u0263\u0265\7f\2\2\u0264"+
		"\u0266\5T+\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u026e\3\2\2"+
		"\2\u0267\u0268\7\7\2\2\u0268\u026a\7f\2\2\u0269\u026b\5T+\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u0267\3\2\2\2\u026d"+
		"\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fQ\3\2\2\2"+
		"\u0270\u026e\3\2\2\2\u0271\u0272\t\4\2\2\u0272S\3\2\2\2\u0273\u0274\7"+
		"\26\2\2\u0274\u0279\5V,\2\u0275\u0276\7\27\2\2\u0276\u0278\5V,\2\u0277"+
		"\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7\30\2\2\u027d"+
		"U\3\2\2\2\u027e\u0285\5N(\2\u027f\u0282\7*\2\2\u0280\u0281\t\5\2\2\u0281"+
		"\u0283\5N(\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2"+
		"\2\u0284\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0285W\3\2\2\2\u0286\u028b"+
		"\5f\64\2\u0287\u0288\7\27\2\2\u0288\u028a\5f\64\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028cY\3"+
		"\2\2\2\u028d\u028b\3\2\2\2\u028e\u0290\7,\2\2\u028f\u0291\5\\/\2\u0290"+
		"\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7-"+
		"\2\2\u0293[\3\2\2\2\u0294\u0299\5^\60\2\u0295\u0296\7\27\2\2\u0296\u0298"+
		"\5^\60\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029e\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7\27"+
		"\2\2\u029d\u029f\5`\61\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a2\3\2\2\2\u02a0\u02a2\5`\61\2\u02a1\u0294\3\2\2\2\u02a1\u02a0\3\2"+
		"\2\2\u02a2]\3\2\2\2\u02a3\u02a5\5\16\b\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8"+
		"\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02aa\5N(\2\u02aa\u02ab\5F$\2\u02ab_\3\2\2\2\u02ac"+
		"\u02ae\5\16\b\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3"+
		"\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b3\5N(\2\u02b3\u02b4\7.\2\2\u02b4\u02b5\5F$\2\u02b5a\3\2\2\2\u02b6"+
		"\u02b7\5\u0086D\2\u02b7c\3\2\2\2\u02b8\u02b9\5\u0086D\2\u02b9e\3\2\2\2"+
		"\u02ba\u02bf\7f\2\2\u02bb\u02bc\7\7\2\2\u02bc\u02be\7f\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"g\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\t\6\2\2\u02c3i\3\2\2\2\u02c4"+
		"\u02c5\7\60\2\2\u02c5\u02cc\5l\67\2\u02c6\u02c9\7,\2\2\u02c7\u02ca\5n"+
		"8\2\u02c8\u02ca\5r:\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\7-\2\2\u02cc\u02c6\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cdk\3\2\2\2\u02ce\u02cf\5f\64\2\u02cfm\3\2\2\2\u02d0"+
		"\u02d5\5p9\2\u02d1\u02d2\7\27\2\2\u02d2\u02d4\5p9\2\u02d3\u02d1\3\2\2"+
		"\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6o"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\7f\2\2\u02d9\u02da\7!\2\2\u02da"+
		"\u02db\5r:\2\u02dbq\3\2\2\2\u02dc\u02e0\5\u00b0Y\2\u02dd\u02e0\5j\66\2"+
		"\u02de\u02e0\5t;\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02de"+
		"\3\2\2\2\u02e0s\3\2\2\2\u02e1\u02ea\7\32\2\2\u02e2\u02e7\5r:\2\u02e3\u02e4"+
		"\7\27\2\2\u02e4\u02e6\5r:\2\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7"+
		"\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec"+
		"\u02ee\7\27\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3"+
		"\2\2\2\u02ef\u02f0\7\33\2\2\u02f0u\3\2\2\2\u02f1\u02f2\7\60\2\2\u02f2"+
		"\u02f3\7\34\2\2\u02f3\u02f4\7f\2\2\u02f4\u02f5\5x=\2\u02f5w\3\2\2\2\u02f6"+
		"\u02fa\7\32\2\2\u02f7\u02f9\5z>\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u02fe\7\33\2\2\u02fey\3\2\2\2\u02ff\u0301\5\n\6\2"+
		"\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303"+
		"\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0308\5|?\2\u0306"+
		"\u0308\7\4\2\2\u0307\u0302\3\2\2\2\u0307\u0306\3\2\2\2\u0308{\3\2\2\2"+
		"\u0309\u030a\5N(\2\u030a\u030b\5~@\2\u030b\u030c\7\4\2\2\u030c\u031e\3"+
		"\2\2\2\u030d\u030f\5\20\t\2\u030e\u0310\7\4\2\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u031e\3\2\2\2\u0311\u0313\5 \21\2\u0312\u0314\7\4"+
		"\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u031e\3\2\2\2\u0315"+
		"\u0317\5\30\r\2\u0316\u0318\7\4\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3"+
		"\2\2\2\u0318\u031e\3\2\2\2\u0319\u031b\5v<\2\u031a\u031c\7\4\2\2\u031b"+
		"\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u0309\3\2"+
		"\2\2\u031d\u030d\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0315\3\2\2\2\u031d"+
		"\u0319\3\2\2\2\u031e}\3\2\2\2\u031f\u0322\5\u0080A\2\u0320\u0322\5\u0082"+
		"B\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322\177\3\2\2\2\u0323\u0324"+
		"\7f\2\2\u0324\u0325\7,\2\2\u0325\u0327\7-\2\2\u0326\u0328\5\u0084C\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0081\3\2\2\2\u0329\u032a\5B"+
		"\"\2\u032a\u0083\3\2\2\2\u032b\u032c\7\61\2\2\u032c\u032d\5r:\2\u032d"+
		"\u0085\3\2\2\2\u032e\u0332\7\32\2\2\u032f\u0331\5\u0088E\2\u0330\u032f"+
		"\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\7\33\2\2\u0336\u0087\3"+
		"\2\2\2\u0337\u033b\5\u008aF\2\u0338\u033b\5\u008eH\2\u0339\u033b\5\b\5"+
		"\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033b\u0089"+
		"\3\2\2\2\u033c\u033d\5\u008cG\2\u033d\u033e\7\4\2\2\u033e\u008b\3\2\2"+
		"\2\u033f\u0341\5\16\b\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0345\u0346\5N(\2\u0346\u0347\5B\"\2\u0347\u008d\3\2\2\2\u0348\u03b1"+
		"\5\u0086D\2\u0349\u034a\7\4\2\2\u034a\u034d\5\u00b0Y\2\u034b\u034c\7\62"+
		"\2\2\u034c\u034e\5\u00b0Y\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0350\7\4\2\2\u0350\u03b1\3\2\2\2\u0351\u0352\7\63"+
		"\2\2\u0352\u0353\5\u00a8U\2\u0353\u0356\5\u008eH\2\u0354\u0355\7\64\2"+
		"\2\u0355\u0357\5\u008eH\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u03b1\3\2\2\2\u0358\u0359\7\65\2\2\u0359\u035a\7,\2\2\u035a\u035b\5\u00a0"+
		"Q\2\u035b\u035c\7-\2\2\u035c\u035d\5\u008eH\2\u035d\u03b1\3\2\2\2\u035e"+
		"\u035f\7\66\2\2\u035f\u0360\5\u00a8U\2\u0360\u0361\5\u008eH\2\u0361\u03b1"+
		"\3\2\2\2\u0362\u0363\7\67\2\2\u0363\u0364\5\u008eH\2\u0364\u0365\7\66"+
		"\2\2\u0365\u0366\5\u00a8U\2\u0366\u0367\7\4\2\2\u0367\u03b1\3\2\2\2\u0368"+
		"\u0369\78\2\2\u0369\u0373\5\u0086D\2\u036a\u036c\5\u0090I\2\u036b\u036a"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u0370\3\2\2\2\u036f\u0371\5\u0094K\2\u0370\u036f\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0374\5\u0094K\2\u0373\u036b\3\2\2"+
		"\2\u0373\u0372\3\2\2\2\u0374\u03b1\3\2\2\2\u0375\u0376\78\2\2\u0376\u0377"+
		"\5\u0096L\2\u0377\u037b\5\u0086D\2\u0378\u037a\5\u0090I\2\u0379\u0378"+
		"\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u0380\5\u0094K\2\u037f\u037e"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u03b1\3\2\2\2\u0381\u0382\79\2\2\u0382"+
		"\u0383\5\u00a8U\2\u0383\u0387\7\32\2\2\u0384\u0386\5\u009cO\2\u0385\u0384"+
		"\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u038d\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038c\5\u009eP\2\u038b\u038a"+
		"\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7\33\2\2\u0391\u03b1\3"+
		"\2\2\2\u0392\u0393\7\n\2\2\u0393\u0394\5\u00a8U\2\u0394\u0395\5\u0086"+
		"D\2\u0395\u03b1\3\2\2\2\u0396\u0398\7:\2\2\u0397\u0399\5\u00b0Y\2\u0398"+
		"\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u03b1\7\4"+
		"\2\2\u039b\u039c\7;\2\2\u039c\u039d\5\u00b0Y\2\u039d\u039e\7\4\2\2\u039e"+
		"\u03b1\3\2\2\2\u039f\u03a1\7<\2\2\u03a0\u03a2\7f\2\2\u03a1\u03a0\3\2\2"+
		"\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03b1\7\4\2\2\u03a4\u03a6"+
		"\7=\2\2\u03a5\u03a7\7f\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03b1\7\4\2\2\u03a9\u03b1\7\4\2\2\u03aa\u03ab\5\u00ac"+
		"W\2\u03ab\u03ac\7\4\2\2\u03ac\u03b1\3\2\2\2\u03ad\u03ae\7f\2\2\u03ae\u03af"+
		"\7\62\2\2\u03af\u03b1\5\u008eH\2\u03b0\u0348\3\2\2\2\u03b0\u0349\3\2\2"+
		"\2\u03b0\u0351\3\2\2\2\u03b0\u0358\3\2\2\2\u03b0\u035e\3\2\2\2\u03b0\u0362"+
		"\3\2\2\2\u03b0\u0368\3\2\2\2\u03b0\u0375\3\2\2\2\u03b0\u0381\3\2\2\2\u03b0"+
		"\u0392\3\2\2\2\u03b0\u0396\3\2\2\2\u03b0\u039b\3\2\2\2\u03b0\u039f\3\2"+
		"\2\2\u03b0\u03a4\3\2\2\2\u03b0\u03a9\3\2\2\2\u03b0\u03aa\3\2\2\2\u03b0"+
		"\u03ad\3\2\2\2\u03b1\u008f\3\2\2\2\u03b2\u03b3\7>\2\2\u03b3\u03b7\7,\2"+
		"\2\u03b4\u03b6\5\16\b\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03ba\u03bb\5\u0092J\2\u03bb\u03bc\7f\2\2\u03bc\u03bd\7-\2\2\u03bd"+
		"\u03be\5\u0086D\2\u03be\u0091\3\2\2\2\u03bf\u03c4\5f\64\2\u03c0\u03c1"+
		"\7?\2\2\u03c1\u03c3\5f\64\2\u03c2\u03c0\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u0093\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c7\u03c8\7@\2\2\u03c8\u03c9\5\u0086D\2\u03c9\u0095\3\2\2\2\u03ca"+
		"\u03cb\7,\2\2\u03cb\u03cd\5\u0098M\2\u03cc\u03ce\7\4\2\2\u03cd\u03cc\3"+
		"\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7-\2\2\u03d0"+
		"\u0097\3\2\2\2\u03d1\u03d6\5\u009aN\2\u03d2\u03d3\7\4\2\2\u03d3\u03d5"+
		"\5\u009aN\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2"+
		"\2\u03d6\u03d7\3\2\2\2\u03d7\u0099\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03db"+
		"\5\16\b\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2"+
		"\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0"+
		"\5P)\2\u03e0\u03e1\5F$\2\u03e1\u03e2\7!\2\2\u03e2\u03e3\5\u00b0Y\2\u03e3"+
		"\u009b\3\2\2\2\u03e4\u03e6\5\u009eP\2\u03e5\u03e4\3\2\2\2\u03e6\u03e7"+
		"\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03eb\5\u0088E\2\u03ea\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u009d\3\2\2\2\u03ee\u03ef\7A\2\2\u03ef"+
		"\u03f0\5\u00aeX\2\u03f0\u03f1\7\62\2\2\u03f1\u03f9\3\2\2\2\u03f2\u03f3"+
		"\7A\2\2\u03f3\u03f4\5L\'\2\u03f4\u03f5\7\62\2\2\u03f5\u03f9\3\2\2\2\u03f6"+
		"\u03f7\7\61\2\2\u03f7\u03f9\7\62\2\2\u03f8\u03ee\3\2\2\2\u03f8\u03f2\3"+
		"\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u009f\3\2\2\2\u03fa\u0407\5\u00a4S\2"+
		"\u03fb\u03fd\5\u00a2R\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u0400\7\4\2\2\u03ff\u0401\5\u00b0Y\2\u0400\u03ff"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\7\4\2\2\u0403"+
		"\u0405\5\u00a6T\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407"+
		"\3\2\2\2\u0406\u03fa\3\2\2\2\u0406\u03fc\3\2\2\2\u0407\u00a1\3\2\2\2\u0408"+
		"\u040b\5\u008cG\2\u0409\u040b\5\u00aaV\2\u040a\u0408\3\2\2\2\u040a\u0409"+
		"\3\2\2\2\u040b\u00a3\3\2\2\2\u040c\u040e\5\16\b\2\u040d\u040c\3\2\2\2"+
		"\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412"+
		"\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0413\5N(\2\u0413\u0414\5F$\2\u0414"+
		"\u0415\7\62\2\2\u0415\u0416\5\u00b0Y\2\u0416\u00a5\3\2\2\2\u0417\u0418"+
		"\5\u00aaV\2\u0418\u00a7\3\2\2\2\u0419\u041a\7,\2\2\u041a\u041b\5\u00b0"+
		"Y\2\u041b\u041c\7-\2\2\u041c\u00a9\3\2\2\2\u041d\u0422\5\u00b0Y\2\u041e"+
		"\u041f\7\27\2\2\u041f\u0421\5\u00b0Y\2\u0420\u041e\3\2\2\2\u0421\u0424"+
		"\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u00ab\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0425\u0426\5\u00b0Y\2\u0426\u00ad\3\2\2\2\u0427\u0428"+
		"\5\u00b0Y\2\u0428\u00af\3\2\2\2\u0429\u042a\bY\1\2\u042a\u042b\7,\2\2"+
		"\u042b\u042c\5N(\2\u042c\u042d\7-\2\2\u042d\u042e\5\u00b0Y\23\u042e\u0437"+
		"\3\2\2\2\u042f\u0430\t\7\2\2\u0430\u0437\5\u00b0Y\21\u0431\u0432\t\b\2"+
		"\2\u0432\u0437\5\u00b0Y\20\u0433\u0437\5\u00b2Z\2\u0434\u0435\7C\2\2\u0435"+
		"\u0437\5\u00b4[\2\u0436\u0429\3\2\2\2\u0436\u042f\3\2\2\2\u0436\u0431"+
		"\3\2\2\2\u0436\u0433\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u048d\3\2\2\2\u0438"+
		"\u0439\f\17\2\2\u0439\u043a\t\t\2\2\u043a\u048c\5\u00b0Y\20\u043b\u043c"+
		"\f\16\2\2\u043c\u043d\t\n\2\2\u043d\u048c\5\u00b0Y\17\u043e\u0446\f\r"+
		"\2\2\u043f\u0440\7\26\2\2\u0440\u0447\7\26\2\2\u0441\u0442\7\30\2\2\u0442"+
		"\u0443\7\30\2\2\u0443\u0447\7\30\2\2\u0444\u0445\7\30\2\2\u0445\u0447"+
		"\7\30\2\2\u0446\u043f\3\2\2\2\u0446\u0441\3\2\2\2\u0446\u0444\3\2\2\2"+
		"\u0447\u0448\3\2\2\2\u0448\u048c\5\u00b0Y\16\u0449\u044a\f\f\2\2\u044a"+
		"\u044b\t\13\2\2\u044b\u048c\5\u00b0Y\r\u044c\u044d\f\n\2\2\u044d\u044e"+
		"\t\f\2\2\u044e\u048c\5\u00b0Y\13\u044f\u0450\f\t\2\2\u0450\u0451\7\31"+
		"\2\2\u0451\u048c\5\u00b0Y\n\u0452\u0453\f\b\2\2\u0453\u0454\7Q\2\2\u0454"+
		"\u048c\5\u00b0Y\t\u0455\u0456\f\7\2\2\u0456\u0457\7?\2\2\u0457\u048c\5"+
		"\u00b0Y\b\u0458\u0459\f\6\2\2\u0459\u045a\7R\2\2\u045a\u048c\5\u00b0Y"+
		"\7\u045b\u045c\f\5\2\2\u045c\u045d\7S\2\2\u045d\u048c\5\u00b0Y\6\u045e"+
		"\u045f\f\4\2\2\u045f\u0460\7*\2\2\u0460\u0461\5\u00b0Y\2\u0461\u0462\7"+
		"\62\2\2\u0462\u0463\5\u00b0Y\5\u0463\u048c\3\2\2\2\u0464\u0465\f\3\2\2"+
		"\u0465\u0466\t\r\2\2\u0466\u048c\5\u00b0Y\3\u0467\u0468\f\33\2\2\u0468"+
		"\u0469\7\7\2\2\u0469\u048c\7f\2\2\u046a\u046b\f\32\2\2\u046b\u046c\7\7"+
		"\2\2\u046c\u048c\7B\2\2\u046d\u046e\f\31\2\2\u046e\u046f\7\7\2\2\u046f"+
		"\u0471\7C\2\2\u0470\u0472\5\u00c0a\2\u0471\u0470\3\2\2\2\u0471\u0472\3"+
		"\2\2\2\u0472\u0473\3\2\2\2\u0473\u048c\5\u00b8]\2\u0474\u0475\f\30\2\2"+
		"\u0475\u0476\7\7\2\2\u0476\u0477\7+\2\2\u0477\u048c\5\u00c6d\2\u0478\u0479"+
		"\f\27\2\2\u0479\u047a\7\7\2\2\u047a\u048c\5\u00be`\2\u047b\u047c\f\26"+
		"\2\2\u047c\u047d\7\36\2\2\u047d\u047e\5\u00b0Y\2\u047e\u047f\7\37\2\2"+
		"\u047f\u048c\3\2\2\2\u0480\u0481\f\25\2\2\u0481\u0483\7,\2\2\u0482\u0484"+
		"\5\u00aaV\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2"+
		"\2\u0485\u048c\7-\2\2\u0486\u0487\f\22\2\2\u0487\u048c\t\16\2\2\u0488"+
		"\u0489\f\13\2\2\u0489\u048a\7N\2\2\u048a\u048c\5N(\2\u048b\u0438\3\2\2"+
		"\2\u048b\u043b\3\2\2\2\u048b\u043e\3\2\2\2\u048b\u0449\3\2\2\2\u048b\u044c"+
		"\3\2\2\2\u048b\u044f\3\2\2\2\u048b\u0452\3\2\2\2\u048b\u0455\3\2\2\2\u048b"+
		"\u0458\3\2\2\2\u048b\u045b\3\2\2\2\u048b\u045e\3\2\2\2\u048b\u0464\3\2"+
		"\2\2\u048b\u0467\3\2\2\2\u048b\u046a\3\2\2\2\u048b\u046d\3\2\2\2\u048b"+
		"\u0474\3\2\2\2\u048b\u0478\3\2\2\2\u048b\u047b\3\2\2\2\u048b\u0480\3\2"+
		"\2\2\u048b\u0486\3\2\2\2\u048b\u0488\3\2\2\2\u048c\u048f\3\2\2\2\u048d"+
		"\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u00b1\3\2\2\2\u048f\u048d\3\2"+
		"\2\2\u0490\u0491\7,\2\2\u0491\u0492\5\u00b0Y\2\u0492\u0493\7-\2\2\u0493"+
		"\u04a6\3\2\2\2\u0494\u04a6\7B\2\2\u0495\u04a6\7+\2\2\u0496\u04a6\5h\65"+
		"\2\u0497\u04a6\7f\2\2\u0498\u0499\5N(\2\u0499\u049a\7\7\2\2\u049a\u049b"+
		"\7\23\2\2\u049b\u04a6\3\2\2\2\u049c\u049d\7\35\2\2\u049d\u049e\7\7\2\2"+
		"\u049e\u04a6\7\23\2\2\u049f\u04a3\5\u00c0a\2\u04a0\u04a4\5\u00c8e\2\u04a1"+
		"\u04a2\7B\2\2\u04a2\u04a4\5\u00caf\2\u04a3\u04a0\3\2\2\2\u04a3\u04a1\3"+
		"\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u0490\3\2\2\2\u04a5\u0494\3\2\2\2\u04a5"+
		"\u0495\3\2\2\2\u04a5\u0496\3\2\2\2\u04a5\u0497\3\2\2\2\u04a5\u0498\3\2"+
		"\2\2\u04a5\u049c\3\2\2\2\u04a5\u049f\3\2\2\2\u04a6\u00b3\3\2\2\2\u04a7"+
		"\u04a8\5\u00c0a\2\u04a8\u04a9\5\u00b6\\\2\u04a9\u04aa\5\u00bc_\2\u04aa"+
		"\u04b1\3\2\2\2\u04ab\u04ae\5\u00b6\\\2\u04ac\u04af\5\u00ba^\2\u04ad\u04af"+
		"\5\u00bc_\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3\2\2\2\u04af\u04b1\3\2\2"+
		"\2\u04b0\u04a7\3\2\2\2\u04b0\u04ab\3\2\2\2\u04b1\u00b5\3\2\2\2\u04b2\u04b4"+
		"\7f\2\2\u04b3\u04b5\5\u00c2b\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2"+
		"\u04b5\u04bd\3\2\2\2\u04b6\u04b7\7\7\2\2\u04b7\u04b9\7f\2\2\u04b8\u04ba"+
		"\5\u00c2b\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2\2"+
		"\2\u04bb\u04b6\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be"+
		"\3\2\2\2\u04be\u04c2\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\5R*\2\u04c1"+
		"\u04b2\3\2\2\2\u04c1\u04c0\3\2\2\2\u04c2\u00b7\3\2\2\2\u04c3\u04c5\7f"+
		"\2\2\u04c4\u04c6\5\u00c4c\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c8\5\u00bc_\2\u04c8\u00b9\3\2\2\2\u04c9\u04e5"+
		"\7\36\2\2\u04ca\u04cf\7\37\2\2\u04cb\u04cc\7\36\2\2\u04cc\u04ce\7\37\2"+
		"\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0"+
		"\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04e6\5J&\2\u04d3"+
		"\u04d4\5\u00b0Y\2\u04d4\u04db\7\37\2\2\u04d5\u04d6\7\36\2\2\u04d6\u04d7"+
		"\5\u00b0Y\2\u04d7\u04d8\7\37\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d5\3\2\2"+
		"\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04e2"+
		"\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u04df\7\36\2\2\u04df\u04e1\7\37\2\2"+
		"\u04e0\u04de\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3"+
		"\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04ca\3\2\2\2\u04e5"+
		"\u04d3\3\2\2\2\u04e6\u00bb\3\2\2\2\u04e7\u04e9\5\u00caf\2\u04e8\u04ea"+
		"\5$\23\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u00bd\3\2\2\2\u04eb"+
		"\u04ec\5\u00c0a\2\u04ec\u04ed\5\u00c8e\2\u04ed\u00bf\3\2\2\2\u04ee\u04ef"+
		"\7\26\2\2\u04ef\u04f0\5\"\22\2\u04f0\u04f1\7\30\2\2\u04f1\u00c1\3\2\2"+
		"\2\u04f2\u04f3\7\26\2\2\u04f3\u04f6\7\30\2\2\u04f4\u04f6\5T+\2\u04f5\u04f2"+
		"\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u00c3\3\2\2\2\u04f7\u04f8\7\26\2\2"+
		"\u04f8\u04fb\7\30\2\2\u04f9\u04fb\5\u00c0a\2\u04fa\u04f7\3\2\2\2\u04fa"+
		"\u04f9\3\2\2\2\u04fb\u00c5\3\2\2\2\u04fc\u0503\5\u00caf\2\u04fd\u04fe"+
		"\7\7\2\2\u04fe\u0500\7f\2\2\u04ff\u0501\5\u00caf\2\u0500\u04ff\3\2\2\2"+
		"\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u04fc\3\2\2\2\u0502\u04fd"+
		"\3\2\2\2\u0503\u00c7\3\2\2\2\u0504\u0505\7+\2\2\u0505\u0509\5\u00c6d\2"+
		"\u0506\u0507\7f\2\2\u0507\u0509\5\u00caf\2\u0508\u0504\3\2\2\2\u0508\u0506"+
		"\3\2\2\2\u0509\u00c9\3\2\2\2\u050a\u050c\7,\2\2\u050b\u050d\5\u00aaV\2"+
		"\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f"+
		"\7-\2\2\u050f\u00cb\3\2\2\2\u0510\u0511\7l\2\2\u0511\u0512\5\u00ceh\2"+
		"\u0512\u0513\7m\2\2\u0513\u00cd\3\2\2\2\u0514\u0516\5\u00d8m\2\u0515\u0517"+
		"\5\u00ceh\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0521\3\2\2"+
		"\2\u0518\u051a\5\u00dan\2\u0519\u051b\5\u00ceh\2\u051a\u0519\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u0521\3\2\2\2\u051c\u051e\5\u00d6l\2\u051d\u051f"+
		"\5\u00ceh\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521\3\2\2"+
		"\2\u0520\u0514\3\2\2\2\u0520\u0518\3\2\2\2\u0520\u051c\3\2\2\2\u0521\u00cf"+
		"\3\2\2\2\u0522\u0523\t\17\2\2\u0523\u00d1\3\2\2\2\u0524\u0525\t\20\2\2"+
		"\u0525\u00d3\3\2\2\2\u0526\u0527\7r\2\2\u0527\u0528\7\u0080\2\2\u0528"+
		"\u0529\5\u00d6l\2\u0529\u00d5\3\2\2\2\u052a\u052b\7n\2\2\u052b\u0532\7"+
		"r\2\2\u052c\u052d\7v\2\2\u052d\u052e\5\u00d0i\2\u052e\u052f\7r\2\2\u052f"+
		"\u0530\7w\2\2\u0530\u0533\3\2\2\2\u0531\u0533\5\u00d2j\2\u0532\u052c\3"+
		"\2\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0535\7o\2\2\u0535\u0537\7\7\2\2\u0536\u0538\t\21\2\2\u0537\u0536\3\2"+
		"\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\7s\2\2\u053a"+
		"\u00d7\3\2\2\2\u053b\u053c\7z\2\2\u053c\u053d\7r\2\2\u053d\u053e\7s\2"+
		"\2\u053e\u00d9\3\2\2\2\u053f\u0540\7{\2\2\u0540\u0541\5\u00d4k\2\u0541"+
		"\u0542\7s\2\2\u0542\u00db\3\2\2\2\u009d\u00dd\u00e2\u00e8\u00f0\u00f9"+
		"\u00fe\u0105\u010c\u0113\u011a\u011f\u0123\u0127\u012b\u0130\u0134\u0138"+
		"\u0142\u014a\u0151\u0158\u015c\u015f\u0162\u016b\u0171\u0176\u0179\u017f"+
		"\u0185\u0189\u0192\u0199\u01a2\u01a9\u01af\u01b3\u01be\u01c2\u01ca\u01cf"+
		"\u01d3\u01dc\u01ea\u01ef\u01f8\u0200\u020a\u0212\u021a\u021f\u022b\u0231"+
		"\u0238\u023d\u0245\u0249\u024b\u0256\u025e\u0261\u0265\u026a\u026e\u0279"+
		"\u0282\u0284\u028b\u0290\u0299\u029e\u02a1\u02a6\u02af\u02bf\u02c9\u02cc"+
		"\u02d5\u02df\u02e7\u02ea\u02ed\u02fa\u0302\u0307\u030f\u0313\u0317\u031b"+
		"\u031d\u0321\u0327\u0332\u033a\u0342\u034d\u0356\u036d\u0370\u0373\u037b"+
		"\u037f\u0387\u038d\u0398\u03a1\u03a6\u03b0\u03b7\u03c4\u03cd\u03d6\u03dc"+
		"\u03e7\u03ec\u03f8\u03fc\u0400\u0404\u0406\u040a\u040f\u0422\u0436\u0446"+
		"\u0471\u0483\u048b\u048d\u04a3\u04a5\u04ae\u04b0\u04b4\u04b9\u04bd\u04c1"+
		"\u04c5\u04cf\u04db\u04e2\u04e5\u04e9\u04f5\u04fa\u0500\u0502\u0508\u050c"+
		"\u0516\u051a\u051e\u0520\u0532\u0537";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}