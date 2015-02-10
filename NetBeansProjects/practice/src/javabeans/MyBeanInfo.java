/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;

import java.beans.Introspector;
import java.util.Arrays;

/**
 *
 * @author mars
 */
public class MyBeanInfo {

    public static void main(String[] args) throws IntrospectionException {

        BeanInfo myJavaBeanInfo = Introspector.getBeanInfo(MyBeanInfo.class);
        System.out.println(myJavaBeanInfo.getBeanDescriptor());
        System.out.println(Arrays.toString(myJavaBeanInfo.getEventSetDescriptors()));
        System.out.println(Arrays.toString(myJavaBeanInfo.getPropertyDescriptors()));
    }

}
