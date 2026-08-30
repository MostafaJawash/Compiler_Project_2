import generation.AutoRegenerator;
import generation.DevServer;
import generation.GenerationPipeline;
import generation.GenerationVersion;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Dev-mode orchestrator: runs an initial generation with live-reload injection
 * enabled, serves output/ locally (auto-opening the browser once), and watches
 * the fixture sources so saving app.py or a .jinja template re-runs the pipeline
 * and refreshes the already-open tab automatically.
 *
 * Reuses the same Tests/FinalDeliverable fixture paths RunGeneration.java points
 * at, since dev mode exists to iterate live on that same fixture; pass a port
 * number as args[0] to override the default 8080 (e.g. if it's already busy).
 */
public class DevMode {

    private static final int DEFAULT_PORT = 8080;

    public static void main(String[] args) throws IOException {
        Path baseDir = Path.of(".");
        Path fixtureDir = baseDir.resolve("Tests/FinalDeliverable");

        Path pythonSource = fixtureDir.resolve("app.py");
        Path templatesDir = fixtureDir.resolve("templates");
        Path styleCss = fixtureDir.resolve("style.css");
        Path scriptJs = fixtureDir.resolve("script.js");

        int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        GenerationPipeline pipeline = new GenerationPipeline(baseDir, true);
        GenerationPipeline.Result result = pipeline.run(pythonSource, templatesDir, styleCss, scriptJs);
        GenerationVersion.bump();

        System.out.println("[DevMode] Initial generation: " + (result.success ? "SUCCESS" : "FAILURE"));
        if (!result.success) {
            System.out.println("[DevMode] Initial generation failed - see compiler_output/generation_log.txt. Starting dev server anyway.");
        }

        DevServer devServer = new DevServer(baseDir.resolve("output"), port);
        devServer.start();

        AutoRegenerator autoRegenerator = new AutoRegenerator(pipeline, pythonSource, templatesDir, styleCss, scriptJs);
        Thread watcherThread = new Thread(autoRegenerator, "auto-regenerator");
        watcherThread.setDaemon(true);
        watcherThread.start();

        System.out.println();
        System.out.println("Dev server running at http://localhost:" + devServer.getPort() + "/index.html");
        System.out.println("Edit " + pythonSource + " or any .jinja template under " + templatesDir + " and save to see changes.");
        System.out.println("Press Ctrl+C to stop.");

        try {
            watcherThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
