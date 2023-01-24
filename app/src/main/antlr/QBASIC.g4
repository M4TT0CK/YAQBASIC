
grammar QBASIC;

@header {
package listeners;
}

program
    : line* EOF
    ;

line
    : number? statement? EOL
    ;

statement
    : 'PRINT' expression (';' expression)*                       #PrintStatement
    | 'LPRINT' printList                                         #LPrintStatement
    | 'INPUT' (STRING ';')? varName                              #InputStatement
    | 'BEEP'                                                     #BeepStatement
    | 'CLEAR'                                                    #ClearStatement
    | 'CLS'                                                      #ClearScreenStatement
    | 'GOTO' expression                                          #GotoStatement
    | 'GOSUB' expression                                         #GosubStatement
    | 'DEF' 'FN' FUNCTION_NAME '('functionArgs?')' '=' statement #FunctionStatement
    | 'LET' varName '=' expression                               #AssignmentStatement
    | expression                                                 #ExpressionStatement
    | 'IF' expression 'THEN' expression ('ELSE' expression)?     #ConditionalStatement
    ;

functionArgs
    : expression (',' expression)*
    ;

varName
    :  VAR typeChar?
    ;
    
typeChar
    : '%'
    | '&'
    | '#'
    | '$'
    ;

printList
    : expression ((',' | ';') expression)*
    ;

expression
    : (STRING | number)                    #LiteralExpression
    | varName                              #ReferenceExpression
    | FUNCTION_NAME '(' functionArgs? ')'  #FunctionReferenceExpression
    | expression '^' expression            #ExponentionalExpression
    | expression ('+' | '-') expression    #AdditiveExpression
    | expression ('*' | '/') expression    #MultiplicativeExpression
    | expression 'MOD' expression          #ModExpression
    | '(' expression ')'                   #ParentheticalExpression
    | expression comparator expression     #ComparisonExpression
    | expression 'AND' expression          #ConjunctiveExpression
    | expression 'OR' expression           #DisjunctiveExpression
    | 'PRINT' expression (';' expression)* #PrintExpression
    ;

comparator
    : ('=' | '<>' | '<' | '<=' | '>' | '>=')
    ;

number
    : DIGITS
    ;

fragment TEXT
    : ~ ["\r\n]*
    ;

fragment REM
    : 'REM'
    ;

STRING
    : '"' TEXT '"'
    ;

REM_TEXT
    : REM TEXT
    ;

COMMA
    : ','
    ;

SEMI_COLON
    : ';'
    ;

PRINT
    : 'PRINT'
    ;

L_PAREN
    : '('
    ;

R_PAREN
    : ')'
    ;

EQUALS
    : '='
    ;

DEF
    : 'DEF'
    ;

LET
    : 'LET'
    ;

FOR
    : 'FOR'
    ;

VAR
    : [A-Z]
    | [A-Z]([a-z] | [0-9] | '.')*
    ;

DIGITS
    : [0-9]+
    ;

DIGIT
    : [0-9]
    ;

END
    : 'END'
    ;

STOP
    : 'STOP'
    ;

GOTO
    : 'GOTO'
    ;

GOSUB
    : 'GOSUB'
    ;

RETURN
    : 'RETURN'
    ;

EOL
    : [\r\n]+
    ;

DIM
    : 'DIM'
    ;

READ
    : 'READ'
    ;

DATA
    : 'DATA'
    ;
IF
    : 'IF'
    ;

THEN
    : 'THEN'
    ;

ELSE
    : 'ELSE'
    ;

TO
    : 'TO'
    ;

STEP
    : 'STEP'
    ;

NEXT
    : 'NEXT'
    ;

INPUT
    : 'INPUT'
    ;

MULT
    : '*'
    ;

DIVIDE
    : '/'
    ;

ADD
    : '+'
    ;

SUBTRACT
    : '-'
    ;

FUNCTION_NAME
    : ([a-z] | [A-Z] | [1-9])+
    ;

WS
    : [ \t] -> skip
    ;