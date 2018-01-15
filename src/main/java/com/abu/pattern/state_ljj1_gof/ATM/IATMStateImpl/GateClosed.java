package com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl;

import com.abu.pattern.state_ljj1_gof.ATM.ATM;

public class GateClosed extends AbsIATMState {
    public GateClosed(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        super.insertCard();
        System.out.println("changing state");
        mATM.changeState(mATM.getWaitingPin());
    }

    @Override
    public void inputPin() {
        super.inputPin();
        System.out.println("Keeping GateClosed");
    }

    @Override
    public void inputAmount() {
        super.inputAmount();
        System.out.println("Keeping GateClosed");

    }

    @Override
    public void takeCash() {
        super.takeCash();
        System.out.println("Keeping GateClosed");

    }

    @Override
    public void pinSucc() {
        super.pinSucc();
        System.out.println("Keeping GateClosed");

    }

    @Override
    public void pinFailed() {
        super.pinFailed();
        System.out.println("Keeping GateClosed");

    }

    @Override
    public void amountSucc() {
        super.amountSucc();
        System.out.println("Keeping GateClosed");

    }

    @Override
    public void amountFailed() {
        super.amountFailed();
        System.out.println("Keeping GateClosed");

    }
}
