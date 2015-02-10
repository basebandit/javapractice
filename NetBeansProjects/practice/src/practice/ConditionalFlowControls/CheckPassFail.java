
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author mars
 */
public class CheckPassFail {
    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Enter mark");

        int mark = getInput();    // set the value of mark here!

        System.out.println("The mark is " + mark);

        if (mark > 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static int getInput() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid Mark!Try Again...");
            }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
