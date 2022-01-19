package com.hz.State;

import com.hz.Factory.Buyer;

public abstract class State {
    Buyer buyer;

    State(Buyer buyer){
        this.buyer = buyer;
    }

    public abstract void getKey();
    public abstract void openCar();
    public abstract void insertAndTurnKey();
    public abstract void driveCar();
    public abstract void closeCar();
    public abstract void storeKey();
}
