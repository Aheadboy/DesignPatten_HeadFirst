package com.abu.pattern.state_ljj1_gof;


/**
 * client in UML
 */
public class ActionWhenOpening {
    static Gate mGate = new Gate();

    public static void main(String[] args) {
        mGate.entry();//
        mGate.payOk();
        mGate.payFailed();
        mGate.pay();
        System.out.println("--------------");
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
        System.out.println("------OOOOOOO--------");
        System.out.println("--------------");
        mGate.pay();
        mGate.payOk();
        mGate.payFailed();
        mGate.entry();
        System.out.println("--------------");
        mGate.entry();
    }
}
