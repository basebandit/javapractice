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
public class TestInnerClass {

    public static void main(String[] args) {
        //Construct an instance of outer class,which creates anInner implicitly
        MyOuterClassWithInnerClass anOuter = new MyOuterClassWithInnerClass();
        //Invoke inner class's method from this inner class
        anOuter.anInner.printMessage();
        //Explicitly construct an instance of inner class, under another instance of outer class
        //MyOuterClassWithInnerClass.MyInnerClass inner3 = new MyOuterClassWithInnerClass().new MyInnerClass("Inner class3");
    }
}
