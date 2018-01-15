package com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl;

import com.abu.pattern.state_ljj1_gof.CAR.CarFacade.SafeGuardFacade;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.IPassinger;

public abstract class AbsPassinger extends AbsPeoPleUseCar implements IPassinger {


    public AbsPassinger(SafeGuardFacade mCarFacade, String peplName) {
        super(mCarFacade, peplName);
    }

    public void chat() {
        System.out.println(this.getClass().getSimpleName().toString() + " now chating with others");
    }
}
