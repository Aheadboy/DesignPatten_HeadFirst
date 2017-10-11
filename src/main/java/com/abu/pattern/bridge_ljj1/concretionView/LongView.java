package com.abu.pattern.bridge_ljj1.concretionView;

import com.abu.pattern.bridge_ljj1.IResource;
import com.abu.pattern.bridge_ljj1.View;

public class LongView extends View {

    public LongView(IResource mResource) {
        super(mResource);
    }

    public void show() {
        showTitle();
        showSnippet();
        showImage();
        showURL();
    }

    private void showTitle() {
        System.out.println("Title is --> " + mResource.getTitle());
    }

    private void showSnippet() {

        System.out.println("Snippet is --> " + mResource.getSnippet());
    }

    private void showImage() {

        System.out.println("Image is --> " + mResource.getImage());
    }

    private void showURL() {
        System.out.println("URL is --> " + mResource.getURL());

    }

}
