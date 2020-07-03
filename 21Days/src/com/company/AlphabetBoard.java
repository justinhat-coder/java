package com.company;

import javax.swing.*;
import java.awt.*;

public class AlphabetBoard extends JFrame {
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton east = new JButton("East");
    JButton west = new JButton("West");
    AlphabetPanel alpha = new AlphabetPanel();
    AlphabetBoard() {
        super("AlphabetBorder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240, 300);
        setLayout(new BorderLayout());
        add("North", north);
        add("South", south);
        add("East", east);
        add("West", west);
        add("Center", alpha);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e);
        }
    }
    public static void main(String[] arguments) {
        AlphabetBoard.setLookAndFeel();
        JFrame frame = new AlphabetBoard();
    }
}
class AlphabetPanel extends JPanel {
    JButton a = new JButton("Alibi");
    JButton b = new JButton("Burglar");
    JButton c = new JButton("Corpse");
    JButton d = new JButton("Deadbeat");
    JButton e = new JButton("Evidence");
    JButton f = new JButton("Fugitive");
    AlphabetPanel() {
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
    }
}
