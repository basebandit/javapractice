
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class Employee {

    private static final int number = (int) (Math.random() * 2) + 1;
    private static String msg;
    private String names;
    private int address;
    private int SocialSecurityNo;
    private int annualTotal;
    private int taxWithheld;

    /**
     *
     */
    protected Employee() {
    }

    protected static Employee getEmployee() {
        if (number == 1) {
            Employee emp = new SalariedEmployee();

            return emp;
        } else {
            Employee emp = new HourlyEmployee();

            return emp;
        }
    }

    protected static void FormatedSalary() {
        Employee emp = getEmployee();

        if (emp instanceof SalariedEmployee) {
            msg = "The employee's salary is ";
            msg += ((SalariedEmployee) emp).getFormattedSalary();
        } else {
            msg = "The employee's salary is ";
            msg += ((HourlyEmployee) emp).getFormattedSalary();
        }

        System.out.println(msg);
    }

    public static void main(String[] args) {
        FormatedSalary();
    }
}


