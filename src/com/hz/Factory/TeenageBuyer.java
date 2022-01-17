package com.hz.Factory;

public class TeenageBuyer extends Buyer{
    @Override
    public Car chooseCar() {
        return new SportsCar();
    }
}
