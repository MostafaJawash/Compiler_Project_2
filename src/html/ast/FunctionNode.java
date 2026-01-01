package html.ast;

import java.util.List;

public class FunctionNode extends BaseAstNode {
    private final String functionName;
    private final List<Node> arguments;

    public FunctionNode(String functionName, List<Node> arguments, int line) {
        super(line);
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();

        sb.append(pad).append("FunctionCall [line=").append(line).append("]: ").append(functionName).append("\n");

        if (!arguments.isEmpty()) {
            sb.append(pad).append("  Parameters:\n");
            for (Node arg : arguments) {
                if (arg != null)
                    sb.append(arg.prettyPrint(indent + 4));
                else
                    sb.append(pad).append("    <null argument>\n");
            }
        }
        return sb.toString();
    }
}