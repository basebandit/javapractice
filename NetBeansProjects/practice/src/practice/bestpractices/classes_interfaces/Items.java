/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.bestpractices.classes_interfaces;

/**
 *
 * @author mars
 */
public class Items {

    // public static final Items[] MY_ITEMS = {};//potential security hole
    private static final Items[] PRIVATE_ITEMS = {};

    public static final Items[] PRIVATE_ITEMS() {
        return PRIVATE_ITEMS().clone();
    }
;
}
