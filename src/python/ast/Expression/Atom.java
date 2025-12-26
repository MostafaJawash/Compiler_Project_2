package python.ast.Expression;

public class Atom extends Expr {

    public Object object;
    public String type;

    public Atom(int lineNumber, String name, Object object) {
        super(lineNumber, name);
        this.object = object;
        if (object != null)
            type = object.getClass().getSimpleName();
        else
            type = "NULL";
    }

    @Override
    public String toString(int level) {
        return indent(level) + "Atom(value=" + object + ", type=" + type + ")";
    }
}