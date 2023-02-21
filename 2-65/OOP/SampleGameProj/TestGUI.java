import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestGUI {
    static JFrame f;
    static JPanel p;
    static JLabel l;

    static ImageIcon f1 = new ImageIcon("f1.jpg");

    public static void main(String[] args) {
        f = new JFrame("Select Matched Fruit Game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(900, 900);

        // initialize();
        l = new JLabel();
        l.setText("Hi");
        l.setIcon(f1);

        p = new JPanel();
        p.setBackground(Color.green);
        p.setBounds(0, 0, 300, 300);

        f.setResizable(false);
        f.setVisible(true);
        p.add(l);
        f.add(p, BorderLayout.CENTER);
    }
}