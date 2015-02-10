/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class MaxorMin {

    private static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Construct a sentence using the words maximum and minimum in it: ");
        String sentence = sc.next();
        String word;
        int index, wordCount, numberOfCharacters, beginIdx, endIdx, max_min_Count;
        index = 0;
        wordCount = 0;
        max_min_Count = 0;
        numberOfCharacters = sentence.length();
        while (index < numberOfCharacters) {
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIdx = index;
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK) {
                index++;
            }
            endIdx = index;
            wordCount++;
            if (beginIdx != endIdx) {
                word = sentence.substring(beginIdx, endIdx);
                if (word.matches("(max|min)imum")) {
                    max_min_Count++;
                }
            }
        }
        System.out.println(String.format("Word Count:%s", wordCount));
        System.out.println(MessageFormat.format("Maximum/minimum Count{0}", max_min_Count));
    }
}
