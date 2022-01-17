package com.hz.Facade;

import com.hz.ConsoleWriter;

public class Engine {


    public void on(ConsoleWriter writer) {
        writer.printText("The engine is started");
    }

    public void off(ConsoleWriter writer) {
        writer.printText("The engine is turned off");
    }
}
