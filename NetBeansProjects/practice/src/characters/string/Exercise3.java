/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

/**
 * Write a loop that prints out a string in reverse. If the string is Hello,
 * then the code outputs olleH.
 *
 * @author mars
 */
public class Exercise3 {

    public static void main(String[] args) {
        String word = "Hello";
        int index = word.length() - 1;
        for (int i = index; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
