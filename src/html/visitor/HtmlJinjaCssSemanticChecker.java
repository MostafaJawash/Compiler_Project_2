package html.visitor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Semantic checker for HTML/Jinja templates that are connected with Flask.
 *
 * Main required category here:
 * 5) Missing Flask variable:
 *    If Jinja uses {{ product.name }} but Flask did not pass product through
 *    render_template(..., product=product), the checker reports an error.
 */
public class HtmlJinjaCssSemanticChecker {

    private final List<String> missingFlaskVariableErrors = new ArrayList<>();
    private final Set<String> reported = new HashSet<>();
    private final Set<String> flaskTemplateVariables = new HashSet<>();
    private final Set<String> knownNames = new HashSet<>(Arrays.asList(
            "url_for", "range", "loop", "cycler", "joiner", "namespace",
            "true", "false", "none", "True", "False", "None",
            "and", "or", "not", "in", "if", "else", "elif", "for",
            "endfor", "endif", "static"
    ));

    public HtmlJinjaCssSemanticChecker(String pythonCode) {
        collectFlaskTemplateVariables(pythonCode == null ? "" : pythonCode);
    }

    public void checkTemplate(String templateName, String htmlCode) {
        if (htmlCode == null) return;

        Set<String> localTemplateVariables = collectLoopVariables(htmlCode);
        Set<String> availableVariables = new HashSet<>();
        availableVariables.addAll(knownNames);
        availableVariables.addAll(flaskTemplateVariables);
        availableVariables.addAll(localTemplateVariables);

        checkJinjaOutputExpressions(templateName, htmlCode, availableVariables);
        checkJinjaBlockExpressions(templateName, htmlCode, availableVariables, localTemplateVariables);
    }

    private void collectFlaskTemplateVariables(String pythonCode) {
        Pattern renderCallPattern = Pattern.compile("render_template\\s*\\((.*?)\\)", Pattern.DOTALL);
        Matcher renderMatcher = renderCallPattern.matcher(pythonCode);

        Pattern keywordPattern = Pattern.compile("\\b([A-Za-z_][A-Za-z0-9_]*)\\s*=");
        while (renderMatcher.find()) {
            String args = renderMatcher.group(1);
            Matcher keywordMatcher = keywordPattern.matcher(args);
            while (keywordMatcher.find()) {
                flaskTemplateVariables.add(keywordMatcher.group(1));
            }
        }
    }

    private Set<String> collectLoopVariables(String htmlCode) {
        Set<String> loopVariables = new HashSet<>();
        Pattern blockPattern = Pattern.compile("\\{%\\s*(.*?)\\s*%\\}", Pattern.DOTALL);
        Matcher blockMatcher = blockPattern.matcher(htmlCode);

        Pattern forPattern = Pattern.compile("^for\\s+(.+?)\\s+in\\s+(.+)$", Pattern.DOTALL);
        while (blockMatcher.find()) {
            String block = blockMatcher.group(1).trim();
            Matcher forMatcher = forPattern.matcher(block);
            if (forMatcher.find()) {
                String declaredVars = forMatcher.group(1);
                for (String part : declaredVars.split(",")) {
                    String name = part.trim();
                    if (name.matches("[A-Za-z_][A-Za-z0-9_]*")) loopVariables.add(name);
                }
            }
        }
        return loopVariables;
    }

    private void checkJinjaOutputExpressions(String templateName, String htmlCode, Set<String> availableVariables) {
        Pattern outputPattern = Pattern.compile("\\{\\{(.*?)\\}\\}", Pattern.DOTALL);
        Matcher matcher = outputPattern.matcher(htmlCode);
        while (matcher.find()) {
            String expression = matcher.group(1);
            int line = lineNumberAt(htmlCode, matcher.start());
            checkExpressionVariables(templateName, expression, line, availableVariables);
        }
    }

    private void checkJinjaBlockExpressions(String templateName, String htmlCode, Set<String> availableVariables, Set<String> localVariables) {
        Pattern blockPattern = Pattern.compile("\\{%\\s*(.*?)\\s*%\\}", Pattern.DOTALL);
        Matcher matcher = blockPattern.matcher(htmlCode);

        Pattern forPattern = Pattern.compile("^for\\s+(.+?)\\s+in\\s+(.+)$", Pattern.DOTALL);
        Pattern ifPattern = Pattern.compile("^(if|elif)\\s+(.+)$", Pattern.DOTALL);

        while (matcher.find()) {
            String block = matcher.group(1).trim();
            int line = lineNumberAt(htmlCode, matcher.start());

            Matcher forMatcher = forPattern.matcher(block);
            if (forMatcher.find()) {
                String iterableExpression = forMatcher.group(2);
                checkExpressionVariables(templateName, iterableExpression, line, availableVariables);
                continue;
            }

            Matcher ifMatcher = ifPattern.matcher(block);
            if (ifMatcher.find()) {
                String condition = ifMatcher.group(2);
                checkExpressionVariables(templateName, condition, line, availableVariables);
            }
        }
    }

    private void checkExpressionVariables(String templateName, String expression, int line, Set<String> availableVariables) {
        for (String identifier : extractRootIdentifiers(expression)) {
            if (!availableVariables.contains(identifier)) {
                addMissingFlaskVariableError(templateName, line, identifier);
            }
        }
    }

    private Set<String> extractRootIdentifiers(String expression) {
        Set<String> roots = new LinkedHashSet<>();
        if (expression == null) return roots;

        String withoutStrings = expression
                .replaceAll("'([^'\\\\]|\\\\.)*'", " ")
                .replaceAll("\"([^\"\\\\]|\\\\.)*\"", " ");

        Pattern identifierPattern = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");
        Matcher matcher = identifierPattern.matcher(withoutStrings);

        while (matcher.find()) {
            String name = matcher.group();
            int start = matcher.start();
            int end = matcher.end();

            char previous = previousNonWhitespace(withoutStrings, start);
            char next = nextNonWhitespace(withoutStrings, end);

            // product.name => report/check product only, not name.
            if (previous == '.') continue;

            // filename=product.image => filename is a keyword argument, not a template variable.
            if (next == '=') continue;

            if (knownNames.contains(name)) continue;
            roots.add(name);
        }
        return roots;
    }

    private char previousNonWhitespace(String text, int from) {
        for (int i = from - 1; i >= 0; i--) {
            if (!Character.isWhitespace(text.charAt(i))) return text.charAt(i);
        }
        return '\0';
    }

    private char nextNonWhitespace(String text, int from) {
        for (int i = from; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i))) return text.charAt(i);
        }
        return '\0';
    }

    private int lineNumberAt(String text, int offset) {
        int line = 1;
        for (int i = 0; i < offset && i < text.length(); i++) {
            if (text.charAt(i) == '\n') line++;
        }
        return line;
    }

    private void addMissingFlaskVariableError(String templateName, int line, String variable) {
        String key = templateName + ":" + line + ":" + variable;
        if (reported.add(key)) {
            missingFlaskVariableErrors.add(
                    "Missing Flask Variable Error [template " + templateName + ", line " + line + "]: Jinja variable '" + variable + "' is used but Flask did not pass it with render_template(..., " + variable + "=...)."
            );
        }
    }

    public Set<String> getFlaskTemplateVariables() {
        return Collections.unmodifiableSet(flaskTemplateVariables);
    }

    public List<String> getMissingFlaskVariableErrors() {
        return missingFlaskVariableErrors;
    }
}
