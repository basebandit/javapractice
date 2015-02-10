/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import javax.swing.JFileChooser;

/**
 *
 * @author mars
 */
public class FileChooser2 {

    private static JFileChooser chooser;

    public static void main(String[] args) {
        chooser = new JFileChooser("home/mars/NetBeansProjects/practice/src/fileio");
        chooser.showOpenDialog(null);
    }
}
