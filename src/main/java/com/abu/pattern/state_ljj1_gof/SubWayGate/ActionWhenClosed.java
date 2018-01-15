package com.abu.pattern.state_ljj1_gof.SubWayGate;

public class ActionWhenClosed {
    static Gate mGate = new Gate();
    public static void main(String[] args) {
        mGate.entry();//
        mGate.payOk();
        mGate.payFailed();
        mGate.pay();
    }
}
