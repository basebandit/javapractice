
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

//~--- JDK imports ------------------------------------------------------------

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class GraduateStudent extends Student {
    public void computeCourseGrade() {
        int     total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Total Marks: ");
        total = sc.nextInt();

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }

        if (total / NUM_OF_TESTS >= 80) {
            courseGrade = "Pass";
            System.out.println(courseGrade);
        } else {
            courseGrade = "No Pass";
            System.out.println(courseGrade);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
