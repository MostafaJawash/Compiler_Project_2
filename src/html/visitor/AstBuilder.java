package html.visitor;

import html.ast.*;
import html.generated.HTMLParser;
import html.generated.HTMLParserBaseVisitor;
import html.symbolTable.HtmlSymbolTable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AstBuilder extends HTMLParserBaseVisitor<Node> {
    public HtmlSymbolTable htmlST = new HtmlSymbolTable();

    @Override
    public Node visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        List<Node> body = new ArrayList<>();
        if (ctx.htmlElement() != null) {
            Node element = visit(ctx.htmlElement());
            if (element != null) body.add(element);
        }
        return new Program(body, ctx.getStart().getLine());
    }

    /**
     * Builds the HtmlElement AST node and its symbol-table entry for one concrete tag rule.
     * Every visitXxxElement/visitXxxSelfClose override below calls this with its own tag name
     * and symbol type/value known statically from the grammar rule that matched - no runtime
     * tagName.equals(...) dispatch is involved.
     */
    private Node buildElement(String tagName, String symbolType, String symbolValue,
                               List<HTMLParser.HtmlAttributeContext> attrCtxs,
                               HTMLParser.HtmlContentContext contentCtx, int line) {
        htmlST.addSymbol(tagName, symbolType, symbolValue, line);

        boolean hasAttributes = attrCtxs != null && !attrCtxs.isEmpty();
        boolean hasContent = contentCtx != null && contentCtx.getChildCount() > 0;

        List<HtmlAttribute> attributes = new ArrayList<>();
        List<Node> children = new ArrayList<>();

        if (hasAttributes || hasContent) {
            htmlST.pushScope("Tag_" + tagName);
            if (attrCtxs != null) {
                attributes = attrCtxs.stream()
                        .map(a -> (HtmlAttribute) visit(a))
                        .collect(Collectors.toList());
            }
            if (contentCtx != null) {
                for (int i = 0; i < contentCtx.getChildCount(); i++) {
                    Node child = visit(contentCtx.getChild(i));
                    if (child != null) children.add(child);
                }
            }
            htmlST.popScope();
        }
        return new HtmlElement(tagName, attributes, children, line);
    }

    @Override
    public Node visitStyleElementTag(HTMLParser.StyleElementTagContext ctx) {
        return visit(ctx.styleElement());
    }

    // Fallback for any tag not in the explicit standard-tag list above (FIX 1 keeps this as
    // one alternative among many, not the sole rule driving htmlElement).
    @Override
    public Node visitGenericElement(HTMLParser.GenericElementContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText().toLowerCase();
        return buildElement(tagName, "Html_Element", "Generic", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitGenericSelfClose(HTMLParser.GenericSelfCloseContext ctx) {
        String tagName = ctx.TAG_NAME().getText().toLowerCase();
        return buildElement(tagName, "Html_Element", "Generic", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    // ===== Explicit standard HTML tag rules (FIX 1) =====
    @Override
    public Node visitHtmlRootElement(HTMLParser.HtmlRootElementContext ctx) {
        return buildElement("html", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitHtmlRootSelfClose(HTMLParser.HtmlRootSelfCloseContext ctx) {
        return buildElement("html", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitHeadElement(HTMLParser.HeadElementContext ctx) {
        return buildElement("head", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitHeadSelfClose(HTMLParser.HeadSelfCloseContext ctx) {
        return buildElement("head", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitBodyElement(HTMLParser.BodyElementContext ctx) {
        return buildElement("body", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitBodySelfClose(HTMLParser.BodySelfCloseContext ctx) {
        return buildElement("body", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTitleElement(HTMLParser.TitleElementContext ctx) {
        return buildElement("title", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTitleSelfClose(HTMLParser.TitleSelfCloseContext ctx) {
        return buildElement("title", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitMetaElement(HTMLParser.MetaElementContext ctx) {
        return buildElement("meta", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitLinkElement(HTMLParser.LinkElementContext ctx) {
        return buildElement("link", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitScriptElement(HTMLParser.ScriptElementContext ctx) {
        return buildElement("script", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitScriptSelfClose(HTMLParser.ScriptSelfCloseContext ctx) {
        return buildElement("script", "Html_Element", "Doc_Structure", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH1Element(HTMLParser.H1ElementContext ctx) {
        return buildElement("h1", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH1SelfClose(HTMLParser.H1SelfCloseContext ctx) {
        return buildElement("h1", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH2Element(HTMLParser.H2ElementContext ctx) {
        return buildElement("h2", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH2SelfClose(HTMLParser.H2SelfCloseContext ctx) {
        return buildElement("h2", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH3Element(HTMLParser.H3ElementContext ctx) {
        return buildElement("h3", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH3SelfClose(HTMLParser.H3SelfCloseContext ctx) {
        return buildElement("h3", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH4Element(HTMLParser.H4ElementContext ctx) {
        return buildElement("h4", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH4SelfClose(HTMLParser.H4SelfCloseContext ctx) {
        return buildElement("h4", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH5Element(HTMLParser.H5ElementContext ctx) {
        return buildElement("h5", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH5SelfClose(HTMLParser.H5SelfCloseContext ctx) {
        return buildElement("h5", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitH6Element(HTMLParser.H6ElementContext ctx) {
        return buildElement("h6", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitH6SelfClose(HTMLParser.H6SelfCloseContext ctx) {
        return buildElement("h6", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitPElement(HTMLParser.PElementContext ctx) {
        return buildElement("p", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitPSelfClose(HTMLParser.PSelfCloseContext ctx) {
        return buildElement("p", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSpanElement(HTMLParser.SpanElementContext ctx) {
        return buildElement("span", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSpanSelfClose(HTMLParser.SpanSelfCloseContext ctx) {
        return buildElement("span", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitDivElement(HTMLParser.DivElementContext ctx) {
        return buildElement("div", "Div_Block", "Layout Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitDivSelfClose(HTMLParser.DivSelfCloseContext ctx) {
        return buildElement("div", "Div_Block", "Layout Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitBrElement(HTMLParser.BrElementContext ctx) {
        return buildElement("br", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitHrElement(HTMLParser.HrElementContext ctx) {
        return buildElement("hr", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitPreElement(HTMLParser.PreElementContext ctx) {
        return buildElement("pre", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitPreSelfClose(HTMLParser.PreSelfCloseContext ctx) {
        return buildElement("pre", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitBlockquoteElement(HTMLParser.BlockquoteElementContext ctx) {
        return buildElement("blockquote", "Html_Element", "Text_Content", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitBlockquoteSelfClose(HTMLParser.BlockquoteSelfCloseContext ctx) {
        return buildElement("blockquote", "Html_Element", "Text_Content", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitBElement(HTMLParser.BElementContext ctx) {
        return buildElement("b", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitBSelfClose(HTMLParser.BSelfCloseContext ctx) {
        return buildElement("b", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitStrongElement(HTMLParser.StrongElementContext ctx) {
        return buildElement("strong", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitStrongSelfClose(HTMLParser.StrongSelfCloseContext ctx) {
        return buildElement("strong", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitIElement(HTMLParser.IElementContext ctx) {
        return buildElement("i", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitISelfClose(HTMLParser.ISelfCloseContext ctx) {
        return buildElement("i", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitEmElement(HTMLParser.EmElementContext ctx) {
        return buildElement("em", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitEmSelfClose(HTMLParser.EmSelfCloseContext ctx) {
        return buildElement("em", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitUElement(HTMLParser.UElementContext ctx) {
        return buildElement("u", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitUSelfClose(HTMLParser.USelfCloseContext ctx) {
        return buildElement("u", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSmallElement(HTMLParser.SmallElementContext ctx) {
        return buildElement("small", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSmallSelfClose(HTMLParser.SmallSelfCloseContext ctx) {
        return buildElement("small", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitMarkElement(HTMLParser.MarkElementContext ctx) {
        return buildElement("mark", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitMarkSelfClose(HTMLParser.MarkSelfCloseContext ctx) {
        return buildElement("mark", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSubElement(HTMLParser.SubElementContext ctx) {
        return buildElement("sub", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSubSelfClose(HTMLParser.SubSelfCloseContext ctx) {
        return buildElement("sub", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSupElement(HTMLParser.SupElementContext ctx) {
        return buildElement("sup", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSupSelfClose(HTMLParser.SupSelfCloseContext ctx) {
        return buildElement("sup", "Html_Element", "Text_Formatting", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitUlElement(HTMLParser.UlElementContext ctx) {
        return buildElement("ul", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitUlSelfClose(HTMLParser.UlSelfCloseContext ctx) {
        return buildElement("ul", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitOlElement(HTMLParser.OlElementContext ctx) {
        return buildElement("ol", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitOlSelfClose(HTMLParser.OlSelfCloseContext ctx) {
        return buildElement("ol", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitLiElement(HTMLParser.LiElementContext ctx) {
        return buildElement("li", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitLiSelfClose(HTMLParser.LiSelfCloseContext ctx) {
        return buildElement("li", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitDlElement(HTMLParser.DlElementContext ctx) {
        return buildElement("dl", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitDlSelfClose(HTMLParser.DlSelfCloseContext ctx) {
        return buildElement("dl", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitDtElement(HTMLParser.DtElementContext ctx) {
        return buildElement("dt", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitDtSelfClose(HTMLParser.DtSelfCloseContext ctx) {
        return buildElement("dt", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitDdElement(HTMLParser.DdElementContext ctx) {
        return buildElement("dd", "Html_Element", "List", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitDdSelfClose(HTMLParser.DdSelfCloseContext ctx) {
        return buildElement("dd", "Html_Element", "List", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitAElement(HTMLParser.AElementContext ctx) {
        return buildElement("a", "Html_Element", "Link_Media", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitASelfClose(HTMLParser.ASelfCloseContext ctx) {
        return buildElement("a", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitImgElement(HTMLParser.ImgElementContext ctx) {
        return buildElement("img", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitAudioElement(HTMLParser.AudioElementContext ctx) {
        return buildElement("audio", "Html_Element", "Link_Media", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitAudioSelfClose(HTMLParser.AudioSelfCloseContext ctx) {
        return buildElement("audio", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitVideoElement(HTMLParser.VideoElementContext ctx) {
        return buildElement("video", "Html_Element", "Link_Media", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitVideoSelfClose(HTMLParser.VideoSelfCloseContext ctx) {
        return buildElement("video", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSourceElement(HTMLParser.SourceElementContext ctx) {
        return buildElement("source", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitIframeElement(HTMLParser.IframeElementContext ctx) {
        return buildElement("iframe", "Html_Element", "Link_Media", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitIframeSelfClose(HTMLParser.IframeSelfCloseContext ctx) {
        return buildElement("iframe", "Html_Element", "Link_Media", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTableElement(HTMLParser.TableElementContext ctx) {
        return buildElement("table", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTableSelfClose(HTMLParser.TableSelfCloseContext ctx) {
        return buildElement("table", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTheadElement(HTMLParser.TheadElementContext ctx) {
        return buildElement("thead", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTheadSelfClose(HTMLParser.TheadSelfCloseContext ctx) {
        return buildElement("thead", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTbodyElement(HTMLParser.TbodyElementContext ctx) {
        return buildElement("tbody", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTbodySelfClose(HTMLParser.TbodySelfCloseContext ctx) {
        return buildElement("tbody", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTfootElement(HTMLParser.TfootElementContext ctx) {
        return buildElement("tfoot", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTfootSelfClose(HTMLParser.TfootSelfCloseContext ctx) {
        return buildElement("tfoot", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTrElement(HTMLParser.TrElementContext ctx) {
        return buildElement("tr", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTrSelfClose(HTMLParser.TrSelfCloseContext ctx) {
        return buildElement("tr", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitThElement(HTMLParser.ThElementContext ctx) {
        return buildElement("th", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitThSelfClose(HTMLParser.ThSelfCloseContext ctx) {
        return buildElement("th", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTdElement(HTMLParser.TdElementContext ctx) {
        return buildElement("td", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTdSelfClose(HTMLParser.TdSelfCloseContext ctx) {
        return buildElement("td", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitCaptionElement(HTMLParser.CaptionElementContext ctx) {
        return buildElement("caption", "Html_Element", "Table", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitCaptionSelfClose(HTMLParser.CaptionSelfCloseContext ctx) {
        return buildElement("caption", "Html_Element", "Table", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitFormElement(HTMLParser.FormElementContext ctx) {
        return buildElement("form", "Form_Structure", "Container", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitFormSelfClose(HTMLParser.FormSelfCloseContext ctx) {
        return buildElement("form", "Form_Structure", "Container", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitInputElement(HTMLParser.InputElementContext ctx) {
        return buildElement("input", "Input_Field", "Interactive", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitButtonElement(HTMLParser.ButtonElementContext ctx) {
        return buildElement("button", "Button_Action", "Submit/Click", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitButtonSelfClose(HTMLParser.ButtonSelfCloseContext ctx) {
        return buildElement("button", "Button_Action", "Submit/Click", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSelectElement(HTMLParser.SelectElementContext ctx) {
        return buildElement("select", "Html_Element", "Form", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSelectSelfClose(HTMLParser.SelectSelfCloseContext ctx) {
        return buildElement("select", "Html_Element", "Form", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitOptionElement(HTMLParser.OptionElementContext ctx) {
        return buildElement("option", "Html_Element", "Form", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitOptionSelfClose(HTMLParser.OptionSelfCloseContext ctx) {
        return buildElement("option", "Html_Element", "Form", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitTextareaElement(HTMLParser.TextareaElementContext ctx) {
        return buildElement("textarea", "Text_Area", "Multi-line Input", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitTextareaSelfClose(HTMLParser.TextareaSelfCloseContext ctx) {
        return buildElement("textarea", "Text_Area", "Multi-line Input", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitLabelElement(HTMLParser.LabelElementContext ctx) {
        return buildElement("label", "Html_Element", "Form", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitLabelSelfClose(HTMLParser.LabelSelfCloseContext ctx) {
        return buildElement("label", "Html_Element", "Form", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitFieldsetElement(HTMLParser.FieldsetElementContext ctx) {
        return buildElement("fieldset", "Html_Element", "Form", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitFieldsetSelfClose(HTMLParser.FieldsetSelfCloseContext ctx) {
        return buildElement("fieldset", "Html_Element", "Form", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitLegendElement(HTMLParser.LegendElementContext ctx) {
        return buildElement("legend", "Html_Element", "Form", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitLegendSelfClose(HTMLParser.LegendSelfCloseContext ctx) {
        return buildElement("legend", "Html_Element", "Form", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitHeaderElement(HTMLParser.HeaderElementContext ctx) {
        return buildElement("header", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitHeaderSelfClose(HTMLParser.HeaderSelfCloseContext ctx) {
        return buildElement("header", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitFooterElement(HTMLParser.FooterElementContext ctx) {
        return buildElement("footer", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitFooterSelfClose(HTMLParser.FooterSelfCloseContext ctx) {
        return buildElement("footer", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitNavElement(HTMLParser.NavElementContext ctx) {
        return buildElement("nav", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitNavSelfClose(HTMLParser.NavSelfCloseContext ctx) {
        return buildElement("nav", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitMainElement(HTMLParser.MainElementContext ctx) {
        return buildElement("main", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitMainSelfClose(HTMLParser.MainSelfCloseContext ctx) {
        return buildElement("main", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitSectionElement(HTMLParser.SectionElementContext ctx) {
        return buildElement("section", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitSectionSelfClose(HTMLParser.SectionSelfCloseContext ctx) {
        return buildElement("section", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitArticleElement(HTMLParser.ArticleElementContext ctx) {
        return buildElement("article", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitArticleSelfClose(HTMLParser.ArticleSelfCloseContext ctx) {
        return buildElement("article", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitAsideElement(HTMLParser.AsideElementContext ctx) {
        return buildElement("aside", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitAsideSelfClose(HTMLParser.AsideSelfCloseContext ctx) {
        return buildElement("aside", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitFigureElement(HTMLParser.FigureElementContext ctx) {
        return buildElement("figure", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitFigureSelfClose(HTMLParser.FigureSelfCloseContext ctx) {
        return buildElement("figure", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitFigcaptionElement(HTMLParser.FigcaptionElementContext ctx) {
        return buildElement("figcaption", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), ctx.htmlContent(), ctx.getStart().getLine());
    }

    @Override
    public Node visitFigcaptionSelfClose(HTMLParser.FigcaptionSelfCloseContext ctx) {
        return buildElement("figcaption", "Html_Element", "Semantic_Layout", ctx.htmlAttribute(), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String name = ctx.attributeName() != null ? ctx.attributeName().getText() : "";
        int line = ctx.getStart().getLine();
        String rawValue = ctx.attrValue() != null ? ctx.attrValue().getText().replaceAll("^['\"]|['\"]$", "") : "true";
        htmlST.addSymbol(name, "Attribute", rawValue, line);
        Node valueNode = null;
        if (ctx.attrValue() != null) {
            var attrCtx = ctx.attrValue();
            if (attrCtx instanceof HTMLParser.DqJINJAContext || attrCtx instanceof HTMLParser.SqJINJAContext) {
                List<Node> children = new ArrayList<>();
                for (int i = 1; i < attrCtx.getChildCount() - 1; i++) {
                    Node child = visit(attrCtx.getChild(i));
                    if (child != null) children.add(child);
                }
                if (!children.isEmpty()) {
                    valueNode = children.size() == 1 ? children.get(0) : new ConcatNode(children, ctx.getStart().getLine());
                }
            } else {
                valueNode = visit(attrCtx);
                if (valueNode == null) {
                    String val = attrCtx.getText().replaceAll("^['\"]|['\"]$", "");
                    valueNode = new TextNode(val, ctx.getStart().getLine());
                }
            }
        } else {
            valueNode = new TextNode("true", ctx.getStart().getLine());
        }
        return new HtmlAttribute(name, valueNode, ctx.getStart().getLine());
    }


    @Override
    public Node visitJinjaVariableTemplate(HTMLParser.JinjaVariableTemplateContext ctx) {
        return visit(ctx.variable());
    }

    @Override
    public Node visitVariable(HTMLParser.VariableContext ctx) {
        // variable has no labeled alternatives, so ANTLR's default visitChildren would visit
        // VARIABLE_START, the expression, then VARIABLE_END and keep only the LAST result -
        // which is null (VARIABLE_END isn't a TEXT token). Dispatch to the actual expression
        // explicitly so {{ ... }} content is not silently dropped from the AST.
        if (ctx.expr() != null) return visit(ctx.expr());
        if (ctx.exprMath() != null) return visit(ctx.exprMath());
        if (ctx.funCall() != null) return visit(ctx.funCall());
        if (ctx.exprLogic() != null) return visit(ctx.exprLogic());
        return new TextNode("", ctx.getStart().getLine());
    }

    @Override
    public Node visitJinjaBlockTemplate(HTMLParser.JinjaBlockTemplateContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Node visitIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx) {
        return buildIdentifier(ctx.IDENTIFIER(), ctx.getStart().getLine());
    }

    @Override
    public Node visitNumberEXPR(HTMLParser.NumberEXPRContext ctx) {
        int value = Integer.parseInt(ctx.NUMBER().getText());
        return new NumberNode(value, ctx.getStart().getLine());
    }


    @Override
    public Node visitStringEXPR(HTMLParser.StringEXPRContext ctx) {
        String text = ctx.STRING().getText();
        text = text.replaceAll("^['\"]|['\"]$", "");
        return new TextNode(text, ctx.getStart().getLine());
    }

    public Node visitFunCall(HTMLParser.FunCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Node> arguments = new ArrayList<>();

        if (ctx.arguments() != null) {
            for (var argCtx : ctx.arguments().argument()) {
                Node result = visit(argCtx);
                if (result instanceof ArgumentNode argNode) {
                    arguments.add(argNode);
                } else if (result != null) {
                    arguments.add(new ArgumentNode(null, result, ctx.getStart().getLine()));
                }
            }
        }
        return new FunctionNode(functionName, arguments, ctx.getStart().getLine());
    }


    @Override
    public ArgumentNode visitNonAssign(HTMLParser.NonAssignContext ctx) {
        Node value = null;
        if (ctx.getChildCount() > 0) {
            value = visit(ctx.getChild(0));
        }
        if (value == null) {
            value = new TextNode(ctx.getText().replaceAll("^['\"]|['\"]$", ""), ctx.getStart().getLine());
        }
        return new ArgumentNode(null, value, ctx.getStart().getLine());
    }


    @Override
    public ArgumentNode visitAssign(HTMLParser.AssignContext ctx) {
        Node value = null;
        if (ctx.valueFun() != null) {
            value = visit(ctx.valueFun());
        } else if (ctx.getChildCount() > 2) {
            value = visit(ctx.getChild(2));
        }
        if (value == null) {
            value = new TextNode(ctx.getChildCount() > 2 ? ctx.getChild(2).getText() : "", ctx.getStart().getLine());
        }
        String fullName = ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(Collectors.joining("."));
        return new ArgumentNode(fullName, value, ctx.getStart().getLine());
    }


    private Node buildIdentifier(List<TerminalNode> ids, int line) {
        if (ids == null || ids.isEmpty())
            return new TextNode("", line);
        Node current = new IdentifierNode(ids.get(0).getText(), line);
        for (int i = 1; i < ids.size(); i++) {
            current = new MemberAccessNode(current, ids.get(i).getText(), line);
        }
        return current;
    }

    @Override
    public Node visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == HTMLParser.TEXT) {
            String text = node.getText().trim();
            if (!text.isEmpty()) return new TextNode(text, node.getSymbol().getLine());
        }
        return null;
    }

    @Override
    public Node visitForBlock(HTMLParser.ForBlockContext ctx) {
        int line = ctx.getStart().getLine();
        htmlST.pushScope("Jinja_For_Line" +line);
        var forStmt = ctx.forStmt();
        List<String> variables = new ArrayList<>();
        Node iterable = null;

        int inIndex = -1;
        for (int i = 0; i < forStmt.getChildCount(); i++) {
            if (forStmt.getChild(i) instanceof TerminalNode node && node.getText().equalsIgnoreCase("in")) {
                inIndex = i;
                break;
            }
        }
        int inTokenIndex = ((TerminalNode) forStmt.getChild(inIndex)).getSymbol().getTokenIndex();

        for (TerminalNode id : forStmt.IDENTIFIER()) {
            if (id.getSymbol().getTokenIndex() < inTokenIndex) {
                String varName = id.getText();
                variables.add(varName);

                htmlST.addSymbol(varName, "Jinja_Var", "Loop_Iterator", line);
            }
        }

        if (forStmt.funCall() != null) {
            iterable = visit(forStmt.funCall());
        } else {
            List<TerminalNode> idsAfterIn = forStmt.IDENTIFIER().stream()
                    .filter(id -> id.getSymbol().getTokenIndex() > inTokenIndex)
                    .collect(Collectors.toList());
            if (!idsAfterIn.isEmpty()) iterable = buildIdentifier(idsAfterIn, line);
        }
        if (iterable == null) iterable = new TextNode("[]", line);

        List<Node> body = new ArrayList<>();
        if (forStmt.htmlContent() != null) {
            for (int i = 0; i < forStmt.htmlContent().getChildCount(); i++) {
                Node child = visit(forStmt.htmlContent().getChild(i));
                if (child != null) body.add(child);
            }
        }
        htmlST.popScope();
        return new JinjaForBlock(variables, iterable, body, line);
    }

    @Override

    public Node visitIfBlock(HTMLParser.IfBlockContext ctx) {
        int line = ctx.getStart().getLine();
        var ifStmt = ctx.ifStmt();
        boolean hasBody = ifStmt.htmlContent() != null && ifStmt.htmlContent().getChildCount() > 0;
        boolean hasElse = ifStmt.elseStm() != null && ifStmt.elseStm().htmlContent() != null;
        if (hasBody || hasElse) {
            htmlST.pushScope("Jinja_If_Block_Line_" + line);
            htmlST.popScope();
        }
        Node condition = visit(ifStmt.getChild(2));
        if (condition == null) condition = new TextNode("true", line);
        List<Node> body = new ArrayList<>();
        if (ifStmt.htmlContent() != null) {
            for (int i = 0; i < ifStmt.htmlContent().getChildCount(); i++) {
                Node child = visit(ifStmt.htmlContent().getChild(i));
                if (child != null) body.add(child);
            }
        }
        List<JinjaIfBlock.ElifBranch> elifBranches = new ArrayList<>();
        for (var elifCtx : ifStmt.elifStm()) {
            Node elifCondition = visit(elifCtx.getChild(2));
            if (elifCondition == null) elifCondition = new TextNode("true", elifCtx.getStart().getLine());
            List<Node> elifBody = new ArrayList<>();
            if (elifCtx.htmlContent() != null) {
                for (int i = 0; i < elifCtx.htmlContent().getChildCount(); i++) {
                    Node child = visit(elifCtx.htmlContent().getChild(i));
                    if (child != null) elifBody.add(child);
                }
            }
            elifBranches.add(new JinjaIfBlock.ElifBranch(elifCondition, elifBody));
        }
        List<Node> elseBody = new ArrayList<>();
        if (ifStmt.elseStm() != null && ifStmt.elseStm().htmlContent() != null) {
            for (int i = 0; i < ifStmt.elseStm().htmlContent().getChildCount(); i++) {
                Node child = visit(ifStmt.elseStm().htmlContent().getChild(i));
                if (child != null) elseBody.add(child);
            }
        }
        return new JinjaIfBlock(condition, body, elifBranches, elseBody, line);
    }


    @Override
    public Node visitStyleElement(HTMLParser.StyleElementContext ctx) {
        return new StyleElement(ctx.stylesheet() != null ? (Stylesheet) visit(ctx.stylesheet()) : new Stylesheet(List.of(), ctx.getStart().getLine()), ctx.getStart().getLine());
    }

    @Override
    public Node visitStylesheet(HTMLParser.StylesheetContext ctx) {
        List<CssRule> rules = new ArrayList<>();
        for (var ruleCtx : ctx.ruleSet()) {
            CssRule decl = (CssRule) visit(ruleCtx);
            if (decl != null) rules.add(decl);
        }
        return new Stylesheet(rules, ctx.getStart().getLine());
    }

    @Override
    public Node visitRuleSet(HTMLParser.RuleSetContext ctx) {
        String selector = ctx.selector().getText();
        int line = ctx.getStart().getLine();
        List<CssDeclaration> decls = new ArrayList<>();
        if (ctx.declaration() != null && !ctx.declaration().isEmpty()) {
            htmlST.pushScope("CSS_" + selector);
            for (var declCtx : ctx.declaration()) {
                CssDeclaration decl = (CssDeclaration) visit(declCtx);
                if (decl != null) decls.add(decl);
            }
            htmlST.popScope();
        }

        return new CssRule(selector, decls, line);}

    @Override
    public Node visitDeclaration(HTMLParser.DeclarationContext ctx) {
        String property = ctx.property().getText();
        String value = ctx.value().getText();
        int line = ctx.getStart().getLine();
        htmlST.addSymbol(property, "CSS_Property", value, line);
        return new CssDeclaration(property, value, line);
    }

    @Override
    public Node visitAddOperation(HTMLParser.AddOperationContext ctx) {
        return new ArithmeticNode(
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ArithmeticNode.Operator.ADD,
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitSubOperation(HTMLParser.SubOperationContext ctx) {
        return new ArithmeticNode(
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ArithmeticNode.Operator.SUB,
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitMulOperation(HTMLParser.MulOperationContext ctx) {
        return new ArithmeticNode(
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ArithmeticNode.Operator.MUL,
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitDivOperation(HTMLParser.DivOperationContext ctx) {
        return new ArithmeticNode(
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ArithmeticNode.Operator.DIV,
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitModOperation(HTMLParser.ModOperationContext ctx) {
        return new ArithmeticNode(
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ArithmeticNode.Operator.MOD,
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitIdMath(HTMLParser.IdMathContext ctx) {
        return new IdentifierNode(
                ctx.IDENTIFIER().getText(),
                ctx.getStart().getLine()
        );
    }

    @Override
    public Node visitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx) {
        return visit(ctx.getChild(1));
    }


    @Override
    public Node visitLogicalOrExpression(HTMLParser.LogicalOrExpressionContext ctx) {
        return visit(ctx.orExpr());
    }

    @Override
    public Node visitBinaryOrExpr(HTMLParser.BinaryOrExprContext ctx) {
        // تم تصحيح جلب العناصر المتوافقة مع الـ Context الحالي لديكِ لمنع الخطأ
        Node left = visit(ctx.getChild(0));
        Node right = visit(ctx.getChild(2));
        return new LogicNode(left, right, LogicNode.LogicOp.OR, ctx.getStart().getLine());
    }

    @Override
    public Node visitPassToAndExpr(HTMLParser.PassToAndExprContext ctx) {
        return visit(ctx.andExpr());
    }
    @Override
    public Node visitBinaryAndExpr(HTMLParser.BinaryAndExprContext ctx) {
        // تم تصحيح جلب العناصر المتوافقة مع الـ Context الحالي لديكِ لمنع الخطأ
        Node left = visit(ctx.getChild(0));
        Node right = visit(ctx.getChild(2));
        return new LogicNode(left, right, LogicNode.LogicOp.AND, ctx.getStart().getLine());
    }

    @Override
    public Node visitPassToNotExpr(HTMLParser.PassToNotExprContext ctx) {
        return visit(ctx.notExpr());
    }
    @Override
    public Node visitUnaryNotExpr(HTMLParser.UnaryNotExprContext ctx) {
        // تم تصحيح جلب العناصر المتوافقة مع الـ Context الحالي لديكِ لمنع الخطأ
        Node expression = visit(ctx.getChild(1));
        return new LogicNode(expression, null, LogicNode.LogicOp.NOT, ctx.getStart().getLine());
    }
    @Override
    public Node visitPassToCompareExpr(HTMLParser.PassToCompareExprContext ctx) {
        return visit(ctx.compareExpr());
    }

    @Override
    public Node visitParenCompareExpr(HTMLParser.ParenCompareExprContext ctx) {
        return visit(ctx.exprLogic());
    }

    @Override
    public Node visitBinaryCompareExpr(HTMLParser.BinaryCompareExprContext ctx) {
        Node left = visit(ctx.logicalArg(0));
        if (ctx.OPERATOR() != null) {
            Node right = visit(ctx.logicalArg(1));
            LogicNode.LogicOp op = switch (ctx.OPERATOR().getText()) {
                case "==" -> LogicNode.LogicOp.EQ;
                case "!=" -> LogicNode.LogicOp.NEQ;
                case ">" -> LogicNode.LogicOp.GT;
                case ">=" -> LogicNode.LogicOp.GTE;
                case "<" -> LogicNode.LogicOp.LT;
                case "<=" -> LogicNode.LogicOp.LTE;
                default -> throw new IllegalStateException("Unknown comparison operator token: " + ctx.OPERATOR().getText());
            };
            return new LogicNode(left, right, op, ctx.getStart().getLine());
        }
        return left;
    }

    @Override
    public Node visitIdLogic(HTMLParser.IdLogicContext ctx) {
        return buildIdentifier(ctx.IDENTIFIER(), ctx.getStart().getLine());
    }

    @Override
    public Node visitStrLogic(HTMLParser.StrLogicContext ctx) {
        String text = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", "");
        return new TextNode(text, ctx.getStart().getLine());
    }

    @Override
    public Node visitNumberLogic(HTMLParser.NumberLogicContext ctx) {
        return new NumberNode(Integer.parseInt(ctx.NUMBER().getText()), ctx.getStart().getLine());
    }

    @Override
    public Node visitBoolLogic(HTMLParser.BoolLogicContext ctx) {
        return new TextNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public Node visitNoneLogic(HTMLParser.NoneLogicContext ctx) {
        return new TextNode("None", ctx.getStart().getLine());
    }

    @Override
    public Node visitExprMathLogic(HTMLParser.ExprMathLogicContext ctx) {
        return visit(ctx.exprMath());
    }

    @Override
    public Node visitNumberMath(HTMLParser.NumberMathContext ctx) {
        int value = Integer.parseInt(ctx.NUMBER().getText());
        return new NumberNode(value, ctx.getStart().getLine());
    }

}
