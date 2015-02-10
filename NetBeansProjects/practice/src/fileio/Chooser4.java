/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author mars
 */
public class Chooser4 {

    private static JFileChooser chooser;

    /**
     * Instead of designating a fixed directory as in this example, we may wish
     * to begin the listing from the current directory. Since the current
     * directory is different when the program is executed from a different
     * directory, we need a general approach. We can achieve the generality by
     * writing
     *
     * @param args
     */
    public static void main(String[] args) {
        String current = System.getProperty("home/mars/NetBeansProjects/practice/src/fileio/samplefiles");
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(current));
        int status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            System.out.println("Open is clicked");
        } else {
//            System.out.println("Cancel is clicked");
        }
    }
}
