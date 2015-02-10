
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mars
 */
public class UndergraduateStudent extends Student {
    public void computeCourseGrade() throws IOException {
        int            total;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Your Total Marks: ");
        total = Integer.parseInt(reader.readLine());

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }

        if (total / NUM_OF_TESTS >= 70) {
            courseGrade = "Pass";
            System.out.println(courseGrade);
        } else {
            courseGrade = "No Pass";
            System.out.println(courseGrade);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
