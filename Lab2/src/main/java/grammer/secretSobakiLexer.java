package grammer;// Generated from secretSobaki.g4 by ANTLR 4.3

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class secretSobakiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Int=15, String=16, VarName=17, 
		Num=18, StringValue=19, WS=20, Less=21, Greater=22, Equal=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Int", "String", "VarName", "Num", 
		"StringValue", "WS", "Less", "Greater", "Equal"
	};


	public secretSobakiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "secretSobaki.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\7\22u\n\22\f\22\16\22x\13\22\3\23\5\23{\n\23\3\23\6"+
		"\23~\n\23\r\23\16\23\177\3\24\3\24\7\24\u0084\n\24\f\24\16\24\u0087\13"+
		"\24\3\24\3\24\3\25\6\25\u008c\n\25\r\25\16\25\u008d\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\u0085\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3"+
		"\2\6\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u009a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3"+
		"\2\2\2\5\63\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17E\3"+
		"\2\2\2\21G\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27Y\3\2\2\2\31_\3\2\2\2\33"+
		"a\3\2\2\2\35c\3\2\2\2\37g\3\2\2\2!k\3\2\2\2#r\3\2\2\2%z\3\2\2\2\'\u0081"+
		"\3\2\2\2)\u008b\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61"+
		"\62\7}\2\2\62\4\3\2\2\2\63\64\7y\2\2\64\65\7j\2\2\65\66\7k\2\2\66\67\7"+
		"n\2\2\678\7g\2\28\6\3\2\2\29:\7=\2\2:\b\3\2\2\2;<\7-\2\2<=\7-\2\2=\n\3"+
		"\2\2\2>?\7\177\2\2?\f\3\2\2\2@A\7i\2\2AB\7q\2\2BC\7v\2\2CD\7q\2\2D\16"+
		"\3\2\2\2EF\7?\2\2F\20\3\2\2\2GH\7k\2\2HI\7h\2\2I\22\3\2\2\2JK\7B\2\2K"+
		"\24\3\2\2\2LM\7o\2\2MN\7c\2\2NO\7k\2\2OP\7p\2\2PQ\7R\2\2QR\7t\2\2RS\7"+
		"q\2\2ST\7i\2\2TU\7t\2\2UV\7c\2\2VW\7o\2\2WX\7u\2\2X\26\3\2\2\2YZ\7r\2"+
		"\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\30\3\2\2\2_`\7*\2\2`\32\3\2"+
		"\2\2ab\7+\2\2b\34\3\2\2\2cd\7p\2\2de\7q\2\2ef\7v\2\2f\36\3\2\2\2gh\7k"+
		"\2\2hi\7p\2\2ij\7v\2\2j \3\2\2\2kl\7u\2\2lm\7v\2\2mn\7t\2\2no\7k\2\2o"+
		"p\7p\2\2pq\7i\2\2q\"\3\2\2\2rv\t\2\2\2su\t\3\2\2ts\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2w$\3\2\2\2xv\3\2\2\2y{\7/\2\2zy\3\2\2\2z{\3\2\2\2{"+
		"}\3\2\2\2|~\t\4\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080&\3\2\2\2\u0081\u0085\7$\2\2\u0082\u0084\13\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089(\3\2\2\2\u008a"+
		"\u008c\t\5\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e*\3\2\2\2\u008f\u0090\7>\2\2\u0090,\3\2"+
		"\2\2\u0091\u0092\7@\2\2\u0092.\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095"+
		"\7?\2\2\u0095\60\3\2\2\2\b\2vz\177\u0085\u008d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}