/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class CountWordsnJava {

    private static final Scanner sc = new Scanner(System.in);
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("We are counting how many times the word java appears in your sentence as well as the number of words.");
        System.out.println("Enter your sentence: ");
        String sentence = sc.next();
        int index, javaCount, wordCount, beginIdx, endIdx, numberOfCharacters;
        index = 0;
        String word;
        javaCount = 0;
        wordCount = 0;
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
                if (word.matches(".*java.*")||word.matches(".*JAVA.*")) {
                    javaCount++;
                }
            }
        }
        System.out.println(String.format("java count: %s", javaCount));
        System.out.println(MessageFormat.format("Word Count: {0}", wordCount));
    }
}
