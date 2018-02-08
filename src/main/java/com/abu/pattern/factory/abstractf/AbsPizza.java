package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;


/**
 * 由产品族构成的产品。
 * 最终交付给客户代码的东西。
 * 根据一定的规则来组装产品族为最终产品。
 * 具体的子类来实现具体的规则。
 */
public abstract class AbsPizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;

    protected abstract void prepare();

    protected void bake() {
    }

    protected void cut() {
    }

    protected void box() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
