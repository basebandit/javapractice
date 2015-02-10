/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.HashSet;

/**
 * We need to provide an equals() method, so that the Set implementation can
 * test for equality and duplication. In this example, we choose the id as the
 * distinguishing feature. We override equals() to return true if two books have
 * the same id. We also override the hashCode() to be consistent with equals().
 *
 * @author mars
 */
public class TestHashSet {

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

    /**
     * A Set cannot hold duplicate element. The elements are check for
     * duplication via the overridden equal(). A Set can hold a null value as
     * its element (but no duplicate too). The addAll() and retainAll() perform
     * set union and set intersection operations, respectively.
     *
     * Take note that the arrangement of the elements is arbitrary, and does not
     * correspond to the order of add().
     *
     * @param args
     */
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java for Dummies");
        Book b1Dup = new Book(1, "Java for the Dummies");
        Book b2 = new Book(2, "Java for more Dummies");
        Book b3 = new Book(3, "more Java for more Dummies");

        java.util.Set<Book> set1 = new HashSet<>();
        set1.add(b1);
        set1.add(b1Dup);//duplicate id,not added
        set1.add(b1);//added twice,not added
        set1.add(b3);
        set1.add(null);//Set can contain a null
        set1.add(null);//but no duplicate
        set1.add(b2);

        System.out.println(set1);//[null,1:Java for Dummies,2: Java for more Dummies, 3: more Java for more Dummies]

        set1.remove(b1);
        set1.remove(b3);
        System.out.println(set1);//[null,2: Java for more Dummies]

        java.util.Set<Book> set2 = new HashSet<>();
        set2.add(b3);
        System.out.println(set2);//[3: more Java for more Dummies]
        set2.addAll(set1);//"union" with set1
        System.out.println(set2);//[null,2: Java for more Dummies,3: more Java for more Dummies]

        set2.remove(null);
        System.out.println(set2);//[2: Java for more Dummies,3: more Java for more Dummies]
        set2.retainAll(set1);//"intersection" with set1
        System.out.println(set2);//[2: Java for more Dummies]
    }
}
