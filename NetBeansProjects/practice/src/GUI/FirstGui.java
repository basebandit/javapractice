/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

/**
 *
 * @author mars
 */
public class FirstGui extends JFrame {
    
    private JLabel label;
    private JButton button;
    private JTextField textField;
    
    public FirstGui() {
        setLayout(new FlowLayout());
        label = new JLabel("Hi i am a Label");
        add(label);
        textField = new JTextField(15);
        add(textField);
        button = new JButton("Click Here");
        add(button);
    }

    public static void main(String[] args) {
        FirstGui gui = new FirstGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(200, 125);
        gui.setTitle("Title");
    }
}
