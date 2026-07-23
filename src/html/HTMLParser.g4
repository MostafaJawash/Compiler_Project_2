parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : doctype? htmlElement EOF
    ;

doctype
    : DOC HTML_DOCTYPE HTML DOCTYPE_CLOSE
    ;

htmlElement
    : TAG_OPEN TAG_HTML htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_HTML TAG_CLOSE #HtmlRootElement
    | TAG_OPEN TAG_HTML htmlAttribute* TAG_SLASH_CLOSE                                           #HtmlRootSelfClose
    | TAG_OPEN TAG_HEAD htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_HEAD TAG_CLOSE #HeadElement
    | TAG_OPEN TAG_HEAD htmlAttribute* TAG_SLASH_CLOSE                                           #HeadSelfClose
    | TAG_OPEN TAG_BODY htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_BODY TAG_CLOSE #BodyElement
    | TAG_OPEN TAG_BODY htmlAttribute* TAG_SLASH_CLOSE                                           #BodySelfClose
    | TAG_OPEN TAG_TITLE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TITLE TAG_CLOSE #TitleElement
    | TAG_OPEN TAG_TITLE htmlAttribute* TAG_SLASH_CLOSE                                          #TitleSelfClose
    | TAG_OPEN TAG_META htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                             #MetaElement
    | TAG_OPEN TAG_LINK htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                             #LinkElement
    | TAG_OPEN TAG_SCRIPT htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SCRIPT TAG_CLOSE #ScriptElement
    | TAG_OPEN TAG_SCRIPT htmlAttribute* TAG_SLASH_CLOSE                                         #ScriptSelfClose
    | TAG_OPEN TAG_H1 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H1 TAG_CLOSE   #H1Element
    | TAG_OPEN TAG_H1 htmlAttribute* TAG_SLASH_CLOSE                                             #H1SelfClose
    | TAG_OPEN TAG_H2 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H2 TAG_CLOSE   #H2Element
    | TAG_OPEN TAG_H2 htmlAttribute* TAG_SLASH_CLOSE                                             #H2SelfClose
    | TAG_OPEN TAG_H3 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H3 TAG_CLOSE   #H3Element
    | TAG_OPEN TAG_H3 htmlAttribute* TAG_SLASH_CLOSE                                             #H3SelfClose
    | TAG_OPEN TAG_H4 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H4 TAG_CLOSE   #H4Element
    | TAG_OPEN TAG_H4 htmlAttribute* TAG_SLASH_CLOSE                                             #H4SelfClose
    | TAG_OPEN TAG_H5 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H5 TAG_CLOSE   #H5Element
    | TAG_OPEN TAG_H5 htmlAttribute* TAG_SLASH_CLOSE                                             #H5SelfClose
    | TAG_OPEN TAG_H6 htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_H6 TAG_CLOSE   #H6Element
    | TAG_OPEN TAG_H6 htmlAttribute* TAG_SLASH_CLOSE                                             #H6SelfClose
    | TAG_OPEN TAG_P htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_P TAG_CLOSE     #PElement
    | TAG_OPEN TAG_P htmlAttribute* TAG_SLASH_CLOSE                                              #PSelfClose
    | TAG_OPEN TAG_SPAN htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SPAN TAG_CLOSE #SpanElement
    | TAG_OPEN TAG_SPAN htmlAttribute* TAG_SLASH_CLOSE                                           #SpanSelfClose
    | TAG_OPEN TAG_DIV htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_DIV TAG_CLOSE #DivElement
    | TAG_OPEN TAG_DIV htmlAttribute* TAG_SLASH_CLOSE                                            #DivSelfClose
    | TAG_OPEN TAG_BR htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                               #BrElement
    | TAG_OPEN TAG_HR htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                               #HrElement
    | TAG_OPEN TAG_PRE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_PRE TAG_CLOSE #PreElement
    | TAG_OPEN TAG_PRE htmlAttribute* TAG_SLASH_CLOSE                                            #PreSelfClose
    | TAG_OPEN TAG_BLOCKQUOTE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_BLOCKQUOTE TAG_CLOSE #BlockquoteElement
    | TAG_OPEN TAG_BLOCKQUOTE htmlAttribute* TAG_SLASH_CLOSE                                     #BlockquoteSelfClose
    | TAG_OPEN TAG_B htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_B TAG_CLOSE     #BElement
    | TAG_OPEN TAG_B htmlAttribute* TAG_SLASH_CLOSE                                              #BSelfClose
    | TAG_OPEN TAG_STRONG htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_STRONG TAG_CLOSE #StrongElement
    | TAG_OPEN TAG_STRONG htmlAttribute* TAG_SLASH_CLOSE                                         #StrongSelfClose
    | TAG_OPEN TAG_I htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_I TAG_CLOSE     #IElement
    | TAG_OPEN TAG_I htmlAttribute* TAG_SLASH_CLOSE                                              #ISelfClose
    | TAG_OPEN TAG_EM htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_EM TAG_CLOSE   #EmElement
    | TAG_OPEN TAG_EM htmlAttribute* TAG_SLASH_CLOSE                                             #EmSelfClose
    | TAG_OPEN TAG_U htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_U TAG_CLOSE     #UElement
    | TAG_OPEN TAG_U htmlAttribute* TAG_SLASH_CLOSE                                              #USelfClose
    | TAG_OPEN TAG_SMALL htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SMALL TAG_CLOSE #SmallElement
    | TAG_OPEN TAG_SMALL htmlAttribute* TAG_SLASH_CLOSE                                          #SmallSelfClose
    | TAG_OPEN TAG_MARK htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_MARK TAG_CLOSE #MarkElement
    | TAG_OPEN TAG_MARK htmlAttribute* TAG_SLASH_CLOSE                                           #MarkSelfClose
    | TAG_OPEN TAG_SUB htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SUB TAG_CLOSE #SubElement
    | TAG_OPEN TAG_SUB htmlAttribute* TAG_SLASH_CLOSE                                            #SubSelfClose
    | TAG_OPEN TAG_SUP htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SUP TAG_CLOSE #SupElement
    | TAG_OPEN TAG_SUP htmlAttribute* TAG_SLASH_CLOSE                                            #SupSelfClose
    | TAG_OPEN TAG_UL htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_UL TAG_CLOSE   #UlElement
    | TAG_OPEN TAG_UL htmlAttribute* TAG_SLASH_CLOSE                                             #UlSelfClose
    | TAG_OPEN TAG_OL htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_OL TAG_CLOSE   #OlElement
    | TAG_OPEN TAG_OL htmlAttribute* TAG_SLASH_CLOSE                                             #OlSelfClose
    | TAG_OPEN TAG_LI htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_LI TAG_CLOSE   #LiElement
    | TAG_OPEN TAG_LI htmlAttribute* TAG_SLASH_CLOSE                                             #LiSelfClose
    | TAG_OPEN TAG_DL htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_DL TAG_CLOSE   #DlElement
    | TAG_OPEN TAG_DL htmlAttribute* TAG_SLASH_CLOSE                                             #DlSelfClose
    | TAG_OPEN TAG_DT htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_DT TAG_CLOSE   #DtElement
    | TAG_OPEN TAG_DT htmlAttribute* TAG_SLASH_CLOSE                                             #DtSelfClose
    | TAG_OPEN TAG_DD htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_DD TAG_CLOSE   #DdElement
    | TAG_OPEN TAG_DD htmlAttribute* TAG_SLASH_CLOSE                                             #DdSelfClose
    | TAG_OPEN TAG_A htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_A TAG_CLOSE     #AElement
    | TAG_OPEN TAG_A htmlAttribute* TAG_SLASH_CLOSE                                              #ASelfClose
    | TAG_OPEN TAG_IMG htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                              #ImgElement
    | TAG_OPEN TAG_AUDIO htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_AUDIO TAG_CLOSE #AudioElement
    | TAG_OPEN TAG_AUDIO htmlAttribute* TAG_SLASH_CLOSE                                          #AudioSelfClose
    | TAG_OPEN TAG_VIDEO htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_VIDEO TAG_CLOSE #VideoElement
    | TAG_OPEN TAG_VIDEO htmlAttribute* TAG_SLASH_CLOSE                                          #VideoSelfClose
    | TAG_OPEN TAG_SOURCE htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                           #SourceElement
    | TAG_OPEN TAG_IFRAME htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_IFRAME TAG_CLOSE #IframeElement
    | TAG_OPEN TAG_IFRAME htmlAttribute* TAG_SLASH_CLOSE                                         #IframeSelfClose
    | TAG_OPEN TAG_TABLE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TABLE TAG_CLOSE #TableElement
    | TAG_OPEN TAG_TABLE htmlAttribute* TAG_SLASH_CLOSE                                          #TableSelfClose
    | TAG_OPEN TAG_THEAD htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_THEAD TAG_CLOSE #TheadElement
    | TAG_OPEN TAG_THEAD htmlAttribute* TAG_SLASH_CLOSE                                          #TheadSelfClose
    | TAG_OPEN TAG_TBODY htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TBODY TAG_CLOSE #TbodyElement
    | TAG_OPEN TAG_TBODY htmlAttribute* TAG_SLASH_CLOSE                                          #TbodySelfClose
    | TAG_OPEN TAG_TFOOT htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TFOOT TAG_CLOSE #TfootElement
    | TAG_OPEN TAG_TFOOT htmlAttribute* TAG_SLASH_CLOSE                                          #TfootSelfClose
    | TAG_OPEN TAG_TR htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TR TAG_CLOSE   #TrElement
    | TAG_OPEN TAG_TR htmlAttribute* TAG_SLASH_CLOSE                                             #TrSelfClose
    | TAG_OPEN TAG_TH htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TH TAG_CLOSE   #ThElement
    | TAG_OPEN TAG_TH htmlAttribute* TAG_SLASH_CLOSE                                             #ThSelfClose
    | TAG_OPEN TAG_TD htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TD TAG_CLOSE   #TdElement
    | TAG_OPEN TAG_TD htmlAttribute* TAG_SLASH_CLOSE                                             #TdSelfClose
    | TAG_OPEN TAG_CAPTION htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_CAPTION TAG_CLOSE #CaptionElement
    | TAG_OPEN TAG_CAPTION htmlAttribute* TAG_SLASH_CLOSE                                        #CaptionSelfClose
    | TAG_OPEN TAG_FORM htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_FORM TAG_CLOSE #FormElement
    | TAG_OPEN TAG_FORM htmlAttribute* TAG_SLASH_CLOSE                                           #FormSelfClose
    | TAG_OPEN TAG_INPUT htmlAttribute* (TAG_SLASH_CLOSE | TAG_CLOSE)                            #InputElement
    | TAG_OPEN TAG_BUTTON htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_BUTTON TAG_CLOSE #ButtonElement
    | TAG_OPEN TAG_BUTTON htmlAttribute* TAG_SLASH_CLOSE                                         #ButtonSelfClose
    | TAG_OPEN TAG_SELECT htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SELECT TAG_CLOSE #SelectElement
    | TAG_OPEN TAG_SELECT htmlAttribute* TAG_SLASH_CLOSE                                         #SelectSelfClose
    | TAG_OPEN TAG_OPTION htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_OPTION TAG_CLOSE #OptionElement
    | TAG_OPEN TAG_OPTION htmlAttribute* TAG_SLASH_CLOSE                                         #OptionSelfClose
    | TAG_OPEN TAG_TEXTAREA htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_TEXTAREA TAG_CLOSE #TextareaElement
    | TAG_OPEN TAG_TEXTAREA htmlAttribute* TAG_SLASH_CLOSE                                       #TextareaSelfClose
    | TAG_OPEN TAG_LABEL htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_LABEL TAG_CLOSE #LabelElement
    | TAG_OPEN TAG_LABEL htmlAttribute* TAG_SLASH_CLOSE                                          #LabelSelfClose
    | TAG_OPEN TAG_FIELDSET htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_FIELDSET TAG_CLOSE #FieldsetElement
    | TAG_OPEN TAG_FIELDSET htmlAttribute* TAG_SLASH_CLOSE                                       #FieldsetSelfClose
    | TAG_OPEN TAG_LEGEND htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_LEGEND TAG_CLOSE #LegendElement
    | TAG_OPEN TAG_LEGEND htmlAttribute* TAG_SLASH_CLOSE                                         #LegendSelfClose
    | TAG_OPEN TAG_HEADER htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_HEADER TAG_CLOSE #HeaderElement
    | TAG_OPEN TAG_HEADER htmlAttribute* TAG_SLASH_CLOSE                                         #HeaderSelfClose
    | TAG_OPEN TAG_FOOTER htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_FOOTER TAG_CLOSE #FooterElement
    | TAG_OPEN TAG_FOOTER htmlAttribute* TAG_SLASH_CLOSE                                         #FooterSelfClose
    | TAG_OPEN TAG_NAV htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAV TAG_CLOSE #NavElement
    | TAG_OPEN TAG_NAV htmlAttribute* TAG_SLASH_CLOSE                                            #NavSelfClose
    | TAG_OPEN TAG_MAIN htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_MAIN TAG_CLOSE #MainElement
    | TAG_OPEN TAG_MAIN htmlAttribute* TAG_SLASH_CLOSE                                           #MainSelfClose
    | TAG_OPEN TAG_SECTION htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_SECTION TAG_CLOSE #SectionElement
    | TAG_OPEN TAG_SECTION htmlAttribute* TAG_SLASH_CLOSE                                        #SectionSelfClose
    | TAG_OPEN TAG_ARTICLE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_ARTICLE TAG_CLOSE #ArticleElement
    | TAG_OPEN TAG_ARTICLE htmlAttribute* TAG_SLASH_CLOSE                                        #ArticleSelfClose
    | TAG_OPEN TAG_ASIDE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_ASIDE TAG_CLOSE #AsideElement
    | TAG_OPEN TAG_ASIDE htmlAttribute* TAG_SLASH_CLOSE                                          #AsideSelfClose
    | TAG_OPEN TAG_FIGURE htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_FIGURE TAG_CLOSE #FigureElement
    | TAG_OPEN TAG_FIGURE htmlAttribute* TAG_SLASH_CLOSE                                         #FigureSelfClose
    | TAG_OPEN TAG_FIGCAPTION htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_FIGCAPTION TAG_CLOSE #FigcaptionElement
    | TAG_OPEN TAG_FIGCAPTION htmlAttribute* TAG_SLASH_CLOSE                                     #FigcaptionSelfClose
    | styleElement                                                                               #StyleElementTag
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE #GenericElement
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE                                           #GenericSelfClose
    ;

