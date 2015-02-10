/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class GuessGame {

//    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    public static void main(String args[]) throws java.io.IOException {
        //note that only the last variable is initialized i.e answer
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it:");
        ch = (char) System.in.read(); //read a char from the keyboard
        if (ch == answer) {
            System.out.println("***Right***");
        } else {
            System.out.println("....Sorry, you are wrong.");
        }
    }
}
