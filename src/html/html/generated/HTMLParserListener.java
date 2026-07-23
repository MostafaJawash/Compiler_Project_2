// Generated from src/html/HTMLParser.g4 by ANTLR 4.13.2
package html.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlRootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRootElement(HTMLParser.HtmlRootElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlRootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRootElement(HTMLParser.HtmlRootElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlRootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRootSelfClose(HTMLParser.HtmlRootSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlRootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRootSelfClose(HTMLParser.HtmlRootSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadElement(HTMLParser.HeadElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadElement(HTMLParser.HeadElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadSelfClose(HTMLParser.HeadSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadSelfClose(HTMLParser.HeadSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBodyElement(HTMLParser.BodyElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBodyElement(HTMLParser.BodyElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBodySelfClose(HTMLParser.BodySelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBodySelfClose(HTMLParser.BodySelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TitleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleElement(HTMLParser.TitleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TitleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleElement(HTMLParser.TitleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TitleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleSelfClose(HTMLParser.TitleSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TitleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleSelfClose(HTMLParser.TitleSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterMetaElement(HTMLParser.MetaElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitMetaElement(HTMLParser.MetaElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLinkElement(HTMLParser.LinkElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLinkElement(HTMLParser.LinkElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScriptElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScriptElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScriptSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptSelfClose(HTMLParser.ScriptSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScriptSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptSelfClose(HTMLParser.ScriptSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H1SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH1SelfClose(HTMLParser.H1SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H1SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH1SelfClose(HTMLParser.H1SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H2Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(HTMLParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H2Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(HTMLParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H2SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH2SelfClose(HTMLParser.H2SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H2SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH2SelfClose(HTMLParser.H2SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H3Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH3Element(HTMLParser.H3ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H3Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH3Element(HTMLParser.H3ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H3SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH3SelfClose(HTMLParser.H3SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H3SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH3SelfClose(HTMLParser.H3SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H4Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH4Element(HTMLParser.H4ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H4Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH4Element(HTMLParser.H4ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H4SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH4SelfClose(HTMLParser.H4SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H4SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH4SelfClose(HTMLParser.H4SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H5Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH5Element(HTMLParser.H5ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H5Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH5Element(HTMLParser.H5ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H5SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH5SelfClose(HTMLParser.H5SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H5SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH5SelfClose(HTMLParser.H5SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H6Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH6Element(HTMLParser.H6ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H6Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH6Element(HTMLParser.H6ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H6SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH6SelfClose(HTMLParser.H6SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H6SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH6SelfClose(HTMLParser.H6SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(HTMLParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(HTMLParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPSelfClose(HTMLParser.PSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPSelfClose(HTMLParser.PSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpanSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSpanSelfClose(HTMLParser.SpanSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpanSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSpanSelfClose(HTMLParser.SpanSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDivSelfClose(HTMLParser.DivSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDivSelfClose(HTMLParser.DivSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBrElement(HTMLParser.BrElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBrElement(HTMLParser.BrElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHrElement(HTMLParser.HrElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHrElement(HTMLParser.HrElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPreElement(HTMLParser.PreElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPreElement(HTMLParser.PreElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPreSelfClose(HTMLParser.PreSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPreSelfClose(HTMLParser.PreSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockquoteElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBlockquoteElement(HTMLParser.BlockquoteElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockquoteElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBlockquoteElement(HTMLParser.BlockquoteElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockquoteSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBlockquoteSelfClose(HTMLParser.BlockquoteSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockquoteSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBlockquoteSelfClose(HTMLParser.BlockquoteSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBElement(HTMLParser.BElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBElement(HTMLParser.BElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterBSelfClose(HTMLParser.BSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitBSelfClose(HTMLParser.BSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrongElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStrongElement(HTMLParser.StrongElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrongElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStrongElement(HTMLParser.StrongElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrongSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStrongSelfClose(HTMLParser.StrongSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrongSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStrongSelfClose(HTMLParser.StrongSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterIElement(HTMLParser.IElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitIElement(HTMLParser.IElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterISelfClose(HTMLParser.ISelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitISelfClose(HTMLParser.ISelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterEmElement(HTMLParser.EmElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitEmElement(HTMLParser.EmElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterEmSelfClose(HTMLParser.EmSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitEmSelfClose(HTMLParser.EmSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterUElement(HTMLParser.UElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitUElement(HTMLParser.UElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterUSelfClose(HTMLParser.USelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitUSelfClose(HTMLParser.USelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSmallElement(HTMLParser.SmallElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSmallElement(HTMLParser.SmallElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSmallSelfClose(HTMLParser.SmallSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSmallSelfClose(HTMLParser.SmallSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterMarkElement(HTMLParser.MarkElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitMarkElement(HTMLParser.MarkElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterMarkSelfClose(HTMLParser.MarkSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitMarkSelfClose(HTMLParser.MarkSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSubElement(HTMLParser.SubElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSubElement(HTMLParser.SubElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSubSelfClose(HTMLParser.SubSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSubSelfClose(HTMLParser.SubSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SupElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSupElement(HTMLParser.SupElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SupElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSupElement(HTMLParser.SupElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SupSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSupSelfClose(HTMLParser.SupSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SupSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSupSelfClose(HTMLParser.SupSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterUlElement(HTMLParser.UlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitUlElement(HTMLParser.UlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterUlSelfClose(HTMLParser.UlSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitUlSelfClose(HTMLParser.UlSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOlElement(HTMLParser.OlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOlElement(HTMLParser.OlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOlSelfClose(HTMLParser.OlSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOlSelfClose(HTMLParser.OlSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLiElement(HTMLParser.LiElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLiElement(HTMLParser.LiElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLiSelfClose(HTMLParser.LiSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLiSelfClose(HTMLParser.LiSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDlElement(HTMLParser.DlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDlElement(HTMLParser.DlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDlSelfClose(HTMLParser.DlSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDlSelfClose(HTMLParser.DlSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DtElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDtElement(HTMLParser.DtElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DtElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDtElement(HTMLParser.DtElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DtSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDtSelfClose(HTMLParser.DtSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DtSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDtSelfClose(HTMLParser.DtSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDdElement(HTMLParser.DdElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDdElement(HTMLParser.DdElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDdSelfClose(HTMLParser.DdSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDdSelfClose(HTMLParser.DdSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterAElement(HTMLParser.AElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitAElement(HTMLParser.AElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterASelfClose(HTMLParser.ASelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitASelfClose(HTMLParser.ASelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImgElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(HTMLParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImgElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(HTMLParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AudioElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterAudioElement(HTMLParser.AudioElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AudioElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitAudioElement(HTMLParser.AudioElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AudioSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterAudioSelfClose(HTMLParser.AudioSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AudioSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitAudioSelfClose(HTMLParser.AudioSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VideoElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVideoElement(HTMLParser.VideoElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VideoElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVideoElement(HTMLParser.VideoElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VideoSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVideoSelfClose(HTMLParser.VideoSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VideoSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVideoSelfClose(HTMLParser.VideoSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SourceElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(HTMLParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SourceElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(HTMLParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IframeElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterIframeElement(HTMLParser.IframeElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IframeElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitIframeElement(HTMLParser.IframeElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IframeSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterIframeSelfClose(HTMLParser.IframeSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IframeSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitIframeSelfClose(HTMLParser.IframeSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(HTMLParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(HTMLParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTableSelfClose(HTMLParser.TableSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTableSelfClose(HTMLParser.TableSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TheadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTheadElement(HTMLParser.TheadElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TheadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTheadElement(HTMLParser.TheadElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TheadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTheadSelfClose(HTMLParser.TheadSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TheadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTheadSelfClose(HTMLParser.TheadSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TbodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTbodyElement(HTMLParser.TbodyElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TbodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTbodyElement(HTMLParser.TbodyElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TbodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTbodySelfClose(HTMLParser.TbodySelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TbodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTbodySelfClose(HTMLParser.TbodySelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TfootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTfootElement(HTMLParser.TfootElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TfootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTfootElement(HTMLParser.TfootElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TfootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTfootSelfClose(HTMLParser.TfootSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TfootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTfootSelfClose(HTMLParser.TfootSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTrElement(HTMLParser.TrElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTrElement(HTMLParser.TrElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTrSelfClose(HTMLParser.TrSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTrSelfClose(HTMLParser.TrSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterThElement(HTMLParser.ThElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitThElement(HTMLParser.ThElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterThSelfClose(HTMLParser.ThSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitThSelfClose(HTMLParser.ThSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTdElement(HTMLParser.TdElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTdElement(HTMLParser.TdElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTdSelfClose(HTMLParser.TdSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTdSelfClose(HTMLParser.TdSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterCaptionElement(HTMLParser.CaptionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitCaptionElement(HTMLParser.CaptionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterCaptionSelfClose(HTMLParser.CaptionSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitCaptionSelfClose(HTMLParser.CaptionSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFormElement(HTMLParser.FormElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFormElement(HTMLParser.FormElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFormSelfClose(HTMLParser.FormSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFormSelfClose(HTMLParser.FormSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterInputElement(HTMLParser.InputElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitInputElement(HTMLParser.InputElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonElement(HTMLParser.ButtonElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonElement(HTMLParser.ButtonElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonSelfClose(HTMLParser.ButtonSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonSelfClose(HTMLParser.ButtonSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(HTMLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(HTMLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectSelfClose(HTMLParser.SelectSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectSelfClose(HTMLParser.SelectSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOptionElement(HTMLParser.OptionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOptionElement(HTMLParser.OptionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOptionSelfClose(HTMLParser.OptionSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOptionSelfClose(HTMLParser.OptionSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextareaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTextareaElement(HTMLParser.TextareaElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextareaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTextareaElement(HTMLParser.TextareaElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextareaSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTextareaSelfClose(HTMLParser.TextareaSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextareaSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTextareaSelfClose(HTMLParser.TextareaSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelElement(HTMLParser.LabelElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelElement(HTMLParser.LabelElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelSelfClose(HTMLParser.LabelSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelSelfClose(HTMLParser.LabelSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldsetElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFieldsetElement(HTMLParser.FieldsetElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldsetElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFieldsetElement(HTMLParser.FieldsetElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldsetSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFieldsetSelfClose(HTMLParser.FieldsetSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldsetSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFieldsetSelfClose(HTMLParser.FieldsetSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LegendElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLegendElement(HTMLParser.LegendElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LegendElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLegendElement(HTMLParser.LegendElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LegendSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterLegendSelfClose(HTMLParser.LegendSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LegendSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitLegendSelfClose(HTMLParser.LegendSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeaderElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHeaderElement(HTMLParser.HeaderElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeaderElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHeaderElement(HTMLParser.HeaderElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeaderSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHeaderSelfClose(HTMLParser.HeaderSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeaderSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHeaderSelfClose(HTMLParser.HeaderSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FooterElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFooterElement(HTMLParser.FooterElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FooterElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFooterElement(HTMLParser.FooterElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FooterSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFooterSelfClose(HTMLParser.FooterSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FooterSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFooterSelfClose(HTMLParser.FooterSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NavElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNavElement(HTMLParser.NavElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NavElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNavElement(HTMLParser.NavElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NavSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNavSelfClose(HTMLParser.NavSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NavSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNavSelfClose(HTMLParser.NavSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterMainElement(HTMLParser.MainElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitMainElement(HTMLParser.MainElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterMainSelfClose(HTMLParser.MainSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitMainSelfClose(HTMLParser.MainSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SectionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSectionElement(HTMLParser.SectionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SectionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSectionElement(HTMLParser.SectionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SectionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSectionSelfClose(HTMLParser.SectionSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SectionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSectionSelfClose(HTMLParser.SectionSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterArticleElement(HTMLParser.ArticleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitArticleElement(HTMLParser.ArticleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArticleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterArticleSelfClose(HTMLParser.ArticleSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArticleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitArticleSelfClose(HTMLParser.ArticleSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsideElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterAsideElement(HTMLParser.AsideElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsideElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitAsideElement(HTMLParser.AsideElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsideSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterAsideSelfClose(HTMLParser.AsideSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsideSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitAsideSelfClose(HTMLParser.AsideSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FigureElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFigureElement(HTMLParser.FigureElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FigureElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFigureElement(HTMLParser.FigureElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FigureSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFigureSelfClose(HTMLParser.FigureSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FigureSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFigureSelfClose(HTMLParser.FigureSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FigcaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFigcaptionElement(HTMLParser.FigcaptionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FigcaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFigcaptionElement(HTMLParser.FigcaptionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FigcaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFigcaptionSelfClose(HTMLParser.FigcaptionSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FigcaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFigcaptionSelfClose(HTMLParser.FigcaptionSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleElementTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementTag(HTMLParser.StyleElementTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleElementTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementTag(HTMLParser.StyleElementTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericElement(HTMLParser.GenericElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericElement(HTMLParser.GenericElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelfClose(HTMLParser.GenericSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelfClose(HTMLParser.GenericSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVariableTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariableTemplate(HTMLParser.JinjaVariableTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVariableTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariableTemplate(HTMLParser.JinjaVariableTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockTemplate(HTMLParser.JinjaBlockTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockTemplate(HTMLParser.JinjaBlockTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HTMLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 */
	void enterElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 */
	void exitElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 */
	void enterElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 */
	void exitElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HTMLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HTMLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(HTMLParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(HTMLParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOrExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOrExpr(HTMLParser.BinaryOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOrExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOrExpr(HTMLParser.BinaryOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passToAndExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterPassToAndExpr(HTMLParser.PassToAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passToAndExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitPassToAndExpr(HTMLParser.PassToAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryAndExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAndExpr(HTMLParser.BinaryAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryAndExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAndExpr(HTMLParser.BinaryAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passToNotExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterPassToNotExpr(HTMLParser.PassToNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passToNotExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitPassToNotExpr(HTMLParser.PassToNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExpr(HTMLParser.UnaryNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExpr(HTMLParser.UnaryNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passToCompareExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterPassToCompareExpr(HTMLParser.PassToCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passToCompareExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitPassToCompareExpr(HTMLParser.PassToCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenCompareExpr(HTMLParser.ParenCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenCompareExpr(HTMLParser.ParenCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryCompareExpr(HTMLParser.BinaryCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryCompareExpr(HTMLParser.BinaryCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void enterComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void exitComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
}