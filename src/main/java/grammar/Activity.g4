grammar Activity;
// grammar

//init: main+;

main
    : type '{' expr_list '}'
    ;

type
    : AND
    | OR
    ;

expr_list
    : (expr ';'?)*
    ;

expr
    : name '@' label opt threshold ('->' result)?
    ;

name
    : LITERALS
    ;

label
    : QUANTITY
    | TOTAL_PRICE
    ;

opt
    : GE
    | EQ
    | GT
    ;

threshold
    : INT
    ;

result
    : host effect?
    ;

host
    : ITEM
    | TOTAL_PRICE
    | SINGLE_PRICE
    | EXPRESS
    ;

effect
      : INT (',' INT)*
      | MINUS_VALUE
      ;

// lexical
AND           : 'AND';
OR            : 'OR';

QUANTITY      : 'QUANTITY';
TOTAL_PRICE   : 'TOTAL_PRICE';
ITEM          : 'ITEM';
SINGLE_PRICE  : 'SINGLE_PRICE';

EXPRESS       : 'EXPRESS';

GT            : '>';
EQ            : '=';
GE            : '>=';

MINUS_VALUE   : '-'[0-9]+;

LITERALS      : ('\u0080'..'\ufffe')+;
INT           : [0-9]+;
WS            : [' '\r\t\n]+ -> skip;