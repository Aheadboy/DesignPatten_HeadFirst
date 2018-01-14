package com.abu.pattern.state_ljj1_gof.GateStateImpl;

import com.abu.pattern.state_ljj1_gof.Gate;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class Closed extends AbsGageState {
    public Closed(Gate gate) {
        super(gate);
        System.out.println("now state is Closed");
    }

    public void entry() {
        super.entry();
        System.out.println("Sorry Gate State is Closing !Fobbiden entring");
        System.out.println("Keeping Closed");
    }

    public void pay() {
        super.pay();
        System.out.println("changing state ");
        gate.changeState(new Processing(gate));
    }

    public void payOk() {
        super.payOk();
        System.out.println("Keeping Closed");
    }

    public void payFailed() {
        super.payFailed();
        System.out.println("Keeping Closed");
    }
}
