/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author mars
 */
public class GradingStudents {

    public static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Enter Your Mark:");
        int mark = getMark();
        if ((mark >= 69) && (mark <= 100)) {
            System.out.println("Grade: " + "A");
        } else if ((mark >= 60) && (mark < 69)) {
            System.out.println("Grade: " + "B");
        } else if ((mark >= 50) && (mark < 60)) {
            System.out.println("Grade: " + "C");
        } else if ((mark >= 40) && (mark < 50)) {
            System.out.println("Grade: " + "D");
        } else if (mark < 40) {
            System.out.println("Grade: " + "E");
        }

    }

    public static int getMark() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.err.println("Invalid marks!Try Again...");
            }
        }
    }
//    public static int getSubject(){
//    while(true){
//     try{
//      return Integer.parseInt(reader.readLine());
//     }catch(IOException | NumberFormatException e){
//      System.err.println("Invalid entry.");
//     }
//    }
//    }
}
