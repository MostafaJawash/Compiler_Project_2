package html.ast;

public class IdentifierNode implements Node {
    private final String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    @Override
    public String prettyPrint(int indent) {
        return " ".repeat(indent) + "Identifier: " + name;
    }
}