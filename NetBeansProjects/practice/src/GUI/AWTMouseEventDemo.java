/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class AWTMouseEventDemo extends Frame implements MouseListener, WindowListener {

    private TextField tfMouseX;
    private TextField tfMouseY;

    public AWTMouseEventDemo() {
        setLayout(new FlowLayout());

        add(new Label("X-Click: "));

        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);

        add(new Label("Y-Click: "));

        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);

        addMouseListener(this);
        addWindowListener(this);

        setTitle("MouseEvent Demo");
        setSize(350, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTMouseEventDemo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tfMouseX.setText(e.getX() + "");
        tfMouseY.setText(e.getY() + "");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        //this.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
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

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
