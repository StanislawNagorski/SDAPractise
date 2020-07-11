package HomeTasks0507.designPatterns.Facade.Orders;

import java.time.LocalDate;

public class HotelOrder implements Order {
    @Override
    public OrderConfirmation makeOrder(String city, LocalDate tripStart) {
        return null;
    }

    @Override
    public OrderConfirmation makeOrder(String city, LocalDate tripStart, int tripLenght) {
        return new OrderConfirmation(true);
    }
}
