package HomeTasks0507.designPatterns.Facade.Orders;

import java.time.LocalDate;

public interface Order {

    public OrderConfirmation makeOrder(String city, LocalDate tripStart);
    public OrderConfirmation makeOrder(String city, LocalDate tripStart, int tripLenght);
}
