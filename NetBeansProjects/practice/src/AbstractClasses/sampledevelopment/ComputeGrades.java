/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses.sampledevelopment;
//import java.io.PrintStream;
/**
 *
 * @author mars
 */
public class ComputeGrades extends MainWindow {
   
    private static final int DEFAULT_SIZE = 25;
    private OutputBox outputBox;
    //private Student[] roster;

    public ComputeGrades() {
        this(DEFAULT_SIZE);
    }

    public ComputeGrades(int arraySize) {
        super();//an explicit call to the superclass constructor
        //outputBox = new outputBox(this);
       // roster = new Student[arraySize];
    }

    //-------------------------------------------------------
    //Main
    //-------------------------------------------------------
    public static void main(String[] args) {
     //   this.setVisible(true);
       // outputBox.setVisible(true);
        //boolean success = readData();
//        if (success) {
//            computeGrade();
//            printResult();
//        } else {
//            outputBox.println("File Input Error");
//        }
//    }
//
//    private void computeGrade() {
//        outputBox.println("Inside computeGrade");//TEMP
//    }
//
//    private void printResult() {
//        outputBox.println("Inside printResult");//TEMP
//    }

//    private boolean readData() {
//        outputBox.println("Inside readData");//TEMP
//        return true;
   }
}
