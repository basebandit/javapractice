/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mars
 */
public class TestMyOuterClass {

    public static void main(String[] args) {
//        MyOuterClass moc = new MyOuterClass("OuterClass");//create an instance of the outerclass
        MyOuterClass.MyInnerClass innerclass = new MyOuterClass("OuterClass").new MyInnerClass();//create an instance of the public inner class..
        //this is how we create an instance of the innerclass if it is declared public 
        //MyOuterClass.MyInnerClass2 ic2 = moc.new MyInnerClass2("innerClass2"); this wont work..you cant create an instance of an innerclass declared
        //private outside the context of the Outer/Parent/TopLevel class
    }
}
