/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class AWTBorderLayoutDemo extends Frame {

    private Button btnNorth, btnSouth, btnCenter, btnEast, btnWest;

    public AWTBorderLayoutDemo() {
        setLayout(new BorderLayout(3, 3));
  // "this" Frame sets layout to BorderLayout,
        // horizontal and vertical gaps of 3 pixels

        // The components are added to the specified zone
        btnNorth = new Button("NORTH");
        add(btnNorth, BorderLayout.NORTH);
        btnSouth = new Button("SOUTH");
        add(btnSouth, BorderLayout.SOUTH);
        btnCenter = new Button("CENTER");
        add(btnCenter, BorderLayout.CENTER);
        btnEast = new Button("EAST");
        add(btnEast, BorderLayout.EAST);
        btnWest = new Button("WEST");
        add(btnWest, BorderLayout.WEST);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        setTitle("BorderLayoutDemo");
        setSize(280, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTBorderLayoutDemo();
    }
}
