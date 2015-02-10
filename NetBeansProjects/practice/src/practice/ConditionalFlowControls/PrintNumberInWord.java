
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
public class PrintNumberInWord {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter any number");

        int number;

        switch (GetNumber()) {
        case 1 :
            System.out.println("ONE");

            break;

        case 2 :
            System.out.println("TWO");

            break;

        case 3 :
            System.out.println("THREE");

            break;

        case 4 :
            System.out.println("FOUR");

            break;

        case 5 :
            System.out.println("FIVE");

            break;

        case 6 :
            System.out.println("SIX");

            break;

        case 7 :
            System.out.println("SEVEN");

            break;

        case 8 :
            System.out.println("EIGHT");

            break;

        case 9 :
            System.out.println("NINE");

            break;

        case 10 :
            System.out.println("TEN");

            break;

        case 11 :
            System.out.println("ELEVEN");

            break;

        case 12 :
            System.out.println("TWELVE");

            break;

        default :
            System.out.println("Not In The List");
        }
    }

    public static int GetNumber() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("That's not a number!Try Again...");
        }

        return sc.nextInt();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
