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
public class BasketBall extends Ball1 {

    /**
     * subclass constructor
     */
    public BasketBall() {
        //super(2000);
        //System.out.println("Hello from the BasketBall constructor.");
    }

    public void hit(Ball1 b) {
        System.out.println("You've hit a ball");
    }

    public static void main(String[] args) {
        /**
         * upcasting treats the BasketBall object as if it were a Ball1 object.
         */

        Ball1 b = new BasketBall();
        //hit(b);
    }
}
