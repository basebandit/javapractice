/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
 *
 * @author mars
 */
public class MainGui extends JFrame {

    //Declare variables
    //array Lists
    String[] columnNames = new String[]{"GENDER", "NAME", "COURSE", "YEAR", "ID"};
    Object[][] data = new Object[25][5];
    //table[
    JTable table;
    //frames
    JFrame frame, frame1;
    //panels
    JPanel buttonPanel, buttonPanel2, tablePanel, addPanel, editPanel;
    //labels
    JLabel labelGender, labelName, labelCourse, labelYear, labelID;
    //textfields
    JTextField txtGender, txtName, txtCourse, txtYear, txtID;
    //buttons
    JButton btnAdd, btnEdit, btnDelete, btnSort, btnSave, btnAddInput, btnCancel;
    //additionals
    int keyCode, rowIndex, rowNumber, noOfStudents;
    //button Handler
    ButtonHandler bh = new ButtonHandler();

    public MainGui() {
        this.table = new JTable(data, columnNames) {

            //sets the ability of the cells to be edited by the user
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//return false,cannot be edited
            }
        };
        //setting/modifying table components
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(new RowListener());
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollPane = new JScrollPane(table);

        //main buttons
        btnAdd = new JButton("ADD");
        btnAdd.addActionListener(bh);
        btnEdit = new JButton("EDIT");
        btnEdit.addActionListener(bh);
        btnEdit.setEnabled(false);//disables the component
        btnDelete = new JButton("DELETE");
        btnDelete.addActionListener(bh);
        btnDelete.setEnabled(false);//disables the component
        btnSort = new JButton("SORT");
        btnSort.addActionListener(bh);
        btnSave = new JButton("SAVE");
        btnSave.addActionListener(bh);

        //with button Listeners
        //sub buttons
        btnAddInput = new JButton("Add");
        btnAddInput.addActionListener(bh);
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(bh);

        //set label names
        labelGender = new JLabel("GENDER");
        labelName = new JLabel("NAME");
        labelCourse = new JLabel("COURSE");
        labelYear = new JLabel("YEAR");
        labelID = new JLabel("ID");

        //set text fields width
        txtGender = new JTextField(20);
        txtName = new JTextField(20);
        txtCourse = new JTextField(20);
        txtYear = new JTextField(20);
        txtYear.setDocument(new JTextFieldLimit(1));//limits the length of input:max of 1
        txtYear.addKeyListener(keyListener);//accepts only numerals
        txtID = new JTextField(20);
        txtID.setDocument(new JTextFieldLimit(7));//limits the length of input max of 7
        txtID.addKeyListener(keyListener);//accepts only numerals

