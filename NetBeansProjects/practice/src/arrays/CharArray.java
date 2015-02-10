/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author mars
 */
public class CharArray {

    public static void main(String[] args) {
        String sample = "This is just a sammple";
        char[] charArray = sample.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch + "");
        }
    }
}
