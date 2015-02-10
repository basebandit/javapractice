/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.MouseMotionListener;
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
public class AWTMouseMotionDemo extends Frame implements MouseListener, MouseMotionListener, WindowListener {

    private final TextField tfMouseClickX;
    private final TextField tfMouseClickY;

    private final TextField tfMousePositionX;
    private final TextField tfMousePositionY;

    public AWTMouseMotionDemo() {
        setLayout(new FlowLayout());

        add(new Label("X-Click: "));
        tfMouseClickX = new TextField(10);
        tfMouseClickX.setEditable(false);
        add(tfMouseClickX);

        add(new Label("Y-Click: "));
        tfMouseClickY = new TextField(10);
        tfMouseClickY.setEditable(false);
        add(tfMouseClickY);

        add(new Label("X-Position: "));
        tfMousePositionX = new TextField(10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);

        add(new Label("Y-Position: "));
        tfMousePositionY = new TextField(10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);

        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);

        setTitle("MouseMotion Demo");
        setSize(390, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTMouseMotionDemo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tfMouseClickX.setText(e.getX() + "");
        tfMouseClickY.setText(e.getY() + "");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /**
     * MouseMotionListener Interface Methods that need to be implemented
     */
    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tfMousePositionX.setText(e.getX() + "");
        tfMousePositionY.setText(e.getY() + "");
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

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
