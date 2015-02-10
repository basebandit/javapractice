/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author mars
 */
public class WriteToFile {
    
    public static void main(String[] args) {
        JSONObject countryObj = new JSONObject();
        countryObj.put("Name", "Kenya");
        countryObj.put("Population", new Integer(430000000));
        JSONArray listOfCounties = new JSONArray();
        listOfCounties.add("Nairobi");
        listOfCounties.add("Kiambu");
        listOfCounties.add("Murang'a");
        
        countryObj.put("Counties", listOfCounties);
        try {
            //writing to file
            File file = new File("/home/mars/Desktop/JsonExample1.json");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            System.out.println("Writing JSON object to file");
            System.out.println("---------------------------");
            System.out.println(countryObj);
            
            fw.write(countryObj + "");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
