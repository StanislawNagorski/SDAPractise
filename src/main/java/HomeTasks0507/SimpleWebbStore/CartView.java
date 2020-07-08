package HomeTasks0507.SimpleWebbStore;

import org.apache.commons.lang.StringUtils;

public class CartView {

    private Cart cart;
    private final int ROW_WEIGHT = 16;
    private final String STICK = "|";
    private final String LINE = "-----------------------------------------------------\n";

    public CartView(Cart cart) {
        this.cart = cart;
    }

    public void printCart() {
        StringBuilder chartViewBuilder = new StringBuilder();
        chartViewBuilder.append(LINE);
        chartViewBuilder.append(addTitles());
        chartViewBuilder.append(LINE);
        for (Product product : cart.getProductsInChart()) {
            chartViewBuilder.append(STICK + StringUtils.center(product.getName(), ROW_WEIGHT) + STICK);
            int numberOfSameProductsInChart = countSameProductsInChart(product);
            chartViewBuilder.append(STICK + StringUtils.center(String.valueOf(numberOfSameProductsInChart), ROW_WEIGHT) + STICK);
            double totalPriceOfDuplicates = priceOfDuplicates(numberOfSameProductsInChart, product.getPrice());
            chartViewBuilder.append(STICK + StringUtils.center(String.valueOf(totalPriceOfDuplicates), ROW_WEIGHT) + STICK+"\n");
        }
        chartViewBuilder.append(LINE);
        chartViewBuilder.append(addTotals());

        System.out.println(chartViewBuilder.toString());

    }

    private String addTitles() {
        String[] titles = {"Nazwa produktu", "Ilość", "Cena"};
        StringBuilder titleBuilder = new StringBuilder();
        for (String title : titles) {
            titleBuilder.append(STICK + StringUtils.center(title, ROW_WEIGHT) + STICK );
        }
        titleBuilder.append("\n");

        return titleBuilder.toString();
    }

    private int countSameProductsInChart(Product productToCount) {
        int duplicates = 1;
        for (Product product : cart.getProductsInChart()) {
            if (product.getName().equals(productToCount.getName())) {
                duplicates++;
            }
        }
        return duplicates;
    }

    private double priceOfDuplicates(int numberOfSameProduct, double price) {
        return price * numberOfSameProduct;
    }

    private String addTotals() {
        StringBuilder totalsBuilder = new StringBuilder();
        totalsBuilder.append(STICK + StringUtils.center("SUMA", ROW_WEIGHT) + STICK);
        double[] totalQuantityAndPrice = totalBasketQuantityAndPrice();
        int totalQuantity = (int) totalQuantityAndPrice[0];
        totalsBuilder.append(STICK + StringUtils.center(String.valueOf(totalQuantity), ROW_WEIGHT) + STICK);
        double totalPrice = totalQuantityAndPrice[1];
        totalsBuilder.append(STICK + StringUtils.center(String.valueOf(totalPrice), ROW_WEIGHT) + STICK);
        return totalsBuilder.toString();
    }

    private double[] totalBasketQuantityAndPrice() {
        double[] totalQuantityAndPrice = new double[2];
        int quantity = 0;
        double price = 0;

        for (Product product : cart.getProductsInChart()) {
            quantity++;
            price += product.getPrice();
        }

        totalQuantityAndPrice[0] = quantity;
        totalQuantityAndPrice[1] = price;

        return totalQuantityAndPrice;
    }


}

//Zadanie 7. Stworzyć klasę CartView, zadaniem klasy będzie wyświetlenie na konsoli w postaci tabeli zawartosci kosza.
//
//        Klasa powinna zawierać 1 pole typu Cart (z zadania 6)
//
//        - Stworzyć Konstruktor 1 argumentowy, który przjmuje argument typu Cart i ustawia go jako pole klasy
//        - Stworzyć metodę printCart która wyświetla na konsoli w postaci tabeli listę produktów znajduącą się w koszu (Cart);
//
//        -------------------------------------------------
//        | Nazwa produktu | Ilość        |    Cena       |
//        -------------------------------------------------
//        |  Chleb         |     1        |     3         |
//        |  Maslo         |     1        |     7         |
//        |  Mleko         |     2        |     9         |
//        -------------------------------------------------
//        SUMA: 19
