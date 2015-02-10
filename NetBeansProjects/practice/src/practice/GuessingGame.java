package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GuessingGame {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean keepPlaying = true;

        System.out.println("Let's Play a Guessing Game!");
        while (keepPlaying) {

            boolean validInput;
            int number, guess;
            String answer;
            //pick a random number
            number = (int) (Math.random() * 10) + 1;
            //Get the guess
            System.out.println("\nI'm Thinking of A Number" + "Between 1 and 10");
            System.out.println("What do you think it is? ");
            try {
                do {
                    guess = Integer.parseInt(reader.readLine());
                    validInput = true;
                    if ((guess < 1) || (guess > 10)) {
                        System.out.println("I said,between 1 and 10. " + "Try again");
                        validInput = false;
                    }
                } while (!validInput);
                //check the guess
                if (guess == number) {
                    System.out.println("You are right!");
                } else {
                    System.out.println("You are wrong!");
                }
                //play again?
                do {
                    System.out.println("\nPlay Again? (Y or N)");
                    answer = reader.readLine();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")) {
                        ;
                    } else if (answer.equalsIgnoreCase("N")) {
                        keepPlaying = false;
                    } else {
                        validInput = false;
                    }
                } while (!validInput);
                System.out.println("\nThank you for playing");
            } catch (IOException | NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
