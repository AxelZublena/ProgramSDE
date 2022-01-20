package com.hz.Factory;

import com.hz.ConsoleWriter;

public abstract class Country {

    public Road road;

    public void renderRoad(ConsoleWriter writer) {
        this.road = chooseRoad();
        road.printAll(writer);
    }

    public abstract Road chooseRoad();

    public Road getRoad() {
        return road;
    }
}
