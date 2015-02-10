/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import java.awt.Container;
import java.awt.Dimension;

/**
 *
 * @author mars
 */
public class LoginForm extends JFrame {

    private static final int FRAME_WIDTH = 150;
    private static final int FRAME_HEIGHT = 100;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private final JButton login = new JButton("Login");
    private final JTextField txtField = new JTextField("");
    private final JLabel txtLabel = new JLabel("email");

    public LoginForm() {
        Container contentPane = getContentPane();

        //set the LoginForm Frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Login");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //set the layout manager
        GroupLayout layout = new GroupLayout(getContentPane());
        //contentPane.setLayout(new GroupLayout());
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(txtLabel))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(txtLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(login)
                                                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(142, Short.MAX_VALUE))
        );

        //create and place a label for the textfield on the frame's content pane
        contentPane.add(txtLabel);

        //create and place the textfield on the frame's content pane
        contentPane.add(txtField);

        //create and place the login button on the frame's content pane
        login.setPreferredSize(new Dimension(200, 100));
        contentPane.add(login);

        //register the default cloes operation upon exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginForm mylogin = new LoginForm();
        mylogin.setVisible(true);
    }
}
