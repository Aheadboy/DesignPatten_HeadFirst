package com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl;

import com.abu.pattern.state_ljj1_gof.ATM.ATM;

public class GateOpen extends AbsIATMState {
    public GateOpen(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        super.insertCard();
        System.out.println("Keeping Opening");
    }

    @Override
    public void inputPin() {
        super.inputPin();
        System.out.println("Keeping Opening");

    }

    @Override
    public void inputAmount() {
        super.inputAmount();
        System.out.println("Keeping Opening");

    }

    @Override
    public void takeCash() {
        super.takeCash();
        System.out.println("changing state");
        mATM.changeState(mATM.getGateClosed());
    }

    @Override
    public void pinSucc() {
        super.pinSucc();
        System.out.println("Keeping Opening");

    }

    @Override
    public void pinFailed() {
        super.pinFailed();
        System.out.println("Keeping Opening");

    }

    @Override
    public void amountSucc() {
        super.amountSucc();
        System.out.println("Keeping Opening");

    }

    @Override
    public void amountFailed() {

        super.amountFailed();
        System.out.println("Keeping Opening");

    }
}
