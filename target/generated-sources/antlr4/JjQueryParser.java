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
		JQBEGIN=1, JAVA=2, DOLLAR=3, LETTER=4, DIGIT=5, NUMBER=6, VAR=7, STRING=8, 
		END=9, OPENP=10, CLOSEP=11, OPENB=12, CLOSEB=13, IN=14, OUT=15, QUOTES=16, 
		CONTAINS_SUB_STRING=17, CONTAINS_WORD=18, CONTAINS_PREFIX=19, EQUALS=20, 
		NOT_EQUALS=21, STARTS_WITH=22, ENDS_WITH=23, BASIC_FILTER=24, CONTENT_FILTER=25, 
		HIERARCHY_SELECTOR=26, CHILD_FILTER=27, OPERATION=28, WS=29, BlockComment=30, 
		JQEND=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'/*@jQ'", "'.'", "'$'", "LETTER", "DIGIT", "NUMBER", "VAR", 
		"STRING", "';'", "'('", "')'", "'['", "']'", "'in'", "'out'", "'\"'", 
		"'*='", "'~='", "'|='", "'='", "'!='", "'^='", "'$='", "BASIC_FILTER", 
		"CONTENT_FILTER", "HIERARCHY_SELECTOR", "CHILD_FILTER", "OPERATION", "WS", 
		"BlockComment", "'*/'"
	};
	public static final int
		RULE_main = 0, RULE_jqBlock = 1, RULE_ops = 2, RULE_filter = 3, RULE_assign_selection = 4, 
		RULE_selector = 5, RULE_in_out = 6, RULE_input = 7, RULE_output = 8;
	public static final String[] ruleNames = {
		"main", "jqBlock", "ops", "filter", "assign_selection", "selector", "in_out", 
		"input", "output"
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
		public TerminalNode EOF() { return getToken(JjQueryParser.EOF, 0); }
		public List<JqBlockContext> jqBlock() {
			return getRuleContexts(JqBlockContext.class);
		}
		public List<TerminalNode> JAVA() { return getTokens(JjQueryParser.JAVA); }
		public JqBlockContext jqBlock(int i) {
			return getRuleContext(JqBlockContext.class,i);
		}
		public TerminalNode JAVA(int i) {
			return getToken(JjQueryParser.JAVA, i);
		}
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
				case JAVA:
					{
					setState(18); match(JAVA);
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
			} while ( _la==JQBEGIN || _la==JAVA );
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
		public TerminalNode JQEND() { return getToken(JjQueryParser.JQEND, 0); }
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public TerminalNode JQBEGIN() { return getToken(JjQueryParser.JQBEGIN, 0); }
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
			setState(36);
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
			setState(40); match(VAR);
			setState(41); match(EQUALS);
			setState(42); selector();
			}
		}
		catch (RecognitionException re) {
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
			setState(44); match(DOLLAR);
			setState(45); match(OPENP);
			setState(46); match(VAR);
			setState(53);
			switch (_input.LA(1)) {
			case OPENB:
				{
				setState(47); match(OPENB);
				setState(48); ops();
				setState(49); match(STRING);
				setState(50); match(CLOSEB);
				}
				break;
			case BASIC_FILTER:
			case CONTENT_FILTER:
			case HIERARCHY_SELECTOR:
			case CHILD_FILTER:
				{
				setState(52); filter();
				}
				break;
			case CLOSEP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55); match(CLOSEP);
			setState(57);
			_la = _input.LA(1);
			if (_la==OPERATION) {
				{
				setState(56); match(OPERATION);
				}
			}

			setState(59); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_outContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JjQueryParser.IN, 0); }
		public TerminalNode OUT() { return getToken(JjQueryParser.OUT, 0); }
		public In_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).enterIn_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjQueryListener ) ((JjQueryListener)listener).exitIn_out(this);
		}
	}

	public final In_outContext in_out() throws RecognitionException {
		In_outContext _localctx = new In_outContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_in_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JjQueryParser.IN, 0); }
		public TerminalNode STRING() { return getToken(JjQueryParser.STRING, 0); }
		public TerminalNode END() { return getToken(JjQueryParser.END, 0); }
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
		enterRule(_localctx, 14, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(IN);
			setState(64); match(STRING);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(JjQueryParser.OUT, 0); }
		public TerminalNode STRING() { return getToken(JjQueryParser.STRING, 0); }
		public TerminalNode END() { return getToken(JjQueryParser.END, 0); }
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
		enterRule(_localctx, 16, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(OUT);
			setState(68); match(STRING);
			setState(69); match(END);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!J\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\6\2\27"+
		"\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"8\n\7\3\7\3\7\5\7<\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\23\31\3\2\32\35\3\2\20\21G\2"+
		"\26\3\2\2\2\4\34\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f.\3\2\2\2\16"+
		"?\3\2\2\2\20A\3\2\2\2\22E\3\2\2\2\24\27\7\4\2\2\25\27\5\4\3\2\26\24\3"+
		"\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3"+
		"\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34!\7\3\2\2\35 \5\20\t\2\36 \5\22\n"+
		"\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2"+
		"\2\2#!\3\2\2\2$%\7!\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\t\3\2\2)\t"+
		"\3\2\2\2*+\7\t\2\2+,\7\26\2\2,-\5\f\7\2-\13\3\2\2\2./\7\5\2\2/\60\7\f"+
		"\2\2\60\67\7\t\2\2\61\62\7\16\2\2\62\63\5\6\4\2\63\64\7\n\2\2\64\65\7"+
		"\17\2\2\658\3\2\2\2\668\5\b\5\2\67\61\3\2\2\2\67\66\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29;\7\r\2\2:<\7\36\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\13"+
		"\2\2>\r\3\2\2\2?@\t\4\2\2@\17\3\2\2\2AB\7\20\2\2BC\7\n\2\2CD\7\13\2\2"+
		"D\21\3\2\2\2EF\7\21\2\2FG\7\n\2\2GH\7\13\2\2H\23\3\2\2\2\b\26\30\37!\67"+
		";";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}