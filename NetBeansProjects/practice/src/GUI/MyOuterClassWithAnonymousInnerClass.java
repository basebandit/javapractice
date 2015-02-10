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
public class MyOuterClassWithAnonymousInnerClass {

    //private member variable of the outer class
    private String msgOuter = "Hello from outer class";

    //A member method of the outer class
    public void doSomething() {
        //A local variable of the method
        final String msgMethod = "Hello from method";

        Thread thread = new Thread() {// create an instance of an anonymous inner class that extends Thread class
            @Override
            public void run() {
                 //can access private member variable of outer class
                System.out.println("Constructing an inner class instance: " + msgOuter);
                //can access final member variable of the enclosing method since it is final.
                System.out.println("Accessing final variable of the method: "+msgMethod);
            //can access final variable of the method
                System.out.println("Hi,from inner class");
            }
        };
        thread.start();
    }
    //Test main() method
    public static void main(String[] args){
    //create an instanced of the outer class and invoke the method.
        new MyOuterClassWithAnonymousInnerClass().doSomething();
    }
}
