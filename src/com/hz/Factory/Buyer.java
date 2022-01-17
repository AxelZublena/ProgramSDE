package com.hz.Factory;

import com.hz.ConsoleWriter;

public abstract class Buyer {

    public void renderCar(ConsoleWriter writer) {
        Car car = chooseCar();
        car.printAll(writer);
    }

    public abstract Car chooseCar();
}
