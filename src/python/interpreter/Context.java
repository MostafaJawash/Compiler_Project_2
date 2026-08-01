package python.interpreter;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Context Data hand-off artifact: one instance per render_template(...) call
 * the interpreter actually executes. Holds the template filename plus every
 * keyword argument name -> its fully evaluated real value (List/Map/String/
 * Integer/... - never AST nodes). This is what a future Jinja renderer would
 * consume; nothing here depends on SymbolTable/HtmlSymbolTable.
 */
public class Context {

    private final String templateName;
    private final Map<String, Object> variables;

    public Context(String templateName, Map<String, Object> variables) {
        this.templateName = templateName;
        this.variables = new LinkedHashMap<>(variables);
    }

    public String getTemplateName() {
        return templateName;
    }

    public Map<String, Object> getVariables() {
        return Collections.unmodifiableMap(variables);
    }

    @Override
    public String toString() {
        return "Context{template='" + templateName + "', variables=" + variables + "}";
    }
}
