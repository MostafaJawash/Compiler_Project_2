package generation;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

/**
 * Watches the Python source's directory and the templates directory (using
 * java.nio.file.WatchService - no external dependency) and re-runs the same
 * GenerationPipeline the initial generation used whenever a file changes.
 *
 * Rapid-fire ENTRY_MODIFY events from a single editor save are collapsed into
 * one regeneration via a short debounce window, rather than reacting to each
 * event individually.
 */
public class AutoRegenerator implements Runnable {

    private static final long DEBOUNCE_MILLIS = 300;

    private final GenerationPipeline pipeline;
    private final Path pythonSourcePath;
    private final Path templatesDir;
    private final Path styleCssSource;
    private final Path scriptJsSource;

    public AutoRegenerator(GenerationPipeline pipeline, Path pythonSourcePath, Path templatesDir,
                            Path styleCssSource, Path scriptJsSource) {
        this.pipeline = pipeline;
        this.pythonSourcePath = pythonSourcePath;
        this.templatesDir = templatesDir;
        this.styleCssSource = styleCssSource;
        this.scriptJsSource = scriptJsSource;
    }

    @Override
    public void run() {
        Path sourceDir = pythonSourcePath.toAbsolutePath().normalize().getParent();
        Path templatesDirAbs = templatesDir.toAbsolutePath().normalize();

        try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
            Set<Path> registered = new HashSet<>();
            registerDir(watcher, sourceDir, registered);
            registerDir(watcher, templatesDirAbs, registered);

            System.out.println("[AutoRegenerator] Watching " + sourceDir + " and " + templatesDirAbs + " for changes...");

            while (true) {
                WatchKey key = watcher.take();
                String changedFile = drain(key);
                if (!key.reset()) {
                    continue;
                }

                // Debounce: keep collapsing further events into the same cycle until
                // a full DEBOUNCE_MILLIS window passes with nothing new arriving.
                long deadline = System.currentTimeMillis() + DEBOUNCE_MILLIS;
                while (System.currentTimeMillis() < deadline) {
                    WatchKey extraKey = watcher.poll(deadline - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                    if (extraKey == null) {
                        break;
                    }
                    String extraFile = drain(extraKey);
                    if (extraFile != null) {
                        changedFile = extraFile;
                    }
                    extraKey.reset();
                    deadline = System.currentTimeMillis() + DEBOUNCE_MILLIS;
                }

                regenerate(changedFile);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("[AutoRegenerator] Stopped.");
        } catch (IOException e) {
            System.out.println("[AutoRegenerator] Failed to start watch service: " + e.getMessage());
        }
    }

    private void registerDir(WatchService watcher, Path dir, Set<Path> registered) throws IOException {
        if (registered.add(dir)) {
            dir.register(watcher, ENTRY_MODIFY, ENTRY_CREATE);
        }
    }

    /** Consumes all pending events on this key and returns the last non-overflow filename seen. */
    private String drain(WatchKey key) {
        String lastFile = null;
        for (WatchEvent<?> event : key.pollEvents()) {
            if (event.kind() == OVERFLOW) {
                continue;
            }
            Object context = event.context();
            if (context instanceof Path) {
                lastFile = ((Path) context).getFileName().toString();
            }
        }
        return lastFile;
    }

    private void regenerate(String changedFile) {
        String label = changedFile != null ? changedFile : "(unknown file)";
        String timestamp = Instant.now().toString();
        try {
            GenerationPipeline.Result result = pipeline.run(pythonSourcePath, templatesDir, styleCssSource, scriptJsSource);
            if (result.success) {
                GenerationVersion.bump();
                System.out.println("[AutoRegenerator] " + timestamp + " - '" + label + "' changed -> regeneration SUCCESS (version bumped)");
            } else {
                System.out.println("[AutoRegenerator] " + timestamp + " - '" + label + "' changed -> regeneration FAILED (see compiler_output/generation_log.txt)");
            }
        } catch (RuntimeException e) {
            System.out.println("[AutoRegenerator] " + timestamp + " - '" + label + "' changed -> regeneration FAILED: " + e.getMessage());
        }
    }
}
