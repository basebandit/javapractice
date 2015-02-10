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
public class MyOuterClassWithLocalInnerClass {

    //Private member variable of the outer class
    private String msgOuter = "Hello from outer class";

    //A membber of the outer class
    public void doSomething() {

        //A local variable of the method
        final String msgMethod = "Hello from method";

        //Define a local inner class inside the method
        class MyInnerClass {

            //Private variable of the inner class
            private String msgInner;

            //Constructor of the inner class
            public MyInnerClass(String msgInner) {
                this.msgInner = msgInner;
                //can access private member variable of outer class
                System.out.println("Constructing an inner class instance: " + msgOuter);
                //can access final variable of the method
                System.out.println("Accessing final member of the method: " + msgMethod);

            }

            //A method of inner class
            public void printMessage() {
                System.out.println(msgInner);
            }
        }
        //create an instance of the inner class and invoke its method
        MyInnerClass anInner = new MyInnerClass("Hi from inner class");
        anInner.printMessage();
    }

    public static void main(String[] args) {
        //Create an instance of the outer class and invoke  the method
        new MyOuterClassWithLocalInnerClass().doSomething();
    }
}
