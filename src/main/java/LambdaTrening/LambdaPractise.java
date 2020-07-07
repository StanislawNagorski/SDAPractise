package LambdaTrening;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaPractise {

    public static void main(String[] args) {

        List<String> listToPlayWith = new ArrayList<>();
        listToPlayWith.add("DoomGuy");
        listToPlayWith.add("Chief");
        listToPlayWith.add("Son Goku");
        listToPlayWith.add("Son Gohan");
        listToPlayWith.add("Mario The Red Plumber");
        listToPlayWith.add("Bolo Destroyer");
        listToPlayWith.add("Ala");
        listToPlayWith.add("Diablo");
        listToPlayWith.add("Lili");
        listToPlayWith.add("Anubarak");
        listToPlayWith.add("ETC");
        listToPlayWith.add("Blaze");
        listToPlayWith.add("Malganis");
        listToPlayWith.add("Sylvana");
        listToPlayWith.add("Son Goten");
        listToPlayWith.add("Chi Chi");
        listToPlayWith.add("Picollo");
        listToPlayWith.add("Vegeta");
        listToPlayWith.add("Krillan");
        listToPlayWith.add("Szatan Serduszko");
        listToPlayWith.add("Yamcha");
        listToPlayWith.add("Chaos");
        listToPlayWith.add("Buu Buu");

        //1) Wszystkie nazwiska o długości co najwyżej 4 znaków, zapisane wielkimi literami    ----> podpowiedz: użyć między innymi map()
        List<String> namesWithAtLeastFourLetters = listToPlayWith.stream()
                .filter(s -> s.length() >= 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(namesWithAtLeastFourLetters);

        //2) Wszystkie nazwiska zaczynające się na literę 'B'
        List<String> namesWithB = listToPlayWith.stream()
                .filter(s -> s.charAt(0) == 'B')
                .collect(Collectors.toList());
        System.out.println(namesWithB);

        //3) Początkowe trzy litery wszystkich nazwisk, bez powtórzeń, z małych liter   ----> podpowiedz: użyć między innymi map()
        List<String> threeLetters = listToPlayWith.stream()
                .map(s -> s.substring(0, 3))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(threeLetters);

        Set<String> uniqThree = listToPlayWith.stream()
                .map(s -> s.substring(0, 3))
                .collect(Collectors.toSet());
        System.out.println(uniqThree);

        //4) 10 najdłuższych nazwisk, posortowanych malejąco według długości  ----> podpowiedz: użyć między innymi sorted()
        //4*) Obsłuż miejsca "ex aequo"

        List<String> tenLongest = listToPlayWith.stream()
                .sorted((o1, o2) -> {
                    if (o2.length() == o1.length()) {
                        return o2.charAt(0) - o1.charAt(0);
                    }
                    return o2.length() - o1.length();
                })
                .collect(Collectors.toList())
                .subList(0, 10);
        System.out.println(tenLongest);

        //5) 20 najkrótszych nazwisk, posortowanych według ostatniej litery  ----> podpowiedz: użyć między innymi limited() i sorted()

        List<String> collect = listToPlayWith.stream()
                .sorted((o1, o2) -> o1.length() - o2.length())
                .limit(20)
                .sorted((o1, o2) -> o1.toUpperCase().charAt(o1.length() - 1) - o2.toUpperCase().charAt(o2.length() - 1))
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());

        //6) Odwróć kolejność liter we wszystkich nazwiskach i pozstaw jedynie te, które mają literę 'A' wsród pierwszych trzech liter (odwróconego nazwiska)
        List<String> collect1 = listToPlayWith.stream()
                .map(s -> {
                    //TODO stringbuilder ma metode do odwracania
                    String sTrim = s.trim();
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = sTrim.length() - 1; i >= 0; i--) {
                        char tempChar = sTrim.charAt(i);
                        stringBuilder.append(tempChar);
                    }
                    return stringBuilder.toString();
                })
                .filter(s -> s.substring(0, 3).contains("a"))
                .collect(Collectors.toList());
        System.out.println(collect1);

        //7) Policz, ile jest nazwisk zaczynających się na każdą z liter alfabetu (rezultat jako Map<Character, Integer>)
        //TODO czytaj collector i grupby
        Map<Character, Integer> mapOfFistLettersOccurance = new HashMap<>();
        for (char i = 'a'; i < 'z'; i++) {
            mapOfFistLettersOccurance.put(i, 0);
        }
        listToPlayWith.stream()
                .map(String::toLowerCase)
                .map(s -> s.charAt(0))
                .map(character -> {
                    int counter = mapOfFistLettersOccurance.get(character);
                    return mapOfFistLettersOccurance.replace(character, counter + 1);
                });
        System.out.println(mapOfFistLettersOccurance);

    }
}
