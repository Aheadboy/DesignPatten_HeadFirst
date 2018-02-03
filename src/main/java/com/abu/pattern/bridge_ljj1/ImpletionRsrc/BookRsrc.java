package com.abu.pattern.bridge_ljj1.ImpletionRsrc;

import com.abu.pattern.bridge_ljj1.BookStoreNB;
import com.abu.pattern.bridge_ljj1.IResource;


/**
 * 此处体现适配器模式
 * BookRsrc，将手头现有的IResource接口与系统原有的BookStoreNB接口进行适配
 */
public class BookRsrc implements IResource {
    private final BookStoreNB bookStoreNB;

    public BookRsrc(BookStoreNB bookStoreNB) {
        this.bookStoreNB = bookStoreNB;
    }

    public String getTitle() {
        return this.bookStoreNB.getBookName();
    }

    public String getSnippet() {
        return this.bookStoreNB.getShortCut();
    }

    public String getImage() {
        return this.bookStoreNB.getImage();
    }

    public String getURL() {
        return this.bookStoreNB.getURL();
    }
}