htmlContent
    : (template | TEXT | htmlElement)*
    ;

styleElement
    : OPEN_STYLE stylesheet CLOSE_STYLE
    ;

htmlAttribute
    :  attributeName  (EQUALS attrValue)?
    ;

attributeName
    : TAG_NAME
    | TAG_HTML
    | TAG_HEAD
    | TAG_BODY
    | TAG_TITLE
    | TAG_META
    | TAG_LINK
    | TAG_SCRIPT
    | TAG_H1
    | TAG_H2
    | TAG_H3
    | TAG_H4
    | TAG_H5
    | TAG_H6
    | TAG_P
    | TAG_SPAN
    | TAG_DIV
    | TAG_BR
    | TAG_HR
    | TAG_PRE
    | TAG_BLOCKQUOTE
    | TAG_B
    | TAG_STRONG
    | TAG_I
    | TAG_EM
    | TAG_U
    | TAG_SMALL
    | TAG_MARK
    | TAG_SUB
    | TAG_SUP
    | TAG_UL
    | TAG_OL
    | TAG_LI
    | TAG_DL
    | TAG_DT
    | TAG_DD
    | TAG_A
    | TAG_IMG
    | TAG_AUDIO
    | TAG_VIDEO
    | TAG_SOURCE
    | TAG_IFRAME
    | TAG_TABLE
    | TAG_THEAD
    | TAG_TBODY
    | TAG_TFOOT
    | TAG_TR
    | TAG_TH
    | TAG_TD
    | TAG_CAPTION
    | TAG_FORM
    | TAG_INPUT
    | TAG_BUTTON
    | TAG_SELECT
    | TAG_OPTION
    | TAG_TEXTAREA
    | TAG_LABEL
    | TAG_FIELDSET
    | TAG_LEGEND
    | TAG_HEADER
    | TAG_FOOTER
    | TAG_NAV
    | TAG_MAIN
    | TAG_SECTION
    | TAG_ARTICLE
    | TAG_ASIDE
    | TAG_FIGURE
    | TAG_FIGCAPTION
    ;

