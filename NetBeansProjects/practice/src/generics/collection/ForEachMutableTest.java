/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.List;
import java.util.ArrayList;

/**
 * Using Enhanced for-loop on Collection of Mutable Objects (such as
 * StringBuilder)
 *
 * @author mars
 */
public class ForEachMutableTest {

    public static void main(String[] args) {
        List<StringBuilder> lst = new ArrayList<>();
        lst.add(new StringBuilder("alpha"));
        lst.add(new StringBuilder("beta"));
        lst.add(new StringBuilder("mwass"));
        System.out.println(lst);//[alpha,beta,mwass]

        for (StringBuilder sb : lst) {
            sb.append("88");//can modify "mutable" objects
        }

        System.out.println(lst);//[aplha88,beta88,mwass88]
    }
}
