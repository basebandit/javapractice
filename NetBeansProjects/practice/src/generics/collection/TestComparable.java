/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The default Comparable of String compares two Strings based on their
 * underlying Unicodes, i.e., uppercase letter is smaller than the lowercase
 * counterpart.
 *
 * @author mars
 */
public class TestComparable {

    public static void main(String[] args) {
//sort and search an "array" of Strings
        String[] array = new String[]{"Hello", "hello", "Hi", "HI"};

        //Use the Comparable defined in the String class
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Calculate the ASCII code value for "Hello"
//        int sum = 0;
//        for (int i = 0; i < "Hello".length(); i++) {
//
//            int uniVal = (int) "Hello".charAt(i);
//            sum += uniVal;
//        }
//        System.out.println("ASCII code value for Hello: " + sum);
//
//        //Calculate the ASCII code value for "hello"
//        int sum2 = 0;
//        for (int i = 0; i < "hello".length(); i++) {
//            int uniVal2 = (int) "hello".charAt(i);
//            sum2 += uniVal2;
//        }
//        System.out.println(new StringBuilder().append("ASCII code value for hello: ").append(sum2).toString());
//
//        //Calculate the ASCII code value for "Hi"
//        int sum3 = 0;
//        for (int i = 0; i < "Hi".length(); i++) {
//            int uniVal3 = (int) "Hi".charAt(i);
//            sum3 += uniVal3;
//        }
//        System.out.println(String.format("ASCII code value for Hi: %s", sum3));
//
//        //Calculate the ASCII code value for "HI"
//        int sum4 = 0;
//        for (int i = 0; i < "HI".length(); i++) {
//            int uniVal4 = (int) "HI".charAt(i);
//            sum4 += uniVal4;
//        }
//        System.out.println(MessageFormat.format("ASCII code value for HI: {0}", sum4));
        //Try Binary search - the array must be sorted
        System.out.println(Arrays.binarySearch(array, "Hello"));//1
        System.out.println(Arrays.binarySearch(array, "HELLO"));//-1 (insertion at index 0)

        //Sort and search a "List of Integers"
        java.util.List<Integer> intLst = new ArrayList<>();
        intLst.add(22);
        intLst.add(11);
        intLst.add(44);
        intLst.add(33);
        Collections.sort(intLst); //Use the comparable of Integer class
        System.out.println(intLst); //[11,22,33,44]
        System.out.println(Collections.binarySearch(intLst, 22));//1
        System.out.println(Collections.binarySearch(intLst, 35));//-4 (insertion at index 3)
    }
}
