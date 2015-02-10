/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author mars
 */
public class TestGenericsMethod {

    public static <T extends Comparable<T>> T maximum(T x, T y) {
        return (x.compareTo(y) > 0) ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(maximum(55, 66));
        System.out.println(maximum(6.6f, 5.5f));
        System.out.println(maximum("Monday", "Tuesday"));
    }
}
