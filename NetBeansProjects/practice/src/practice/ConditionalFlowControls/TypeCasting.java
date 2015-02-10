
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class TypeCasting {
    public static void main(String... args) {
        Pet p;

        p = new Dog();

        /**
         * typecast the variable p to type Dog in order to access a method
         * unique to the Dog class-fetch()
         */
        System.out.println(((Dog) p).fetch());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
