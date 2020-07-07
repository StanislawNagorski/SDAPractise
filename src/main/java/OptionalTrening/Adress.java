package OptionalTrening;

public class Adress {

    private String streetName;
    private int streetCode;
    private Country country;

    public Adress(String streetName, int streetCode, Country country) {
        this.streetName = streetName;
        this.streetCode = streetCode;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(int streetCode) {
        this.streetCode = streetCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
