package com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl;

import com.abu.pattern.state_ljj1_gof.ATM.ATM;

public class WaitingPin extends AbsIATMState {
    public WaitingPin(ATM atm) {
        super(atm);
    }
}
