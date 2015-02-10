/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

/**
 *
 * @author mars
 */
public class Buttons extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private final JButton cancelBtn;
    private final JButton okBtn;

    public Buttons() {
        Container contentPane = getContentPane();
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Button Demo");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //set the layout manager
        contentPane.setLayout(new FlowLayout());

        //create and place two buttons on the frame's content pane
        okBtn = new JButton("OK");
        contentPane.add(okBtn);

        cancelBtn = new JButton("CANCEL");
        contentPane.add(cancelBtn);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Buttons myBtn = new Buttons();
        myBtn.setVisible(true);
    }
}
