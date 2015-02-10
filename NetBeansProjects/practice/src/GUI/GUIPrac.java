/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.event.MouseInputListener;

/**
 *
 * @author mars
 */
public class GUIPrac extends JFrame {

    private final JLabel label;
    private final JButton button;
    private final JTextField textfield;

    public GUIPrac() {
        setLayout(new FlowLayout());
        label = new JLabel("My First GUI Label");
        add(label);
        textfield = new JTextField(15);
        add(textfield);
        button = new JButton("Click Here!");
        add(button);
    }

    public static void main(String[] args) {
        GUIPrac gui = new GUIPrac();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(200, 125);
    }
}
