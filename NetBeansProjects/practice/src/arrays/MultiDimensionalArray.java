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
public class MultiDimensionalArray {

    static java.util.Scanner input = new java.util.Scanner(System.in);
    static int[][] matrix = new int[10][10];

    public static void main(String[] args) {
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getInput();
            }
        }
    }

    private static int getInput() {
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong Input.That's not an integer");
        }
        return input.nextInt();
    }
}
