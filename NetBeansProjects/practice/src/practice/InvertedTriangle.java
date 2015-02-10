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
public class InvertedTriangle {

    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > x; y--) {
                System.out.print("*"+" ");          
            }
            System.out.println();
            for (int z = 0; z <= x; z++) {
                System.out.print(" ");
            }

        }
    }
}
