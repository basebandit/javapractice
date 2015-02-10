/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class Z {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] Student = new int[10];
        int mark[] = new int[10];
        for (int i = 0; i < 10; i++) {
            mark[i] = (int) (Math.random() * 10) * 1;
        }
        for (int j = 0; j < 10; j++) {
            Student[j] = mark[j];
        }
        for (int k = 0; k < 10; k++) {
            System.out.println("Student" + k + " attained: " + mark[k]);
        }
        for (int x = 0; x < 10; x++) {
            while (Student[x] < 10) {
                int largest = Student[x] > Student[x + 1] ? Student[x] : Student[x + 1];
                System.out.println("Highest Student is: " + largest);
                Student[x]++;
            }
        }
    }
}
