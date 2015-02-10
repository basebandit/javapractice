/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.text.MessageFormat;

/**
 *
 * @author mars
 */
public class LibraryCard {
 //Data members

    //student owner of this card
    private Student owner;

    //number of books borrowed
    private int borrowCnt;

    //Constructor
    public LibraryCard() {
        owner = null;
        borrowCnt = 0;
    }

    //numOf Books are checked out
    public void checkOut(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }

    //Returns the number of books borrowed
    public int getNumberOfBooks() {
        return borrowCnt;
    }

    //Returns the name of the owner of this card
    public String getOwnerName() {
        return owner.getName();
    }

    public void setOwner(Student student) {
        owner = student;
    }

    //Returns the string representation of this card
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return MessageFormat.format("Owner Name:       {0}\n    Email:       {1}\nBooks Borrowed:  {2}", getOwnerName(), owner.getEmail(), borrowCnt);
    }
}
