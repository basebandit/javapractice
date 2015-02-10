
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author mars
 */
public class TestBothStudents {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student category: " + "(Graduate Student/Undergraduate Student)");

        String studentCategory = sc.nextLine();

        if (studentCategory.equalsIgnoreCase("Graduate Student")) {
            GraduateStudent gs = new GraduateStudent();

            gs.computeCourseGrade();
        } else if (studentCategory.equalsIgnoreCase("Undergraduate Student")) {
            UndergraduateStudent us = new UndergraduateStudent();

            us.computeCourseGrade();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
