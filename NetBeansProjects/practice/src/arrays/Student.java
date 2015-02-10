/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.text.MessageFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author mars
 */
public class Student {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        double sum = 0.0;
        String[] student = new String[20];
        int[] mark = new int[20];
        for (int i = 1; i <= 20; i++) {
            JOptionPane.showInputDialog("Enter name of Student");
            student[i] = getStudent("evanson");
            JOptionPane.showInputDialog("Enter mark scored:");
            mark[i] = getMark(0);
        }

        for (int i = 0; i < 20; i++) {
            JOptionPane.showMessageDialog(null, "Student at position " + i + "is" + student[i]);
        }
    }

    public static int getMark(int mark) {
        while (true) {
            try {
                mark = Integer.parseInt(reader.readLine());
                return mark;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "That's not an integer");
            }
        }
    }

    public static String getStudent(String student) {
        while (true) {
            try {
                student = reader.readLine();
                return student;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Invalid entry!1Try again");
            }
        }
    }
}
