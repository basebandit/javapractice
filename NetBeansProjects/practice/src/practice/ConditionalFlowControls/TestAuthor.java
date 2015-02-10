
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
public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Mars", "marscyclo9@marsdev.com", 'm');

        System.out.println(anAuthor);
        anAuthor.setEmail("mwasville@gmail.com");
        System.out.println(anAuthor.getEmail());
        System.out.println(anAuthor);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
