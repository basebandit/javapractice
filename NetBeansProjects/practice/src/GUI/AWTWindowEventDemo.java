/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author mars
 */
public class AWTWindowEventDemo extends Frame implements ActionListener, WindowListener {
    // This class acts as listener for ActionEvent and WindowEvent
    // Java supports only single inheritance, where a class can extend
    // one superclass, but can implement multiple interfaces.

    private final TextField tfCount;
    private final Button btnCount;
    private int count = 0;

    public AWTWindowEventDemo() {
        setLayout(new FlowLayout());// "super" Frame sets to FlowLayout
        add(new Label("Counter"));//"super" Frmae adds an anonymous Label

        tfCount = new TextField("0", 10);// Allocate TextField
        tfCount.setEditable(false);// read-only
        add(tfCount);// "super" Frame adds tfCount

        btnCount = new Button("Count");// Declare and allocate a Button
        add(btnCount);// "super" Frame adds btnCount

        btnCount.addActionListener(this);
        // btnCount fires ActionEvent to its registered ActionEvent listener
        // btnCount adds "this" object as an ActionEvent listener
        addWindowListener(this);
        // "super" Frame fires WindowEvent to its registered WindowEvent listener
        // "super" Frame adds "this" object as a WindowEvent listener
        setTitle("AWTWindowEvent Demo");//"suoer" Frame sets title
        setSize(250, 100);//"super" Frame sets initial size
        setVisible(true);//"super" Frame shows
    }

    public static void main(String[] args) {
        new AWTWindowEventDemo();//Let the constructor do the job
    }

    /**
     * ActionEvent handler
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        tfCount.setText(count + "");
    }

    /**
     * WindowEvent handlers called back upon clicking close-window button
     *
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);// Terminate the program
    }

    /**
     * Not Used, but need to provide an empty body
     *
     * @param e
     */
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
