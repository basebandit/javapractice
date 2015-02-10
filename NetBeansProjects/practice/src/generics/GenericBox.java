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
public class GenericBox<E> {

    //Private variable
    private E content;

    //constructor
    public GenericBox(E content) {
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content + "(" + content.getClass() + ")";
    }
}
