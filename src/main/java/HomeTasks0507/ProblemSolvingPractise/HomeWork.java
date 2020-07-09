package HomeTasks0507.ProblemSolvingPractise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomeWork {

//    1. Napisać metodę która policzy potege danej liczby całkowitej. Tj. przyjmuje dwa argumenty typu int i zwraca typ long. Nie używać gotowych funkcji w javie. Wywołać stworząną funkcje kilka razy w metodzie main każdy wynik działania wypisać na konsole.
//    Oczekiwane działanie:
//
//    pow(3, 2) = 9             (3 do potęgi drugiej)
//    pow(2, 3) = 8             (2 do potęgi 3)

    public static long power(int a, int b) {
        int temp = 1;
        for (int i = 0; i < b; i++) {
            temp *= a;
        }
        return temp;
    }

//    2. Napisać metodę która przyjmuje dowolną liczbę argumentów typu int (skorzystać ze składni zmiennej liczny
//            argumetów tak zwane varargs) i zwróci iloczyn tych liczb.
//    Oczekiwane działanie:
//
//    multiply(2, 3, 6) = 36                --->   (2 * 3 *  6 = 36)
//    multiply(1, 2, 2, 8) = 32             --->   (1 * 2 * 2 * 8) = 36
//    multiply(1, 2, 2, 1, 1, 2) = 8             --->   (1 * 2 * 2 * 1 * 1 * 2) = 36

    public static long multiplyAsLong(int... numberToMultiply) {
        int result = 1;
        for (int i = 0; i < numberToMultiply.length; i++) {
            result *= numberToMultiply[i];
        }
        return result;
    }

//    3. Napisać metodę która przyjmuje jedną liczbę (int) i zwraca sume cyr tej liczby.
//    Oczekiwany resultat:
//
//    sumOfDigits(45) = 9    ----> (4 + 5 = 9)

    public static int addDigitsInNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int result = 0;
        result += number % 10;
        int anotherDigitsToPassOn = number / 10;

        return result + addDigitsInNumber(anotherDigitsToPassOn);
    }


//    4. Napisz program, który wyświetli na konsoli amerykańską flagę

    public static void printAwsomeAndGlory() {
        int numberOfStripsOfAwsome = 15;
        int numberOfStripsWithStars = 9;

        for (int i = 0; i < numberOfStripsOfAwsome; i++) {
            if (i < numberOfStripsWithStars) {
                if (i % 2 == 0) {
                    System.out.println("* * * * * * ==================================");
                } else {
                    System.out.println(" * * * * *  ==================================");
                }
            } else {
                System.out.println("==============================================");
            }
        }

    }

//    5. Napisać metodę która przyjmuje liczbę całkowitą (int) i zwraca obliczoną silnie tej liczby.
//    Oczekiwane dzialanie
//
//    silnia(5) = 120			(1 * 2 * 3 * 4 * 5 = 120)

    public static long factorialOf(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialOf(number - 1);
    }

//    6. Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie oznaczać liczbę sekund. Metoda ma zwracać string który będzie wskazywał ile to jest godzin minut i sekund.
//    Oczekiwany resultat:
//
//    calculateSecondsToTime(86399) = "23:59:59"          (bo 86399 sekund to 23 godziny, 59 minut i 59 sekund)

    public static String secondsToHHMMSSFormat(int secondsToCalc) {
        int secondsInMinute = 60;
        int secondsInHour = 3600;

        int seconds = secondsToCalc % secondsInMinute;
        int minutes = (secondsToCalc % secondsInHour) / secondsInMinute;
        int hours = (secondsToCalc) / secondsInHour;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

//    7. Napisz program, który przjmuje tablicę liczb (int) i zwraca tablicę liczb, która jest odwróconą talicę tej która przyszła jako argumenty
//    Oczekiwane działanie:
//
//    int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
//    reverseTable(liczby) = (210, 5456, 34, 7867, 564, 45, 1

    public static int[] reverseThatTable(int[] tableToReverse) {
        int inputArrayLenght = tableToReverse.length;
        int[] reversedTable = new int[inputArrayLenght];
        for (int i = 0; i < tableToReverse.length; i++) {
            reversedTable[i] = tableToReverse[inputArrayLenght - 1 - i];
        }
        return reversedTable;
    }

    //8. Napisać metodę która przyjmuje tablicę liczb i sprawdzić czy tablica liczb jest palindromem. Zwrócić true lub false

    public static boolean palidromCheck(int numberToCheck) {
        String stringFromNumber = String.valueOf(numberToCheck);
        for (int i = 0; i < stringFromNumber.length()/2; i++) {
            if (stringFromNumber.charAt(i) != stringFromNumber.charAt(stringFromNumber.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ////// zad 1
        int a = 3;
        int b = 2;
        int c = 6;
        int d = 8;
        System.out.println("a do potęgi b to: " + power(a, b));
        ////// zad 2
        System.out.println("a * b * c to: " + multiplyAsLong(a, b, c));
        System.out.println("a * b * c * d to: " + multiplyAsLong(a, b, c, d));
        ////// zad 3
        System.out.println("suma cyfr w 3333 to:" + addDigitsInNumber(3333));
        ////// zad 4
        printAwsomeAndGlory();
        ////// zad 5
        System.out.println("Silnia z 5 to: " + factorialOf(5));
        ////// zad 6
        System.out.println("86399 sekund to: " + secondsToHHMMSSFormat(86399));
        ////// zad 7
        int[] arrayToReverse = {1, 2, 3, 4, 5, 6, 7};
        int[] reversedArray = reverseThatTable(arrayToReverse);
        for (int i : reversedArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
        ////// zad 8
        int isIsPolidrom = 123321;
        int thisIsNotPolidorm = 123456;
        int andThisOneIsTricky = 1234321;

        System.out.println("To jest polidorm, powinno być true: " + palidromCheck(isIsPolidrom));
        System.out.println("To NIE jest polidorm, powinno być false: " + palidromCheck(thisIsNotPolidorm));
        System.out.println("To jest polidorm, powinno być true:  " + palidromCheck(andThisOneIsTricky));

    }
}
