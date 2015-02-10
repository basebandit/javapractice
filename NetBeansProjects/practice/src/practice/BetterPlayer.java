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
public class BetterPlayer extends Player {

    /**
     *
     * @return
     */
    @Override
    public int move() {
        System.out.println("\nThe better player says:");
        System.out.println("I'm looking for a good move...");
        return findBestMove();
    }

    private int findBestMove() {
        int square = 0;
        //code to find the best move goes here
        return square;
    }
}
