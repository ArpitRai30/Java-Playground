package day10;
import java.io.*;
import java.net.*;

public class WebSumClient {
    public static void main(String[] args) throws Exception {
        // Usage: java day10.WebSumClient [url]
    String urlStr = (args.length > 0) ? args[0] : "http://localhost:8000/twonums.txt";
        System.out.println("Fetching numbers from: " + urlStr);
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            int code = conn.getResponseCode();
            if (code != HttpURLConnection.HTTP_OK) {
                System.err.println("Server returned HTTP code: " + code);
                return;
            }
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String a = null, b = null;
                String line;
                // read first two non-empty lines
                while ((line = in.readLine()) != null && (a == null || b == null)) {
                    if (line.trim().isEmpty()) continue;
                    if (a == null) a = line.trim(); else if (b == null) b = line.trim();
                }
                if (a == null || b == null) {
                    System.err.println("Server did not provide two numbers (received: a=" + a + ", b=" + b + ")");
                    return;
                }
                double x, y;
                try {
                    x = Double.parseDouble(a);
                    y = Double.parseDouble(b);
                } catch (NumberFormatException nfe) {
                    System.err.println("Received values are not valid numbers: '" + a + "', '" + b + "'");
                    return;
                }
                System.out.println("Sum from server: " + (x + y));
            }
        } catch (MalformedURLException mue) {
            System.err.println("Invalid URL: " + mue.getMessage());
        } catch (IOException ioe) {
            System.err.println("I/O error: " + ioe.getMessage());
        } finally {
            if (conn != null) conn.disconnect();
        }
    }
}
