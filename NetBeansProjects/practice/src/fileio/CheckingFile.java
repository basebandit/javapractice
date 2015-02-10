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
public class CheckingFile {

    public static void main(String[] args) {
        File myfile = new File("/home/mars/NetBeansProjects/practice/src/fileio/samplefiles/db2.info");
        if (myfile.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
