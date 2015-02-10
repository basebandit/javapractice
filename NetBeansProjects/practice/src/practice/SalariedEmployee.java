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
public class SalariedEmployee extends Employee {

    private final int annualSalary = 1200, benefitPlan = 30000;

    public SalariedEmployee() {

    }

    /**
     *
     * @return
     */
    protected  String getFormattedSalary() {
        return (java.text.NumberFormat.getCurrencyInstance().format(annualSalary));
    }



}
