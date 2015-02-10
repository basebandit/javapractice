/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import com.sun.imageio.plugins.common.BogusColorSpace;
import java.util.LinkedHashSet;

/**
 * Unlike HashSet, LinkedHashSet builds a link-list over the hash table for
 * better efficiency in insertion and deletion (in the expense of more complex
 * structure). It maintains its elements in the insertion-order (i.e., order of
 * add()).
 *
 * @author mars
 */
public class TestLinkedHashSet {

    private static class Book {

        private final int id;
        private final String title;

        //constructor
        public Book(int id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return id + ": " + title;
        }

        //Two Books are equal if they have the same id
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Book)) {
                return false;
            }
            return this.id == ((Book) o).id;
        }

        //Consistent with equals().Two objects which are equal have the same hash code
        @Override
        public int hashCode() {
//        int hash = 7;
//        hash = 11 * hash + this.id;
//        return hash;
            return id;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book(1, "Java for Dummies");
        Book b1Dup = new Book(1, "Java for the Dummies");
        Book b2 = new Book(2, "Java for more Dummmies");
        Book b3 = new Book(3, "more Java for more Dummies");

        java.util.Set<Book> set = new LinkedHashSet<>();
        set.add(b1);
        set.add(b1Dup);//Duplicate id ,not added
        set.add(b1);//added twice, not added
        set.add(b3);
        set.add(null);//Set can contain a null
        set.add(null);//but no duplicate
        set.add(b2);
        System.out.println(set);//[1:Java for Dummies,3: more Java for more Dummies,null,2:Java for more Dummies]
    }
}
