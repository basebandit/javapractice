package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OmittedInit {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int a;
        try {
            System.out.println("Where should i start?");
            a = Integer.parseInt(reader.readLine());
            for (; a >= 0; a--) {
                System.out.println(a);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
