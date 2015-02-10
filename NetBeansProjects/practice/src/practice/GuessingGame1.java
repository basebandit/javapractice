/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author mars
 */
public class GuessingGame1 {

    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing");
    }

    public static void playARound() {
        int number, guess;
        String answer;

        //pick a random number
        number = getRandomNumber();

        //get the guess
        System.out.println("\nI'm thinking of a number" + "between 1 and 10\nWhat do you think it is?");
        guess = getGuess();

        //check the guess
        if (number == guess) {
            System.out.println("You are right!");
        } else if (number != guess) {
            System.out.println("You are wrong " + "The number was " + number);
        }
    }

    public static int getRandomNumber() {
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }

    public static int getGuess() {
        while (true) {
            try {
                int guess = Integer.parseInt(reader.readLine());

                if ((guess < 1) || (guess > 10)) {
                    System.out.println("I said between 1 and 10! " + "Try again...");

                } else {
                    return guess;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid Guess!Try Again...");
            }
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {

            try {
                String answer;
                System.out.println("\nWould you like to play again? (Y or N) ");
                answer = reader.readLine();
                if (answer.equalsIgnoreCase("Y")) {
                    return true;
                } else if (answer.equalsIgnoreCase("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Wrong answer..Try again...");
            }
        }
    }
}
