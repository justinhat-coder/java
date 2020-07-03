package com.company;

import javax.swing.*;

public class TitleFrame extends JFrame {
    public TitleFrame() {
        super("Title Frame");
        setLookAndFeel();
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        String response = JOptionPane.showInputDialog(null,
                "Please enter a title name:");
        setTitle(response);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e);
        }
    }
    public static void main(String[] arguments) {
        JFrame frame = new TitleFrame();
    }
}
