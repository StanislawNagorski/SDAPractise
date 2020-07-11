package HomeTasks0507.designPatterns.Facade.Orders;

public class OrderConfirmation {
    private boolean isValid;
    private int confirmationNumber;
    private static int confirmationCounter = 1;


    public OrderConfirmation(boolean isValid){
        this.isValid = isValid;
        confirmationNumber = ++confirmationCounter;
    }

    public boolean isValid() {
        return isValid;
    }
}
