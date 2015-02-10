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
public class DivisibilityTest {

    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;
        double average;
        int n = lowerbound;
        int count = 0;
        while (n % 7 == 0 && n <= upperbound) {
            System.out.println(n);
            n++;
            count++;
        }
        average = sum / count;
        System.out.println(String.format("Sum is: %s", sum));
        System.out.println(String.format("Average is : %s", average));
    }
}
