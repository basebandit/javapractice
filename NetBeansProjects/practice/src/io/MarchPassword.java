/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class MarchPassword implements CharSequence {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Path path = Paths.get("/home/mars/final-wordlist.txt");
            byte[] contents = Files.readAllBytes(path);
            System.out.println("Enter password: ");
            String pswd = sc.next();
            boolean match = false;
            for (int i = 0; i < contents.length; i++) {
                match = pswd.contentEquals(pswd);
            }
            if (match == true) {
                System.out.println("Match found You May Enter!!!");
            } else if (match == false) {
                System.out.println("Match Not Found..Try Again");
            }
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return ' ';
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }
}
