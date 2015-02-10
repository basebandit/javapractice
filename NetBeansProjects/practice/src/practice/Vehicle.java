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
public class Vehicle {

    private final double weight;

    public Vehicle(double weight) {
        this.weight = weight;
        System.out.println("This vehicle weighs "+weight+"kgs.");
    }
}
