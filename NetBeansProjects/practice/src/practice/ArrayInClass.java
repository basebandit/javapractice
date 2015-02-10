/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class ArrayInClass {

    String test;
    private int[] data = new int[3];

    ArrayInClass(String TempTest) {
        test = TempTest;
    }

    public ArrayInClass() {
        data = new int[]{10, 20, 25};
    }

    public static void main(String... args) {
        ArrayInClass InstArrayInClass = new ArrayInClass("Test");
        System.out.println(InstArrayInClass.test);
        System.out.println(InstArrayInClass.data[0] + " " + InstArrayInClass.data[1]);
    }

}
