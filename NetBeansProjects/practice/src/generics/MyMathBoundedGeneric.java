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
public class MyMathBoundedGeneric {

    /**
     * A bounded parameter type is a generic type that specifies a bound for the
     * generic, in the form of <T extends ClassUpperBound>, e.g., <T extends
     * Number> accepts Number and its subclasses (such as Integer and Double).
     *
     * @param <T>
     * @param first
     * @param second
     * @return
     */
    public static <T extends Number> double add(T first, T second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(add(55, 66));//int -> Integer
        System.out.println(add(5.5f, 6.6f));//float -> Float
        System.out.println(add(5.5, 6.6));//double -> Double
    }
}
