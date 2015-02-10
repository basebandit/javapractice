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
public class HourlyEmployee extends Employee {

    private final int weeklySchedule =1590, hourlyPayRate = 1300;
   
    public HourlyEmployee() {

    }
   

    protected String getFormattedRate() {
return (java.text.NumberFormat.getCurrencyInstance().format(hourlyPayRate));    }

}
