package com.hz.Facade;

import com.hz.ConsoleWriter;

public class Heater {

    public void on(ConsoleWriter writer) {

        writer.printText("The heater is on");
    }

    public void off(ConsoleWriter writer) {

        writer.printText("The heater is off");
    }

}
