package listeners

import com.google.common.escape.ArrayBasedCharEscaper

class Listener: QBASICBaseListener() {
    var scriptString = """
import os
import math
        
def cls():
    os.system('cls' if os.name=='nt' else 'clear')

""".trimIndent()
    private var indentationLevel = 0

    private fun processIndent(): String {
        var indentString = ""

        if (indentationLevel == 0) return indentString

        for (i in 0..indentationLevel) {
           indentString += """  """
        }

        return indentString
    }

    private fun processExpression(ctx: QBASICParser.ExpressionContext): String {
        return when (ctx) {
            is QBASICParser.LiteralExpressionContext -> ctx.text
            is QBASICParser.FunctionReferenceExpressionContext -> processFunctionReference(ctx)
            is QBASICParser.ReferenceExpressionContext -> ctx.text
            is QBASICParser.ExponentionalExpressionContext -> "${processExpression(ctx.expression().first())} ** ${processExpression(ctx.expression().last())}"
            is QBASICParser.AdditiveExpressionContext -> "${processExpression(ctx.expression().first())} ${processAdditiveInfix(ctx)} ${processExpression(ctx.expression().last())}"
            is QBASICParser.MultiplicativeExpressionContext -> "${processExpression(ctx.expression().first())} ${processMultiplicativeInfix(ctx)} ${processExpression(ctx.expression().last())}"
            is QBASICParser.ParentheticalExpressionContext -> "(${processExpression(ctx.expression())})"
            is QBASICParser.ModExpressionContext -> "int(${processExpression(ctx.expression().first())}) % int(${processExpression(ctx.expression().last())})"
            is QBASICParser.ComparisonExpressionContext -> processComparisonExpression(ctx)
            is QBASICParser.ConjunctiveExpressionContext -> "${processExpression(ctx.expression().first())} and ${processExpression(ctx.expression().last())}"
            is QBASICParser.DisjunctiveExpressionContext -> "${processExpression(ctx.expression().first())} or ${processExpression(ctx.expression().last())}"
            is QBASICParser.PrintExpressionContext -> processPrintExpression(ctx)
            else -> ""
        }
    }

    private fun processComparisonExpression(ctx: QBASICParser.ComparisonExpressionContext): String {
        val comparator = when (ctx.comparator().text) {
            "=" -> "=="
            "<>" -> "!="
            "<" -> "<"
            "<=" -> "<="
            ">" -> ">"
            ">=" -> ">="
            else -> ""
        }

        return "${processExpression(ctx.expression().first())} $comparator ${processExpression(ctx.expression().last())}"
    }

    private fun processFunctionReference(ctx: QBASICParser.FunctionReferenceExpressionContext): String {
        var expressionChain = ""
        ctx.functionArgs()?.expression()?.forEach { exp ->
            expressionChain += processExpression(exp)
        }
        return when (ctx.FUNCTION_NAME().text) {
            "SQR" -> "math.sqrt(${expressionChain})"
            else -> "${ctx.FUNCTION_NAME().text}(${expressionChain})"
        }
    }

    private fun processMultiplicativeInfix(ctx: QBASICParser.MultiplicativeExpressionContext): String {
        return if (ctx.MULT() != null) "*" else "/"
    }
    private fun processAdditiveInfix(ctx: QBASICParser.AdditiveExpressionContext): String {
        return if (ctx.ADD() != null) "+" else "-"
    }

    override fun enterInputStatement(ctx: QBASICParser.InputStatementContext) {
        val indent = processIndent()
        val prompt = if (ctx.STRING() == null) "" else ctx.STRING().text
        scriptString += "${indent}${ctx.varName().text} = input($prompt)\n"
    }

    override fun enterPrintStatement(ctx: QBASICParser.PrintStatementContext) {
        val indent = processIndent()
        var expressions = ""

        ctx.expression().forEach { exp ->
            expressions += "str(${processExpression(exp)}),"
        }

        scriptString += "${indent}print($expressions)\n"
    }

    private fun processPrintExpression(ctx: QBASICParser.PrintExpressionContext): String {
        var expressions = ""

        ctx.expression().forEach { exp ->
            expressions += "str(${processExpression(exp)}),"
        }

        return "print($expressions)"
    }

    override fun enterAssignmentStatement(ctx: QBASICParser.AssignmentStatementContext) {
        val indent = processIndent()
        scriptString += "${indent}${ctx.varName().text} = ${processExpression(ctx.expression())}\n"
    }

    override fun enterFunctionStatement(ctx: QBASICParser.FunctionStatementContext) {
        var expressionChain = ""
        ctx.functionArgs()?.expression()?.forEach { exp ->
            expressionChain += processExpression(exp)
        }
        val indent = processIndent()
        scriptString += "${indent}def ${ctx.FUNCTION_NAME().text}(${expressionChain}):\n"
        indentationLevel++
    }

    override fun exitFunctionStatement(ctx: QBASICParser.FunctionStatementContext) {
       indentationLevel--
    }

    override fun enterFunctionReferenceExpression(ctx: QBASICParser.FunctionReferenceExpressionContext) {
       val indent = processIndent()
       scriptString += "${indent}${processExpression(ctx)}\n"
    }

    override fun enterConditionalStatement(ctx: QBASICParser.ConditionalStatementContext) {
       val indent = processIndent()

        if (ctx.ELSE() != null)
           scriptString += """
               ${indent}if ${processExpression(ctx.expression().first())}:
               $indent    ${processExpression(ctx.expression()[1])}
               ${indent}else:
               $indent    ${processExpression(ctx.expression().last())}
           """.trimIndent()
        else
            scriptString += """
               ${indent}if ${processExpression(ctx.expression().first())}:
               $indent    ${processExpression(ctx.expression()[1])}
            """.trimIndent()
    }
//    override fun enterModExpression(ctx: QBASICParser.ModExpressionContext) {
//       val indent = processIndent()
//       scriptString += "${indent}${processExpression(ctx)}\n"
//    }

//    private fun processExpression(statement: QBASICParser.StatementContext): String {
//        return when (statement) {
//            is QBASICParser.PrintStatementContext -> "print(${statement.expression().text})"
//            else -> ""
//        }
//    }
override fun enterClearScreenStatement(ctx: QBASICParser.ClearScreenStatementContext) { val indent = processIndent()
        scriptString += "${indent}cls()\n"
    }
 }