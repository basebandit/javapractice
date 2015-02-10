/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author mars
 */
public class TimerTest {

    public TimerTest() {
        ActionListener act = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Swing is powerful"); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Timer tim = new Timer(1000, act);
        tim.start();
        while (true) {
        }
    }
    public static void main(String[] args){
    new TimerTest();
    }
}
