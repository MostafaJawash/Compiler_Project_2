package generation;

/**
 * Shared version counter dev mode uses to signal "a new regeneration happened":
 * AutoRegenerator bumps it after each successful pipeline run, DevServer's
 * /__version endpoint reports it, and the browser-side polling script in the
 * generated HTML reloads the page when the value it sees changes.
 */
public final class GenerationVersion {

    private static long version = System.currentTimeMillis();

    private GenerationVersion() {
    }

    public static synchronized long get() {
        return version;
    }

    /** Advances the version to a value guaranteed to differ from the previous one. */
    public static synchronized long bump() {
        long now = System.currentTimeMillis();
        version = now > version ? now : version + 1;
        return version;
    }
}
