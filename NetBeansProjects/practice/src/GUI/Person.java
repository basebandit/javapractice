/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class Person extends JFrame {

    private String name;
    private String address;
    private int age;
    private static final JFrame myFrame = new JFrame();
    private static Scanner sc;

    public Person(String name, String address, int age) {
        Container contentPane = getContentPane();
        this.name = name;
        this.address = address;
        this.age = age;
        setSize(300, 200);
        setLocation(150, 250);
        setResizable(false);
        setTitle("Person Details");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setNewName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getNewName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person me = new Person("mars", "town", 24);
        enterName();
        enterAddress();
        enterAge();
    }

    public static void enterName() {
        while (true) {
            try {
                String myname;
                sc = new Scanner(System.in);
                JOptionPane.showInputDialog(myFrame, "Enter Your Name");
                myname = sc.next();

            } catch (Exception e) {
                sc.nextLine();
                JOptionPane.showMessageDialog(myFrame, "Invalid name!\nTry Again.");
            }
        }
    }

    public static void enterAddress() {
        while (true) {
            try {
                JOptionPane.showInputDialog(myFrame, "Enter Your Address");
                String myAddress;
                myAddress = sc.next();
            } catch (Exception e) {
                sc.nextLine();
                JOptionPane.showMessageDialog(myFrame, "Invalid Address!\nTry Again.");
            }
        }
    }

    public static void enterAge() {
        while (!sc.hasNextInt()) {
            try {
                int myAge;
                JOptionPane.showInputDialog(myFrame, "Enter Your Age");
                myAge = sc.nextInt();
            } catch (Exception e) {
                sc.nextInt();
                JOptionPane.showMessageDialog(myFrame, "Invalid Age!\nTry Again.");
            }
        }
    }
}
