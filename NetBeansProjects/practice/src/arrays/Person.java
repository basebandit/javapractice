/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author mars
 */
public class Person {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Person[] person = new Person[6];
    private String name;
    private int age;
    private char gender;

    public Person() {
        name = null;
        age = 0;
    }

    private void setName(String NewName) {
        this.name = NewName;
    }

    private void setAge(int NewAge) {
        this.age = NewAge;
    }

    private void setGender(char NewGender) {
        this.gender = NewGender;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private char getGender() {
        return gender;
    }

    public static void main(String[] args) {
        personDetails();
    }

    public static void personDetails() {
        while (true) {
            try {
                for (int i = 0; i < person.length; i++) {
                    System.out.println("Enter Name: ");
                    String name = reader.readLine();
                    System.out.println("Enter Age: ");
                    int age = Integer.parseInt(reader.readLine());
                    System.out.println("Enter Gender: ");
                    String inputGndr = reader.readLine();
                    char gender = inputGndr.charAt(0);
                    person[i] = new Person();
                    person[i].setName(name);
                    person[i].setAge(age);
                    person[i].setGender(gender);
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid Entry..Try Again");
            }
        }
    }
    public void getDetails(){
     
    }

}
