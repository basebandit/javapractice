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
public class AnonymousInstance {

    // Allocate an anonymous Label instance. "this" container adds the instance into itself.
// You CANNOT reference an anonymous instance to carry out further operations.
   /*  add(new Label("Enter Name: ",Label.RIGHT));
     *
     */
    //same as
    Label lblXxx = new Label("Enter name: ", Label.RIGHT);//lblXxx assigned by compiler
}
