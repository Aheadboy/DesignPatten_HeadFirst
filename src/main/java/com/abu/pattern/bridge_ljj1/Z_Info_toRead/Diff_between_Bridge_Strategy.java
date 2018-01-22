/**
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
 * ！->不可错过<-！：http://blog.csdn.net/youthon/article/details/7653389
 * <p>
 * strategy 模式是为了扩展和修改，并提供动态配置。它往往可以在同一环境当中使用不同的策略，动态（运行时）使用不同的策略。就是调用不同的派生类。
 * bridge 模式是往往是为了利用已有的方法或类。它将原来不统一，不兼容的接口封装起来，变成统一的接口。（所以往往会组合上适配器模式）
 * 它的应用往往是不同的环境或平台下只能选择一 种，比如说在 windows 平台下只能用 WinClass, 而在 unix 平台下只能用 UnixClass.
 * 它的主要作用不是配置而是 ！->定义通用接口<-！。
 * <p>
 * 这句话很好：模式的动机，意图，使用场合，组合方式，这些都是模式的一部分。其中！->细微的不同足以区分<-！不同的模式。
 * <p>
 * 在桥接模式中，Abstraction 通过聚合的方式引用 Implementor。
 * 在策略模式中，Context(concretion（具体类）) 也使用聚合的方式引用 Startegy 抽象接口。
 * 可以说两者在表象上都是调用者与被调用者之间的解耦，以及抽象接口与实现的分离.
 * <p>
 * 那么两者的区别体现在什么地方呢？
 * 1. 首先，在形式上，两者还是有一定区别的，在桥接模式中不仅 Implementor 具有变化 （ConcreateImplementior），而且 Abstraction 也可以发生变化（RefinedAbstraction）
 * ，而且两者的变化 是完全独立的，RefinedAbstraction 与 ConcreateImplementior 之间松散耦合，它们仅仅通过 Abstraction 与 Implementor 之间的关系联系起来
 * 。而在策略模式中，并不考虑 Context 的变化，只有算法的可替代性。
 * .....
 * 总结说来：
 * 所以相对策略模式，桥接模式要表达的内容要更多，结构也更加复杂。
 * 桥接模式表达的主要意义其实是接口隔离的原则，即把本质上并不内聚的两种体系区别 开来，使得它们可以松散的组合
 * 而策略在解耦上还仅仅是某一个算法的层次，没有到体系这一层次。
 * 从结构图中可以看到，策略的结构是包容在桥接结构中的，桥 接中必然存在着策略模式
 * Abstraction 与 Implementor 之间就可以认为是策略模式，但是桥接模式一般 Implementor 将提供一系 列的成体系的操作
 * 而且 Implementor 是具有状态和数据的静态结构。而且桥接模式 Abstraction 也可以独立变化。
 * <p>
 * <p>
 * <p>
 * 网络上的一句话：
 * 适配器模式与桥接模式的联用:
 * <p>
 * 桥接模式和适配器模式用于设计的不同阶段，桥接模式用于系统的***初步***设计
 * ，对于存在两个独立变化维度的类可以将其分为抽象化和实现化两个角色，使它们可以分别进行变化
 * ；而在初步设计完成之后，当发现系统***与已有类无法协同工作***时，可以采用***适配器模式***。
 * 但有时候在设计初期也需要考虑适配器模式，特别是那些涉及到大量第三方应用接口的情况。
 */