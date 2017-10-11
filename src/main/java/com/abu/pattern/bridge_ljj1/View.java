package com.abu.pattern.bridge_ljj1;

public abstract class View {
   protected IResource mResource;

    public View(IResource mResource) {
        this.mResource = mResource;
    }

    public abstract void show();
}
