package com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;

public class CarGo extends AbsCarState {
    public CarGo(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public boolean go() {
        System.out.println("Car Alreay Go");
        return super.go();
    }

    @Override
    public boolean stop() {
        System.out.println("changing car state");
        mCar.changeCarState(mCar.getCarStop());
        return super.stop();
    }
}
