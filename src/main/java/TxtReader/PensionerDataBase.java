package TxtReader;

import java.io.File;
import java.math.BigDecimal;

public interface PensionerDataBase {

    public BigDecimal getPension(String pesel);
    public Pensioner getPensionerByPesel(String pesel);

}
