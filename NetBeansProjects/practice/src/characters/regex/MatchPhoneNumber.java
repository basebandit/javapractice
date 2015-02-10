/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class MatchPhoneNumber {

    private static final String STOP = "0";
    private static final String VALID = "Valid phone number";
    private static final String INVALID = "Not a valid phone number";
    private static final String VALID_PHONE_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneStr, reply;
        while (true) {
            System.out.println("Phone#: ");
            phoneStr = sc.next();
            if (phoneStr.equals(STOP)) {
                break;
            }
            if (phoneStr.matches(VALID_PHONE_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(String.format("%s: %s\n", phoneStr, reply));
        }
    }
}
