package html.ast;

public class IdentifierNode extends BaseAstNode {
    private final String name;

    public IdentifierNode(String name, int line) {
        super(line);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String prettyPrint(int indent) {
        return indent(indent) + "IdentifierNode: " + name + " [line=" + line + "]\n";
    }
}

