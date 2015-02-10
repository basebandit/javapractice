/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mars
 */
public class Array {

    private static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[9];
        System.out.println("Enter any nine integers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = getInput();
        }
        System.out.println("You enterd nine integers: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");

        }
        System.out.println();
        System.out.println("These are the first seven integers: ");
        for (int k = 0; k < 7; k++) {
            System.out.print(array[k] + " ");

        }
        System.out.println();
    }

    private static int getInput() {
        while (!sc.hasNextInt()) {
            sc.nextInt();
            System.out.println("That's not an integer!.Try again...");
        }
        return sc.nextInt();
    }
}
