
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 * Calling an overloaded constructor with
 * the keyword this
 * @author mars
 */
public class Tax {
    private final double grossIncome;
    private final String state;
    int                  dependents;

    // 2nd constructor
    Tax(double grossIncome, int dependents) {
        this(grossIncome, "NY", dependents);    // calls the overloaded constructor
    }

    // 1st constructor
    Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state       = state;
        this.dependents  = dependents;
    }

    void verifyTax() {
        SomeOtherCLass s = new SomeOtherCLass();

        /**
         * passing a reference to the current instance class Tax to
         * SomeOtheCLass's verifyTax method
         */
        s.verifyTax(this);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
