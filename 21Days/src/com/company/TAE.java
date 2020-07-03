package com.company;

import javax.swing.*;
import java.awt.*;

public class TAE extends JFrame {
    private final JLabel usernamesLabels = new JLabel("Name: ",
            SwingConstants.RIGHT);
    private final JTextField usernames;
    private final JLabel house = new JLabel("House/Street: ",
            SwingConstants.RIGHT);
    private final JTextField houses;
    private final JLabel city = new JLabel("City: ",
            SwingConstants.RIGHT);
    private final JTextField cities;
    private final JLabel state = new JLabel("State/County: ",
            SwingConstants.RIGHT);
    private final JTextField states;
    private final JLabel zip = new JLabel("Zip/Post Code: ",
            SwingConstants.RIGHT);
    private final JTextField zips;
    private final JLabel telephone = new JLabel("Telephone: ",
            SwingConstants.RIGHT);
    private final JTextField telephones;
    public TAE() {
        super("Text Accelerator Example");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        String response1 = JOptionPane.showInputDialog(null,
                "Name:");
        usernames = new JTextField(response1, 20);
        String response2 = JOptionPane.showInputDialog(null,
                "House/Street:");
        houses = new JTextField(response2, 20);
        String response3 = JOptionPane.showInputDialog(null,
                "City:");
        cities = new JTextField(response3, 20);
        String response4 = JOptionPane.showInputDialog(null,
                "State/County:");
        states = new JTextField(response4, 20);
        String response5 = JOptionPane.showInputDialog(null,
                "Zip/Post Code:");
        zips = new JTextField(response5, 20);
        String response6 = JOptionPane.showInputDialog(null,
                "Telephone:");
        telephones = new JTextField(response6, 20);
        setLayout(new GridLayout(6, 2));
        add(usernamesLabels);
        add(usernames);
        add(house);
        add(houses);
        add(city);
        add(cities);
        add(state);
        add(states);
        add(zip);
        add(zips);
        add(telephone);
        add(telephones);
        setLookAndFeel();
        setVisible(true);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e);
        }
    }
    public static void main(String[] arguments) {
        TAE frame = new TAE();
    }
    
}

