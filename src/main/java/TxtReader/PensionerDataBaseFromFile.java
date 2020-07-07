package TxtReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class PensionerDataBaseFromFile implements PensionerDataBase {

    private TextReader textReader;
    private List<Pensioner> listOfPensionersFromFile;

    public PensionerDataBaseFromFile(File inPutFile) throws FileNotFoundException {
        textReader = new TextReader(inPutFile);
        listOfPensionersFromFile = textReader.createListWithPensioners();
    }

    public BigDecimal getPension(String pesel){
        Pensioner pensioner = getPensionerByPesel(pesel);
        return pensioner.getPension();
    }

    public Pensioner getPensionerByPesel(String pesel){
        //TODO dodać comparator i inne wyszukiwanie
        for (Pensioner pensioner : listOfPensionersFromFile) {
            if (pensioner.getPesel().equals(pesel)){
                return pensioner;
            }
        }
     return null;
    }

}
