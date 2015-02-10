/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

/**
 *
 * @author mars
 */
public class Console {

    private static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        String ch;
        System.out.println("Enter some text.(type a period to quit)");
        ch = sc.next();
        int index = 0;

        for (int i = 0; i <= ch.indexOf("."); i++) {
            index = i;
        }
        //System.out.println(ch.charAt(index));
        int mystrlen = ch.length() - index;

        String newch = ch.substring(0, ch.length() - mystrlen);
        do {
            if (newch.equals(newch.toUpperCase())) {
                newch = newch.toLowerCase();
            } else {
                newch = newch.toUpperCase();
            }
            System.out.println(newch);
        } while (ch.charAt(index) != '.');
    }
}
