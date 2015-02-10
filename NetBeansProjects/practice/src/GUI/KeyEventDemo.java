/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class KeyEventDemo extends Frame implements KeyListener, WindowListener {
    
    private final TextField tfInput;
    private final TextArea taDisplay;
    
    public KeyEventDemo() {
        setLayout(new FlowLayout());
        
        add(new Label("Enter Text: "));
        tfInput = new TextField(10);
        add(tfInput);
        
        taDisplay = new TextArea(5, 40);
        taDisplay.setEditable(false);
        add(taDisplay);
        
        addWindowListener(this);
        tfInput.addKeyListener(this);
        
        setTitle("KeyEvent Demo");
        setSize(420, 220);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new KeyEventDemo();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        taDisplay.setText("You have typed " + e.getKeyChar() + "\n");
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    @Override
    public void windowClosed(WindowEvent e) {
    }
    
    @Override
    public void windowIconified(WindowEvent e) {
    }
    
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    
    public void windowActivated(WindowEvent e) {
    }
    
    public void windowDeactivated(WindowEvent e) {
    }
}
