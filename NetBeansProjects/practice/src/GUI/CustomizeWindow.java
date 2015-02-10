/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class CustomizeWindow extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public CustomizeWindow() {
        //set the frame default properties
        setTitle("BLUE Background Jframe Subclass");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        //register 'Exit upon closing as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        changeBkColor();
    }
    
    public void changeBkColor() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
    }
    
    public static void main(String[] args) {
        CustomizeWindow myWindow = new CustomizeWindow();
        myWindow.setVisible(true);
    }
}
