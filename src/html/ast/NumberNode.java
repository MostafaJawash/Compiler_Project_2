package html.ast;

public class NumberNode extends BaseAstNode {

    private final Number value;

    public NumberNode(Number value, int line) {
        super(line);
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        return pad + "NumberNode: " + value + " [line=" + line + "]\n";
    }
}
