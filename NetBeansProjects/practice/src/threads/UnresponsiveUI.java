/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class UnresponsiveUI extends JFrame {

    private boolean stop = false;//start or stop the counter
    private JTextField tfCount;
    private int count = 1;
    private JButton btnStart, btnStop;

    /**
     * Constructor to setup the GUI components*
     */
    public UnresponsiveUI() {
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        cp.add(new JLabel("Counter"));

        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        btnStart = new JButton("Start Counting");
        cp.add(btnStart);
        btnStart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                //To change body of generated methods, choose Tools | Templates.
                stop = false;
                for (int i = 0; i < 1000; i++) {
                    if (stop) {
                        break;//Check if STOP button has been pushed(which changes the stop flag to true)
                    }
                    tfCount.setText(count + "");
                    ++count;
                }
            }
        });
        btnStop = new JButton("Stop Counting");
        cp.add(btnStop);
        btnStop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                //To change body of generated methods, choose Tools | Templates.
                stop = true;
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Unresponsive UI");
        setSize(300, 120);
        setVisible(true);
    }

    /**
     * The entry main method
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        //Run GUI codes in Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                UnresponsiveUI unresponsiveUI = new UnresponsiveUI();
            }
        });
    }
}
