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
public class Matrix {

    public static void main(String[] args) {
        int m[][] = new int[4][3];
        m[0][0] = 5;
        m[0][1] = 13;
        m[0][2] = 24;
        m[1][0] = 18;
        m[1][1] = 11;
        m[1][2] = 9;
        m[2][0] = 4;
        m[2][1] = 5;
        m[2][2] = 8;
        m[3][0] = 3;
        m[3][1] = 0;
        m[3][2] = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(m[row][col]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
