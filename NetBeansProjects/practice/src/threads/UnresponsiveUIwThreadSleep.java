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
public class UnresponsiveUIwThreadSleep extends JFrame {

    private JTextField tfCount;
    private boolean stop = false;
    private JButton btnStart, btnStop, btnReset;
    private int count = 1;

    /*Constructor to setup GUI components*/
    public UnresponsiveUIwThreadSleep() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));

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
                Thread t = new Thread() {
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            if (stop) {
                                break;
                            }
                            tfCount.setText(count + "");
                            count++;
                            //suspend this thread via sleep() and yield control to other threads also provide the necessary delay.
                            try {
                                sleep(10);//milliseconds
                                // interrupt(); throws InteruptedException error
                            } catch (InterruptedException ex) {
                                System.err.println("A thread was interrupted");
                            }
                        }
                    }
                };
                t.start();//call back run()
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

        btnReset = new JButton("Reset Counter");
        cp.add(btnReset);
        btnReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                //To change body of generated methods, choose Tools | Templates.
                Thread r = new Thread() {
                    @Override
                    public void run() {
                        resetCounter();
//                        try {
//                            sleep(10);
//                        } catch (InterruptedException ex) {
//                            System.err.println("A thread was interrupted");
//                        }
                    }

                };
                r.start();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("UnresponsiveUIWithSleep");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void resetCounter() {
        count = 1;
        stop = true;
        tfCount.setText(count + "");
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                new UnresponsiveUIwThreadSleep();
            }
        });
    }
}
