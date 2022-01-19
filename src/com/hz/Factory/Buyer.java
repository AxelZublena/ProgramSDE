package com.hz.Factory;

import com.hz.ConsoleWriter;
import com.hz.State.NoKey;
import com.hz.State.State;

public abstract class Buyer {
    public Car car;
    public State state;
    public boolean hasKey;

    public Buyer(){
        this.hasKey = false;
        this.state = new NoKey(this);
    }

    public void changeState(State state){
        this.state = state;
    }
    public State getState(){
        return this.state;
    }

    public void setKey(boolean hasKey){
        this.hasKey = hasKey;
    }
    public boolean getKey(){
        return this.hasKey;
    }

    public void renderCar(ConsoleWriter writer) {
        this.car = chooseCar();
        car.printAll(writer);
    }

    public abstract Car chooseCar();

    public Car getCar() {
        return car;
    }
}
