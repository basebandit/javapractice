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
public class ArrayListPreJDK15 {

    private static void printList(List lst) {
        for (Object o : lst) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add(new Integer(12));//adds an a integer,implicitly upcast to Object,okay in compile/runtime
        lst.add("mwas");
        lst.add(new Double(15.66));//adds an a double,implictly upcast to Object,okay in compile/runtime

//        for (int i = 0; i < lst.size(); i++) {
//            printList(lst);
//        }
        Iterator iter = lst.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();//compile okay but runtime ClassCastException
            System.out.println(str);
        }
    }
}
