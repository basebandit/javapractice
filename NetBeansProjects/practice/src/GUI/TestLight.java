/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 * A Test Driver
 *
 * @author mars
 */
public class TestLight {

    public static void main(String[] args) {
    Light light = new Light();
    LightWatcher lw1 = new LightWatcher(1);
    LightWatcher lw2= new LightWatcher(2);
    LightWatcher lw3 = new LightWatcher(3);
    light.addLightListener(lw1);
    light.addLightListener(lw2);
    light.turnOn();
    light.addLightListener(lw3);
    light.turnOff();
    light.removeListener(lw1);
    light.removeListener(lw3);
    light.turnOn();
    }
}
