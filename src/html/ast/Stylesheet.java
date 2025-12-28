package html.ast;
import java.util.List;
import java.util.stream.Collectors;

public class Stylesheet implements Node {
    private final List<CssRule> rules;
    public Stylesheet(List<CssRule> rules) { this.rules = rules; }

    @Override
    public String prettyPrint(int indent) {
        return rules.stream()
                .map(r -> r.prettyPrint(indent))
                .collect(Collectors.joining("\n"));
    }
}