package com.company;

import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
    PasswordInnerFrame pass;
    public Password() {
        super("Ask Password");
        this.pass = new PasswordInnerFrame();
        setSize(540, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pass.setVisible(true);
        setLayout(new GridLayout(8, 2));
    }
    public static void main(String[] arguments) {
        Password app = new Password();
    }
}
class PasswordInnerFrame extends JFrame {
    public PasswordInnerFrame() {
        super("Password");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField username = new JTextField(8);
        JLabel houseLabel = new JLabel("House/Address: ");
        JTextField House = new JTextField(8);
        JLabel cityLabel = new JLabel("City: ");
        JTextField City = new JTextField(8);
        JLabel stateLabel = new JLabel("State/County: ");
        JTextField State = new JTextField(8);
        JLabel zipLabel = new JLabel("Zip codes: ");
        JTextField Zip = new JTextField(8);
        JLabel phoneLabel = new JLabel("Phone: ");
        JTextField Phone = new JTextField(8);
        JButton Clear = new JButton("Clear");
        JButton OK = new JButton("OK");
        setLayout(new GridLayout(8, 2));
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(houseLabel);
        pane.add(House);
        pane.add(cityLabel);
        pane.add(City);
        pane.add(stateLabel);
        pane.add(State);
        pane.add(zipLabel);
        pane.add(Zip);
        pane.add(phoneLabel);
        pane.add(Phone);
        setContentPane(pane);
        pane.add(Clear);
        pane.add(OK);
        setVisible(false);
    }
}

