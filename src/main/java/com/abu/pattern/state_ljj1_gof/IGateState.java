package com.abu.pattern.state_ljj1_gof;

public interface IGateState {
    void entry();

    void pay();

    void payOk();

    void payFailed();
}
