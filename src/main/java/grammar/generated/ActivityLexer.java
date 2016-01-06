// Generated from /Users/zcfrank1st/Desktop/git-svn/activity-parser/src/main/java/grammar/Activity.g4 by ANTLR 4.5.1
package grammar.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActivityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, OR=7, QUANTITY=8, TOTAL_PRICE=9, 
		ITEM=10, SINGLE_PRICE=11, EXPRESS=12, GT=13, EQ=14, GE=15, MINUS_VALUE=16, 
		INT=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "AND", "OR", "QUANTITY", "TOTAL_PRICE", 
		"ITEM", "SINGLE_PRICE", "EXPRESS", "GT", "EQ", "GE", "MINUS_VALUE", "INT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'->'", "','", "'AND'", "'OR'", "'QUANTITY'", 
		"'TOTAL_PRICE'", "'ITEM'", "'SINGLE_PRICE'", "'EXPRESS'", "'>'", "'='", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "AND", "OR", "QUANTITY", "TOTAL_PRICE", 
		"ITEM", "SINGLE_PRICE", "EXPRESS", "GT", "EQ", "GE", "MINUS_VALUE", "INT", 
		"WS"
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


	public ActivityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Activity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\6\21r\n\21\r\21\16\21"+
		"s\3\22\6\22w\n\22\r\22\16\22x\3\23\6\23|\n\23\r\23\16\23}\3\23\3\23\2"+
		"\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\4\3\2\62;\6\2\13\f\17\17\"\"))\u0083\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13\60\3\2\2\2\r\62"+
		"\3\2\2\2\17\66\3\2\2\2\219\3\2\2\2\23B\3\2\2\2\25N\3\2\2\2\27S\3\2\2\2"+
		"\31`\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!o\3\2\2\2#v\3\2\2\2%"+
		"{\3\2\2\2\'(\7}\2\2(\4\3\2\2\2)*\7\177\2\2*\6\3\2\2\2+,\7=\2\2,\b\3\2"+
		"\2\2-.\7/\2\2./\7@\2\2/\n\3\2\2\2\60\61\7.\2\2\61\f\3\2\2\2\62\63\7C\2"+
		"\2\63\64\7P\2\2\64\65\7F\2\2\65\16\3\2\2\2\66\67\7Q\2\2\678\7T\2\28\20"+
		"\3\2\2\29:\7S\2\2:;\7W\2\2;<\7C\2\2<=\7P\2\2=>\7V\2\2>?\7K\2\2?@\7V\2"+
		"\2@A\7[\2\2A\22\3\2\2\2BC\7V\2\2CD\7Q\2\2DE\7V\2\2EF\7C\2\2FG\7N\2\2G"+
		"H\7a\2\2HI\7R\2\2IJ\7T\2\2JK\7K\2\2KL\7E\2\2LM\7G\2\2M\24\3\2\2\2NO\7"+
		"K\2\2OP\7V\2\2PQ\7G\2\2QR\7O\2\2R\26\3\2\2\2ST\7U\2\2TU\7K\2\2UV\7P\2"+
		"\2VW\7I\2\2WX\7N\2\2XY\7G\2\2YZ\7a\2\2Z[\7R\2\2[\\\7T\2\2\\]\7K\2\2]^"+
		"\7E\2\2^_\7G\2\2_\30\3\2\2\2`a\7G\2\2ab\7Z\2\2bc\7R\2\2cd\7T\2\2de\7G"+
		"\2\2ef\7U\2\2fg\7U\2\2g\32\3\2\2\2hi\7@\2\2i\34\3\2\2\2jk\7?\2\2k\36\3"+
		"\2\2\2lm\7@\2\2mn\7?\2\2n \3\2\2\2oq\7/\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\"\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y$\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\b\23\2\2\u0080&\3\2\2\2\6\2sx}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}