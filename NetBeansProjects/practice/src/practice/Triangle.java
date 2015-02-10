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
public class Triangle {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 0; x <= i; x++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
