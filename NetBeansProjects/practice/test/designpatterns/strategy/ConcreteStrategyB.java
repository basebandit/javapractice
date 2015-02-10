/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 *
 * @author mars
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void execute(int x) {
        System.out.println("executing strategy B: x = " + x);
    }
}
