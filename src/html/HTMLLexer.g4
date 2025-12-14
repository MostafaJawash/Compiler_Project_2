lexer grammar HTMLLexer;

VARIABLE_START : '{{'  -> pushMode(JINJA);
BLOCK_START    : '{%' -> pushMode(JINJA);
COMMENT: '<!--' .*? '-->' -> skip;
WS: [ \t\r\n]+ -> skip;
TEXT: ~[<{]+ ;
DOC: '<!' -> pushMode(DOCTYPE);
OPEN_STYLE: '<style>' -> pushMode(CSS);
TAG_OPEN: '<' -> pushMode(TAG);

mode TAG;
SPACE_TAG: (' ' | '\t' | '\r'? '\n')+;
TAG_CLOSE: '>' -> popMode;
TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';
EQUALS: '=' -> pushMode(ATTVALUE);
TAG_NAME: [a-zA-Z][a-zA-Z0-9]*;

mode ATTVALUE;
SPACE_ATT: (' ' | '\t' | '\r'? '\n')+;
ATTR_VALUE: ('"' (~["{=}])* '"' | '\'' (~['{=}])* '\'' |  ~[ {}<>='"/]+) -> popMode;
JINJA_VAR_DQ:  '"{{' -> pushMode(JINJA);
JINJA_VAR_SQ:  '\'{{' -> pushMode(JINJA);
VJ_OPEN: '{{' -> pushMode(JINJA);
DQ:  ["] ->popMode;
SQ:  [']->popMode;

mode DOCTYPE;
SPACE_DOCTYPE: (' ' | '\t' | '\r'? '\n')+;
HTML_DOCTYPE:  [dD][oO][cC][tT][yY][pP][eE];
HTML: 'html';
DOCTYPE_CLOSE: '>' -> popMode;

//------------------------------------------------------------------------------------------

mode JINJA;

COMMENT_JINJA2 : '{#' .*? '#}' -> skip ;
DOT : '.' ;
COMMA: ',';
EQUAL:'=';
IF    : 'if' ;
ELSE  : 'else' ;
ELIF: 'elif';
ENDIF : 'endif' ;
FOR   : 'for' ;
IN    : 'in' ;
ENDFOR: 'endfor' ;
OPERATOR :  '!=' | '==' | '<=' | '>=' | BIGER | SMALLER;
fragment BIGER: '>';
fragment SMALLER: '<';
MUL: '*';
ADD: '+';
AND: 'and';
OR: 'or';
NOT: 'not';
SUB: '-';
DIV:'/';
MOD: '%';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';
OPEN_B: '(';
CLOSE_B: ')';
NUMBER : ([1-9]+ [0-9]* ('.' [0-9]+)?) | [0];
STRING : '"' (~["\\] | '\\' .)* '"'
       | '\'' (~['\\] | '\\' .)* '\'' ;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;
WS_J: [ \t\r\n]+ -> skip;
VARIABLE_END: '}}' -> popMode;
BLOCK_END: '%}' -> popMode ;

//------------------------------------------------------------------------------------------

mode CSS;

OpenBrace    : '{';
CloseBrace   : '}';
OpenParen    : '(';
CloseParen   : ')';
SemiColon    : ';';
Colon        : ':';
Comma        : ',';
Dot          : '.';
Multiply     : '*';
Hash         : '#';
At           : '@';
PercentSign  : '%';
Slash: '/';

Ident        : [a-zA-Z_][a-zA-Z0-9_-]*;
Number       : [0-9]+ ('.' [0-9]+)?;
fragment HexDigit : [0-9a-fA-F] ;
CLOSE_STYLE: '</style>' -> popMode;
String       : '"' .*? '"' | '\'' .*? '\'';
Whitespace   : [ \t\r\n\f]+ -> skip;
Comment      : '/*' .*? '*/' -> skip;
HexColor
    : '#' HexDigit HexDigit HexDigit (HexDigit HexDigit HexDigit)?
    ;