/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class Duodecaphobia {

    public static void main(String[] args) {
        System.out.println(getRandomNumber());
    }

    public static int getRandomNumber() {
        while (true) {
            int num = (int) (Math.random() * 20) + 1;
            if (num != 12) {
                return num;
            }
        }

//        return num;
    }
}
