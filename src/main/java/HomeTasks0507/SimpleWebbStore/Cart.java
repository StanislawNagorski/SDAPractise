package HomeTasks0507.SimpleWebbStore;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productsInChart;

    public Cart() {
        this.productsInChart = new ArrayList<>();
    }

    public boolean addProductToCart(Product product){
        return productsInChart.add(product);
    }

    public List<Product> getProductsInChart(){
        return productsInChart;
    }

    public boolean removeProduct(Product product){
        return productsInChart.remove(product);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Product product : productsInChart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}

//Zadanie 6. Stworzyć klasę Cart, Która będzie stanowić koszyk użytkownika
//
//        - lista produktów (pole typu List) parametryzowana typem Product z zadania 1 (List<Product>).
//        Następnie:
//        - Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę produktów (najlepiej ArrayList)
//        Potem stworzyć metody:
//        - Stworzyć metodę addProductToCart, która przyjmuje 1 argument typu Product (z zadania 1) i dodaje go do listy produktów.
//        - Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę produktów w koszu;
//        - Stworzyć metodę removeProduct, która przyjmuje 1 argument typu Product (z zadania 1) i usuwa go z listy produktów -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
//        - Stworzyć metodę getTotalPrice, zwraca całkowitą cenę produktów w koszyku
