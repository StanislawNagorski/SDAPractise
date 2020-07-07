package OptionalTrening;

public class Country {
    private String name;
    private String countyCode;

    public Country(String name, String countyCode) {
        this.name = name;
        this.countyCode = countyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
}
