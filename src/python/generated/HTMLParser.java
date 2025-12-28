// Generated from C:/Users/Lenovo/Compiler_Project/src/html/HTMLParser.g4 by ANTLR 4.13.2

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
		HTML=24, DOCTYPE_CLOSE=25, COMMENT_JINJA2=26, DOT=27, COMMA=28, EQUAL=29, 
		IF=30, ELSE=31, ELIF=32, ENDIF=33, FOR=34, IN=35, ENDFOR=36, OPERATOR=37, 
		MUL=38, ADD=39, AND=40, OR=41, NOT=42, SUB=43, DIV=44, MOD=45, TRUE=46, 
		FALSE=47, NONE=48, OPEN_B=49, CLOSE_B=50, NUMBER=51, STRING=52, IDENTIFIER=53, 
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
		RULE_valueFun = 20, RULE_exprLogic = 21, RULE_logicalArg = 22, RULE_stylesheet = 23, 
		RULE_ruleSet = 24, RULE_selector = 25, RULE_complexSelector = 26, RULE_simpleSelector = 27, 
		RULE_declaration = 28, RULE_property = 29, RULE_value = 30, RULE_component = 31, 
		RULE_singleValue = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "doctype", "htmlElement", "htmlContent", "styleElement", 
			"htmlAttribute", "attrValue", "template", "variable", "block", "ifStmt", 
			"elifStm", "elseStm", "forStmt", "expr", "exprMath", "funCall", "arguments", 
			"argument", "arg", "valueFun", "exprLogic", "logicalArg", "stylesheet", 
			"ruleSet", "selector", "complexSelector", "simpleSelector", "declaration", 
			"property", "value", "component", "singleValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{%'", null, null, null, "'<!'", "'<style>'", "'<'", null, 
			null, "'/>'", null, null, null, null, null, "'\"{{'", "''{{'", null, 
			null, null, null, null, "'html'", null, null, null, null, null, "'if'", 
			"'else'", "'elif'", "'endif'", "'for'", "'in'", "'endfor'", null, null, 
			"'+'", "'and'", "'or'", "'not'", "'-'", null, null, "'True'", "'False'", 
			"'None'", null, null, null, null, null, null, "'}}'", "'%}'", "'{'", 
			"'}'", null, null, "';'", "':'", null, null, null, "'#'", "'@'", null, 
			null, null, null, "'</style>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE_START", "BLOCK_START", "COMMENT", "WS", "TEXT", "DOC", 
			"OPEN_STYLE", "TAG_OPEN", "SPACE_TAG", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "EQUALS", "TAG_NAME", "SPACE_ATT", "ATTR_VALUE", "JINJA_VAR_DQ", 
			"JINJA_VAR_SQ", "VJ_OPEN", "DQ", "SQ", "SPACE_DOCTYPE", "HTML_DOCTYPE", 
			"HTML", "DOCTYPE_CLOSE", "COMMENT_JINJA2", "DOT", "COMMA", "EQUAL", "IF", 
			"ELSE", "ELIF", "ENDIF", "FOR", "IN", "ENDFOR", "OPERATOR", "MUL", "ADD", 
			"AND", "OR", "NOT", "SUB", "DIV", "MOD", "TRUE", "FALSE", "NONE", "OPEN_B", 
			"CLOSE_B", "NUMBER", "STRING", "IDENTIFIER", "WS_J", "VARIABLE_END", 
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC) {
				{
				setState(66);
				doctype();
				}
			}

			setState(69);
			htmlElement();
			setState(70);
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
			setState(72);
			match(DOC);
			setState(73);
			match(HTML_DOCTYPE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE_DOCTYPE) {
				{
				setState(74);
				match(SPACE_DOCTYPE);
				}
			}

			setState(77);
			match(HTML);
			setState(78);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(TAG_OPEN);
				setState(81);
				match(TAG_NAME);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE_TAG) {
					{
					{
					setState(82);
					htmlAttribute();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					{
					setState(88);
					match(TAG_CLOSE);
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(89);
						htmlContent();
						setState(90);
						match(TAG_OPEN);
						setState(91);
						match(TAG_SLASH);
						setState(92);
						match(TAG_NAME);
						setState(93);
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
					setState(97);
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
				setState(100);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE_START:
				case BLOCK_START:
					{
					setState(103);
					template();
					}
					break;
				case TEXT:
					{
					setState(104);
					match(TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					htmlElement();
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38L) != 0)) {
						{
						setState(113);
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
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(123);
			match(OPEN_STYLE);
			setState(124);
			stylesheet();
			setState(125);
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
			setState(127);
			match(SPACE_TAG);
			setState(128);
			match(TAG_NAME);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(129);
				match(SPACE_TAG);
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(132);
				match(EQUALS);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(133);
					match(SPACE_ATT);
					}
				}

				setState(136);
				attrValue();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(137);
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_DQ:
				_localctx = new DqJINJAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(JINJA_VAR_DQ);
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(143);
					expr();
					}
					break;
				case 2:
					{
					setState(144);
					exprMath(0);
					}
					break;
				case 3:
					{
					setState(145);
					funCall();
					}
					break;
				case 4:
					{
					setState(146);
					exprLogic();
					}
					break;
				}
				setState(149);
				match(VARIABLE_END);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(150);
					match(SPACE_ATT);
					}
				}

				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VJ_OPEN) {
					{
					{
					setState(153);
					match(VJ_OPEN);
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(154);
						match(SPACE_ATT);
						}
						break;
					}
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(157);
						expr();
						}
						break;
					case 2:
						{
						setState(158);
						exprMath(0);
						}
						break;
					case 3:
						{
						setState(159);
						funCall();
						}
						break;
					case 4:
						{
						setState(160);
						exprLogic();
						}
						break;
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(163);
						match(SPACE_ATT);
						}
					}

					setState(166);
					match(VARIABLE_END);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(167);
						match(SPACE_ATT);
						}
					}

					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(DQ);
				}
				break;
			case JINJA_VAR_SQ:
				_localctx = new SqJINJAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(JINJA_VAR_SQ);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(177);
					expr();
					}
					break;
				case 2:
					{
					setState(178);
					exprMath(0);
					}
					break;
				case 3:
					{
					setState(179);
					funCall();
					}
					break;
				case 4:
					{
					setState(180);
					exprLogic();
					}
					break;
				}
				setState(183);
				match(VARIABLE_END);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE_ATT) {
					{
					setState(184);
					match(SPACE_ATT);
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VJ_OPEN) {
					{
					{
					setState(187);
					match(VJ_OPEN);
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(188);
						match(SPACE_ATT);
						}
						break;
					}
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(191);
						expr();
						}
						break;
					case 2:
						{
						setState(192);
						exprMath(0);
						}
						break;
					case 3:
						{
						setState(193);
						funCall();
						}
						break;
					case 4:
						{
						setState(194);
						exprLogic();
						}
						break;
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(197);
						match(SPACE_ATT);
						}
					}

					setState(200);
					match(VARIABLE_END);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE_ATT) {
						{
						setState(201);
						match(SPACE_ATT);
						}
					}

					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(SQ);
				}
				break;
			case ATTR_VALUE:
				_localctx = new AttValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(215);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
						{
						setState(213);
						variable();
						}
						break;
					case BLOCK_START:
						{
						setState(214);
						block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(219);
			match(VARIABLE_START);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(220);
				expr();
				}
				break;
			case 2:
				{
				setState(221);
				exprMath(0);
				}
				break;
			case 3:
				{
				setState(222);
				funCall();
				}
				break;
			case 4:
				{
				setState(223);
				exprLogic();
				}
				break;
			}
			setState(226);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ForBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				forStmt();
				}
				break;
			case 2:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HTMLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HTMLParser.TEXT, i);
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
			setState(232);
			match(BLOCK_START);
			setState(233);
			match(IF);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(234);
				expr();
				}
				break;
			case 2:
				{
				setState(235);
				exprLogic();
				}
				break;
			}
			setState(238);
			match(BLOCK_END);
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(242);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
					case BLOCK_START:
						{
						setState(239);
						template();
						}
						break;
					case OPEN_STYLE:
					case TAG_OPEN:
						{
						setState(240);
						htmlElement();
						}
						break;
					case TEXT:
						{
						setState(241);
						match(TEXT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					elifStm();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(252);
				elseStm();
				}
				break;
			}
			setState(255);
			match(BLOCK_START);
			setState(256);
			match(ENDIF);
			setState(257);
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
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HTMLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HTMLParser.TEXT, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(BLOCK_START);
			setState(260);
			match(ELIF);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(261);
				expr();
				}
				break;
			case 2:
				{
				setState(262);
				exprLogic();
				}
				break;
			}
			setState(265);
			match(BLOCK_END);
			setState(269); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(269);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
					case BLOCK_START:
						{
						setState(266);
						template();
						}
						break;
					case OPEN_STYLE:
					case TAG_OPEN:
						{
						setState(267);
						htmlElement();
						}
						break;
					case TEXT:
						{
						setState(268);
						match(TEXT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class ElseStmContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(HTMLParser.BLOCK_START, 0); }
		public TerminalNode ELSE() { return getToken(HTMLParser.ELSE, 0); }
		public TerminalNode BLOCK_END() { return getToken(HTMLParser.BLOCK_END, 0); }
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HTMLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HTMLParser.TEXT, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(BLOCK_START);
			setState(274);
			match(ELSE);
			setState(275);
			match(BLOCK_END);
			setState(279); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
					case BLOCK_START:
						{
						setState(276);
						template();
						}
						break;
					case OPEN_STYLE:
					case TAG_OPEN:
						{
						setState(277);
						htmlElement();
						}
						break;
					case TEXT:
						{
						setState(278);
						match(TEXT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HTMLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HTMLParser.TEXT, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(BLOCK_START);
			setState(284);
			match(FOR);
			setState(285);
			match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				match(IDENTIFIER);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(IN);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(294);
				match(IDENTIFIER);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(295);
					match(DOT);
					setState(296);
					match(IDENTIFIER);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(302);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(303);
				funCall();
				}
				break;
			}
			setState(306);
			match(BLOCK_END);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(310);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARIABLE_START:
					case BLOCK_START:
						{
						setState(307);
						template();
						}
						break;
					case OPEN_STYLE:
					case TAG_OPEN:
						{
						setState(308);
						htmlElement();
						}
						break;
					case TEXT:
						{
						setState(309);
						match(TEXT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(315);
			match(BLOCK_START);
			setState(316);
			match(ENDFOR);
			setState(317);
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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentefierEXPRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(IDENTIFIER);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(320);
					match(DOT);
					setState(321);
					match(IDENTIFIER);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NUMBER:
				_localctx = new NumberEXPRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringEXPRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanEXPRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
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
				setState(330);
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				_localctx = new BracketMathOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(334);
				match(OPEN_B);
				setState(335);
				exprMath(0);
				setState(336);
				match(CLOSE_B);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new MulOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(342);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(343);
						match(MUL);
						setState(344);
						exprMath(8);
						}
						break;
					case 2:
						{
						_localctx = new DivOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(345);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(346);
						match(DIV);
						setState(347);
						exprMath(7);
						}
						break;
					case 3:
						{
						_localctx = new AddOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(348);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(349);
						match(ADD);
						setState(350);
						exprMath(6);
						}
						break;
					case 4:
						{
						_localctx = new SubOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(351);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(352);
						match(SUB);
						setState(353);
						exprMath(5);
						}
						break;
					case 5:
						{
						_localctx = new ModOperationContext(new ExprMathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprMath);
						setState(354);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(355);
						match(MOD);
						setState(356);
						exprMath(4);
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
			setState(362);
			match(IDENTIFIER);
			setState(363);
			match(OPEN_B);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16255179905040384L) != 0)) {
				{
				setState(364);
				arguments();
				}
			}

			setState(367);
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
			setState(369);
			argument();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				argument();
				}
				}
				setState(376);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new NonAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				arg();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(IDENTIFIER);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(379);
					match(DOT);
					setState(380);
					match(IDENTIFIER);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(386);
					match(EQUAL);
					setState(387);
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
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BoolArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
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
				setState(393);
				match(NONE);
				}
				break;
			case NUMBER:
				_localctx = new NumberArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StrArgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdArgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(IDENTIFIER);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(397);
					match(DOT);
					setState(398);
					match(IDENTIFIER);
					}
					}
					setState(403);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
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
				setState(407);
				match(NONE);
				}
				break;
			case 3:
				_localctx = new NumberValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(IDENTIFIER);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(411);
					match(DOT);
					setState(412);
					match(IDENTIFIER);
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new ExpMathValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				exprMath(0);
				}
				break;
			case 7:
				_localctx = new FunCallValContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
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
		public ExprLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic; }
	 
		public ExprLogicContext() { }
		public void copyFrom(ExprLogicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOperationContext extends ExprLogicContext {
		public List<LogicalArgContext> logicalArg() {
			return getRuleContexts(LogicalArgContext.class);
		}
		public LogicalArgContext logicalArg(int i) {
			return getRuleContext(LogicalArgContext.class,i);
		}
		public TerminalNode AND() { return getToken(HTMLParser.AND, 0); }
		public AndOperationContext(ExprLogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAndOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketLogicOperationContext extends ExprLogicContext {
		public TerminalNode OPEN_B() { return getToken(HTMLParser.OPEN_B, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(HTMLParser.CLOSE_B, 0); }
		public BracketLogicOperationContext(ExprLogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBracketLogicOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBracketLogicOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBracketLogicOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotOperationContext extends ExprLogicContext {
		public TerminalNode NOT() { return getToken(HTMLParser.NOT, 0); }
		public LogicalArgContext logicalArg() {
			return getRuleContext(LogicalArgContext.class,0);
		}
		public NotOperationContext(ExprLogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNotOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNotOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNotOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareOperationContext extends ExprLogicContext {
		public List<LogicalArgContext> logicalArg() {
			return getRuleContexts(LogicalArgContext.class);
		}
		public LogicalArgContext logicalArg(int i) {
			return getRuleContext(LogicalArgContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(HTMLParser.OPERATOR, 0); }
		public CompareOperationContext(ExprLogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCompareOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCompareOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCompareOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOperationContext extends ExprLogicContext {
		public List<LogicalArgContext> logicalArg() {
			return getRuleContexts(LogicalArgContext.class);
		}
		public LogicalArgContext logicalArg(int i) {
			return getRuleContext(LogicalArgContext.class,i);
		}
		public TerminalNode OR() { return getToken(HTMLParser.OR, 0); }
		public OrOperationContext(ExprLogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOrOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOrOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicContext exprLogic() throws RecognitionException {
		ExprLogicContext _localctx = new ExprLogicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprLogic);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new BracketLogicOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(OPEN_B);
				setState(423);
				exprLogic();
				setState(424);
				match(CLOSE_B);
				}
				break;
			case 2:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(NOT);
				setState(427);
				logicalArg();
				}
				break;
			case 3:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				logicalArg();
				setState(429);
				match(AND);
				setState(430);
				logicalArg();
				}
				break;
			case 4:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				logicalArg();
				setState(433);
				match(OR);
				setState(434);
				logicalArg();
				}
				break;
			case 5:
				_localctx = new CompareOperationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				logicalArg();
				setState(437);
				match(OPERATOR);
				setState(438);
				logicalArg();
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
		enterRule(_localctx, 44, RULE_logicalArg);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new IdLogicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(IDENTIFIER);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(443);
					match(DOT);
					setState(444);
					match(IDENTIFIER);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new StrLogicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new BoolLogicContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
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
				setState(452);
				match(NONE);
				}
				break;
			case 5:
				_localctx = new NumberLogicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				match(NUMBER);
				}
				break;
			case 6:
				_localctx = new ExprMathLogicContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
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
		enterRule(_localctx, 46, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 71L) != 0)) {
				{
				{
				setState(457);
				ruleSet();
				}
				}
				setState(462);
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
		enterRule(_localctx, 48, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			selector();
			setState(464);
			match(OpenBrace);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ident) {
				{
				{
				setState(465);
				declaration();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
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
		enterRule(_localctx, 50, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			complexSelector();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(474);
				match(Comma);
				setState(475);
				complexSelector();
				}
				}
				setState(480);
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
		enterRule(_localctx, 52, RULE_complexSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(481);
				simpleSelector();
				}
				}
				setState(484); 
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
		enterRule(_localctx, 54, RULE_simpleSelector);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new IdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(Ident);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(487);
					match(Colon);
					setState(488);
					match(Ident);
					}
				}

				}
				break;
			case Dot:
				_localctx = new DotIdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(Dot);
				setState(492);
				match(Ident);
				}
				break;
			case Hash:
				_localctx = new HashIdentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(Hash);
				setState(494);
				match(Ident);
				}
				break;
			case Multiply:
				_localctx = new MultiplySelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
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
		enterRule(_localctx, 56, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			property();
			setState(499);
			match(Colon);
			setState(500);
			value();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(501);
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
		enterRule(_localctx, 58, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 60, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(506);
					component();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 62, RULE_component);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
			case Number:
			case String:
			case HexColor:
				_localctx = new SingleValComponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				singleValue();
				}
				break;
			case Slash:
				_localctx = new SlashComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(Slash);
				}
				break;
			case Comma:
				_localctx = new CommaComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
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
		enterRule(_localctx, 64, RULE_singleValue);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new NumIdSingleValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(Number);
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(517);
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
				setState(520);
				match(String);
				}
				break;
			case 3:
				_localctx = new IdSingleValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(Ident);
				}
				break;
			case 4:
				_localctx = new NumberPerSingleValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(Number);
				setState(523);
				match(PercentSign);
				}
				break;
			case 5:
				_localctx = new HexColorSingleValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
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
		"\u0004\u0001L\u0210\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0003\u0000D\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001"+
		"\u0002\u0003\u0002f\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003"+
		"\n\u0003\f\u0003m\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"r\b\u0003\n\u0003\f\u0003u\t\u0003\u0005\u0003w\b\u0003\n\u0003\f\u0003"+
		"z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0087\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008b\b"+
		"\u0005\u0003\u0005\u008d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0098\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009c\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a2\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a9\b\u0006\u0005\u0006\u00ab\b\u0006\n\u0006\f\u0006\u00ae\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ba\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00be\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0006\u0003"+
		"\u0006\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006"+
		"\u0005\u0006\u00cd\b\u0006\n\u0006\f\u0006\u00d0\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d4\b\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u00d8"+
		"\b\u0007\u000b\u0007\f\u0007\u00d9\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00e1\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00e7\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u00f3\b\n\u000b\n\f\n\u00f4\u0001\n\u0005\n\u00f8\b"+
		"\n\n\n\f\n\u00fb\t\n\u0001\n\u0003\n\u00fe\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0108"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u010e"+
		"\b\u000b\u000b\u000b\f\u000b\u010f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u0118\b\f\u000b\f\f\f\u0119\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0121\b\r\n\r\f\r\u0124\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u012a\b\r\n\r\f\r\u012d\t\r\u0001\r\u0001\r\u0003\r"+
		"\u0131\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0137\b\r\n\r\f\r\u013a"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0143\b\u000e\n\u000e\f\u000e\u0146\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014c\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0155\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0166"+
		"\b\u000f\n\u000f\f\u000f\u0169\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u016e\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0175\b\u0011\n\u0011\f\u0011\u0178\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u017e\b\u0012\n"+
		"\u0012\f\u0012\u0181\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0185"+
		"\b\u0012\u0003\u0012\u0187\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0190\b\u0013"+
		"\n\u0013\f\u0013\u0193\t\u0013\u0003\u0013\u0195\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u019e\b\u0014\n\u0014\f\u0014\u01a1\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01a5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01b9\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u01be\b\u0016\n\u0016\f\u0016\u01c1\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c8"+
		"\b\u0016\u0001\u0017\u0005\u0017\u01cb\b\u0017\n\u0017\f\u0017\u01ce\t"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01d3\b\u0018\n"+
		"\u0018\f\u0018\u01d6\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u01dd\b\u0019\n\u0019\f\u0019\u01e0\t\u0019"+
		"\u0001\u001a\u0004\u001a\u01e3\b\u001a\u000b\u001a\f\u001a\u01e4\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ea\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01f1\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01f7\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u01fc\b\u001e\u000b\u001e\f"+
		"\u001e\u01fd\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0203\b\u001f"+
		"\u0001 \u0001 \u0003 \u0207\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u020e\b \u0001 \u0000\u0001\u001e!\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000"+
		"\u0001\u0001\u0000./\u026c\u0000C\u0001\u0000\u0000\u0000\u0002H\u0001"+
		"\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006k\u0001\u0000\u0000"+
		"\u0000\b{\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u00d3"+
		"\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u00db"+
		"\u0001\u0000\u0000\u0000\u0012\u00e6\u0001\u0000\u0000\u0000\u0014\u00e8"+
		"\u0001\u0000\u0000\u0000\u0016\u0103\u0001\u0000\u0000\u0000\u0018\u0111"+
		"\u0001\u0000\u0000\u0000\u001a\u011b\u0001\u0000\u0000\u0000\u001c\u014b"+
		"\u0001\u0000\u0000\u0000\u001e\u0154\u0001\u0000\u0000\u0000 \u016a\u0001"+
		"\u0000\u0000\u0000\"\u0171\u0001\u0000\u0000\u0000$\u0186\u0001\u0000"+
		"\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u01a4\u0001\u0000\u0000\u0000"+
		"*\u01b8\u0001\u0000\u0000\u0000,\u01c7\u0001\u0000\u0000\u0000.\u01cc"+
		"\u0001\u0000\u0000\u00000\u01cf\u0001\u0000\u0000\u00002\u01d9\u0001\u0000"+
		"\u0000\u00004\u01e2\u0001\u0000\u0000\u00006\u01f0\u0001\u0000\u0000\u0000"+
		"8\u01f2\u0001\u0000\u0000\u0000:\u01f8\u0001\u0000\u0000\u0000<\u01fb"+
		"\u0001\u0000\u0000\u0000>\u0202\u0001\u0000\u0000\u0000@\u020d\u0001\u0000"+
		"\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0003\u0004\u0002\u0000"+
		"FG\u0005\u0000\u0000\u0001G\u0001\u0001\u0000\u0000\u0000HI\u0005\u0006"+
		"\u0000\u0000IK\u0005\u0017\u0000\u0000JL\u0005\u0016\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0005\u0018\u0000\u0000NO\u0005\u0019\u0000\u0000O\u0003\u0001\u0000"+
		"\u0000\u0000PQ\u0005\b\u0000\u0000QU\u0005\u000e\u0000\u0000RT\u0003\n"+
		"\u0005\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000Vb\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000X_\u0005\n\u0000\u0000YZ\u0003\u0006\u0003\u0000"+
		"Z[\u0005\b\u0000\u0000[\\\u0005\f\u0000\u0000\\]\u0005\u000e\u0000\u0000"+
		"]^\u0005\n\u0000\u0000^`\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0005\u000b\u0000"+
		"\u0000bX\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000df\u0003\b\u0004\u0000eP\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000f\u0005\u0001\u0000\u0000\u0000gj\u0003\u000e\u0007\u0000"+
		"hj\u0005\u0005\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lx\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ns\u0003"+
		"\u0004\u0002\u0000or\u0003\u000e\u0007\u0000pr\u0005\u0005\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u0007\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0007"+
		"\u0000\u0000|}\u0003.\u0017\u0000}~\u0005H\u0000\u0000~\t\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080\u0082\u0005\u000e\u0000"+
		"\u0000\u0081\u0083\u0005\t\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008c\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0005\r\u0000\u0000\u0085\u0087\u0005\u000f\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0003\f\u0006\u0000\u0089\u008b"+
		"\u0005\t\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0084\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u000b\u0001"+
		"\u0000\u0000\u0000\u008e\u0093\u0005\u0011\u0000\u0000\u008f\u0094\u0003"+
		"\u001c\u000e\u0000\u0090\u0094\u0003\u001e\u000f\u0000\u0091\u0094\u0003"+
		" \u0010\u0000\u0092\u0094\u0003*\u0015\u0000\u0093\u008f\u0001\u0000\u0000"+
		"\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u00057\u0000\u0000"+
		"\u0096\u0098\u0005\u000f\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00ac\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0005\u0013\u0000\u0000\u009a\u009c\u0005\u000f\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u00a2\u0003\u001c\u000e\u0000"+
		"\u009e\u00a2\u0003\u001e\u000f\u0000\u009f\u00a2\u0003 \u0010\u0000\u00a0"+
		"\u00a2\u0003*\u0015\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u000f\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u00057\u0000\u0000\u00a7\u00a9\u0005"+
		"\u000f\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u0099\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00d4\u0005"+
		"\u0014\u0000\u0000\u00b0\u00b5\u0005\u0012\u0000\u0000\u00b1\u00b6\u0003"+
		"\u001c\u000e\u0000\u00b2\u00b6\u0003\u001e\u000f\u0000\u00b3\u00b6\u0003"+
		" \u0010\u0000\u00b4\u00b6\u0003*\u0015\u0000\u00b5\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u00057\u0000\u0000"+
		"\u00b8\u00ba\u0005\u000f\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00ce\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0005\u0013\u0000\u0000\u00bc\u00be\u0005\u000f\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf\u00c4\u0003\u001c\u000e\u0000"+
		"\u00c0\u00c4\u0003\u001e\u000f\u0000\u00c1\u00c4\u0003 \u0010\u0000\u00c2"+
		"\u00c4\u0003*\u0015\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\u000f\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u00057\u0000\u0000\u00c9\u00cb\u0005"+
		"\u000f\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0005"+
		"\u0015\u0000\u0000\u00d2\u00d4\u0005\u0010\u0000\u0000\u00d3\u008e\u0001"+
		"\u0000\u0000\u0000\u00d3\u00b0\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\r\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003\u0010"+
		"\b\u0000\u00d6\u00d8\u0003\u0012\t\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00e0\u0005\u0001\u0000"+
		"\u0000\u00dc\u00e1\u0003\u001c\u000e\u0000\u00dd\u00e1\u0003\u001e\u000f"+
		"\u0000\u00de\u00e1\u0003 \u0010\u0000\u00df\u00e1\u0003*\u0015\u0000\u00e0"+
		"\u00dc\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u00057\u0000\u0000\u00e3\u0011\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0003\u001a\r\u0000\u00e5\u00e7\u0003\u0014\n\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0013\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9\u00ec\u0005"+
		"\u001e\u0000\u0000\u00ea\u00ed\u0003\u001c\u000e\u0000\u00eb\u00ed\u0003"+
		"*\u0015\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f2\u00058\u0000"+
		"\u0000\u00ef\u00f3\u0003\u000e\u0007\u0000\u00f0\u00f3\u0003\u0004\u0002"+
		"\u0000\u00f1\u00f3\u0005\u0005\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0003\u0016\u000b\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003\u0018\f\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0002\u0000\u0000"+
		"\u0100\u0101\u0005!\u0000\u0000\u0101\u0102\u00058\u0000\u0000\u0102\u0015"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0002\u0000\u0000\u0104\u0107"+
		"\u0005 \u0000\u0000\u0105\u0108\u0003\u001c\u000e\u0000\u0106\u0108\u0003"+
		"*\u0015\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010d\u00058\u0000"+
		"\u0000\u010a\u010e\u0003\u000e\u0007\u0000\u010b\u010e\u0003\u0004\u0002"+
		"\u0000\u010c\u010e\u0005\u0005\u0000\u0000\u010d\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0017\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\u0002\u0000\u0000\u0112\u0113\u0005\u001f\u0000"+
		"\u0000\u0113\u0117\u00058\u0000\u0000\u0114\u0118\u0003\u000e\u0007\u0000"+
		"\u0115\u0118\u0003\u0004\u0002\u0000\u0116\u0118\u0005\u0005\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u0019\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0002\u0000\u0000"+
		"\u011c\u011d\u0005\"\u0000\u0000\u011d\u0122\u00055\u0000\u0000\u011e"+
		"\u011f\u0005\u001c\u0000\u0000\u011f\u0121\u00055\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0130"+
		"\u0005#\u0000\u0000\u0126\u012b\u00055\u0000\u0000\u0127\u0128\u0005\u001b"+
		"\u0000\u0000\u0128\u012a\u00055\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0131\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131\u00054\u0000\u0000"+
		"\u012f\u0131\u0003 \u0010\u0000\u0130\u0126\u0001\u0000\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0138\u00058\u0000\u0000\u0133\u0137"+
		"\u0003\u000e\u0007\u0000\u0134\u0137\u0003\u0004\u0002\u0000\u0135\u0137"+
		"\u0005\u0005\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0002\u0000\u0000\u013c\u013d"+
		"\u0005$\u0000\u0000\u013d\u013e\u00058\u0000\u0000\u013e\u001b\u0001\u0000"+
		"\u0000\u0000\u013f\u0144\u00055\u0000\u0000\u0140\u0141\u0005\u001b\u0000"+
		"\u0000\u0141\u0143\u00055\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u014c\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014c\u00053\u0000\u0000\u0148"+
		"\u014c\u00054\u0000\u0000\u0149\u014c\u0007\u0000\u0000\u0000\u014a\u014c"+
		"\u00050\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b\u0147\u0001"+
		"\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u001d\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0006\u000f\uffff\uffff\u0000\u014e\u014f"+
		"\u00051\u0000\u0000\u014f\u0150\u0003\u001e\u000f\u0000\u0150\u0151\u0005"+
		"2\u0000\u0000\u0151\u0155\u0001\u0000\u0000\u0000\u0152\u0155\u00055\u0000"+
		"\u0000\u0153\u0155\u00053\u0000\u0000\u0154\u014d\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0167\u0001\u0000\u0000\u0000\u0156\u0157\n\u0007\u0000\u0000\u0157"+
		"\u0158\u0005&\u0000\u0000\u0158\u0166\u0003\u001e\u000f\b\u0159\u015a"+
		"\n\u0006\u0000\u0000\u015a\u015b\u0005,\u0000\u0000\u015b\u0166\u0003"+
		"\u001e\u000f\u0007\u015c\u015d\n\u0005\u0000\u0000\u015d\u015e\u0005\'"+
		"\u0000\u0000\u015e\u0166\u0003\u001e\u000f\u0006\u015f\u0160\n\u0004\u0000"+
		"\u0000\u0160\u0161\u0005+\u0000\u0000\u0161\u0166\u0003\u001e\u000f\u0005"+
		"\u0162\u0163\n\u0003\u0000\u0000\u0163\u0164\u0005-\u0000\u0000\u0164"+
		"\u0166\u0003\u001e\u000f\u0004\u0165\u0156\u0001\u0000\u0000\u0000\u0165"+
		"\u0159\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165"+
		"\u015f\u0001\u0000\u0000\u0000\u0165\u0162\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u001f\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u00055\u0000\u0000\u016b\u016d"+
		"\u00051\u0000\u0000\u016c\u016e\u0003\"\u0011\u0000\u016d\u016c\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u00052\u0000\u0000\u0170!\u0001\u0000\u0000"+
		"\u0000\u0171\u0176\u0003$\u0012\u0000\u0172\u0173\u0005\u001c\u0000\u0000"+
		"\u0173\u0175\u0003$\u0012\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177#\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0179\u0187\u0003&\u0013\u0000\u017a\u017f\u0005"+
		"5\u0000\u0000\u017b\u017c\u0005\u001b\u0000\u0000\u017c\u017e\u00055\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0184\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005\u001d\u0000\u0000\u0183\u0185\u0003(\u0014\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0179\u0001\u0000\u0000\u0000"+
		"\u0186\u017a\u0001\u0000\u0000\u0000\u0187%\u0001\u0000\u0000\u0000\u0188"+
		"\u0195\u0007\u0000\u0000\u0000\u0189\u0195\u00050\u0000\u0000\u018a\u0195"+
		"\u00053\u0000\u0000\u018b\u0195\u00054\u0000\u0000\u018c\u0191\u00055"+
		"\u0000\u0000\u018d\u018e\u0005\u001b\u0000\u0000\u018e\u0190\u00055\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0188\u0001\u0000\u0000\u0000\u0194\u0189\u0001\u0000\u0000"+
		"\u0000\u0194\u018a\u0001\u0000\u0000\u0000\u0194\u018b\u0001\u0000\u0000"+
		"\u0000\u0194\u018c\u0001\u0000\u0000\u0000\u0195\'\u0001\u0000\u0000\u0000"+
		"\u0196\u01a5\u0007\u0000\u0000\u0000\u0197\u01a5\u00050\u0000\u0000\u0198"+
		"\u01a5\u00053\u0000\u0000\u0199\u01a5\u00054\u0000\u0000\u019a\u019f\u0005"+
		"5\u0000\u0000\u019b\u019c\u0005\u001b\u0000\u0000\u019c\u019e\u00055\u0000"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a5\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a5\u0003\u001e\u000f\u0000\u01a3\u01a5\u0003 \u0010\u0000"+
		"\u01a4\u0196\u0001\u0000\u0000\u0000\u01a4\u0197\u0001\u0000\u0000\u0000"+
		"\u01a4\u0198\u0001\u0000\u0000\u0000\u01a4\u0199\u0001\u0000\u0000\u0000"+
		"\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5)\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u00051\u0000\u0000\u01a7\u01a8\u0003*\u0015\u0000\u01a8\u01a9\u0005"+
		"2\u0000\u0000\u01a9\u01b9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005*\u0000"+
		"\u0000\u01ab\u01b9\u0003,\u0016\u0000\u01ac\u01ad\u0003,\u0016\u0000\u01ad"+
		"\u01ae\u0005(\u0000\u0000\u01ae\u01af\u0003,\u0016\u0000\u01af\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0003,\u0016\u0000\u01b1\u01b2\u0005)\u0000"+
		"\u0000\u01b2\u01b3\u0003,\u0016\u0000\u01b3\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0003,\u0016\u0000\u01b5\u01b6\u0005%\u0000\u0000\u01b6\u01b7"+
		"\u0003,\u0016\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01aa\u0001\u0000\u0000\u0000\u01b8\u01ac\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b9+\u0001\u0000\u0000\u0000\u01ba\u01bf\u00055\u0000"+
		"\u0000\u01bb\u01bc\u0005\u001b\u0000\u0000\u01bc\u01be\u00055\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c8\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c8\u00054\u0000\u0000\u01c3\u01c8\u0007\u0000\u0000\u0000\u01c4"+
		"\u01c8\u00050\u0000\u0000\u01c5\u01c8\u00053\u0000\u0000\u01c6\u01c8\u0003"+
		"\u001e\u000f\u0000\u01c7\u01ba\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c7\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8-\u0001\u0000\u0000\u0000\u01c9\u01cb\u00030\u0018"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd/\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u00032\u0019\u0000\u01d0\u01d4\u00059\u0000\u0000\u01d1\u01d3"+
		"\u00038\u001c\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0005:\u0000\u0000\u01d81\u0001\u0000\u0000"+
		"\u0000\u01d9\u01de\u00034\u001a\u0000\u01da\u01db\u0005?\u0000\u0000\u01db"+
		"\u01dd\u00034\u001a\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e0"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df3\u0001\u0000\u0000\u0000\u01e0\u01de\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e3\u00036\u001b\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e55\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e9\u0005F\u0000\u0000\u01e7\u01e8\u0005>\u0000\u0000\u01e8"+
		"\u01ea\u0005F\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea\u01f1\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0005@\u0000\u0000\u01ec\u01f1\u0005F\u0000\u0000\u01ed\u01ee\u0005B"+
		"\u0000\u0000\u01ee\u01f1\u0005F\u0000\u0000\u01ef\u01f1\u0005A\u0000\u0000"+
		"\u01f0\u01e6\u0001\u0000\u0000\u0000\u01f0\u01eb\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f17\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003:\u001d\u0000\u01f3\u01f4"+
		"\u0005>\u0000\u0000\u01f4\u01f6\u0003<\u001e\u0000\u01f5\u01f7\u0005="+
		"\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f79\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005F\u0000\u0000"+
		"\u01f9;\u0001\u0000\u0000\u0000\u01fa\u01fc\u0003>\u001f\u0000\u01fb\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe=\u0001"+
		"\u0000\u0000\u0000\u01ff\u0203\u0003@ \u0000\u0200\u0203\u0005E\u0000"+
		"\u0000\u0201\u0203\u0005?\u0000\u0000\u0202\u01ff\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0203?\u0001\u0000\u0000\u0000\u0204\u0206\u0005G\u0000\u0000\u0205\u0207"+
		"\u0005F\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u020e\u0001\u0000\u0000\u0000\u0208\u020e\u0005"+
		"I\u0000\u0000\u0209\u020e\u0005F\u0000\u0000\u020a\u020b\u0005G\u0000"+
		"\u0000\u020b\u020e\u0005D\u0000\u0000\u020c\u020e\u0005L\u0000\u0000\u020d"+
		"\u0204\u0001\u0000\u0000\u0000\u020d\u0208\u0001\u0000\u0000\u0000\u020d"+
		"\u0209\u0001\u0000\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020eA\u0001\u0000\u0000\u0000MCKU_bei"+
		"kqsx\u0082\u0086\u008a\u008c\u0093\u0097\u009b\u00a1\u00a4\u00a8\u00ac"+
		"\u00b5\u00b9\u00bd\u00c3\u00c6\u00ca\u00ce\u00d3\u00d7\u00d9\u00e0\u00e6"+
		"\u00ec\u00f2\u00f4\u00f9\u00fd\u0107\u010d\u010f\u0117\u0119\u0122\u012b"+
		"\u0130\u0136\u0138\u0144\u014b\u0154\u0165\u0167\u016d\u0176\u017f\u0184"+
		"\u0186\u0191\u0194\u019f\u01a4\u01b8\u01bf\u01c7\u01cc\u01d4\u01de\u01e4"+
		"\u01e9\u01f0\u01f6\u01fd\u0202\u0206\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}