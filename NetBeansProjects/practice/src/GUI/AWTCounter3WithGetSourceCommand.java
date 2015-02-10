/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class AWTCounter3WithGetSourceCommand extends JFrame {

    private Button btnCountUp;
    private Button btnCountDown;
    private Button btnReset;
    private TextField tfCounter;
    private int count = 0;

    public AWTCounter3WithGetSourceCommand() {
        setLayout(new FlowLayout());

        add(new Label("Counter "));
        tfCounter = new TextField("0", 10);
        tfCounter.setEditable(false);
        add(tfCounter);

        btnCountUp = new Button("CountUp");
        add(btnCountUp);
        btnCountDown = new Button("CountDown");
        add(btnCountDown);
        btnReset = new Button("Reset");
        add(btnReset);

        btnCountUp.addActionListener(new BtnListener());
        btnCountDown.addActionListener(new BtnListener());
        btnReset.addActionListener(new BtnListener());

        setTitle("Counter");
        setSize(500, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Button src = (Button) e.getSource();
            if (src == btnCountUp) {
                count++;
                tfCounter.setText(count + "");
            } else if (src == btnCountDown) {
                count--;
                tfCounter.setText(count + "");
            } else {
                count = 0;
                tfCounter.setText(count + "");
            }
        }
    }

    public static void main(String[] args) {
        new AWTCounter3WithGetSourceCommand();
    }
}
