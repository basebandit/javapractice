/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.*;
import javax.swing.JOptionPane;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;

/**
 *
 * @author mars
 */
public class RainfallStat extends Frame implements ActionListener, WindowListener {

    private final JTextArea taDisplay;
    private final TextField tfMnth;
    private final TextField tfAmnt;
    private final Button btnDisplay;

    public RainfallStat() {
        setLayout(new FlowLayout());

        taDisplay = new JTextArea(12, 35);
        taDisplay.setEditable(false);
        add(taDisplay);

        add(new Label("Month: "));
        tfMnth = new TextField(15);
        add(tfMnth);

        add(new Label("Amount: "));
        tfAmnt = new TextField(15);
        add(tfAmnt);

        btnDisplay = new Button("Display");
        add(btnDisplay);

        addWindowListener(this);
        tfMnth.addActionListener(this);
        tfAmnt.addActionListener(this);
        btnDisplay.addActionListener(this);

        setTitle("Rainfall Monitor");
        setSize(445, 320);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RainfallStat();
    }
    /*
     *Implementing WindowListener Interface
     */

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    /**
     * Implementing ActionListener Interface
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Rainfall();
//        Display();
    }
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] monthName = new String[12];
    int[] amount = new int[12];

    public void Rainfall() {
        while (true) {
            String FILE_NAME = "temp.txt";
            try {
                int sum = 0;
                // final String FILE_NAME = "/home/mars/NetBeansProjects/practice/src/arrays/rainfallstat.txt";
                String line = null;
                String line1 = null;
                FileWriter fw = new FileWriter(FILE_NAME);
                BufferedWriter bw = new BufferedWriter(fw);
                FileReader fr = new FileReader(FILE_NAME);
                BufferedReader br = new BufferedReader(fr);
                for (int i = 0; i < monthName.length; i++) {
                   // monthName[i] = tfMnth.getText();

                    //amount[i] = Integer.parseInt(tfAmnt.getText());
                    bw.write(tfMnth.getText());
                    bw.write(Integer.parseInt(tfAmnt.getText()) + "");

                    taDisplay.setText("Rainfall For " + monthName[i] + ": " + amount[i]);
                    sum += amount[i];
                }
                while ((line = tfMnth.getText()) != null && (line1 = tfAmnt.getText()) != null) {
                    taDisplay.setText(line);
                    taDisplay.setText(line1);
                }
                bw.close();
                br.close();
                tfAmnt.setText("");
                tfAmnt.getCursor();
                tfMnth.setText("");
                tfMnth.getCursor();
//            taDisplay.setText(sum + "");
            } catch (IOException e) {
                if (tfMnth.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Month");
                } else if (tfAmnt.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Rainfall Amount ");
                }
                //e.printStackTrace();
            }
        }
    }

//    public void Display() {
//        int annualAverage, sum; 
//        sum = 0;
//        for (int i = 0; i < monthName.length; i++) {
//            taDisplay.setText("Rainfall for month " + monthName[i] + ": " + rainfall[i]);
//            sum += rainfall[i];
//            taDisplay.setText("Total Rainfall: " + sum);
//        }
//    }
}
