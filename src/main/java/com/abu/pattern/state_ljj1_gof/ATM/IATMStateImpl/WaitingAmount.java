package com.abu.pattern.state_ljj1_gof.ATM.IATMStateImpl;

import com.abu.pattern.state_ljj1_gof.ATM.ATM;

public class WaitingAmount extends AbsIATMState {
    public WaitingAmount(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        super.insertCard();
        System.out.println("Keeping WaitingAmount");
    }

    @Override
    public void inputPin() {
        super.inputPin();
        System.out.println("Keeping WaitingAmount");

    }

    @Override
    public void inputAmount() {
        super.inputAmount();
    }

    @Override
    public void takeCash() {
        super.takeCash();
        System.out.println("Keeping WaitingAmount");

    }

    @Override
    public void pinSucc() {
        super.pinSucc();
        System.out.println("Keeping WaitingAmount");

    }

    @Override
    public void pinFailed() {
        super.pinFailed();
        System.out.println("Keeping WaitingAmount");

    }

    @Override
    public void amountSucc() {
        super.amountSucc();
    }

    @Override
    public void amountFailed() {
        super.amountFailed();
    }
}
