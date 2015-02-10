/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class TestAuthor {

    public static void main(String[] args) {
        Author anAuthor = new Author("mwas", "mwas@devnull.com", 'm');
        System.out.println(anAuthor);//call toString()method implicitly
        anAuthor.setEmail("mwas@gmail.com");
        System.out.println(anAuthor.toString());//explicit call to toString() method
    }
}
