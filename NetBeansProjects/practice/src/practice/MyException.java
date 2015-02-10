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
public class MyException {

    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception e) {
            System.err.println("Exception!");
        }
    }

    public static void doSomething(boolean t) throws Exception {
        if (t) {
            throw new Exception();
        }
    }
}
