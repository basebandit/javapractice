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
public class MyOuterClassWithStaticNestedClass {

    //Private "static" member variable of the outer class
    private static final String msgOuter = "Hello from outer class";

    //Define a "static" nested class as a member of the outer class
    //It can access private "static" variable of the outer class
    public static class MyStaticNestedClass {

        //Private variable of inner class
        private final String msgInner;

        //constructor of Inner class
        public MyStaticNestedClass(String msgInner) {
            this.msgInner = msgInner;
            System.out.println(msgOuter);
        }

        //A method of inner class
        public void printMessage() {
            System.out.println(msgInner);
        }
    }
}
