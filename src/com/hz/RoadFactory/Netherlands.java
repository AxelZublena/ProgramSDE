package com.hz.RoadFactory;

public class Netherlands extends Country {
    @Override
    public Road chooseRoad() {
        return new DutchRoad();
    }
}
