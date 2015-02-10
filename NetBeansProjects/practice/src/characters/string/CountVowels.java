/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

/**
 *
 * @author mars
 */
public class CountVowels {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter(System.getProperty("line.separator"));
        String name;
        System.out.println("Enter Your Name.");
        name = sc.next();
        int numberOfCharacters, vowelCount = 0;
        char Letter;
        numberOfCharacters = name.length();
        for (int i = 0; i < numberOfCharacters; i++) {
            Letter = name.charAt(i);
            if (Letter == 'a' || Letter == 'A'
                    || Letter == 'e' || Letter == 'E'
                    || Letter == 'i' || Letter == 'I'
                    || Letter == 'o' || Letter == 'O'
                    || Letter == 'u' || Letter == 'U') {
                vowelCount++;
            }
        }
        System.out.println(name + ", your name has " + vowelCount + " vowels.");
    }
}
