package com.abu.pattern.state_ljj1_gof.CAR.CarFacade;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl.CarStop;
import com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl.DoorClosed;

public class SafeGuardFacadeImpl extends SafeGuardFacade {
    public SafeGuardFacadeImpl(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public void openDoor(int door) {
        if (mCar.mICarState instanceof CarStop) {
            super.openDoor(door);
        } else {
            System.out.println("Car is running Now.It's dangues to Open Door");
        }
    }

    @Override
    public void go() {
        if (mCar.mIDoorState instanceof DoorClosed) {
            super.go();
        } else {
            System.out.println("Door has not been Closed! Please Go After Door Closed");
        }
    }
}
