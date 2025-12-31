package html.ast;

import java.util.List;

public class Stylesheet extends BaseAstNode {
    private final List<CssRule> rules;

    public Stylesheet(List<CssRule> rules, int line) {
        super(line);
        this.rules = rules;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("Stylesheet", indent));
        for (var rule : rules) sb.append(rule.prettyPrint(indent + 2));
        sb.append(footer(indent));
        return sb.toString();
    }
}
