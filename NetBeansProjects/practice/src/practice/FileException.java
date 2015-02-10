/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.FileNotFoundException;

/**
 *
 * @author mars
 */
public class FileException {

    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        openFile("~/NetBeansProjects/practice/src/practice/mwas.txt");
    }

    public static void openFile(String name) {
        try {
            java.io.FileInputStream f = new java.io.FileInputStream(name);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
