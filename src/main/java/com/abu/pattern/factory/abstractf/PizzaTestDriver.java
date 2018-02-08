package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.store.ChicagoPizzaStore;
import com.abu.pattern.factory.abstractf.store.NYPizzaStore;

public class PizzaTestDriver {

    public static void main(String[] args) {

        AbsPizzaStore nyStore = new NYPizzaStore();
        AbsPizzaStore chStore = new ChicagoPizzaStore();

        AbsPizza pizza = nyStore.orderPizza("clam");
        System.out.println(pizza.getName() + " Ready");
        pizza = chStore.orderPizza("cheese");
        System.out.println(pizza.getName() + " Ready");
    }

}

/**
 * 3.10. 适用环境
 * 在以下情况下可以使用抽象工厂模式：
 * <p>
 * 一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有类型的工厂模式都是重要的。
 * 系统中有多于一个的产品族，而每次只使用其中某一产品族。
 * 属于同一个产品族的产品将在一起使用，这一约束必须在系统的设计中体现出来。
 * 系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。
 */
