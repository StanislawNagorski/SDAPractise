package HomeTasks0507.designPatterns.Strategy;

import java.util.List;

public interface TaxCalculator {

    public double calculateTax(List<Product> productList);

}
