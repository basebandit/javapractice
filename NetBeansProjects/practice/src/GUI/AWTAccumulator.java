/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author mars
 */
public class AWTAccumulator extends Frame implements ActionListener {

    private final Label lblInput;//Declare input Label
    private final Label lblOutput;//Declare output Label
    private final TextField tfInput;//Declare input TextField
    private final TextField tfOutput;//Declare output TextField
    private int numberIn;//Input number
    private int sum = 0;//Accumulated sum,init to 0 

    /**
     * Constructor to setup the UI components and event handling
     */
    public AWTAccumulator() {
        setLayout(new FlowLayout());
        //"super" Frame sets Layout to FlowLayout,which arranges the components
        //from left-to-right,and flow to next row from top-to-bottom.
        lblInput = new Label("Enter an Integer: ");//Construct a label
        add(lblInput);//"super" Frame adds TextField

        tfInput = new TextField(10);//Construct TextField
        add(tfInput);//"super" Frame adds TextField

        tfInput.addActionListener(this);//registers actionListener which implements the appropriate XxxListener interface
        //Hitting Enter on the TextField fires ActionEvent
        //tfInput (TextField) registers this instance as ActionEvent listener

        lblOutput = new Label("The Accumulated Sum is: ");// allocate label
        add(lblOutput);//"super" Frame adds Label

        tfOutput = new TextField(10);//allocate TextField
        tfOutput.setEditable(false);//read-only
        add(tfOutput);

        setTitle("AWTAccumulator");//"super" Frame sets title
        setSize(350, 120);//"super" Frame sets initial window size
        setVisible(true);//"super" Frame shows
    }

    /**
     * The entry main() method
     *
     * @param args
     */
    public static void main(String[] args) {
        //invoke the constructor to setup the GUI,by allocating an anonymous instance
        new AWTAccumulator();
    }

    /**
     * ActionEvent handler -Called back upon button-click
     *
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        //Get the string entered int the TextField tfInput,convert to int
        numberIn = Integer.parseInt(tfInput.getText());
        sum += numberIn;
        tfInput.setText("");//Clear Input Textfield
        tfOutput.setText(sum + "");//Display sum on the output TextField convert int to String
    }
}
