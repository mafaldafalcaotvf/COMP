// Generated from jQueryLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JAVA=1, JQBEGIN=2, JQEND=3, DOLLAR=4, LETTER=5, DIGIT=6, NUMBER=7, VAR=8, 
		STRING=9, END=10, OPENP=11, CLOSEP=12, OPENB=13, CLOSEB=14, IN=15, OUT=16, 
		QUOTES=17, CONTAINS_SUB_STRING=18, CONTAINS_WORD=19, CONTAINS_PREFIX=20, 
		EQUALS=21, NOT_EQUALS=22, STARTS_WITH=23, ENDS_WITH=24, BASIC_FILTER=25, 
		CONTENT_FILTER=26, HIERARCHY_SELECTOR=27, CHILD_FILTER=28, OPERATION=29, 
		WS=30, BLOCKCOMMENT=31;
	public static final int JQ = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "JQ"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"JAVA", "JQBEGIN", "JQEND", "DOLLAR", "LETTER", "DIGIT", "NUMBER", "VAR", 
		"STRING", "END", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "IN", "OUT", "QUOTES", 
		"CONTAINS_SUB_STRING", "CONTAINS_WORD", "CONTAINS_PREFIX", "EQUALS", "NOT_EQUALS", 
		"STARTS_WITH", "ENDS_WITH", "BASIC_FILTER", "CONTENT_FILTER", "HIERARCHY_SELECTOR", 
		"CHILD_FILTER", "OPERATION", "WS", "BLOCKCOMMENT"
	};


	public jQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jQueryLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0144\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b\\\n\b\r\b\16\b]\3\t\3\t\3\t\7\tc"+
		"\n\t\f\t\16\tf\13\t\3\n\3\n\6\nj\n\n\r\n\16\nk\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00c2\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00e6\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u012d\n\35\3\36\3\36\3\36\3\37\6\37"+
		"\u0133\n\37\r\37\16\37\u0134\3\37\3\37\3 \3 \3 \3 \7 \u013d\n \f \16 "+
		"\u0140\13 \3 \3 \3 \3\u013e\2!\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13"+
		"\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62"+
		"\32\64\33\66\348\35:\36<\37> @!\4\2\3\6\6\2\"\"..C\\c|\3\2\62;\4\2@@\u0080"+
		"\u0080\5\2\13\f\17\17\"\"\u0156\2\4\3\2\2\2\2\6\3\2\2\2\3\b\3\2\2\2\3"+
		"\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2"+
		"\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2"+
		"\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3"+
		",\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2"+
		"\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\4B\3\2\2\2\6"+
		"D\3\2\2\2\bL\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20[\3\2\2\2\22"+
		"_\3\2\2\2\24i\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32q\3\2\2\2\34s\3\2\2\2"+
		"\36u\3\2\2\2 w\3\2\2\2\"z\3\2\2\2$~\3\2\2\2&\u0080\3\2\2\2(\u0083\3\2"+
		"\2\2*\u0086\3\2\2\2,\u0089\3\2\2\2.\u008b\3\2\2\2\60\u008e\3\2\2\2\62"+
		"\u0091\3\2\2\2\64\u00c1\3\2\2\2\66\u00e5\3\2\2\28\u00e7\3\2\2\2:\u012c"+
		"\3\2\2\2<\u012e\3\2\2\2>\u0132\3\2\2\2@\u0138\3\2\2\2BC\13\2\2\2C\5\3"+
		"\2\2\2DE\7\61\2\2EF\7,\2\2FG\7B\2\2GH\7L\2\2HI\7S\2\2IJ\3\2\2\2JK\b\3"+
		"\2\2K\7\3\2\2\2LM\7B\2\2MN\7L\2\2NO\7S\2\2OP\7,\2\2PQ\7\61\2\2QR\3\2\2"+
		"\2RS\b\4\3\2S\t\3\2\2\2TU\7&\2\2U\13\3\2\2\2VW\t\2\2\2W\r\3\2\2\2XY\t"+
		"\3\2\2Y\17\3\2\2\2Z\\\5\16\7\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^\21\3\2\2\2_d\5\f\6\2`c\5\f\6\2ac\5\16\7\2b`\3\2\2\2ba\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2\2gj\5\f\6\2hj\5\16\7\2"+
		"ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\25\3\2\2\2mn\7=\2"+
		"\2n\27\3\2\2\2op\7*\2\2p\31\3\2\2\2qr\7+\2\2r\33\3\2\2\2st\7]\2\2t\35"+
		"\3\2\2\2uv\7_\2\2v\37\3\2\2\2wx\7k\2\2xy\7p\2\2y!\3\2\2\2z{\7q\2\2{|\7"+
		"w\2\2|}\7v\2\2}#\3\2\2\2~\177\7$\2\2\177%\3\2\2\2\u0080\u0081\7,\2\2\u0081"+
		"\u0082\7?\2\2\u0082\'\3\2\2\2\u0083\u0084\7\u0080\2\2\u0084\u0085\7?\2"+
		"\2\u0085)\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088\7?\2\2\u0088+\3\2\2\2"+
		"\u0089\u008a\7?\2\2\u008a-\3\2\2\2\u008b\u008c\7#\2\2\u008c\u008d\7?\2"+
		"\2\u008d/\3\2\2\2\u008e\u008f\7`\2\2\u008f\u0090\7?\2\2\u0090\61\3\2\2"+
		"\2\u0091\u0092\7&\2\2\u0092\u0093\7?\2\2\u0093\63\3\2\2\2\u0094\u0095"+
		"\7<\2\2\u0095\u0096\7g\2\2\u0096\u0097\7s\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\5\30\f\2\u0099\u009a\5\32\r\2\u009a\u00c2\3\2\2\2\u009b\u009c\7"+
		"<\2\2\u009c\u009d\7p\2\2\u009d\u009e\7q\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\5\30\f\2\u00a1\u00a2\5\32\r\2\u00a2\u00c2\3\2\2\2"+
		"\u00a3\u00a4\7<\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7u\2\2\u00a8\u00c2\7v\2\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad\u00c2\7v\2\2"+
		"\u00ae\u00af\7<\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00c2\7v\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\7i\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\30\f\2\u00b8\u00b9\5\32"+
		"\r\2\u00b9\u00c2\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\30\f\2\u00bf\u00c0\5\32\r\2"+
		"\u00c0\u00c2\3\2\2\2\u00c1\u0094\3\2\2\2\u00c1\u009b\3\2\2\2\u00c1\u00a3"+
		"\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1"+
		"\u00ba\3\2\2\2\u00c2\65\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\7e\2\2"+
		"\u00c5\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\5\30\f\2\u00ce\u00cf\5\32\r\2\u00cf\u00e6\3"+
		"\2\2\2\u00d0\u00d1\7<\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7o\2\2\u00d3"+
		"\u00d4\7r\2\2\u00d4\u00d5\7v\2\2\u00d5\u00e6\7{\2\2\u00d6\u00d7\7<\2\2"+
		"\u00d7\u00d8\7j\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7u\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\5\30\f\2\u00dc\u00dd\5\32\r\2\u00dd\u00e6\3\2\2\2"+
		"\u00de\u00df\7<\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e6\7v\2\2\u00e5"+
		"\u00c3\3\2\2\2\u00e5\u00d0\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00de\3\2"+
		"\2\2\u00e6\67\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e89\3\2\2\2\u00e9\u00ea\7"+
		"<\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7j\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7n\2\2\u00f4\u012d\7f\2\2"+
		"\u00f5\u00f6\7<\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\7e\2\2\u00fc"+
		"\u00fd\7j\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff\u012d\7f\2\2"+
		"\u0100\u0101\7<\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7j\2\2\u0104\u0105\7/\2\2\u0105\u0106\7e\2\2\u0106\u0107\7j\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7n\2\2\u0109\u010a\7f\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010c\5\30\f\2\u010c\u010d\5\32\r\2\u010d\u012d\3\2\2\2\u010e"+
		"\u010f\7<\2\2\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112\7j\2\2"+
		"\u0112\u0113\7/\2\2\u0113\u0114\7n\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7/\2\2\u0118\u0119\7e\2\2\u0119"+
		"\u011a\7j\2\2\u011a\u011b\7k\2\2\u011b\u011c\7n\2\2\u011c\u011d\7f\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\5\30\f\2\u011f\u0120\5\32\r\2\u0120\u012d"+
		"\3\2\2\2\u0121\u0122\7<\2\2\u0122\u0123\7q\2\2\u0123\u0124\7p\2\2\u0124"+
		"\u0125\7n\2\2\u0125\u0126\7{\2\2\u0126\u0127\7/\2\2\u0127\u0128\7e\2\2"+
		"\u0128\u0129\7j\2\2\u0129\u012a\7k\2\2\u012a\u012b\7n\2\2\u012b\u012d"+
		"\7f\2\2\u012c\u00e9\3\2\2\2\u012c\u00f5\3\2\2\2\u012c\u0100\3\2\2\2\u012c"+
		"\u010e\3\2\2\2\u012c\u0121\3\2\2\2\u012d;\3\2\2\2\u012e\u012f\7\60\2\2"+
		"\u012f\u0130\5\24\n\2\u0130=\3\2\2\2\u0131\u0133\t\5\2\2\u0132\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b\37\4\2\u0137?\3\2\2\2\u0138\u0139\7\61\2"+
		"\2\u0139\u013a\7,\2\2\u013a\u013e\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7,\2\2\u0142\u0143\7\61"+
		"\2\2\u0143A\3\2\2\2\16\2\3]bdik\u00c1\u00e5\u012c\u0134\u013e\5\7\3\2"+
		"\6\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}