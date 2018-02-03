package com.abu.pattern.bridge_ljj1;

import com.abu.pattern.bridge_ljj1.ImpletionRsrc.ArtistRsrc;
import com.abu.pattern.bridge_ljj1.ImpletionRsrc.BookRsrc;
import com.abu.pattern.bridge_ljj1.concretionView.LongView;
import com.abu.pattern.bridge_ljj1.concretionView.ShortView;
import com.abu.pattern.bridge_ljj1.originData.Artist;
import com.abu.pattern.bridge_ljj1.originData.Book;

public class bridgeTest {
    public static void main(String[] args) {
        IResource aRsrc;
        IResource bRsrc;
//        ArtistRsrc aRsrc;
//        BookRsrc bRsrc;
        //长图显示艺术家和书
        View longViewPNB = new LongView(aRsrc = new ArtistRsrc(new Artist("Mozat", "handsome", "piano", "www.MozatPiano.com")));
        View longViewBNB = new LongView(bRsrc = new BookRsrc(new Book("Design Patten by GOF", "Introduce DP", "funny image", "www.DPIntroduce.com")));
        //短图显示艺术家和书
        View shortViewPNB = new ShortView(aRsrc);
        View shortViewBNB = new ShortView(bRsrc);

        longViewPNB.show();
        System.out.println("-------------");
        longViewBNB.show();
        System.out.println("-------------");
        shortViewPNB.show();
        System.out.println("-------------");
        shortViewBNB.show();
        System.out.println("-------------");
    }
}
