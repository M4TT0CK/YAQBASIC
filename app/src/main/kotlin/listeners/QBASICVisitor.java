// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QBASICParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QBASICVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QBASICParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QBASICParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(QBASICParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(QBASICParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LPrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLPrintStatement(QBASICParser.LPrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(QBASICParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BeepStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeepStatement(QBASICParser.BeepStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClearStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearStatement(QBASICParser.ClearStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClearScreenStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearScreenStatement(QBASICParser.ClearScreenStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(QBASICParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GosubStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosubStatement(QBASICParser.GosubStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(QBASICParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(QBASICParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(QBASICParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(QBASICParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(QBASICParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#typeChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(QBASICParser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#printList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintList(QBASICParser.PrintListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(QBASICParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(QBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReferenceExpression(QBASICParser.FunctionReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QBASICParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(QBASICParser.NumberContext ctx);
}