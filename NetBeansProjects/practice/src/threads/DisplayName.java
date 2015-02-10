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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author mars
 */
public class DisplayName extends JFrame {

    private JTextField tfName;
    private static boolean pause = false;
    private JButton btnDisplayName;
    private JButton btnPause;
    private final static String NAME = "EVANSON";

    public DisplayName() {
        super("Display Name Using A Thread");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));

        tfName = new JTextField(10);
        tfName.setEditable(false);
        cp.add(tfName);

        btnDisplayName = new JButton("Display Name");
        cp.add(btnDisplayName);
        btnDisplayName.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                //To change body of generated methods, choose Tools | Templates
                pause = false;
                Thread t = new Thread() {
                    public void run() {
                        // printCharacter();
                    
                        try {
                            sleep(5);
                        } catch (InterruptedException e) {
                            System.err.println("Printing function interrupted...Code Exiting");
                            System.err.println(e.getCause());
                            dispose();
                        }
                    }
                };
            }
        });

//    private static char printCharacter() {
//        pause = true;
//        //char[] charArray = NAME.toCharArray();
//        char character = NAME.charAt(0);
//        int count = 0;
//        int i = count;
//        while (i == count) {
//            character = NAME.charAt(i);
//        }
//        i++;
//        count++;
//        return character;
    }

    public static void main(String[] args) {

//                for (int i = 0; i < NAME.length(); i++) {
//                    System.out.println(DisplayName.printCharacter());
//                }
//                try {
//                    Thread.sleep(2);
//                } catch (InterruptedException ex) {
//                    System.err.println("Print Character Thread Was Interrupted...Try Again");
//                }
    }

}
