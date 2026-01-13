package day10;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Simple HTTP server that responds at /twonums.txt with two numbers (one per line).
 */
public class TwoNumHttpServer {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/twonums.txt", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "12.5\n3.4\n"; // two numbers, one per line
                exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=UTF-8");
                exchange.sendResponseHeaders(200, response.getBytes("UTF-8").length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes("UTF-8"));
                }
            }
        });
        server.setExecutor(null);
        server.start();
        System.out.println("TwoNumHttpServer started at http://localhost:" + port + "/twonums.txt");
    }
}
