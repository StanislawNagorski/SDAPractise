package TxtReader;

import java.math.BigDecimal;

public class Pensioner implements Comparable {

    private String pesel;
    private BigDecimal pension;

    public Pensioner(String pesel, BigDecimal pension) {
        this.pesel = pesel;
        this.pension = pension;
    }

    public String getPesel() {
        return pesel;
    }


    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
