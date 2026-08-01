package generation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import html.ast.Node;
import html.generated.HTMLLexer;
import html.generated.HTMLParser;
import html.renderer.JinjaRenderer;
import html.visitor.AstBuilder;
import html.visitor.HtmlJinjaCssSemanticChecker;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import python.ast.Program;
import python.generated.pythonLexer;
import python.generated.pythonParser;
import python.interpreter.Context;
import python.interpreter.PythonInterpreter;
import python.visitor.PythonAdvancedSemanticChecker;
import python.visitor.visitorAst;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Phase 2 / Step 3: the final generation orchestrator. Runs, in order:
 *   Python source -> PythonInterpreter -> Context(s)
 *     -> for each Context, parse+render its Jinja template -> output/*.html
 *   support files (app.py/style.css/script.js) -> copied as-is into output/
 *   Python AST, Jinja ASTs -> compiler_output/ast_python.json, ast_jinja.json
 *   semantic analysis          -> compiler_output/semantic_report.txt
 *   this run's own log         -> compiler_output/generation_log.txt
 *
 * Deliberately does NOT touch SymbolTable/HtmlSymbolTable - the semantic
 * checkers instantiated here exist only to produce semantic_report.txt, not
 * to influence rendering; PythonInterpreter/JinjaRenderer remain untouched
 * and are used exactly as Steps 1-2 built them.
 */
public class GenerationPipeline {

    private final Path outputDir;
    private final Path compilerOutputDir;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public GenerationPipeline(Path baseDir) {
        this.outputDir = baseDir.resolve("output");
        this.compilerOutputDir = baseDir.resolve("compiler_output");
    }

    public static final class Result {
        public final boolean success;
        public final List<Context> contexts;
        public final String logText;

        Result(boolean success, List<Context> contexts, String logText) {
            this.success = success;
            this.contexts = contexts;
            this.logText = logText;
        }
    }

