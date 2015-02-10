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
public class AccountVer2 {

    private static final double FEE = 0.50;
    private String ownerName;
    private Double balance;

    //cONSTRUCTOR
    public AccountVer2(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    /**
     * deducts the passed amt from the balance
     *
     * @param amt
     */
    public void deduct(double amt) {
        balance = balance - amt - FEE;//Fee is charged every time
    }

    public double getCurrentBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
