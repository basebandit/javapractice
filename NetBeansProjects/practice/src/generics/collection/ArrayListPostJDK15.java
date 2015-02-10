/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mars
 */
public class ArrayListPostJDK15 {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);//prints out all the elemnts in the list in [] manner.
        List<Integer> intLst = new ArrayList<>();
        intLst.add(10);
        intLst.add(20);
        intLst.add(30);
        System.out.println(intLst);

        //Traverse list using an iterator
        Iterator<String> iter = lst.iterator();
        while (iter.hasNext()) {
            String str = iter.next();//downcast to String,auto-unbox 
            System.out.println(str);
        }

        Iterator<Integer> intIter = intLst.iterator();
        int sum = 0;
        while (intIter.hasNext()) {
            int i = intIter.next();
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
        //Traverse list using an Enhanced for-loop
        for (String str : lst) {
            System.out.println(str);
        }

    }
}
