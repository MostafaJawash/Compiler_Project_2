package python.ast.Access;

import python.ast.ASTNode;

public abstract class AccessPart extends ASTNode {
    public AccessPart(int lineNumber, String name) {
        super(lineNumber, name);
    }
}