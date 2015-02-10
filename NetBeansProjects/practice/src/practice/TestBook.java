/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class TestBook {

    public static void main(String[] args) {
        Author anAuthor = new Author("mwas", "mwas@gmail.com", 'm');
        Book aBook = new Book("Java For Dummy", anAuthor, 19.95);
        Book anotherBook = new Book("More Java For Dummy", new Author("devnull", "devnull@shell-storm.org", 'm'), 29.95, 888);
        anAuthor.setEmail("evansonmwangi83@devnull.com");
        aBook.setPrice(90.95);
        System.out.println(aBook);
        System.out.println(anotherBook);
        System.out.println(aBook.getName() + " costs " + aBook.getPrice());
        anotherBook.setQtyInStock(876);
        System.out.println("There are only " + anotherBook.getQtyInStock() + " " + anotherBook.getName() + "\'s " + "books left.");
        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthor());//call to Author's toString method explicitly
        System.out.println(aBook);//call to Author's toString method implicitly.
        System.out.append(anotherBook.getAuthorName());
        System.out.println("\t" + anotherBook.getAuthorName());
    }
}
