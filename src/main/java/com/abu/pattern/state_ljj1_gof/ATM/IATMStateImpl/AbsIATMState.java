package com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl;

import com.abu.pattern.state_ljj1_gof.ATM.ATM;
import com.abu.pattern.state_ljj1_gof.ATM.IATMState;

public class AbsIATMState implements IATMState {
    ATM mATM = null;

    public AbsIATMState(ATM atm) {
        this.mATM = atm;
    }

    public void insertCard() {
        System.out.println("insertCard invoke");
    }

    public void inputPin() {
        System.out.println("inputPin invoke");

    }

    public void inputAmount() {
        System.out.println("inputAmount invoke");

    }

    public void takeCash() {
        System.out.println("takeCash invoke");

    }

    public void pinSucc() {
        System.out.println("pinSucc invoke");

    }

    public void pinFailed() {
        System.out.println("pinFailed invoke");

    }

    public void amountSucc() {
        System.out.println("amountSucc invoke");

    }

    public void amountFailed() {
        System.out.println("amountFailed invoke");

    }
}
