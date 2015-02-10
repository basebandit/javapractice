/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author mars
 */
public class ControlCircle extends JFrame {

    private JButton btnEnlarge;
    private JButton btnShrink;
    private JPanel panel;
    private CirclePanel canvas;
    private Container c;

    public ControlCircle() {
        super("Control Circle");
        initComponents();
    }

    private void initComponents() {

        btnEnlarge = new JButton("Enlarge");
        btnShrink = new JButton("Shrink");
        panel = new JPanel();

        panel.add(btnEnlarge);
        panel.add(btnShrink);

        canvas = new CirclePanel();
        c = this.getContentPane();
        c.add(canvas, BorderLayout.CENTER);//add canvas to center
        c.add(panel, BorderLayout.SOUTH);//add buttons to the frame

        btnEnlarge.addActionListener(new EnlargeListener());
        btnShrink.addActionListener(new ShrinkListener());

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    class EnlargeListener extends MouseAdapter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.Enlarge();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            canvas.Enlarge();
        }
    }

    class ShrinkListener extends MouseAdapter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.Shrink();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            canvas.Shrink();
        }
    }

    class CirclePanel extends JPanel {

        private int radius = 5;

        public CirclePanel() {
            setOpaque(true);
        }
//Enlarge the circle

        public void Enlarge() {
            radius++;
            repaint();
        }
//Shrink the Circle

        public void Shrink() {
            radius--;
            repaint();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
            g.setColor(Color.ORANGE);
            g.fillOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
        }
    }

    public static void main(String[] args) {
        new ControlCircle();
    }

}
