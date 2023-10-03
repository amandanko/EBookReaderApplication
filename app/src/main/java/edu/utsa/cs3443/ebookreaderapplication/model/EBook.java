package edu.utsa.cs3443.ebookreaderapplication.model;

import java.util.ArrayList;

public abstract class EBook {

    private String title;
    private ArrayList<String> authors;
    private String genre;
    private int numberOfPages;

    public EBook( String title, ArrayList<String> authors ){
        this.title = title;
        this.authors = authors;
    }
    // Option 1 = class method
    // To call this method, we would use:
    //      EBook book = EBook.loadBook( "Time Machine" );
    public static EBook loadBook( String title ){
        // TODO: read in the file
        return null;
    }

    // Option 2 = object method
    // To call this method, we would use:
    //      EBook book = new EBook( "Time Machine", new ArrayList<>() );
    //      book.loadBook();
    public void loadBook(){
        // TODO: read in the file
    }


    // TODO: generate getters & setters
}
