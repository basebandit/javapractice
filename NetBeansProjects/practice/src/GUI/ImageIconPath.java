/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.ImageIcon;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class ImageIconPath extends JFrame {

    private final String imgFilename;
    private final String imgFilename1;
    private ImageIcon iconDuke;
    private ImageIcon iconDuke1;
    private final java.net.URL imgUrl;
    private final java.net.URL imgUrl1;
    private final JPanel panel;
    private final JPanel panel1;

    public ImageIconPath() {
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));

        imgFilename = "/home/mars/NetBeansProjects/practice/src/GUI/me.jpg";
        imgFilename1 = "/home/mars/NetBeansProjects/practice/src/GUI/puppy.jpg";
        iconDuke = new ImageIcon(imgFilename);
        iconDuke1 = new ImageIcon(imgFilename1);
        imgUrl = getClass().getClassLoader().getResource(imgFilename);
        imgUrl1 = getClass().getClassLoader().getResource(imgFilename1);
        if ((imgUrl != null) || (imgUrl1 != null)) {
            iconDuke = new ImageIcon(imgUrl);
            iconDuke1 = new ImageIcon(imgUrl1);
        } else {
            System.err.println(String.format("Couldn't find file %s", imgFilename));
        }

        panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("dex2jar", iconDuke, JLabel.CENTER));
        panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("puppy", iconDuke1, JLabel.CENTER));

        add(panel);
        add(panel1);

        setLayout(new GridLayout(1, 0));
        setTitle("Image Demo");
        setVisible(true);
        cp.setVisible(true);
        this.pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageIconPath();
            }
        });
    }
}
