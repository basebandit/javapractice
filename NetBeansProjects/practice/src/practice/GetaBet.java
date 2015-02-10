package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetaBet {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int bet = 0;
        int bank = 1000;
        System.out.println("You can bet between " + bet + "and " + bank);
        do {
            System.out.println("Enter your bet: ");
            bet = GetInput();
        } while (bet <= 0);
    }

    public static int GetInput() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
