/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mars
 */
public class CustomComparator {

    //Define a Comparator<String> to order strings in case-sensitive manner
    private static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    }

// Define a Comparator<Integer> to order Integers based on the least significant digit    
    private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer s1, Integer s2) {
            return s1 % 10 - s2 % 10;
        }
    }

    public static void main(String[] args) {
        //Use a customized Comparator for Strings
        Comparator<String> compStr = new StringComparator();

        //sort and search an array of "Strings"
        String[] array = {"Hello", "Hi", "HI", "hello"};
        Arrays.sort(array, compStr);
        System.out.println(Arrays.toString(array));//[Hello,hello,Hi,HI]
        System.out.println(Arrays.binarySearch(array, "Hello", compStr));//1
        System.out.println(Arrays.binarySearch(array, "HELLO", compStr));//1 (case -insensitive)

        //Use a customized Comparator for Integers 
        Comparator<Integer> compInt = new IntegerComparator();

        //Sort and search a "List" of Integers
        List<Integer> intLst = new ArrayList<>();
        intLst.add(42);
        intLst.add(21);
        intLst.add(34);
        intLst.add(13);
        System.out.println(intLst);//[42, 21, 34, 13]
        Collections.sort(intLst, compInt);
        System.out.println(intLst);//[21,42,13,34]
        System.out.println(Collections.binarySearch(intLst, 22, compInt));//1
        System.out.println(Collections.binarySearch(intLst, 35, compInt));//-5 (insertion at index 4)
    }
}
