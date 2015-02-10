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
public class AddNode extends BinNode {

    @Override
    public void accept(Visitor v) {
        v.visitAddNode(this);
    }

    @Override
    public String getName() {
        return "+";
    }
}
