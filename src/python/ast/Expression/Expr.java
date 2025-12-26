package python.ast.Expression;

import python.ast.ASTNode;

public abstract class Expr extends ASTNode {

    public Expr(int lineNumber, String name) {
        super(lineNumber, name);
    }
}