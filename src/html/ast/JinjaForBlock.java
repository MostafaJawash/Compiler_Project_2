package html.ast;
import java.util.List;
public class JinjaForBlock implements Node {
    public JinjaForBlock(String var, String iterable, List<Node> body) {}
    @Override public String prettyPrint(int indent) { return ""; }
}