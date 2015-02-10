/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        int num = 50;
        while (i < 10) {
            num--;
            i++;
        }
        System.out.println(MessageFormat.format("Loop stopped at i = {0} and num = {1}", i, num));
    }
}
