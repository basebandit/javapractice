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
public class BallGame {

//    private final String level;
    private final String level;

    public BallGame(String level) {
        this.level = level;
    }

    /**
     *
     * @param b
     */
    public static void hit(BallGame b) {
        System.out.println("You have hit a ball");
    }

    public static void toss(VolleyBall b) {
        System.out.println("You have tossed a ball");
    }
}
