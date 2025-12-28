package html.ast;
import java.util.List;
import java.util.stream.Collectors;

public class Program implements Node {
    private final List<Node> body;

    public Program(List<Node> body) {
        this.body = body;
    }

    @Override
    public String prettyPrint(int indent) {
        String children = body.stream()
                .map(node -> node.prettyPrint(indent + 2))
                .collect(Collectors.joining("\n"));
        return "Program:\n" + children;
    }
}