        //mainframe
        //panel for the table
        tablePanel = new JPanel();
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.PAGE_AXIS));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        tablePanel.add(table.getTableHeader());
        tablePanel.add(table);

        //panel for the main buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //positions the main buttons
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(btnAdd, c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        buttonPanel.add(btnEdit, c);
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        buttonPanel.add(btnDelete, c);
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(btnSort, c);
        c.gridx = 0;
        c.gridy = 4;
        c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(btnSave, c);

        frame = new JFrame("Students Database");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(tablePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.EAST);
        frame.pack();

        //ADD frame
        //panel for adding
        addPanel = new JPanel();
        addPanel.setLayout(new GridBagLayout());

        //positions the components for adding
        //labels
        c.insets = new Insets(1, 0, 1, 1);
        c.gridx = 0;
        c.gridy = 0;
        addPanel.add(labelID, c);
        c.gridy = 1;
        addPanel.add(labelName, c);
        c.gridy = 2;
        addPanel.add(labelCourse, c);
        c.gridy = 3;
        addPanel.add(labelYear, c);
        c.gridy = 4;
        addPanel.add(labelGender, c);
        // text fields
        c.gridx = 1;
        c.gridy = 0;
        c.ipady = 1;
        addPanel.add(txtID, c);
        c.gridy = 1;
        c.ipady = 1;
        addPanel.add(txtName, c);
        c.gridy = 2;
        c.ipady = 1;
        addPanel.add(txtCourse, c);
        c.gridy = 3;
        c.ipady = 1;
        addPanel.add(txtYear, c);
        c.gridy = 4;
        c.ipady = 1;
        addPanel.add(txtGender, c);

        // panel for other necessary buttons
        buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new GridLayout(1, 1));
        buttonPanel2.add(btnAddInput);
        buttonPanel2.add(btnCancel);

        frame1 = new JFrame("Student Database");
        frame1.setVisible(false);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame1.add(addPanel, BorderLayout.CENTER);
        frame1.add(buttonPanel2, BorderLayout.PAGE_END);
        frame1.pack();
    }// end

    KeyListener keyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            keyCode = e.getKeyCode();

            if (!(keyCode >= 48 && keyCode <= 57) && !(keyCode >= 96 && keyCode <= 105)
                    && !(keyCode >= 37 && keyCode <= 40) && !(keyCode == 127 || keyCode == 8)) {
                txtID.setEditable(false);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            txtID.setEditable(true);
        }
    };

    class RowListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                rowIndex = table.getSelectedRow();
                if (data[rowIndex][0] == null || data[rowIndex][0] == "") {
                    btnEdit.setEnabled(false);
                    btnDelete.setEnabled(false);
                } else {
                    btnEdit.setEnabled(true);
                    btnDelete.setEnabled(true);
                }
            }
        }
    }// end

    class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//         try {
            switch (e.getActionCommand()) {
                case "ADD":
                    // text fields for Student input data
                    txtGender.setText("");
                    txtName.setText("");
                    txtCourse.setText("");
                    txtYear.setText("");
                    txtID.setText("");
                    frame1.setTitle("Add Student data"); // title bar name for add
                    btnAddInput.setActionCommand("Add2");
                    btnAddInput.setText("ADD");
                    frame1.setVisible(true); // sets the visibility of frame1
                    break;
                case "EDIT":
                    txtID.setText(data[rowIndex][4] + ""); // will preview the ID
                    // input during Add
                    txtName.setText(data[rowIndex][1] + ""); // will preview the Name
                    // input during Add
                    txtCourse.setText(data[rowIndex][2] + ""); // will preview the
                    // Course input during
                    // Add
                    txtYear.setText(data[rowIndex][3] + ""); // will preview the Year
                    // input during Add
                    txtGender.setText(data[rowIndex][0] + ""); // will preview the
                    // Gender input during
                    // Add
                    txtID.setEditable(false); // forbids the user to edit the entered
                    // ID number
                    frame1.setTitle("Edit Student data"); // title bar name for edit
                    btnAddInput.setActionCommand("Edit2");
                    btnAddInput.setText("ACCEPT");
                    frame1.setVisible(true); // sets the visibility of frame1
                    break;
                case "DELETE":
                    int confirm = JOptionPane.showConfirmDialog(frame, "ARE YOU SURE?", "CONFIRM",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == 0) {
                        rowIndex = table.getSelectedRow();
                        rowNumber = 0;

                        noOfStudents--;
                        for (int i = 0; i <= 10; i++) {
                            if (rowIndex != i && i <= noOfStudents) {
                                data[rowNumber][4] = data[i][4];
                                data[rowNumber][1] = data[i][1];
                                data[rowNumber][2] = data[i][2];
                                data[rowNumber][3] = data[i][3];
                                data[rowNumber][0] = data[i][0];
                                rowNumber++;
                            } else if (rowIndex != i && i > noOfStudents) {
                                data[rowNumber][4] = "";
                                data[rowNumber][1] = "";
                                data[rowNumber][2] = "";
                                data[rowNumber][3] = "";
                                data[rowNumber][0] = "";
                                rowNumber++;
                            }
                        }
                        if (noOfStudents == 50) // if the number of students id equal
                        // to 50, can no longer add students
                        {
                            btnAdd.setEnabled(false);
                        } else {
                            btnAdd.setEnabled(true); // continues to add students if
                        }                                              // not equal to 50
                        if (noOfStudents == 0) {
                            btnDelete.setEnabled(false);
                            btnEdit.setEnabled(false);
                        } else {
                            btnDelete.setEnabled(true);
                            btnEdit.setEnabled(true);
                        }

                        rowIndex = table.getSelectedRow();
                        if (data[rowIndex][0] == null || data[rowIndex][0] == "") {
                            btnEdit.setEnabled(false);
                            btnDelete.setEnabled(false);
                        } else {
                            btnEdit.setEnabled(true);
                            btnDelete.setEnabled(true);
                        }

                        table.updateUI();

                    }
                    break;
                case "Add2":
                    if (txtID.getText().isEmpty() || txtName.getText().isEmpty()
                            || txtCourse.getText().isEmpty()// /
                            || txtYear.getText().isEmpty() || txtGender.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "PLEASE FILL IN THE BLANKS.", "ERROR!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        int dup = 0;
                        for (int i = 0; i < 10; i++) {
                            if (txtID.getText().equals(data[i][0])) {
                                JOptionPane.showMessageDialog(null, "ID NUMBER ALREADY EXISTS.", "ERROR!",
                                        JOptionPane.ERROR_MESSAGE);
                                dup++;
                                break;
                            }
                        }
                        if (dup == 0) {
                            rowIndex = table.getSelectedRow();
                            data[noOfStudents][4] = txtID.getText();
                            data[noOfStudents][1] = txtName.getText();
                            data[noOfStudents][2] = txtCourse.getText();
                            data[noOfStudents][3] = txtYear.getText();
                            data[noOfStudents][0] = txtGender.getText();

                            table.updateUI();
                            frame1.dispose();
                            noOfStudents++;
                            if (noOfStudents == 50) {
                                btnAdd.setEnabled(false);
                            } else {
                                btnAdd.setEnabled(true);
                            }
                            if (data[rowIndex][0] == null) {
                                btnEdit.setEnabled(false);
                                btnDelete.setEnabled(false);
                            } else {
                                btnEdit.setEnabled(true);
                                btnDelete.setEnabled(true);
                            }
                        }
                    }
                    table.updateUI();
                    break;
                case "Edit2":
                    if (txtID.getText().isEmpty() || txtName.getText().isEmpty()
                            || txtCourse.getText().isEmpty() || txtYear.getText().isEmpty()
                            || txtGender.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "INCOMPLETE INPUT.", "ERROR!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        data[rowIndex][4] = txtGender.getText();
                        data[rowIndex][1] = txtName.getText();
                        data[rowIndex][2] = txtCourse.getText();
                        data[rowIndex][3] = txtYear.getText();
                        data[rowIndex][0] = txtID.getText();
                        frame1.dispose();
                    }
                    table.updateUI();
                    break;
                case "Cancel":
                    frame1.dispose();
                    break;
            }
        }
    }// end

    class JTextFieldLimit extends PlainDocument {

        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        JTextFieldLimit(int limit, boolean upper) {
            super();
            this.limit = limit;
        }

        public void insertString(int offset, String str, AttributeSet attr)
                throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }// end

    public static void main(String[] args) {
        new MainGui();
    }// end of main

}// end of class
