/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

/**
 *
 * @author mars
 */
public class GUIProgram extends JFrame {

    public GUIProgram() {
        //Create a frame

        JFrame f = new JFrame();
        //create buttons
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");
        //add buttons to the frame
        add(b1);
        add(b2);
        //display Frame
        f.setSize(200, 200);
        f.setLocation(400, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        GUIProgram gp = new GUIProgram();
    }
}
