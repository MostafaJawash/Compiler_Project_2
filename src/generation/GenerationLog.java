package generation;

import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/** Accumulates a human-readable log of one generation pipeline run. */
public class GenerationLog {

    private final List<String> lines = new ArrayList<>();
    private final Instant startedAt = Instant.now();

    public GenerationLog() {
        lines.add("Generation run started at " + startedAt);
    }

    public void renderTemplateCall(String templateName, Iterable<String> variableNames) {
        StringBuilder names = new StringBuilder();
        for (String name : variableNames) {
            if (names.length() > 0) names.append(", ");
            names.append(name);
        }
        lines.add("render_template(...) -> template='" + templateName + "', variables=[" + names + "]");
    }

    public void htmlFileWritten(Path path, boolean success, String errorMessage) {
        lines.add((success ? "WROTE  " : "FAILED ") + path + (errorMessage != null ? " (" + errorMessage + ")" : ""));
    }

    public void supportFileCopied(Path source, Path dest, boolean success, String note) {
        lines.add((success ? "COPIED " : "SKIPPED ") + source + " -> " + dest + (note != null ? " (" + note + ")" : ""));
    }

    public void warning(String message) {
        lines.add("WARNING: " + message);
    }

    public void note(String message) {
        lines.add(message);
    }

    /** Renders the final log text, including total duration and a SUCCESS/FAILURE summary line. */
    public String build(boolean success) {
        Duration elapsed = Duration.between(startedAt, Instant.now());
        StringBuilder sb = new StringBuilder();
        for (String line : lines) sb.append(line).append('\n');
        sb.append("Total run duration: ").append(elapsed.toMillis()).append(" ms\n");
        sb.append(success ? "SUCCESS" : "FAILURE").append('\n');
        return sb.toString();
    }
}
