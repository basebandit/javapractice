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

/**
 *
 * @author mars
 */
public class UnresponsiveUIwThread extends JFrame {

    private boolean stop = false;
    private JButton btnStart, btnStop;
    private int count = 1;
    private JTextField tfCount;

    /**
     * Constructor to set up the GUI components*
     */
    public UnresponsiveUIwThread() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        cp.add(new JLabel("Counter"));

        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        btnStart = new JButton("Start Counting");
        cp.add(btnStart);
        btnStart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //To change body of generated methods, choose Tools | Templates.
                stop = false;
                Thread t = new Thread() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            if (stop) {
                                break;
                            }
                            tfCount.setText(count + "");
                            ++count;
                        }
                    }
                };
                t.start();

            }
        });
        btnStop = new JButton("Stop Counting");
        cp.add(btnStop);
        btnStop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                //To change body of generated methods, choose Tools | Templates.
                stop = true;
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Unrensponsive UI With Thread");
        setSize(300, 200);
        setVisible(true);
    }

    /**
     * The entry main method
     */
    public static void main(String[] args) {
        //Run GUI codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                new UnresponsiveUIwThread();//Let the constructor do the job
            }
        });
    }
}
