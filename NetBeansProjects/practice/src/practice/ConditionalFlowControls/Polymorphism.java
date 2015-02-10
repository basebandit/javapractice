
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 * polymorphism-same variable can be used to refer to different instances.
 *
 * @author mars
 */
public class Polymorphism {
    public static void main(String[] args) {
        Pet p;

        p = new Dog();
        System.out.println(p.speak());
        p = new Cat();
        System.out.println(p.speak());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
