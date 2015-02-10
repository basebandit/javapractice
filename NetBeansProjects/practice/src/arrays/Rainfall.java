/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import java.io.PrintStream.*;

/**
 *
 * @author mars
 */
public class Rainfall {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        double annualAverage, difference;
        double[] rainfall = new double[12];
        String[] month = new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        double sum = 0.0;
        for (int i = 0; i < 12; i++) {
            System.out.print("Rainfall for month " + month[i] + ": ");
            rainfall[i] = sc.nextDouble();
            sum += rainfall[i];
        }
        annualAverage = sum / 12;
        System.out.format("Annual Average Rainfall:%5.2f\n\n", annualAverage);
        for (int i = 0; i < 12; i++) {
            System.out.format("%3d", (i + 1));//month #

            //average rainfall for the month
            System.out.format("%15.2f", rainfall[i]);

            //difference between the monthly and annual averages
            difference = Math.abs(rainfall[i] - annualAverage);
            System.out.format("%15.2f\n", difference);
        }
    }
}
