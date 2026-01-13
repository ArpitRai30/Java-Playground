package day10;

import java.awt.*;
import javax.swing.*;

public class TextAreaCounter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Word & Char Counter");
            JTextArea ta = new JTextArea(10,40);
            JButton btn = new JButton("Count");
            btn.addActionListener(e -> {
                String text = ta.getText();
                int chars = text.length();
                int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
                JOptionPane.showMessageDialog(f, "Words: " + words + "\nChars: " + chars);
            });
            f.setLayout(new BorderLayout()); f.add(new JScrollPane(ta), BorderLayout.CENTER); f.add(btn, BorderLayout.SOUTH);
            f.pack(); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setVisible(true);
        });
    }
}
