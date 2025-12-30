package html.ast;

public interface Node {
    int getLine();
    String prettyPrint(int indent);
}
