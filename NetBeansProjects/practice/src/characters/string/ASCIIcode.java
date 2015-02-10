/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package characters.string;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class ASCIIcode {
    public static void main(String[] args){
     char ch1,ch2 = 'X';
        System.out.println(String.format("ASCII code of Character %s is %s", ch2, (int) ch2));
        System.out.println(MessageFormat.format("Character with ASCII code 88 is {0}", (char) 88));
    }
}
