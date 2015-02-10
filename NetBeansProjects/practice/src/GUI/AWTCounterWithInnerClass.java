/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * An AWT GUI program inherits from the top-level container java.awt.Frame
 *
 * @author mars
 */
public class AWTCounterWithInnerClass extends Frame {
 // This class is NOT a ActionListener, hence, it does not implement ActionListener

    // The event-handler actionPerformed() needs to access these "private" variables
    private final TextField tfCount;
    private int count = 0;
    Button btnCount;

    public AWTCounterWithInnerClass() {
        setLayout(new FlowLayout());

        add(new Label("Counter"));
        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);
        btnCount.addActionListener(new ButtonCountListener());
        addWindowListener(windowListener);

        setTitle("Counter");
        setSize(250, 100);
        setVisible(true);
    }
     public static void main(String[] args){
        new AWTCounterWithInnerClass();
        }

    private class ButtonCountListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            count++;
            tfCount.setText(count + "");
        }
    }
      public  WindowListener windowListener = new WindowListener(){
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
        };
    }

