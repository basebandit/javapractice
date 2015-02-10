/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author mars
 */
public class ButtonThread extends JFrame {

    private final String USER_HOME = System.getProperty("user.home");
    private final String desktop = USER_HOME + "/Desktop";
    private JPanel detailsPanel;
    private JPanel tablePanel;
    private JSONObject jsonObj = new JSONObject();
    private JSONArray jsonArray = new JSONArray();
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblAge;
    private JLabel lblCourse;
    private JLabel lblDepartment;
    private JLabel lblDateOfAdmission;
    private JTextField txtFName;
    private JTextField txtLName;
    private JTextField txtAge;
    private JTextField txtCourse;
    private JComboBox department;
    private JDateChooser admissionDateChooser;
    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private ButtonGroup genderBtnGroup;
    private final String addBtnIcon = "home/mars/NetBeansProjects/practice/images/add.png";
    private final String deleteBtnIcon = "home/mars/NetBeansProjects/practice/images/remove.png";

    public ButtonThread() {
        super("Threads In Swing");
        initComponents();
    }

    private void initComponents() {
        setLayout(new FlowLayout());

        lblFirstName = new JLabel("First Name: ");
        add(lblFirstName);

        txtFName = new JTextField("Enter first name", 15);
        txtFName.setEditable(true);
        txtFName.setToolTipText("Enter First Name");
        add(txtFName);

        lblLastName = new JLabel("Other Name: ");
        add(lblLastName);

        txtLName = new JTextField("Enter Other Name", 15);
        txtLName.setEditable(true);
        txtLName.setToolTipText("Enter other name");
        add(txtLName);

        lblAge = new JLabel("Age: ");
        add(lblAge);

        txtAge = new JTextField("Enter Age", 15);
        txtAge.setEditable(true);
        txtAge.setToolTipText("Enter the age");

        add(new JLabel(new ImageIcon(addBtnIcon)));
        add(new JLabel(new ImageIcon(deleteBtnIcon)));

        Thread addStudent = new Thread() {
            @Override
            public void run() {
                addStudent();
            }
        };
    }

    private void addStudent() {
        jsonObj.put("First Name:", componentToString(txtFName));
        jsonObj.put("Other Name: ", componentToString(txtLName));
        jsonObj.put("Age: ", componentToString(txtAge));
        jsonObj.put("Gender: ", componentToString(rbtnFemale));
        jsonObj.put("Course: ", componentToString(txtCourse));
        jsonObj.put("Department: ", componentToString(department));
        jsonObj.put("AdmissionDate", componentToString(admissionDateChooser));

        jsonArray.add(jsonObj);
    }

    private void writeToFile() {

    }

    private String componentToString(JComponent component) {
        String s = null;
        if (component instanceof JDateChooser) {
            JDateChooser dateChooser = (JDateChooser) component;
            s = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        } else if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            s = textField.getText();
        }
        return s;
    }

}
