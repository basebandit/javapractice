/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mars
 */
public class LoanCalculator {

    private JFrame mainFrame;
    private JTextField tfOtherName;
    private JTextField tfSurname;
    private JTextField tfIdNumber;
    private JTextField tfPhone;
    private JTextField tfEmail;
    private JTextField tfPostalCode;
    private JTextField tfAnnualInterestRate;
    private JTextArea taAddress;
    private JTextField tfYears;
    private JTextField tfLnAmt;
    private JTextField tfMnthPaymnt;
    private JTextField tfTotalPaymnt;
    private JRadioButton rbtnFemale;
    private JRadioButton rbtnMale;
    private JComboBox tfCounty;
    private JButton btnSubmit;
    private JPanel identityPanel;
    private JPanel computationPanel;
    private JPanel mainPanel;
    private JPanel lftPanel;
    private JPanel rightPanel;
    private JPanel bannerPanel;
    private ImageIcon btnIcon;
    private ImageIcon bannerImg;
    private String imgUrl;
    private String imgUrl2;
    private String[] counties;
    private Border blackLine;
    private Font tFont;

    public LoanCalculator() {
        initComponents();
    }

    private void initComponents() {

        mainFrame = new JFrame("Loan Calculator");
        mainFrame.setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        tFont = new Font("SERIF", Font.BOLD, 15);
        blackLine = BorderFactory.createLineBorder(Color.ORANGE);
        imgUrl = "/home/mars/NetBeansProjects/practice/src/GUI/images/valid.png";
        btnIcon = new ImageIcon(imgUrl);
        counties = new String[]{"Nairobi", "Mombasa", "Kisumu", "Nakuru", "Garissa", "Kilifi", "Bungoma", "Kakamega", "Muranga", "Kiambu", "Machakos", "Kisii", "Baringo"};

        identityPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        computationPanel = new JPanel(new GridLayout(4, 2));

        tfEmail = new JTextField("name@example.com", 10);
        tfEmail.setEditable(true);
        tfOtherName = new JTextField("Enter valid names", 15);
        tfOtherName.setEditable(true);
        tfSurname = new JTextField("Enter a valid name", 15);
        tfSurname.setEditable(true);
        tfIdNumber = new JTextField("8-digits", 10);
        tfIdNumber.setEditable(true);
        tfPhone = new JTextField("+254-XXX-XXX-XXX", 15);
        tfPhone.setEditable(true);
        tfPostalCode = new JTextField("XXXX", 15);
        tfPostalCode.setEditable(true);
        taAddress = new JTextArea(10, 10);
        taAddress.setEditable(true);
        tfYears = new JTextField(10);
        tfYears.setEditable(true);
        tfMnthPaymnt = new JTextField("Kshs", 10);
        tfMnthPaymnt.setEditable(true);
        tfAnnualInterestRate = new JTextField("%", 10);
        tfAnnualInterestRate.setEditable(true);
        tfTotalPaymnt = new JTextField(10);
        tfTotalPaymnt.setEditable(true);
        tfCounty = new JComboBox(counties);
        tfCounty.setSelectedIndex(0);
        tfCounty.setForeground(Color.ORANGE);
        tfCounty.setBackground(Color.white);
        tfLnAmt = new JTextField("Kshs", 10);
        tfLnAmt.setEditable(true);
        rbtnFemale = new JRadioButton("Female");
        rbtnMale = new JRadioButton("Male");
        btnSubmit = new JButton("submit", btnIcon);

        //Identity Panel--Personal Details
        identityPanel.add(new JLabel("Surname: "), Font.SANS_SERIF);
        identityPanel.add(tfSurname);
        identityPanel.add(new JLabel("Other Name: "), Font.SANS_SERIF);
        identityPanel.add(tfOtherName);
        identityPanel.add(new JLabel("ID Number: "), Font.SANS_SERIF);
        identityPanel.add(tfIdNumber);
        identityPanel.setOpaque(false);
        identityPanel.setBackground(Color.ORANGE);
        identityPanel.setForeground(Color.BLACK);
        identityPanel.setBorder(new TitledBorder(blackLine, "Personal Details", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, tFont, Color.ORANGE));

        //compute Panel
        computationPanel.add(new JLabel("Address: "));
        computationPanel.add(taAddress);
        computationPanel.add(new JLabel("Email: "));
        computationPanel.add(tfEmail);
        computationPanel.add(new JLabel("Phone: "));
        computationPanel.add(tfPhone);

        computationPanel.setOpaque(false);
        computationPanel.setBackground(Color.ORANGE);
        computationPanel.setForeground(Color.BLACK);
        computationPanel.setBorder(new TitledBorder(blackLine, "Loan Calculator", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, tFont, Color.ORANGE));

        mainPanel.add(identityPanel);
        mainPanel.add(computationPanel);

        mainFrame.add(mainPanel);
        mainFrame.setSize(getDimension());
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Dimension getDimension() {
        Dimension panelSize = mainPanel.getPreferredSize();
        return panelSize;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoanCalculator(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
