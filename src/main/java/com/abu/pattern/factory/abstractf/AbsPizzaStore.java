package com.abu.pattern.factory.abstractf;

/**
 * 有别于PizzaIngredientFactory抽象工厂方法
 * 这是一个工厂方法 因为只返回一个产品：AbsPizza
 *(上面这句话是之前注释的，我现在看来应该说得不对，暂不删除该话）
 * 反驳：AbsPizza是一个产品，但他更是一个产品族，一个产品族就包含了多个具体的产品；
 * 所以这里将AbsPizza看成一个产品从而认为AbsPizzaStore是工厂而不是抽象工厂的看法不正确；
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
