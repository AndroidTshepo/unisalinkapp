package com.example.codetribe.unisalink.app;

import java.io.Serializable;

/**
 * Created by Codetribe on 4/7/2015.
 */
public class BooksDTO implements Serializable {

    public  String Title;
    public  String ISBN;
    public  String price;

    public BooksDTO() {
    }

    public BooksDTO(String title, String ISBN, String price) {
        Title = title;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
