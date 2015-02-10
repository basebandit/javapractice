/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davy;

/**
 *
 * @author mars
 */
public class Penguin {

    //member variables
    private String name;
    private String Color;
    private int age;

    //member functions/methods
    /**
     * Constructor
     *
     * @param name
     * @param Color
     * @param age
     */
    public Penguin(String name, String Color, int age) {
        this.name = name;
        this.age = age;
        this.Color = Color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return Color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Penguin name: " + getName() + ", Penguin Color: " + getColor() + ", Penguin Age: " + getAge();
    }

    public static void main(String[] args) {
        //Creating an instance of Penguin class.

        Penguin myPenguin = new Penguin("Putty", new String("White and Black"), 20);
        System.out.println(myPenguin.getAge());
        System.out.println(myPenguin.getColor());
        System.out.println(myPenguin.getName());
        System.out.println(myPenguin);

        myPenguin.setColor("Black");
        myPenguin.setAge(80);
        myPenguin.setName("Pinky");
        //We access member variables via the dot operator i.e myPenguin.getAge();
        System.out.println(myPenguin.getAge());
        System.out.println(myPenguin.getColor());
        System.out.println(myPenguin.getName());
        System.out.println(myPenguin);
    }
}
