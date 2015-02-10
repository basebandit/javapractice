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
public class SumAndAverage3 {

    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number;
            number++;
        }
        average = sum / upperbound;
        System.out.println(MessageFormat.format("Sum is {0}", sum));
        System.out.println(MessageFormat.format("Average is {0}", average));
    }
}
