package com.abu.pattern.bridge_ljj1;

public abstract class PersonNB {
    private String name;
    private String avatar;
    private String bio;
    private String URL;

    public PersonNB(String name, String avatar, String bio, String URL) {
        this.name = name;
        this.avatar = avatar;
        this.bio = bio;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
