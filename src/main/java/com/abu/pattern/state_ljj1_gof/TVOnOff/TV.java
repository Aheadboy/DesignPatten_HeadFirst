package com.abu.pattern.state_ljj1_gof.TVOnOff;

import com.abu.pattern.state_ljj1_gof.TVOnOff.TVStateImpl.TVOff;

public class TV {
    ITVState tvState = null;

    public TV() {
        this.tvState = new TVOff(this);
    }

    public void changeTVState(ITVState tvState) {
        this.tvState = tvState;
    }

    public void reciveBtnClick() {
        tvState.redBtnClick();
    }
}