attrValue
    : JINJA_VAR_DQ (expr | exprMath | funCall | exprLogic)? VARIABLE_END  (VJ_OPEN  (expr | exprMath | funCall | exprLogic )?  VARIABLE_END )* DQ  #dqJINJA
    | JINJA_VAR_SQ (expr | exprMath | funCall | exprLogic)? VARIABLE_END  (VJ_OPEN  (expr | exprMath | funCall | exprLogic)?  VARIABLE_END )* SQ  #sqJINJA
    | ATTR_VALUE #attValue
    ;

template
    : variable #JinjaVariableTemplate
    | block    #JinjaBlockTemplate
    ;

variable
    : VARIABLE_START (expr | exprMath | funCall | exprLogic)? VARIABLE_END
    ;

block
    : forStmt #forBlock
    | ifStmt  #ifBlock
    ;

ifStmt
    : BLOCK_START IF (expr | exprLogic) BLOCK_END (htmlContent) elifStm* elseStm? BLOCK_START ENDIF BLOCK_END
    ;

elifStm
    : BLOCK_START ELIF (expr | exprLogic) BLOCK_END (htmlContent)
    ;

elseStm
    : BLOCK_START ELSE BLOCK_END (htmlContent)
    ;

forStmt
    : BLOCK_START FOR IDENTIFIER (COMMA IDENTIFIER)* IN ( IDENTIFIER(DOT IDENTIFIER)* | STRING | funCall ) BLOCK_END (htmlContent) BLOCK_START ENDFOR BLOCK_END
    ;

