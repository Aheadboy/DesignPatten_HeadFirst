package com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;

public class DoorOpen extends AbsDoorState {
    public DoorOpen(AbsCar mCar) {
        super(mCar);
    }

    @Override
    public boolean openDoor(int door) {
        System.out.println("Door already Open");
        return super.openDoor(door);
    }

    @Override
    public boolean closeDoor(int door) {
        System.out.println("changing door state");
        mCar.changeDoorState(mCar.getDoorClose());
        return super.closeDoor(door);
    }
}
