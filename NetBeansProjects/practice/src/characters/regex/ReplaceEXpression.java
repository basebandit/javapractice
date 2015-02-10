/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class ReplaceEXpression {

    private static final char BLANK = ' ';
    private static String modifiedSentence;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Sentence: ");
        String sentence = sc.next();
        int index, numberOfCharacters, beginIdx, endIdx;
        index = 0;
        numberOfCharacters = sentence.length();
        String word, newSentence;
        while (index < numberOfCharacters) {
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIdx = index;
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK) {
                index++;
            }
            endIdx = index;
            if (beginIdx != endIdx) {
                word = sentence.substring(beginIdx, endIdx);
                newSentence = word;
//            }
//        }
//        System.out.println(String.format("Modified Sentence: %s", newSentence));
            }
        }
    }
}
