
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
public class Author {
    private final String name;
    private String       email;
    private final char   gender;

    public Author(String name, String email, char gender) {
        this.name   = name;
        this.email  = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name + " (" + gender + ")" + " at " + email;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
