package day10;

import java.io.*;
import java.net.*;

public class DistCalcServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(6060)) {
            System.out.println("DistCalcServer on 6060");
            while (true) {
                try (Socket s = ss.accept(); BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                    String expr = in.readLine();
                    if (expr == null) {
                        // client closed connection without sending data
                        continue;
                    }
                    expr = expr.trim();
                    if (expr.isEmpty()) {
                        out.println("ERR: empty expression");
                        continue;
                    }
                    try {
                        double result = evaluate(expr);
                        out.println(result);
                    } catch (Exception ex) {
                        out.println("ERR: " + ex.getMessage());
                    }
                } catch (Exception ex) { ex.printStackTrace(); }
            }
        }
    }

    // Evaluate arithmetic expressions with + - * / and parentheses using shunting-yard
    private static double evaluate(String expr) {
        // Tokenize
        java.util.List<String> tokens = new java.util.ArrayList<>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (Character.isWhitespace(c)) continue;
            if ((c >= '0' && c <= '9') || c == '.') {
                num.append(c);
            } else {
                if (num.length() > 0) { tokens.add(num.toString()); num.setLength(0); }
                tokens.add(String.valueOf(c));
            }
        }
        if (num.length() > 0) tokens.add(num.toString());

        // Shunting-yard to RPN
        java.util.Deque<String> ops = new java.util.ArrayDeque<>();
        java.util.List<String> output = new java.util.ArrayList<>();
        for (String t: tokens) {
            if (t.matches("\\d+(\\\\.\\d+)?")) {
                output.add(t);
            } else if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(t)) {
                    output.add(ops.pop());
                }
                ops.push(t);
            } else if (t.equals("(")) {
                ops.push(t);
            } else if (t.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) output.add(ops.pop());
                if (ops.isEmpty() || !ops.peek().equals("(")) throw new IllegalArgumentException("Mismatched parentheses");
                ops.pop();
            } else {
                throw new IllegalArgumentException("Invalid token: " + t);
            }
        }
        while (!ops.isEmpty()) {
            String o = ops.pop();
            if (o.equals("(") || o.equals(")")) throw new IllegalArgumentException("Mismatched parentheses");
            output.add(o);
        }

        // Evaluate RPN
        java.util.Deque<Double> stack = new java.util.ArrayDeque<>();
        for (String t: output) {
            if (t.matches("\\d+(\\\\.\\d+)?")) stack.push(Double.parseDouble(t));
            else {
                if (stack.size() < 2) throw new IllegalArgumentException("Invalid expression");
                double b = stack.pop(); double a = stack.pop();
                switch (t) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    default: throw new IllegalArgumentException("Unknown operator: " + t);
                }
            }
        }
        if (stack.size() != 1) throw new IllegalArgumentException("Invalid expression");
        return stack.pop();
    }

    private static int precedence(String op) {
        if (op == null) return -1;
        if (op.equals("+") || op.equals("-")) return 1;
        if (op.equals("*") || op.equals("/")) return 2;
        return 0;
    }
}
