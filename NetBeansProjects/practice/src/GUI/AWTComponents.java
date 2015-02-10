/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
/**
 *
 * @author mars
 */
public class AWTComponents {

    /**
     *
     *
     * *The Label class has three constructors:
     *
     * The first constructor constructs a Label object with the given text
     * string in the given alignment. Note that three static constants
     * Label.LEFT, Label.RIGHT, and Label.CENTER are defined in the class for
     * you to specify the alignment (rather than asking you to memorize
     * arbitrary integer values). The second constructor constructs a Label
     * object with the given text string in default of left-aligned. The third
     * constructor constructs a Label object with an initially empty string. You
     * could set the label text via the setText() method later. /
     *
     * @param strLabel
     */
    
    /*
     *  Constructors
     */
         //public Label(String strLabel, int alignment); // Construct a Label with
        //the given text String, of the text alignment public Label(String strLabel); // Construct a Label with the given text String public
       //Label(); // Construct an initially empty Label
    
    /**
     * Constants
     */
     //public static final LEFT;    // Label.LEFT
    //public static final RIGHT;   // Label.RIGHT
   //public static final CENTER;  // Label.CENTER
    
    /**
     * Constructors

public Button(String buttonLabel);
   // Construct a Button with the given label
public Button();
   // Construct a Button with empty label

The Button class has two constructors. The first constructor creates a Button object with the given label painted over the button. The second constructor creates a Button object with no label.

Public Methods

public String getLabel();
   // Get the label of this Button instance
public void setLabel(String buttonLabel);
   // Set the label of this Button instance
public void setEnable(boolean enable);   
   // Enable or disable this Button. Disabled Button cannot be clicked.
     */
    
    /*
     *Constructors

public TextField(String strInitialText, int columns);
   // Construct a TextField instance with the given initial text string with the number of columns.
public TextField(String strInitialText);
   // Construct a TextField instance with the given initial text string.
public TextField(int columns);
   // Construct a TextField instance with the number of columns.

Public Methods

public String getText();
   // Get the current text on this TextField instance
public void setText(String strText);
   // Set the display text on this TextField instance
public void setEditable(boolean editable);
   // Set this TextField to editable (read/write) or non-editable (read-only)
     */
}
