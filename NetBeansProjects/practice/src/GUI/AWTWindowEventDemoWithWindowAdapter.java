/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

/**
 *
 * @author mars
 */
public class AWTWindowEventDemoWithWindowAdapter extends Frame {

    private final TextField tfCounter;
    private final Button btnCount;
    private int count = 0;

    public AWTWindowEventDemoWithWindowAdapter() {
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
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        setTitle("Counter");
        setSize(250, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AWTWindowEventDemoWithWindowAdapter();
    }
}
