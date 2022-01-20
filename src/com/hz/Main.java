package com.hz;

import com.hz.Facade.CarFacade;
import com.hz.CarFactory.*;
import com.hz.RoadFactory.Country;
import com.hz.RoadFactory.France;
import com.hz.RoadFactory.Netherlands;

public class Main {

    public static void main(String[] args) {
        Buyer buyer = null;
        CarFacade car = new CarFacade();

        Country country = null;

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

        writer.printText("\nTell me whether you live in the Netherlands or in France. Depending on your answer, you will drive on different roads: \n" +
                "1 - Netherlands \n" +
                "2 - France");

        choice = Integer.parseInt(reader.readLine());

        // Depending on the answer, it shows the most appropriate road for the country.
        if (choice == 1) {
            country = new Netherlands();
        } else {
            country = new France();
        }
        country.renderRoad(writer);


        writer.printText("\nNow, it is time to choose whether you will drive your car to work or you are going on a holiday with the car: \n" +
                "1 - Work \n" +
                "2 - Holiday");

        int driveChoice = Integer.parseInt(reader.readLine());

        // Depending on the answer, it drive the cars with different design pattern.
        if (driveChoice == 1) {
            // Logic to get key, open, start, drive, close the car and store key
            drivingToWorkRoutine(buyer);
        } else {
            //Starting the car for a round trip and stopping the car after that
            car.startCar(writer);
            car.stopCar(writer);

        }

    }

    private static void drivingToWorkRoutine(Buyer buyer) {
        buyer.getState().driveCar();
        buyer.getState().getKey();
        buyer.getState().openCar();
        buyer.getState().insertAndTurnKey();
        buyer.getState().driveCar();
        buyer.getState().closeCar();
        buyer.getState().storeKey();
    }
}
