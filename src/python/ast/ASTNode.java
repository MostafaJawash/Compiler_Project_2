package python.ast;


public abstract class ASTNode {
    public int lineNumber;
    public String name;

    public ASTNode(int lineNumber, String name) {
        this.lineNumber = lineNumber;
        this.name = name;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getName() {
        return name;
    }

    protected String indent(int level) {
        return "  ".repeat(level);
    }

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(int level) {
        return indent(level) + getClass().getSimpleName();
    }
}