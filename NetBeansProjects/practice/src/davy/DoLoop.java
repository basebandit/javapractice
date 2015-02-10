/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davy;

/**
 *
 * @author mars
 */
public class DoLoop {

    public static void main(String[] args) {
        /**
         * The do-while loop executes the loop body first,then checks the loop
         * continuation-condition to determine whether to continue or terminate
         * the loop.
         */
        int data;
        int sum = 0;

        //create a scanner 
        java.util.Scanner sc = new java.util.Scanner(System.in);

        /**
         * keep reading data until the input is 0.Use the do-while loop if you
         * have statements inside the loop that must be executed at least once*
         */
        do {
            System.out.println("Enter an integer(the input ends if it is 0): ");
            data = sc.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}
