/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class SingletonClass {

    public static SingletonClass instance;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        if (s1 == s2) {
            System.out.println("The objects are the same.");
        } else {
            System.out.println("The objects are not the same.");
        }
    }
}
