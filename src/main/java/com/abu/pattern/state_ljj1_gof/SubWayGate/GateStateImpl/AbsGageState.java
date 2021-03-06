package com.abu.pattern.state_ljj1_gof.SubWayGate.GateStateImpl;

import com.abu.pattern.state_ljj1_gof.SubWayGate.Gate;
import com.abu.pattern.state_ljj1_gof.SubWayGate.IGateState;

public abstract class AbsGageState implements IGateState {
    protected Gate gate = null;

    public AbsGageState(Gate gate) {
        this.gate = gate;
    }

    public void entry() {
        System.out.println("entry invoke");
    }

    public void pay() {
        System.out.println("pay invoke");
    }

    public void payOk() {
        System.out.println("payOk invoke");
    }

    public void payFailed() {
        System.out.println("payFailed invoke");
    }
}
