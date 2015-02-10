/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics;
import java.util.*;
/**
 *
 * @author mars
 */
public class ArrayListWithoutGenerics {
    public static void main(String[] args){
    List strlst = new ArrayList();// List and ArrayList holds Objects
    strlst.add("alpha");// String upcast to Object implicitly
    strlst.add("beta");
    strlst.add("Charlie");
    Iterator iter = strlst.iterator();
   while(iter.hasNext()){
   String str= (String)iter.next();// need to explicitly downcast Object back to String
       System.out.println(str);
   }    
   strlst.add(new Integer(1234));
   String str = strlst.get(3)+"";
    }
}
