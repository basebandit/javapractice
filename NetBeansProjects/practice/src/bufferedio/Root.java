/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedio;

/**
 *
 * @author mars
 */
public class Root {

    public static void main(String[] args) {
        int i = 4;
        double r = Math.sqrt(i);
        System.out.print("Square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println(".");
        i = 5;
        r = Math.sqrt(i);
        System.out.format("The square root of %d is %f%n", i, r);
    }
}
