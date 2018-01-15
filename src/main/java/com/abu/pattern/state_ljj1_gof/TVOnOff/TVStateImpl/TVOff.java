package com.abu.pattern.state_ljj1_gof.TVOnOff.TVStateImpl;

import com.abu.pattern.state_ljj1_gof.TVOnOff.TV;

public class TVOff extends AbsTvState {

    public TVOff(TV tv) {
        super(tv);
        System.out.println("now TVOff");
    }

    @Override
    public void redBtnClick() {
        super.redBtnClick();
        tv.changeTVState(new TVOn(tv));
    }
}
