package HomeTasks0507.SimpleWebbStore;

import org.apache.commons.lang.StringUtils;

import java.util.List;

public class StoreView {

    Store store;

    public StoreView(Store store) {
        this.store = store;
    }

    public void printProductList(){
        List<Product> products = store.getProductList();
        StringBuilder tableMaker = new StringBuilder();
        String line = "---------------------------------------------------------------------------------\n";

        tableMaker.append(line);
        tableMaker.append(addTitles());
        tableMaker.append(line);

        for (Product product : products) {
            tableMaker.append(addRow(product));
        }
        tableMaker.append(line);

        String table = tableMaker.toString();

        System.out.println(table);

    }

    private String addTitles(){

        String[] titles = {"Nazwa produktu", "Ilość", "Promocja", "VAT", "CENA" };

        StringBuilder titleBuilder = new StringBuilder();

        String stick = "|";
        titleBuilder.append(stick);
        for (String title : titles) {
            titleBuilder.append(stick + centerString(title) + stick);
        }
        titleBuilder.append("\n");
        return titleBuilder.toString();
    }

    private String addRow(Product product){
        StringBuilder rowBuilder = new StringBuilder();
        String stick = "|";
        rowBuilder.append(stick);
        rowBuilder.append(stick + centerString(product.getName()) + stick);
        rowBuilder.append(stick + centerString(String.valueOf(product.getQuantity())) + stick);
        rowBuilder.append(stick + centerString(promoString(product)) + stick);
        rowBuilder.append(stick + centerString(String.valueOf(product.getVat()))+ stick);
        rowBuilder.append(stick + centerString(String.valueOf(product.getPrice())) + stick + "\n");

        return rowBuilder.toString();
    }

    private String centerString (String s) {
        int width = 14;
        return StringUtils.center(s, width);
    }

    private String promoString(Product product){
        if (product.isPromo()){
            return "TAK";
        } else {
            return "NIE";
        }
    }


    public static void main(String[] args) {
        StoreView sv = new StoreView(new Store());
        sv.printProductList();
    }
}


//Zadanie 5. Stworzyć klasę StoreView, zadaniem klasy będzie wyświetlenie na konsoli w postaci tabeli listy produktów.
//
//        Klasa powinna zawierać 1 pole typu Store (z zadania 3)
//
//        - Stworzyć Konstruktor 1 argumentowy, który przjmuje argument typu Store i ustawia go jako pole klasy
//        - Stworzyć metodę printProductList która wyświetla na konsoli w postaci tabeli listę produktów znajdującą się w klasie Store czyliu coś w stypu
//
//        --------------------------------------------------------------------------
//        | Nazwa produktu | Ilość          |  Promocja   |      VAT    |    CENA  |
//        -------------------------------------------------------------------------
//        |  Chleb         |     100        |     NIE     |       8     |	  3    |
//        |  Maslo         |     150        |     NIE     |       8     |     7    |
//        |  Mleko         |     200        |     NIE     |       8     |     3    |
//        |  Kawa          |     300        |     TAK     |       8     |     10   |
//        --------------------------------------------------------------------------