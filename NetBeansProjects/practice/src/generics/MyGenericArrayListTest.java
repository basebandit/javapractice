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
public class MyGenericArrayListTest {

    public static void main(String[] args) {
        //type safe to hold a list of strings
        MyGenericArrayList<String> strLst = new MyGenericArrayList<>();

        strLst.add("alpha");
        strLst.add("beta");

        for (int i = 0; i < strLst.size(); ++i) {
            String str = strLst.get(i);
            System.out.println(str);
        }
        strLst.add(new Integer(1234) + "");
        for (int i = 0; i < strLst.size(); ++i) {
            String str = strLst.get(i);
            System.out.println(str);
        }
    }
}
