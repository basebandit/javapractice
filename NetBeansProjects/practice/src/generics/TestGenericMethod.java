/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author mars
 */
public class TestGenericMethod {

    public static <E> void ArraytoArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) {
            lst.add(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        
        Integer[] intArray ={55,66};//autobox 
        ArraytoArrayList(intArray,lst);
        for(Integer i:lst)System.out.println(i);
        
        String[] strArray = new String[]{"one","two","three"};
//        ArraytoArrayList(strArray,lst);
//        TestGenericMethod.<String>ArraytoArrayList(strArray, lst);//compilation Error incompatible types
        //as ArrayList<String> is not an ArrayList<Object>
    }
}
