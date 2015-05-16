// Generated from JjQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JjQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, LETTER=2, DIGIT=3, NUMBER=4, VAR=5, STRING=6, END=7, OPENP=8, 
		CLOSEP=9, OPENB=10, CLOSEB=11, IN=12, OUT=13, QUOTES=14, CONTAINS_SUB_STRING=15, 
		CONTAINS_WORD=16, CONTAINS_PREFIX=17, EQUALS=18, NOT_EQUALS=19, STARTS_WITH=20, 
		ENDS_WITH=21, BASIC_FILTER=22, CONTENT_FILTER=23, HIERARCHY_SELECTOR=24, 
		CHILD_FILTER=25, OPERATION=26, WS=27, JQBEGIN=28, JQEND=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'$'", "LETTER", "DIGIT", "NUMBER", "VAR", "STRING", "';'", 
		"'('", "')'", "'['", "']'", "'in'", "'out'", "'\"'", "'*='", "'~='", "'|='", 
		"'='", "'!='", "'^='", "'$='", "BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", 
		"CHILD_FILTER", "OPERATION", "WS", "'/*JQ'", "'*/'"
	};
	public static final int
		RULE_main = 0, RULE_jqBlock = 1, RULE_ops = 2, RULE_filter = 3, RULE_assign_selection = 4, 
		RULE_selector = 5, RULE_input = 6, RULE_output = 7;
	public static final String[] ruleNames = {
		"main", "jqBlock", "ops", "filter", "assign_selection", "selector", "input", 
		"output"
	};

	@Override
	public String getGrammarFileName() { return "JjQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JjQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public JqBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterJqBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitJqBlock(this);
		}
	}

	public final JqBlockContext jqBlock() throws RecognitionException {
		JqBlockContext _localctx = new JqBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jqBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQUALS() { return getToken(JjQueryParser.EQUALS, 0); }
		public TerminalNode CONTAINS_WORD(int i) {
			return getToken(JjQueryParser.CONTAINS_WORD, i);
		}
		public TerminalNode CONTAINS_SUB_STRING() { return getToken(JjQueryParser.CONTAINS_SUB_STRING, 0); }
		public TerminalNode ENDS_WITH() { return getToken(JjQueryParser.ENDS_WITH, 0); }
		public List<TerminalNode> CONTAINS_WORD() { return getTokens(JjQueryParser.CONTAINS_WORD); }
		public TerminalNode NOT_EQUALS() { return getToken(JjQueryParser.NOT_EQUALS, 0); }
		public TerminalNode CONTAINS_PREFIX() { return getToken(JjQueryParser.CONTAINS_PREFIX, 0); }
		public TerminalNode STARTS_WITH() { return getToken(JjQueryParser.STARTS_WITH, 0); }
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
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
		public TerminalNode BASIC_FILTER() { return getToken(JjQueryParser.BASIC_FILTER, 0); }
		public TerminalNode CONTENT_FILTER() { return getToken(JjQueryParser.CONTENT_FILTER, 0); }
		public TerminalNode HIERARCHY_SELECTOR() { return getToken(JjQueryParser.HIERARCHY_SELECTOR, 0); }
		public TerminalNode CHILD_FILTER() { return getToken(JjQueryParser.CHILD_FILTER, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
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
		public TerminalNode EQUALS() { return getToken(JjQueryParser.EQUALS, 0); }
		public TerminalNode VAR() { return getToken(JjQueryParser.VAR, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Assign_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterAssign_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitAssign_selection(this);
		}
	}

	public final Assign_selectionContext assign_selection() throws RecognitionException {
		Assign_selectionContext _localctx = new Assign_selectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(VAR);
			setState(25); match(EQUALS);
			setState(26); selector();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPENB() { return getToken(JjQueryParser.OPENB, 0); }
		public TerminalNode CLOSEP() { return getToken(JjQueryParser.CLOSEP, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode OPERATION() { return getToken(JjQueryParser.OPERATION, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JjQueryParser.VAR, 0); }
		public TerminalNode OPENP() { return getToken(JjQueryParser.OPENP, 0); }
		public TerminalNode DOLLAR() { return getToken(JjQueryParser.DOLLAR, 0); }
		public TerminalNode CLOSEB() { return getToken(JjQueryParser.CLOSEB, 0); }
		public TerminalNode STRING() { return getToken(JjQueryParser.STRING, 0); }
		public TerminalNode END() { return getToken(JjQueryParser.END, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(DOLLAR);
			setState(29); match(OPENP);
			setState(30); match(VAR);
			setState(37);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(31); match(OPENB);
				setState(32); ops();
				setState(33); match(STRING);
				setState(34); match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(36); filter();
				}
				break;
			case CLOSEP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(39); match(CLOSEP);
			setState(41);
			_la = _input.LA(1);
			if (_la==OPERATION) {
				{
				setState(40); match(OPERATION);
				}
			}

			setState(43); match(END);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IN() { return getToken(JjQueryParser.IN, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(IN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OUT() { return getToken(JjQueryParser.OUT, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(OUT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"(\n\7\3\7\3\7\5\7,\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\4\3\2\21\27\3\2\30\33.\2\22\3\2\2\2\4\24\3\2\2\2\6\26\3\2\2\2\b"+
		"\30\3\2\2\2\n\32\3\2\2\2\f\36\3\2\2\2\16/\3\2\2\2\20\61\3\2\2\2\22\23"+
		"\3\2\2\2\23\3\3\2\2\2\24\25\3\2\2\2\25\5\3\2\2\2\26\27\t\2\2\2\27\7\3"+
		"\2\2\2\30\31\t\3\2\2\31\t\3\2\2\2\32\33\7\7\2\2\33\34\7\24\2\2\34\35\5"+
		"\f\7\2\35\13\3\2\2\2\36\37\7\3\2\2\37 \7\n\2\2 \'\7\7\2\2!\"\7\f\2\2\""+
		"#\5\6\4\2#$\7\b\2\2$%\7\r\2\2%(\3\2\2\2&(\5\b\5\2\'!\3\2\2\2\'&\3\2\2"+
		"\2\'(\3\2\2\2()\3\2\2\2)+\7\13\2\2*,\7\34\2\2+*\3\2\2\2+,\3\2\2\2,-\3"+
		"\2\2\2-.\7\t\2\2.\r\3\2\2\2/\60\7\16\2\2\60\17\3\2\2\2\61\62\7\17\2\2"+
		"\62\21\3\2\2\2\4\'+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}