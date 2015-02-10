/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author mars
 */
public class Element {

    //Data Members
    private final String name;
    private final int number;
    private final String symbol;
    private final double mass;
    private final int period;
    private final int group;

    //constructor
    public Element(String elementName, int elementNumber, String elementSymbol, double elementMass, int elementPeriod, int elementGroup) {
        name = elementName;
        number = elementNumber;
        symbol = elementSymbol;
        mass = elementMass;
        period = elementPeriod;
        group = elementGroup;
    }

    /**
     * Returns the element's name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the element's atomic number
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the element's 1- or 2- atomic symbol
     *
     * @return
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Returns the element's atomic mass
     *
     * @return
     */
    public double getMass() {
        return mass;
    }

    /**
     * Returns the element's period
     *
     * @return
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Return the element's group
     *
     * @return
     */
    public int getGroup() {
        return group;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("\n\nElement Name:   %s \nElement Number:   %s \nElement Symbol:   %s \nElement Mass:   %s \nElement Period:   %s \nElementGroup:   %s", getName(), getNumber(), getSymbol(), getMass(), getPeriod(), getGroup());
    }
}
