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
public class NumberStairCase4 {

    public static void main(String[] args) {

        int i, k, p;
        System.out.print(" ");
        for (p = 1; p < 5; p++) {
            System.out.print(" " + p);

        }
        System.out.println();

        for (i = 1; i < 5; i++) {
            System.out.print(" " + i);

            for (k = 1; k < 5; k++) {
                System.out.print(" " +k * i);

            }
            System.out.println();
        }

    }
}