expr
    : IDENTIFIER (DOT IDENTIFIER)* #identefierEXPR
    | NUMBER #numberEXPR
    | STRING #stringEXPR
    | (TRUE | FALSE)  #booleanEXPR
    | NONE #noneEXPR
    ;

exprMath
    : OPEN_B exprMath CLOSE_B #bracketMathOperation
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
    | IDENTIFIER(DOT IDENTIFIER)*(EQUAL valueFun) #assign
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
    : orExpr #logicalOrExpression
    ;

orExpr
    : orExpr OR andExpr #binaryOrExpr
    | andExpr           #passToAndExpr
    ;

andExpr
    : andExpr AND notExpr #binaryAndExpr
    | notExpr             #passToNotExpr
    ;

notExpr
    : NOT notExpr  #unaryNotExpr
    | compareExpr  #passToCompareExpr
    ;

compareExpr
    : OPEN_B exprLogic CLOSE_B          #parenCompareExpr
    | logicalArg (OPERATOR logicalArg)? #binaryCompareExpr
    ;

logicalArg
    : IDENTIFIER (DOT IDENTIFIER)* #idLogic
    | STRING #strLogic
    | (TRUE | FALSE) #boolLogic
    | NONE #noneLogic
    | NUMBER #numberLogic
    | exprMath #exprMathLogic
    ;

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