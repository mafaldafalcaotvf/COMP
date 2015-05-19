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
public class jQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, STARTS_WITH=20, OPENB=10, LETTER=2, NUMBER=4, ENDS_WITH=21, 
		JQEND=30, EQUALS=18, QUOTES=14, NOT_EQUALS=19, CONTAINS_SUB_STRING=15, 
		BASIC_FILTER=22, JQBEGIN=29, WS=27, CHILD_FILTER=25, IN=12, CONTAINS_WORD=16, 
		CLOSEP=9, OUT=13, HIERARCHY_SELECTOR=24, CONTENT_FILTER=23, BLOCKCOMMENT=28, 
		CLOSEB=11, VAR=5, DIGIT=3, OPERATION=26, END=7, CONTAINS_PREFIX=17, OPENP=8, 
		STRING=6, JAVA=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'$'", "LETTER", "DIGIT", "NUMBER", "VAR", "STRING", "';'", 
		"'('", "')'", "'['", "']'", "'in'", "'out'", "'\"'", "'*='", "'~='", "'|='", 
		"'='", "'!='", "'^='", "'$='", "BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", 
		"CHILD_FILTER", "OPERATION", "WS", "BLOCKCOMMENT", "'/*JQ'", "'*/'", "JAVA"
	};
	public static final int
		RULE_main = 0, RULE_jqBlock = 1, RULE_ops = 2, RULE_filter = 3, RULE_assign_selection = 4, 
		RULE_selector = 5, RULE_input = 6, RULE_output = 7;
	public static final String[] ruleNames = {
		"main", "jqBlock", "ops", "filter", "assign_selection", "selector", "input", 
		"output"
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

	public jQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jQueryParser.EOF, 0); }
		public List<JqBlockContext> jqBlock() {
			return getRuleContexts(JqBlockContext.class);
		}
		public List<TerminalNode> JAVA() { return getTokens(jQueryParser.JAVA); }
		public JqBlockContext jqBlock(int i) {
			return getRuleContext(JqBlockContext.class,i);
		}
		public TerminalNode JAVA(int i) {
			return getToken(jQueryParser.JAVA, i);
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
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(18);
				switch (_input.LA(1)) {
				case JAVA:
					{
					setState(16); match(JAVA);
					}
					break;
				case JQBEGIN:
					{
					setState(17); jqBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==JQBEGIN || _la==JAVA );
			setState(22); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode JQEND() { return getToken(jQueryParser.JQEND, 0); }
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public TerminalNode JQBEGIN() { return getToken(jQueryParser.JQBEGIN, 0); }
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
			setState(24); match(JQBEGIN);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OUT) {
				{
				setState(27);
				switch (_input.LA(1)) {
				case IN:
					{
					setState(25); input();
					}
					break;
				case OUT:
					{
					setState(26); output();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(JQEND);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQUALS() { return getToken(jQueryParser.EQUALS, 0); }
		public TerminalNode CONTAINS_WORD(int i) {
			return getToken(jQueryParser.CONTAINS_WORD, i);
		}
		public TerminalNode CONTAINS_SUB_STRING() { return getToken(jQueryParser.CONTAINS_SUB_STRING, 0); }
		public TerminalNode ENDS_WITH() { return getToken(jQueryParser.ENDS_WITH, 0); }
		public List<TerminalNode> CONTAINS_WORD() { return getTokens(jQueryParser.CONTAINS_WORD); }
		public TerminalNode NOT_EQUALS() { return getToken(jQueryParser.NOT_EQUALS, 0); }
		public TerminalNode CONTAINS_PREFIX() { return getToken(jQueryParser.CONTAINS_PREFIX, 0); }
		public TerminalNode STARTS_WITH() { return getToken(jQueryParser.STARTS_WITH, 0); }
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
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINS_SUB_STRING) | (1L << CONTAINS_WORD) | (1L << CONTAINS_PREFIX) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << STARTS_WITH) | (1L << ENDS_WITH))) != 0)) ) {
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
		public TerminalNode BASIC_FILTER() { return getToken(jQueryParser.BASIC_FILTER, 0); }
		public TerminalNode CONTENT_FILTER() { return getToken(jQueryParser.CONTENT_FILTER, 0); }
		public TerminalNode HIERARCHY_SELECTOR() { return getToken(jQueryParser.HIERARCHY_SELECTOR, 0); }
		public TerminalNode CHILD_FILTER() { return getToken(jQueryParser.CHILD_FILTER, 0); }
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
			setState(36);
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

	public static class Assign_selectionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(jQueryParser.EQUALS, 0); }
		public TerminalNode VAR() { return getToken(jQueryParser.VAR, 0); }
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
		enterRule(_localctx, 8, RULE_assign_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(VAR);
			setState(39); match(EQUALS);
			setState(40); selector();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPENB() { return getToken(jQueryParser.OPENB, 0); }
		public TerminalNode CLOSEP() { return getToken(jQueryParser.CLOSEP, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode OPERATION() { return getToken(jQueryParser.OPERATION, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(jQueryParser.VAR, 0); }
		public TerminalNode OPENP() { return getToken(jQueryParser.OPENP, 0); }
		public TerminalNode DOLLAR() { return getToken(jQueryParser.DOLLAR, 0); }
		public TerminalNode CLOSEB() { return getToken(jQueryParser.CLOSEB, 0); }
		public TerminalNode STRING() { return getToken(jQueryParser.STRING, 0); }
		public TerminalNode END() { return getToken(jQueryParser.END, 0); }
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
		enterRule(_localctx, 10, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(DOLLAR);
			setState(43); match(OPENP);
			setState(44); match(VAR);
			setState(51);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(45); match(OPENB);
				setState(46); ops();
				setState(47); match(STRING);
				setState(48); match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(50); filter();
				}
				break;
			case CLOSEP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53); match(CLOSEP);
			setState(55);
			_la = _input.LA(1);
			if (_la==OPERATION) {
				{
				setState(54); match(OPERATION);
				}
			}

			setState(57); match(END);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IN() { return getToken(jQueryParser.IN, 0); }
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
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(IN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OUT() { return getToken(jQueryParser.OUT, 0); }
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
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(OUT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!B\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2\r"+
		"\2\16\2\26\3\2\3\2\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\66"+
		"\n\7\3\7\3\7\5\7:\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\4\3\2\21\27\3\2\30\33@\2\24\3\2\2\2\4\32\3\2\2\2\6$\3\2\2\2\b&\3"+
		"\2\2\2\n(\3\2\2\2\f,\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22\25\7!\2\2\23\25"+
		"\5\4\3\2\24\22\3\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\30\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\37\7\37\2\2\33\36"+
		"\5\16\b\2\34\36\5\20\t\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7 \2\2#\5\3\2\2\2$%\t\2"+
		"\2\2%\7\3\2\2\2&\'\t\3\2\2\'\t\3\2\2\2()\7\7\2\2)*\7\24\2\2*+\5\f\7\2"+
		"+\13\3\2\2\2,-\7\3\2\2-.\7\n\2\2.\65\7\7\2\2/\60\7\f\2\2\60\61\5\6\4\2"+
		"\61\62\7\b\2\2\62\63\7\r\2\2\63\66\3\2\2\2\64\66\5\b\5\2\65/\3\2\2\2\65"+
		"\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7\13\2\28:\7\34\2\298\3\2"+
		"\2\29:\3\2\2\2:;\3\2\2\2;<\7\t\2\2<\r\3\2\2\2=>\7\16\2\2>\17\3\2\2\2?"+
		"@\7\17\2\2@\21\3\2\2\2\b\24\26\35\37\659";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}