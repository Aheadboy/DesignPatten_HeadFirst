package com.abu.pattern.bridge_ljj1.ImpletionRsrc;

import com.abu.pattern.bridge_ljj1.IResource;
import com.abu.pattern.bridge_ljj1.PersonNB;

/**
 * 此处体现适配器模式
 * ArtistRsrc作为适配器，将手头现有的IResource接口与系统原有的PersonNB接口进行适配
 */
public class ArtistRsrc implements IResource {
    PersonNB personNB;

    public ArtistRsrc(PersonNB personNB) {
        this.personNB = personNB;
    }

    public String getTitle() {
        return this.personNB.getName();
    }

    public String getSnippet() {
        return this.personNB.getBio();
    }

    public String getImage() {
        return this.personNB.getAvatar();
    }

    public String getURL() {
        return this.personNB.getURL();
    }
}
