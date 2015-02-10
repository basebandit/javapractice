/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

/**
 *
 * @author mars
 */
public class MyFrame extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public MyFrame() {
        //set the frame default properties
        setTitle("Blue Background JFrame subclass");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ChangeBkgdColor();
    }
    
    public static void main(String[] args) {
        MyFrame blueFrame = new MyFrame();
        blueFrame.setVisible(true);
    }
    
    public final void ChangeBkgdColor() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
    }
    
}
