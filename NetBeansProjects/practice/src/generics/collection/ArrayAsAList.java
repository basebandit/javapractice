/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mars
 */
public class ArrayAsAList {

    public static void main(String[] args) {
        String[] strs = {"alpha", "beta", "mwass"};
        System.out.println(Arrays.toString(strs));//[alpha,beta,mwass]

        List<String> lst = Arrays.asList(strs);
        System.out.println(lst);//[alpha,beta,mwass]

        //change in array or list write-thru
        strs[0] += "88";
        lst.set(2, lst.get(2) + "99");
        System.out.println(Arrays.toString(strs));
        System.out.println(lst);

        //Initialize a List using an Array
        List<Integer> intLst = Arrays.asList(22, 33, 44, 55, 66, 77);
        System.out.println(intLst.size());
        System.out.println(intLst);
    }
}
