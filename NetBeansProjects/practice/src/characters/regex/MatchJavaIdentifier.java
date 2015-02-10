/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

import java.util.Scanner;

/**
 * Checks whether the input string is a valid identifier
 *
 * @author mars
 */
public class MatchJavaIdentifier {

    private static final String STOP = "STOP";
    private static final String VALID = "Valid java identifier";
    private static final String INVALID = "Not a valid java identifier";
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, reply;
        while (true) {
            System.out.println("Identifier: ");
            str = sc.next();
            if (str.equals(STOP)) {
                break;
            }
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(String.format("%s: %s\n", str, reply));
        }
    }
}
