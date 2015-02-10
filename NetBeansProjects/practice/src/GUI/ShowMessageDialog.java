/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class ShowMessageDialog {
    
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(400, 300);
        myWindow.setVisible(true);
        JOptionPane.showMessageDialog(myWindow, "How are you?");
        JOptionPane.showMessageDialog(null, "Good Bye");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
