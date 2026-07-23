// Generated from src/html/HTMLParser.g4 by ANTLR 4.13.2
package html.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlRootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlRootElement(HTMLParser.HtmlRootElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlRootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlRootSelfClose(HTMLParser.HtmlRootSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HeadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadElement(HTMLParser.HeadElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HeadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadSelfClose(HTMLParser.HeadSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(HTMLParser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodySelfClose(HTMLParser.BodySelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TitleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleElement(HTMLParser.TitleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TitleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleSelfClose(HTMLParser.TitleSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MetaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaElement(HTMLParser.MetaElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LinkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkElement(HTMLParser.LinkElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScriptElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScriptSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptSelfClose(HTMLParser.ScriptSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H1SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1SelfClose(HTMLParser.H1SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H2Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(HTMLParser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H2SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2SelfClose(HTMLParser.H2SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H3Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3Element(HTMLParser.H3ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H3SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3SelfClose(HTMLParser.H3SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H4Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4Element(HTMLParser.H4ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H4SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4SelfClose(HTMLParser.H4SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H5Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5Element(HTMLParser.H5ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H5SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5SelfClose(HTMLParser.H5SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H6Element}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6Element(HTMLParser.H6ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H6SelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6SelfClose(HTMLParser.H6SelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(HTMLParser.PElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPSelfClose(HTMLParser.PSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpanSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanSelfClose(HTMLParser.SpanSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivSelfClose(HTMLParser.DivSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrElement(HTMLParser.BrElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrElement(HTMLParser.HrElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreElement(HTMLParser.PreElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreSelfClose(HTMLParser.PreSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockquoteElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockquoteElement(HTMLParser.BlockquoteElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockquoteSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockquoteSelfClose(HTMLParser.BlockquoteSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBElement(HTMLParser.BElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBSelfClose(HTMLParser.BSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrongElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrongElement(HTMLParser.StrongElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrongSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrongSelfClose(HTMLParser.StrongSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIElement(HTMLParser.IElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ISelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitISelfClose(HTMLParser.ISelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmElement(HTMLParser.EmElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmSelfClose(HTMLParser.EmSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUElement(HTMLParser.UElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code USelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUSelfClose(HTMLParser.USelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallElement(HTMLParser.SmallElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallSelfClose(HTMLParser.SmallSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MarkElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkElement(HTMLParser.MarkElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MarkSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkSelfClose(HTMLParser.MarkSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubElement(HTMLParser.SubElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSelfClose(HTMLParser.SubSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SupElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupElement(HTMLParser.SupElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SupSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupSelfClose(HTMLParser.SupSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlElement(HTMLParser.UlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlSelfClose(HTMLParser.UlSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlElement(HTMLParser.OlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlSelfClose(HTMLParser.OlSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiElement(HTMLParser.LiElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiSelfClose(HTMLParser.LiSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DlElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlElement(HTMLParser.DlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DlSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlSelfClose(HTMLParser.DlSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DtElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtElement(HTMLParser.DtElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DtSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtSelfClose(HTMLParser.DtSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdElement(HTMLParser.DdElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdSelfClose(HTMLParser.DdSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAElement(HTMLParser.AElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASelfClose(HTMLParser.ASelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImgElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElement(HTMLParser.ImgElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AudioElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudioElement(HTMLParser.AudioElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AudioSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudioSelfClose(HTMLParser.AudioSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VideoElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVideoElement(HTMLParser.VideoElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VideoSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVideoSelfClose(HTMLParser.VideoSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SourceElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(HTMLParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IframeElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIframeElement(HTMLParser.IframeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IframeSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIframeSelfClose(HTMLParser.IframeSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(HTMLParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSelfClose(HTMLParser.TableSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TheadElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheadElement(HTMLParser.TheadElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TheadSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheadSelfClose(HTMLParser.TheadSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TbodyElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbodyElement(HTMLParser.TbodyElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TbodySelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbodySelfClose(HTMLParser.TbodySelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TfootElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfootElement(HTMLParser.TfootElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TfootSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfootSelfClose(HTMLParser.TfootSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrElement(HTMLParser.TrElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrSelfClose(HTMLParser.TrSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThElement(HTMLParser.ThElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThSelfClose(HTMLParser.ThSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TdElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdElement(HTMLParser.TdElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TdSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdSelfClose(HTMLParser.TdSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptionElement(HTMLParser.CaptionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptionSelfClose(HTMLParser.CaptionSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormElement(HTMLParser.FormElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormSelfClose(HTMLParser.FormSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputElement(HTMLParser.InputElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(HTMLParser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonSelfClose(HTMLParser.ButtonSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(HTMLParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSelfClose(HTMLParser.SelectSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionElement(HTMLParser.OptionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionSelfClose(HTMLParser.OptionSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextareaElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextareaElement(HTMLParser.TextareaElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextareaSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextareaSelfClose(HTMLParser.TextareaSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelElement(HTMLParser.LabelElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelSelfClose(HTMLParser.LabelSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldsetElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsetElement(HTMLParser.FieldsetElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldsetSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsetSelfClose(HTMLParser.FieldsetSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LegendElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegendElement(HTMLParser.LegendElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LegendSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegendSelfClose(HTMLParser.LegendSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HeaderElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderElement(HTMLParser.HeaderElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HeaderSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderSelfClose(HTMLParser.HeaderSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FooterElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooterElement(HTMLParser.FooterElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FooterSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooterSelfClose(HTMLParser.FooterSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavElement(HTMLParser.NavElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavSelfClose(HTMLParser.NavSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainElement(HTMLParser.MainElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSelfClose(HTMLParser.MainSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SectionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionElement(HTMLParser.SectionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SectionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionSelfClose(HTMLParser.SectionSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticleElement(HTMLParser.ArticleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArticleSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticleSelfClose(HTMLParser.ArticleSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsideElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsideElement(HTMLParser.AsideElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsideSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsideSelfClose(HTMLParser.AsideSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FigureElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureElement(HTMLParser.FigureElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FigureSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureSelfClose(HTMLParser.FigureSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FigcaptionElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigcaptionElement(HTMLParser.FigcaptionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FigcaptionSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigcaptionSelfClose(HTMLParser.FigcaptionSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleElementTag}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementTag(HTMLParser.StyleElementTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericElement}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericElement(HTMLParser.GenericElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericSelfClose}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelfClose(HTMLParser.GenericSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVariableTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVariableTemplate(HTMLParser.JinjaVariableTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockTemplate}
	 * labeled alternative in {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockTemplate(HTMLParser.JinjaBlockTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HTMLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(HTMLParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOrExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOrExpr(HTMLParser.BinaryOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passToAndExpr}
	 * labeled alternative in {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassToAndExpr(HTMLParser.PassToAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryAndExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAndExpr(HTMLParser.BinaryAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passToNotExpr}
	 * labeled alternative in {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassToNotExpr(HTMLParser.PassToNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryNotExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotExpr(HTMLParser.UnaryNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passToCompareExpr}
	 * labeled alternative in {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassToCompareExpr(HTMLParser.PassToCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCompareExpr(HTMLParser.ParenCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryCompareExpr}
	 * labeled alternative in {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryCompareExpr(HTMLParser.BinaryCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
}