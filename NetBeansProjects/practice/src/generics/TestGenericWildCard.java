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
public class TestGenericWildCard {

    public static void printList(List<Object> lst) {// accept List of Objects only, 
        // not List of subclasses of object 
        for (Object o : lst) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
   List<Object> objLst = new ArrayList<>();
   objLst.add(new Integer(55));
   printList(objLst);//matches
   
   List<String> strLst = new ArrayList<>();
   strLst.add("one");
   //printList(strLst);//compilation error..Incompatible types
    }
}
