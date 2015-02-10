/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Label;

/**
 *
 * @author mars
 */
public class TestLabel{

    private static Label lblInput; // Declare an Label instance called lblInput

    public static void main(String[] args) {
        lblInput = new Label("Enter ID");// Construct by invoking a constructor via the new operator
        lblInput.setText("Enter Password");/// Modify the Label's text string
        System.out.println(lblInput.getText());// Retrieve the Label's text string
    }
}
