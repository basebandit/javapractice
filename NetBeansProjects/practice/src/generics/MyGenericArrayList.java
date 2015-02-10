/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author mars
 * @param <E>
 */
public class MyGenericArrayList<E> {

    private int size;
    private Object[] elements;

    public MyGenericArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            //allocate a larger array and add the element, omitted
        }
        ++size;
    }

    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }
}
