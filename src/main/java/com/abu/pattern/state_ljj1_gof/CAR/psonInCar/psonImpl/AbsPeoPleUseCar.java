package com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl;

import com.abu.pattern.state_ljj1_gof.CAR.CarFacade.SafeGuardFacade;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.IPeopleUseCar;

public abstract class AbsPeoPleUseCar implements IPeopleUseCar {
    SafeGuardFacade mCarFacade;
    String mPeopleName;

    public AbsPeoPleUseCar(SafeGuardFacade mCarFacade, String peplName) {
        this.mCarFacade = mCarFacade;
        this.mPeopleName = peplName;
    }

    public String getmPeopleName() {
        return mPeopleName;
    }

    public void openDoor(int door) {
        mCarFacade.openDoor(door);
    }

    public void closeDoor(int door) {
        mCarFacade.closeDoor(door);
    }

    public void sitIn() {
        System.out.println(this.getClass().getSimpleName().toString() + " now sit in car");
    }
}
