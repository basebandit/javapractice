/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 *
 * @author mars
 */
public class ReadAll2 {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/mars/final-wordlist.txt");
            byte[] contents = Files.readAllBytes(path);
            for (byte b : contents) {
                System.out.print((char) b);
            }
        } catch (Exception e) {
            System.out.println("File Not Found");
        }
    }
}
