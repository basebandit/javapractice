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
public class NestedForLoop {

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(x + "-" + y + " ");
            }
           System.out.println();
        }
    }
}
