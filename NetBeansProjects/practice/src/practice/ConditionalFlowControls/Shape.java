/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.ConditionalFlowControls;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class Shape {

    private int length;
    protected String Color;

    public Shape() {

    }

    public void setColor(String Color) {
        this.Color = Color;
    }
}

class Rectangle extends Shape {

    int width, height;

    public Rectangle(int width, int height, String Color) {
        this.width = width;
        this.height = height;
        setColor(Color);
    }

    public int getArea() {
        return width * height;
    }

    public String getColor() {
        return Color;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(15, 10, "Green");
        System.out.println(MessageFormat.format("Color is :{0}", r.getColor()));
        System.out.println(MessageFormat.format("The Area is {0}", r.getArea()));
    }
}
