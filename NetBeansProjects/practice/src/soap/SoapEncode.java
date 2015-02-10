/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import java.lang.reflect.Field;

/**
 *
 * @author mars
 */
public class SoapEncode {

    public <E> void soapEncode(E o) throws IllegalAccessException {
        Field[] fields = o.getClass().getFields();
        System.out.print("\n" + "<" + o + ">");
        for (int i = 0; i < fields.length; i++) {
            serialize(fields[i].get(o), fields[i].getName());
        }
    }

    public <E> void serialize(E obj, String string) {
        if (obj instanceof Object) {
            System.out.print("\n<" + obj + "xsi:type=\"xsd:string\">");
            System.out.print("</" + obj + ">\n");
        }
    }
    public static A obj = new A();

    public static class A {

        public B obj = new B();
    }

    public static class B {

        public int a = 6;
        public String b = new String("hello world");
    }

    public static void main(String[] args) throws IllegalAccessException {
        SoapEncode mySoapRequest = new SoapEncode();
        mySoapRequest.soapEncode(new B().b);
    }
}
