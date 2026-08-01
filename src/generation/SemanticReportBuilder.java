package generation;

import html.visitor.HtmlJinjaCssSemanticChecker;
import python.visitor.PythonAdvancedSemanticChecker;

import java.util.List;

/**
 * Builds the unified semantic-errors report as a single String, so both
 * Main.java's console output and GenerationPipeline's semantic_report.txt
 * are produced by the exact same logic - no duplicated report-formatting
 * code between the console path and the file path.
 */
public final class SemanticReportBuilder {

    private SemanticReportBuilder() {}

    public static String build(PythonAdvancedSemanticChecker pythonChecker, HtmlJinjaCssSemanticChecker htmlChecker) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------------------------------------------------\n");
        sb.append("              UNIFIED SEMANTIC ERRORS REPORT                \n");
        sb.append("------------------------------------------------------------\n");

        int total = 0;
        total += appendCategory(sb, "Category 1", "Undefined Variable Errors", pythonChecker.getUndefinedVariableErrors());
        total += appendCategory(sb, "Category 2", "Type Errors", pythonChecker.getTypeErrors());
        total += appendCategory(sb, "Category 3", "Scope Errors", pythonChecker.getScopeErrors());
        total += appendCategory(sb, "Category 4", "Type Mismatch Errors", pythonChecker.getTypeMismatchErrors());
        total += appendCategory(sb, "Category 5", "Missing Flask Variable Errors", htmlChecker.getMissingFlaskVariableErrors());
        total += appendCategory(sb, "Category 6", "HTML/Jinja Scope Errors", htmlChecker.getScopeErrors());

        sb.append("\n[Analysis Summary]: ").append(total == 0 ? "✔ PASSED" : "❌ FAILED (" + total + " Errors)").append("\n");
        sb.append("------------------------------------------------------------\n");
        return sb.toString();
    }

    private static int appendCategory(StringBuilder sb, String title, String subtitle, List<String> errors) {
        sb.append("▶ [").append(title).append("] ").append(subtitle).append(":\n");
        if (errors == null || errors.isEmpty()) {
            sb.append("............................................................\n");
            return 0;
        }
        for (String err : errors) {
            sb.append("   ❌ ").append(err).append("\n");
        }
        sb.append("............................................................\n");
        return errors.size();
    }
}
