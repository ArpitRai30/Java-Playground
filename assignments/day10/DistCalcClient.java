package day10;

import java.io.*;
import java.net.*;

public class DistCalcClient {
    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Distributed Calculator Client");
            System.out.println("Type an expression like 12+5*3 and press Enter. Type 'quit' to exit.");
            String line;
            while (true) {
                System.out.print("expr> ");
                line = console.readLine();
                if (line == null) break; // EOF
                line = line.trim();
                if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit")) break;
                if (line.isEmpty()) continue;
                // One connection per expression (server expects one expression per connection)
                try (Socket s = new Socket("localhost", 6060);
                     BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                     PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                    out.println(line);
                    String resp = in.readLine();
                    if (resp == null) System.out.println("No response from server (connection closed).");
                    else System.out.println("Result: " + resp);
                } catch (ConnectException ce) {
                    System.out.println("Could not connect to server: " + ce.getMessage());
                } catch (IOException ioe) {
                    System.out.println("I/O error: " + ioe.getMessage());
                }
            }
            System.out.println("Client exiting.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
