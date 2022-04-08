package com.netcracker.book;

import java.util.Arrays;
import java.util.Objects;


public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0 ;


    public Book (String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    @Override
    public String toString() {
        return "Book[" + "name='" + name +
                ", authors={" + Arrays.toString(authors) +"}" +
                ", price=" + price +
                ", qty=" + qty +
                "]";
    }

    public String getAuthorNames(){
        String [] names = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            names[i] = authors[i].getName();

        }
        return String.join(",", names);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0 &&
                qty == book.qty && name.equals(book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long bitsReal = Double.doubleToLongBits(price);
        result = 31 * result + (int)(bitsReal ^ bitsReal >>> 32);
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + qty;
        return result;
    }
}
