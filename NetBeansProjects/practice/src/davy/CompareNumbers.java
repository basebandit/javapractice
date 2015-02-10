/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davy;

import java.awt.HeadlessException;
import java.text.MessageFormat;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mars
 */
public class CompareNumbers {

    private static final java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int largest = 0, large;
        JOptionPane.showMessageDialog(null, "Enter three numbers: ");

        try {
            String num1 = JOptionPane.showInputDialog(null, "Enter The First Integer");
            String num2 = JOptionPane.showInputDialog(null, "Enter The Second Integer");
            String num3 = JOptionPane.showInputDialog(null, "Enter The Third Integer");
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            int int3 = Integer.parseInt(num3);
            SortedSet<Integer> set = new TreeSet<>();
            set.add(int1);
            set.add(int2);
            set.add(int3);

            Integer[] a = set.toArray(new Integer[3]);
            //Outer loop determines the number of passes that the inner loop will loop
            for (int k = 1; k < a.length - 1; k++) {
                //Inner loop compares adjacent pairs then 'sinks' the largest element to the bottom(end) of the array.
                for (int i = 0; i < a.length - k; i++) {
                    if (a[k] > a[k + 1]) {
                        int temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
                }
            }
            //Retrieves the largest element in the now sorted array.
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    JOptionPane.showMessageDialog(null, MessageFormat.format("largest is : {0}", a[a.length - 1]));
                }
            }
        } catch (HeadlessException e) {
            System.err.println("Error");
        }
    }
}
