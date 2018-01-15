package com.abu.pattern.state_ljj1_gof.TVOnOff.TVStateImpl;

import com.abu.pattern.state_ljj1_gof.TVOnOff.TV;

public class TVOn extends AbsTvState {
    public TVOn(TV tv) {
        super(tv);
        System.out.println("now TVON");
    }

    @Override
    public void redBtnClick() {
        super.redBtnClick();
        tv.changeTVState(new TVOff(tv));
    }
}
