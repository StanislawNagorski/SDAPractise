package HomeTasks0507.designPatterns.Strategy;

import java.util.List;

public class TaxCalcUSA implements TaxCalculator {

    private final double USA_TAX = 0.04;

    @Override
    public double calculateTax(List<Product> productList) {
        double totalOrderTax = 0;
        for (Product product : productList) {
            totalOrderTax += product.getPrice() * USA_TAX;
        }
        return totalOrderTax;
    }
}
