package html.visitor;

import html.ast.*;

import python.ast.Program;
import python.ast.Statement;
import python.ast.CompoundStmt.DecoratorNode;
import python.ast.CompoundStmt.ElseIfNode;
import python.ast.CompoundStmt.ForStmtNode;
import python.ast.CompoundStmt.FunDefNode;
import python.ast.CompoundStmt.IfStmtNode;
import python.ast.CompoundStmt.WhileStmtNode;
import python.ast.Expression.CallStmt;
import python.ast.Expression.Expr;
import python.ast.SimpleStmt.AssignmentNode;
import python.ast.SimpleStmt.CallNode;
import python.ast.SimpleStmt.Pair;
import python.ast.SimpleStmt.ReturnNode;

import java.util.*;

/**
 * Semantic checker for HTML/Jinja templates that are connected with Flask.
 *
 * Main required category here:
 * 5) Missing Flask variable:
 *    If Jinja uses {{ product.name }} but Flask did not pass product through
 *    render_template(..., product=product), the checker reports an error.
 *
 * Also detects (FIX 4) Jinja {% for %} scope leakage: a loop variable referenced
 * outside the for-block that declared it.
 *
 * Both checks walk the real ASTs (the Python AST built by visitorAst, and the
 * Jinja/HTML AST built by AstBuilder) instead of regex-matching raw source text.
 */
public class HtmlJinjaCssSemanticChecker {

    private final List<String> missingFlaskVariableErrors = new ArrayList<>();
    private final List<String> scopeErrors = new ArrayList<>();
    private final Set<String> reportedMissing = new HashSet<>();
    private final Set<String> reportedScope = new HashSet<>();
    private final Set<String> flaskTemplateVariables = new HashSet<>();
    private final Set<String> knownNames = new HashSet<>(Arrays.asList(
            "url_for", "range", "loop", "cycler", "joiner", "namespace",
            "true", "false", "none", "True", "False", "None",
            "and", "or", "not", "in", "if", "else", "elif", "for",
            "endfor", "endif", "static"
    ));

    public HtmlJinjaCssSemanticChecker(Program pythonAst) {
        collectFlaskTemplateVariables(pythonAst);
    }

    public void checkTemplate(String templateName, Node templateAst) {
        if (templateAst == null) return;

        Set<String> allLoopVariables = new HashSet<>();
        collectAllLoopVariables(templateAst, allLoopVariables);

        Deque<Set<String>> scopeStack = new ArrayDeque<>();
        scopeStack.push(new HashSet<>());
        walk(templateName, templateAst, scopeStack, allLoopVariables);
    }

    // ================= Python AST walk: render_template(...) keyword arguments =================

    private void collectFlaskTemplateVariables(Program program) {
        if (program == null) return;
        for (Statement stmt : program.getChildren()) {
            collectFromStatement(stmt);
        }
    }

    private void collectFromStatement(Statement stmt) {
        if (stmt == null) return;

        if (stmt instanceof CallNode callNode) {
            collectFromCallStmt(callNode.callNode);
        } else if (stmt instanceof ReturnNode returnNode) {
            if (returnNode.values != null) {
                for (Expr expr : returnNode.values) collectFromExpr(expr);
            }
        } else if (stmt instanceof AssignmentNode assignment) {
            collectFromExpr(assignment.value);
        } else if (stmt instanceof FunDefNode funDef) {
            collectFromBlock(funDef.body);
        } else if (stmt instanceof DecoratorNode decorator) {
            if (decorator.fun != null) collectFromStatement(decorator.fun);
        } else if (stmt instanceof IfStmtNode ifStmt) {
            collectFromBlock(ifStmt.body);
            if (ifStmt.else_if_stmt != null) {
                for (ElseIfNode elif : ifStmt.else_if_stmt) collectFromBlock(elif.body);
            }
            if (ifStmt.else_stmt != null) collectFromBlock(ifStmt.else_stmt.body);
        } else if (stmt instanceof ForStmtNode forStmt) {
            collectFromBlock(forStmt.body);
        } else if (stmt instanceof WhileStmtNode whileStmt) {
            collectFromBlock(whileStmt.body);
        }
    }

    private void collectFromBlock(List<Statement> body) {
        if (body == null) return;
        for (Statement s : body) collectFromStatement(s);
    }

    private void collectFromExpr(Expr expr) {
        if (expr instanceof CallStmt call) collectFromCallStmt(call);
    }

    private void collectFromCallStmt(CallStmt call) {
        if (call == null || call.nameCall == null) return;

        boolean isPlainRenderTemplateCall = "render_template".equals(call.nameCall.root)
                && (call.nameCall.parts == null || call.nameCall.parts.isEmpty());

        if (isPlainRenderTemplateCall && call.arguments != null) {
            for (Pair<Expr, Expr> arg : call.arguments) {
                if (arg == null || arg.second == null) continue; // only name=value keyword args carry a variable name
                if (arg.first instanceof python.ast.Expression.IdentifierNode kwarg) {
                    flaskTemplateVariables.add(kwarg.root);
                }
            }
        }

        // Keep walking in case render_template(...) is nested inside another call's arguments.
        if (call.arguments != null) {
            for (Pair<Expr, Expr> arg : call.arguments) {
                if (arg == null) continue;
                collectFromExpr(arg.first);
                collectFromExpr(arg.second);
            }
        }
    }

    // ================= Jinja/HTML AST walk: variable references inside the template =================

