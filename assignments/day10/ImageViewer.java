package day10;

import java.awt.*;
import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Image Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel lbl = new JLabel(); lbl.setHorizontalAlignment(JLabel.CENTER);
            JButton prev = new JButton("Previous"), next = new JButton("Next");
            JPanel bp = new JPanel(); bp.add(prev); bp.add(next);

            // Simple sample images array (replace with actual file paths)
            String[] imgs = {"C:\\Users\\arpit\\Pictures\\Screenshots\\LabelPassword.png", "C:\\Users\\arpit\\Pictures\\Screenshots\\Mouse.png", "C:/Images/img3.jpg"};
            final int[] idx = {0};
            Runnable show = () -> { ImageIcon ic = new ImageIcon(imgs[idx[0]]); lbl.setIcon(ic); };
            prev.addActionListener(e -> { idx[0] = (idx[0]-1+imgs.length)%imgs.length; show.run();});
            next.addActionListener(e -> { idx[0] = (idx[0]+1)%imgs.length; show.run();});

            f.setLayout(new BorderLayout()); f.add(lbl, BorderLayout.CENTER); f.add(bp, BorderLayout.SOUTH); f.setSize(600,400); f.setVisible(true);
        });
    }
}
