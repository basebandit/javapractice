/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Code to grade students.
 *
 * @author mars
 */
public class Students<E> {

    private final BufferedReader reader;
    private int size;
    private String department;
    private int marks;
    private String StudentName;
    private List<E> studsList;

    public Students() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        studsList = new ArrayList<>();
        size = 0;
        try {
            System.out.println("Enter Department Name: ");
            department = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setStudentDetails(E e) {
        System.out.println("Enter the number of students: ");
        try {
            size = reader.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void addStudent(E e) {

        for (int i = 0; i < studsList.size(); i++) {
            studsList.add(i, e);
        }
        if (studsList.size() == size || studsList.size() > size) {
            System.out.println("Can't add any more student.");
        }
    }

    private void getStudentDetails() {
        for (int i = 0; i <= studsList.size(); i++) {
            studsList.get(i);
        }
        if (studsList.size() == size || studsList.size() > size) {
            System.out.println("Can't add any more student.");
        }
    }

    private void gradeStudent(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("#######################Welcome to the Student's Grading App#########################");
        System.out.println("------------------------------------------------------------------------------------");
        Students<String> s1 = new Students<>();
        s1.addStudent("Evanson Mwangi");
        s1.getStudentDetails();
    }
}
