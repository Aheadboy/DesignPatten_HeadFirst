package com.abu.pattern.state_ljj1_gof.TVOnOff.TVStateImpl;

import com.abu.pattern.state_ljj1_gof.TVOnOff.TV;
import com.abu.pattern.state_ljj1_gof.TVOnOff.ITVState;

public class AbsTvState implements ITVState {
    TV tv = null;

    public AbsTvState(TV tv) {
        this.tv = tv;
    }

    public void redBtnClick() {
        System.out.println("redBtnClick");
    }
}
