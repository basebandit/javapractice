/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;//Using AWT container and component classes
import java.awt.event.*;//Using AWT event classes and listener interfaces

/**
 *
 * @author mars
 */
//An AWT program inherits from the top-levle container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {

    private final Label lblCount;//Declare component Label
    private final TextField tfCount;//Declare component TextField
    private final Button btnCount;//Declare component Button
    private int count = 0;

    /**
     * Constructor to setup GUI components and event handling
     */
    public AWTCounter() {
        setLayout(new FlowLayout());
        //"super" Frame sets its Layout to FLowLayout, which arranges the components
        //from left-to-right,and flow to the next row from top-to-bottom

        lblCount = new Label("Counter");//construct Label
        add(lblCount);//"super" Frame adds Label

        tfCount = new TextField("0", 10);//construct TextField 
        tfCount.setEditable(false);//set to read-only
        add(tfCount);//"super" Frame adds tfCount

        btnCount = new Button("Count");//construct Button
        add(btnCount);//"super" Frame adds button

        btnCount.addActionListener(this);
        //Clicking Button source fires ActionEvent
        //btnCount registers this instance as ActionEvent Listener
        setTitle("AWTCounter");//"super" Frame sets Title
        setSize(250, 100);//"super" Frame sets initial window size

        System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount);
        setVisible(true);// "super" Frame shows

        System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount);
    }

    /**
     * The entry main() method
     *
     * @param args
     */
    public static void main(String[] args) {
        //Invoke the constructor to setup the GUI,by allocating an instance
        AWTCounter app = new AWTCounter();
    }

    /**
     * ActionEvent handler - Called back upon button-click.
     *
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;//increase the counter value
        //Display the counter value on the  TextField tfCount
        tfCount.setText(count + "");// convert int to String
    }
}
