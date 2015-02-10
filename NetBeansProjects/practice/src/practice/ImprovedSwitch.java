/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mars
 */
public class ImprovedSwitch {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String translateDay;

    public static void main(String[] args) {

        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            System.out.println(day);
        }
        System.out.println("Choose any day of the week that you wish to translate to French: ");
        try {
            translateDay = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String day : days) {
            if (translateDay.equalsIgnoreCase(day)) {
                printDay(translateDay);
            }
        }
    }

    private static void printDay(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Sunday":
                System.out.println("Dimanche");
                break;
            case "Monday":
                System.out.println("Lundi");
                break;
            case "Tuesday":
                System.out.println("Mardi");
                break;
            case "Wednesday":
                System.out.println("Mercredi");
                break;
            case "Thursday":
                System.out.println("Jeudi");
                break;
            case "Friday":
                System.out.println("Vendredi");
                break;
            case "Saturday":
                System.out.println("Samedi");
                break;
            default:
                System.out.println("Error '" + dayOfWeek + "'is not a day of the week");
                break;
        }
    }
}
