/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class StringProcessing {

    public static void main(String[] args) {
        String fullName, firstName, middleName, lastName, space;
//       Scanner sc = new Scanner(System.in);
//       sc.useDelimiter(System.getProperty("line.separator"));
//        System.out.println("Enter your full name: ");
//        fullName = sc.next();
//        System.out.println(MessageFormat.format("Name entered:{0} ", fullName));
//        space = new String(" ");
//        firstName = fullName.substring(0, fullName.indexOf(space));
//        System.out.println(String.format("FirstName: %s", firstName));
//        lastName = fullName.substring(fullName.charAt(fullName.indexOf(space)), fullName.length());
//        System.out.println(String.format("Last Name:%s", lastName));
//        middleName = fullName.substring(fullName.indexOf(space), fullName.indexOf(space+2));
//        System.out.println(MessageFormat.format("MiddleName:{0}", middleName));
//        System.out.println(String.format("Full Name: %s", fullName));
//        System.out.println("Your last name has " + lastName.length() + " characters");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter your full name");
        fullName = sc.next();
        space = new String(" ");
        
        
    }
}
