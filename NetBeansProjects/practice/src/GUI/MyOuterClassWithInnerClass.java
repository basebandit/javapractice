/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class MyOuterClassWithInnerClass {
    //private member variable of the outer class 

    private final String msgOuter = "Hello from outer class";

    public MyOuterClassWithInnerClass() {
        System.out.println("Hello am the outer class constructor");
    }

//Define an inner class as a member of the outer class
//this is merely a definition
//Note instantiation takes place when an instance of outer class is constructed
    public class MyInnerClass {

        //Private inner variable of the inner class
        public String msgInner;

        //Constructor of the inner class
        public MyInnerClass(String msgInner) {
            this.msgInner = msgInner;
            System.out.println(MessageFormat.format("Constructing an inner class instance:{0}", msgInner));
            //Can access private member of outer class
        }

        //A method of inner class
        public void printMessage() {
            System.out.println(msgInner);
        }
    }
    //Declare and construct an instance of inner class,inside the outer class
    MyInnerClass anInner = new MyInnerClass("Hi from inner class");
    //Two class files are produced:MyOuterClassWithInnerClass.class and MyOuterClassWithInnerClass$MyInnerClass.class
}
