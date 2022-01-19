package com.hz.State;

import com.hz.Factory.Buyer;

public class EngineRunning extends State{

    public EngineRunning(Buyer buyer){
        super(buyer);
    }

    @Override
    public void getKey() {
        System.out.println("Already has the key.");
    }

    @Override
    public void openCar() {
        System.out.println("Car already open.");
    }

    @Override
    public void insertAndTurnKey() {
        System.out.println("Engine already running.");
    }

    @Override
    public void driveCar() {
        System.out.println("Driving car ...");
        System.out.println("Stopping car and its engine ...");
        this.buyer.changeState(new EngineStopped(this.buyer));
    }

    @Override
    public void closeCar() {
        System.out.println("Cannot close the car when the engine is running.");
    }

    @Override
    public void storeKey() {
        System.out.println("Close the car before storing the key in the house.");
    }
}
