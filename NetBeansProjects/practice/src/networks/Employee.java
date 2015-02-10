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
public class Employee {

    private String firstName;
    private String lastName;
    private int monthlySalary;

    public Employee() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        if (monthlySalary < 0) {
            return 0;
        }
        return monthlySalary;
    }

    public int raisedSalary() {
        return ((110 * monthlySalary) / 100);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
     return "Employee's name is "+getFirstName()+getLastName()+","+" whose salary is "+getMonthlySalary();
    }
}
