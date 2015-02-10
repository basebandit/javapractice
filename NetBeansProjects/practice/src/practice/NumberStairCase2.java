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
public class NumberStairCase2 {
    public static void main(String[] args) {
        for (int b = 1; b <= 4; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

