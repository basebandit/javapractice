/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unbufferedio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Line-Oriented I/O
 *
 * @author mars
 */
public class CopyLines {

    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("/home/mars/NetBeansProjects/practice/src/unbufferedio/xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("/home/mars/NetBeansProjects/practice/src/unbufferedio/Characteroutput.txt"));
            String l;
            /**
             * Invoking readLine returns a line of text with the line.CopyLines
             * outputs each line using println, which appends the line
             * terminator for the current operating system
             */
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