    private void collectAllLoopVariables(Node node, Set<String> out) {
        if (node == null) return;
        if (node instanceof html.ast.Program program) {
            for (Node child : program.getBody()) collectAllLoopVariables(child, out);
        } else if (node instanceof HtmlElement element) {
            for (Node child : element.getChildren()) collectAllLoopVariables(child, out);
        } else if (node instanceof JinjaForBlock forBlock) {
            out.addAll(forBlock.getVariables());
            for (Node child : forBlock.getBody()) collectAllLoopVariables(child, out);
        } else if (node instanceof JinjaIfBlock ifBlock) {
            for (Node child : ifBlock.getBody()) collectAllLoopVariables(child, out);
            if (ifBlock.getElseBody() != null) {
                for (Node child : ifBlock.getElseBody()) collectAllLoopVariables(child, out);
            }
        }
    }

    private void walk(String templateName, Node node, Deque<Set<String>> scopeStack, Set<String> allLoopVariables) {
        if (node == null) return;

        if (node instanceof html.ast.Program program) {
            for (Node child : program.getBody()) walk(templateName, child, scopeStack, allLoopVariables);
        } else if (node instanceof HtmlElement element) {
            for (HtmlAttribute attr : element.getAttributes()) walk(templateName, attr.getValue(), scopeStack, allLoopVariables);
            for (Node child : element.getChildren()) walk(templateName, child, scopeStack, allLoopVariables);
        } else if (node instanceof JinjaForBlock forBlock) {
            walk(templateName, forBlock.getIterable(), scopeStack, allLoopVariables);
            scopeStack.push(new HashSet<>(forBlock.getVariables()));
            for (Node child : forBlock.getBody()) walk(templateName, child, scopeStack, allLoopVariables);
            scopeStack.pop();
        } else if (node instanceof JinjaIfBlock ifBlock) {
            walk(templateName, ifBlock.getCondition(), scopeStack, allLoopVariables);
            for (Node child : ifBlock.getBody()) walk(templateName, child, scopeStack, allLoopVariables);
            if (ifBlock.getElseBody() != null) {
                for (Node child : ifBlock.getElseBody()) walk(templateName, child, scopeStack, allLoopVariables);
            }
        } else if (node instanceof MemberAccessNode member) {
            // product.name => only the root ("product") is a variable reference; "name" is a field.
            walk(templateName, member.getTarget(), scopeStack, allLoopVariables);
        } else if (node instanceof IdentifierNode identifier) {
            checkIdentifierUsage(templateName, identifier.getName(), identifier.getLine(), scopeStack, allLoopVariables);
        } else if (node instanceof FunctionNode function) {
            checkIdentifierUsage(templateName, function.getFunctionName(), function.getLine(), scopeStack, allLoopVariables);
            for (Node arg : function.getArguments()) walk(templateName, arg, scopeStack, allLoopVariables);
        } else if (node instanceof ArgumentNode argument) {
            // argName (e.g. filename= / id=) is a keyword name, not a variable reference.
            walk(templateName, argument.getValue(), scopeStack, allLoopVariables);
        } else if (node instanceof ArithmeticNode arithmetic) {
            walk(templateName, arithmetic.getLeft(), scopeStack, allLoopVariables);
            walk(templateName, arithmetic.getRight(), scopeStack, allLoopVariables);
        } else if (node instanceof LogicNode logic) {
            walk(templateName, logic.getLeft(), scopeStack, allLoopVariables);
            walk(templateName, logic.getRight(), scopeStack, allLoopVariables);
        } else if (node instanceof ConcatNode concat) {
            for (Node part : concat.getParts()) walk(templateName, part, scopeStack, allLoopVariables);
        }
        // TextNode, NumberNode, StyleElement/Stylesheet/... : leaves w.r.t. Jinja variable references.
    }

    private void checkIdentifierUsage(String templateName, String name, int line,
                                       Deque<Set<String>> scopeStack, Set<String> allLoopVariables) {
        if (name == null || name.isEmpty()) return;
        if (knownNames.contains(name)) return;
        if (isVisibleInScope(name, scopeStack)) return;
        if (flaskTemplateVariables.contains(name)) return;

        if (allLoopVariables.contains(name)) {
            addScopeError(templateName, line, name);
            return;
        }
        addMissingFlaskVariableError(templateName, line, name);
    }

    private boolean isVisibleInScope(String name, Deque<Set<String>> scopeStack) {
        for (Set<String> scope : scopeStack) {
            if (scope.contains(name)) return true;
        }
        return false;
    }

    private void addMissingFlaskVariableError(String templateName, int line, String variable) {
        String key = templateName + ":" + line + ":" + variable;
        if (reportedMissing.add(key)) {
            missingFlaskVariableErrors.add(
                    "Semantic Error (" + templateName + ", line " + line + "): template variable '" + variable + "' is not passed from render_template"
            );
        }
    }

    private void addScopeError(String templateName, int line, String variable) {
        String key = templateName + ":" + line + ":" + variable;
        if (reportedScope.add(key)) {
            scopeErrors.add(
                    "Semantic Error (line " + line + "): variable '" + variable + "' is out of scope"
            );
        }
    }

    public Set<String> getFlaskTemplateVariables() {
        return Collections.unmodifiableSet(flaskTemplateVariables);
    }

    public List<String> getMissingFlaskVariableErrors() {
        return missingFlaskVariableErrors;
    }

    public List<String> getScopeErrors() {
        return scopeErrors;
    }
}
