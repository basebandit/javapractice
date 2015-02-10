/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mars
 */
public class ForEach {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        ints.add(3);
        int s = 0;
        for (int n : ints) {
            s += n;
            assert s == 6;
            System.out.println(s);
        }
    }
}
