package com.abu.pattern.bridge_ljj1.Z_Info_toRead;
/**
 * ljj1注释
 * 实现Bridge patten
 * 这里还有额外体现了适配器模式，ImpletionRsrc包下的类都可以认为是适配器。
 * LongView作为长视图，可以显示ArtistRsrc,或BookRsrc
 * ShortView作为短视图，可以显示ArtistRsrc,或BookRsrc
 * 显示的内容是concretionView包与ImpletionRsrc包下类的笛卡儿积。
 * 未来，concretionView包与ImpletionRsrc包下的类都可以各自进行增加，产生新的笛卡儿积组合。
 * 笛卡儿积的组合个数大于concretionView包与ImpletionRsrc包下类的和的个数。减少了代码。
 * <p>
 * <p>
 * 这里所有的耦合存在于高层次的耦合，即抽象层耦合。不与具体类（concretions）发生耦合。利于系统的扩展以及维护。
 * 因为，抽象层定义好了，基本上不会去修改。我们对其子类的新增，或其子类的修改，基本上不会影响到系统，
 * 也就是这样的系统对子类的新增或修改是无感知的，透明的，所以系统可扩展，可维护。
 * <p>
 * 例如View与IResource耦合（coupling），他们是高层次的。View是抽象类，IResource是接口。
 * 例如ArtistRsrc作为具体类，但是依赖于PersonNB抽象类。与PersonNB的具体类(concretions)解耦。方便对PersonNB的子类进行扩展及维护
 * <p>
 * 桥接模式，保护了种族隔离原则（The Segregation Principle）；
 * 一、定义
 * 讲接口隔离原则，它有两种定义：
 * 第一种定义: Clients should not beforced to depend upon interfaces that they don't use.
 * 客户端不应该依赖它不需用的接口。
 * 第二种定义：The dependency of oneclass to another one should depend on the smallest possible interface。
 * 类间的依赖关系应该建立在最小的接口上。
 * http://blog.csdn.net/nokianasty/article/details/11762379
 * <p>
 * 桥接模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化之间使用关联关系（组合或者聚合关系）而不是继承关系，
 * 从而使两者可以相对独立地变化，这就是桥接模式的用意。
 * <p>
 * 关于桥接模式与策略模式的区别。
 * am I right in saying it seems to be a specific combination of strategy and adapter?﻿
 * Actually I just tweeted something along the lines of "strategy + adapter" a few minutes ago :) :) :)  So indeed, I do agree with you :)
 * 提问者认为桥接模式就是策略模式跟适配器模式的结合。
 * 作者在很大程度上同意了这种说法。
 * 确实，我ljj1也比较认同这种说法。
 * 不考虑适配器的成分，桥接与策略模式还是非常相像。特别是在类图上。并且，策略模式也保护了The Segregation Principle
 * 但我觉得他们侧重点可能比较不同。
 * 策略模式更注重对象与行为的一种分离。
 * 桥接模式分离了双维度变化。彼此独立，各自变化不影响对方。
 * 听听作者的解释吧：
 * To me Bridge patterns seems like the Adapter pattern where the adaptee is an abstract strategy. Where, importantly (and as you say)
 * the abstract adapter forces concrete adapters to accept an abstract strategy in the constructor (or rather: is dependency injected some way).
 * <p>
 * 这篇中文解释更好：
 * 不可错过：http://blog.csdn.net/youthon/article/details/7653389
 */