/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.bestpractices;

import java.util.Arrays;

/**
 *
 * @author mars
 */
public class CloneArray {
    
    private String[] weekdays;
    
    private CloneArray() {
        weekdays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    }
    
    public static CloneArray valueOf() {
        return new CloneArray();
    }
    
    public String[] getWeekdays() {
        return weekdays.clone();
    }
    
    public static void main(String[] args) {
        CloneArray myWeekend = valueOf();
        System.out.println(Arrays.toString(myWeekend.getWeekdays()));
        System.out.println(Arrays.asList(myWeekend.getWeekdays()));
    }
}
