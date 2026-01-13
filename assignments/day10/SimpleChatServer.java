package day10;

import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5050);
        System.out.println("Chat server on 5050");
        List<PrintWriter> outs = Collections.synchronizedList(new ArrayList<>());
        while (true) {
            Socket s = ss.accept();
            new Thread(() -> {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                    outs.add(out);
                    String line;
                    while ((line = in.readLine()) != null) {
                        for (PrintWriter pw: outs) pw.println(line);
                    }
                } catch (IOException e) { e.printStackTrace(); }
            }).start();
        }
    }
}
