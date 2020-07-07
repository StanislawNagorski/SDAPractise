package TxtReader;

import java.math.BigDecimal;

public class PensionerHandler {

    private PensionerDataBase pensionerDataBase;

    public PensionerHandler(PensionerDataBase pensionerDataBase){
        this.pensionerDataBase = pensionerDataBase;
    }

    public void increasePensionByFivePercent(String pesel){
        Pensioner pensioner = pensionerDataBase.getPensionerByPesel(pesel);
        BigDecimal pension = pensioner.getPension();
        BigDecimal percentToIncrease = BigDecimal.valueOf(1.05);
        BigDecimal newPension = pension.multiply(percentToIncrease);

        pensioner.setPension(newPension);
    }

}
