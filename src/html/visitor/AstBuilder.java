package html.visitor;

import html.ast.*;
import html.generated.HTMLParser;
import html.generated.HTMLParserBaseVisitor;
import html.symbolTable.HtmlSymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;
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

    @Override
    public Node visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        if (ctx.styleElement() != null) return visit(ctx.styleElement());

        String tagName = ctx.TAG_NAME(0).getText();

        htmlST.pushScope(tagName);



        List<Node> children = new ArrayList<>();
        if (ctx.htmlContent() != null) {
            for (int i = 0; i < ctx.htmlContent().getChildCount(); i++) {
                Node child = visit(ctx.htmlContent().getChild(i));
                if (child != null) children.add(child);
            }
        }

        ArrayList attributes=new ArrayList();
        for(int i=0;i<ctx.htmlAttribute().size();i++){
            attributes.add(visit(ctx.htmlAttribute(i)));
        }
        return new HtmlElement(tagName, attributes, children, ctx.getStart().getLine());

    }

    @Override
    public Node visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME() != null ? ctx.TAG_NAME().getText() : "";
        Node valueNode = null;

        if (ctx.attrValue() != null) {
            var attrCtx = ctx.attrValue();
            if (attrCtx instanceof HTMLParser.DqJINJAContext ||
                    attrCtx instanceof HTMLParser.SqJINJAContext) {
                ParseTree jinjaContent = attrCtx.getChild(1);
                valueNode = visit(jinjaContent);
            } else {
                String val = attrCtx.getText().replaceAll("^['\"]|['\"]$", "");
                valueNode = new TextNode(val, ctx.getStart().getLine());
            }
        }
        return new HtmlAttribute(name, valueNode, ctx.getStart().getLine());
    }


    @Override

    public Node visitVariable(HTMLParser.VariableContext ctx) {
        Node content = visit(ctx.getChild(1));
        return new JinjaExpressionNode(content, ctx.getStart().getLine());

    }

    @Override
    public Node visitFunCall(HTMLParser.FunCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Node> arguments = new ArrayList<>();
        if (ctx.arguments() != null) {
            for (var argCtx : ctx.arguments().argument()) {
                arguments.add(visit(argCtx));
            }
        }
        return new FunctionNode(functionName, arguments, ctx.getStart().getLine());
    }

    @Override
    public Node visitNonAssign(HTMLParser.NonAssignContext ctx) {
        return new ArgumentNode(null, visit(ctx.getChild(0)), ctx.getStart().getLine());
    }

    @Override
    public Node visitAssign(HTMLParser.AssignContext ctx) {
        String argName = ctx.IDENTIFIER(0).getText();
        Node value = ctx.valueFun() != null ? visit(ctx.valueFun()) : null;
        return new ArgumentNode(argName, value, ctx.getStart().getLine());
    }

    @Override
    public Node visitStrArg(HTMLParser.StrArgContext ctx) {
        return new TextNode(ctx.STRING().getText(), ctx.getStart().getLine());
    }

    @Override
    public Node visitIdArg(HTMLParser.IdArgContext ctx) {
        return buildIdentifier(ctx.IDENTIFIER(), ctx.getStart().getLine());
    }

    @Override
    public Node visitIdValue(HTMLParser.IdValueContext ctx) {
        return buildIdentifier(ctx.IDENTIFIER(), ctx.getStart().getLine());
    }

    @Override
    public Node visitIdMath(HTMLParser.IdMathContext ctx) {
        return buildIdentifier(ctx.IDENTIFIER(), ctx.getStart().getLine());
    }

    @Override
    public Node visitIdLogic(HTMLParser.IdLogicContext ctx) {
        List<TerminalNode> ids = ctx.getTokens(HTMLParser.IDENTIFIER);
        return buildIdentifier(ids, ctx.getStart().getLine());
    }

    private Node buildIdentifier(List<TerminalNode> ids, int line) {
        if (ids.size() == 1) return new IdentifierNode(ids.get(0).getText(), line);
        Node base = new IdentifierNode(ids.get(0).getText(), line);
        return new MemberAccessNode(base, ids.get(1).getText(), line);
    }

    private Node buildIdentifier(TerminalNode id, int line) {
        return new IdentifierNode(id.getText(), line);
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
        List<Node> body = new ArrayList<>();
        if (ctx.forStmt().htmlContent() != null) {
            for (int i = 0; i < ctx.forStmt().htmlContent().getChildCount(); i++) {
                Node child = visit(ctx.forStmt().htmlContent().getChild(i));
                if (child != null) body.add(child);
            }
        }
        return new JinjaForBlock(body, ctx.getStart().getLine());
    }

    @Override

    public Node visitIfBlock(HTMLParser.IfBlockContext ctx) {
        List<Node> body = new ArrayList<>();
        List<Node> elseBody = new ArrayList<>();

        if (ctx.ifStmt().htmlContent() != null) {
            for (int i = 0; i < ctx.ifStmt().htmlContent().getChildCount(); i++) {
                Node child = visit(ctx.ifStmt().htmlContent().getChild(i));
                if (child != null) body.add(child);
            }


        }

        if (ctx.ifStmt().elseStm() != null && ctx.ifStmt().elseStm().htmlContent() != null) {
            for (int i = 0; i < ctx.ifStmt().elseStm().htmlContent().getChildCount(); i++) {
                Node child = visit(ctx.ifStmt().elseStm().htmlContent().getChild(i));
                if (child != null) elseBody.add(child);
            }
        }

        return new JinjaIfBlock(body, elseBody, ctx.getStart().getLine());
    }


    @Override
    public Node visitStyleElement(HTMLParser.StyleElementContext ctx) {
        Stylesheet sheet = ctx.stylesheet() != null ? (Stylesheet) visit(ctx.stylesheet()) : null;
        return new StyleElement(sheet, ctx.getStart().getLine());
    }

    @Override
    public Node visitStylesheet(HTMLParser.StylesheetContext ctx) {
        List<CssRule> rules = new ArrayList<>();
        for (var ruleCtx : ctx.ruleSet()) {
            rules.add((CssRule) visit(ruleCtx));
        }
        return new Stylesheet(rules, ctx.getStart().getLine());
    }

    @Override
    public Node visitRuleSet(HTMLParser.RuleSetContext ctx) {
        List<CssDeclaration> decls = new ArrayList<>();
        for (var declCtx : ctx.declaration()) {
            decls.add((CssDeclaration) visit(declCtx));
        }
        return new CssRule(decls, ctx.getStart().getLine());
    }

    @Override
    public Node visitDeclaration(HTMLParser.DeclarationContext ctx) {
        return new CssDeclaration(ctx.getStart().getLine());
    }


    @Override
    public Node visitAddOperation(HTMLParser.AddOperationContext ctx) {
        return new ArithmeticNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitSubOperation(HTMLParser.SubOperationContext ctx) {
        return new ArithmeticNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitMulOperation(HTMLParser.MulOperationContext ctx) {
        return new ArithmeticNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitDivOperation(HTMLParser.DivOperationContext ctx) {
        return new ArithmeticNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitModOperation(HTMLParser.ModOperationContext ctx) {
        return new ArithmeticNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)), ctx.getStart().getLine());
    }

    @Override
    public Node visitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx) {
        return visit(ctx.getChild(1)); // expr inside parentheses
    }


    @Override
    public Node visitOrExpr(HTMLParser.OrExprContext ctx) {
        Node left = visit(ctx.getChild(0));
        Node right = ctx.getChildCount() > 2 ? visit(ctx.getChild(2)) : null;
        return new LogicNode(left, right, ctx.getStart().getLine());
    }

    @Override
    public Node visitAndExpr(HTMLParser.AndExprContext ctx) {
        Node left = visit(ctx.getChild(0));
        Node right = ctx.getChildCount() > 2 ? visit(ctx.getChild(2)) : null;
        return new LogicNode(left, right, ctx.getStart().getLine());
    }

    @Override

    public Node visitNotExpr(HTMLParser.NotExprContext ctx) {
        Node value = visit(ctx.getChild(1));
        return new LogicNode(value, null, ctx.getStart().getLine());

    }

    @Override
    public Node visitCompareExpr(HTMLParser.CompareExprContext ctx) {
        Node left = visit(ctx.getChild(0));
        Node right = visit(ctx.getChild(2));
        return new LogicNode(left, right, ctx.getStart().getLine());
    }




    @Override
    public Node visitNumberMath(HTMLParser.NumberMathContext ctx) {
        return new NumberNode(ctx.getStart().getLine());
    }
}
