/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author mars
 */
public class ImageGui extends JFrame {

    private final ImageIcon image1;
    private final JLabel label1;
    private final ImageIcon image2;
    private final JLabel label2;

    public ImageGui() {
        setLayout(new FlowLayout());
        image1 = new ImageIcon(getClass().getResource("me.jpg"));
        label1 = new JLabel(image1);
        add(label1);
        image2 = new ImageIcon(getClass().getResource("puppy.jpg"));
        label2 = new JLabel(image2);
        add(label2);
    }

    public static void main(String[] args) {
        ImageGui gui = new ImageGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
    }
}
