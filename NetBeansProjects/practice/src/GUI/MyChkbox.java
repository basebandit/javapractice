/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.net.URL;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mars
 */
public class MyChkbox extends JFrame {

    private JCheckBox chkBx;
    private ImageIcon chkbkIcon;
    private String image;
    private URL imgUrl;

    public MyChkbox() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(3, 2));

        image = "/home/mars/Downloads/valid.png";
        chkbkIcon = new ImageIcon(image);
        imgUrl = getClass().getClassLoader().getResource(image);
        if (imgUrl != null) {
            chkbkIcon = new ImageIcon(imgUrl);
        } else {
            JOptionPane.showMessageDialog(null, "Image Not Found");
        }
        chkBx = new JCheckBox("Check me", chkbkIcon, false);
        chkBx.setForeground(Color.ORANGE);
        chkBx.setBackground(Color.darkGray);
        chkBx.setMnemonic('S');
        getContentPane().add(chkBx);

        setTitle("CheckBox ");
        setSize(300, 300);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyChkbox();
    }
}
