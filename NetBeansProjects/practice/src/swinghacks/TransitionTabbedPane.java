/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author mars
 */
public class TransitionTabbedPane extends JTabbedPane implements ChangeListener, Runnable {

    protected int animation_length = 20;
    protected int step;
    protected BufferedImage buf = null;
    protected int previous_tab = -1;

    public TransitionTabbedPane() {
        super();
        //adding this pane as a ChangeListener to itself
        this.addChangeListener(this);
    }

    public int getAnimationLength() {
        return this.animation_length;
    }

    public void setAnimationLength(int length) {
        this.animation_length = length;
    }

    //threading code
    /**
     * Called whenever the user switches tabs.
     *
     * @param evt
     */
    @Override
    public void stateChanged(ChangeEvent evt) {
        new Thread(this).start();
    }

    @Override
    public void run() {
        step = 0;
        //save the previous tab
        if (previous_tab != -1) {
            Component comp = this.getComponent(previous_tab);
            buf = new BufferedImage(comp.getWidth(), comp.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            comp.paint(buf.getGraphics());
        }
        for (int i = 0; i < animation_length; i++) {
            step = i;
            repaint();
            try {
                Thread.currentThread().sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("ex: " + ex);
            }
        }
        step = -1;
        previous_tab = this.getSelectedIndex();
        repaint();
    }

    @Override
    public void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (step != -1) {
            Rectangle size = this.getComponentAt(0).getBounds();
            Graphics2D g2 = (Graphics2D) g;
            paintTransition(g2, step, size, buf);
        }
    }

    public void paintTransition(Graphics2D g2, int step, Rectangle sze, Image prev) {

    }

    public static class InOutPane extends TransitionTabbedPane {

        public InOutPane() {
            System.out.println("Hi am the Inner class constructor");
        }

        @Override
        public void paintTransition(Graphics2D g2, int state, Rectangle size, Image prev) {
            int length = getAnimationLength();
            int half = length / 2;
            double scale = size.getHeight() / length;
            int offset = 0;
            //Calculate the fade out part
            if (state >= 0 && state < half) {
                //draw the  version of the old tab component
                if (prev != null) {
                    g2.drawImage(prev, (int) size.getX(), (int) size.getY(), null);
                }
                offset = (int) ((10 - state) * scale);
            }
            //do the drawing
            g2.setColor(Color.white);
            Rectangle area = new Rectangle((int) (size.getX() + offset), (int) (size.getY() + offset), (int) ((int) size.getWidth() - offset * 2), (int) (size.getHeight() - offset * 2));
            g2.fill(area);
        }
    }

    private static class VenetianPane extends TransitionTabbedPane {

        public void paintTansition(Graphics2D g2, int step, Rectangle size, Image prev) {
            int length = getAnimationLength();
            int half = length / 2;

            //create a blind
            Rectangle blind = new Rectangle();
            if (step >= 0 && step < half) {
                //draw the saved version of the old tab component
                if (prev != null) {
                    g2.drawImage(prev, (int) size.getX(), (int) size.getY(), null);
                }
                //Calculate the growing blind
                blind = new Rectangle((int) size.getX(), (int) size.getY(), step, (int) size.getHeight());
            }
            //Calculate the fade part
            if (step >= half && step < length) {
                //calculate the shrinking blind
                blind = new Rectangle((int) size.getX(), (int) size.getY(), length - step, (int) size.getHeight());
                blind.translate(step - half, 0);
            }
            //draws the blinds
            for (int i = 0; i < size.getWidth() / half; i++) {
                g2.setColor(Color.WHITE);
                g2.fill(blind);
                blind.translate(half, 0);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fade Tabs");
        JTabbedPane tab = new VenetianPane();
        tab.addTab("t1", new JButton("Test Buton1"));
        tab.addTab("t2", new JButton("Test Button2"));
        frame.getContentPane().add(tab);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

}
