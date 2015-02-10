/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class TestCircle {

    public static void main(String[] args) {
        //Declare and allocate an instance of class circle called c1 with default radius and color
        Circle c1 = new Circle();
        c1.setColor("Brown");
        c1.setRadius(5.0);
        //calling the toString method explicitly,just like any other method.
        System.out.println(c1.toString());//explicit call
        //use the dot operator to invoke methods of instance c1.
        System.out.println("The circle c1 has a radius of " + c1.getRadius() + " and an area of " + c1.getArea());

        //Declare and allocate an instance of classs circle called c2.
        Circle c2 = new Circle(2.0);
        System.out.println(c2.toString());//explicit call
        System.out.println(c2);//implicit call..println() calls toString() implicitly,same as above
        System.out.println("Operator '+'invokes toString() too: " + c2);//'+' invokes toString() too
        //use the dot operator to invoke the methods of instance c2.
        System.out.println("The circle c2 has radius of " + c2.getRadius() + " and an area of " + c2.getArea());
        //Declare and allocate an instance of class circle called c3.
        Circle c3 = new Circle(3.0, "orange");
        c3.setColor("Green");//changes the color from orange to green
        c3.setRadius(4.5);//changes the radius from 3.0 to 4.5.
        //use the dot operator to invoke the methods of instance c3.
        System.out.println("The circle c3 has a radius of " + c3.getRadius() + " and is " + c3.getColor() + " in color and an area of " + c3.getArea());
//        System.out.println(c1.getRadius());
        /*The below method coughs out an error since you cannot access a private variable directly you must use the instance's methos to do so.
         *c1.radius = 5.0;
         */
    }
}
