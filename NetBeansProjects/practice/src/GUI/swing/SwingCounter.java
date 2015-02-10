/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.swing;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class SwingCounter extends JFrame {

    private JTextField tfCount;
    private JButton btnCount;
    private int count = 0;

    public SwingCounter() {
        //Retrieve the content-pane of the top-level container JFrame
        //All operations done on the content-pane
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("Counter"));
        tfCount = new JTextField("0", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        btnCount = new JButton("Count");
        cp.add(btnCount);

        //Allocate an anonymous instance of an anonymous inner class that 
        //implements ActionListener as ActionEvent Listener
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tfCount.setText(count + "");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Run the GUI construction in the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingCounter();
            }
        });
    }

}
