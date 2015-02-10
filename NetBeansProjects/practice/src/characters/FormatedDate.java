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
public class FormatedDate {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        System.out.println(sdf.format(today));
    }    
}
