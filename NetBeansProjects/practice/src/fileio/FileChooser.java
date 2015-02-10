/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;
import javax.swing.JFileChooser;

/**
 * When we create an instance of JFileChooser by passing no arguments to the
 * constructor, as in this example, it will list the content of the user’s home
 * directory. For the Windows platform, the user’s home directory by default is
 * the My Documents folder. We can set the file chooser to list the contents of
 * a desired directory when it first appears on the screen. We can do this in
 * two ways. The first is to pass the path name of the directory as a String
 * argument to the constructor. For example, if we want to start the listing
 * from the home/mars/NetBeansProjects/practice/src/fileio/samplefiles
 * directory, then we write
 *
 * @author mars
 */
public class FileChooser {

    private static final JFileChooser chooser = new JFileChooser();

    /**
     * Notice that we have to pass a File object, not a String, to the
     * setCurrentDirectory method.
     *
     * @param args
     */
    public static void main(String[] args) {
        File startDir = new File("home/mars/NetBeansProjects/practice/src/fileio/samplefiles");
        chooser.setCurrentDirectory(startDir);
        chooser.showOpenDialog(null);
    }
}
