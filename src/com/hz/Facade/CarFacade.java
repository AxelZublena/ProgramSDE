package com.hz.Facade;

import com.hz.ConsoleWriter;

public class CarFacade {
    private Engine engine = new Engine();
    private Heater heater = new Heater();
    private Radio radio = new Radio();

    //Renders all actions needed to start the car
    public void startCar (ConsoleWriter writer) {
        writer.printText("\nNow, let's go on a holiday with the car.\n" +
                "Firstly, we need to start the car:");
        engine.on(writer);
        heater.on(writer);
        radio.on(writer);
    }

    //Renders all actions needed to stop the car
    public void stopCar (ConsoleWriter writer) {
        writer.printText("\nIn the end, we need to stop the car:");
        engine.off(writer);
        heater.off(writer);
        radio.off(writer);
    }

}
