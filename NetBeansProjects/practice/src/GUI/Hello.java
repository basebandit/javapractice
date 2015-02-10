/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class Hello extends JFrame {

    private TextField tfName;
    private Button btnHello;
    private final String msg = new String("Hello ");

    public Hello() {
        setLayout(new FlowLayout());

        add(new JLabel("Name "));
        tfName = new TextField(15);
        add(tfName);

        btnHello = new Button("Enter");
        add(btnHello);

        btnHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Hello.this, msg + tfName.getText());
            }

        });
        setTitle("Hello");
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Hello();
    }
}
