/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

/**
 *
 * @author mars
 */
public class MouseMotionWithInnerClass extends JFrame {
    
    private JTextField tfMouseClickX;
    private JTextField tfMouseClickY;
    private JTextField tfMousePositionX;
    private JTextField tfMousePositionY;
    private JButton btnOk;
    private int count = 0;
    
    public MouseMotionWithInnerClass() {
        setLayout(new FlowLayout());
        
        add(new JLabel("X-Click: "));
        tfMouseClickX = new JTextField("0", 10);
        tfMouseClickX.setEditable(false);
        add(tfMouseClickX);
        
        add(new JLabel("Y-Click: "));
        tfMouseClickY = new JTextField("0", 10);
        tfMouseClickY.setEditable(false);
        add(tfMouseClickY);
        
        add(new JLabel("Position-X: "));
        tfMousePositionX = new JTextField("0", 10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);
        
        add(new JLabel("Position-Y: "));
        tfMousePositionY = new JTextField("0", 10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);
        
        btnOk = new JButton("OK");
        add(btnOk);
        
        btnOk.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tfMouseClickX.setText(e.getX() + "");
                tfMouseClickY.setText(e.getY() + "");
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
            }
            
            public void mouseMoved(MouseEvent e) {
                tfMousePositionX.setText(e.getX() + "");
                tfMousePositionY.setText(e.getY() + "");
            }
        });
        
        addWindowListener(new WindowListener() {
            
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
            
        });
        
        setTitle("Motion Demo");
        setSize(420, 120);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MouseMotionWithInnerClass();
    }
}
