/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;

/**
 *
 * @author mars
 */
public class AWTToolBarFrame extends Frame {

    private Button btnCut, btnCopy, btnPaste;
    private Panel toolbar;
    private ActionListener printListener;

    public AWTToolBarFrame() {
        super("AWT ToolBar Demo");
        toolbar = new Panel(new FlowLayout());
        printListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand()); //To change body of generated methods, choose Tools | Templates.
            }
        };
        btnCut = new Button("Cut");
        btnCut.addActionListener(printListener);
        toolbar.add(btnCut);
        btnCopy = new Button("Copy");
        btnCopy.addActionListener(printListener);
        toolbar.add(btnCopy);
        btnPaste = new Button("Paste");
        btnPaste.addActionListener(printListener);
        toolbar.add(btnPaste);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(toolbar, BorderLayout.NORTH);
        setSize(450, 250);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AWTToolBarFrame();
    }

}
