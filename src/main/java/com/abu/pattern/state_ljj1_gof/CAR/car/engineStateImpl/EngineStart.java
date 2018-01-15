package com.abu.pattern.state_ljj1_gof.CAR.car.engineStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;

public class EngineStart extends AbsEngineState {
    public EngineStart(AbsCar mCar) {
        super(mCar);
    }

    public boolean engineStart() {
        System.out.println("Already Start");
       return super.engineStart();
    }

    public boolean engineStop() {
        System.out.println("changing engine state");
        mCar.changeEngineState(mCar.getEngineStop());
        return super.engineStop();
    }
}
