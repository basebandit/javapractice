/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;

/**
 *
 * @author mars
 */
public class AWTMouseEvent extends Frame implements MouseListener, ActionListener {

    private final Label lblBanner;
    private final Button btnClose;
    private final TextField tfMars;

    public AWTMouseEvent() {
        setLayout(new FlowLayout());
        lblBanner = new Label("Mars Dev INC: ");
        add(lblBanner);

        tfMars = new TextField("MarsDev", 10);
        tfMars.setEditable(false);
        add(tfMars);

        btnClose = new Button("Close");
        add(btnClose);

        lblBanner.addMouseListener(this);
        btnClose.addActionListener(this);
        setTitle("MARSDEV");
        setSize(250, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTMouseEvent();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //JOptionPane.showMessageDialog(this, "Mouse-button pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //JOptionPane.showMessageDialog(this, "Mouse-button released!");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse-button clicked (pressed and released)!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Mouse-pointer entered the source component!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Mouse exited-pointer the source component!");
    }
}
