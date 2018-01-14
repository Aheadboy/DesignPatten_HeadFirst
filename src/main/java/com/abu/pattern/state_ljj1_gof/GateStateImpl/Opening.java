package com.abu.pattern.state_ljj1_gof.GateStateImpl;

import com.abu.pattern.state_ljj1_gof.Gate;

public class Opening extends AbsGageState {
    public Opening(Gate gate) {
        super(gate);
        System.out.println("now state is Opening");
    }

    public void entry() {
        super.entry();
        System.out.println("changing state ");
gate.changeState(new Closed(gate));
    }

    public void pay() {
        super.pay();
        System.out.println("Keeping Opening");
    }

    public void payOk() {
        super.payOk();
        System.out.println("Keeping Opening");

    }

    public void payFailed() {
        super.payFailed();
        System.out.println("Keeping Opening");

    }
}
