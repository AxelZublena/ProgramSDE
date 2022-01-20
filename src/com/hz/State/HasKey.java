package com.hz.State;

import com.hz.CarFactory.Buyer;

public class HasKey extends State{

    public HasKey(Buyer buyer){
        super(buyer);
    }

    @Override
    public void getKey() {
        System.out.println("Already has the key.");
    }

    @Override
    public void openCar() {
        System.out.println("Opening the car...");
        System.out.println("Car opened");
    }

    @Override
    public void insertAndTurnKey() {
        System.out.println("Starting the car ...");
        this.buyer.changeState(new EngineRunning(this.buyer));
        System.out.println("Engine running.");
    }

    @Override
    public void driveCar() {
        System.out.println("Cannot drive, the car is closed and the engine is not running.");
    }

    @Override
    public void closeCar() {
        System.out.println("The car is already locked.");
    }

    @Override
    public void storeKey() {
        this.buyer.setKey(false);
        System.out.println("Storing the key.");
    }


}
