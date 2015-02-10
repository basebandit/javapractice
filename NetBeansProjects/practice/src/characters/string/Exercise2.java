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
public class Exercise2 {

    public static void main(String[] args) {
        String str = new String("World Wide Web");
        for (int i = 0; i < 10; i++) {
            if (str.charAt(i) == 'W') {
                System.out.println('M');
            } else {
                System.out.println(str.charAt(i));
            }
        }
    }
}
