/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class NiceToMeetYou {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yourname;
        String lineSeparator = System.getProperty("line.separator");
        sc.useDelimiter(lineSeparator);
        System.out.println("What are your names? ");
        yourname = sc.next();
        System.out.println("Welcome " + yourname + ", Nice to meet you");
    }
}
