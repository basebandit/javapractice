/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.ConditionalFlowControls;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class SumOddNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;
        double average;
        int count = 0;
        for (int n = lowerbound; n <= upperbound; n++) {
            if (n % 2 != 0) {
                System.out.print(n + ",");
                sum += n;
                count++;
            }
        }
        System.out.println();
        average = sum / count;
        System.out.println(String.format("Sum Of The Odd Numbers: %s", sum));
        System.out.println(MessageFormat.format("Average of the Odd Numbers: {0}", average));
    }
}
