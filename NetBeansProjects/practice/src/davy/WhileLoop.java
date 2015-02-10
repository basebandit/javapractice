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
public class WhileLoop {

    private static final java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter an integer " + "(the input ends if it is 0)");
        int number = getInput();
        while (number != 0) {
            sum += number;
            System.out.println("Enter an integer " + "(the input ends if it is 0)");
            number = getInput();
        }
    }

    /**
     * The conditional expression in the while statement calls the hasNextInt
     * method of the Scanner to see if the next value is an integer. The while
     * loop repeats as long as this call returns false, indicating that the next
     * value is not a valid integer. The body of the loop calls nextLine to
     * discard the bad data and displays an error message. The loop ends only
     * when you know you have good data in the input stream, so the return
     * statement calls nextInt to parse the data to an integer and return the
     * resulting value.
     *
     */
    private static int getInput() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("That's not an integer..Try again!");
        }
        return sc.nextInt();
    }
}
