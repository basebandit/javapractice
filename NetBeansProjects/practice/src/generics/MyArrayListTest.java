/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author mars
 */
public class MyArrayListTest {

    public static void main(String[] args) {
        //Intends to hold a list of Strings,but not type-safe
        MyArrayList strLst = new MyArrayList();
        //adding String elements  - implicitly upcast to Object
        strLst.add("alpha");
        strLst.add("beta");
        //retrieving - need to explicitly downcast back to String
        for (int i = 0; i < strLst.size(); i++) {
//            String str = (String) strLst.get(i);compile ok, runtime ClassCastException...But i have circumvented this
            //problem by adding + "" at the end of strLst.get(i)====> strLst.get(i) +"";
            String str = strLst.get(i) + "";
            System.out.println(str);
        }
        //Inadvertently adding a non-String object will cause a runtime
        //ClassCastException. Compiler unable to catch the error.
        strLst.add(new Integer(1234));// compiler/runtime cannot detect this error
        for (int i = 0; i < strLst.size(); i++) {
            //String str = (String) strLst.get(i);compile ok, runtime ClassCastException...But i have circumvented this
            //problem by adding + "" at the end of strLst.get(i)====> strLst.get(i) +"";
            String str = strLst.get(i) + "";
            System.out.println(str);
        }
    }
}
