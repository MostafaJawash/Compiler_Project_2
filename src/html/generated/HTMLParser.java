// Generated from C:/Compiler_Project/src/html/HTMLParser.g4 by ANTLR 4.13.2
package html.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE_START=1, BLOCK_START=2, COMMENT=3, WS=4, TEXT=5, DOC=6, OPEN_STYLE=7, 
		TAG_OPEN=8, SPACE_TAG=9, TAG_CLOSE=10, TAG_SLASH_CLOSE=11, TAG_SLASH=12, 
		EQUALS=13, TAG_NAME=14, SPACE_ATT=15, ATTR_VALUE=16, JINJA_VAR_DQ=17, 
		JINJA_VAR_SQ=18, VJ_OPEN=19, DQ=20, SQ=21, SPACE_DOCTYPE=22, HTML_DOCTYPE=23, 
		HTML=24, DOCTYPE_CLOSE=25, COMMENT_JINJA2=26, IF=27, ELSE=28, ELIF=29, 
		ENDIF=30, FOR=31, IN=32, ENDFOR=33, AND=34, OR=35, NOT=36, TRUE=37, FALSE=38, 
		NONE=39, OPERATOR=40, MUL=41, ADD=42, SUB=43, DIV=44, MOD=45, DOT=46, 
		COMMA=47, EQUAL=48, OPEN_B=49, CLOSE_B=50, NUMBER=51, IDENTIFIER=52, STRING=53, 
		WS_J=54, VARIABLE_END=55, BLOCK_END=56, OpenBrace=57, CloseBrace=58, OpenParen=59, 
		CloseParen=60, SemiColon=61, Colon=62, Comma=63, Dot=64, Multiply=65, 
		Hash=66, At=67, PercentSign=68, Slash=69, Ident=70, Number=71, CLOSE_STYLE=72, 
		String=73, Whitespace=74, Comment=75, HexColor=76;
	public static final int
		RULE_htmlDocument = 0, RULE_doctype = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_styleElement = 4, RULE_htmlAttribute = 5, RULE_attrValue = 6, RULE_template = 7, 
		RULE_variable = 8, RULE_block = 9, RULE_ifStmt = 10, RULE_elifStm = 11, 
		RULE_elseStm = 12, RULE_forStmt = 13, RULE_expr = 14, RULE_exprMath = 15, 
		RULE_funCall = 16, RULE_arguments = 17, RULE_argument = 18, RULE_arg = 19, 
		RULE_valueFun = 20, RULE_exprLogic = 21, RULE_orExpr = 22, RULE_andExpr = 23, 
		RULE_notExpr = 24, RULE_compareExpr = 25, RULE_logicalArg = 26, RULE_stylesheet = 27, 
		RULE_ruleSet = 28, RULE_selector = 29, RULE_complexSelector = 30, RULE_simpleSelector = 31, 
		RULE_declaration = 32, RULE_property = 33, RULE_value = 34, RULE_component = 35, 
		RULE_singleValue = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "doctype", "htmlElement", "htmlContent", "styleElement", 
			"htmlAttribute", "attrValue", "template", "variable", "block", "ifStmt", 
			"elifStm", "elseStm", "forStmt", "expr", "exprMath", "funCall", "arguments", 
			"argument", "arg", "valueFun", "exprLogic", "orExpr", "andExpr", "notExpr", 
			"compareExpr", "logicalArg", "stylesheet", "ruleSet", "selector", "complexSelector", 
			"simpleSelector", "declaration", "property", "value", "component", "singleValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{%'", null, null, null, "'<!'", "'<style>'", "'<'", null, 
			null, "'/>'", null, null, null, null, null, "'\"{{'", "''{{'", null, 
			null, null, null, null, "'html'", null, null, "'if'", "'else'", "'elif'", 
			"'endif'", "'for'", "'in'", "'endfor'", "'and'", "'or'", "'not'", "'True'", 
			"'False'", "'None'", null, null, "'+'", "'-'", null, null, null, null, 
			null, null, null, null, null, null, null, "'}}'", "'%}'", "'{'", "'}'", 
			null, null, "';'", "':'", null, null, null, "'#'", "'@'", null, null, 
			null, null, "'</style>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE_START", "BLOCK_START", "COMMENT", "WS", "TEXT", "DOC", 
			"OPEN_STYLE", "TAG_OPEN", "SPACE_TAG", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "EQUALS", "TAG_NAME", "SPACE_ATT", "ATTR_VALUE", "JINJA_VAR_DQ", 
			"JINJA_VAR_SQ", "VJ_OPEN", "DQ", "SQ", "SPACE_DOCTYPE", "HTML_DOCTYPE", 
			"HTML", "DOCTYPE_CLOSE", "COMMENT_JINJA2", "IF", "ELSE", "ELIF", "ENDIF", 
			"FOR", "IN", "ENDFOR", "AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "OPERATOR", 
			"MUL", "ADD", "SUB", "DIV", "MOD", "DOT", "COMMA", "EQUAL", "OPEN_B", 
			"CLOSE_B", "NUMBER", "IDENTIFIER", "STRING", "WS_J", "VARIABLE_END", 
			"BLOCK_END", "OpenBrace", "CloseBrace", "OpenParen", "CloseParen", "SemiColon", 
			"Colon", "Comma", "Dot", "Multiply", "Hash", "At", "PercentSign", "Slash", 
			"Ident", "Number", "CLOSE_STYLE", "String", "Whitespace", "Comment", 
			"HexColor"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC) {
				{
				setState(74);
				doctype();
				}
			}

			setState(77);
			htmlElement();
			setState(78);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(HTMLParser.DOC, 0); }
		public TerminalNode HTML_DOCTYPE() { return getToken(HTMLParser.HTML_DOCTYPE, 0); }
		public TerminalNode HTML() { return getToken(HTMLParser.HTML, 0); }
		public TerminalNode DOCTYPE_CLOSE() { return getToken(HTMLParser.DOCTYPE_CLOSE, 0); }
		public TerminalNode SPACE_DOCTYPE() { return getToken(HTMLParser.SPACE_DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doctype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DOC);
			setState(81);
			match(HTML_DOCTYPE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE_DOCTYPE) {
				{
				setState(82);
				match(SPACE_DOCTYPE);
				}
			}

			setState(85);
			match(HTML);
			setState(86);
			match(DOCTYPE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(TAG_OPEN);
				setState(89);
				match(TAG_NAME);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE_TAG) {
					{
					{
					setState(90);
					htmlAttribute();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					{
					setState(96);
					match(TAG_CLOSE);
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(97);
						htmlContent();
						setState(98);
						match(TAG_OPEN);
						setState(99);
						match(TAG_SLASH);
						setState(100);
						match(TAG_NAME);
						setState(101);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					{
					setState(105);
					match(TAG_SLASH_CLOSE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OPEN_STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				styleElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HTMLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HTMLParser.TEXT, i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
					case BLOCK_START:
						{
						setState(111);
						template();
						}
						break;
					case TEXT:
						{
						setState(112);
						match(TEXT);
						}
						break;
					case OPEN_STYLE:
					case TAG_OPEN:
						{
						setState(113);
						htmlElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode OPEN_STYLE() { return getToken(HTMLParser.OPEN_STYLE, 0); }
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode CLOSE_STYLE() { return getToken(HTMLParser.CLOSE_STYLE, 0); }
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_styleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OPEN_STYLE);
			setState(120);
			stylesheet();
			setState(121);
			match(CLOSE_STYLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public List<TerminalNode> SPACE_TAG() { return getTokens(HTMLParser.SPACE_TAG); }
		public TerminalNode SPACE_TAG(int i) {
			return getToken(HTMLParser.SPACE_TAG, i);
		}
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public TerminalNode SPACE_ATT() { return getToken(HTMLParser.SPACE_ATT, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(SPACE_TAG);
			setState(124);
			match(TAG_NAME);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				match(SPACE_TAG);
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(128);
				match(EQUALS);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(129);
					match(SPACE_ATT);
					}
				}

				setState(132);
				attrValue();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(133);
					match(SPACE_TAG);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueContext extends ParserRuleContext {
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
	 
		public AttrValueContext() { }
		public void copyFrom(AttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttValueContext extends AttrValueContext {
		public TerminalNode ATTR_VALUE() { return getToken(HTMLParser.ATTR_VALUE, 0); }
		public AttValueContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqJINJAContext extends AttrValueContext {
		public TerminalNode JINJA_VAR_SQ() { return getToken(HTMLParser.JINJA_VAR_SQ, 0); }
		public List<TerminalNode> VARIABLE_END() { return getTokens(HTMLParser.VARIABLE_END); }
		public TerminalNode VARIABLE_END(int i) {
			return getToken(HTMLParser.VARIABLE_END, i);
		}
		public TerminalNode SQ() { return getToken(HTMLParser.SQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public List<FunCallContext> funCall() {
			return getRuleContexts(FunCallContext.class);
		}
		public FunCallContext funCall(int i) {
			return getRuleContext(FunCallContext.class,i);
		}
		public List<ExprLogicContext> exprLogic() {
			return getRuleContexts(ExprLogicContext.class);
		}
		public ExprLogicContext exprLogic(int i) {
			return getRuleContext(ExprLogicContext.class,i);
		}
		public List<TerminalNode> SPACE_ATT() { return getTokens(HTMLParser.SPACE_ATT); }
		public TerminalNode SPACE_ATT(int i) {
			return getToken(HTMLParser.SPACE_ATT, i);
		}
		public List<TerminalNode> VJ_OPEN() { return getTokens(HTMLParser.VJ_OPEN); }
		public TerminalNode VJ_OPEN(int i) {
			return getToken(HTMLParser.VJ_OPEN, i);
		}
		public SqJINJAContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSqJINJA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSqJINJA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSqJINJA(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DqJINJAContext extends AttrValueContext {
		public TerminalNode JINJA_VAR_DQ() { return getToken(HTMLParser.JINJA_VAR_DQ, 0); }
		public List<TerminalNode> VARIABLE_END() { return getTokens(HTMLParser.VARIABLE_END); }
		public TerminalNode VARIABLE_END(int i) {
			return getToken(HTMLParser.VARIABLE_END, i);
		}
		public TerminalNode DQ() { return getToken(HTMLParser.DQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public List<FunCallContext> funCall() {
			return getRuleContexts(FunCallContext.class);
		}
		public FunCallContext funCall(int i) {
			return getRuleContext(FunCallContext.class,i);
		}
		public List<ExprLogicContext> exprLogic() {
			return getRuleContexts(ExprLogicContext.class);
		}
		public ExprLogicContext exprLogic(int i) {
			return getRuleContext(ExprLogicContext.class,i);
		}
		public List<TerminalNode> SPACE_ATT() { return getTokens(HTMLParser.SPACE_ATT); }
		public TerminalNode SPACE_ATT(int i) {
			return getToken(HTMLParser.SPACE_ATT, i);
		}
		public List<TerminalNode> VJ_OPEN() { return getTokens(HTMLParser.VJ_OPEN); }
		public TerminalNode VJ_OPEN(int i) {
			return getToken(HTMLParser.VJ_OPEN, i);
		}
		public DqJINJAContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDqJINJA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDqJINJA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDqJINJA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attrValue);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_DQ:
				_localctx = new DqJINJAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(JINJA_VAR_DQ);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(139);
					expr();
					}
					break;
				case 2:
					{
					setState(140);
					exprMath(0);
					}
					break;
				case 3:
					{
					setState(141);
					funCall();
					}
					break;
				case 4:
					{
					setState(142);
					exprLogic();
					}
					break;
				}
				setState(145);
				match(VARIABLE_END);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(146);
					match(SPACE_ATT);
					}
				}

				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VJ_OPEN) {
					{
					{
					setState(149);
					match(VJ_OPEN);
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(150);
						match(SPACE_ATT);
						}
						break;
					}
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(153);
						expr();
						}
						break;
					case 2:
						{
						setState(154);
						exprMath(0);
						}
						break;
					case 3:
						{
						setState(155);
						funCall();
						}
						break;
					case 4:
						{
						setState(156);
						exprLogic();
						}
						break;
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(159);
						match(SPACE_ATT);
						}
					}

					setState(162);
					match(VARIABLE_END);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(163);
						match(SPACE_ATT);
						}
					}

					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(DQ);
				}
				break;
			case JINJA_VAR_SQ:
				_localctx = new SqJINJAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(JINJA_VAR_SQ);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(173);
					expr();
					}
					break;
				case 2:
					{
					setState(174);
					exprMath(0);
					}
					break;
				case 3:
					{
					setState(175);
					funCall();
					}
					break;
				case 4:
					{
					setState(176);
					exprLogic();
					}
					break;
				}
				setState(179);
				match(VARIABLE_END);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(180);
					match(SPACE_ATT);
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VJ_OPEN) {
					{
					{
					setState(183);
					match(VJ_OPEN);
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(184);
						match(SPACE_ATT);
						}
						break;
					}
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(187);
						expr();
						}
						break;
					case 2:
						{
						setState(188);
						exprMath(0);
						}
						break;
					case 3:
						{
						setState(189);
						funCall();
						}
						break;
					case 4:
						{
						setState(190);
						exprLogic();
						}
						break;
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(193);
						match(SPACE_ATT);
						}
					}

					setState(196);
					match(VARIABLE_END);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(197);
						match(SPACE_ATT);
						}
					}

					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(SQ);
				}
				break;
			case ATTR_VALUE:
				_localctx = new AttValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(ATTR_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_template);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				variable();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE_START() { return getToken(HTMLParser.VARIABLE_START, 0); }
		public TerminalNode VARIABLE_END() { return getToken(HTMLParser.VARIABLE_END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMathContext exprMath() {
			return getRuleContext(ExprMathContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(VARIABLE_START);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(214);
				expr();
				}
				break;
			case 2:
				{
				setState(215);
				exprMath(0);
				}
				break;
			case 3:
				{
				setState(216);
				funCall();
				}
				break;
			case 4:
				{
				setState(217);
				exprLogic();
				}
				break;
			}
			setState(220);
			match(VARIABLE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends BlockContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForBlockContext extends BlockContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ForBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				forStmt();
				}
				break;
			case 2:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				ifStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_START() { return getTokens(HTMLParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(HTMLParser.BLOCK_START, i);
		}
		public TerminalNode IF() { return getToken(HTMLParser.IF, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(HTMLParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(HTMLParser.BLOCK_END, i);
		}
		public TerminalNode ENDIF() { return getToken(HTMLParser.ENDIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public List<ElifStmContext> elifStm() {
			return getRuleContexts(ElifStmContext.class);
		}
		public ElifStmContext elifStm(int i) {
			return getRuleContext(ElifStmContext.class,i);
		}
		public ElseStmContext elseStm() {
			return getRuleContext(ElseStmContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BLOCK_START);
			setState(227);
			match(IF);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(228);
				expr();
				}
				break;
			case 2:
				{
				setState(229);
				exprLogic();
				}
				break;
			}
			setState(232);
			match(BLOCK_END);
			{
			setState(233);
			htmlContent();
			}
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					elifStm();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(240);
				elseStm();
				}
				break;
			}
			setState(243);
			match(BLOCK_START);
			setState(244);
			match(ENDIF);
			setState(245);
			match(BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifStmContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(HTMLParser.BLOCK_START, 0); }
		public TerminalNode ELIF() { return getToken(HTMLParser.ELIF, 0); }
		public TerminalNode BLOCK_END() { return getToken(HTMLParser.BLOCK_END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public ElifStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterElifStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitElifStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitElifStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmContext elifStm() throws RecognitionException {
		ElifStmContext _localctx = new ElifStmContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elifStm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(BLOCK_START);
			setState(248);
			match(ELIF);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(249);
				expr();
				}
				break;
			case 2:
				{
				setState(250);
				exprLogic();
				}
				break;
			}
			setState(253);
			match(BLOCK_END);
			{
			setState(254);
			htmlContent();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(HTMLParser.BLOCK_START, 0); }
		public TerminalNode ELSE() { return getToken(HTMLParser.ELSE, 0); }
		public TerminalNode BLOCK_END() { return getToken(HTMLParser.BLOCK_END, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public ElseStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterElseStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitElseStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitElseStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmContext elseStm() throws RecognitionException {
		ElseStmContext _localctx = new ElseStmContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(BLOCK_START);
			setState(257);
			match(ELSE);
			setState(258);
			match(BLOCK_END);
			{
			setState(259);
			htmlContent();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_START() { return getTokens(HTMLParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(HTMLParser.BLOCK_START, i);
		}
		public TerminalNode FOR() { return getToken(HTMLParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(HTMLParser.IN, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(HTMLParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(HTMLParser.BLOCK_END, i);
		}
		public TerminalNode ENDFOR() { return getToken(HTMLParser.ENDFOR, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(BLOCK_START);
			setState(262);
			match(FOR);
			setState(263);
			match(IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				match(IDENTIFIER);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(IN);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(272);
				match(IDENTIFIER);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(273);
					match(DOT);
					setState(274);
					match(IDENTIFIER);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(280);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(281);
				funCall();
				}
				break;
			}
			setState(284);
			match(BLOCK_END);
			{
			setState(285);
			htmlContent();
			}
			setState(286);
			match(BLOCK_START);
			setState(287);
			match(ENDFOR);
			setState(288);
			match(BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringEXPRContext extends ExprContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public StringEXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStringEXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStringEXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStringEXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanEXPRContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public BooleanEXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBooleanEXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBooleanEXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBooleanEXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentefierEXPRContext extends ExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public IdentefierEXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdentefierEXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdentefierEXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdentefierEXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberEXPRContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberEXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberEXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberEXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberEXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneEXPRContext extends ExprContext {
		public TerminalNode NONE() { return getToken(HTMLParser.NONE, 0); }
		public NoneEXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNoneEXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNoneEXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNoneEXPR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentefierEXPRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(IDENTIFIER);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(291);
					match(DOT);
					setState(292);
					match(IDENTIFIER);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NUMBER:
				_localctx = new NumberEXPRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringEXPRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanEXPRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NONE:
				_localctx = new NoneEXPRContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				match(NONE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMathContext extends ParserRuleContext {
		public ExprMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMath; }
	 
		public ExprMathContext() { }
		public void copyFrom(ExprMathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdMathContext extends ExprMathContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public IdMathContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulOperationContext extends ExprMathContext {
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public TerminalNode MUL() { return getToken(HTMLParser.MUL, 0); }
		public MulOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMulOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMulOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMulOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddOperationContext extends ExprMathContext {
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public TerminalNode ADD() { return getToken(HTMLParser.ADD, 0); }
		public AddOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAddOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAddOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAddOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketMathOperationContext extends ExprMathContext {
		public TerminalNode OPEN_B() { return getToken(HTMLParser.OPEN_B, 0); }
		public ExprMathContext exprMath() {
			return getRuleContext(ExprMathContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(HTMLParser.CLOSE_B, 0); }
		public BracketMathOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBracketMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBracketMathOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBracketMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubOperationContext extends ExprMathContext {
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public TerminalNode SUB() { return getToken(HTMLParser.SUB, 0); }
		public SubOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSubOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSubOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSubOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberMathContext extends ExprMathContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberMathContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivOperationContext extends ExprMathContext {
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HTMLParser.DIV, 0); }
		public DivOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDivOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDivOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDivOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModOperationContext extends ExprMathContext {
		public List<ExprMathContext> exprMath() {
			return getRuleContexts(ExprMathContext.class);
		}
		public ExprMathContext exprMath(int i) {
			return getRuleContext(ExprMathContext.class,i);
		}
		public TerminalNode MOD() { return getToken(HTMLParser.MOD, 0); }
		public ModOperationContext(ExprMathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterModOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitModOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitModOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMathContext exprMath() throws RecognitionException {
		return exprMath(0);
	}

	private ExprMathContext exprMath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprMathContext _localctx = new ExprMathContext(_ctx, _parentState);
		ExprMathContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exprMath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				_localctx = new BracketMathOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(305);
				match(OPEN_B);
				setState(306);
				exprMath(0);
				setState(307);
				match(CLOSE_B);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MulOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(313);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(314);
						match(MUL);
						setState(315);
						exprMath(8);
						}
						break;
					case 2:
						{
						_localctx = new DivOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(316);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(317);
						match(DIV);
						setState(318);
						exprMath(7);
						}
						break;
					case 3:
						{
						_localctx = new AddOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(319);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						match(ADD);
						setState(321);
						exprMath(6);
						}
						break;
					case 4:
						{
						_localctx = new SubOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						match(SUB);
						setState(324);
						exprMath(5);
						}
						break;
					case 5:
						{
						_localctx = new ModOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(325);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(326);
						match(MOD);
						setState(327);
						exprMath(4);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_B() { return getToken(HTMLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(HTMLParser.CLOSE_B, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(OPEN_B);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15763560768471040L) != 0)) {
				{
				setState(335);
				arguments();
				}
			}

			setState(338);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			argument();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				argument();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonAssignContext extends ArgumentContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public NonAssignContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNonAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNonAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNonAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ArgumentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public TerminalNode EQUAL() { return getToken(HTMLParser.EQUAL, 0); }
		public ValueFunContext valueFun() {
			return getRuleContext(ValueFunContext.class,0);
		}
		public AssignContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argument);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new NonAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				arg();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(IDENTIFIER);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(350);
					match(DOT);
					setState(351);
					match(IDENTIFIER);
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(357);
					match(EQUAL);
					setState(358);
					valueFun();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrArgContext extends ArgContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public StrArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStrArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStrArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStrArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolArgContext extends ArgContext {
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public BoolArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBoolArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBoolArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBoolArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneArgContext extends ArgContext {
		public TerminalNode NONE() { return getToken(HTMLParser.NONE, 0); }
		public NoneArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNoneArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNoneArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNoneArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberArgContext extends ArgContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdArgContext extends ArgContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public IdArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BoolArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NONE:
				_localctx = new NoneArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(NONE);
				}
				break;
			case NUMBER:
				_localctx = new NumberArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StrArgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdArgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(IDENTIFIER);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(368);
					match(DOT);
					setState(369);
					match(IDENTIFIER);
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueFunContext extends ParserRuleContext {
		public ValueFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueFun; }
	 
		public ValueFunContext() { }
		public void copyFrom(ValueFunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallValContext extends ValueFunContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public FunCallValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunCallVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunCallVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunCallVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrValContext extends ValueFunContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public StrValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStrVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMathValContext extends ValueFunContext {
		public ExprMathContext exprMath() {
			return getRuleContext(ExprMathContext.class,0);
		}
		public ExpMathValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExpMathVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExpMathVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExpMathVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdValueContext extends ValueFunContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public IdValueContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolValContext extends ValueFunContext {
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public BoolValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneValContext extends ValueFunContext {
		public TerminalNode NONE() { return getToken(HTMLParser.NONE, 0); }
		public NoneValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNoneVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNoneVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNoneVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValContext extends ValueFunContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberValContext(ValueFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueFunContext valueFun() throws RecognitionException {
		ValueFunContext _localctx = new ValueFunContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valueFun);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new NoneValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(NONE);
				}
				break;
			case 3:
				_localctx = new NumberValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				match(IDENTIFIER);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(382);
					match(DOT);
					setState(383);
					match(IDENTIFIER);
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new ExpMathValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				exprMath(0);
				}
				break;
			case 7:
				_localctx = new FunCallValContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				funCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicContext exprLogic() throws RecognitionException {
		ExprLogicContext _localctx = new ExprLogicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			orExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(HTMLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(HTMLParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			andExpr();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(396);
				match(OR);
				setState(397);
				andExpr();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HTMLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HTMLParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			notExpr();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(404);
				match(AND);
				setState(405);
				notExpr();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HTMLParser.NOT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_notExpr);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(NOT);
				setState(412);
				notExpr();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case OPEN_B:
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				compareExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ParserRuleContext {
		public TerminalNode OPEN_B() { return getToken(HTMLParser.OPEN_B, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(HTMLParser.CLOSE_B, 0); }
		public List<LogicalArgContext> logicalArg() {
			return getRuleContexts(LogicalArgContext.class);
		}
		public LogicalArgContext logicalArg(int i) {
			return getRuleContext(LogicalArgContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(HTMLParser.OPERATOR, 0); }
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compareExpr);
		int _la;
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(OPEN_B);
				setState(417);
				exprLogic();
				setState(418);
				match(CLOSE_B);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				logicalArg();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(421);
					match(OPERATOR);
					setState(422);
					logicalArg();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalArgContext extends ParserRuleContext {
		public LogicalArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalArg; }
	 
		public LogicalArgContext() { }
		public void copyFrom(LogicalArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLogicContext extends LogicalArgContext {
		public TerminalNode NONE() { return getToken(HTMLParser.NONE, 0); }
		public NoneLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNoneLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNoneLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNoneLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLogicContext extends LogicalArgContext {
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public BoolLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBoolLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBoolLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBoolLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdLogicContext extends LogicalArgContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public IdLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrLogicContext extends LogicalArgContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public StrLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStrLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStrLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStrLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLogicContext extends LogicalArgContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMathLogicContext extends LogicalArgContext {
		public ExprMathContext exprMath() {
			return getRuleContext(ExprMathContext.class,0);
		}
		public ExprMathLogicContext(LogicalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprMathLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprMathLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprMathLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalArgContext logicalArg() throws RecognitionException {
		LogicalArgContext _localctx = new LogicalArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalArg);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new IdLogicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(IDENTIFIER);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(428);
					match(DOT);
					setState(429);
					match(IDENTIFIER);
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new StrLogicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new BoolLogicContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new NoneLogicContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(NONE);
				}
				break;
			case 5:
				_localctx = new NumberLogicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				match(NUMBER);
				}
				break;
			case 6:
				_localctx = new ExprMathLogicContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				exprMath(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 71L) != 0)) {
				{
				{
				setState(442);
				ruleSet();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(HTMLParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(HTMLParser.CloseBrace, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			selector();
			setState(449);
			match(OpenBrace);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ident) {
				{
				{
				setState(450);
				declaration();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<ComplexSelectorContext> complexSelector() {
			return getRuleContexts(ComplexSelectorContext.class);
		}
		public ComplexSelectorContext complexSelector(int i) {
			return getRuleContext(ComplexSelectorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HTMLParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HTMLParser.Comma, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			complexSelector();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(459);
				match(Comma);
				setState(460);
				complexSelector();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public ComplexSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterComplexSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitComplexSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitComplexSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexSelectorContext complexSelector() throws RecognitionException {
		ComplexSelectorContext _localctx = new ComplexSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_complexSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				simpleSelector();
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 71L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentSelectorContext extends SimpleSelectorContext {
		public List<TerminalNode> Ident() { return getTokens(HTMLParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(HTMLParser.Ident, i);
		}
		public TerminalNode Colon() { return getToken(HTMLParser.Colon, 0); }
		public IdentSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdentSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplySelectorContext extends SimpleSelectorContext {
		public TerminalNode Multiply() { return getToken(HTMLParser.Multiply, 0); }
		public MultiplySelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMultiplySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMultiplySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMultiplySelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotIdentSelectorContext extends SimpleSelectorContext {
		public TerminalNode Dot() { return getToken(HTMLParser.Dot, 0); }
		public TerminalNode Ident() { return getToken(HTMLParser.Ident, 0); }
		public DotIdentSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDotIdentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDotIdentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDotIdentSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashIdentSelectorContext extends SimpleSelectorContext {
		public TerminalNode Hash() { return getToken(HTMLParser.Hash, 0); }
		public TerminalNode Ident() { return getToken(HTMLParser.Ident, 0); }
		public HashIdentSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHashIdentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHashIdentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHashIdentSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpleSelector);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new IdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(Ident);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(472);
					match(Colon);
					setState(473);
					match(Ident);
					}
				}

				}
				break;
			case Dot:
				_localctx = new DotIdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(Dot);
				setState(477);
				match(Ident);
				}
				break;
			case Hash:
				_localctx = new HashIdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(Hash);
				setState(479);
				match(Ident);
				}
				break;
			case Multiply:
				_localctx = new MultiplySelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				match(Multiply);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode Colon() { return getToken(HTMLParser.Colon, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(HTMLParser.SemiColon, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			property();
			setState(484);
			match(Colon);
			setState(485);
			value();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(486);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(HTMLParser.Ident, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(491);
					component();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	 
		public ComponentContext() { }
		public void copyFrom(ComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaComponentContext extends ComponentContext {
		public TerminalNode Comma() { return getToken(HTMLParser.Comma, 0); }
		public CommaComponentContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCommaComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCommaComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCommaComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleValComponentContext extends ComponentContext {
		public SingleValueContext singleValue() {
			return getRuleContext(SingleValueContext.class,0);
		}
		public SingleValComponentContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSingleValComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSingleValComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSingleValComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashComponentContext extends ComponentContext {
		public TerminalNode Slash() { return getToken(HTMLParser.Slash, 0); }
		public SlashComponentContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSlashComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSlashComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSlashComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_component);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
			case Number:
			case String:
			case HexColor:
				_localctx = new SingleValComponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				singleValue();
				}
				break;
			case Slash:
				_localctx = new SlashComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(Slash);
				}
				break;
			case Comma:
				_localctx = new CommaComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(Comma);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleValueContext extends ParserRuleContext {
		public SingleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleValue; }
	 
		public SingleValueContext() { }
		public void copyFrom(SingleValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberPerSingleValContext extends SingleValueContext {
		public TerminalNode Number() { return getToken(HTMLParser.Number, 0); }
		public TerminalNode PercentSign() { return getToken(HTMLParser.PercentSign, 0); }
		public NumberPerSingleValContext(SingleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberPerSingleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberPerSingleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberPerSingleVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorSingleValContext extends SingleValueContext {
		public TerminalNode HexColor() { return getToken(HTMLParser.HexColor, 0); }
		public HexColorSingleValContext(SingleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHexColorSingleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHexColorSingleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHexColorSingleVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSingleValContext extends SingleValueContext {
		public TerminalNode Ident() { return getToken(HTMLParser.Ident, 0); }
		public IdSingleValContext(SingleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdSingleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdSingleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdSingleVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrSingleVlaContext extends SingleValueContext {
		public TerminalNode String() { return getToken(HTMLParser.String, 0); }
		public StrSingleVlaContext(SingleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStrSingleVla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStrSingleVla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStrSingleVla(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumIdSingleValContext extends SingleValueContext {
		public TerminalNode Number() { return getToken(HTMLParser.Number, 0); }
		public TerminalNode Ident() { return getToken(HTMLParser.Ident, 0); }
		public NumIdSingleValContext(SingleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumIdSingleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumIdSingleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumIdSingleVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleValueContext singleValue() throws RecognitionException {
		SingleValueContext _localctx = new SingleValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleValue);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new NumIdSingleValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(Number);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(502);
					match(Ident);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new StrSingleVlaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(String);
				}
				break;
			case 3:
				_localctx = new IdSingleValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				match(Ident);
				}
				break;
			case 4:
				_localctx = new NumberPerSingleValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				match(Number);
				setState(508);
				match(PercentSign);
				}
				break;
			case 5:
				_localctx = new HexColorSingleValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				match(HexColor);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return exprMath_sempred((ExprMathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprMath_sempred(ExprMathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001L\u0201\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0003\u0000L\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001T\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\\\b\u0002\n\u0002\f\u0002_\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002h\b\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0002\u0003\u0002"+
		"n\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003s\b\u0003\n\u0003"+
		"\f\u0003v\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u007f\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0087"+
		"\b\u0005\u0003\u0005\u0089\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0094\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0098\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009e"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00a1\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a5\b\u0006\u0005\u0006\u00a7\b\u0006\n\u0006\f\u0006\u00aa"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b2\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b6"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ba\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c0\b\u0006\u0001\u0006"+
		"\u0003\u0006\u00c3\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c7\b"+
		"\u0006\u0005\u0006\u00c9\b\u0006\n\u0006\f\u0006\u00cc\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00d0\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d4\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00db\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00e1\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00e7\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ec\b\n"+
		"\n\n\f\n\u00ef\t\n\u0001\n\u0003\n\u00f2\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fc\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u010b\b\r\n"+
		"\r\f\r\u010e\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0114\b\r\n\r"+
		"\f\r\u0117\t\r\u0001\r\u0001\r\u0003\r\u011b\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0126\b\u000e\n\u000e\f\u000e\u0129\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u012f\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0138"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0149\b\u000f\n"+
		"\u000f\f\u000f\u014c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0151\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0158\b\u0011\n\u0011\f\u0011\u015b\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0161\b\u0012\n\u0012"+
		"\f\u0012\u0164\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0168\b\u0012"+
		"\u0003\u0012\u016a\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0173\b\u0013\n\u0013"+
		"\f\u0013\u0176\t\u0013\u0003\u0013\u0178\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0181\b\u0014\n\u0014\f\u0014\u0184\t\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0188\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u018f\b\u0016\n\u0016\f\u0016\u0192\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0197\b\u0017\n\u0017\f\u0017\u019a"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u019f\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01a8\b\u0019\u0003\u0019\u01aa\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01af\b\u001a\n\u001a\f\u001a"+
		"\u01b2\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01b9\b\u001a\u0001\u001b\u0005\u001b\u01bc\b\u001b\n\u001b"+
		"\f\u001b\u01bf\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01c4\b\u001c\n\u001c\f\u001c\u01c7\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ce\b\u001d\n\u001d\f\u001d"+
		"\u01d1\t\u001d\u0001\u001e\u0004\u001e\u01d4\b\u001e\u000b\u001e\f\u001e"+
		"\u01d5\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01db\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e2"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01e8\b \u0001!\u0001!\u0001"+
		"\"\u0004\"\u01ed\b\"\u000b\"\f\"\u01ee\u0001#\u0001#\u0001#\u0003#\u01f4"+
		"\b#\u0001$\u0001$\u0003$\u01f8\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u01ff\b$\u0001$\u0000\u0001\u001e%\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"H\u0000\u0001\u0001\u0000%&\u024b\u0000K\u0001\u0000\u0000\u0000\u0002"+
		"P\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006t\u0001"+
		"\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000"+
		"\f\u00cf\u0001\u0000\u0000\u0000\u000e\u00d3\u0001\u0000\u0000\u0000\u0010"+
		"\u00d5\u0001\u0000\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014"+
		"\u00e2\u0001\u0000\u0000\u0000\u0016\u00f7\u0001\u0000\u0000\u0000\u0018"+
		"\u0100\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000\u0000\u0000\u001c"+
		"\u012e\u0001\u0000\u0000\u0000\u001e\u0137\u0001\u0000\u0000\u0000 \u014d"+
		"\u0001\u0000\u0000\u0000\"\u0154\u0001\u0000\u0000\u0000$\u0169\u0001"+
		"\u0000\u0000\u0000&\u0177\u0001\u0000\u0000\u0000(\u0187\u0001\u0000\u0000"+
		"\u0000*\u0189\u0001\u0000\u0000\u0000,\u018b\u0001\u0000\u0000\u0000."+
		"\u0193\u0001\u0000\u0000\u00000\u019e\u0001\u0000\u0000\u00002\u01a9\u0001"+
		"\u0000\u0000\u00004\u01b8\u0001\u0000\u0000\u00006\u01bd\u0001\u0000\u0000"+
		"\u00008\u01c0\u0001\u0000\u0000\u0000:\u01ca\u0001\u0000\u0000\u0000<"+
		"\u01d3\u0001\u0000\u0000\u0000>\u01e1\u0001\u0000\u0000\u0000@\u01e3\u0001"+
		"\u0000\u0000\u0000B\u01e9\u0001\u0000\u0000\u0000D\u01ec\u0001\u0000\u0000"+
		"\u0000F\u01f3\u0001\u0000\u0000\u0000H\u01fe\u0001\u0000\u0000\u0000J"+
		"L\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0003\u0004\u0002\u0000NO\u0005\u0000"+
		"\u0000\u0001O\u0001\u0001\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000"+
		"QS\u0005\u0017\u0000\u0000RT\u0005\u0016\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0018"+
		"\u0000\u0000VW\u0005\u0019\u0000\u0000W\u0003\u0001\u0000\u0000\u0000"+
		"XY\u0005\b\u0000\u0000Y]\u0005\u000e\u0000\u0000Z\\\u0003\n\u0005\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^j\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`g\u0005\n\u0000\u0000ab\u0003\u0006\u0003\u0000bc\u0005\b"+
		"\u0000\u0000cd\u0005\f\u0000\u0000de\u0005\u000e\u0000\u0000ef\u0005\n"+
		"\u0000\u0000fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ik\u0005\u000b\u0000\u0000"+
		"j`\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000ln\u0003\b\u0004\u0000mX\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000n\u0005\u0001\u0000\u0000\u0000os\u0003\u000e\u0007\u0000ps\u0005"+
		"\u0005\u0000\u0000qs\u0003\u0004\u0002\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0007\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0007\u0000\u0000"+
		"xy\u00036\u001b\u0000yz\u0005H\u0000\u0000z\t\u0001\u0000\u0000\u0000"+
		"{|\u0005\t\u0000\u0000|~\u0005\u000e\u0000\u0000}\u007f\u0005\t\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0088\u0001\u0000\u0000\u0000\u0080\u0082\u0005\r\u0000\u0000\u0081\u0083"+
		"\u0005\u000f\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0003\f\u0006\u0000\u0085\u0087\u0005\t\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008f\u0005"+
		"\u0011\u0000\u0000\u008b\u0090\u0003\u001c\u000e\u0000\u008c\u0090\u0003"+
		"\u001e\u000f\u0000\u008d\u0090\u0003 \u0010\u0000\u008e\u0090\u0003*\u0015"+
		"\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u00057\u0000\u0000\u0092\u0094\u0005\u000f\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u00a8\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0013\u0000\u0000"+
		"\u0096\u0098\u0005\u000f\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009d\u0001\u0000\u0000\u0000"+
		"\u0099\u009e\u0003\u001c\u000e\u0000\u009a\u009e\u0003\u001e\u000f\u0000"+
		"\u009b\u009e\u0003 \u0010\u0000\u009c\u009e\u0003*\u0015\u0000\u009d\u0099"+
		"\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0005\u000f\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u00057\u0000\u0000\u00a3\u00a5\u0005\u000f\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a6\u0095\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00d0\u0005\u0014\u0000\u0000\u00ac\u00b1\u0005"+
		"\u0012\u0000\u0000\u00ad\u00b2\u0003\u001c\u000e\u0000\u00ae\u00b2\u0003"+
		"\u001e\u000f\u0000\u00af\u00b2\u0003 \u0010\u0000\u00b0\u00b2\u0003*\u0015"+
		"\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u00057\u0000\u0000\u00b4\u00b6\u0005\u000f\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ca\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0013\u0000\u0000"+
		"\u00b8\u00ba\u0005\u000f\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bb\u00c0\u0003\u001c\u000e\u0000\u00bc\u00c0\u0003\u001e\u000f\u0000"+
		"\u00bd\u00c0\u0003 \u0010\u0000\u00be\u00c0\u0003*\u0015\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3"+
		"\u0005\u000f\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u00057\u0000\u0000\u00c5\u00c7\u0005\u000f\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00b7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0005\u0015\u0000\u0000\u00ce\u00d0\u0005"+
		"\u0010\u0000\u0000\u00cf\u008a\u0001\u0000\u0000\u0000\u00cf\u00ac\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\r\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0003\u0010\b\u0000\u00d2\u00d4\u0003\u0012\t"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u000f\u0001\u0000\u0000\u0000\u00d5\u00da\u0005\u0001\u0000"+
		"\u0000\u00d6\u00db\u0003\u001c\u000e\u0000\u00d7\u00db\u0003\u001e\u000f"+
		"\u0000\u00d8\u00db\u0003 \u0010\u0000\u00d9\u00db\u0003*\u0015\u0000\u00da"+
		"\u00d6\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u00057\u0000\u0000\u00dd\u0011\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0003\u001a\r\u0000\u00df\u00e1\u0003\u0014\n\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0013\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u0002\u0000\u0000\u00e3\u00e6\u0005"+
		"\u001b\u0000\u0000\u00e4\u00e7\u0003\u001c\u000e\u0000\u00e5\u00e7\u0003"+
		"*\u0015\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u00058\u0000"+
		"\u0000\u00e9\u00ed\u0003\u0006\u0003\u0000\u00ea\u00ec\u0003\u0016\u000b"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f2\u0003\u0018\f\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f4\u00f5\u0005\u001e\u0000\u0000"+
		"\u00f5\u00f6\u00058\u0000\u0000\u00f6\u0015\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0002\u0000\u0000\u00f8\u00fb\u0005\u001d\u0000\u0000\u00f9"+
		"\u00fc\u0003\u001c\u000e\u0000\u00fa\u00fc\u0003*\u0015\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u00058\u0000\u0000\u00fe\u00ff\u0003"+
		"\u0006\u0003\u0000\u00ff\u0017\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\u0002\u0000\u0000\u0101\u0102\u0005\u001c\u0000\u0000\u0102\u0103\u0005"+
		"8\u0000\u0000\u0103\u0104\u0003\u0006\u0003\u0000\u0104\u0019\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106\u0107\u0005\u001f"+
		"\u0000\u0000\u0107\u010c\u00054\u0000\u0000\u0108\u0109\u0005/\u0000\u0000"+
		"\u0109\u010b\u00054\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010f\u011a\u0005 \u0000\u0000\u0110\u0115"+
		"\u00054\u0000\u0000\u0111\u0112\u0005.\u0000\u0000\u0112\u0114\u00054"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u011b\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u011b\u00055\u0000\u0000\u0119\u011b\u0003 \u0010\u0000"+
		"\u011a\u0110\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u00058\u0000\u0000\u011d\u011e\u0003\u0006\u0003\u0000\u011e"+
		"\u011f\u0005\u0002\u0000\u0000\u011f\u0120\u0005!\u0000\u0000\u0120\u0121"+
		"\u00058\u0000\u0000\u0121\u001b\u0001\u0000\u0000\u0000\u0122\u0127\u0005"+
		"4\u0000\u0000\u0123\u0124\u0005.\u0000\u0000\u0124\u0126\u00054\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u012f\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u012f\u00053\u0000\u0000\u012b\u012f\u00055\u0000\u0000\u012c"+
		"\u012f\u0007\u0000\u0000\u0000\u012d\u012f\u0005\'\u0000\u0000\u012e\u0122"+
		"\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0006\u000f\uffff\uffff\u0000\u0131\u0132\u00051\u0000\u0000\u0132\u0133"+
		"\u0003\u001e\u000f\u0000\u0133\u0134\u00052\u0000\u0000\u0134\u0138\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u00054\u0000\u0000\u0136\u0138\u00053\u0000"+
		"\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u014a\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\n\u0007\u0000\u0000\u013a\u013b\u0005)\u0000\u0000"+
		"\u013b\u0149\u0003\u001e\u000f\b\u013c\u013d\n\u0006\u0000\u0000\u013d"+
		"\u013e\u0005,\u0000\u0000\u013e\u0149\u0003\u001e\u000f\u0007\u013f\u0140"+
		"\n\u0005\u0000\u0000\u0140\u0141\u0005*\u0000\u0000\u0141\u0149\u0003"+
		"\u001e\u000f\u0006\u0142\u0143\n\u0004\u0000\u0000\u0143\u0144\u0005+"+
		"\u0000\u0000\u0144\u0149\u0003\u001e\u000f\u0005\u0145\u0146\n\u0003\u0000"+
		"\u0000\u0146\u0147\u0005-\u0000\u0000\u0147\u0149\u0003\u001e\u000f\u0004"+
		"\u0148\u0139\u0001\u0000\u0000\u0000\u0148\u013c\u0001\u0000\u0000\u0000"+
		"\u0148\u013f\u0001\u0000\u0000\u0000\u0148\u0142\u0001\u0000\u0000\u0000"+
		"\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u00054\u0000\u0000\u014e\u0150\u00051\u0000\u0000\u014f\u0151"+
		"\u0003\"\u0011\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005"+
		"2\u0000\u0000\u0153!\u0001\u0000\u0000\u0000\u0154\u0159\u0003$\u0012"+
		"\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u0158\u0003$\u0012\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"#\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u016a"+
		"\u0003&\u0013\u0000\u015d\u0162\u00054\u0000\u0000\u015e\u015f\u0005."+
		"\u0000\u0000\u015f\u0161\u00054\u0000\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0167\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u00050\u0000\u0000"+
		"\u0166\u0168\u0003(\u0014\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169"+
		"\u015c\u0001\u0000\u0000\u0000\u0169\u015d\u0001\u0000\u0000\u0000\u016a"+
		"%\u0001\u0000\u0000\u0000\u016b\u0178\u0007\u0000\u0000\u0000\u016c\u0178"+
		"\u0005\'\u0000\u0000\u016d\u0178\u00053\u0000\u0000\u016e\u0178\u0005"+
		"5\u0000\u0000\u016f\u0174\u00054\u0000\u0000\u0170\u0171\u0005.\u0000"+
		"\u0000\u0171\u0173\u00054\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000"+
		"\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u016b\u0001\u0000\u0000\u0000"+
		"\u0177\u016c\u0001\u0000\u0000\u0000\u0177\u016d\u0001\u0000\u0000\u0000"+
		"\u0177\u016e\u0001\u0000\u0000\u0000\u0177\u016f\u0001\u0000\u0000\u0000"+
		"\u0178\'\u0001\u0000\u0000\u0000\u0179\u0188\u0007\u0000\u0000\u0000\u017a"+
		"\u0188\u0005\'\u0000\u0000\u017b\u0188\u00053\u0000\u0000\u017c\u0188"+
		"\u00055\u0000\u0000\u017d\u0182\u00054\u0000\u0000\u017e\u017f\u0005."+
		"\u0000\u0000\u017f\u0181\u00054\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0188\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188\u0003\u001e\u000f"+
		"\u0000\u0186\u0188\u0003 \u0010\u0000\u0187\u0179\u0001\u0000\u0000\u0000"+
		"\u0187\u017a\u0001\u0000\u0000\u0000\u0187\u017b\u0001\u0000\u0000\u0000"+
		"\u0187\u017c\u0001\u0000\u0000\u0000\u0187\u017d\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000"+
		"\u0188)\u0001\u0000\u0000\u0000\u0189\u018a\u0003,\u0016\u0000\u018a+"+
		"\u0001\u0000\u0000\u0000\u018b\u0190\u0003.\u0017\u0000\u018c\u018d\u0005"+
		"#\u0000\u0000\u018d\u018f\u0003.\u0017\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191-\u0001\u0000\u0000\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0198\u00030\u0018\u0000\u0194"+
		"\u0195\u0005\"\u0000\u0000\u0195\u0197\u00030\u0018\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199/\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0005"+
		"$\u0000\u0000\u019c\u019f\u00030\u0018\u0000\u019d\u019f\u00032\u0019"+
		"\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019e\u019d\u0001\u0000\u0000"+
		"\u0000\u019f1\u0001\u0000\u0000\u0000\u01a0\u01a1\u00051\u0000\u0000\u01a1"+
		"\u01a2\u0003*\u0015\u0000\u01a2\u01a3\u00052\u0000\u0000\u01a3\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a7\u00034\u001a\u0000\u01a5\u01a6\u0005(\u0000"+
		"\u0000\u01a6\u01a8\u00034\u001a\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a0\u0001\u0000\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000\u0000"+
		"\u01aa3\u0001\u0000\u0000\u0000\u01ab\u01b0\u00054\u0000\u0000\u01ac\u01ad"+
		"\u0005.\u0000\u0000\u01ad\u01af\u00054\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b9\u00055\u0000"+
		"\u0000\u01b4\u01b9\u0007\u0000\u0000\u0000\u01b5\u01b9\u0005\'\u0000\u0000"+
		"\u01b6\u01b9\u00053\u0000\u0000\u01b7\u01b9\u0003\u001e\u000f\u0000\u01b8"+
		"\u01ab\u0001\u0000\u0000\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"5\u0001\u0000\u0000\u0000\u01ba\u01bc\u00038\u001c\u0000\u01bb\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be7\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003:\u001d"+
		"\u0000\u01c1\u01c5\u00059\u0000\u0000\u01c2\u01c4\u0003@ \u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0005:\u0000\u0000\u01c99\u0001\u0000\u0000\u0000\u01ca\u01cf\u0003"+
		"<\u001e\u0000\u01cb\u01cc\u0005?\u0000\u0000\u01cc\u01ce\u0003<\u001e"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0;\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d4\u0003>\u001f\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6=\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0005F\u0000\u0000\u01d8\u01d9\u0005>\u0000\u0000\u01d9\u01db\u0005F"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01e2\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005@\u0000"+
		"\u0000\u01dd\u01e2\u0005F\u0000\u0000\u01de\u01df\u0005B\u0000\u0000\u01df"+
		"\u01e2\u0005F\u0000\u0000\u01e0\u01e2\u0005A\u0000\u0000\u01e1\u01d7\u0001"+
		"\u0000\u0000\u0000\u01e1\u01dc\u0001\u0000\u0000\u0000\u01e1\u01de\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2?\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0003B!\u0000\u01e4\u01e5\u0005>\u0000\u0000"+
		"\u01e5\u01e7\u0003D\"\u0000\u01e6\u01e8\u0005=\u0000\u0000\u01e7\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8A\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005F\u0000\u0000\u01eaC\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0003F#\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01efE\u0001\u0000\u0000\u0000\u01f0\u01f4"+
		"\u0003H$\u0000\u01f1\u01f4\u0005E\u0000\u0000\u01f2\u01f4\u0005?\u0000"+
		"\u0000\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4G\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f7\u0005G\u0000\u0000\u01f6\u01f8\u0005F\u0000\u0000\u01f7\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01ff"+
		"\u0001\u0000\u0000\u0000\u01f9\u01ff\u0005I\u0000\u0000\u01fa\u01ff\u0005"+
		"F\u0000\u0000\u01fb\u01fc\u0005G\u0000\u0000\u01fc\u01ff\u0005D\u0000"+
		"\u0000\u01fd\u01ff\u0005L\u0000\u0000\u01fe\u01f5\u0001\u0000\u0000\u0000"+
		"\u01fe\u01f9\u0001\u0000\u0000\u0000\u01fe\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ffI\u0001\u0000\u0000\u0000EKS]gjmrt~\u0082\u0086\u0088\u008f\u0093"+
		"\u0097\u009d\u00a0\u00a4\u00a8\u00b1\u00b5\u00b9\u00bf\u00c2\u00c6\u00ca"+
		"\u00cf\u00d3\u00da\u00e0\u00e6\u00ed\u00f1\u00fb\u010c\u0115\u011a\u0127"+
		"\u012e\u0137\u0148\u014a\u0150\u0159\u0162\u0167\u0169\u0174\u0177\u0182"+
		"\u0187\u0190\u0198\u019e\u01a7\u01a9\u01b0\u01b8\u01bd\u01c5\u01cf\u01d5"+
		"\u01da\u01e1\u01e7\u01ee\u01f3\u01f7\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}