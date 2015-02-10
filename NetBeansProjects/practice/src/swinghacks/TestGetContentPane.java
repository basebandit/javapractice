/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.swing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;

/**
 *
 * @author mars
 */
public class TestGetContentPane extends JFrame {

    //Get the content-pane of this JFrame,which is a java.awt.Container
    //All operations,such as setLayout() and add() operate on the content-pane
    public TestGetContentPane() {
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Hello, world!"));
        cp.add(new JButton("Button"));
    }

}
