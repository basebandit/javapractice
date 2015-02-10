/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.text.MessageFormat;

/**
 * suppose a single student owns two library cards (say, one for the general
 * library and another for the engineering library). Then we can make the data
 * member owner of two LibraryCard objects to refer to the same Student object.
 * Here’s one such program:
 *
 * @author mars
 */
public class Librarian {

    public static void main(String[] args) {
        Student student;
        LibraryCard card1, card2;

        student = new Student();
        student.setName("Dev Mars");
        student.setEmail("devmars@infosec.org");

        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);

        card2 = new LibraryCard();
        card2.setOwner(student);//the same student is the owner of the second card too.

        System.out.println("Card1 Info:");
        System.out.println(MessageFormat.format("{0}\n", card1));//call the toString() method implicitly
        //System.out.println(card1.toString());//call the toString() method explicitly

        System.out.println("Card2 Info:");
        System.out.println(String.format("%s\n", card2.toString()));
    }
}
