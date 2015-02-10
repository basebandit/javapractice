/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class SwingAccumulator extends JFrame {

    private JTextField tfInput, tfOutput;
    private int numberIn;
    private int sum;

    public SwingAccumulator() {

        sum = 0;
        //Retrieve the contnet-pane of the top-level container JFrame
        //All operations done on the content-pane 
        final Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2, 5, 5));

        add(new JLabel("Enter an Integer: "));
        tfInput = new JTextField(10);
        add(tfInput);
        add(new JLabel("The Accumulated Sum is: "));
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);//read-only
        add(tfOutput);

        //Allocate an anonymous instance of an anonymous inner class that
        //implements ActionListener as ActionEvent Listener
        tfInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //Get The String entered into the input TextField,convert into int
                    numberIn = Integer.parseInt(tfInput.getText());
                    sum += numberIn;//accumulate numbers entered int sum
                    tfInput.setText("");//clear input TextField
                    tfOutput.setText(sum + "");//display the sum on the output textfield

                } catch (NumberFormatException eX) {
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAccumulator();
            }
        });
    }
}
