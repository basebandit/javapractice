/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class Ball {

    static java.util.Scanner sc = new java.util.Scanner(System.in);
    private double weight;
    private String Color;

    public Ball() {

    }

    public String getBall(String v) {
        return sc.next();
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    protected void setColor(String Color) {
        this.Color = Color;
    }
    
    protected void toss(GolfBall b){
        System.out.println("You tossed a ball");
    }
    protected void hit(Ball b){
        System.out.println("You hit a ball");
    }

    /**
     *
        return "This Ball weighs " + g
     * @return
     */
    @Override
    public String toString() {
        return "This Ball weighs " + getWeight() + " grams.";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Ball b = new SoftBall("John's Ball");
        ((SoftBall) b).riseBall();
    }
}
