package thinkingHard;

import java.util.HashMap;
import java.util.Map;

public class PractiseToDuplicates {

    protected int checkForNTimesDuplicates(Integer[] arrayToCheck, Integer numberOfOccurance){
        Map<Integer,Integer> mapToCheckFrom = new HashMap<>();

        for (int i = 0; i < arrayToCheck.length; i++) {
            if (mapToCheckFrom.containsKey(arrayToCheck[i])){

                Integer counter = mapToCheckFrom.get(arrayToCheck[i]);
                counter++;

                boolean taskObjective = counter.equals(numberOfOccurance);
                if (taskObjective){
                    return i;
                }

                mapToCheckFrom.replace(arrayToCheck[i], counter);

            } else {
                mapToCheckFrom.put(arrayToCheck[i], 1);
            }
        }
        return -1;
    }

}


//Przykład 1
//        Wejście: [1, 4, 6, 23, 45, 2, 4, 1, 1], N = 3
//        Wyjście: 8 (Pierwsza trzeci raz powtarza się 1 na indeksie 8) powatarza się czwórka która ma indekx 6)
//        Przykład 2
//        Wejście: [1, 2, 2, 1, 3, 3, 2, 1, 1], N = 3
//        Wyjście: 6 (Pierwsza trzeci raz powtarza się 2 na indeksie 6) powatarza się czwórka która ma indekx 6)
//        Przykład 3
//        Wejście: [1, 5, 8, 2, 4]
//        Wyjście: -1 (żadna liczba się nie powtarza)
