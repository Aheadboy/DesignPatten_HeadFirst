package com.abu.pattern.state_ljj1_gof.ATM;

public interface IATMState {
    void insertCard();
    void inputPin();
    void inputAmount();
    void takeCash();
    void pinSucc();
    void pinFailed();
    void amountSucc();
    void amountFailed();
}
