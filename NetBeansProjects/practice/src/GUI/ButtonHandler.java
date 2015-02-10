/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRootPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class ButtonHandler implements ActionListener {
    
    public ButtonHandler() {
        
    }

    /**
     * overrides the unimplemented actionPerformed method in the ActionListener
     * interface
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();
        frame.setTitle("You clicked " + buttonText);
    }
}
