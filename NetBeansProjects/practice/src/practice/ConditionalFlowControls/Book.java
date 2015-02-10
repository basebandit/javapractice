
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class Book {
    private int          qtyInStock = 0;
    private final String name;
    private final Author author;
    private double       price;

    public Book(String name, Author author, double price) {
        this.name   = name;
        this.author = author;
        this.price  = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name       = name;
        this.author     = author;
        this.price      = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return author.getName() + "(" + author.getGender() + ")" + " at " + author.getEmail();
    }

    public String getAuthorName() {
        return name;
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
