/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designpatterns.visitorpattern;

/**
 *
 * @author mars
 */
public interface Node {
    boolean accept(Visitor v);
    String getName();
}
