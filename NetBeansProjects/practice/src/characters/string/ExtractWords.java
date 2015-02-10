/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

import java.util.Scanner;

/**
 * Extract the words in a given sentence and print them, using one line per
 * word.
 *
 * @author mars
 */
public class ExtractWords {

    private static Scanner sc = new Scanner(System.in);
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter sentence: ");
        String sentence = sc.next();
        int index, beginIdx, endIdx, numberOfCharacters;
        String word;
        numberOfCharacters = sentence.length();
        index = 0;
        while (index < numberOfCharacters) {
            //locates the beginning of the sentence and ignores leading blank spaces
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIdx = index;
            //locate the end of the sentence
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK) {
                index++;
            }
            endIdx = index;
            //extracct
            if (beginIdx != endIdx) {
                word = sentence.substring(beginIdx, endIdx);
                System.out.println(word);
            }
        }
    }
}
