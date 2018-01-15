package com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl.CarStop;

public class DoorClosed extends AbsDoorState {

    public DoorClosed(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public boolean openDoor(int door) {
        System.out.println("changing door state");
        mCar.changeDoorState(mCar.getDoorOpen());
        return super.openDoor(door);
    }

    @Override
    public boolean closeDoor(int door) {
        System.out.println("Door Already Closed");

        return super.closeDoor(door);
    }
}
