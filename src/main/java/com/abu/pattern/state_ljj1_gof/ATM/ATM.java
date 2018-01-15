package com.abu.pattern.state_ljj1_gof.ATM;

import com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl.GateClosed;

public class ATM {
    IATMState mATMState = null;
    IATMState gateClosed;
    IATMState gateOpen;
    IATMState waitingPin;
    IATMState waitingAmount;

    public ATM() {
        this.gateClosed = new GateClosed(this);
        this.gateOpen = new GateClosed(this);
        this.waitingPin = new GateClosed(this);
        this.waitingAmount = new GateClosed(this);
        this.mATMState = this.gateClosed;
    }

    public IATMState getGateClosed() {
        return gateClosed;
    }

    public IATMState getGateOpen() {
        return gateOpen;
    }

    public IATMState getWaitingPin() {
        return waitingPin;
    }

    public IATMState getWaitingAmount() {
        return waitingAmount;
    }

    public void changeState(IATMState state) {
        this.mATMState = state;
    }

    public void insertCard() {
        this.mATMState.insertCard();
    }

    public void inputPin() {
        this.mATMState.inputPin();
    }

    public void inputAmount() {
        this.mATMState.inputAmount();
    }

    public void takeCash() {
        this.mATMState.takeCash();
    }

    public void pinSucc() {
        this.mATMState.pinSucc();
    }

    public void pinFailed() {
        this.mATMState.pinFailed();
    }

    public void amountSucc() {
        this.mATMState.amountSucc();
    }

    public void amountFailed() {
        this.mATMState.amountFailed();
    }
}
