package SelectMatchPicture;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App implements ActionListener {
    JFrame f;
    JPanel pHint;
    JLabel lHint1;
    JLabel lHint2;
    JLabel lHint3;
    JLabel lHint4;
    JPanel pSelect;
    JButton bSel1;
    JButton bSel2;
    JButton bSel3;
    JButton bSel4;
    JButton bSel5;
    JButton bSel6;
    JButton bSel7;
    JButton bSel8;
    JButton bSel9;
    JPanel pGame;
    JButton bGame1;
    JButton bGame2;
    JButton bGame3;
    JButton bGame4;
    JPanel pTools;
    JLabel lScore;
    JLabel lTimer;
    JButton bReset;
    JButton bNext;

    boolean g1isEmpty = true;
    boolean g2isEmpty = true;
    boolean g3isEmpty = true;
    boolean g4isEmpty = true;

    boolean isStart = false;

    int score;

    // initialize fruits icon
    ImageIcon close = new ImageIcon("SelectMatchPicture/element/close.png");
    ImageIcon empty = new ImageIcon("SelectMatchPicture/element/empty.jpg");
    ImageIcon f1 = new ImageIcon("SelectMatchPicture/element/f1.jpg");
    ImageIcon f2 = new ImageIcon("SelectMatchPicture/element/f2.jpg");
    ImageIcon f3 = new ImageIcon("SelectMatchPicture/element/f3.jpg");
    ImageIcon f4 = new ImageIcon("SelectMatchPicture/element/f4.jpg");
    ImageIcon f5 = new ImageIcon("SelectMatchPicture/element/f5.jpg");
    ImageIcon f6 = new ImageIcon("SelectMatchPicture/element/f6.jpg");
    ImageIcon f7 = new ImageIcon("SelectMatchPicture/element/f7.jpg");
    ImageIcon f8 = new ImageIcon("SelectMatchPicture/element/f8.jpg");
    ImageIcon f9 = new ImageIcon("SelectMatchPicture/element/f9.jpg");

    public App() {
        f = new JFrame("Select Matched Fruit Game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(800, 700);
        initialize();
        f.setResizable(false);
        f.setVisible(true);
    }

    private void start() {
        lHint1.setIcon(close);
        lHint2.setIcon(close);
        lHint3.setIcon(close);
        lHint4.setIcon(close);

        bGame1.setIcon(empty);
        bGame2.setIcon(empty);
        bGame3.setIcon(empty);
        bGame4.setIcon(empty);

        g1isEmpty = true;
        g2isEmpty = true;
        g3isEmpty = true;
        g4isEmpty = true;
        
        isStart = false;

        score = 0;
        lScore.setText("Your score : " + score);
    }

    private void initialize() {
        initializeHintPanel();
        initializeSelectPanel();
        initializeGamePanel();
        initializeTimerPanel();
    }

    private void initializeTimerPanel() {
        lScore = new JLabel();
        lScore.setText("Your score : " + score);
        lScore.setPreferredSize(new Dimension(180, 50));

        lTimer = new JLabel();
        lTimer.setText("Time Left : " + 0);
        lTimer.setPreferredSize(new Dimension(180, 50));

        bReset = new JButton();
        bReset.addActionListener(this);
        bReset.setText("Reset");
        bReset.setPreferredSize(new Dimension(150, 50));

        bNext = new JButton();
        bNext.addActionListener(this);
        bNext.setText("Start");
        bNext.setPreferredSize(new Dimension(150, 50));

        pTools = new JPanel();
        pTools.setBackground(Color.lightGray);
        pTools.setBounds(360, 480, 400, 100);
        pTools.setLayout(new FlowLayout());

        pTools.add(lScore);
        pTools.add(lTimer);
        pTools.add(bReset);
        pTools.add(bNext);

        f.add(pTools);
    }

    private void initializeGamePanel() {
        bGame1 = new JButton();
        bGame1.addActionListener(this);
        bGame2 = new JButton();
        bGame2.addActionListener(this);
        bGame3 = new JButton();
        bGame3.addActionListener(this);
        bGame4 = new JButton();
        bGame4.addActionListener(this);

        pGame = new JPanel();
        pGame.setBackground(Color.gray);
        pGame.setBounds(360, 20, 400, 400);
        pGame.setLayout(new GridLayout(2, 2, 25, 25));
        pGame.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // * set icon here * //
        bGame1.setIcon(empty);
        bGame2.setIcon(empty);
        bGame3.setIcon(empty);
        bGame4.setIcon(empty);

        pGame.add(bGame1);
        pGame.add(bGame2);
        pGame.add(bGame3);
        pGame.add(bGame4);

        f.add(pGame);
    }

    private void initializeSelectPanel() {
        bSel1 = new JButton();
        bSel1.addActionListener(this);
        bSel2 = new JButton();
        bSel2.addActionListener(this);
        bSel3 = new JButton();
        bSel3.addActionListener(this);
        bSel4 = new JButton();
        bSel4.addActionListener(this);
        bSel5 = new JButton();
        bSel5.addActionListener(this);
        bSel6 = new JButton();
        bSel6.addActionListener(this);
        bSel7 = new JButton();
        bSel7.addActionListener(this);
        bSel8 = new JButton();
        bSel8.addActionListener(this);
        bSel9 = new JButton();
        bSel9.addActionListener(this);

        pSelect = new JPanel();
        pSelect.setBackground(Color.gray);
        pSelect.setBounds(20, 360, 280, 280);   // begin at 360px top, 20px left with 280px width, 280px height.
        pSelect.setLayout(new GridLayout(3, 3, 6, 6));  // create gridlayout size 3*3 that has space 6px
        pSelect.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // set margin around 10px.

        bSel1.setIcon(f1);
        bSel2.setIcon(f2);
        bSel3.setIcon(f3);
        bSel4.setIcon(f4);
        bSel5.setIcon(f5);
        bSel6.setIcon(f6);
        bSel7.setIcon(f7);
        bSel8.setIcon(f8);
        bSel9.setIcon(f9);

        pSelect.add(bSel1);
        pSelect.add(bSel2);
        pSelect.add(bSel3);
        pSelect.add(bSel4);
        pSelect.add(bSel5);
        pSelect.add(bSel6);
        pSelect.add(bSel7);
        pSelect.add(bSel8);
        pSelect.add(bSel9);

        f.add(pSelect);
    }

    private void initializeHintPanel() {
        lHint1 = new JLabel();
        lHint2 = new JLabel();
        lHint3 = new JLabel();
        lHint4 = new JLabel();
        
        pHint = new JPanel();
        pHint.setBackground(Color.gray);
        pHint.setBounds(20, 20, 280, 280);  // begin at 20px top, 20px left with 280px width, 280px height.
        pHint.setLayout(new GridLayout(2, 2, 10, 10));  // create gridlayout size 2*2 that has space 10px
        pHint.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));   // set margin around 10px.
        
        // * random icon here* //
        lHint1.setIcon(close);
        lHint2.setIcon(close);
        lHint3.setIcon(close);
        lHint4.setIcon(close);

        pHint.add(lHint1);
        pHint.add(lHint2);
        pHint.add(lHint3);
        pHint.add(lHint4);

        f.add(pHint);
    }

    private void setTimer() {
        for (int i = 10; i >= 0; i--) {
            lTimer.setText("Time Left : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void actionPerformed(ActionEvent ev) {
        JButton src = (JButton)ev.getSource();
        if (src == bSel1 || src == bSel2 || src == bSel3 || src == bSel4 || src == bSel5 || src == bSel6 || src == bSel7 || src == bSel8 || src == bSel9) {
            if (!isStart) return;
            addToGame(src);
            bNext.setText("Submit");
        } else if (src == bGame1 || src == bGame2 || src == bGame3 || src == bGame4) {
            if (!isStart) return;
            removeFromGame(src);
        } else if (src == bReset) {
            start();
            bNext.setText("Start");
            isStart = false;
        } else if (src == bNext) {
            if (isStart) {
                checkAns();
                bNext.setText("Next");
                isStart = false;
            } else {
                start();
                bNext.setText("Submit");
                isStart = true;
            }
        }
    }

    private void removeFromGame(JButton btn) {
        if (btn == bGame1) g1isEmpty = true;
        if (btn == bGame2) g2isEmpty = true;
        if (btn == bGame3) g3isEmpty = true;
        if (btn == bGame4) g4isEmpty = true;
        btn.setIcon(empty);
    }

    private void addToGame(JButton btn) {
        if (g1isEmpty) {
            bGame1.setIcon(evalIcon(btn));
            g1isEmpty = false;
        } else if (g2isEmpty) {
            bGame2.setIcon(evalIcon(btn));
            g2isEmpty = false;
        } else if (g3isEmpty) {
            bGame3.setIcon(evalIcon(btn));
            g3isEmpty = false;
        } else if (g4isEmpty) {
            bGame4.setIcon(evalIcon(btn));
            g4isEmpty = false;
        }
    }

    private void checkAns() {

    }

    private ImageIcon evalIcon(JButton btn) {
        if (btn == bSel1) return f1;
        if (btn == bSel2) return f2;
        if (btn == bSel3) return f3;
        if (btn == bSel4) return f4;
        if (btn == bSel5) return f5;
        if (btn == bSel6) return f6;
        if (btn == bSel7) return f7;
        if (btn == bSel8) return f8;
        if (btn == bSel9) return f9;
        return new ImageIcon();
    }
}