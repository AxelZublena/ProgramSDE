package com.hz.Factory;

public class AdultBuyer extends Buyer{
    @Override
    public Car chooseCar() {
        return new FamilyCar();
    }
}
