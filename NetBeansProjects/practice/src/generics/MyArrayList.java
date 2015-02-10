/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 * A dynamically allocated array which holds a collection of java.lang.Object -
 * without generic
 *
 * The MyArrayList is not type-safe. For example, if we create a MyArrayList
 * which is meant to hold String, but added in an Integer. The compiler cannot
 * detect the error. This is because MyArrayList is designed to hold Objects and
 * any Java classes can be upcast to Object.
 *
 * @author mars
 */
public class MyArrayList {

    private int size;//number of elements
    private Object[] elements;

    public MyArrayList() {//constructor
        elements = new Object[10];//allocate initial capacity of 10
        size = 0;
    }

    public void add(Object o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
            //allocate a larger array and add the element,omitted
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public int size() {

        return size;
    }
}
