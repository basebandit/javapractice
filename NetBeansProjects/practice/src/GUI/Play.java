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
public class Play {

    private boolean start;
    private final List<PlayListener> listeners = new ArrayList<>();

    public Play() {
        start = false;
        System.out.println("Play: Initialized and on halt");
    }

    public void addPlayListener(PlayListener listener) {
        boolean add = listeners.add(listener);
        System.out.println("Play: Listener added");
    }

    public void removePlayListener(PlayListener listener) {
        boolean remove = listeners.remove(listener);
        System.out.println("Play: Listener removed");
    }

    public void start() {
        if (!start) {
            start = !start;
            System.out.println("Play: Start");
        }
    }

    public void stop() {
        if (start) {
            start = start;
            System.out.println("Play: Stopped");
        }
    }

    public void Notify() {
        PlayEvent evt = new PlayEvent(this);
        for (PlayListener listener : listeners) {
            if (start) {
                listener.startPlay(evt);
            } else {
                listener.stopPlay(evt);
            }
        }
    }
}
