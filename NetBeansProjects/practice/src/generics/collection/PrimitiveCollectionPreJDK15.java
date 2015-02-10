/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.List;

/**
 * Pre-JDK 1.5 does not support generics, auto-boxing and for-each loop.
 *
 * @author mars
 */
public class PrimitiveCollectionPreJDK15 {

    public static void main(String[] args) {
        List lst = new ArrayList();

        //Add 10 random primitive int into the list
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            //wrap the primitive int into Integer,upcast to Object
            lst.add(new Integer(random.nextInt(10)));
        }
        System.out.println(lst);

        //Traverse using Iterator
        Iterator iter = lst.iterator();
        while (iter.hasNext()) {
            //Explicit downcast to Integer,then unwrap to int 
            int i = ((Integer) iter.next()).intValue();
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
