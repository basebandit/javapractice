/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class StudentsGradingApp {
 
    public static void main(String[] args) {
        for (int student = 1; student <= 5; student++) {
            for (int mark = 1; mark <= student; mark++) {
                if (mark < 40) {
                    System.out.println("marks: "+mark + " Grade: D");
                } else if (mark > 40 & mark < 60) {
                    System.out.println("marks: "+mark + " Grade: C");
                } else if (mark > 60 & mark < 70) {
                    System.out.println("marks: "+mark + " Grade: B");
                } else if (mark > 70 & mark < 100) {
                    System.out.println("marks: "+mark + " Grade: A");
                }
                System.out.println();
            }
        }
    }
}
