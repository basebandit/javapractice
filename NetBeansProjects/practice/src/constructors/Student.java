/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author mars
 */
public class Student {

    //Data members
    private String name;
    private String email;

    //Constructor
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
    }

    //Returns the email of this Student
    public String getEmail() {
        return email;
    }

    //Returns the name of this Student
    public String getName() {
        return name;
    }

    //Assigns the email of this student
    public void setEmail(String address) {
        email = address;
    }

    //Assigns the name of this Student
    public void setName(String studentName) {
        name = studentName;
    }
}
