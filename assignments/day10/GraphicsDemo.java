package day10;

import java.awt.*;
import javax.swing.*;

public class GraphicsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Graphics2D Demo");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(new DemoPanel()); f.setSize(400,300); f.setVisible(true);
        });
    }
    static class DemoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            g2.setColor(Color.BLUE); g2.drawRect(20,20,100,60);
            g2.setColor(Color.RED); g2.fillOval(150,50,80,80);
        }
    }
}
