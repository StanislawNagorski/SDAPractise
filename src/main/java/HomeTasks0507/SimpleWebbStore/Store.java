package HomeTasks0507.SimpleWebbStore;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList;

    public Store() {
        productList = new ArrayList<>();
        productList.add(new Product("Olimpic Sabre", 300.00, false, 300.00, 0.23, 30 ) );
        productList.add(new Product("Olimpic Epee", 280.00, false, 300.00, 0.23, 50) );
        productList.add(new Product("Olimpic Foil", 250.00, false, 300.00, 0.23, 26 ) );
        productList.add(new Product("HEMA Sabre", 1250.00, true, 1249.98, 0.23, 5 ) );
        productList.add(new Product("HEMA Repier", 1560.00, true, 999.98, 0.23, 2 ) );
    }

    public boolean addProduct(Product product){
        return productList.add(product);
    }

    public List<Product> getProductList(){
        return productList;
    }

    public boolean removeProduct(Product productToRemove){
//        for (Product product : productList) {
//            if(productToRemove.equals(product)){
//                return productList.remove(product);
//            }
//        }
        return productList.remove(productToRemove);
    }

    public int getProductQuantity(String productToReturnQuantityName){
        for (Product product : productList) {
            if(product.getName().equals(productToReturnQuantityName)){
                return product.getQuantity();
            }
        }
        return -1;
    }

}


//Zadanie 3. Stworzyć klasę sklep (Store) który zawiera pola:
//        - lista produktów (pole typu List) parametryzowana typem Product z zadania 1 (List<Product> productList).
//        Następnie:
//        - Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę produktów (oczywiście chodzi przpisaniu nowej pustej listy polu klasy "productList" - najlepiej ArrayList) i wypełnia ją przykładowymi danymi 5-10 produktów.
//        Następnie dodać następujące metody
//        - Stworzyć metodę addProduct, która przyjmuje 1 argument typu Product (z zadania 1) i dodaje go do listy produktów.
//        - Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę produktów;
//        - Stworzyć metodę removeProduct, która przyjmuje 1 argument typu Product (z zadania 1) i usuwa go z listy produktów -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
//        - Stworzyć metodę getProductQuantity, która przy przyjmuje 1 argument typu String, który jest nazwą produktu i zwraca typ int z ilością danego produktu lub -1 jeśli nie ma na liście takiego produktu.
