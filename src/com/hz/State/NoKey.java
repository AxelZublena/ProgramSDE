package com.hz.State;

import com.hz.Factory.Buyer;

public class NoKey extends State{

    public NoKey(Buyer buyer){
        super(buyer);
    }

    @Override
    public void getKey() {
        this.buyer.setKey(true);
        System.out.println("Getting car key in the house ...");
        this.buyer.changeState(new HasKey(this.buyer));
    }

    @Override
    public void openCar() {
        System.out.println("No key, cannot open the car.");
    }

    @Override
    public void insertAndTurnKey() {
        System.out.println("No key, cannot enter the car to insert key.");
    }

    @Override
    public void driveCar() {
        System.out.println("No key, the car is close and not running.");
    }


    @Override
    public void closeCar() {
        System.out.println("The car is already locked.");
    }

    @Override
    public void storeKey() {
        System.out.println("Key already stored in the house.");
    }


}
