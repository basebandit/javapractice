/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 * Strategy pattern lets you avoid using multiple conditional statements by
 * moving conditional branches into their own strategy classes.These classes are
 * often derived from an abstract superclass,which the client references and
 * uses to interact with a specific strategy.
 *
 * @author mars
 */
public interface Strategy {

    //void execute(int x)must be executed by all concrete strategies
    public void execute(int x);
}
