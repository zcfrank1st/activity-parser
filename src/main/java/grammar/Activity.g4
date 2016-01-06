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
    : label opt threshold ('->' result)?
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
    : side effect?
    ;

side
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

INT           : [0-9]+;
WS            : [' '\r\t\n]+ -> skip;