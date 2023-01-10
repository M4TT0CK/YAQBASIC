// Generated from /Users/james/Documents/git/YAQBASIC/app/src/main/antlr/QBASIC.g4 by ANTLR 4.9.2

package listeners;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QBASICParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		REM_TEXT=10, COMMA=11, SEMI_COLON=12, PRINT=13, L_PAREN=14, R_PAREN=15, 
		EQUALS=16, DEF=17, LET=18, FOR=19, VAR=20, DIGITS=21, DIGIT=22, END=23, 
		STOP=24, GOTO=25, GOSUB=26, RETURN=27, EOL=28, DIM=29, READ=30, DATA=31, 
		IF=32, THEN=33, TO=34, STEP=35, NEXT=36, INPUT=37, MULT=38, DIVIDE=39, 
		ADD=40, SUBTRACT=41, FUNCTION_NAME=42, WS=43;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_varName = 3, 
		RULE_typeChar = 4, RULE_printList = 5, RULE_expression = 6, RULE_number = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "varName", "typeChar", "printList", "expression", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LPRINT'", "'BEEP'", "'CLEAR'", "'CLS'", "'%'", "'&'", "'#'", 
			"'$'", null, null, "','", "';'", "'PRINT'", "'('", "')'", "'='", "'DEF'", 
			"'LET'", "'FOR'", null, null, null, "'END'", "'STOP'", "'GOTO'", "'GOSUB'", 
			"'RETURN'", null, "'DIM'", "'READ'", "'DATA'", "'IF'", "'THEN'", "'TO'", 
			"'STEP'", "'NEXT'", "'INPUT'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "STRING", "REM_TEXT", 
			"COMMA", "SEMI_COLON", "PRINT", "L_PAREN", "R_PAREN", "EQUALS", "DEF", 
			"LET", "FOR", "VAR", "DIGITS", "DIGIT", "END", "STOP", "GOTO", "GOSUB", 
			"RETURN", "EOL", "DIM", "READ", "DATA", "IF", "THEN", "TO", "STEP", "NEXT", 
			"INPUT", "MULT", "DIVIDE", "ADD", "SUBTRACT", "FUNCTION_NAME", "WS"
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

	@Override
	public String getGrammarFileName() { return "QBASIC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QBASICParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QBASICParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << PRINT) | (1L << LET) | (1L << DIGITS) | (1L << GOTO) | (1L << GOSUB) | (1L << EOL))) != 0)) {
				{
				{
				setState(16);
				line();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(QBASICParser.EOL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGITS) {
				{
				setState(24);
				number();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << PRINT) | (1L << LET) | (1L << GOTO) | (1L << GOSUB))) != 0)) {
				{
				setState(27);
				statement();
				}
			}

			setState(30);
			match(EOL);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClearScreenStatementContext extends StatementContext {
		public ClearScreenStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BeepStatementContext extends StatementContext {
		public BeepStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class LPrintStatementContext extends StatementContext {
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
		}
		public LPrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends StatementContext {
		public TerminalNode GOTO() { return getToken(QBASICParser.GOTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentStatementContext extends StatementContext {
		public TerminalNode LET() { return getToken(QBASICParser.LET, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(QBASICParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(QBASICParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class GosubStatementContext extends StatementContext {
		public TerminalNode GOSUB() { return getToken(QBASICParser.GOSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GosubStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ClearStatementContext extends StatementContext {
		public ClearStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(PRINT);
				setState(33);
				expression();
				}
				break;
			case T__0:
				_localctx = new LPrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__0);
				setState(35);
				printList();
				}
				break;
			case T__1:
				_localctx = new BeepStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ClearStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ClearScreenStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(T__3);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				match(GOTO);
				setState(40);
				expression();
				}
				break;
			case GOSUB:
				_localctx = new GosubStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				match(GOSUB);
				setState(42);
				expression();
				}
				break;
			case LET:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				match(LET);
				setState(44);
				varName();
				setState(45);
				match(EQUALS);
				setState(46);
				expression();
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(QBASICParser.VAR, 0); }
		public TypeCharContext typeChar() {
			return getRuleContext(TypeCharContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(VAR);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(51);
				typeChar();
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

	public static class TypeCharContext extends ParserRuleContext {
		public TypeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChar; }
	}

	public final TypeCharContext typeChar() throws RecognitionException {
		TypeCharContext _localctx = new TypeCharContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PrintListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QBASICParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QBASICParser.COMMA, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(QBASICParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(QBASICParser.SEMI_COLON, i);
		}
		public PrintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printList; }
	}

	public final PrintListContext printList() throws RecognitionException {
		PrintListContext _localctx = new PrintListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			expression();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMI_COLON) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				expression();
				}
				}
				setState(63);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(QBASICParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			_localctx = new LiteralExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(64);
				match(STRING);
				}
				break;
			case DIGITS:
				{
				setState(65);
				number();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(QBASICParser.DIGITS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DIGITS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-I\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2\16"+
		"\2\27\13\2\3\2\3\2\3\3\5\3\34\n\3\3\3\5\3\37\n\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5"+
		"\5\5\67\n\5\3\6\3\6\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\5\bE\n"+
		"\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\7\n\3\2\r\16\2M\2\25\3"+
		"\2\2\2\4\33\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16"+
		"D\3\2\2\2\20F\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3"+
		"\3\2\2\2\32\34\5\20\t\2\33\32\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\37"+
		"\5\6\4\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\36\2\2!\5\3\2\2\2"+
		"\"#\7\17\2\2#\63\5\16\b\2$%\7\3\2\2%\63\5\f\7\2&\63\7\4\2\2\'\63\7\5\2"+
		"\2(\63\7\6\2\2)*\7\33\2\2*\63\5\16\b\2+,\7\34\2\2,\63\5\16\b\2-.\7\24"+
		"\2\2./\5\b\5\2/\60\7\22\2\2\60\61\5\16\b\2\61\63\3\2\2\2\62\"\3\2\2\2"+
		"\62$\3\2\2\2\62&\3\2\2\2\62\'\3\2\2\2\62(\3\2\2\2\62)\3\2\2\2\62+\3\2"+
		"\2\2\62-\3\2\2\2\63\7\3\2\2\2\64\66\7\26\2\2\65\67\5\n\6\2\66\65\3\2\2"+
		"\2\66\67\3\2\2\2\67\t\3\2\2\289\t\2\2\29\13\3\2\2\2:?\5\16\b\2;<\t\3\2"+
		"\2<>\5\16\b\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2"+
		"\2\2BE\7\13\2\2CE\5\20\t\2DB\3\2\2\2DC\3\2\2\2E\17\3\2\2\2FG\7\27\2\2"+
		"G\21\3\2\2\2\t\25\33\36\62\66?D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}