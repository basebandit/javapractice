/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author mars
 */
public class Events extends JFrame {

    private final JLabel label;
    private final JButton button;

    public Events() {
        setLayout(new FlowLayout());
        button = new JButton("Click for Text");
        add(button);
        label = new JLabel("");
        add(label);
        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {

        /**
         * overrides abstract method ActionEvent in ActionListener class
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Now You can see words here");
        }
    }

    public static void main(String[] args) {
        Events gui = new Events();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Events Program");
        gui.setSize(300, 100);
        gui.setVisible(true);
    }
}
