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
public class GolfBall extends Ball {

    public GolfBall() {

    }

    public static void main(String[] args) {
        Ball g = new GolfBall();
        g.hit(g);

    }
}
