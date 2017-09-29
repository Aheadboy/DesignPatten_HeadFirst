package com.abu.pattern.factory.abstractf;

/**
 * 有别于PizzaIngredientFactory抽象工厂方法
 * 这是一个工厂方法 因为只返回一个产品：AbsPizza
 */
public abstract class AbsPizzaStore {

    public AbsPizza orderPizza(String type) {
        AbsPizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 决定实例化哪个产品的逻辑
     * 不同的子类可能有不同的逻辑实现。
     *
     * @param type
     * @return
     */
    public abstract AbsPizza createPizza(String type);
}
