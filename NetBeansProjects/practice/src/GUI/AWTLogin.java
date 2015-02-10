/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class AWTLogin extends JFrame implements ActionListener, WindowListener {
    
    private final JTextField tfUsrnm;
    private final JTextField tfPswd;
    private final JButton btnLogin;
    private final JButton btnCancel;
    
    public AWTLogin() {
        setLayout(new FlowLayout());
        
        add(new JLabel("Username"));
        tfUsrnm = new JTextField(10);
        add(tfUsrnm);
        
        add(new JLabel("Password"));
        tfPswd = new JTextField(10);
        add(tfPswd);
        
        btnLogin = new JButton("LOGIN");
        btnLogin.setActionCommand("LOGIN");
        add(btnLogin);
        
        btnCancel = new JButton("CANCEL");
        btnCancel.setActionCommand("CANCEL");
        add(btnCancel);
        
        addWindowListener(this);
        tfUsrnm.addActionListener(this);
        tfPswd.addActionListener(this);
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        
        setTitle("Login Form");
        setSize(200, 120);
        setLocation(120, 140);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AWTLogin();
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    @Override
    public void windowClosed(WindowEvent e) {
    }
    
    @Override
    public void windowIconified(WindowEvent e) {
    }
    
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    
    @Override
    public void windowActivated(WindowEvent e) {
    }
    
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (e.getActionCommand().equals("LOGIN")) {
            if ("".equals(tfPswd.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid Password try again");
            } else if ("".equals(tfPswd.getText())) {
                JOptionPane.showMessageDialog(this, "Enter Your Password");
            } else if (("".equals(tfUsrnm.getText())) && ("".equals(tfPswd.getText()))) {
                JOptionPane.showMessageDialog(this, "BlankFields");
            }
            tfUsrnm.setText("");
            tfPswd.setText("");
        } else if (e.getActionCommand().equals("CANCEL")) {
            System.exit(0);
        }
    }
    
}
