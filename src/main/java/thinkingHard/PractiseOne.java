package thinkingHard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PractiseOne {

   protected int checkForDuplicates(Integer[] testInts){

       Set<Integer> setToCheck = new HashSet<>();
       for (int i = 0; i < testInts.length; i++) {
           boolean falseIfDuplicte = setToCheck.add(testInts[i]);
           if (!falseIfDuplicte){
               return i;
           }
       }
       return -1;
   }

}

//Zadanie 1: Napisać metodę która przyjmuje tablicę liczb (Integer[]) i zwraca indeks pierwszej
//        powtarzającej się liczby w tej tablicy. Jeśli żadna liczba w tablicy się nie powtarza
//        to zwrócić -1;
//        Przykład 1
//        Wejście: [1, 4, 6, 23, 45, 2, 4, 1, 1]
//        Wyjście: 6 (Pierwsza powatarza się czwórka która ma indekx 6)
//        Przykład 2
//        Wejście: [1, 5, 8, 2, 4]
//        Wyjście: -1 (żadna liczba się nie powtarza)
//        ============================================================================================
