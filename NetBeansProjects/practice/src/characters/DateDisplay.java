/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package characters;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author mars
 */
public class DateDisplay {
    public static void main(String[] args){
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat();
    SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE MMMM dd, yyyy");
        //default short format display
        System.out.println(String.format("Today is %s", sdf.format(today)));
        
        //programmer-designated long format display
        System.out.println(String.format("Today is %s", sdf2.format(today)));
    }
}
