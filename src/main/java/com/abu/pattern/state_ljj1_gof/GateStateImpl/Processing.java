package com.abu.pattern.state_ljj1_gof.GateStateImpl;

import com.abu.pattern.state_ljj1_gof.Gate;

public class Processing extends AbsGageState {


    public Processing(Gate gate) {
        super(gate);
        System.out.println("now state is processing");
    }

    public void entry() {
        super.entry();
        System.out.println("Keeping Processing");

    }

    public void pay() {
        super.pay();
        System.out.println("Keeping Processing");

    }

    public void payOk() {
        super.payOk();
        System.out.println("change state");
        gate.changeState(new Opening(gate));
    }

    public void payFailed() {
        super.payFailed();
        System.out.println("change state");
        gate.changeState(new Closed(gate));

    }
}
