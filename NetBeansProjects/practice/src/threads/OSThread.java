/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author mars
 */
public class OSThread extends javax.swing.JFrame {
    
    private java.net.URL loaderImagePath;
    private static String OS;
    
    public OSThread() {
        
    }
    
    private void initComponents() {
        setLayout(new java.awt.FlowLayout());
        add(new javax.swing.JLabel("Progress Label"));
        add(new javax.swing.JLabel("Loader Label"));
        add(new javax.swing.JLabel("Message Label"));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup())));
    }
}
