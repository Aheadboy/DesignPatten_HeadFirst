package com.abu.pattern.bridge_ljj1;

public abstract class BookStoreNB {
    private String bookName;
    private String overView;
    private String image;
    private String URL;

    public BookStoreNB(String bookName, String shortCut, String image, String URL) {
        this.bookName = bookName;
        this.overView = shortCut;
        this.image = image;
        this.URL = URL;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getShortCut() {
        return overView;
    }

    public void setShortCut(String shortCut) {
        this.overView = shortCut;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
