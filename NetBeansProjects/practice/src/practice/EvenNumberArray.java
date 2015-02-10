/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class EvenNumberArray {

    public static void main(String[] args) {
        int number[] = new int[16];
        int sum = 0;
        int i;
        //populates the array
        for (i = 5; i <= 20; i++) {
            number[i - 5] = i;
        }
        //retrieves the data items
        for (int j = 0; j < 16; j++) {
            if (number[j] % 2 == 0) {
                sum = sum + number[j];
                System.out.println(number[j]);
            }
        }
        System.out.println("Sum is " + sum);
    }
}
