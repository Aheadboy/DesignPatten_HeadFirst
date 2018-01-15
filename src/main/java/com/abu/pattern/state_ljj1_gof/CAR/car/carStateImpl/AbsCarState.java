package com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarState;

public abstract class AbsCarState implements ICarState {
    AbsCar mCar;

    public AbsCarState(AbsCar mCar) {
        this.mCar = mCar;
    }

    public boolean go() {
        System.out.println("go()");
        return false;
    }

    public boolean stop() {
        System.out.println("stop()");

        return false;
    }
}
