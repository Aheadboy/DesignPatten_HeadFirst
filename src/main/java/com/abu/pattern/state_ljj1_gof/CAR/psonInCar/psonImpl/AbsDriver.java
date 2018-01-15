package com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl;

import com.abu.pattern.state_ljj1_gof.CAR.CarFacade.SafeGuardFacade;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.IDriver;

public abstract class AbsDriver extends AbsPeoPleUseCar implements IDriver {


    public AbsDriver(SafeGuardFacade mCarFacade, String peplName) {
        super(mCarFacade, peplName);
    }

    public void driveCar() {
        mCarFacade.go();//send message to car
    }

    public void stopCar() {
        mCarFacade.stop();//send message to car
    }

    public void engineStart() {
        mCarFacade.engineStart();//send message to engine
    }

    public void engineStop() {
        mCarFacade.engineStop();//send message to engine
    }
}
