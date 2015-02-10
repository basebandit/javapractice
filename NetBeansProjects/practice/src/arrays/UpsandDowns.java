/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

;

/**
 *
 * @author mars
 */
public class UpsandDowns {

    private static boolean testCase;
    private static int sum = 0;
    private static int T;
    private static int N = 0;
    private static int A[] = new int[N];
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.print("\t\t\t ***********                 ***********\n");
        System.out.print("\t\t\t           *                 *         \n");
        System.out.print("\t\t\t           *                 *         \n");
        System.out.print("\t\t\t           *Let's Play A Game*         \n");
        System.out.print("\t\t\t           *                 *         \n");
        System.out.print("\t\t\t           *                 *         \n");
        System.out.println("\t \t\t ***********                 ***********");
        System.out.print("**    ** *******                      *****   ****** **       **        ** ******\n");
        System.out.print("**    ** *******                      ******  ****** **       **        ** ******\n");
        System.out.print("**    ** **   **                      **   ** **  ** **      *  *       ** **  **\n");
        System.out.print("**    ** ******* ******               **   ** **  **  **    *     *    **  **  **\n");
        System.out.print("******** ******* **  **    *******    **   ** **  **   *****       *****   **  **\n");
        System.out.print("******** **      ****      *******    **   ** **  **    ***         ***    **  **\n");
        System.out.print("******** **          **    **   **    ******  ******     **         **     **  **\n");
        System.out.print("******** **      ******    **   **    *****   ******      *         *      **  **\n");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing");
    }

    public static void playARound() {
        while (true) {
            try {
                System.out.println("Enter the number of test cases: ");
                T = Integer.parseInt(reader.readLine());
                System.out.println("Number of test cases: " + T);
                testCase = true;
                System.out.println(T);
                while (testCase) {
                    System.out.println("Enter the size of the array");
                    N = Integer.parseInt(reader.readLine());
                    System.out.println("Size of the array: " + N);
                    for (int i = 0; i <= N; i++) {
                        for (int j = 1; j <= i; j++) {
                            A[i] = j;
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.println(A[k]);
                        }
                    }
                }
            } catch (java.io.IOException e) {
                System.out.println("Invalid Entry,Please enter an integer...");
            }
        }
    }

    public static boolean askForAnotherRound() {
        return true;
    }

}
