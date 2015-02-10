/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davy;

import java.io.IOException;

/**
 * Examples of loops
 *
 * @author mars
 */
public class LoopRequirements {

    private static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    private static int age;

    /**
     * A loop should have a test condition which is used to control the loop's
     * execution.. A loop should have a statement which is executed if the
     * condition evaluates to true.
     */
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        getAge();
        if (age > 18 && age < 65) {
            System.out.println("You can Enter");
        } else if (age < 18 || age > 65) {
            System.out.println("You are either too young or too old to enter,Which are you?");
        }

    }

    public static int getAge() {
        /**
         * The statements in the while loop only executes when the
         * expression(condition) evaluates to true i.e only and only when the
         * user enters an integer
         *
         */
        while (true) {
            try {

                age = Integer.parseInt(reader.readLine());
                return age;
                //  System.exit(0);
            } catch (IOException | NumberFormatException e) {
                System.err.println("Enter a valid age!");
            }
        }
    }
}
