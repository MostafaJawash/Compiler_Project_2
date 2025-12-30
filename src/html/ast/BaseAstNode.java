package html.ast;

public abstract class BaseAstNode implements Node {

    protected final int line;

    protected BaseAstNode(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    protected String indent(int indent) {
        return "  ".repeat(indent);
    }

    protected String header(String name, int indent) {
        return indent(indent) + name + " [line=" + line + "]\n" + indent(indent) + "{\n";
    }

    protected String footer(int indent) {
        return indent(indent) + "}\n";
    }
}
