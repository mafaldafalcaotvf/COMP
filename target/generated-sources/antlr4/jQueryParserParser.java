// Generated from jQueryParser.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STARTS_WITH=25, DOLLAR=4, OPENC=15, OPENB=13, LETTER=5, JAVA=1, 
		ENDS_WITH=26, NUMBER=7, JQEND=3, EQUALS=23, QUOTES=19, EVENT=31, NOT_EQUALS=24, 
		CONTAINS_SUB_STRING=20, BASIC_FILTER=27, VARTYPE=33, JQBEGIN=2, WS=35, 
		CHILD_FILTER=30, IN=17, CONTAINS_WORD=21, CLOSEP=12, OUT=18, HIERARCHY_SELECTOR=29, 
		CONTENT_FILTER=28, BLOCKCOMMENT=36, VAR=8, CLOSEB=14, CLOSEC=16, DIGIT=6, 
		OPERATION=34, END=10, CONTAINS_PREFIX=22, OPENP=11, ADDFUNCS=32, STRING=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "'/*@JQ'", "'@JQ*/'", "'$'", "LETTER", "DIGIT", "NUMBER", 
		"VAR", "STRING", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'in'", 
		"'out'", "'\"'", "'*='", "'~='", "'|='", "'='", "'!='", "'^='", "'$='", 
		"BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", "CHILD_FILTER", 
		"EVENT", "ADDFUNCS", "VARTYPE", "OPERATION", "WS", "BLOCKCOMMENT"
	};
	public static final int
		RULE_main = 0, RULE_jqBlock = 1, RULE_ops = 2, RULE_filter = 3, RULE_variable = 4, 
		RULE_assign_selection = 5, RULE_selector = 6, RULE_input = 7, RULE_output = 8;
	public static final String[] ruleNames = {
		"main", "jqBlock", "ops", "filter", "variable", "assign_selection", "selector", 
		"input", "output"
	};

	@Override
	public String getGrammarFileName() { return "jQueryParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jQueryParserParser.EOF, 0); }
		public List<JqBlockContext> jqBlock() {
			return getRuleContexts(JqBlockContext.class);
		}
		public List<TerminalNode> JAVA() { return getTokens(jQueryParserParser.JAVA); }
		public JqBlockContext jqBlock(int i) {
			return getRuleContext(JqBlockContext.class,i);
		}
		public TerminalNode JAVA(int i) {
			return getToken(jQueryParserParser.JAVA, i);
		}
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
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(18); match(T__0);
					}
					break;
				case JQBEGIN:
					{
					setState(19); jqBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==JQBEGIN );
			setState(24); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JqBlockContext extends ParserRuleContext {
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public TerminalNode JQEND() { return getToken(jQueryParserParser.JQEND, 0); }
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public TerminalNode JQBEGIN() { return getToken(jQueryParserParser.JQBEGIN, 0); }
		public JqBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).enterJqBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jQueryParserListener ) ((jQueryParserListener)listener).exitJqBlock(this);
		}
	}

	public final JqBlockContext jqBlock() throws RecognitionException {
		JqBlockContext _localctx = new JqBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jqBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(JQBEGIN);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OUT) {
				{
				setState(29);
				switch (_input.LA(1)) {
				case IN:
					{
					setState(27); input();
					}
					break;
				case OUT:
					{
					setState(28); output();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(JQEND);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EVENT() { return getToken(jQueryParserParser.EVENT, 0); }
		public TerminalNode EQUALS() { return getToken(jQueryParserParser.EQUALS, 0); }
		public TerminalNode CONTAINS_WORD(int i) {
			return getToken(jQueryParserParser.CONTAINS_WORD, i);
		}
		public TerminalNode CONTAINS_SUB_STRING() { return getToken(jQueryParserParser.CONTAINS_SUB_STRING, 0); }
		public TerminalNode ENDS_WITH() { return getToken(jQueryParserParser.ENDS_WITH, 0); }
		public List<TerminalNode> CONTAINS_WORD() { return getTokens(jQueryParserParser.CONTAINS_WORD); }
		public TerminalNode NOT_EQUALS() { return getToken(jQueryParserParser.NOT_EQUALS, 0); }
		public TerminalNode CONTAINS_PREFIX() { return getToken(jQueryParserParser.CONTAINS_PREFIX, 0); }
		public TerminalNode ADDFUNCS() { return getToken(jQueryParserParser.ADDFUNCS, 0); }
		public TerminalNode STARTS_WITH() { return getToken(jQueryParserParser.STARTS_WITH, 0); }
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
		enterRule(_localctx, 4, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINS_SUB_STRING) | (1L << CONTAINS_WORD) | (1L << CONTAINS_PREFIX) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << STARTS_WITH) | (1L << ENDS_WITH) | (1L << EVENT) | (1L << ADDFUNCS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CONTENT_FILTER() { return getToken(jQueryParserParser.CONTENT_FILTER, 0); }
		public TerminalNode HIERARCHY_SELECTOR() { return getToken(jQueryParserParser.HIERARCHY_SELECTOR, 0); }
		public TerminalNode CHILD_FILTER() { return getToken(jQueryParserParser.CHILD_FILTER, 0); }
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
		enterRule(_localctx, 6, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASIC_FILTER) | (1L << CONTENT_FILTER) | (1L << HIERARCHY_SELECTOR) | (1L << CHILD_FILTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VARTYPE() { return getToken(jQueryParserParser.VARTYPE, 0); }
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
		enterRule(_localctx, 8, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if (_la==VARTYPE) {
				{
				setState(40); match(VARTYPE);
				}
			}

			setState(43); match(VAR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQUALS() { return getToken(jQueryParserParser.EQUALS, 0); }
		public TerminalNode VAR() { return getToken(jQueryParserParser.VAR, 0); }
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
		enterRule(_localctx, 10, RULE_assign_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(VAR);
			setState(46); match(EQUALS);
			setState(47); selector();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPERATION() { return getToken(jQueryParserParser.OPERATION, 0); }
		public TerminalNode OPENP() { return getToken(jQueryParserParser.OPENP, 0); }
		public TerminalNode DOLLAR() { return getToken(jQueryParserParser.DOLLAR, 0); }
		public TerminalNode OPENB() { return getToken(jQueryParserParser.OPENB, 0); }
		public TerminalNode CLOSEP() { return getToken(jQueryParserParser.CLOSEP, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode EVENT() { return getToken(jQueryParserParser.EVENT, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(jQueryParserParser.VAR, 0); }
		public TerminalNode ADDFUNCS() { return getToken(jQueryParserParser.ADDFUNCS, 0); }
		public TerminalNode STRING() { return getToken(jQueryParserParser.STRING, 0); }
		public TerminalNode CLOSEB() { return getToken(jQueryParserParser.CLOSEB, 0); }
		public TerminalNode END() { return getToken(jQueryParserParser.END, 0); }
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
		enterRule(_localctx, 12, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(DOLLAR);
			setState(50); match(OPENP);
			setState(51); match(VAR);
			setState(58);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(52); match(OPENB);
				setState(53); ops();
				setState(54); match(STRING);
				setState(55); match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(57); filter();
				}
				break;
			case CLOSEP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60); match(CLOSEP);
			setState(61); match(T__0);
			setState(63);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EVENT) | (1L << ADDFUNCS) | (1L << OPERATION))) != 0)) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EVENT) | (1L << ADDFUNCS) | (1L << OPERATION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(65); match(END);
			}
		}
		catch (RecognitionException re) {
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
		public Assign_selectionContext assign_selection() {
			return getRuleContext(Assign_selectionContext.class,0);
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
		enterRule(_localctx, 14, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(IN);
			setState(68); assign_selection();
			}
		}
		catch (RecognitionException re) {
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
		public Assign_selectionContext assign_selection() {
			return getRuleContext(Assign_selectionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(jQueryParserParser.OUT, 0); }
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
		enterRule(_localctx, 16, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(OUT);
			setState(71); assign_selection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&L\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\6\2\27"+
		"\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\5\6,\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b=\n\b\3\b\3\b\3\b\5\bB\n\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\4\2\26\34!\"\3\2\35 \4"+
		"\2!\"$$J\2\26\3\2\2\2\4\34\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n+\3\2\2\2\f"+
		"/\3\2\2\2\16\63\3\2\2\2\20E\3\2\2\2\22H\3\2\2\2\24\27\7\3\2\2\25\27\5"+
		"\4\3\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\32\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34!\7\4\2\2\35 \5\20\t"+
		"\2\36 \5\22\n\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\5\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2"+
		"\2()\t\3\2\2)\t\3\2\2\2*,\7#\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\n\2"+
		"\2.\13\3\2\2\2/\60\7\n\2\2\60\61\7\31\2\2\61\62\5\16\b\2\62\r\3\2\2\2"+
		"\63\64\7\6\2\2\64\65\7\r\2\2\65<\7\n\2\2\66\67\7\17\2\2\678\5\6\4\289"+
		"\7\13\2\29:\7\20\2\2:=\3\2\2\2;=\5\b\5\2<\66\3\2\2\2<;\3\2\2\2<=\3\2\2"+
		"\2=>\3\2\2\2>?\7\16\2\2?A\7\3\2\2@B\t\4\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2"+
		"\2\2CD\7\f\2\2D\17\3\2\2\2EF\7\23\2\2FG\5\f\7\2G\21\3\2\2\2HI\7\24\2\2"+
		"IJ\5\f\7\2J\23\3\2\2\2\t\26\30\37!+<A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}