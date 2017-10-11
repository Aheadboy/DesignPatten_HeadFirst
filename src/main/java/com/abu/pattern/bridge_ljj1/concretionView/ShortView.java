package com.abu.pattern.bridge_ljj1.concretionView;

import com.abu.pattern.bridge_ljj1.IResource;
import com.abu.pattern.bridge_ljj1.View;

public class ShortView extends View {
    public ShortView(IResource mResource) {
        super(mResource);
    }

    public void show() {
        showTitle();
        showSnippet();
    }

    private void showTitle() {
        System.out.println("Title is --> "+mResource.getTitle());
    }

    private void showSnippet() {

        System.out.println("Snippet is --> "+mResource.getSnippet());
    }
}
