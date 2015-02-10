
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

//~--- JDK imports ------------------------------------------------------------

import java.text.NumberFormat;

/**
 *
 * @author mars
 */
public class SalariedEmployee extends Employee {
    private final int annualSalary = 700000;
    private final int benefitPlan  = 800000;

    public String getFormattedSalary() {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        return cf.format(annualSalary);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
