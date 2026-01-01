package html.visitor;

import html.ast.*;
import html.generated.HTMLParser;
import html.generated.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AstBuilder extends HTMLParserBaseVisitor<Node> {

    @Override
    public Node visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        List<Node> body = new ArrayList<>();
        if (ctx.htmlElement() != null) {
            Node element = visit(ctx.htmlElement());
            if (element != null) body.add(element);
        }
        return new Program(body, ctx.getStart().getLine());
    }

    @Override
    public Node visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        if (ctx.styleElement() != null) return visit(ctx.styleElement());

        String tagName = ctx.TAG_NAME(0).getText();
        List<HtmlAttribute> attributes = ctx.htmlAttribute().stream()
                .map(a -> (HtmlAttribute) visit(a))
                .collect(Collectors.toList());

        List<Node> children = new ArrayList<>();
        if (ctx.htmlContent() != null) {
            for (int i = 0; i < ctx.htmlContent().getChildCount(); i++) {
                Node child = visit(ctx.htmlContent().getChild(i));
                if (child != null) children.add(child);
            }
        }

        return new HtmlElement(tagName, attributes, children, ctx.getStart().getLine());
    }

    @Override
    public Node visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME() != null ? ctx.TAG_NAME().getText() : "";
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
                    valueNode = children.size() == 1 ? children.get(0)
                            : new ConcatNode(children, ctx.getStart().getLine());
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
    public Node visitVariable(HTMLParser.VariableContext ctx) {
        Node expression = ctx.getChildCount() >= 3 ? visit(ctx.getChild(1)) : new TextNode("", ctx.getStart().getLine());
        return new JinjaExpressionNode(expression, ctx.getStart().getLine());
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

        String fullName = ctx.IDENTIFIER().stream()
                .map(TerminalNode::getText)
                .collect(Collectors.joining("."));

        return new ArgumentNode(fullName, value, ctx.getStart().getLine());
    }



    private Node buildIdentifier(List<TerminalNode> ids, int line) {
        if (ids == null || ids.isEmpty()) return new TextNode("", line);

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
            if (id.getSymbol().getTokenIndex() < inTokenIndex) variables.add(id.getText());
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

        return new JinjaForBlock(variables, iterable, body, line);
    }

    @Override
    public Node visitIfBlock(HTMLParser.IfBlockContext ctx) {
        int line = ctx.getStart().getLine();
        var ifStmt = ctx.ifStmt();

        Node condition = visit(ifStmt.getChild(2));
        if (condition == null) condition = new TextNode("true", line);

        List<Node> body = new ArrayList<>();
        if (ifStmt.htmlContent() != null) {
            for (int i = 0; i < ifStmt.htmlContent().getChildCount(); i++) {
                Node child = visit(ifStmt.htmlContent().getChild(i));
                if (child != null) body.add(child);
            }
        }

        List<Node> elseBody = new ArrayList<>();
        if (ifStmt.elseStm() != null && ifStmt.elseStm().htmlContent() != null) {
            for (int i = 0; i < ifStmt.elseStm().htmlContent().getChildCount(); i++) {
                Node child = visit(ifStmt.elseStm().htmlContent().getChild(i));
                if (child != null) elseBody.add(child);
            }
        }

        return new JinjaIfBlock(condition, body, elseBody, line);
    }


    @Override
    public Node visitStyleElement(HTMLParser.StyleElementContext ctx) {
        return new StyleElement(
                ctx.stylesheet() != null ? (Stylesheet) visit(ctx.stylesheet()) : new Stylesheet(List.of(), ctx.getStart().getLine()),
                ctx.getStart().getLine()
        );
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
        List<CssDeclaration> decls = new ArrayList<>();
        for (var declCtx : ctx.declaration()) {
            CssDeclaration decl = (CssDeclaration) visit(declCtx);
            if (decl != null) decls.add(decl);
        }
        return new CssRule(selector, decls, ctx.getStart().getLine());
    }

    @Override
    public Node visitDeclaration(HTMLParser.DeclarationContext ctx) {
        return new CssDeclaration(
                ctx.property().getText(),
                ctx.value().getText(),
                ctx.getStart().getLine()
        );
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
    public Node visitOrExpr(HTMLParser.OrExprContext ctx) {
        return new LogicNode(visit(ctx.getChild(0)), ctx.getChildCount() > 2 ? visit(ctx.getChild(2)) : null, ctx.getStart().getLine());
    }

    @Override
    public Node visitAndExpr(HTMLParser.AndExprContext ctx) {
        return new LogicNode(visit(ctx.getChild(0)), ctx.getChildCount() > 2 ? visit(ctx.getChild(2)) : null, ctx.getStart().getLine());
    }

    @Override
    public Node visitNotExpr(HTMLParser.NotExprContext ctx) {
        return new LogicNode(visit(ctx.getChild(1)), null, ctx.getStart().getLine());
    }

    @Override
    public Node visitCompareExpr(HTMLParser.CompareExprContext ctx) {
        return new LogicNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitNumberMath(HTMLParser.NumberMathContext ctx) {
        int value = Integer.parseInt(ctx.NUMBER().getText());
        return new NumberNode(value, ctx.getStart().getLine());
    }

}
