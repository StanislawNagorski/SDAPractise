package HomeTasks0507.designPatterns.Strategy;

import java.util.List;

public class TaxCalcPoland implements TaxCalculator {
    private final double POLISH_TAX = 0.23;

    @Override
    public double calculateTax(List<Product> productList) {
        double totalOrderTax = 0;
        for (Product product : productList) {
            totalOrderTax += product.getPrice() * POLISH_TAX;
        }
        return totalOrderTax;
    }
}

