/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author mars
 */
public class AWTStudentList extends Frame implements ActionListener, WindowListener {

    private final Label lblName;
    private final TextField tfName;
    private final Label lblAge;
    private final TextField tfAge;
    private final Label lblGender;
    private final TextField tfGender;
    private final Label lblContact;
    private final TextField tfContact;
    private final Button btnSave;

    public AWTStudentList() {
        setLayout(new FlowLayout());

        lblName = new Label("Name");
        add(lblName);
        tfName = new TextField(10);
        tfName.setEditable(true);
        add(tfName);
        lblAge = new Label("Age");
        add(lblAge);
        tfAge = new TextField(10);
        tfAge.setEditable(true);
        add(tfAge);
        lblGender = new Label("Gender");
        add(lblGender);
        tfGender = new TextField(10);
        tfGender.setEditable(true);
        add(tfGender);
        lblContact = new Label("Contact");
        add(lblContact);
        tfContact = new TextField(10);
        tfContact.setEditable(true);
        add(tfContact);
        btnSave = new Button("SAVE");
        add(btnSave);

        btnSave.addActionListener(this);
        addWindowListener(this);

        setTitle("Entry Form");
        setSize(330, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTStudentList();
    }
    Path path = Paths.get("/home/mars/Desktop/students.txt");
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

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

    public void windowDeactivated(WindowEvent e) {
    }
}
