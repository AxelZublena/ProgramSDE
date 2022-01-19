package com.hz.Factory;

import com.hz.ConsoleWriter;

public interface Car {
    void printAll(ConsoleWriter writer);
    void image(ConsoleWriter writer);
    void pros(ConsoleWriter writer);
    void cons(ConsoleWriter writer);
    double getMaxSpeed();
    double getMaxRange();
}
