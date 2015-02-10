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
public class VolleyBall extends BallGame {

    public VolleyBall() {
        super("amateur");
    }

    public static void main(String[] mwas) {
        VolleyBall b1 = new VolleyBall();
        /**
         * the super class(BallGame) method hit requires an argument of type
         * BallGame thus when you call this method you can pass either a
         * BallGame object or a VolleyBall object because VolleyBall is a base
         * class of BallGame.
         */
        hit(b1);
        /**
         * creating an object of the superclass by making b2 a BallGame type
         * then assigning a reference of the object b1 created above.
         */
        BallGame b2 = b1;
        hit(b2);
        /**
         * Creating a superclass object same as above.
         */
        BallGame b3 = new BallGame("Semi-pro");
        hit(b3);
        /**
         * upcasting(converting)b from type BallGame to type VolleyBall since an
         * object of type VolleyBall is required.
         */
        BallGame b = new VolleyBall();
        toss((VolleyBall) b);
    }
}
