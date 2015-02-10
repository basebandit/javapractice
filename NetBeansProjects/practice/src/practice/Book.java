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
public class Book {

    private final String name;
    private final Author author;
    private double price;
    private int qtyInStock = 0;

    /**
     *
     * @param name
     * @param author
     * @param price
     */
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     *
     * @param name
     * @param author
     * @param price
     * @param qtyInStock
     */
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public Author getAuthor() {
        return author;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public int getQtyInStock() {
        return qtyInStock;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @param qtyInStock
     */
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    /**
     *
     * @return
     */
    public String getAuthorName() {
        return author.getName();
    }

    /**
     *
     * @return
     */
    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
     return this.name+" by "+getAuthorName()+"("+getAuthorGender()+") "+"at "+ getAuthorEmail();
    }

}
