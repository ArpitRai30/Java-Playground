package day10;

import javax.swing.*;
import javax.swing.table.*;

public class DBTableDemo {
    // Minimal JTable demo with in-memory data (no actual DB needed for demo)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("DB Table Demo");
            String[] cols = {"ID","Name"};
            Object[][] data = {{1,"Alice"},{2,"Bob"}};
            DefaultTableModel model = new DefaultTableModel(data, cols);
            JTable table = new JTable(model);
            f.add(new JScrollPane(table));
            f.setSize(400,300); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setVisible(true);
        });
    }
}
