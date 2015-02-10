/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class Circle {
    //private instance variable,not accessible from outside this class

    private double radius;
    private String color;

    //1st constructor which sets both radius and color to default
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    //2nd constructor with given radius,but color default
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    //Constructor to construct a new instance of circle with the given radius and color

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //A public method for computing the area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    //Getter for retrieving variable color
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;//"this.radius" refers to the instance of circle.radius refers to the method's argument.
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
     return "Circle: radius = "+radius + " color = "+color;
    }
}
