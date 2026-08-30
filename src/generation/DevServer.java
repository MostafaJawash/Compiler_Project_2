package generation;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.awt.Desktop;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Minimal static file server for output/, built on the JDK's own
 * com.sun.net.httpserver.HttpServer (no external dependency). Also exposes
 * /__version, which the live-reload script injected into every generated
 * page polls to detect that AutoRegenerator produced a new build.
 */
public class DevServer {

    private final Path outputDir;
    private final int preferredPort;
    private int boundPort;
    private boolean browserOpened = false;

    public DevServer(Path outputDir, int preferredPort) {
        this.outputDir = outputDir.toAbsolutePath().normalize();
        this.preferredPort = preferredPort;
    }

    /** Binds (falling back to the next port if preferredPort is busy), starts serving,
     *  and - on this first call only - opens the default browser to index.html. */
    public void start() throws IOException {
        HttpServer server = bind();
        server.createContext("/__version", this::handleVersion);
        server.createContext("/", this::handleStatic);
        server.setExecutor(null);
        server.start();

        System.out.println("[DevServer] Serving " + outputDir + " at http://localhost:" + boundPort + "/");
        openBrowserOnce();
    }

    public int getPort() {
        return boundPort;
    }

    private HttpServer bind() throws IOException {
        int port = preferredPort;
        IOException lastFailure = null;
        for (int attempt = 0; attempt < 20; attempt++) {
            try {
                HttpServer server = HttpServer.create(new InetSocketAddress("localhost", port), 0);
                boundPort = port;
                return server;
            } catch (IOException e) {
                lastFailure = e;
                port++;
            }
        }
        throw new IOException("Could not bind DevServer to any port starting at " + preferredPort, lastFailure);
    }

    private void openBrowserOnce() {
        if (browserOpened) {
            return;
        }
        browserOpened = true;
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(URI.create("http://localhost:" + boundPort + "/index.html"));
            } else {
                System.out.println("[DevServer] Desktop browse not supported on this platform - "
                        + "open http://localhost:" + boundPort + "/index.html manually.");
            }
        } catch (IOException e) {
            System.out.println("[DevServer] Could not auto-open browser: " + e.getMessage());
        }
    }

    private void handleVersion(HttpExchange exchange) throws IOException {
        byte[] body = Long.toString(GenerationVersion.get()).getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        exchange.getResponseHeaders().set("Cache-Control", "no-store");
        exchange.sendResponseHeaders(200, body.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(body);
        }
    }

    private void handleStatic(HttpExchange exchange) throws IOException {
        String requestPath = exchange.getRequestURI().getPath();
        if (requestPath.equals("/")) {
            requestPath = "/index.html";
        }

        Path filePath = outputDir.resolve(requestPath.substring(1)).normalize();
        if (!filePath.startsWith(outputDir) || !Files.isRegularFile(filePath)) {
            sendBytes(exchange, 404, "text/plain; charset=utf-8", "404 Not Found".getBytes(StandardCharsets.UTF_8));
            return;
        }

        sendBytes(exchange, 200, contentTypeFor(filePath), Files.readAllBytes(filePath));
    }

    private void sendBytes(HttpExchange exchange, int status, String contentType, byte[] body) throws IOException {
        exchange.getResponseHeaders().set("Content-Type", contentType);
        exchange.sendResponseHeaders(status, body.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(body);
        }
    }

    private static String contentTypeFor(Path path) {
        String name = path.getFileName().toString().toLowerCase();
        if (name.endsWith(".html")) return "text/html; charset=utf-8";
        if (name.endsWith(".css")) return "text/css; charset=utf-8";
        if (name.endsWith(".js")) return "application/javascript; charset=utf-8";
        if (name.endsWith(".json")) return "application/json; charset=utf-8";
        if (name.endsWith(".py") || name.endsWith(".txt")) return "text/plain; charset=utf-8";
        if (name.endsWith(".svg")) return "image/svg+xml";
        if (name.endsWith(".png")) return "image/png";
        if (name.endsWith(".jpg") || name.endsWith(".jpeg")) return "image/jpeg";
        return "application/octet-stream";
    }
}
