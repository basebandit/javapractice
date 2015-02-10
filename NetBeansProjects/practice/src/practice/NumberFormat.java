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
public class NumberFormat {

    static java.text.NumberFormat cf = java.text.NumberFormat.getCurrencyInstance();
    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter Your salesTax:");
        double salesTax = getInput();
        System.out.println("Your sales tax = "+cf.format(salesTax));
    }

    /**
     *
     * @return
     */
    public static double getInput() {
        while (true) {
            try {
                return Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.println("Invalid entry!Try Again...");
            }
        }
    }
}
