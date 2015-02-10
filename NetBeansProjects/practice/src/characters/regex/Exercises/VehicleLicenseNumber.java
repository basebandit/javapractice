/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex.Exercises;

/**
 *
 * @author mars
 */
public class VehicleLicenseNumber {

    private static final String VALID_LICENSE_NUMBER = "[A-Z][0-9]{3}[a-z]{4}";

    public static void main(String[] args) {
        String myLicense = new String("E016mars");
        System.out.println(String.format("License Number:%s", myLicense));
        if (myLicense.matches(VALID_LICENSE_NUMBER)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
}
