package day10;

import java.io.*;
import java.net.*;
import java.time.*;

public class TimeServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(9090)) {
            System.out.println("TimeServer listening on 9090...");
            while (true) {
                try (Socket s = ss.accept(); PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                    out.println(LocalDateTime.now().toString());
                }
            }
        }
    }
}
