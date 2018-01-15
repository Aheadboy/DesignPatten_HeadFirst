package com.abu.pattern.state_ljj1_gof.CAR.CarFacade;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl.CarStop;
import com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl.DoorClosed;
import com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl.DoorOpen;

public abstract class SafeGuardFacade {
    AbsCar mCar;

    public SafeGuardFacade(AbsCar mCar) {
        this.mCar = mCar;
    }

    public void openDoor(int door) {
        this.mCar.openDoor(door);
    }

    public void engineStop() {
        this.mCar.engineStop();
    }

    public void engineStart() {
        this.mCar.engineStart();
    }

    public void closeDoor(int door) {
        this.mCar.closeDoor(door);
    }

    public void go() {
        this.mCar.go();
    }

    public void stop() {
        this.mCar.stop();
    }
}
