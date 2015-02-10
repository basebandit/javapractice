/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mars
 */
public class Test1 {

    public static void main(String[] args) {
        OuterClass oc = new OuterClass(4);
        OuterClass.Inner1 i1 = oc.new Inner1();
        i1.f1();
        oc.f();
    }
}
