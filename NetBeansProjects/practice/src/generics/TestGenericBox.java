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
public class TestGenericBox {

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>("Hello");
        String str = box1.getContent();//no explicit downcasting needed
        System.out.println(box1);
        System.out.println(str);
        GenericBox<Integer> box2 = new GenericBox<>(123);//autobox int to  Integer
        int i = box2.getContent();//downcast to Integer,auto-unbox to int
        System.out.println(box2);
        System.out.println(str);
        GenericBox<Double> box3 = new GenericBox<>(55.66);//autobox double to Double
        double d = box3.getContent();//downcast to Double,auto-unbox to double
        System.out.println(box3);
        System.out.println(str);
    }
}
