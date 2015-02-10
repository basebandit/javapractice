
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class CheckOddEven {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter any number");

        int number = getInput();

        System.out.println("The number is " + number);

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static int getInput() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Thats not a number.Try Again...");
        }

        return sc.nextInt();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
