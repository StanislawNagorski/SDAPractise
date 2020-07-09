package HomeTasks0507.designPatterns.Strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("Kaszanka", 15.50), new Product("Kiełbasa", 99.99));
        Order order = new Order(1, "Gdzieś poza mackami imperialistów", productList);
        System.out.println("Podatek w nieUSA to: " + order.calculateTAX());
        Order orderFromUSA = new Order(1, "USA babe!!!!", productList);
        System.out.println("Podatek w stanie Nowy York to: " + orderFromUSA.calculateTAX());
    }
}
