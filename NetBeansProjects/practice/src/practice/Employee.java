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
public class Employee {

    String name, address;
    int SocialSecurityNo, totals;

    /**
     * Superclass constructor
     */
    public Employee() {

    }

    public static void main(String[] args) {
        Employee emp = getEmployeeNumber();
        String msg;
        try {
            if (emp instanceof SalariedEmployee) {
                msg = "The employee\'s salary is ";
                msg += String.valueOf(((SalariedEmployee) emp).getFormattedSalary());
            } else {

                msg = "The employee\'s rate is";
                msg += String.valueOf(((HourlyEmployee) emp).getFormattedRate());
            }
            System.out.println(msg);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    protected static Employee getEmployeeNumber() {
        int number = (int) (Math.random() * 3) + 1;
        Employee type = null;
        if (number == 1) {
            type = (Employee) new SalariedEmployee();
        } else if (number == 2) {
            type = (Employee) new HourlyEmployee();
        }
        return type;
    }

}
