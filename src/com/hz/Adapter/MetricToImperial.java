package com.hz.Adapter;

import com.hz.CarFactory.Car;

public class MetricToImperial implements SIToImperial {
    private Car car;

    public MetricToImperial(Car car){
        this.car = car;
    }
    @Override
    public double getMaxSpeed() {
        return this.convert(this.car.getMaxSpeed());
    }

    @Override
    public double getMaxRange() {
        return this.convert(this.car.getMaxRange());
    }

    private double convert(double speed){
        return Math.round(speed/1.609);
    }
}
