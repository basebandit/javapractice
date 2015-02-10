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
public class RainfallStat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monthName = new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        double[] rainfall = new double[12];
        double[] quarterAverage = new double[4];
        double annualAverage, sum, difference;
        double oddMonthSum, oddMonthAverage, evenMonthSum, evenMonthAverage;
        sum = 0.0;
        ///////////////////Annual Average//////////////////////
        for (int i = 0; i < rainfall.length; i++) {
            System.out.println("Rainfall for month " + monthName[i] + ": ");
            rainfall[i] = sc.nextDouble();
            sum += rainfall[i];
        }
        annualAverage = sum / 12.0;
        System.out.format("Annual Average Rainfall:%6.2f\n\n", annualAverage);
        oddMonthSum = 0.0;
        evenMonthSum = 0.0;

        ///////////////Odd and Month Averages////////////////////
        //compute the average for the odd months.
        for (int i = 0; i < rainfall.length; i += 2) {
            oddMonthSum += rainfall[i];
        }
        oddMonthAverage = oddMonthSum / 6.0;
        for (int i = 1; i < rainfall.length; i += 2) {
            evenMonthSum += rainfall[i];
        }
        evenMonthAverage = evenMonthSum / 6.0;
        System.out.format("Odd Month Rainfall Average: %6.2f\n\n", oddMonthAverage);
        System.out.format("Even Month Rainfall Average: %6.2f\n\n", evenMonthAverage);
        //////////////////////Quarter Averages//////////////////////////
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += rainfall[3 * i + j];//compute the sum of one quarter
            }
            quarterAverage[i] = sum / 3.0;
            System.out.format("Rainfall Average Qtr %3d:%6.2f\n", i + 1, quarterAverage[i]);
        }
    }
}
