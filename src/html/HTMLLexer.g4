lexer grammar HTMLLexer;

VARIABLE_START : '{{'  -> pushMode(JINJA);
BLOCK_START    : '{%' -> pushMode(JINJA);

COMMENT: '<!--' .*? '-->' -> skip;

WS: [ \t\r\n]+ -> skip;
TEXT: ~[<{]+ ;
DOC: '<!' -> pushMode(DOCTYPE);
OPEN_STYLE: '<style>' -> pushMode(CSS);
TAG_OPEN: '<' -> pushMode(TAG);

//------------------------------------------------------------------------------------------

mode TAG;
SPACE_TAG: (' ' | '\t' | '\r'? '\n') -> skip;
TAG_CLOSE: '>' -> popMode;
TAG_SLASH_CLOSE: '/>' -> popMode;
TAG_SLASH: '/';
EQUALS: '=' -> pushMode(ATTVALUE);

// Explicit keyword tokens for standard HTML tags (FIX 1) - must precede TAG_NAME
// so that reserved tag names are lexed distinctly and closing tags can be matched
// against the exact opening tag at parse time.
TAG_HTML: 'html';
TAG_HEAD: 'head';
TAG_BODY: 'body';
TAG_TITLE: 'title';
TAG_META: 'meta';
TAG_LINK: 'link';
TAG_SCRIPT: 'script';
TAG_H1: 'h1';
TAG_H2: 'h2';
TAG_H3: 'h3';
TAG_H4: 'h4';
TAG_H5: 'h5';
TAG_H6: 'h6';
TAG_P: 'p';
TAG_SPAN: 'span';
TAG_DIV: 'div';
TAG_BR: 'br';
TAG_HR: 'hr';
TAG_PRE: 'pre';
TAG_BLOCKQUOTE: 'blockquote';
TAG_B: 'b';
TAG_STRONG: 'strong';
TAG_I: 'i';
TAG_EM: 'em';
TAG_U: 'u';
TAG_SMALL: 'small';
TAG_MARK: 'mark';
TAG_SUB: 'sub';
TAG_SUP: 'sup';
TAG_UL: 'ul';
TAG_OL: 'ol';
TAG_LI: 'li';
TAG_DL: 'dl';
TAG_DT: 'dt';
TAG_DD: 'dd';
TAG_A: 'a';
TAG_IMG: 'img';
TAG_AUDIO: 'audio';
TAG_VIDEO: 'video';
TAG_SOURCE: 'source';
TAG_IFRAME: 'iframe';
TAG_TABLE: 'table';
TAG_THEAD: 'thead';
TAG_TBODY: 'tbody';
TAG_TFOOT: 'tfoot';
TAG_TR: 'tr';
TAG_TH: 'th';
TAG_TD: 'td';
TAG_CAPTION: 'caption';
TAG_FORM: 'form';
TAG_INPUT: 'input';
TAG_BUTTON: 'button';
TAG_SELECT: 'select';
TAG_OPTION: 'option';
TAG_TEXTAREA: 'textarea';
TAG_LABEL: 'label';
TAG_FIELDSET: 'fieldset';
TAG_LEGEND: 'legend';
TAG_HEADER: 'header';
TAG_FOOTER: 'footer';
TAG_NAV: 'nav';
TAG_MAIN: 'main';
TAG_SECTION: 'section';
TAG_ARTICLE: 'article';
TAG_ASIDE: 'aside';
TAG_FIGURE: 'figure';
TAG_FIGCAPTION: 'figcaption';

TAG_NAME: [a-zA-Z][a-zA-Z0-9]*;

//------------------------------------------------------------------------------------------

mode ATTVALUE;
SPACE_ATT: (' ' | '\t' | '\r'? '\n')+ -> skip;
ATTR_VALUE: ('"' (~["{=}])* '"' | '\'' (~['{=}])* '\'' |  ~[ {}<>='"/]+) -> popMode;
JINJA_VAR_DQ:  '"{{' -> pushMode(JINJA);
JINJA_VAR_SQ:  '\'{{' -> pushMode(JINJA);
VJ_OPEN: '{{' -> pushMode(JINJA);
DQ:  ["] ->popMode;
SQ:  [']->popMode;

//------------------------------------------------------------------------------------------

mode DOCTYPE;
SPACE_DOCTYPE: (' ' | '\t' | '\r'? '\n')+ -> skip;
HTML_DOCTYPE:  [dD][oO][cC][tT][yY][pP][eE];
HTML: 'html';
DOCTYPE_CLOSE: '>' -> popMode;

//------------------------------------------------------------------------------------------

mode JINJA;

COMMENT_JINJA2 : '{#' .*? '#}' -> skip ;

IF    : 'if' ;
ELSE  : 'else' ;
ELIF  : 'elif';
ENDIF : 'endif' ;
FOR   : 'for' ;
IN    : 'in' ;
ENDFOR: 'endfor' ;
AND   : 'and' ;
OR    : 'or' ;
NOT   : 'not' ;
TRUE  : 'True' ;
FALSE : 'False' ;
NONE  : 'None' ;

OPERATOR : '==' | '!=' | '<=' | '>=' | '>' | '<' ;
MUL: '*';
ADD: '+';
SUB: '-';
DIV: '/';
MOD: '%';
DOT : '.' ;
COMMA: ',';
EQUAL: '=';
OPEN_B: '(';
CLOSE_B: ')';

NUMBER     : [0-9]+ ('.' [0-9]+)? ;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING     : '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'' ;

WS_J : [ \t\r\n]+ -> skip ;

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
HexColor     : '#' HexDigit HexDigit HexDigit (HexDigit HexDigit HexDigit)?;