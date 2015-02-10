/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mars
 */
public class GenericArray {

    public <E> void addEntity(E entity) {
        List<E> lst = new ArrayList<>();
        for (E e : lst) {
            lst.add(e);
        }

    }

}
