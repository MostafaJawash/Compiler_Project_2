package python.interpreter;

import python.ast.ASTNode;

/**
 * Thrown when the interpreter hits something it cannot evaluate safely: an
 * undefined variable/function, a type-incompatible operation, a bad container
 * access, or an AST shape it doesn't support. Semantic Analysis is assumed to
 * have already passed, so this should be rare - when it fires, it carries the
 * offending node's line number and node type so the failure is traceable back
 * to source instead of silently producing a wrong value.
 */
public class PythonInterpreterException extends RuntimeException {

    public PythonInterpreterException(String message, ASTNode node) {
        super(format(message, node));
    }

    private static String format(String message, ASTNode node) {
        if (node == null) return message;
        return message + " [line " + node.getLineNumber() + ", node=" + node.getClass().getSimpleName() + "]";
    }
}
