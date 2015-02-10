/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mars
 */
public class TestGenericUnknownTypeWildCard {

    public static void printList(List<? extends Number> lst) {
        for (Object o : lst) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> strlst = new ArrayList<>();
        strlst.add(new String("This is awesome..i guess i love"));
        strlst.add(new String("generics"));
       // printList(strlst);//Compilation error --incompatible type..String does not extend Number therefore 
        //can't be converted(upcasted) to a Number type
        
        List<Integer> intLst = new ArrayList<>();
        intLst.add(new Integer(1));
        intLst.add(Integer.SIZE);
        printList(intLst);
    }
}
