/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mars
 */
public class GenericCollections {

    private static void printCollection(Collection<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Collection<String> strCollection = new ArrayList<>();
        strCollection.add(new String("Hello,I am just a collection"));
        strCollection.add(new String("I hope we'll see each other oftenly"));
        printCollection(strCollection);
    }
}
