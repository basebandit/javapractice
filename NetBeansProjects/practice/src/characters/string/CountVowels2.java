/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

/**
 * Notice that the original string name is unchanged. A new, converted string is
 * returned from the toUpperCase method and assigned to the second String
 * variable nameUpper.
 *
 * @author mars
 */
public class CountVowels2 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String name, nameUpper;
        char Letter;
        int numberOfCharacters, vowelCount = 0;
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter your name");
        name = sc.next();
        nameUpper = name.toUpperCase();
        numberOfCharacters = name.length();
        for (int i = 0; i < numberOfCharacters; i++) {
            Letter = nameUpper.charAt(i);
            if (Letter == 'A'
                    || Letter == 'E'
                    || Letter == 'I'
                    || Letter == 'O'
                    || Letter == 'U') {
                vowelCount++;
            }
        }
        System.out.println(name + " your name has " + vowelCount + " vowels");
    }
}
