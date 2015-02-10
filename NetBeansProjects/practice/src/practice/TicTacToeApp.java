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
public class TicTacToeApp {

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

    /**
     *
     * @param p1
     * @param p2
     */
    public static void playTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }
}
