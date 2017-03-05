package com.example.lappy_486.booklisting;

/**
 * Book class takes in two strings, one for author and one for the title of the book.
 */

public class Book {
    private String mTitle;
    private String mAuthor;
    private String mUrl;


    /**
    * Construst a {@link Book} object
    *
    * @param title Stores the title of the book as a String
     *@param author stores the author of the book as a String
     * */
    public Book(String title, String author) {
        this.mTitle = title;
        this.mAuthor = author;
        //this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}
