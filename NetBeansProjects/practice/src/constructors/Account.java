/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author mars
 */
public class Account {

    //Data Members
    private String ownerName;
    private double balance;

    //constructor
    public Account(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    //Adds the passed amount to the balance
    public void add(double amt) {
        balance = balance + amt;
    }

    //Deducts the passed amount from the balance
    public void Deduct(double amt) {
        balance = balance - amt;
    }

    //Returns the current balance
    public double getCurrentBalance() {
        return balance;
    }

    //Returns the name of this account's owner
    public String getOwnerName() {
        return ownerName;
    }

    //Assigns the name of this account's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
}
