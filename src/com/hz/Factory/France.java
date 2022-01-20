package com.hz.Factory;

public class France extends Country{
    @Override
    public Road chooseRoad() {
        return new FrenchRoad();
    }
}
