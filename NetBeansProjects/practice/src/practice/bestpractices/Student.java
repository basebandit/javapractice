/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.bestpractices;

import java.util.Date;

/**
 * Defensive copies are savior
 *
 * Defensive copies are the clone objects created to avoid mutation of an
 * object. For example in below code we have defined a Student class which has a
 * private field birth date that is initialized when the object is constructed.
 *
 * @author mars
 */
public class Student {

    private Date birthDate;

    public Student(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }
//Now we may have some other code that uses the Student object.

    public static void main(String[] args) {
        Date birthDate = new Date();
        Student student = new Student(birthDate);

        birthDate.setYear(2017);

        System.out.println(student.getBirthDate());
        System.out.println(student.getBirthDate().getYear());
    }
}
