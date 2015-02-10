/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author mars
 */
public class StudentApp extends JFrame {
    private JButton btnLogin;
    private JButton btnCancel;
    private JTextField tfUsrnm;
    private JTextField tfPswd;
    
    
    public StudentApp(){
    initComponents();
    }
    private void initComponents(){
        this.getContentPane().setLayout(new BorderLayout());
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        tfUsrnm = new JTextField(10);
        tfPswd = new JTextField(10);
    }
}
