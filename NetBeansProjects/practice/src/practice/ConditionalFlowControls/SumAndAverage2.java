/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class SumAndAverage2 {

    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int number = lowerbound;
        do {
            sum += number;
            ++number;
        } while (number <= upperbound);
        average = sum / upperbound;
        System.out.println(String.format("Sum is: %s", sum));
        System.out.println(String.format("Average is: %s", average));
    }
}
