package HomeTasks0507.SimpleWebbStore;


public class Product {

    private String name;
    private double price;
    private boolean isPromo;
    private double promoPrice;
    private double vat;
    private int quantity;

    public Product(String name, double price, boolean isPromo, double promoPrice, double vat, int quantity) {
        this.name = name;
        this.price = price;
        this.isPromo = isPromo;
        this.promoPrice = promoPrice;
        this.vat = vat;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        if (name == null) {
            return "Null Product";
        }

        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}


//Zadanie 1. Stworzyć klasę "Product", powinna ona zawierać pola określające:
//        nazwę
//        cenę
//        czy jest w promocji (boolean)
//        cenę promocyjną
//        stawkę VAT
//        ilosc
//
//        Ponadto powinan zawierać dwa konstruktowy
//        - bezrgumentowy który nic nie robi
//        - 5 argumentowy który przyjmuje i ustawia wszystkie pola
//
//        Klasa powinna zawierać metody typu get i set zwracająca i uswawiająca wszystkie pola w klasie
