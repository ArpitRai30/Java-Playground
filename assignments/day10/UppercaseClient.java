package day10;

import java.io.*;
import java.net.*;

public class UppercaseClient {
    public static void main(String[] args) throws Exception {
        try (Socket s = new Socket("localhost", 7070);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
             PrintWriter out = new PrintWriter(s.getOutputStream(), true);
             BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to uppercase server. Type messages and press Enter (type 'exit' to quit).");
            String line;
            while ((line = stdin.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) break;
                out.println(line);
                String resp = in.readLine();
                System.out.println("Response: " + resp);
            }
        }
    }
}
