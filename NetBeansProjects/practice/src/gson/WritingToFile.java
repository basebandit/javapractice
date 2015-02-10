/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import javax.swing.text.StyleConstants;
import gson.Country;

/**
 *
 * @author mars
 */
public class WritingToFile {

    private static final List<String> listOfMyCounties = new ArrayList<>();

    private static Country countryObj = new Country();

    public WritingToFile() {

    }

    public static void main(String[] args) {
        countryObj.setName("Kenya");
        countryObj.setPopulation(43000000);

        listOfMyCounties.add("Nairobi");
        listOfMyCounties.add("Nakuru");
        listOfMyCounties.add("Kiambu");

        countryObj.setListOfCounties(listOfMyCounties);
        Gson gson = new Gson();
        //convert java object to JSON format,
        //and return as JSON formatted String
        String json = gson.toJson(countryObj);

        try (FileWriter fw = new FileWriter("/home/mars/Desktop/CountryGSON.json")) {
            fw.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }
}
