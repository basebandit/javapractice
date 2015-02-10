/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

/**
 *
 * @author mars
 */
public class AWTCounter2 extends JFrame {

    private int count = 0;
    private final JButton btnCountUp;
    private final JButton btnCountDown;
    private final JButton btnReset;
    private JTextField tfCounter;

    public AWTCounter2() {
        setLayout(new FlowLayout());

        add(new JLabel("Counter "));
        tfCounter = new JTextField("0", 10);
        tfCounter.setEditable(false);
        add(tfCounter);

        btnCountUp = new JButton("CountUp");
        add(btnCountUp);

        btnCountDown = new JButton("CountDown");
        add(btnCountDown);

        btnReset = new JButton("Reset");
        add(btnReset);

        addWindowListener(new WindowListener() {
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
        });
        btnCountUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count++;
                tfCounter.setText(count + "");
            }
        });
        btnCountDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count--;
                tfCounter.setText(count + "");
            }
        });
        btnCountUp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                count++;
                tfCounter.setText(count + "");
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
        });
        btnCountDown.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                count--;
                tfCounter.setText(count + "");
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
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count = 0;
                tfCounter.setText(count + "");
            }
        });
        setTitle("Counter");
        setSize(470, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTCounter2();
    }
}
