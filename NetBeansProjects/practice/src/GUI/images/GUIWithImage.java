/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.images;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.net.URL;
import javax.swing.SwingUtilities;

/**
 *
 * @author mars
 */
public class GUIWithImage extends JFrame {

    private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    private JButton btnCompute;
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9;
    private JPanel pnl1;
    private String imgCatPath;
    private String imgBirdPath;

    public GUIWithImage() {
        initComponents();
    }

    private void initComponents() {
        //prepare images to be used by JComponents
        ImageIcon iconCat = null;
        ImageIcon iconBird = null;
        imgBirdPath = "./Bird.gif";
        imgCatPath = "./Cat.gif";
        URL imgURL = getClass().getClassLoader().getResource(imgBirdPath);
        if (imgURL != null) {
            iconBird = new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(getContentPane(), "Couldn't find file: " + imgBirdPath);
        }
        imgURL = getClass().getClassLoader().getResource(imgCatPath);
        if (imgURL != null) {
            iconCat = new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(getContentPane(), "Couldn't find file: " + imgCatPath);
        }
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        //create a JLabel with their respective titles and set their appearances
        pnl1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lbl1 = new JLabel("Enter Loan Information ", SwingConstants.LEADING);
        lbl1.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
        lbl1.setOpaque(true);
        lbl1.setBackground(new Color(204, 238, 241));
        lbl1.setForeground(Color.GRAY);
        lbl1.setPreferredSize(new Dimension(200, 30));
        pnl1.add(lbl1);
        cp.add(pnl1);

        lbl2 = new JLabel("", iconBird, SwingConstants.TRAILING);
        lbl2.setToolTipText("Are You Broke?");
        pnl1.add(lbl2);
        cp.add(pnl1);

        lbl3 = new JLabel("1) Amount of the Loan(Any Currency): ", SwingConstants.LEADING);
        lbl3.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        lbl3.setForeground(Color.ORANGE);
        cp.add(lbl3);

        tf1 = new JTextField("Enter Loan Amount", 25);
        tf1.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
        tf1.setForeground(Color.ORANGE);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf1.setToolTipText("Loan Amount");
        cp.add(tf1);

        lbl4 = new JLabel("2) Annual percentage rate of interest: ", SwingConstants.LEADING);
        lbl4.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        lbl4.setForeground(Color.ORANGE);
        cp.add(lbl4);

        tf2 = new JTextField("Percentage Rate of Interest", 25);
        tf2.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
        tf2.setForeground(Color.ORANGE);
        tf2.setHorizontalAlignment(JTextField.RIGHT);
        tf2.setToolTipText("Rate of Interest");
        cp.add(tf2);

        lbl5 = new JLabel("3) Repayment period in years: ", SwingConstants.RIGHT);
        lbl5.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        lbl5.setForeground(Color.ORANGE);
        cp.add(lbl5);

        tf3 = new JTextField("Period in years", 25);
        tf3.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
        tf3.setHorizontalAlignment(JTextField.RIGHT);
        tf3.setForeground(Color.ORANGE);
        tf3.setToolTipText("time in years");
        cp.add(tf3);

        btnCompute = new JButton("Compute");
        btnCompute.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        btnCompute.setOpaque(true);
        btnCompute.setBackground(Color.BLACK);
        btnCompute.setForeground(Color.ORANGE);
        btnCompute.setHorizontalAlignment(JButton.RIGHT);
        btnCompute.setToolTipText("Click to calculate your loan");
        cp.add(btnCompute);
        cp.setBackground(Color.GRAY);
        showGUI();
    }

    private void showGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("LOAN CALCULATOR");
        setLocationRelativeTo(null);
        setSize(480, 210);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Run the GUI code on Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIWithImage();
            }
        });
    }
}
