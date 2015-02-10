/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.bestpractices;

/**
 *
 * @author mars
 */
public class ComparingWrapperObjects {

    private final int x = 10;
    private final int y = 10;

    /**
     * The first sop will print true whereas the second one will print false.
     * The problem is when comparing two wrapper class objects we cant use ==
     * operator. It will compare the reference of object and not its actual
     * value.
     *
     * @param x
     * @param y
     */
    private static void compare(int x, int y) {

        Integer x1 = new Integer(x);
        Integer y1 = new Integer(y);
        System.out.println(x == y);
        System.out.println(x1 == y1);
    }

    public static void main(String[] args) {
        compare(10, 10);
    }
}
