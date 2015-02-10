/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.text.DecimalFormat;
import java.text.MessageFormat;

/**
 * The following sample program shows that the fee of $1.50 is charged after
 * three deductions.
 *
 * @author mars
 */
public class DeductionWithFee {

    /**
     * This sample program deducts money three times from the account
     *
     * @param args
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        AccountVer2 acct = new AccountVer2("Dev Mars", 20000.00);
        acct.deduct(500);
        acct.deduct(500);
        acct.deduct(500);
        System.out.println("Owner name: " + acct.getOwnerName());
        System.out.println(MessageFormat.format("Balance:Ksh {0}", df.format(acct.getCurrentBalance())));
    }
}
