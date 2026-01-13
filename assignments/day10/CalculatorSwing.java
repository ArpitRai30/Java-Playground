package day10;

import java.awt.*;
import javax.swing.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Calculator");
            JTextField display = new JTextField(); display.setEditable(false);
            JPanel p = new JPanel(new GridLayout(4,4));
            String[] keys = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
            for (String k: keys) { JButton b = new JButton(k); b.addActionListener(e -> {
                String cmd = e.getActionCommand();
                if (cmd.equals("=")) { try { display.setText(String.valueOf(eval(display.getText()))); } catch (Exception ex) { display.setText("ERR"); } }
                else display.setText(display.getText()+cmd);
            }); p.add(b); }
            f.setLayout(new BorderLayout()); f.add(display, BorderLayout.NORTH); f.add(p, BorderLayout.CENTER);
            f.pack(); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setVisible(true);
        });
    }
    private static double eval(String expr) throws Exception { javax.script.ScriptEngineManager m = new javax.script.ScriptEngineManager(); Object r = m.getEngineByName("JavaScript").eval(expr); return Double.parseDouble(r.toString()); }
}
