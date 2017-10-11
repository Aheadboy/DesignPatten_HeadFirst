package com.abu.pattern.bridge_ljj1;
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
 * 例如View与IResource耦合，他们是高层次的。View是抽象类，IResource是接口。
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
 */