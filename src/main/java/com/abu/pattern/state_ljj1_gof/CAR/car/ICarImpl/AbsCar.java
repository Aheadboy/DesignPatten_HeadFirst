package com.abu.pattern.state_ljj1_gof.CAR.car.ICarImpl;

import com.abu.pattern.state_ljj1_gof.CAR.car.ICarState;
import com.abu.pattern.state_ljj1_gof.CAR.car.IDoorState;
import com.abu.pattern.state_ljj1_gof.CAR.car.IEngineState;
import com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl.CarGo;
import com.abu.pattern.state_ljj1_gof.CAR.car.carStateImpl.CarStop;
import com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl.DoorClosed;
import com.abu.pattern.state_ljj1_gof.CAR.car.doorStateImpl.DoorOpen;
import com.abu.pattern.state_ljj1_gof.CAR.car.engineStateImpl.EngineStart;
import com.abu.pattern.state_ljj1_gof.CAR.car.engineStateImpl.EngineStop;

public abstract class AbsCar {
 public    IEngineState mEngineState;
   public IDoorState mIDoorState;
 public    ICarState mICarState;
    //
    IEngineState engineStart;
    IEngineState engineStop;
    //
    IDoorState doorOpen;
    IDoorState doorClose;
    //
    ICarState carGo;
    ICarState carStop;

    public AbsCar() {
        this.engineStart = new EngineStart(this);
        this.engineStop = new EngineStop(this);
        //
        this.doorClose = new DoorClosed(this);
        this.doorOpen = new DoorOpen(this);
//
        this.carGo = new CarGo(this);
        this.carStop = new CarStop(this);
        mICarState = carStop;
        mIDoorState = doorClose;
        mEngineState = engineStop;
    }

    public IEngineState getEngineStart() {
        return engineStart;
    }

    public IEngineState getEngineStop() {
        return engineStop;
    }

    public IDoorState getDoorOpen() {
        return doorOpen;
    }

    public IDoorState getDoorClose() {
        return doorClose;
    }

    public ICarState getCarGo() {
        return carGo;
    }

    public ICarState getCarStop() {
        return carStop;
    }

    public void changeEngineState(IEngineState engineState) {
        this.mEngineState = engineState;
    }

    public void changeDoorState(IDoorState doorState) {
        this.mIDoorState = doorState;
    }

    public void changeCarState(ICarState carState) {
        this.mICarState = carState;
    }

    public void openDoor(int door) {
        this.mIDoorState.openDoor(door);
    }

    public void engineStop() {
        this.mEngineState.engineStop();
    }

    public void engineStart() {
        this.mEngineState.engineStart();
    }

    public void closeDoor(int door) {
        this.mIDoorState.closeDoor(door);
    }

    public void go() {
        this.mICarState.go();
    }

    public void stop() {
        this.mICarState.stop();
    }
}
