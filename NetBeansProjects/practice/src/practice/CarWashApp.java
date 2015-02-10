/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author mars
 */
public class CarWashApp {

    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        System.out.println("The Car Wash Application!\n");
        System.out.print("Enter the package code: ");
        char s = getInput();
        String details = "";

        switch (s) {
            case 'E':
            case 'e':
                details += "\tNew Car Scent,plus...\n";
            case 'D':
            case 'd':
                details += "\tTire Treatment,plus...\n";
            case 'C':
            case 'c':
                details += "\tLeather/Vinyl Treatment,plus...\n";
            case 'B':
            case 'b':
                details += "\tWax,plus...\n";
            case 'A':
            case 'a':
                details += "\tWash,vacuum,and hand dry.\n";
                break;
            default:
                details = "That's not one of our codes";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }

    public static char getInput() {
        while (true) {
            try {
                String c = reader.readLine();
                char p = c.charAt(0);
                return p;
            } catch (IOException e) {
                System.out.println("Invalid package code.Try again...");
            }
        }
    }
}
