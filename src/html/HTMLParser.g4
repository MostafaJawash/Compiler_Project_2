parser grammar HTMLParser;

@header {
package html.generated;
}

options { tokenVocab=HTMLLexer; }

htmlDocument
    : doctype? htmlElement EOF
    ;

doctype
    : DOC HTML_DOCTYPE SPACE_DOCTYPE? HTML DOCTYPE_CLOSE
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (( TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? ) | (TAG_SLASH_CLOSE))
    | styleElement
    ;

htmlContent
   :(template | TEXT)* (htmlElement (template | TEXT)*)*
   ;

styleElement
    : OPEN_STYLE stylesheet CLOSE_STYLE
    ;

htmlAttribute
    : SPACE_TAG TAG_NAME SPACE_TAG? (EQUALS SPACE_ATT? attrValue SPACE_TAG?)?
    ;

attrValue
   : JINJA_VAR_DQ (expr | exprMath | funCall | exprLogic)?  VARIABLE_END SPACE_ATT? (VJ_OPEN SPACE_ATT? (expr | exprMath | funCall | exprLogic )? SPACE_ATT? VARIABLE_END SPACE_ATT?)* DQ  #dqJINJA
   | JINJA_VAR_SQ (expr | exprMath | funCall | exprLogic)?  VARIABLE_END SPACE_ATT? (VJ_OPEN SPACE_ATT? (expr | exprMath | funCall | exprLogic)? SPACE_ATT? VARIABLE_END SPACE_ATT?)* SQ  #sqJINJA
   | ATTR_VALUE #attValue
   ;

//----------------------------------------------------------------------------------------------------------------------

template
    : ( variable | block )+
    ;


variable
    : VARIABLE_START (expr | exprMath | funCall | exprLogic)? VARIABLE_END
    ;


block
    :forStmt #forBlock
    | ifStmt #ifBlock
    ;


ifStmt
    :BLOCK_START IF (expr | exprLogic)  BLOCK_END (template | htmlElement | TEXT)+ elifStm*  elseStm? BLOCK_START ENDIF BLOCK_END
    ;

elifStm
    :BLOCK_START ELIF (expr | exprLogic)  BLOCK_END (template | htmlElement | TEXT)+
    ;

elseStm
    :BLOCK_START ELSE  BLOCK_END (template | htmlElement | TEXT)+
    ;


forStmt
    :BLOCK_START FOR IDENTIFIER (COMMA IDENTIFIER)* IN ( IDENTIFIER(DOT IDENTIFIER)* | STRING | funCall )  BLOCK_END (template | htmlElement | TEXT)* BLOCK_START ENDFOR BLOCK_END
    ;


expr
    : IDENTIFIER (DOT IDENTIFIER)* #identefierEXPR
    | NUMBER #numberEXPR
    | STRING #stringEXPR
    | (TRUE | FALSE)  #booleanEXPR
    | NONE #noneEXPR
    ;


 exprMath
     :OPEN_B exprMath CLOSE_B #bracketMathOperation
     | exprMath MUL exprMath #mulOperation
     | exprMath DIV exprMath #divOperation
     | exprMath ADD exprMath #addOperation
     | exprMath SUB exprMath #subOperation
     | exprMath MOD exprMath #modOperation
     | IDENTIFIER #idMath
     | NUMBER #numberMath
     ;


funCall
   : IDENTIFIER OPEN_B arguments? CLOSE_B
   ;

arguments
   : argument (COMMA argument)*
   ;

argument
   : arg #nonAssign
   | IDENTIFIER(DOT IDENTIFIER)*(EQUAL valueFun)? #assign
   ;

arg
   : (TRUE | FALSE) #boolArg
   | NONE #noneArg
   | NUMBER #numberArg
   | STRING #strArg
   | IDENTIFIER(DOT IDENTIFIER)* #idArg
   ;

valueFun
   : (TRUE | FALSE) #boolVal
   | NONE #noneVal
   | NUMBER  #numberVal
   | STRING #strVal
   | IDENTIFIER(DOT IDENTIFIER)* #idValue
   | exprMath #expMathVal
   | funCall #funCallVal
   ;


exprLogic
   : OPEN_B exprLogic CLOSE_B #bracketLogicOperation
   | NOT logicalArg #notOperation
   | logicalArg AND logicalArg #andOperation
   | logicalArg OR logicalArg #orOperation
   | logicalArg OPERATOR logicalArg #compareOperation
   ;

logicalArg
   :IDENTIFIER (DOT IDENTIFIER)* #idLogic
   | STRING #strLogic
   | (TRUE | FALSE) #boolLogic
   | NONE #noneLogic
   | NUMBER #numberLogic
   | exprMath #exprMathLogic
   ;

//----------------------------------------------------------------------------------------------------------------------

stylesheet
    : ruleSet*
    ;

ruleSet
    : selector OpenBrace declaration* CloseBrace
    ;

selector
    : complexSelector (Comma complexSelector)*
    ;

complexSelector
    : simpleSelector+
    ;

simpleSelector
    : Ident (Colon Ident)? #identSelector
    | Dot Ident #dotIdentSelector
    | Hash Ident #hashIdentSelector
    | Multiply #multiplySelector
    ;

declaration
    : property Colon value SemiColon?
    ;

property
    : Ident
    ;

value
    : component+
    ;

component
    : singleValue #singleValComponent
    | Slash #slashComponent
    | Comma #commaComponent
    ;

singleValue
    : Number Ident? #numIdSingleVal
    | String #strSingleVla
    | Ident #idSingleVal
    | Number PercentSign #numberPerSingleVal
    | HexColor #hexColorSingleVal
    ;