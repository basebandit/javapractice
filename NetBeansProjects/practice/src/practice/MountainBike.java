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
public class MountainBike extends Bicycle {

    //the mountain bicycle subclass has one field
    public int seatHeight;

    //the mountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    //the mountainBike subclass has one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
