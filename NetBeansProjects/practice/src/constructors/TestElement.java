/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author mars
 */
public class TestElement {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Element e1, e2, e3;
        e1 = new Element("Hydrogen", 1, "H", 1.008, 1, 1);
        e2 = new Element("Gold", 79, "Au", 197.0, 6, 11);
        e3 = new Element("Oxygen", 8, "O", 16.0, 2, 16);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
