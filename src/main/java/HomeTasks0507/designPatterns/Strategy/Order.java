package HomeTasks0507.designPatterns.Strategy;

import java.util.List;

public class Order {
    private int orderNumber;
    private String adress;
    private List<Product> productList;
    private TaxCalculator taxCalculator;

    public Order(int orderNumber, String adress, List<Product> productList) {
        this.orderNumber = orderNumber;
        this.adress = adress;
        this.productList = productList;

        //TODO: czy to jest poprawne zaimplementowanie contextu?
        if (adress.contains("USA")){
            taxCalculator = new TaxCalcUSA();
        } else {
            taxCalculator = new TaxCalcPoland();
        }
    }

    public double calculateOrderPrice() {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice = +product.getPrice();
        }
        return totalPrice;
    }

    public double calculateTAX() {
        return taxCalculator.calculateTax(productList);
    }
}

