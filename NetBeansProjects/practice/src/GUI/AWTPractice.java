/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mars
 */
public class AWTPractice extends Frame implements ActionListener {

    private Label lblUsername;
    private TextField tfUsername;
    private Button btnLogin;

    public AWTPractice() {
        setLayout(new FlowLayout());
        lblUsername = new Label("Username");
        add(lblUsername);
        tfUsername = new TextField(10);
        tfUsername.setEditable(true);
        add(tfUsername);
        btnLogin = new Button("Login");
        add(btnLogin);

        btnLogin.addActionListener(this);
        setTitle("Login");
        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTPractice();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Welcome " + tfUsername.getText());
    }
}
