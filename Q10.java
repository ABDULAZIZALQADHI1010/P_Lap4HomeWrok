import java.awt.Color;
import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JLabel label = new JLabel("Hello, Abdulaziz!");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } }
