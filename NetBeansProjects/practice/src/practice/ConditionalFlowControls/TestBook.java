
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Mwas", "anon.@gmail.com", 'm');
        Book   aBook    = new Book("Java for Dummy", anAuthor, 800.50);

        // use an anonymous instance of Author
        Book anotherBook = new Book("Android for Beginners", new Author("Mwangi", "mwas@apress.com", 'm'), 890.50, 800);

        // the Book instance(aBook)accesses the getName() and getEmail() methods of the Author class
        // via an instance of Author class which is created and returned by the getAuthor() method of the Book class.
        System.out.println(aBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(anotherBook.getAuthor().getEmail());
        System.out.println(aBook.getAuthorName());
        System.out.println(anotherBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(anotherBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());
        System.out.println(anotherBook.getAuthorGender());
        System.out.println(aBook);
        System.out.println(anotherBook);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
