package TxtReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class UserInterface {


    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src\\main\\java\\TxtReader\\sampleInput.txt");

        PensionerDataBaseFromFile pensionerDataBaseFromFile = new PensionerDataBaseFromFile(inputFile);
        PensionerHandler pensionerHandler = new PensionerHandler(pensionerDataBaseFromFile);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Jeśli chcesz wyświtlić wysokość emerytury podaj PESEL");
        System.out.println("Jeśli chcesz zwiększyć emeryturę podaj PESEL i słowo \"up\"");

        String userConsoleInput = scanner.nextLine();
        String[] userCommands = userConsoleInput.trim().split("\\s");
        String askedPESEL = userCommands[0];

        boolean userPutOnlyPESEL = userCommands.length == 1;
        boolean userPutPESELAndCommand = userCommands.length == 2;

        if (userPutOnlyPESEL) {
            BigDecimal pension = pensionerDataBaseFromFile.getPension(askedPESEL);
            System.out.println("Pensja tego emeryta to: " + pension);

        } else if (userPutPESELAndCommand) {
            pensionerHandler.increasePensionByFivePercent(askedPESEL);
            System.out.println("Podwyżka z pełnym sukcesem!");
            BigDecimal pension = pensionerDataBaseFromFile.getPension(askedPESEL);
            System.out.println("Nowa pensja to: " + pension);
        }
    }

}


