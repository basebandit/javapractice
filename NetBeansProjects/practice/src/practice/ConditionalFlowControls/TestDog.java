
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
public class TestDog {
    public static void main(String... args) {
        Dog myDog = new Dog();

        myDog.setName("Bruno");
        System.out.println(myDog.getName() + " says: ");
        System.out.println(myDog.speak());
        System.out.println(myDog.fetch());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
