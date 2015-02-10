
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 * subclassing an abstract class
 *
 * @author mars
 */
public class BaseBall extends Ball {
    private String color;
    private double weight;

    public BaseBall() {}

    @Override
    public int Hit(int batSpeed) {
        return batSpeed;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor(String color) {
        return color;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight(double weight) {
        return weight;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
