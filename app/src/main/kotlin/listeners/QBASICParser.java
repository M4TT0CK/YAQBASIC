// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QBASICParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_functionArgs = 3, 
		RULE_varName = 4, RULE_typeChar = 5, RULE_printList = 6, RULE_expression = 7, 
		RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "functionArgs", "varName", "typeChar", 
			"printList", "expression", "number"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 9071716221982L) != 0) {
				{
				{
				setState(18);
				line();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(26);
				number();
				}
				break;
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9071179351070L) != 0) {
				{
				setState(29);
				statement();
				}
			}

			setState(32);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ClearScreenStatementContext extends StatementContext {
		public ClearScreenStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterClearScreenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitClearScreenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitClearScreenStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StatementContext {
		public TerminalNode DEF() { return getToken(QBASICParser.DEF, 0); }
		public TerminalNode FUNCTION_NAME() { return getToken(QBASICParser.FUNCTION_NAME, 0); }
		public TerminalNode L_PAREN() { return getToken(QBASICParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(QBASICParser.R_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(QBASICParser.EQUALS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BeepStatementContext extends StatementContext {
		public BeepStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterBeepStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitBeepStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitBeepStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LPrintStatementContext extends StatementContext {
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
		}
		public LPrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterLPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitLPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitLPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GotoStatementContext extends StatementContext {
		public TerminalNode GOTO() { return getToken(QBASICParser.GOTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(QBASICParser.PRINT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(QBASICParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(QBASICParser.SEMI_COLON, i);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GosubStatementContext extends StatementContext {
		public TerminalNode GOSUB() { return getToken(QBASICParser.GOSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GosubStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterGosubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitGosubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitGosubStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends StatementContext {
		public TerminalNode INPUT() { return getToken(QBASICParser.INPUT, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(QBASICParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(QBASICParser.SEMI_COLON, 0); }
		public InputStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearStatementContext extends StatementContext {
		public ClearStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterClearStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitClearStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitClearStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(PRINT);
				setState(35);
				expression();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON) {
					{
					{
					setState(36);
					match(SEMI_COLON);
					setState(37);
					expression();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
				_localctx = new LPrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__0);
				setState(44);
				printList();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(INPUT);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(46);
					match(STRING);
					setState(47);
					match(SEMI_COLON);
					}
				}

				setState(50);
				varName();
				}
				break;
			case T__1:
				_localctx = new BeepStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ClearStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ClearScreenStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__3);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(GOTO);
				setState(55);
				expression();
				}
				break;
			case GOSUB:
				_localctx = new GosubStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				match(GOSUB);
				setState(57);
				expression();
				}
				break;
			case DEF:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(DEF);
				setState(59);
				match(T__4);
				setState(60);
				match(FUNCTION_NAME);
				setState(61);
				match(L_PAREN);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(62);
					functionArgs();
					}
				}

				setState(65);
				match(R_PAREN);
				setState(66);
				match(EQUALS);
				setState(67);
				statement();
				}
				break;
			case LET:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				match(LET);
				setState(69);
				varName();
				setState(70);
				match(EQUALS);
				setState(71);
				expression();
				}
				break;
			case STRING:
			case VAR:
			case DIGITS:
			case FUNCTION_NAME:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QBASICParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QBASICParser.COMMA, i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			varName();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				varName();
				}
				}
				setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(QBASICParser.VAR, 0); }
		public TypeCharContext typeChar() {
			return getRuleContext(TypeCharContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(VAR);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) {
				{
				setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCharContext extends ParserRuleContext {
		public TypeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCharContext typeChar() throws RecognitionException {
		TypeCharContext _localctx = new TypeCharContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterPrintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitPrintList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitPrintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintListContext printList() throws RecognitionException {
		PrintListContext _localctx = new PrintListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			expression();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMI_COLON) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				expression();
				}
				}
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(QBASICParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpressionContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReferenceExpressionContext extends ExpressionContext {
		public TerminalNode FUNCTION_NAME() { return getToken(QBASICParser.FUNCTION_NAME, 0); }
		public TerminalNode L_PAREN() { return getToken(QBASICParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(QBASICParser.R_PAREN, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterFunctionReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitFunctionReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitFunctionReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case DIGITS:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(98);
					match(STRING);
					}
					break;
				case DIGITS:
					{
					setState(99);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VAR:
				_localctx = new ReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				varName();
				}
				break;
			case FUNCTION_NAME:
				_localctx = new FunctionReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(FUNCTION_NAME);
				setState(104);
				match(L_PAREN);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(105);
					functionArgs();
					}
				}

				setState(108);
				match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(QBASICParser.DIGITS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		"\u0004\u0001,r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001\u0001"+
		"\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"1\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003P\b\u0003\n\u0003\f\u0003S\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006a\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007k\b\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0002\u0001\u0000\u0006\t\u0001\u0000\f\r\u007f\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004J\u0001\u0000"+
		"\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000"+
		"\nX\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000em\u0001\u0000"+
		"\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0003\u0010\b\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !"+
		"\u0005\u001d\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u000e"+
		"\u0000\u0000#(\u0003\u000e\u0007\u0000$%\u0005\r\u0000\u0000%\'\u0003"+
		"\u000e\u0007\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)K\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,K\u0003\f\u0006"+
		"\u0000-0\u0005&\u0000\u0000./\u0005\n\u0000\u0000/1\u0005\r\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002K\u0003\b\u0004\u00003K\u0005\u0002\u0000\u00004K\u0005\u0003\u0000"+
		"\u00005K\u0005\u0004\u0000\u000067\u0005\u001a\u0000\u00007K\u0003\u000e"+
		"\u0007\u000089\u0005\u001b\u0000\u00009K\u0003\u000e\u0007\u0000:;\u0005"+
		"\u0012\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0005+\u0000\u0000=?\u0005"+
		"\u000f\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000"+
		"\u0000BC\u0005\u0011\u0000\u0000CK\u0003\u0004\u0002\u0000DE\u0005\u0013"+
		"\u0000\u0000EF\u0003\b\u0004\u0000FG\u0005\u0011\u0000\u0000GH\u0003\u000e"+
		"\u0007\u0000HK\u0001\u0000\u0000\u0000IK\u0003\u000e\u0007\u0000J\"\u0001"+
		"\u0000\u0000\u0000J+\u0001\u0000\u0000\u0000J-\u0001\u0000\u0000\u0000"+
		"J3\u0001\u0000\u0000\u0000J4\u0001\u0000\u0000\u0000J5\u0001\u0000\u0000"+
		"\u0000J6\u0001\u0000\u0000\u0000J8\u0001\u0000\u0000\u0000J:\u0001\u0000"+
		"\u0000\u0000JD\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0005"+
		"\u0001\u0000\u0000\u0000LQ\u0003\b\u0004\u0000MN\u0005\f\u0000\u0000N"+
		"P\u0003\b\u0004\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0005\u0015\u0000\u0000UW\u0003"+
		"\n\u0005\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\t"+
		"\u0001\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000Y\u000b\u0001\u0000"+
		"\u0000\u0000Z_\u0003\u000e\u0007\u0000[\\\u0007\u0001\u0000\u0000\\^\u0003"+
		"\u000e\u0007\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000be\u0005\n\u0000\u0000ce\u0003\u0010\b"+
		"\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000en\u0001\u0000"+
		"\u0000\u0000fn\u0003\b\u0004\u0000gh\u0005+\u0000\u0000hj\u0005\u000f"+
		"\u0000\u0000ik\u0003\u0006\u0003\u0000ji\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0005\u0010\u0000\u0000"+
		"md\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000"+
		"\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005\u0016\u0000\u0000p\u0011"+
		"\u0001\u0000\u0000\u0000\r\u0015\u001b\u001e(0?JQV_djm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}