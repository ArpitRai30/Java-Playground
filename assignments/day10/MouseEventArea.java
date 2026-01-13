package day10;

import java.awt.event.*;
import javax.swing.*;

public class MouseEventArea {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Events");
        JTextArea ta = new JTextArea(15,40);
        ta.setEditable(false);
        ta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { ta.append("Clicked: " + e.getPoint() + " button=" + e.getButton() + "\n"); }
            public void mousePressed(MouseEvent e) { ta.append("Pressed: " + e.getPoint() + "\n"); }
            public void mouseReleased(MouseEvent e) { ta.append("Released: " + e.getPoint() + "\n"); }
        });
        ta.addMouseMotionListener(new MouseMotionAdapter() { public void mouseMoved(MouseEvent e) { ta.append("Moved: " + e.getPoint() + "\n"); } });
        f.add(new JScrollPane(ta)); f.pack(); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setVisible(true);
    }
}
