/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 * Each ConcreteStrategyx implements the common interface and provides an
 * algorithm implementation.
 *
 * @author mars
 */
public class ConcreteStrategyA implements Strategy {

    /**
     * Think of this method as an abstraction for something more useful,like a
     * specific kind of sorting algorithm(e.g Bubble Sort,Insertion Sort or
     * Quick Sort) or a specific kind of layout manager(e.g Flow
     * Layout,BorderLayout, or GridLayout)
     */
    @Override
    public void execute(int x) {
        System.out.println("executing strategy A: x =" + x);
    }
}
