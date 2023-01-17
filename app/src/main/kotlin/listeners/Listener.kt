package listeners

class Listener: QBASICBaseListener() {
    var scriptString = """
import os
        
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

    override fun enterInputStatement(ctx: QBASICParser.InputStatementContext) {
        val indent = processIndent()
        val prompt = if (ctx.STRING() == null) "" else ctx.STRING().text
        scriptString += "${indent}${ctx.varName().text} = input($prompt)\n"
    }

    override fun enterPrintStatement(ctx: QBASICParser.PrintStatementContext) {
        val indent = processIndent()
        var expressions = ""

        ctx.expression().forEach { exp ->
            expressions += "str(${exp.text}),"
        }

        scriptString += "${indent}print($expressions)\n"
    }

    override fun enterAssignmentStatement(ctx: QBASICParser.AssignmentStatementContext) {
        val indent = processIndent()
        scriptString += "${indent}${ctx.varName().text} = ${ctx.expression().text}\n"
    }

    override fun enterFunctionStatement(ctx: QBASICParser.FunctionStatementContext) {
        val indent = processIndent()
        scriptString += "${indent}def ${ctx.FUNCTION_NAME().text}():\n"
        indentationLevel++
    }

    override fun exitFunctionStatement(ctx: QBASICParser.FunctionStatementContext) {
       indentationLevel--
    }

    override fun enterFunctionReferenceExpression(ctx: QBASICParser.FunctionReferenceExpressionContext) {
       val indent = processIndent()
       scriptString += "${indent}${ctx.FUNCTION_NAME().text}()\n"
    }

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