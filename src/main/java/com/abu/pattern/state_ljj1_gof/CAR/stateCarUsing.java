package com.abu.pattern.state_ljj1_gof.CAR;

import com.abu.pattern.state_ljj1_gof.CAR.CarFacade.SafeGuardFacade;
import com.abu.pattern.state_ljj1_gof.CAR.CarFacade.SafeGuardFacadeImpl;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.AbsCar;
import com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl.FourDoorCar;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl.AbsDriver;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl.AbsPassinger;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl.DLjj;
import com.abu.pattern.state_ljj1_gof.CAR.psonInCar.psonImpl.P1;

public class stateCarUsing {
    public static void main(String[] args) {
        AbsCar car = new FourDoorCar();//一辆车
        SafeGuardFacade safeGuardFacade = new SafeGuardFacadeImpl(car);//车，与人之间的门面Facade
        AbsDriver driver = new DLjj(safeGuardFacade, "ljj1");
        AbsPassinger p1 = new P1(safeGuardFacade, "p1");
        AbsPassinger p2 = new P1(safeGuardFacade, "p2");
        AbsPassinger p3 = new P1(safeGuardFacade, "p3");
//
        driver.driveCar();
    }
}
