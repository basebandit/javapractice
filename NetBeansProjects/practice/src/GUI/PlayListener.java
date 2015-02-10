/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.EventListener;

/**
 *
 * @author mars
 */
public interface PlayListener extends EventListener {

    public void startPlay(PlayEvent evt);

    public void stopPlay(PlayEvent evt);
}
