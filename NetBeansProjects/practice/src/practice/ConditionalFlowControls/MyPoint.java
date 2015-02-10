
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(x,y)";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt((xDiff * xDiff + yDiff * yDiff));
    }

    /*
     * this version takes a MyPoint instance as an argument
     * @param another
     * @return
     */

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;

        return Math.sqrt((xDiff * xDiff + yDiff * yDiff));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
