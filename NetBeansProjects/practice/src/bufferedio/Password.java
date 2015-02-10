/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedio;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

/**
 *
 * @author mars
 */
public class Password {

    static char[] newPassword1;
    static char[] newPassword2;

    public static void main(String[] args) throws IOException {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console");
            System.exit(1);
        }
        String login = c.readLine("Enter login: ");
        char[] oldPassword = c.readPassword("Enter your old password: ");
        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                newPassword1 = c.readPassword("Enter new password: ");
                newPassword2 = c.readPassword("Enter new password again: ");
                noMatch = !Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    System.err.println("Passwords don't match..Try again.%n");
                } else {
                    change(login, newPassword1);
                    c.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }
        Arrays.fill(oldPassword, ' ');
    }

    static boolean verify(String login, char[] password) {
        // This method always returns
        // true in this example.
        // Modify this method to verify
        // password according to your rules.
//        for (int i = 0; i < login.length(); i++) {
//          if (login.charAt(i) == password[i]) {
//                return true;
//            } else {
//                System.out.println("Passwords do not match!!");
//                return false;
//            }
//        }
        return true;
    }

    static void change(String login, char[] password) {
        login = String.valueOf(newPassword1);
    }
}
