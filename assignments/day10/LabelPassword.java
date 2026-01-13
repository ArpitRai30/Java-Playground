package day10;

import java.awt.*;
import javax.swing.*;

public class LabelPassword {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Login");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(new GridLayout(3,2,5,5));
            f.setSize(400, 400);

            f.add(new JLabel("Name:"));
            JTextField name = new JTextField();
            f.add(name);

            f.add(new JLabel("Password:"));
            JPasswordField pass = new JPasswordField();
            f.add(pass);

            JButton btn = new JButton("Submit");
            btn.addActionListener(e -> JOptionPane.showMessageDialog(f, "Name="+name.getText()));
            f.add(new JLabel());
            f.add(btn);

            f.pack(); f.setLocationRelativeTo(null); f.setVisible(true);
        });
    }
}
