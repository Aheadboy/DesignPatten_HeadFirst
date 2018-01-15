package com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.IDoorState;

public  class AbsDoorState implements IDoorState {
    AbsCar mCar;

    public AbsDoorState(AbsCar mCar) {
        this.mCar = mCar;
    }

    public boolean openDoor(int door) {
        System.out.println("openDoor(int door)  "+door);
        return false;
    }

    public boolean closeDoor(int door) {
        System.out.println("closeDoor(int door) "+ door);
        return false;
    }
}
