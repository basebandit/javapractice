/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

import java.text.MessageFormat;

/**
 * This time we read in a string and count how many words the string contains.
 * For this example we consider a word as a sequence of characters separated, or
 * delimited, by blank spaces. We treat punctuation marks and other symbols as
 * part of a word. Expressing the task in pseudocode, we have the following:
 *
 * read in a sentence; while (there are more characters in the sentence) { look
 * for the beginning of the next word; now look for the end of this word;
 * increment the word counter; }
 *
 * @author mars
 */
public class CountWords {

    private final static java.util.Scanner sc = new java.util.Scanner(System.in);
    private static final char blank = ' ';

    public static void main(String[] args) {
        sc.useDelimiter(System.getProperty("line.separator"));
        int index, wordCount, numberOfCharacters;
        System.out.println("Enter a sentence");
        String sentence = sc.next();
        numberOfCharacters = sentence.length();
        index = 0;
        wordCount = 0;
        while (index < numberOfCharacters) {
            //ignore blank spaces
            while (index < numberOfCharacters && sentence.charAt(index) == blank) {
                index++;
            }
            // now locate the end of the sentence.
            while (index < numberOfCharacters && sentence.charAt(index) != blank) {
                index++;
            }
            wordCount++;
        }
        System.out.println("number of characters: " + numberOfCharacters);
        System.out.println(MessageFormat.format("\ninput sentence: {0}", sentence));
        System.out.println("  Word Count: " + wordCount + " words");
    }
}
