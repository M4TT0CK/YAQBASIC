
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
    : 'PRINT' expression              #PrintStatement
    | 'LPRINT' printList              #LPrintStatement
    | 'BEEP'                          #BeepStatement
    | 'CLEAR'                         #ClearStatement
    | 'CLS'                           #ClearScreenStatement
    | 'GOTO' expression               #GotoStatement
    | 'GOSUB' expression              #GosubStatement
    | 'LET' varName '=' expression    #AssignmentStatement
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
    : (STRING | number)               #LiteralExpression
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
    : 'FN' [A-Z]
    | [A-Z][A-Z][A-Z]
    ;

WS
    : [ \t] -> skip
    ;