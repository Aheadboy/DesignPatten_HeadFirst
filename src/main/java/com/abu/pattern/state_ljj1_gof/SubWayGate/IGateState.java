package com.abu.pattern.state_ljj1_gof.SubWayGate;

public interface IGateState {
    void entry();

    void pay();

    void payOk();

    void payFailed();
}
