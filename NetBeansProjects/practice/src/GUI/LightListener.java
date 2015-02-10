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
public interface LightListener extends EventListener {

    public void lightOn(LightEvent evt);//called-back upon Light on

    public void lightOff(LightEvent evt);//called-back upon light off
}
