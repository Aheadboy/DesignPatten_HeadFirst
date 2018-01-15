package com.abu.pattern.state_ljj1_gof.CAR.car.engineStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.IEngineState;

public abstract class AbsEngineState implements IEngineState {
    AbsCar mCar;

    public AbsEngineState(AbsCar mCar) {
        this.mCar = mCar;
    }

    public boolean engineStart() {
        System.out.println("engineStart()");
        return false;
    }

    public boolean engineStop() {
        System.out.println("engineStop()");
        return false;
    }
}
