/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

import java.util.Scanner;

/**
 * Count the number of times the word 'java' occurs in input. Case-insensitive
 * comparison is used here. The program terminates when the word STOP
 * (case-sensitive) is entered.
 *
 * @author mars
 */
public class CountJava {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int javaCount = 0;
        String word;
        while (true) {
            System.out.println("Next Word: ");
            word = sc.next();
            if (word.equals("STOP")) {
                break;
            } else if (word.equalsIgnoreCase("java")) {
                javaCount++;
            }
        }
        System.out.println("'java' count: " + javaCount);
    }
}
