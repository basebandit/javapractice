/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.util.Random;

/**
 *
 * @author mars
 */
public class Dice {

    //the largest number on a die
    private static final int MAX_NUMBER = 10;

    //the smallest number on a die
    private static final int MIN_NUMBER = 1;

    //To represent a die that is not yet rolled
    private static final int NO_NUMBER = 0;

    private int number;

    private final Random random;

    /**
     * Constructor
     */
    public Dice() {
        random = new Random();
        number = NO_NUMBER;
    }

    /**
     * Rolls the dice
     */
    public void roll() {
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    /**
     * Returns the number on this die
     *
     * @return
     */
    public int getNumber() {
        return number;
    }
}
