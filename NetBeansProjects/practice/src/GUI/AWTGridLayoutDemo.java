/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class AWTGridLayoutDemo extends Frame {

    private final Button btn1, btn2, btn3, btn4, btn5, btn6;

    public AWTGridLayoutDemo() {
        setLayout(new GridLayout(3, 4, 3, 3));
        //"this" Frame sets the layout to 3*2 GridLayout,horizontal and vertical gaps of 3 pixels
        //The components are added from left-to-right,top-t0-bottom
        btn1 = new Button("Button 1");
        add(btn1);
        btn2 = new Button("This is Button 2");
        add(btn2);
        btn3 = new Button("3");
        add(btn3);
        btn4 = new Button("Another Button 4");
        add(btn4);
        btn5 = new Button("Button 5");
        add(btn5);
        btn6 = new Button("One More Button 6");
        add(btn6);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        setTitle("GridLayoutDemo");
        setSize(280, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTGridLayoutDemo();
    }
}
