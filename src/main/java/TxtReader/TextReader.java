package TxtReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class TextReader {

    private File inPutFile;

    public TextReader(File inPutFile){
        this.inPutFile = inPutFile;
    }

    private String textToString() throws FileNotFoundException {
        Scanner scanner = new Scanner(inPutFile);

        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append("\n");
        }

        String fileIntoString = stringBuilder.toString();
        return  fileIntoString;
    }

    public List<Pensioner> createListWithPensioners() throws FileNotFoundException {
        List<Pensioner> pensionersFromFile = new ArrayList<>();

        String inPutFileString = textToString();
        Scanner scanner = new Scanner(inPutFileString);

        while (scanner.hasNextLine()){
            String[] lineSplitedIntoPESELAndPension = scanner.nextLine().split(";");

            pensionersFromFile.add(createPensionerFromStringArray(lineSplitedIntoPESELAndPension));
        }
        return pensionersFromFile;
    }

    private Pensioner createPensionerFromStringArray(String[] spilitedLine){
        String pesel = spilitedLine[0];
        Integer intPension = Integer.valueOf(spilitedLine[1]);
        BigDecimal pension = BigDecimal.valueOf(intPension);
        return new Pensioner(pesel, pension);
    }
}
