/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.util.Scanner;

/**
 * We override the default delimiter by calling the useDelimiter
 * method and pass the appropriate argument.
 * 
 * When we use the class method getProperty of the System class to retrieve
 * the actual sequence of characters for the enter key that is specific to 
 * the platform which our program is running.For windows platform we can call
 * the useDelimiter method as  Scanner.useDelimiter("\r\n");
 * 
 * @author mars
 */
public class Delimiter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName;
        String lineSeparator = System.getProperty("line.separator");
        sc.useDelimiter(lineSeparator);
        System.out.println("Enter your full name(first,middle,last):");
        fullName = sc.next();
        System.out.println("Name entered: " + fullName);
    }
}
