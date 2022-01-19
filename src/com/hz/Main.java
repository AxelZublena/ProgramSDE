package com.hz;

import com.hz.Adapter.MetricToImperial;
import com.hz.Adapter.SIToImperial;
import com.hz.Facade.CarFacade;
import com.hz.Factory.*;

public class Main {

    public static void main(String[] args) {
        Buyer buyer = null;
        CarFacade car = new CarFacade();

        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        writer.printText("Tell me whether you are a teenager or an adult. As a result, I can offer you the best car for you: \n" +
                "1 - Teenager \n" +
                "2 - Adult");

        int choice = Integer.parseInt(reader.readLine());

        // Depending on the answer, it shows the most appropriate car for the buyer.
        if (choice == 1) {
            buyer = new TeenageBuyer();
        } else {
            buyer = new AdultBuyer();

        }
        buyer.renderCar(writer);

        // Gets information about the car for American user
        SIToImperial metricToImperialAdapter = new MetricToImperial(buyer.getCar());
        double carMaxSpeedMPH = metricToImperialAdapter.getMaxSpeed();
        double carMaxRangeMiles = metricToImperialAdapter.getMaxRange();
        writer.printText("\nMax speed of the car is: " + carMaxSpeedMPH + " MPH");
        writer.printText("Max range of the car is: " + carMaxRangeMiles + " Miles");
        writer.printText("\n");

        // Logic to get key, open, start, drive, close the car and store key
        buyer.getState().driveCar();
        buyer.getState().getKey();
        buyer.getState().openCar();
        buyer.getState().insertAndTurnKey();
        buyer.getState().driveCar();
        buyer.getState().closeCar();
        buyer.getState().storeKey();

        writer.printText("\n");

        //Starting the car for a round trip and stopping the car after that
        car.startCar(writer);
        car.stopCar(writer);

    }
}
