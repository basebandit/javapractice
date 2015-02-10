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
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class AWTCalculator extends JFrame {

    private final JTextField tfDisplay;
    private final JButton[] btnNumbers = new JButton[10];
    private final JButton btnStar, btnHash, btnEquals, btnPlus, btnSub, btnDiv;

    public AWTCalculator() {
        setLayout(new BorderLayout());

        JPanel panelDisplay = new JPanel(new FlowLayout());
        tfDisplay = new JTextField("0", 20);
        panelDisplay.add(tfDisplay);

        JPanel panelButtons = new JPanel(new GridLayout(4, 4));
        for (int i = 1; i < 10; i++) {
            btnNumbers[i] = new JButton(i + "");
            panelButtons.add(btnNumbers[i]);
        }
        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnStar = new JButton("*");
        panelButtons.add(btnStar);
        btnHash = new JButton("#");
        panelButtons.add(btnHash);
        btnPlus = new JButton("+");
        panelButtons.add(btnPlus);
        btnSub = new JButton("-");
        panelButtons.add(btnSub);
        btnDiv = new JButton("/");
        panelButtons.add(btnDiv);
        btnEquals = new JButton("=");
        panelButtons.add(btnEquals);

        add(panelDisplay, BorderLayout.NORTH);
        add(panelButtons, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }

}
