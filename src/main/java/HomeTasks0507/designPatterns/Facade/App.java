package HomeTasks0507.designPatterns.Facade;

import HomeTasks0507.designPatterns.Facade.Orders.OrderConfirmation;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        OrderConfirmation bytomTrip = TripReservation.reserveTrip("Bytom", LocalDate.now(), 14);
        System.out.println("Czy polecimy do Bytomia w 2020? => " + bytomTrip.isValid());
        OrderConfirmation gdańskTrip
                = TripReservation.reserveTrip("Gdańsk",
                LocalDate.of(2021, 07, 01),
                2);
        System.out.println("A może weekendowy wypadzik do Trójmiasta? => " + gdańskTrip.isValid());
    }
}
