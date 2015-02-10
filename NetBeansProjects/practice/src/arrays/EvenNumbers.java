/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author mars
 */
public class EvenNumbers {

    public static void main(String[] args) {
        int[] number = new int[15];
        int sum = 0;
        for (int j = 5; j < 20; j++) {
            number[j - 5] = j;
        }
        for (int i = 0; i < 16; i++) {
            if (number[i] % 2 == 0) {
                sum += number[i];
                System.out.println("Even number: " + number[i]);
            }
            System.out.println("Sum is: " + sum);
        }

    }
}
