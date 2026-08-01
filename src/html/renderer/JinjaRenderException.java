package html.renderer;

/**
 * Thrown when the renderer cannot safely substitute a value: an undefined or
 * out-of-scope variable, a MemberAccessNode target that isn't an object/dict,
 * a missing key/field, a type-incompatible operation, or an AST shape this
 * renderer doesn't support. Failing loudly beats silently emitting "null",
 * an empty string, or the wrong branch of a condition.
 */
public class JinjaRenderException extends RuntimeException {

    public JinjaRenderException(String message, int line) {
        super(message + " [line " + line + "]");
    }
}
