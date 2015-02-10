/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author mars
 */
public class TestTreeSetComparable {

    /**
     * *
     * This AddressBookEntry class implements Comparable, in order to be used in
     * TreeSet.
     */
    private static class AddressBookEntry implements Comparable<AddressBookEntry> {

        private String name, address, phone;

        public AddressBookEntry(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        /**
         * It overrides compareTo() to compare the name in a case insensitive
         * manner. It also overrides equals() and hashCode(), so as they are
         * consistent with the compareTo().
         *
         * @param another
         * @return
         */
        @Override
        public int compareTo(AddressBookEntry another) {
            return this.name.compareToIgnoreCase(another.name);
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof AddressBookEntry)) {
                return false;
            }
            return this.name.equalsIgnoreCase(((AddressBookEntry) o).name);
        }

        @Override
        public int hashCode() {
            return name.length();
        }
    }

    public static void main(String[] args) {
        AddressBookEntry addr1 = new AddressBookEntry("peter");
        AddressBookEntry addr2 = new AddressBookEntry("PAUL");
        AddressBookEntry addr3 = new AddressBookEntry("Patrick");

        TreeSet<AddressBookEntry> set = new TreeSet<>();
        set.add(addr1);
        set.add(addr2);
        set.add(addr3);
        System.out.println(set);//[Patrick,PAUL,peter]

        System.out.println(set.floor(addr2));//PAUL
        System.out.println(set.lower(addr2));//Patrick
        System.out.println(set.headSet(addr2));//[Patrick]
        System.out.println(set.tailSet(addr2));//[PAUL,peter]

//        Iterator<AddressBookEntry> iter = set.iterator();
//        List<?> address = Arrays.asList(set);
//        while (iter.hasNext()) {
//            int sum = 0;
//            for (int i = 0; i < address.size(); i++) {
//                int uniCode = iter.next().toString().charAt(i);
//                sum += uniCode;
//
//                System.out.println("ASCII value of " + address.get(i) + "is: " + sum);
//            }
//        }
    }

}
