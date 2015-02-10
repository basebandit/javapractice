/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Image;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class ImagePanel extends JPanel {

    private final Image img;
    private Dimension size;
    private static JFrame frame;
    private static ImagePanel panel;
    private static JCheckBox checkbox;

    public ImagePanel(Image img) {
        this.img = img;
        initComponents();
    }

    private void initComponents() {
        size = new Dimension(img.getWidth(null), img.getHeight(null));
        setSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setLayout(null);

    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    private static class ImageButton extends JButton {

        private final ImageIcon icon;
        private static ImageButton button;

        public ImageButton(ImageIcon icon) {
            this.icon = icon;
            initInnerComponents();
        }

        public final void initInnerComponents() {
            setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
            setIcon(icon);
            setMargin(new Insets(0, 0, 0, 0));
            setIconTextGap(0);
            setBorderPainted(false);
            setBorder(null);
            setText(null);
            checkbox = new JCheckBox("Disabled");
            checkbox.setLocation(145, 259);
            checkbox.setOpaque(false);
            checkbox.setSize(checkbox.getPreferredSize());
            checkbox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    button.setEnabled(!checkbox.isSelected());
                }
            });
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                panel = new ImagePanel(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/login.png").getImage());
                frame = new JFrame("Hack #1: Create Image-Themed Components");
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ImagePanel.ImageButton.button = new ImagePanel.ImageButton(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/options.png"));
                ImagePanel.ImageButton.button.setLocation(142, 231);
                ImagePanel.ImageButton.button.setPressedIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/circle1.gif"));
                ImagePanel.ImageButton.button.setRolloverIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/circle2.gif"));
                ImagePanel.ImageButton.button.setSelectedIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/circle3.gif"));
                ImagePanel.ImageButton.button.setRolloverSelectedIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/Circle4.gif"));
                ImagePanel.ImageButton.button.setDisabledIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/error.png"));
                ImagePanel.ImageButton.button.setDisabledSelectedIcon(new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/cancel.png"));

                panel.add(ImagePanel.ImageButton.button);
                panel.add(checkbox);
            }
        });

    }
}
