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

    protected String indent(int level) {
        return "    ".repeat(level);
    }

    protected String header(String name, int level) {
        return indent(level) + name + " [line " + line + "]\n" + indent(level) + "{\n";
    }

    protected String footer(int level) {
        return indent(level) + "}\n";
    }
}