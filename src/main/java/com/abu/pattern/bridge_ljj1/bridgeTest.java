package com.abu.pattern.bridge_ljj1;

import com.abu.pattern.bridge_ljj1.ImpletionRsrc.ArtistRsrc;
import com.abu.pattern.bridge_ljj1.ImpletionRsrc.BookRsrc;
import com.abu.pattern.bridge_ljj1.concretionView.LongView;
import com.abu.pattern.bridge_ljj1.concretionView.ShortView;
import com.abu.pattern.bridge_ljj1.originData.Artist;
import com.abu.pattern.bridge_ljj1.originData.Book;

public class bridgeTest {
    public static void main(String[] args) {
        com.abu.pattern.bridge_ljj1.IResource aRsrc;
        com.abu.pattern.bridge_ljj1.IResource bRsrc;
//        ArtistRsrc aRsrc;
//        BookRsrc bRsrc;
        //长图显示艺术家和书
        com.abu.pattern.bridge_ljj1.View longViewPNB = new LongView(aRsrc = new ArtistRsrc(new Artist("Mozat", "handsome", "piano", "www.MozatPiano.com")));
        com.abu.pattern.bridge_ljj1.View longViewBNB = new LongView(bRsrc = new BookRsrc(new Book("Design Patten by GOF", "Introduce DP", "funny image", "www.DPIntroduce.com")));
        //短图显示艺术家和书
        com.abu.pattern.bridge_ljj1.View shortViewPNB = new ShortView(aRsrc);
        com.abu.pattern.bridge_ljj1.View shortViewBNB = new ShortView(bRsrc);

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

/**
 * 情景：
 * 1、将继承关系中的耦合，脱偶。用组合关系来替代继承关系。
 * 2、脱偶后的对象、行为，双维度变化。
 * 3、接口隔离原则
 * 4、常常伴随适配器，个人认为适配器不一定是必须的。
 * 5、组合，代替继承，减少笛卡尔积类的个数。
 * <p>
 * 实现方式：
 * 请看上面代码。
 *
 * Android 中的例子：
 * AdapterView抽象类与Adapter接口是桥接模式
 */
