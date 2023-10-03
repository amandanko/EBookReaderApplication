package edu.utsa.cs3443.ebookreaderapplication.model;

import java.util.ArrayList;

public class Library {

    private ArrayList<EBook> books;

    public Library(){
        this.books = new ArrayList<EBook>();
    }


    public ArrayList<EBook> getAllEBooks() {
        return books;
    }

    // TODO: generate getters & setters


    public ArrayList<EBook> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<EBook> books) {
        this.books = books;
    }
}
