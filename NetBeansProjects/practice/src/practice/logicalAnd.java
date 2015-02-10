/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author mars
 */
public class logicalAnd {

    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        int SalesClass;
        int SalesTotal;
        System.out.println("Enter Your Sales Class:");
        SalesClass = getInput();
        System.out.println("Enter Your Sales Total:");
        SalesTotal = getInput();

        if (SalesClass <= 5 & SalesClass >= 1 & SalesTotal < 10000 & SalesTotal <= 50000) {
            double commissionRate = 0.5;
            System.out.println("Your Commission is: " + commissionRate);
        } else if (SalesClass > 5 & SalesClass <= 10 & SalesTotal > 50000 & SalesClass <= 100000) {
            double commissionRate = 1.5;
            System.out.println("Your Commission is: " + commissionRate);
        }

    }

    public static int getInput() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
