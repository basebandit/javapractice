/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mars
 */
public class ListToArray {
    
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("mwass");

        //Use the Object[] version
        Object[] strArray1 = lst.toArray();
        System.out.println(Arrays.toString(strArray1));//[alpha,beta,mwass]

        //Use the generic type version-Need to specify the type in the argument
        String[] strArray2 = lst.toArray(new String[0]);
        strArray2[0] = "delta"; //modify the returned array
        System.out.println(Arrays.toString(strArray2));
    }
}
