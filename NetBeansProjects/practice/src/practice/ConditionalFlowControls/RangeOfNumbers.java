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
public class RangeOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 111;
        int upperbound = 8899;
        int count = 0;
        for (int number = lowerbound; number <= upperbound; ++number) {
            ++count;
        }
        System.out.println(String.format("Range of numbers: %s", count));
    }
}
