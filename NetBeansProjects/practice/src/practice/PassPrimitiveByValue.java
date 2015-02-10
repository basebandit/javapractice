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
public class PassPrimitiveByValue {

    public static void main(String... args) {
        int x = 3;

        //invoke passMethod() with x as argument
        passMethod(x);

        //print x to see if its value has changed
        System.out.println("After invoking passMethod x = " + x);
    }

    //Change parameter in passMethod()
    public static void passMethod(int p) {
        p = 10;
    }
}
