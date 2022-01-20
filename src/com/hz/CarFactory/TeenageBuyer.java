package com.hz.CarFactory;

public class TeenageBuyer extends Buyer{
    @Override
    public Car chooseCar() {
        return new SportsCar();
    }
}
