/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class ScanXan {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(new BufferedReader(new FileReader("/home/mars/NetBeansProjects/practice/src/unbufferedio/xanadu.txt")))) {
            /**
             * if you wanted the token separator to be a comma, optionally
             * followed by white space. You would invoke
             * s.useDelimiter(",\\s*");
             *
             */
            //s.useDelimiter(",\\s*");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
