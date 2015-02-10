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
public class RangeOfNumbers2 {

    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 111;
        int upperbound = 8899;
        double average;
        int count = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            number++;
            count++;
        }
        System.out.println(MessageFormat.format("Range Of numbers is: {0}", count));
    }
}
