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
public class HelloWorldWithGeneric {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("World");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello World");
        System.out.println(s);
    }
}
