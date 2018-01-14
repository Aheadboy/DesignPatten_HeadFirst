package com.abu.pattern.state_ljj1_gof;

public class ActionWhenProcessing {
    static Gate mGate = new Gate();

    public static void main(String[] args) {
        mGate.entry();//
        mGate.payOk();
        mGate.payFailed();
        mGate.pay();
        System.out.println("-------PPPPPPP-------");
        System.out.println("--------------");
        mGate.entry();
        mGate.pay();
        mGate.payFailed();
        mGate.entry();
        System.out.println("--------------");
        mGate.pay();
        mGate.pay();
        System.out.println("--------------");
        mGate.payOk();

    }
}
