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
public class TestMyPoint {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        //testing the overloaded method distance()
        System.out.println("x = "+p1.getX());
        System.out.println("y = "+p1.getY());
        System.out.println("x2 = "+p2.getX());
        System.out.println("y2 = "+p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
    }
}
