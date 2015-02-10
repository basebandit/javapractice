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
public interface Visitor {

    public void visitAddNode(AddNode n);

    public void visitDivNode(DivNode n);

    public void visitMulNode(MulNode n);

    public void visitNegNode(NegNode n);

    public void visitNumNode(NumNode n);

    public void visitSubNode(SubNode n);
}
