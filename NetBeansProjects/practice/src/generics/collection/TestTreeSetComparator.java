/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collection;

/**
 *
 * @author mars
 */
public class TestTreeSetComparator {

    private class PhoneBookEntry {

        private String name, address, phone;

        public PhoneBookEntry(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class PhoneBookComparator implements java.util.Comparator<PhoneBookEntry> {
       @Override
       public int compare(PhoneBookEntry pb1,PhoneBookEntry pb2){
       return 1;
       }
    }
}
