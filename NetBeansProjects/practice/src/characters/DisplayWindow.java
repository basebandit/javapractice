/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import javax.swing.*;

/**
 *
 * @author mars
 */
public class DisplayWindow {

    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Window");
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
