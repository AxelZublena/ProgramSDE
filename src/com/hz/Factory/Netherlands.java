package com.hz.Factory;

public class Netherlands extends Country{
    @Override
    public Road chooseRoad() {
        return new DutchRoad();
    }
}
