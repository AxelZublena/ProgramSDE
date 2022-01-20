package com.hz.CarFactory;

public class AdultBuyer extends Buyer{
    @Override
    public Car chooseCar() {
        return new FamilyCar();
    }
}
