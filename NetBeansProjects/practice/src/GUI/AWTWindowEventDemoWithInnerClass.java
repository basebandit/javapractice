/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class AWTWindowEventDemoWithInnerClass extends Frame {

    private final TextField tfCounter;
    private final Button btnCount;
    private int count = 0;

    public AWTWindowEventDemoWithInnerClass() {
        setLayout(new FlowLayout());

        add(new Label("Counter"));
        tfCounter = new TextField("0", 10);
        tfCounter.setEditable(false);
        add(tfCounter);

        btnCount = new Button("Count");
        add(btnCount);

        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tfCounter.setText(count + "");
            }
        });
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        setTitle("Counter");
        setSize(250, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AWTWindowEventDemoWithInnerClass();
    }
}
