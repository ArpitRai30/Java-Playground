package day10;

import java.io.*;
import java.net.*;

public class SimpleChatClient {
    public static void main(String[] args) throws Exception {
        try (Socket s = new Socket("localhost", 5050); 
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        PrintWriter out = new PrintWriter(s.getOutputStream(), true); 
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in))) {
            new Thread(() -> { try { String l; while ((l = in.readLine()) != null) System.out.println("MSG: " + l);
        } catch (Exception ex) {} }).start();
            String line; while ((line = stdin.readLine()) != null) out.println(line);
        }
    }
}
