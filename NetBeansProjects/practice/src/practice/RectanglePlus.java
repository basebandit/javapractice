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
public class RectanglePlus implements Relatable {

    private int width = 0;
    private int height = 0;
    private Point origin;

    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public int isLargerThan(Relatable other) {
        //downcasting
        RectanglePlus otherRect = (RectanglePlus) other;
        if (this.getArea() > otherRect.getArea()) {
            return -1;
        } else if (this.getArea() < otherRect.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String... args) {
        RectanglePlus largeRect = new RectanglePlus(1500, 1200);
        RectanglePlus myRect = new RectanglePlus(300, 200);
        System.out.println(myRect.isLargerThan(largeRect));
    }
}
