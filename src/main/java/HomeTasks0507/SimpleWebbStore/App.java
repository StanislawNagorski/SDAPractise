package HomeTasks0507.SimpleWebbStore;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Cart cart = new Cart();
        CartView cartView = new CartView(cart);

        Store store = new Store();
        StoreView storeView = new StoreView(store);

        storeView.printProductList();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            cart.addProductToCart(store.getProductList().get(i));
        }
        System.out.println("Koszyk Klienta");
        cartView.printCart();

    }
}
