package com.hz.State;

import com.hz.CarFactory.Buyer;

public class EngineStopped extends State{

    public EngineStopped(Buyer buyer){
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
        System.out.println("Cannot drive the car, start the engine first.");
    }

    @Override
    public void closeCar() {
        System.out.println("Closing the car...");
        this.buyer.changeState(new HasKey(this.buyer));
    }

    @Override
    public void storeKey() {
        System.out.println("Close the car first.");
    }
}
