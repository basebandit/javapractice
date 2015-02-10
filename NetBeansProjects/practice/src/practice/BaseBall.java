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
public class BaseBall extends Ball{

    /**
     *
     */
    public BaseBall() {
        setWeight(5.125);
        setColor("Orange");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        BaseBall b1 = new BaseBall();
        System.out.println(b1);
    }
}
