package day10;

import java.io.*;
import java.net.*;

public class UppercaseServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(7070)) {
            System.out.println("UppercaseServer on 7070");
            while (true) {
                Socket s = ss.accept();
                new Thread(() -> {
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                        String line;
                        while ((line = in.readLine()) != null) {
                            out.println(line.toUpperCase());
                        }
                    } catch (IOException e) { e.printStackTrace(); }
                }).start();
            }
        }
    }
}
