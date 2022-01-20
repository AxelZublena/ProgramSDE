package com.hz.RoadFactory;

public class France extends Country {
    @Override
    public Road chooseRoad() {
        return new FrenchRoad();
    }
}
