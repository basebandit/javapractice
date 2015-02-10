
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
public class HourlyEmployee extends Employee {
    private final int hourlyPayRate  = 1000;
    private final int weeklySchedule = 7200;

    public String getFormattedSalary() {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        return cf.format(hourlyPayRate);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
