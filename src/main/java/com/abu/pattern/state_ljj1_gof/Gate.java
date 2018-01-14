package com.abu.pattern.state_ljj1_gof;

import com.abu.pattern.state_ljj1_gof.GateStateImpl.Closed;

/**
 * context class in UML
 */
public class Gate {
    private IGateState IgateState = null;

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
