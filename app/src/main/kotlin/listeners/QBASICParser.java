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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, STRING=19, REM_TEXT=20, COMMA=21, SEMI_COLON=22, PRINT=23, L_PAREN=24, 
		R_PAREN=25, EQUALS=26, DEF=27, LET=28, FOR=29, VAR=30, DIGITS=31, DIGIT=32, 
		END=33, STOP=34, GOTO=35, GOSUB=36, RETURN=37, EOL=38, DIM=39, READ=40, 
		DATA=41, IF=42, THEN=43, ELSE=44, TO=45, STEP=46, NEXT=47, INPUT=48, MULT=49, 
		DIVIDE=50, ADD=51, SUBTRACT=52, FUNCTION_NAME=53, WS=54;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_functionArgs = 3, 
		RULE_varName = 4, RULE_typeChar = 5, RULE_printList = 6, RULE_expression = 7, 
		RULE_comparator = 8, RULE_number = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "functionArgs", "varName", "typeChar", 
			"printList", "expression", "comparator", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LPRINT'", "'BEEP'", "'CLEAR'", "'CLS'", "'FN'", "'%'", "'&'", 
			"'#'", "'$'", "'^'", "'MOD'", "'AND'", "'OR'", "'<>'", "'<'", "'<='", 
			"'>'", "'>='", null, null, "','", "';'", "'PRINT'", "'('", "')'", "'='", 
			"'DEF'", "'LET'", "'FOR'", null, null, null, "'END'", "'STOP'", "'GOTO'", 
			"'GOSUB'", "'RETURN'", null, "'DIM'", "'READ'", "'DATA'", "'IF'", "'THEN'", 
			"'ELSE'", "'TO'", "'STEP'", "'NEXT'", "'INPUT'", "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "REM_TEXT", "COMMA", 
			"SEMI_COLON", "PRINT", "L_PAREN", "R_PAREN", "EQUALS", "DEF", "LET", 
			"FOR", "VAR", "DIGITS", "DIGIT", "END", "STOP", "GOTO", "GOSUB", "RETURN", 
			"EOL", "DIM", "READ", "DATA", "IF", "THEN", "ELSE", "TO", "STEP", "NEXT", 
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 9293453884653598L) != 0) {
				{
				{
				setState(20);
				line();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				number();
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9293179006746654L) != 0) {
				{
				setState(31);
				statement();
				}
			}

			setState(34);
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
	public static class ConditionalStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(QBASICParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(QBASICParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(QBASICParser.ELSE, 0); }
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitConditionalStatement(this);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(PRINT);
				setState(37);
				expression(0);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON) {
					{
					{
					setState(38);
					match(SEMI_COLON);
					setState(39);
					expression(0);
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LPrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__0);
				setState(46);
				printList();
				}
				break;
			case 3:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(INPUT);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(48);
					match(STRING);
					setState(49);
					match(SEMI_COLON);
					}
				}

				setState(52);
				varName();
				}
				break;
			case 4:
				_localctx = new BeepStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ClearStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new ClearScreenStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(GOTO);
				setState(57);
				expression(0);
				}
				break;
			case 8:
				_localctx = new GosubStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(GOSUB);
				setState(59);
				expression(0);
				}
				break;
			case 9:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				match(DEF);
				setState(61);
				match(T__4);
				setState(62);
				match(FUNCTION_NAME);
				setState(63);
				match(L_PAREN);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007202501656576L) != 0) {
					{
					setState(64);
					functionArgs();
					}
				}

				setState(67);
				match(R_PAREN);
				setState(68);
				match(EQUALS);
				setState(69);
				statement();
				}
				break;
			case 10:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				match(LET);
				setState(71);
				varName();
				setState(72);
				match(EQUALS);
				setState(73);
				expression(0);
				}
				break;
			case 11:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(75);
				expression(0);
				}
				break;
			case 12:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(76);
				match(IF);
				setState(77);
				expression(0);
				setState(78);
				match(THEN);
				setState(79);
				expression(0);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(80);
					match(ELSE);
					setState(81);
					expression(0);
					}
				}

				}
				break;
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
			setState(86);
			expression(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				expression(0);
				}
				}
				setState(93);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(VAR);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(95);
				typeChar();
				}
				break;
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
			setState(98);
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
			setState(100);
			expression(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMI_COLON) {
				{
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expression(0);
				}
				}
				setState(107);
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
	public static class ExponentionalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExponentionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterExponentionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitExponentionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitExponentionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(QBASICParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(QBASICParser.SUBTRACT, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentheticalExpressionContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(QBASICParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(QBASICParser.R_PAREN, 0); }
		public ParentheticalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterParentheticalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitParentheticalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitParentheticalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpressionContext extends ExpressionContext {
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
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
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
	public static class ModExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitModExpression(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConjunctiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterConjunctiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitConjunctiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitConjunctiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(QBASICParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(QBASICParser.DIVIDE, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DisjunctiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterDisjunctiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitDisjunctiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitDisjunctiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case DIGITS:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(109);
					match(STRING);
					}
					break;
				case DIGITS:
					{
					setState(110);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VAR:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				varName();
				}
				break;
			case FUNCTION_NAME:
				{
				_localctx = new FunctionReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(FUNCTION_NAME);
				setState(115);
				match(L_PAREN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007202501656576L) != 0) {
					{
					setState(116);
					functionArgs();
					}
				}

				setState(119);
				match(R_PAREN);
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParentheticalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(L_PAREN);
				setState(121);
				expression(0);
				setState(122);
				match(R_PAREN);
				}
				break;
			case PRINT:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(PRINT);
				setState(125);
				expression(0);
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						match(SEMI_COLON);
						setState(127);
						expression(0);
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(136);
						match(T__9);
						setState(137);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(139);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						match(T__10);
						setState(146);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						comparator();
						setState(149);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ConjunctiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(152);
						match(T__11);
						setState(153);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new DisjunctiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(155);
						match(T__12);
						setState(156);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(QBASICParser.EQUALS, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QBASICListener ) ((QBASICListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QBASICVisitor ) return ((QBASICVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67616768L) != 0) ) {
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
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00016\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002S\b\u0002\u0003\u0002"+
		"U\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Z\b\u0003\n\u0003"+
		"\f\u0003]\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006"+
		"\n\u0006\f\u0006k\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"p\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"v\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0081\b\u0007"+
		"\n\u0007\f\u0007\u0084\t\u0007\u0003\u0007\u0086\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009e\b\u0007\n\u0007\f\u0007"+
		"\u00a1\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0001\u000e"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0005\u0001\u0000"+
		"\u0006\t\u0001\u0000\u0015\u0016\u0001\u000034\u0001\u000012\u0002\u0000"+
		"\u000e\u0012\u001a\u001a\u00bf\u0000\u0017\u0001\u0000\u0000\u0000\u0002"+
		"\u001d\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006V\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000\u0010"+
		"\u00a2\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b"+
		"\u0001\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0012\t\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005&"+
		"\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0017\u0000\u0000"+
		"%*\u0003\u000e\u0007\u0000&\'\u0005\u0016\u0000\u0000\')\u0003\u000e\u0007"+
		"\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+U\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000.U\u0003\f\u0006\u0000/2\u0005"+
		"0\u0000\u000001\u0005\u0013\u0000\u000013\u0005\u0016\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4U\u0003\b\u0004\u00005U\u0005\u0002\u0000\u00006U\u0005\u0003\u0000\u0000"+
		"7U\u0005\u0004\u0000\u000089\u0005#\u0000\u00009U\u0003\u000e\u0007\u0000"+
		":;\u0005$\u0000\u0000;U\u0003\u000e\u0007\u0000<=\u0005\u001b\u0000\u0000"+
		"=>\u0005\u0005\u0000\u0000>?\u00055\u0000\u0000?A\u0005\u0018\u0000\u0000"+
		"@B\u0003\u0006\u0003\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0019\u0000\u0000DE\u0005\u001a"+
		"\u0000\u0000EU\u0003\u0004\u0002\u0000FG\u0005\u001c\u0000\u0000GH\u0003"+
		"\b\u0004\u0000HI\u0005\u001a\u0000\u0000IJ\u0003\u000e\u0007\u0000JU\u0001"+
		"\u0000\u0000\u0000KU\u0003\u000e\u0007\u0000LM\u0005*\u0000\u0000MN\u0003"+
		"\u000e\u0007\u0000NO\u0005+\u0000\u0000OR\u0003\u000e\u0007\u0000PQ\u0005"+
		",\u0000\u0000QS\u0003\u000e\u0007\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000T$\u0001\u0000\u0000\u0000"+
		"T-\u0001\u0000\u0000\u0000T/\u0001\u0000\u0000\u0000T5\u0001\u0000\u0000"+
		"\u0000T6\u0001\u0000\u0000\u0000T7\u0001\u0000\u0000\u0000T8\u0001\u0000"+
		"\u0000\u0000T:\u0001\u0000\u0000\u0000T<\u0001\u0000\u0000\u0000TF\u0001"+
		"\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000V[\u0003\u000e\u0007\u0000WX\u0005\u0015"+
		"\u0000\u0000XZ\u0003\u000e\u0007\u0000YW\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\\u0007\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0005\u001e"+
		"\u0000\u0000_a\u0003\n\u0005\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\t\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000c\u000b"+
		"\u0001\u0000\u0000\u0000di\u0003\u000e\u0007\u0000ef\u0007\u0001\u0000"+
		"\u0000fh\u0003\u000e\u0007\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\r\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lo\u0006\u0007\uffff\uffff"+
		"\u0000mp\u0005\u0013\u0000\u0000np\u0003\u0012\t\u0000om\u0001\u0000\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000p\u0086\u0001\u0000\u0000\u0000q\u0086"+
		"\u0003\b\u0004\u0000rs\u00055\u0000\u0000su\u0005\u0018\u0000\u0000tv"+
		"\u0003\u0006\u0003\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u0086\u0005\u0019\u0000\u0000xy\u0005"+
		"\u0018\u0000\u0000yz\u0003\u000e\u0007\u0000z{\u0005\u0019\u0000\u0000"+
		"{\u0086\u0001\u0000\u0000\u0000|}\u0005\u0017\u0000\u0000}\u0082\u0003"+
		"\u000e\u0007\u0000~\u007f\u0005\u0016\u0000\u0000\u007f\u0081\u0003\u000e"+
		"\u0007\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085l\u0001\u0000\u0000\u0000\u0085q\u0001\u0000\u0000\u0000\u0085"+
		"r\u0001\u0000\u0000\u0000\u0085x\u0001\u0000\u0000\u0000\u0085|\u0001"+
		"\u0000\u0000\u0000\u0086\u009f\u0001\u0000\u0000\u0000\u0087\u0088\n\t"+
		"\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u009e\u0003\u000e\u0007"+
		"\n\u008a\u008b\n\b\u0000\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c"+
		"\u009e\u0003\u000e\u0007\t\u008d\u008e\n\u0007\u0000\u0000\u008e\u008f"+
		"\u0007\u0003\u0000\u0000\u008f\u009e\u0003\u000e\u0007\b\u0090\u0091\n"+
		"\u0006\u0000\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092\u009e\u0003"+
		"\u000e\u0007\u0007\u0093\u0094\n\u0004\u0000\u0000\u0094\u0095\u0003\u0010"+
		"\b\u0000\u0095\u0096\u0003\u000e\u0007\u0005\u0096\u009e\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\n\u0003\u0000\u0000\u0098\u0099\u0005\f\u0000\u0000"+
		"\u0099\u009e\u0003\u000e\u0007\u0004\u009a\u009b\n\u0002\u0000\u0000\u009b"+
		"\u009c\u0005\r\u0000\u0000\u009c\u009e\u0003\u000e\u0007\u0003\u009d\u0087"+
		"\u0001\u0000\u0000\u0000\u009d\u008a\u0001\u0000\u0000\u0000\u009d\u008d"+
		"\u0001\u0000\u0000\u0000\u009d\u0090\u0001\u0000\u0000\u0000\u009d\u0093"+
		"\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u000f"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0007\u0004\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u001f\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u0011\u0017"+
		"\u001d *2ART[`iou\u0082\u0085\u009d\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}