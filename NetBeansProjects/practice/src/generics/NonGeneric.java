/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mars
 */
public class NonGeneric {
    public static void main(String[] args){
     List words = new ArrayList();
     words.add(new String("Hello "));
     words.add(new String("world!"));
     String s = ((String)words.get(0))+((String)words.get(1));
     assert s.equals("Hello World");
        System.out.println(s);
    }
}
