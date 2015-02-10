/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mars
 */
public class StudentDetails {

    static Scanner sc = new Scanner(System.in);

    /**
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String... args) throws IOException {
        String Grade;
        int totalMark = 0;
        double averageMark;

        String[] name = new String[20];
        int[] age = new int[20];
        int[] mark = new int[20];
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter name of student " + i);
            name[i] = sc.next();
            System.out.println("Enter age of the student");
            age[i] = sc.nextInt();
            System.out.println("Enter mark of the student");
            mark[i] = sc.nextInt();
            totalMark += mark[i];
        }
        for (int j = 1; j <= 3; j++) {
            if (mark[j] < 40) {
                System.out.println("marks: " + mark + " Grade: D");
            } else if (mark[j] > 40 & mark[j] < 60) {
                System.out.println("Student" + j + name[j] + " has: " + mark[j] + " marks of Grade: C");
            } else if (mark[j] > 60 & mark[j] < 70) {
                System.out.println("Student" + j + name[j] + " has: " + mark[j] + "marks of Grade: B");
            } else if (mark[j] > 70 & mark[j] < 100) {
                System.out.println("Student" + j + name[j] + " has: " + mark[j] + " marks ofGrade: A");
            }
        }
        averageMark = totalMark / 3;
        JOptionPane.showMessageDialog(null, String.format("Total Mark: %sand an Average Mark  %s", totalMark, averageMark));
        // System.out.println(String.format("Average Mark %s", averageMark));
    }
}
