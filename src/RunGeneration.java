import generation.GenerationPipeline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Standalone entry point for Step 3: points GenerationPipeline at the
 * Tests/FinalDeliverable fixtures and runs the full pipeline end-to-end,
 * writing output/ and compiler_output/ under the project root.
 */
public class RunGeneration {

    public static void main(String[] args) throws IOException {
        Path baseDir = Path.of(".");
        Path fixtureDir = baseDir.resolve("Tests/FinalDeliverable");

        Path pythonSource = fixtureDir.resolve("app.py");
        Path templatesDir = fixtureDir.resolve("templates");
        Path styleCss = fixtureDir.resolve("style.css");
        Path scriptJs = fixtureDir.resolve("script.js");

        GenerationPipeline pipeline = new GenerationPipeline(baseDir);
        GenerationPipeline.Result result = pipeline.run(pythonSource, templatesDir, styleCss, scriptJs);

        System.out.println("result.success = " + result.success);
        System.out.println();
        System.out.println("===== result.logText =====");
        System.out.println(result.logText);

        System.out.println("===== output/ =====");
        listDirectory(baseDir.resolve("output"));
        System.out.println();
        System.out.println("===== compiler_output/ =====");
        listDirectory(baseDir.resolve("compiler_output"));
    }

    private static void listDirectory(Path dir) throws IOException {
        if (!Files.exists(dir)) {
            System.out.println("(does not exist: " + dir + ")");
            return;
        }
        try (Stream<Path> walk = Files.walk(dir)) {
            walk.sorted(Comparator.naturalOrder())
                    .filter(p -> !p.equals(dir))
                    .forEach(p -> System.out.println(dir.relativize(p)));
        }
    }
}
