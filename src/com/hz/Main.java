package com.hz;

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

        //Starting the car for a round trip and stopping the car after that
        car.startCar(writer);
        car.stopCar(writer);

    }
}
