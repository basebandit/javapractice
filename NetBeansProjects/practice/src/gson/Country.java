/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gson;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mars
 */
public class Country {

    private String name;
    private int population;
    private List<String> listOfCounties;

    public Country() {

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<String> getListOfCounties() {
        return listOfCounties;
    }

    public void setListOfCounties(List<String> listOfCounties) {
        this.listOfCounties = listOfCounties;
    }
}
