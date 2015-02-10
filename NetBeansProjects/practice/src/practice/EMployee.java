/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import static java.lang.System.out;
/**
 *
 * @author mars
 */
public class EMployee {

    private String name;
    private String jobTitle;

    public EMployee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getjobTitle() {
        return jobTitle;
    }
    public void cutCheck(double amountPaid){
     out.printf("pay to the order of %s ",name);
     out.printf("(%s) ***$",jobTitle);
     out.printf("%,.2f\n", amountPaid);
    }
}
