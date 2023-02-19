// this is test project, many of inefficient code

package RURemember;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class App {
    JFrame f;
    JPanel panelOverlay;
    JPanel panelGrid;
    JPanel panelFlow;
    Icon fruitsAll = new ImageIcon("fruitsAll.jpg");
    JButton btn11 = new JButton(fruitsAll), btn12 = new JButton(fruitsAll), btn13 = new JButton(fruitsAll), btn14 = new JButton(fruitsAll);
    JButton btn21 = new JButton(fruitsAll), btn22 = new JButton(fruitsAll), btn23 = new JButton(fruitsAll), btn24 = new JButton(fruitsAll);
    JButton btn31 = new JButton(fruitsAll), btn32 = new JButton(fruitsAll), btn33 = new JButton(fruitsAll), btn34 = new JButton(fruitsAll);
    JButton btn41 = new JButton(fruitsAll), btn42 = new JButton(fruitsAll), btn43 = new JButton(fruitsAll), btn44 = new JButton(fruitsAll);
    JLabel lbYourScore;
    JLabel lbScore;
    JButton btnReset;
    int score;

    public App() {
        f = new JFrame("Remember the card");
        f.setSize(600, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
        btnReset.addActionListener(ev -> resetBtn());
        f.setResizable(false);
        f.setVisible(true);
    }

    private void initialize() {
        panelGrid = new JPanel();
        panelFlow = new JPanel();

        lbYourScore = new JLabel("Your Score  :");
        lbYourScore.setSize(150, 100);

        lbScore = new JLabel("0");
        lbScore.setSize(150, 100);

        btnReset = new JButton("Reset Game");
        btnReset.setSize(150, 50);

        panelGrid.setLayout(new GridLayout(5, 5));
        panelGrid.setSize(550, 550);
        panelGrid.setBorder(new EmptyBorder(10, 10, 0, 10));

        panelFlow.setLayout(new FlowLayout());
        panelFlow.setSize(550, 100);
        panelFlow.setBorder(new EmptyBorder(10, 10, 10, 10));

        addPanelGrid();
        addPanelFlow();

        f.add(panelGrid);
        f.add(panelFlow, BorderLayout.SOUTH);
    }

    private void addPanelGrid() {
        for(int i=0; i<16; i++){
            JButton btn = evalButton(i);
            btn.setSize(20, 20);
            btn.setIcon(fruitsAll);
            btnAddActionListener(btn);
            panelGrid.add(btn);
        }
    }

    private void addPanelFlow() {
        panelFlow.add(lbYourScore);
        panelFlow.add(lbScore);
        panelFlow.add(btnReset);
    }

    private void btnAddActionListener(JButton btn) {
        btn.addActionListener(ev -> btn.setText("Opened!!"));
    }

    private void resetBtn() {
        score = 0;
        for(int i=0; i<16; i++) {
            JButton btn = evalButton(i);
            btn.setIcon(fruitsAll);
        }
    }

    private JButton evalButton(int n) {
        switch(n) {
            case 0 : return (btn11);
            case 1 : return (btn12);
            case 2 : return (btn13);
            case 3 : return (btn14);
            case 4 : return (btn21);
            case 5 : return (btn22);
            case 6 : return (btn23);
            case 7 : return (btn24);
            case 8 : return (btn31);
            case 9 : return (btn32);
            case 10 : return (btn33);
            case 11 : return (btn34);
            case 12 : return (btn41);
            case 13 : return (btn42);
            case 14 : return (btn43);
            case 15 : return (btn44);
            default : return new JButton();
        }
    }
}