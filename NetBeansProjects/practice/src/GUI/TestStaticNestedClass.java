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
public class TestStaticNestedClass {

    public static void main(String[] args) {
        //Construct an instance of static nested class
        //A "static" nested class,like other "static" members,can be accessed via
        //the classname.membername
        MyOuterClassWithStaticNestedClass.MyStaticNestedClass aNestedInner = new MyOuterClassWithStaticNestedClass.MyStaticNestedClass("Hi from inner class");
        aNestedInner.printMessage();
    }
}
