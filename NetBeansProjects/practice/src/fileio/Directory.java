/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;

/**
 *
 * @author mars
 */
public class Directory {

    public static void main(String[] args) {
        File directory = new File("/home/mars/NetBeansProjects/practice/src/fileio/samplefiles");
        String filename[] = directory.list();
        for (String filename1 : filename) {
            System.out.println(filename1);
        }
        checkFile();
    }

    public static void checkFile() {
        File file = new File("home/mars/NetBeansProjects/practice/src/fileio/samplefiles/db2.info");
        if (file.isFile()) {
            System.out.println("I am a file");
        } else {
            System.out.println("I am a directory");
        }
    }
}
