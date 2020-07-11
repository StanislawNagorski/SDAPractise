package HomeTasks0507.designPatterns.Facade;

import HomeTasks0507.designPatterns.Facade.Orders.FlyOrder;
import HomeTasks0507.designPatterns.Facade.Orders.HotelOrder;
import HomeTasks0507.designPatterns.Facade.Orders.OrderConfirmation;
import HomeTasks0507.designPatterns.Facade.Orders.TaxiOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TripReservation {

    public static OrderConfirmation reserveTrip(String city, LocalDate tripStart, int tripLenght){
        List<OrderConfirmation> orderConfirmationList = new ArrayList<>();

        orderConfirmationList.add(new TaxiOrder().makeOrder(city, tripStart));
        orderConfirmationList.add(new HotelOrder().makeOrder(city, tripStart, tripLenght));
        orderConfirmationList.add(new FlyOrder().makeOrder(city, tripStart));

        boolean isOrderSuccesful = orderConfirmationList.stream()
                .allMatch(OrderConfirmation::isValid);

        if (isOrderSuccesful){
            return new OrderConfirmation(true);
        } else {
            return new OrderConfirmation(false);
        }
    }
}
