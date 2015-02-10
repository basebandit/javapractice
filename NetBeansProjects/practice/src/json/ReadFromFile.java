/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author mars
 */
public class ReadFromFile {

    private static final String file = "/home/mars/Desktop/JsonExample1.json";

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            String countryName = jsonObject.get("Name") + "";//equivalent to jsonObject.get("Name").toString(); 
            System.out.println("Name of Country: " + countryName);

            long population = (long) jsonObject.get("Population");
            System.out.println("Population: " + population);

            System.out.println("Counties are:");
            JSONArray listOfCounties = (JSONArray) jsonObject.get("Counties");
            Iterator<String> iterator = listOfCounties.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
