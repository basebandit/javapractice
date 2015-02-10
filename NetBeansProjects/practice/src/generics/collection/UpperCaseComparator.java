/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.Arrays;

/**
 *
 * @author mars
 */
public class UpperCaseComparator {

    private static class StringComparator implements java.util.Comparator<String> {

        @Override
        // Returns a negative integer, zero, or a positive integer 
        // as this object is less than, equal to, or greater than the given object
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }

    public static void main(String[] args) {
        String[] array = {"a", "A", "B", "c", "C", "b", "E", "e", "d", "D"};
        java.util.Comparator compStr = new StringComparator();
        Arrays.sort(array, compStr);
        System.out.println(Arrays.toString(array));
    }
}
