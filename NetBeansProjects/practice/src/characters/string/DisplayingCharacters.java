/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.string;

/**
 *
 * @author mars
 */
public class DisplayingCharacters {

    public static void main(String[] args) {
        String name = "Evanson.";
        int size = name.length();
        for (int i = 0; i < size; i++) {
            System.out.println(name.charAt(i));
        }
    }
}
