
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
public class TestCat {
    public static void main(String... args) {
        Cat myCat = new Cat();

        myCat.setName("pussy");
        System.out.println("Hi my name is " + myCat.getName());
        System.out.println(myCat.getName() + " says:");
        System.out.println(myCat.speak());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
