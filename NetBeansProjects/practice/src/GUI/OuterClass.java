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
public class OuterClass {

    private int value;

    public OuterClass(int value) {
        this.value = value;
    }

    public class Inner1 {

        private final int value = 1000;//hides the outer member

        public void f1() {
            //accesses outer members when hidden
            System.out.println(getClass().getName() + ": " + ++OuterClass.this.value);
        }
    }

    private class Inner2 {

        public void f2() {
            //accesses outer members directly
            System.out.println(getClass().getName() + ": " + ++value);
        }
    }

    public void f() {
        System.out.println(getClass().getName() + ": " + ++value);
        Inner2 i2 = new Inner2();
        i2.f2();
    }
}
