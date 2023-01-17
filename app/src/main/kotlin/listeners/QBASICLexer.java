// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QBASICLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, REM_TEXT=11, COMMA=12, SEMI_COLON=13, PRINT=14, L_PAREN=15, 
		R_PAREN=16, EQUALS=17, DEF=18, LET=19, FOR=20, VAR=21, DIGITS=22, DIGIT=23, 
		END=24, STOP=25, GOTO=26, GOSUB=27, RETURN=28, EOL=29, DIM=30, READ=31, 
		DATA=32, IF=33, THEN=34, TO=35, STEP=36, NEXT=37, INPUT=38, MULT=39, DIVIDE=40, 
		ADD=41, SUBTRACT=42, FUNCTION_NAME=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"TEXT", "REM", "STRING", "REM_TEXT", "COMMA", "SEMI_COLON", "PRINT", 
			"L_PAREN", "R_PAREN", "EQUALS", "DEF", "LET", "FOR", "VAR", "DIGITS", 
			"DIGIT", "END", "STOP", "GOTO", "GOSUB", "RETURN", "EOL", "DIM", "READ", 
			"DATA", "IF", "THEN", "TO", "STEP", "NEXT", "INPUT", "MULT", "DIVIDE", 
			"ADD", "SUBTRACT", "FUNCTION_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LPRINT'", "'BEEP'", "'CLEAR'", "'CLS'", "'FN'", "'%'", "'&'", 
			"'#'", "'$'", null, null, "','", "';'", "'PRINT'", "'('", "')'", "'='", 
			"'DEF'", "'LET'", "'FOR'", null, null, null, "'END'", "'STOP'", "'GOTO'", 
			"'GOSUB'", "'RETURN'", null, "'DIM'", "'READ'", "'DATA'", "'IF'", "'THEN'", 
			"'TO'", "'STEP'", "'NEXT'", "'INPUT'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"REM_TEXT", "COMMA", "SEMI_COLON", "PRINT", "L_PAREN", "R_PAREN", "EQUALS", 
			"DEF", "LET", "FOR", "VAR", "DIGITS", "DIGIT", "END", "STOP", "GOTO", 
			"GOSUB", "RETURN", "EOL", "DIM", "READ", "DATA", "IF", "THEN", "TO", 
			"STEP", "NEXT", "INPUT", "MULT", "DIVIDE", "ADD", "SUBTRACT", "FUNCTION_NAME", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public QBASICLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QBASIC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000,\u0116\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0005"+
		"\t\u0080\b\t\n\t\f\t\u0083\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00af\b\u0016\n\u0016\f\u0016\u00b2\t\u0016\u0003\u0016\u00b4\b\u0016"+
		"\u0001\u0017\u0004\u0017\u00b7\b\u0017\u000b\u0017\f\u0017\u00b8\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004"+
		"\u001e\u00d9\b\u001e\u000b\u001e\f\u001e\u00da\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0004,\u010f\b,\u000b,\f,\u0110\u0001-\u0001-\u0001-\u0001-\u0000\u0000"+
		".\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015"+
		"/\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001f"+
		"C E!G\"I#K$M%O&Q\'S(U)W*Y+[,\u0001\u0000\u0007\u0003\u0000\n\n\r\r\"\""+
		"\u0001\u0000AZ\u0003\u0000..09az\u0001\u000009\u0002\u0000\n\n\r\r\u0003"+
		"\u000019AZaz\u0002\u0000\t\t  \u0119\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0001]\u0001\u0000\u0000\u0000\u0003d\u0001\u0000\u0000"+
		"\u0000\u0005i\u0001\u0000\u0000\u0000\u0007o\u0001\u0000\u0000\u0000\t"+
		"s\u0001\u0000\u0000\u0000\u000bv\u0001\u0000\u0000\u0000\rx\u0001\u0000"+
		"\u0000\u0000\u000fz\u0001\u0000\u0000\u0000\u0011|\u0001\u0000\u0000\u0000"+
		"\u0013\u0081\u0001\u0000\u0000\u0000\u0015\u0084\u0001\u0000\u0000\u0000"+
		"\u0017\u0088\u0001\u0000\u0000\u0000\u0019\u008c\u0001\u0000\u0000\u0000"+
		"\u001b\u008f\u0001\u0000\u0000\u0000\u001d\u0091\u0001\u0000\u0000\u0000"+
		"\u001f\u0093\u0001\u0000\u0000\u0000!\u0099\u0001\u0000\u0000\u0000#\u009b"+
		"\u0001\u0000\u0000\u0000%\u009d\u0001\u0000\u0000\u0000\'\u009f\u0001"+
		"\u0000\u0000\u0000)\u00a3\u0001\u0000\u0000\u0000+\u00a7\u0001\u0000\u0000"+
		"\u0000-\u00b3\u0001\u0000\u0000\u0000/\u00b6\u0001\u0000\u0000\u00001"+
		"\u00ba\u0001\u0000\u0000\u00003\u00bc\u0001\u0000\u0000\u00005\u00c0\u0001"+
		"\u0000\u0000\u00007\u00c5\u0001\u0000\u0000\u00009\u00ca\u0001\u0000\u0000"+
		"\u0000;\u00d0\u0001\u0000\u0000\u0000=\u00d8\u0001\u0000\u0000\u0000?"+
		"\u00dc\u0001\u0000\u0000\u0000A\u00e0\u0001\u0000\u0000\u0000C\u00e5\u0001"+
		"\u0000\u0000\u0000E\u00ea\u0001\u0000\u0000\u0000G\u00ed\u0001\u0000\u0000"+
		"\u0000I\u00f2\u0001\u0000\u0000\u0000K\u00f5\u0001\u0000\u0000\u0000M"+
		"\u00fa\u0001\u0000\u0000\u0000O\u00ff\u0001\u0000\u0000\u0000Q\u0105\u0001"+
		"\u0000\u0000\u0000S\u0107\u0001\u0000\u0000\u0000U\u0109\u0001\u0000\u0000"+
		"\u0000W\u010b\u0001\u0000\u0000\u0000Y\u010e\u0001\u0000\u0000\u0000["+
		"\u0112\u0001\u0000\u0000\u0000]^\u0005L\u0000\u0000^_\u0005P\u0000\u0000"+
		"_`\u0005R\u0000\u0000`a\u0005I\u0000\u0000ab\u0005N\u0000\u0000bc\u0005"+
		"T\u0000\u0000c\u0002\u0001\u0000\u0000\u0000de\u0005B\u0000\u0000ef\u0005"+
		"E\u0000\u0000fg\u0005E\u0000\u0000gh\u0005P\u0000\u0000h\u0004\u0001\u0000"+
		"\u0000\u0000ij\u0005C\u0000\u0000jk\u0005L\u0000\u0000kl\u0005E\u0000"+
		"\u0000lm\u0005A\u0000\u0000mn\u0005R\u0000\u0000n\u0006\u0001\u0000\u0000"+
		"\u0000op\u0005C\u0000\u0000pq\u0005L\u0000\u0000qr\u0005S\u0000\u0000"+
		"r\b\u0001\u0000\u0000\u0000st\u0005F\u0000\u0000tu\u0005N\u0000\u0000"+
		"u\n\u0001\u0000\u0000\u0000vw\u0005%\u0000\u0000w\f\u0001\u0000\u0000"+
		"\u0000xy\u0005&\u0000\u0000y\u000e\u0001\u0000\u0000\u0000z{\u0005#\u0000"+
		"\u0000{\u0010\u0001\u0000\u0000\u0000|}\u0005$\u0000\u0000}\u0012\u0001"+
		"\u0000\u0000\u0000~\u0080\b\u0000\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0014\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005R\u0000\u0000"+
		"\u0085\u0086\u0005E\u0000\u0000\u0086\u0087\u0005M\u0000\u0000\u0087\u0016"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u008a\u0003"+
		"\u0013\t\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b\u0018\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0003\u0015\n\u0000\u008d\u008e\u0003\u0013\t"+
		"\u0000\u008e\u001a\u0001\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000"+
		"\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0092\u0005;\u0000\u0000\u0092"+
		"\u001e\u0001\u0000\u0000\u0000\u0093\u0094\u0005P\u0000\u0000\u0094\u0095"+
		"\u0005R\u0000\u0000\u0095\u0096\u0005I\u0000\u0000\u0096\u0097\u0005N"+
		"\u0000\u0000\u0097\u0098\u0005T\u0000\u0000\u0098 \u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005(\u0000\u0000\u009a\"\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005)\u0000\u0000\u009c$\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"=\u0000\u0000\u009e&\u0001\u0000\u0000\u0000\u009f\u00a0\u0005D\u0000"+
		"\u0000\u00a0\u00a1\u0005E\u0000\u0000\u00a1\u00a2\u0005F\u0000\u0000\u00a2"+
		"(\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005L\u0000\u0000\u00a4\u00a5\u0005"+
		"E\u0000\u0000\u00a5\u00a6\u0005T\u0000\u0000\u00a6*\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005F\u0000\u0000\u00a8\u00a9\u0005O\u0000\u0000\u00a9"+
		"\u00aa\u0005R\u0000\u0000\u00aa,\u0001\u0000\u0000\u0000\u00ab\u00b4\u0007"+
		"\u0001\u0000\u0000\u00ac\u00b0\u0007\u0001\u0000\u0000\u00ad\u00af\u0007"+
		"\u0002\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b4.\u0001\u0000\u0000\u0000\u00b5\u00b7\u0007\u0003"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b90\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0003\u0000"+
		"\u0000\u00bb2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005E\u0000\u0000\u00bd"+
		"\u00be\u0005N\u0000\u0000\u00be\u00bf\u0005D\u0000\u0000\u00bf4\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005S\u0000\u0000\u00c1\u00c2\u0005T\u0000"+
		"\u0000\u00c2\u00c3\u0005O\u0000\u0000\u00c3\u00c4\u0005P\u0000\u0000\u00c4"+
		"6\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005G\u0000\u0000\u00c6\u00c7\u0005"+
		"O\u0000\u0000\u00c7\u00c8\u0005T\u0000\u0000\u00c8\u00c9\u0005O\u0000"+
		"\u0000\u00c98\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005G\u0000\u0000\u00cb"+
		"\u00cc\u0005O\u0000\u0000\u00cc\u00cd\u0005S\u0000\u0000\u00cd\u00ce\u0005"+
		"U\u0000\u0000\u00ce\u00cf\u0005B\u0000\u0000\u00cf:\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005R\u0000\u0000\u00d1\u00d2\u0005E\u0000\u0000\u00d2"+
		"\u00d3\u0005T\u0000\u0000\u00d3\u00d4\u0005U\u0000\u0000\u00d4\u00d5\u0005"+
		"R\u0000\u0000\u00d5\u00d6\u0005N\u0000\u0000\u00d6<\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0007\u0004\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db>\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005D\u0000\u0000\u00dd\u00de\u0005I\u0000\u0000\u00de\u00df"+
		"\u0005M\u0000\u0000\u00df@\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005R"+
		"\u0000\u0000\u00e1\u00e2\u0005E\u0000\u0000\u00e2\u00e3\u0005A\u0000\u0000"+
		"\u00e3\u00e4\u0005D\u0000\u0000\u00e4B\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005D\u0000\u0000\u00e6\u00e7\u0005A\u0000\u0000\u00e7\u00e8\u0005T"+
		"\u0000\u0000\u00e8\u00e9\u0005A\u0000\u0000\u00e9D\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005I\u0000\u0000\u00eb\u00ec\u0005F\u0000\u0000\u00ecF"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005T\u0000\u0000\u00ee\u00ef\u0005"+
		"H\u0000\u0000\u00ef\u00f0\u0005E\u0000\u0000\u00f0\u00f1\u0005N\u0000"+
		"\u0000\u00f1H\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005T\u0000\u0000\u00f3"+
		"\u00f4\u0005O\u0000\u0000\u00f4J\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"S\u0000\u0000\u00f6\u00f7\u0005T\u0000\u0000\u00f7\u00f8\u0005E\u0000"+
		"\u0000\u00f8\u00f9\u0005P\u0000\u0000\u00f9L\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005N\u0000\u0000\u00fb\u00fc\u0005E\u0000\u0000\u00fc\u00fd\u0005"+
		"X\u0000\u0000\u00fd\u00fe\u0005T\u0000\u0000\u00feN\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005I\u0000\u0000\u0100\u0101\u0005N\u0000\u0000\u0101"+
		"\u0102\u0005P\u0000\u0000\u0102\u0103\u0005U\u0000\u0000\u0103\u0104\u0005"+
		"T\u0000\u0000\u0104P\u0001\u0000\u0000\u0000\u0105\u0106\u0005*\u0000"+
		"\u0000\u0106R\u0001\u0000\u0000\u0000\u0107\u0108\u0005/\u0000\u0000\u0108"+
		"T\u0001\u0000\u0000\u0000\u0109\u010a\u0005+\u0000\u0000\u010aV\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005-\u0000\u0000\u010cX\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0007\u0005\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111Z\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0007\u0006\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0006-\u0000\u0000\u0115\\\u0001\u0000\u0000\u0000\t\u0000"+
		"\u0081\u00ae\u00b0\u00b3\u00b8\u00da\u010e\u0110\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}