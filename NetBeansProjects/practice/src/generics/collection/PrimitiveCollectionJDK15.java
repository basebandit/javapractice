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
 *
 * @author mars
 */
public class PrimitiveCollectionJDK15 {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();

        //Add 10 random primitive int into the List
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            lst.add(random.nextInt(10));
        }
        System.out.println(lst);

        //Traverse using Iterator
        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            System.out.print(i + " ");
        }
        System.out.println();
        //Traverse using enhanced for-loop
        for (int i : lst) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Traverse via for-loop using List's index
        for (int i = 0; i < lst.size(); i++) {
            int j = lst.get(i);
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