    /**
     * @param pythonSourcePath the app.py-equivalent source: interpreted for Context data
     *                         AND copied as-is into output/ (same file serves both roles)
     * @param templatesDir     directory holding the .jinja source files, named exactly as
     *                         they appear in render_template(...) calls
     * @param styleCssSource   style.css source to copy as-is (required per spec)
     * @param scriptJsSource   script.js source to copy as-is if present (optional per spec;
     *                         pass null or a non-existent path to skip it gracefully)
     */
    public Result run(Path pythonSourcePath, Path templatesDir, Path styleCssSource, Path scriptJsSource) {
        GenerationLog log = new GenerationLog();
        boolean success = true;
        List<Context> contexts = new ArrayList<>();

        try {
            Files.createDirectories(outputDir);
            Files.createDirectories(compilerOutputDir);
            log.note("Ensured output directories exist: " + outputDir + ", " + compilerOutputDir);

            // ---- Python: parse, semantic-check, interpret ----
            String pythonCode = Files.readString(pythonSourcePath, StandardCharsets.UTF_8);
            pythonParser pyParser = new pythonParser(new CommonTokenStream(new pythonLexer(CharStreams.fromString(pythonCode))));
            Program pyAst = (Program) new visitorAst().visit(pyParser.file_input());

            PythonAdvancedSemanticChecker pythonChecker = new PythonAdvancedSemanticChecker();
            pythonChecker.check(pyAst);

            PythonInterpreter interpreter = new PythonInterpreter();
            contexts = interpreter.run(pyAst);
            for (String warning : interpreter.getWarnings()) log.warning(warning);

            // ---- Jinja: parse + semantic-check + render each Context's template ----
            HtmlJinjaCssSemanticChecker htmlChecker = new HtmlJinjaCssSemanticChecker(pyAst);
            JinjaRenderer renderer = new JinjaRenderer();
            Map<String, Node> jinjaAstsByTemplate = new LinkedHashMap<>();

            for (Context context : contexts) {
                log.renderTemplateCall(context.getTemplateName(), context.getVariables().keySet());

                Path templateSource = templatesDir.resolve(context.getTemplateName());
                String jinjaCode = Files.readString(templateSource, StandardCharsets.UTF_8);
                Node jinjaAst = parseTemplateFragment(jinjaCode);
                jinjaAstsByTemplate.put(context.getTemplateName(), jinjaAst);

                htmlChecker.checkTemplate(context.getTemplateName(), jinjaAst);

                String html = renderer.render(jinjaAst, context);
                Path outPath = outputDir.resolve(toHtmlFileName(context.getTemplateName()));
                try {
                    Files.writeString(outPath, html, StandardCharsets.UTF_8);
                    log.htmlFileWritten(outPath, true, null);
                } catch (IOException e) {
                    log.htmlFileWritten(outPath, false, e.getMessage());
                    success = false;
                }
            }

            // ---- Support files: copied as-is, no processing ----
            copySupportFile(pythonSourcePath, outputDir.resolve(pythonSourcePath.getFileName()), log, false);
            copySupportFile(styleCssSource, outputDir.resolve(styleCssSource.getFileName()), log, false);
            if (scriptJsSource != null) {
                copySupportFile(scriptJsSource, outputDir.resolve(scriptJsSource.getFileName()), log, true);
            } else {
                log.note("script.js not provided - skipped (optional per spec)");
            }

            // ---- compiler_output/: semantic report, AST JSON exports ----
            String report = SemanticReportBuilder.build(pythonChecker, htmlChecker);
            Files.writeString(compilerOutputDir.resolve("semantic_report.txt"), report, StandardCharsets.UTF_8);
            log.note("Wrote " + compilerOutputDir.resolve("semantic_report.txt"));

            Map<String, Object> pythonAstJson = PythonAstJsonExporter.export(pyAst);
            Files.writeString(compilerOutputDir.resolve("ast_python.json"), gson.toJson(pythonAstJson), StandardCharsets.UTF_8);
            log.note("Wrote " + compilerOutputDir.resolve("ast_python.json"));

            Map<String, Object> jinjaAstJson = new LinkedHashMap<>();
            for (Map.Entry<String, Node> entry : jinjaAstsByTemplate.entrySet()) {
                jinjaAstJson.put(entry.getKey(), JinjaAstJsonExporter.export(entry.getValue()));
            }
            Files.writeString(compilerOutputDir.resolve("ast_jinja.json"), gson.toJson(jinjaAstJson), StandardCharsets.UTF_8);
            log.note("Wrote " + compilerOutputDir.resolve("ast_jinja.json"));

        } catch (Exception e) {
            success = false;
            log.note("FATAL: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            String logText = log.build(false);
            writeLogBestEffort(logText);
            throw new RuntimeException("Generation pipeline failed: " + e.getMessage(), e);
        }

        String logText = log.build(success);
        writeLogBestEffort(logText);
        return new Result(success, contexts, logText);
    }

    private void writeLogBestEffort(String logText) {
        try {
            Files.writeString(compilerOutputDir.resolve("generation_log.txt"), logText, StandardCharsets.UTF_8);
        } catch (IOException e) {
            // The log itself couldn't be written - surface this loudly rather than hiding it.
            throw new RuntimeException("Could not write generation_log.txt: " + e.getMessage(), e);
        }
    }

    private void copySupportFile(Path source, Path dest, GenerationLog log, boolean optional) {
        if (!Files.exists(source)) {
            if (optional) {
                log.note(source + " not found - skipped (optional)");
                return;
            }
            throw new RuntimeException("Required support file not found: " + source);
        }
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            log.supportFileCopied(source, dest, true, null);
        } catch (IOException e) {
            log.supportFileCopied(source, dest, false, e.getMessage());
            throw new RuntimeException("Failed to copy support file " + source + ": " + e.getMessage(), e);
        }
    }

    /** ".jinja"/".html"/anything -> same base name with a ".html" extension. */
    private static String toHtmlFileName(String templateName) {
        int dot = templateName.lastIndexOf('.');
        String base = dot >= 0 ? templateName.substring(0, dot) : templateName;
        return base + ".html";
    }

    /**
     * Parses a Jinja/HTML template source as a bare fragment (no single wrapping root tag
     * required) using the htmlContent entry rule directly, then wraps the children into a
     * synthetic html.ast.Program - the same "visit each child, skip nulls" pattern
     * AstBuilder.buildElement already uses internally for htmlContent. No changes to
     * AstBuilder.java itself.
     */
    private static Node parseTemplateFragment(String code) {
        HTMLParser parser = new HTMLParser(new CommonTokenStream(new HTMLLexer(CharStreams.fromString(code))));
        AstBuilder builder = new AstBuilder();
        HTMLParser.HtmlContentContext contentCtx = parser.htmlContent();
        List<Node> children = new ArrayList<>();
        for (int i = 0; i < contentCtx.getChildCount(); i++) {
            Node child = builder.visit(contentCtx.getChild(i));
            if (child != null) children.add(child);
        }
        return new html.ast.Program(children, contentCtx.getStart().getLine());
    }
}
