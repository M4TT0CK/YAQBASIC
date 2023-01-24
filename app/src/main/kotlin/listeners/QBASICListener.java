// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QBASICParser}.
 */
public interface QBASICListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QBASICParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QBASICParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QBASICParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(QBASICParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(QBASICParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(QBASICParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(QBASICParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LPrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLPrintStatement(QBASICParser.LPrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LPrintStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLPrintStatement(QBASICParser.LPrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(QBASICParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(QBASICParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BeepStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeepStatement(QBASICParser.BeepStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BeepStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeepStatement(QBASICParser.BeepStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClearStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearStatement(QBASICParser.ClearStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClearStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearStatement(QBASICParser.ClearStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClearScreenStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearScreenStatement(QBASICParser.ClearScreenStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClearScreenStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearScreenStatement(QBASICParser.ClearScreenStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(QBASICParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(QBASICParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GosubStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGosubStatement(QBASICParser.GosubStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GosubStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGosubStatement(QBASICParser.GosubStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(QBASICParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(QBASICParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(QBASICParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(QBASICParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(QBASICParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(QBASICParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(QBASICParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link QBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(QBASICParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(QBASICParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(QBASICParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(QBASICParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(QBASICParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#typeChar}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(QBASICParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#typeChar}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(QBASICParser.TypeCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#printList}.
	 * @param ctx the parse tree
	 */
	void enterPrintList(QBASICParser.PrintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#printList}.
	 * @param ctx the parse tree
	 */
	void exitPrintList(QBASICParser.PrintListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentionalExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentionalExpression(QBASICParser.ExponentionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentionalExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentionalExpression(QBASICParser.ExponentionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(QBASICParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(QBASICParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(QBASICParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(QBASICParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentheticalExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheticalExpression(QBASICParser.ParentheticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentheticalExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheticalExpression(QBASICParser.ParentheticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(QBASICParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(QBASICParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(QBASICParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(QBASICParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(QBASICParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(QBASICParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(QBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(QBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReferenceExpression(QBASICParser.FunctionReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionReferenceExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReferenceExpression(QBASICParser.FunctionReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjunctiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConjunctiveExpression(QBASICParser.ConjunctiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjunctiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConjunctiveExpression(QBASICParser.ConjunctiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(QBASICParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(QBASICParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctiveExpression(QBASICParser.DisjunctiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctiveExpression}
	 * labeled alternative in {@link QBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctiveExpression(QBASICParser.DisjunctiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(QBASICParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(QBASICParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QBASICParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(QBASICParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link QBASICParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(QBASICParser.NumberContext ctx);
}