package com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;

public class CarStop extends AbsCarState {
    public CarStop(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public boolean go() {
        System.out.println("changing car state");
        mCar.changeCarState(mCar.getCarGo());
        return super.go();
    }

    @Override
    public boolean stop() {
        System.out.println("Car Already Stop");
        return super.stop();
    }
}
