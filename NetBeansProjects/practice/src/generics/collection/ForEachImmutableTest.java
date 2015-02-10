/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mars
 */
public class ForEachImmutableTest {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("mwass");
        System.out.println(lst);//[alpha,beta,charlie]

        for (String str : lst) {
            str += "change!";//cannot modify "immutable" objects
        }
        System.out.println(lst); //[alpha,beta,charlie]

    }
}
