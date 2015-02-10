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
public class MyOuterClass {

    private String name;

    public MyOuterClass(String name) {
        this.name = name;
        System.out.println(String.format("Hello from the %s constructor ", name));
        System.out.println(getClass().getName());
    }

    public class MyInnerClass {

        private final String name = "InnerClass";

        public MyInnerClass() {
            System.out.println(String.format("Hello from the %s constuctor ", name));
            System.out.println(getClass().getName());
        }
    }

    private class MyInnerClass2 {

        public MyInnerClass2(String name) {
            System.out.println(String.format("Hello from the %s constructor", name));
            System.out.println(getClass().getName());
        }
    }
    MyInnerClass2 ic2 = new MyInnerClass2("InnerClass2");
    MyInnerClass ic = new MyInnerClass();
}
