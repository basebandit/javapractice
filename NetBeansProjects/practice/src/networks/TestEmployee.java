/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks;

/**
 *
 * @author mars
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee SnEmployee = new Employee();
        Employee JnEmployee = new Employee();

        SnEmployee.setFirstName("Evanson");
        System.out.println(SnEmployee.getFirstName());
        SnEmployee.setLastName("Mwangi");
        System.out.println(SnEmployee.getLastName());
        SnEmployee.setMonthlySalary(500000);
        System.out.println(SnEmployee.getMonthlySalary());
        System.out.println(SnEmployee);
        JnEmployee.setFirstName("Kelly");
        System.out.println(JnEmployee.getFirstName());
        JnEmployee.setLastName("Rowland");
        System.out.println(JnEmployee.getLastName());
        JnEmployee.setMonthlySalary(100000);
        System.out.println(JnEmployee.getMonthlySalary());
        System.out.println(JnEmployee);
    }
}
