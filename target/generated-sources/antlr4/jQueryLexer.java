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
		STRING=9, END=10, OPENP=11, CLOSEP=12, OPENB=13, CLOSEB=14, OPENC=15, 
		CLOSEC=16, IN=17, OUT=18, QUOTES=19, CONTAINS_SUB_STRING=20, CONTAINS_WORD=21, 
		CONTAINS_PREFIX=22, EQUALS=23, NOT_EQUALS=24, STARTS_WITH=25, ENDS_WITH=26, 
		BASIC_FILTER=27, CONTENT_FILTER=28, HIERARCHY_SELECTOR=29, CHILD_FILTER=30, 
		EVENT=31, ADDFUNCS=32, VARTYPE=33, OPERATION=34, WS=35, BLOCKCOMMENT=36;
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
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'"
	};
	public static final String[] ruleNames = {
		"JAVA", "JQBEGIN", "JQEND", "DOLLAR", "LETTER", "DIGIT", "NUMBER", "VAR", 
		"STRING", "END", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "OPENC", "CLOSEC", 
		"IN", "OUT", "QUOTES", "CONTAINS_SUB_STRING", "CONTAINS_WORD", "CONTAINS_PREFIX", 
		"EQUALS", "NOT_EQUALS", "STARTS_WITH", "ENDS_WITH", "BASIC_FILTER", "CONTENT_FILTER", 
		"HIERARCHY_SELECTOR", "CHILD_FILTER", "EVENT", "ADDFUNCS", "VARTYPE", 
		"OPERATION", "WS", "BLOCKCOMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u01d3\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bf"+
		"\n\b\r\b\16\bg\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\3\n\3\n"+
		"\6\nw\n\n\r\n\16\nx\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d3\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u00f7\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u013e\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0174\n \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u0191\n!\3!\3!\3!\3!\3!\3!\5!\u0199\n!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01bb\n\"\3#\3#\3#\3#\3$\6"+
		"$\u01c2\n$\r$\16$\u01c3\3$\3$\3%\3%\3%\3%\7%\u01cc\n%\f%\16%\u01cf\13"+
		"%\3%\3%\3%\3\u01cd\2&\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30"+
		"\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33"+
		"\66\348\35:\36<\37> @!B\"D#F$H%J&\4\2\3\6\6\2\"\"..C\\c|\3\2\62;\4\2@"+
		"@\u0080\u0080\5\2\13\f\17\17\"\"\u01f5\2\4\3\2\2\2\2\6\3\2\2\2\3\b\3\2"+
		"\2\2\3\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3"+
		"\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3"+
		"\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2"+
		"\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66"+
		"\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2"+
		"\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2"+
		"\bV\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2"+
		"\24v\3\2\2\2\26z\3\2\2\2\30|\3\2\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0082"+
		"\3\2\2\2 \u0084\3\2\2\2\"\u0086\3\2\2\2$\u0088\3\2\2\2&\u008b\3\2\2\2"+
		"(\u008f\3\2\2\2*\u0091\3\2\2\2,\u0094\3\2\2\2.\u0097\3\2\2\2\60\u009a"+
		"\3\2\2\2\62\u009c\3\2\2\2\64\u009f\3\2\2\2\66\u00a2\3\2\2\28\u00d2\3\2"+
		"\2\2:\u00f6\3\2\2\2<\u00f8\3\2\2\2>\u013d\3\2\2\2@\u0173\3\2\2\2B\u0190"+
		"\3\2\2\2D\u01ba\3\2\2\2F\u01bc\3\2\2\2H\u01c1\3\2\2\2J\u01c7\3\2\2\2L"+
		"M\13\2\2\2M\5\3\2\2\2NO\7\61\2\2OP\7,\2\2PQ\7B\2\2QR\7L\2\2RS\7S\2\2S"+
		"T\3\2\2\2TU\b\3\2\2U\7\3\2\2\2VW\7B\2\2WX\7L\2\2XY\7S\2\2YZ\7,\2\2Z[\7"+
		"\61\2\2[\\\3\2\2\2\\]\b\4\3\2]\t\3\2\2\2^_\7&\2\2_\13\3\2\2\2`a\t\2\2"+
		"\2a\r\3\2\2\2bc\t\3\2\2c\17\3\2\2\2df\5\16\7\2ed\3\2\2\2fg\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\21\3\2\2\2ij\7$\2\2jo\5\f\6\2kn\5\f\6\2ln\5\16\7\2m"+
		"k\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\7$\2\2s\23\3\2\2\2tw\5\f\6\2uw\5\16\7\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\25\3\2\2\2z{\7=\2\2{\27\3\2\2\2|}\7*\2\2}\31\3"+
		"\2\2\2~\177\7+\2\2\177\33\3\2\2\2\u0080\u0081\7]\2\2\u0081\35\3\2\2\2"+
		"\u0082\u0083\7_\2\2\u0083\37\3\2\2\2\u0084\u0085\7}\2\2\u0085!\3\2\2\2"+
		"\u0086\u0087\7\177\2\2\u0087#\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7"+
		"p\2\2\u008a%\3\2\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e"+
		"\7v\2\2\u008e\'\3\2\2\2\u008f\u0090\7$\2\2\u0090)\3\2\2\2\u0091\u0092"+
		"\7,\2\2\u0092\u0093\7?\2\2\u0093+\3\2\2\2\u0094\u0095\7\u0080\2\2\u0095"+
		"\u0096\7?\2\2\u0096-\3\2\2\2\u0097\u0098\7~\2\2\u0098\u0099\7?\2\2\u0099"+
		"/\3\2\2\2\u009a\u009b\7?\2\2\u009b\61\3\2\2\2\u009c\u009d\7#\2\2\u009d"+
		"\u009e\7?\2\2\u009e\63\3\2\2\2\u009f\u00a0\7`\2\2\u00a0\u00a1\7?\2\2\u00a1"+
		"\65\3\2\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4\7?\2\2\u00a4\67\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7s\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00aa\5\30\f\2\u00aa\u00ab\5\32\r\2\u00ab\u00d3\3\2\2\2\u00ac"+
		"\u00ad\7<\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\30\f\2\u00b2\u00b3\5\32\r\2\u00b3\u00d3"+
		"\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7u\2\2\u00b9\u00d3\7v\2\2\u00ba\u00bb\7<\2\2"+
		"\u00bb\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7u\2\2\u00be\u00d3"+
		"\7v\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00d3\7v\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7i\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5\30\f\2\u00c9\u00ca"+
		"\5\32\r\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\30\f\2\u00d0\u00d1\5\32"+
		"\r\2\u00d1\u00d3\3\2\2\2\u00d2\u00a5\3\2\2\2\u00d2\u00ac\3\2\2\2\u00d2"+
		"\u00b4\3\2\2\2\u00d2\u00ba\3\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00c4\3\2"+
		"\2\2\u00d2\u00cb\3\2\2\2\u00d39\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7u\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00df\5\30\f\2\u00df\u00e0\5\32\r\2\u00e0\u00f7"+
		"\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7o\2\2\u00e4"+
		"\u00e5\7r\2\2\u00e5\u00e6\7v\2\2\u00e6\u00f7\7{\2\2\u00e7\u00e8\7<\2\2"+
		"\u00e8\u00e9\7j\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\5\30\f\2\u00ed\u00ee\5\32\r\2\u00ee\u00f7\3\2\2\2"+
		"\u00ef\u00f0\7<\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f7\7v\2\2\u00f6"+
		"\u00d4\3\2\2\2\u00f6\u00e1\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00ef\3\2"+
		"\2\2\u00f7;\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9=\3\2\2\2\u00fa\u00fb\7<"+
		"\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff"+
		"\7u\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7/\2\2\u0101\u0102\7e\2\2\u0102"+
		"\u0103\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7n\2\2\u0105\u013e\7f\2\2"+
		"\u0106\u0107\7<\2\2\u0107\u0108\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c\7/\2\2\u010c\u010d\7e\2\2\u010d"+
		"\u010e\7j\2\2\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u013e\7f\2\2"+
		"\u0111\u0112\7<\2\2\u0112\u0113\7p\2\2\u0113\u0114\7v\2\2\u0114\u0115"+
		"\7j\2\2\u0115\u0116\7/\2\2\u0116\u0117\7e\2\2\u0117\u0118\7j\2\2\u0118"+
		"\u0119\7k\2\2\u0119\u011a\7n\2\2\u011a\u011b\7f\2\2\u011b\u011c\3\2\2"+
		"\2\u011c\u011d\5\30\f\2\u011d\u011e\5\32\r\2\u011e\u013e\3\2\2\2\u011f"+
		"\u0120\7<\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7j\2\2"+
		"\u0123\u0124\7/\2\2\u0124\u0125\7n\2\2\u0125\u0126\7c\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7v\2\2\u0128\u0129\7/\2\2\u0129\u012a\7e\2\2\u012a"+
		"\u012b\7j\2\2\u012b\u012c\7k\2\2\u012c\u012d\7n\2\2\u012d\u012e\7f\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\5\30\f\2\u0130\u0131\5\32\r\2\u0131\u013e"+
		"\3\2\2\2\u0132\u0133\7<\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135"+
		"\u0136\7n\2\2\u0136\u0137\7{\2\2\u0137\u0138\7/\2\2\u0138\u0139\7e\2\2"+
		"\u0139\u013a\7j\2\2\u013a\u013b\7k\2\2\u013b\u013c\7n\2\2\u013c\u013e"+
		"\7f\2\2\u013d\u00fa\3\2\2\2\u013d\u0106\3\2\2\2\u013d\u0111\3\2\2\2\u013d"+
		"\u011f\3\2\2\2\u013d\u0132\3\2\2\2\u013e?\3\2\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7n\2\2\u0141\u0142\7k\2\2\u0142\u0143\7e\2\2\u0143\u0174\7m\2\2"+
		"\u0144\u0145\7f\2\2\u0145\u0146\7e\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7k\2\2\u0148\u0149\7e\2\2\u0149\u0174\7m\2\2\u014a\u014b\7o\2\2\u014b"+
		"\u014c\7q\2\2\u014c\u014d\7w\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2"+
		"\u014f\u0150\7g\2\2\u0150\u0151\7p\2\2\u0151\u0152\7v\2\2\u0152\u0153"+
		"\7g\2\2\u0153\u0174\7t\2\2\u0154\u0155\7o\2\2\u0155\u0156\7q\2\2\u0156"+
		"\u0157\7w\2\2\u0157\u0158\7u\2\2\u0158\u0159\7g\2\2\u0159\u015a\7n\2\2"+
		"\u015a\u015b\7g\2\2\u015b\u015c\7c\2\2\u015c\u015d\7x\2\2\u015d\u0174"+
		"\7g\2\2\u015e\u015f\7o\2\2\u015f\u0160\7q\2\2\u0160\u0161\7w\2\2\u0161"+
		"\u0162\7u\2\2\u0162\u0163\7g\2\2\u0163\u0164\7w\2\2\u0164\u0174\7r\2\2"+
		"\u0165\u0166\7j\2\2\u0166\u0167\7q\2\2\u0167\u0168\7x\2\2\u0168\u0169"+
		"\7g\2\2\u0169\u0174\7t\2\2\u016a\u016b\7h\2\2\u016b\u016c\7q\2\2\u016c"+
		"\u016d\7e\2\2\u016d\u016e\7w\2\2\u016e\u0174\7u\2\2\u016f\u0170\7d\2\2"+
		"\u0170\u0171\7n\2\2\u0171\u0172\7w\2\2\u0172\u0174\7t\2\2\u0173\u013f"+
		"\3\2\2\2\u0173\u0144\3\2\2\2\u0173\u014a\3\2\2\2\u0173\u0154\3\2\2\2\u0173"+
		"\u015e\3\2\2\2\u0173\u0165\3\2\2\2\u0173\u016a\3\2\2\2\u0173\u016f\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\5\30\f\2\u0176\u0177\5\32\r\2\u0177"+
		"A\3\2\2\2\u0178\u0179\7c\2\2\u0179\u017a\7r\2\2\u017a\u017b\7r\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7p\2\2\u017d\u0191\7f\2\2\u017e\u017f\7r\2\2"+
		"\u017f\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7r\2\2\u0182\u0183"+
		"\7g\2\2\u0183\u0184\7p\2\2\u0184\u0191\7f\2\2\u0185\u0186\7c\2\2\u0186"+
		"\u0187\7h\2\2\u0187\u0188\7v\2\2\u0188\u0189\7g\2\2\u0189\u0191\7t\2\2"+
		"\u018a\u018b\7d\2\2\u018b\u018c\7g\2\2\u018c\u018d\7h\2\2\u018d\u018e"+
		"\7q\2\2\u018e\u018f\7t\2\2\u018f\u0191\7g\2\2\u0190\u0178\3\2\2\2\u0190"+
		"\u017e\3\2\2\2\u0190\u0185\3\2\2\2\u0190\u018a\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0198\5\30\f\2\u0193\u0194\7$\2\2\u0194\u0195\5\24\n\2\u0195"+
		"\u0196\7$\2\2\u0196\u0199\3\2\2\2\u0197\u0199\5\22\t\2\u0198\u0193\3\2"+
		"\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\32\r\2\u019b"+
		"C\3\2\2\2\u019c\u019d\7k\2\2\u019d\u019e\7p\2\2\u019e\u01bb\7v\2\2\u019f"+
		"\u01a0\7h\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7c\2\2"+
		"\u01a3\u01bb\7v\2\2\u01a4\u01a5\7U\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7"+
		"\7t\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7p\2\2\u01a9\u01bb\7i\2\2\u01aa"+
		"\u01ab\7d\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7n\2\2"+
		"\u01ae\u01af\7g\2\2\u01af\u01b0\7c\2\2\u01b0\u01bb\7p\2\2\u01b1\u01b2"+
		"\7C\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7c\2\2\u01b5"+
		"\u01bb\7{\2\2\u01b6\u01b7\7x\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7k\2\2"+
		"\u01b9\u01bb\7f\2\2\u01ba\u019c\3\2\2\2\u01ba\u019f\3\2\2\2\u01ba\u01a4"+
		"\3\2\2\2\u01ba\u01aa\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb"+
		"E\3\2\2\2\u01bc\u01bd\5\24\n\2\u01bd\u01be\5\30\f\2\u01be\u01bf\5\32\r"+
		"\2\u01bfG\3\2\2\2\u01c0\u01c2\t\5\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\b$\4\2\u01c6I\3\2\2\2\u01c7\u01c8\7\61\2\2\u01c8\u01c9\7,\2\2\u01c9"+
		"\u01cd\3\2\2\2\u01ca\u01cc\13\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d1\7,\2\2\u01d1\u01d2\7\61\2\2\u01d2K\3\2\2\2"+
		"\22\2\3gmovx\u00d2\u00f6\u013d\u0173\u0190\u0198\u01ba\u01c3\u01cd\5\7"+
		"\3\2\6\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}