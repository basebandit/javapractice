/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 * The code below shows a tighter coupling between strategies and their context.
 * The Context class stores a strategy when it is created,provides a method to
 * subsequently change the strategy and provides another method to execute the
 * current strategy
 *
 * @author mars
 */
public class Context {

    private Strategy strategy;//A reference to Strategy

    public Context(Strategy strategy) {
        setStrategy(strategy);
    }

    public void executeStrategy(int x) {
        strategy.execute(x);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
