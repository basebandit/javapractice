/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class RollDice {

    public static void main(String[] args) {
        Dice one, two, three;
        one = new Dice();
        two = new Dice();
        three = new Dice();

        one.roll();
        two.roll();
        three.roll();

        System.out.println(MessageFormat.format("Results are: {0} {1} {2}", one.getNumber(), two.getNumber(), three.getNumber()));
    }
}
