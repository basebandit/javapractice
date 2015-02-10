/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mars
 */
public class Player implements PlayListener {

    private char playerId;//ID of the player

    /**
     * Constructor
     */
    public Player(char playerId) {
        this.playerId = playerId;
        System.out.println("Player-" + playerId + ": created");
    }

    public static void main(String[] args) {
        Play play = new Play();
        Player ply1 = new Player('A');
        Player ply2 = new Player('B');
        Player ply3 = new Player('C');
        play.addPlayListener(ply1);
        play.addPlayListener(ply2);
        play.start();
        play.addPlayListener(ply3);
        play.stop();
        play.removePlayListener(ply1);
        play.removePlayListener(ply2);
        play.removePlayListener(ply3);
        play.start();
    }

    @Override
    public void startPlay(PlayEvent evt) {
        System.out.println("Player-" + playerId + ": I am notified that the Game has started");
    }

    @Override
    public void stopPlay(PlayEvent evt) {
        System.out.println("Player" + playerId + ": I am notitifed that the Game has stopped");
    }
}
