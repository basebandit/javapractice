/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.bestpractices;

/**
 *
 * @author mars
 */
public class Person {

    private final String firstName;
    private final String lastName;

    //private default constructor
    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Person valueOf(String firstName, String lastName) {
        return new Person(firstName, lastName);
    }

    public String getPersonName(Person aPerson) {
        String fullName = aPerson.firstName + aPerson.lastName;
        return (fullName == null ? "" : fullName);
    }

    public static void main(String[] args) {
        Person mwas = valueOf("Evanson", "Mwangi");
        System.out.println(mwas.firstName);
        System.out.println(mwas.lastName);
        Person nameless = valueOf("", "");
        System.out.println(nameless.getPersonName(nameless));
    }
}
