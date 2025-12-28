package html.ast;
import java.util.List;
public class JinjaIfBlock implements Node {
    public JinjaIfBlock(String cond, List<Node> body, List<Node> elseBody) {}
    @Override public String prettyPrint(int indent) { return ""; }
}