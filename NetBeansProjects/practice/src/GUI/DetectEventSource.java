/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class DetectEventSource extends JFrame {

    private JButton btnNew;
    private JButton btnOpen;
    private JButton btnSave;
    private JButton btnClose;
    private JPanel pnlButton;
    private ButtonListener listener;

    public DetectEventSource() {
        initComponents();
    }

    private void initComponents() {
        //Layout
        getContentPane().setLayout(new BorderLayout());

        pnlButton = new JPanel();
        listener = new ButtonListener();

        //Buttons
        btnNew = new JButton("New");
        btnOpen = new JButton("Open");
        btnSave = new JButton("Save");
        btnClose = new JButton("Close");

        //add buttons to the panel
        pnlButton.add(btnNew);
        pnlButton.add(btnOpen);
        pnlButton.add(btnSave);
        pnlButton.add(btnClose);

        getContentPane().add(pnlButton);

        btnNew.addActionListener(listener);
        btnOpen.addActionListener(listener);
        btnSave.addActionListener(listener);
        btnClose.addActionListener(listener);

        setTitle("Detect Event Source");
        setSize(200, 200);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    class ButtonListener implements ActionListener {

        public ButtonListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btnNew)) {
                System.out.println("Process New");
            } else if (e.getSource().equals(btnOpen)) {
                System.out.println("Process Open");
            } else if (e.getSource().equals(btnSave)) {
                System.out.println("Process Save");
            } else if (e.getSource().equals(btnClose)) {
                System.out.println("Process Close");
            }
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DetectEventSource(); //To change body of generated methods, choose Tools | Templates.
            }

        });

    }
}
