/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mars
 */
public class Light {

    //Status -on(true) or off(false)
    private final boolean on;
    private final List<LightListener> listeners = new ArrayList<LightListener>();

    /**
     * Constructor*
     */
    public Light() {
        on = false;
        System.out.println("Light: constructed and off");
    }

    /**
     * Add the given LightListener
     * @param listener
     */
    public void addLightListener(LightListener listener) {
        listeners.add(listener);
        System.out.println("Light: added a listener");
    }

    /**
     *Remove the given light listener
     * @param listener
     */
    public void removeListener(LightListener listener) {
        listeners.remove(listener);
        System.out.println("Light: removed a listener");
    }

    /**
     * Turn on this light*
     */
    public void turnOn() {
        if (!on) {
            System.out.println("Light: turn on");
            Notify();
        }
    }

    /**
     * Tun off this light*
     */
    public void turnOff() {
        if (on) {
            System.out.println("Light: turn off");
            Notify();
        }
    }

    /**
     * Construct a lightEvent and notify all of its listeners
     */
    private void Notify() {
        LightEvent evt = new LightEvent(this);
        for (LightListener listener : listeners) {
            if (on) {
                listener.lightOn(evt);
            } else {
                listener.lightOff(evt);
            }
        }
    }
}
