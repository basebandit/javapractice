/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import gson.Country;
import com.google.gson.Gson;
import java.io.FileNotFoundException;

/**
 *
 * @author mars
 */
public class ReadFromFile {

    private final String file = "/home/mars/Desktop/CountryGSON.json";
    private final Gson gson;
    private BufferedReader reader;
    private Country countryObj;
    private List<String> listOfCounties;

    public ReadFromFile() throws FileNotFoundException {
        gson = new Gson();
        reader = new BufferedReader(new FileReader(file));
        //convert the json string back to java Object
        countryObj = gson.fromJson(reader, Country.class);
        System.out.println("Name of Country: " + countryObj.getName());
        System.out.println("Population: " + countryObj.getPopulation());
        System.out.println("Counties are: ");
        listOfCounties = countryObj.getListOfCounties();
        for (String county : listOfCounties) {
            System.out.println(county);
        }
    }

    public static void main(String[] args) {
        try {
            new ReadFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
