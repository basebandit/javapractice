/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class AverageRainfall {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double sum, rainfall, annualAverage;
        sum = 0.0;
        for (int i = 0; i < 12; i++) {
            System.out.println("Rainfall for month " + (i + 1) + ": ");
            rainfall = sc.nextDouble();
            sum += rainfall;
        }
        annualAverage = sum / 12.0;
        System.out.println("Annual Average Rainfall: " + annualAverage);
    }
}
