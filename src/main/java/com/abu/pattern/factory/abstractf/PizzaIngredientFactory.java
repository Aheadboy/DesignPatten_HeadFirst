package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;


/**
 * 这个才是抽象工厂
 * 这个工厂返回多个产品，而不是单一产品
 * 工厂方法模式返回的是单一产品。这个是与抽象工厂方法的主要区别。
 * 抽象工厂的子类工厂（具体实现类），决定返回的多个产品，组合在一起是有意义的。
 * <p>
 * 例如，该例子中的ChicagoPizzaIngredientFactory，决定返回原材料都是Chicago的，将他们组合在一起，在这个场景下是有意义的
 * 而NYPizzaIngredientFactory，决定返回的原材料都是NY,将他们组合在一起，在这个场景下是有意义的。
 * <p>
 * 再例如：
 * 我们要返回一套主题。主题有：黑底白字；白底黑字两种。
 * 那么：白底；黑底；白字；黑字；各是一种产品。
 * 只有黑底跟白字的组合；白底跟黑字的组合才是有意义的。否则用户啥也看不见。
 * 那么抽象工厂应该返回两个产品。其一：底，其二，字；（因为返回的是两个产品（或多个）而不是一个，这是其与工厂方法的区别）
 * 因为我们需要两个主题：白底黑字，黑底白字。
 * 所以我们需要两个抽象工厂的子类工厂。
 * 其一，返回产品组合：白底黑字
 * 其二，返回产品组合：黑底白字
 * 结束。
 * <p>
 * 如果将来有扩展新的一个主题。比如：白底绿字。
 * 那么原来的白底我们可以重用。
 * 新增绿字子类。
 * 新增一个抽象工厂子类，用来返回白底绿字的组合产品。
 * 至此：新的需求产生后，
 * 我们对系统进行了新增类，没有修改原系统。符合开闭原则；
 * 同时服用了原有系统的类（白底）
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Clam createClam();
}
