package day10;

import java.io.*;
import java.net.*;

public class TimeClient {
    public static void main(String[] args) throws Exception {
        try (Socket s = new Socket("localhost", 9090);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
            System.out.println("Server time: " + in.readLine());
        }
    }
}
