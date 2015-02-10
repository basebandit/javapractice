/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.net.URL;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author mars
 */
public class SwingJComponentSetterTest extends JFrame {

    //Image path relative to the project root
    private final String imgCrossFileName = "home/mars/NetBeansProjects/practice/src/GUI/images/Dog.gif";
    private final String imgNoughtFileName = "home/mars/NetBeansProjects/practice/src/GUI/images/Cat.gif";
    private JLabel label;
    private JButton button;
    JTextField tfField;

    /**
     * Constructor to setup the GUI
     */
    public SwingJComponentSetterTest() {
        initComponents();
    }

    public void initComponents() {
        ImageIcon iconCross = null;
        ImageIcon iconNought = null;
        URL imgURL = getClass().getClassLoader().getResource(imgCrossFileName);
        if (imgURL != null) {
            iconCross = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + imgCrossFileName);
        }

        imgURL = getClass().getClassLoader().getResource(imgNoughtFileName);
        if (imgURL != null) {
            iconNought = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + imgNoughtFileName);
        }

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        //Create a JLabel with text and icon and set its appearances
        label = new JLabel("JLabel", iconCross, SwingConstants.CENTER);
        label.setFont(new Font(Font.DIALOG, Font.ITALIC, 14));
        label.setOpaque(true); // needed for JLabel to show the background color
        label.setBackground(new Color(204, 238, 241));//Light blue
        label.setForeground(Color.RED);  //foreground text color
        label.setPreferredSize(new Dimension(120, 80));
        label.setToolTipText("This is a JLabel");//Tool tip
        cp.add(label);

        // Create a JButton with text and icon and set its appearance
        button = new JButton();//use setter to set text and icon
        button.setText("Button");
        button.setIcon(iconNought);
        button.setVerticalAlignment(SwingConstants.BOTTOM);
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        button.setVerticalTextPosition(SwingConstants.TOP);
        button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        button.setBackground(new Color(231, 240, 248));
        button.setForeground(Color.BLUE);
        button.setPreferredSize(new Dimension(150, 180));
        button.setToolTipText("This is a JButton");
        button.setMnemonic(KeyEvent.VK_B);
        cp.add(button);

        //Create a JtextField with text and icon and set its appearances
        tfField = new JTextField("TextField", 15);
        tfField.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
        tfField.setForeground(Color.RED);
        tfField.setHorizontalAlignment(JTextField.RIGHT); // Text alignment
        tfField.setToolTipText("This is a JTextField");
        cp.add(tfField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("JComponent Test");
        setLocationRelativeTo(null);//center window on the screen
        setSize(500, 150);// or pack
        setVisible(true);
        MytoString();
    }

    public void MytoString() {
        System.out.println(label);
        System.out.println(button);
        System.out.println(tfField);
    }

    public static void main(String[] args) {
        //Run the GUI codes on Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingJComponentSetterTest swingJComponentSetterTest = new SwingJComponentSetterTest();
            }
        });
    }
}
