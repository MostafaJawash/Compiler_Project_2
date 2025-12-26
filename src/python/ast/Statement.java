package python.ast;


public abstract class Statement extends ASTNode {

    public Statement(int lineNumber, String name) {
        super(lineNumber, name);
    }
}
