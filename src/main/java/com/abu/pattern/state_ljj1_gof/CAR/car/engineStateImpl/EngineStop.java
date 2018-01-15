package com.abu.pattern.state_ljj1_gof.CAR.car.engineStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;

public class EngineStop extends AbsEngineState {
    public EngineStop(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public boolean engineStart() {
        System.out.println("changing engine state");
        mCar.changeEngineState(mCar.getEngineStart());
        return super.engineStart();
    }

    @Override
    public boolean engineStop() {
        System.out.println("Already Stop");

        return super.engineStop();
    }
}
