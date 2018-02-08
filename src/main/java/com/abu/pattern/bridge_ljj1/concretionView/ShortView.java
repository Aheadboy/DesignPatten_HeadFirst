package com.abu.pattern.bridge_ljj1.concretionView;

import com.abu.pattern.bridge_ljj1.IResource;
import com.abu.pattern.bridge_ljj1.View;

/**
 * 这里体现了接口隔离原则。
 * 这个类只有showTitle，showSnippet两个方法，并且只需要这两个方法。
 * 不会因为实现了与LongView相同的接口，而导致不得不实现与LongView相同，但自己又不需要的两个方法。
 */
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
