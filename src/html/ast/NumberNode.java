package html.ast;

public class NumberNode implements Node {
    private final String value;

    public NumberNode(String value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(int indent) {
        return " ".repeat(indent) + "Number: " + value;
    }
}