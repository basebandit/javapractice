/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Here’s how to replace all vowels in the string with the @ symbol:
 *
 * @author mars
 */
public class ReplaceVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalWord = new String("Theodore");
        String modifiedWord = originalWord.replaceAll("[aeiou]", "@");
        System.out.println(MessageFormat.format("Original Word:{0}", originalWord));
        System.out.println(String.format("Modified word:%s", modifiedWord));
    }
}
