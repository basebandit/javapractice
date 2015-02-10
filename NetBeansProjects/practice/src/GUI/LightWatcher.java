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
public class LightWatcher implements LightListener {

    private int id;//ID of this listener

    /**
     * Constructor
     */
    public LightWatcher(int id) {
        this.id = id;
        System.out.println("LightWatcher-" + id + ": created");
    }

    /**
     * implementation of event handlers
     * @param evt
     */
    @Override
    public void lightOn(LightEvent evt) {
        System.out.println("LightWatcher-" + id + ": I am notified that light is on");
    }

    /**
     *lightOff implementation
     * @param evt
     */
    @Override
    public void lightOff(LightEvent evt) {
        System.out.println("LightWatcher-" + id + ": I am notified that light is off");
    }
}
