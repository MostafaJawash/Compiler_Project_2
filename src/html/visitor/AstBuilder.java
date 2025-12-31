package html.visitor;

import html.ast.*;
import html.generated.HTMLParser;
import html.generated.HTMLParserBaseVisitor;
import html.symbolTable.HtmlSymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class AstBuilder extends HTMLParserBaseVisitor<Node> {
    public HtmlSymbolTable htmlST = new HtmlSymbolTable();
    @Override
    public Node visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        List<Node> body = new ArrayList<>();
        if (ctx.htmlElement() != null) {
            body.add(visit(ctx.htmlElement()));
        }
        return new Program(body);
    }
    @Override
    public Node visitFunCall(HTMLParser.FunCallContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        return new TextNode("FunctionCall: " + funcName);
    }
    @Override
    public Node visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        if (ctx.styleElement() != null) {
            return visit(ctx.styleElement());
        }

        String tagName = ctx.TAG_NAME(0).getText();
        htmlST.pushScope(tagName);

        List<HtmlAttribute> attributes = ctx.htmlAttribute().stream()
                .map(attrCtx -> (HtmlAttribute) visit(attrCtx))
                .collect(Collectors.toList());

        List<Node> children = (ctx.htmlContent() != null)
                ? ((ContentNode) visit(ctx.htmlContent())).getChildren()
                : Collections.emptyList();
        htmlST.popScope();
        return new HtmlElement(tagName, attributes, children);
    }

    @Override
    public Node visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        List<Node> children = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            var child = ctx.getChild(i);
            if (child instanceof TerminalNodeImpl) {
                children.add(new TextNode(child.getText()));
            } else {
                Node visited = visit(child);
                if (visited != null) children.add(visited);
            }
        }
        return new ContentNode(children);
    }
    @Override
    public Node visitForBlock(HTMLParser.ForBlockContext ctx) {
        String loopVar = ctx.forStmt().IDENTIFIER(0).getText();
        String iterable = ctx.forStmt().getChild(4).getText();
        htmlST.pushScope("For_Loop");
        htmlST.addSymbol(loopVar, "Jinja_LoopVar", iterable, ctx.getStart().getLine());
        List<Node> body = ((ContentNode) visit(ctx.forStmt().htmlContent())).getChildren();
        htmlST.popScope();
        return new JinjaForBlock(loopVar, iterable, body);
    }

    @Override
    public Node visitIfBlock(HTMLParser.IfBlockContext ctx) {
        String condition = ctx.ifStmt().getChild(2).getText();
        List<Node> body = ((ContentNode) visit(ctx.ifStmt().htmlContent())).getChildren();

        List<Node> elseBody = null;
        if (ctx.ifStmt().elseStm() != null) {
            elseBody = ((ContentNode) visit(ctx.ifStmt().elseStm().htmlContent())).getChildren();
        }

        return new JinjaIfBlock(condition, body, elseBody);
    }


    @Override
    public Node visitVariable(HTMLParser.VariableContext ctx) {
        return visit(ctx.getChild(1));
    }


    @Override
    public Node visitAddOperation(HTMLParser.AddOperationContext ctx) {
        Node left = visit(ctx.exprMath(0));
        Node right = visit(ctx.exprMath(1));
        if (left == null || right == null) return new TextNode("Error: Math expression incomplete");
        return new ArithmeticNode(ctx.getChild(1).getText(), left, right);
    }

    @Override
    public Node visitMulOperation(HTMLParser.MulOperationContext ctx) {
        Node left = visit(ctx.exprMath(0));
        Node right = visit(ctx.exprMath(1));
        return new ArithmeticNode(ctx.getChild(1).getText(), left, right);
    }

    @Override
    public Node visitIdMath(HTMLParser.IdMathContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitNumberMath(HTMLParser.NumberMathContext ctx) {
        return new NumberNode(ctx.NUMBER().getText());
    }



    @Override
    public Node visitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx) {
        return visit(ctx.exprMath());
    }

    @Override
    public Node visitTemplate(HTMLParser.TemplateContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        String value = (ctx.attrValue() != null) ? ctx.attrValue().getText() : "";
        htmlST.addSymbol(name, "HTML_Attribute", value, ctx.getStart().getLine());
        if (value.startsWith("\"") && value.endsWith("\"") || value.startsWith("'") && value.endsWith("'")) {
            value = value.substring(1, value.length() - 1);
        }

        return new HtmlAttribute(name, value);
    }
    @Override
    public Node visitSubOperation(HTMLParser.SubOperationContext ctx) {
        Node left = visit(ctx.exprMath(0));
        Node right = visit(ctx.exprMath(1));
        return new ArithmeticNode("-", left, right);
    }@Override
    public Node visitNumberLogic(HTMLParser.NumberLogicContext ctx) {
        return new NumberNode(ctx.NUMBER().getText());
    }

    @Override
    public Node visitBoolLogic(HTMLParser.BoolLogicContext ctx) {
        return new TextNode(ctx.getText()); // أو إنشاء BooleanNode
    }

    @Override
    public Node visitNoneLogic(HTMLParser.NoneLogicContext ctx) {
        return new TextNode("None");
    }
    @Override
    public Node visitAndExpr(HTMLParser.AndExprContext ctx) {
        Node left = visit(ctx.notExpr(0));
        Node right = visit(ctx.notExpr(1));
        return new LogicNode("and", left, right);
    }
    @Override
    public Node visitOrExpr(HTMLParser.OrExprContext ctx) {
        Node left = visit(ctx.andExpr(0));
        Node right = visit(ctx.andExpr(1));
        return new LogicNode("or", left, right);
    }
    @Override
    public Node visitNotExpr(HTMLParser.NotExprContext ctx) {
        Node expr = visit(ctx.notExpr());
        return new LogicNode("not", expr, null);
    }
    @Override
    public Node visitCompareExpr(HTMLParser.CompareExprContext ctx) {
        if (ctx.OPERATOR() == null) {
            return visit(ctx.logicalArg(0));
        }

        Node left = visit(ctx.logicalArg(0));
        Node right = visit(ctx.logicalArg(1));
        return new LogicNode(ctx.OPERATOR().getText(), left, right);
    }

    @Override
    public Node visitIdLogic(HTMLParser.IdLogicContext ctx) {
        return new IdentifierNode(ctx.getText());
    }
    @Override
    public Node visitStyleElement(HTMLParser.StyleElementContext ctx) {
        Stylesheet stylesheet = (Stylesheet) visit(ctx.stylesheet());
        return new StyleElement(stylesheet);
    }

    @Override
    public Node visitStylesheet(HTMLParser.StylesheetContext ctx) {
        List<CssRule> rules = ctx.ruleSet().stream()
                .map(ruleCtx -> (CssRule) visit(ruleCtx))
                .collect(Collectors.toList());
        return new Stylesheet(rules);
    }

    @Override
    public Node visitRuleSet(HTMLParser.RuleSetContext ctx) {
        String selector = ctx.selector().getText();
        List<CssDeclaration> declarations = ctx.declaration().stream()
                .map(declCtx -> (CssDeclaration) visit(declCtx))
                .collect(Collectors.toList());
        return new CssRule(selector, declarations);
    }

    @Override
    public Node visitDeclaration(HTMLParser.DeclarationContext ctx) {
        String property = ctx.property().getText();
        String value = ctx.value().getText();
        htmlST.addSymbol(property, "CSS_Property", value, ctx.getStart().getLine());
        return new CssDeclaration(property, value);
    }

    private static class ContentNode implements Node {
        private final List<Node> children;
        public ContentNode(List<Node> children) { this.children = children; }
        public List<Node> getChildren() { return children; }
        @Override
        public String prettyPrint(int indent) { return ""; }
    }
}