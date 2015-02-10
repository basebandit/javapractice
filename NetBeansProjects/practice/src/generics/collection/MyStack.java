/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.Stack;

/**
 *
 * @author mars
 */
public class MyStack {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Evanson");
        myStack.push("Mwangi");
        myStack.push("Loves");
        myStack.push("JAVA");
        myStack.push("and");
        myStack.push("ANDROID");
        System.out.println(myStack.toString());
        System.out.println(myStack.peek());
        System.out.println(myStack.empty());
    }
}
