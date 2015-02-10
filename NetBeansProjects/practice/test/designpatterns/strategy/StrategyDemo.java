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
public class StrategyDemo {
    
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy(1);
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(2);
    }
}
