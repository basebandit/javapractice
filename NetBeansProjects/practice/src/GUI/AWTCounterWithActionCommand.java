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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class AWTCounterWithActionCommand extends Frame {
    
    private final JTextField tfCounter;
    private final JButton btnCountUp;
    private final JButton btnCountDown;
    private final JButton btnReset;
    private int count = 0;
    
    public AWTCounterWithActionCommand() {
        setLayout(new FlowLayout());
        
        add(new JLabel("Counter "));
        tfCounter = new JTextField("0", 10);
        tfCounter.setEditable(false);
        add(tfCounter);
        
        btnCountUp = new JButton("CountUp");
        add(btnCountUp);
        
        btnCountDown = new JButton("CountDown");
        add(btnCountDown);
        
        btnReset = new JButton("Reset");
        add(btnReset);
        
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
        btnCountUp.addActionListener(new BtnListener());
        btnCountDown.addActionListener(new BtnListener());
        btnReset.addActionListener(new BtnListener());
        setTitle("Counter");
        setSize(500, 100);
        setVisible(true);
    }
    
    private class BtnListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String btnLabel = e.getActionCommand();
            switch (btnLabel) {
                case "CountUp":
                    count++;
                    tfCounter.setText(count + "");
                    break;
                case "CountDown":
                    count--;
                    tfCounter.setText(count + "");
                    break;
                default:
                    count = 0;
                    tfCounter.setText(count + "");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        new AWTCounterWithActionCommand();
    }
    
}
