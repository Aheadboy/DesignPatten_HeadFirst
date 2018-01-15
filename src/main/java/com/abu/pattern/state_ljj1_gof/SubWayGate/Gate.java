package com.abu.pattern.state_ljj1_gof.SubWayGate;

import com.abu.pattern.state_ljj1_gof.SubWayGate.GateStateImpl.Closed;

/**
 * context class in UML
 */
public class Gate {
    private IGateState IgateState = null;

    /**
     * 我们的环境类，这里为Gate
     * 他需要一个初始的状态，那么这里要求在构造的时候依赖Closed具体类。（这里发生了具体类之间的耦合，这是我们所不提倡的，但是在这个情况下，这种耦合可以接受。因为它对系统的扩展维护影响不大）
     * 为何不用一个带IGateState参数的构造函数，让IGateState的ConcreteClass以依赖注入的形式来使用。
     * 因为：由于我们各个状态需要互相切换，同时由于，这个状态又是在环境类Gate里面维护的，
     * 使得各个状态类切换的时候必须通知环境类changeState（IGateState igateState）对这个状态进行更新。（此处状态类依赖了环境类，发生了双向依赖。双向依赖也是我们所不提倡的，他会造成我们系统的复杂。然而此处是可以忍受的。并不会太复杂。）
     * 那么我们的状态类就需要注入一个环境类实例。
     * 如果环境类在构造的时候依赖状态类来注入，同时，状态类构造的时候又依赖环境类来注入。这种写法无法实现；
     * 因此，此处我们用无参的构造函数来构造环境类，在构造函数里面硬编码一个默认初始状态，这个状态被注入一个环境类实例，这里为this；
     */
    public Gate() {
        this.IgateState = new Closed(this);
    }

    public void changeState(IGateState igateState) {
        this.IgateState = igateState;
    }

    public void entry() {
        IgateState.entry();
    }

    public void pay() {
        IgateState.pay();
    }

    public void payOk() {
        IgateState.payOk();
    }

    public void payFailed() {
        IgateState.payFailed();
    }

}
