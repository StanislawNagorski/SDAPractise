package HomeTasks0507.designPatterns.Facade.Orders;

import java.time.LocalDate;

public class FlyOrder implements Order {
    @Override
    public OrderConfirmation makeOrder(String city, LocalDate tripStart) {
        if (tripStart.getYear()==2020){
            return new OrderConfirmation(false);
        } else {
            return new OrderConfirmation(true);
        }
    }

    @Override
    public OrderConfirmation makeOrder(String city, LocalDate tripStart, int tripLenght) {
        return null;
    }
}
