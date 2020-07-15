package LambdaTrening;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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
                .collect(toSet());
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
                    return new StringBuilder(s).reverse().toString();
                })
                .filter(s -> s.substring(0, 3).contains("a"))
                .collect(Collectors.toList());
        System.out.println(collect1);

        //7) Policz, ile jest nazwisk zaczynających się na każdą z liter alfabetu (rezultat jako Map<Character, Integer>)

        Map<Character, Long> collect2 = listToPlayWith.stream()
                .map(String::toLowerCase)
                .sorted((o1, o2) -> o1.charAt(0) - o2.charAt(0))
                .collect(groupingBy(s -> s.charAt(0), counting()));
        System.out.println(collect2);

        //8*) Jaka litera pojawia się najcześciej we wszystkich nazwiskach?

        Optional<Entry<Character, Long>> collect3 =
                collect2.entrySet().stream()
                        .max((o1, o2) -> (int) (o1.getValue() - o2.getValue()));

        System.out.println(collect3);

        //3.1 LoremIpsum
        List<String> listLorem = LoremIpsum.loremToList();

        //1) Ile jest wszystkich słów?
        long count = listLorem.stream().count();
        int size = listLorem.size();
        System.out.println(count == size);

        //2) Ile słów zaczyna się na literę 'D'?
        long count1 = listLorem.stream()
                .map(s -> s.toUpperCase().charAt(0))
                .filter(character -> character == 'D')
                .count();
        System.out.println("Na d mamy:" + count1);

        //33) Policz, ile jest słów o danej długości (Map<Integer, Integer>)
        Map<Integer, Long> collect4 = listLorem.stream()
                .collect(groupingBy(s -> s.length(), counting()));
        System.out.println(collect4);

        //4) Jaka litera pojawia się narzadziej?
        Optional<Entry<String, Long>> min = Stream.of(LoremIpsum.lorem
                .toUpperCase()
                .split("\\B|\\W"))
                .filter(s -> !(s.isBlank()))
                .collect(groupingBy(s -> s, counting()))
                .entrySet().stream()
                .min((o1, o2) -> (int) (o1.getValue() - o2.getValue()));

        String lessPopularLetter = min.map(Entry::getKey).orElse("Pusto :(");

        System.out.println("Najrzadziej występuje litera:" + lessPopularLetter);

        //5*) Ile jest słów, które posiadają dwie identyczne litery obok siebie (np. 'g' w "debugger")?

        long count2 = listLorem.stream()
                .filter(s -> {
                    for (int i = 0; i < s.length() - 1; i++) {
                        if (s.charAt(i) == s.charAt(i + 1)) {
                            return true;
                        }
                    }
                    return false;

                })
                .count();

        System.out.println(count2 + " -> tyle jest wyrazów gdzie lotery powtarzają się obok siebie");

        //6**) Ile jest słów, które są palindromami?

        long count3 = listLorem.stream()
                .filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))
                .count();

        System.out.println(count3 + " -> tyle jest palidromów w Lorem");

        //        Liczby:
//        Stworzyć sobie np. w metodzie main listę Integerow i dodać do niej kilkanaście/kiladziesią liczb. Następnie
//        Następnie korzystająć z strumieni, metod na strumieniach oraz wyrażeń lambda uzyskać odpowiedź na pytania:
//        Podpiwiedz ogólna: zobaczyć jak działają metody: count(), mapToInt(), average(), limit(), max(), min()

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(2);
        integerList.add(212);
        integerList.add(123);
        integerList.add(120);
        integerList.add(13);
        integerList.add(12443);
        integerList.add(155555);
        integerList.add(412);

        //1) Ile jest liczb parzystych?
        long count5 = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println("parzystych jest: " + count5);

        //2) Ile jest liczb pięciocyfrowych?

        long count4 = integerList.stream()
                .filter(integer -> integer % 5 == 0)
                .count();
        System.out.println("Pięcio cyfrowych jest " + count4);

        //3) Jaka jest największa i najmniejsza liczba?

        Integer integer1 = integerList.stream()
                .max((o1, o2) -> o1 - o2)
                .orElse(0);

        System.out.println("najwieksza to " + integer1);

        Integer integer2 = integerList.stream()
                .min((o1, o2) -> o1 - o2)
                .orElse(0);

        System.out.println("najmniejsza to :" + integer2);
        //4) Jaka jest różnica między największa a najmniejszą liczbą?
        System.out.println("różnica to: " + (integer1 - integer2));

        //5) Jaka jest średnia wszystkich liczb?
        Double collect5 = integerList.stream()
                .collect(averagingInt(Integer::intValue));
        System.out.println("srednia to:" + collect5);
        //6*) Jaka jest mediana wszystkich liczb?
        Double mediana = integerList.stream()
                .sorted()
                .skip(integerList.size() / 2)
                .limit(2)
                .collect(averagingInt(Integer::intValue));
        System.out.println("uśredniona mediana to: " + mediana);

        Integer mediana1 = integerList.stream()
                .sorted()
                .skip(integerList.size() / 2)
                .findFirst()
                .orElse(Integer.MIN_VALUE);
        System.out.println("klasyczna mediana" + mediana1);

        //7*) Jaka cyfra pojawia się najczęściej we wszystkcih liczbach?
        String mostPopularDigit = integerList.stream()
                .map(integer -> String.valueOf(integer))
                .flatMap(s -> (Stream.of(s.split("\\B"))))
                .collect(groupingBy(s -> s, counting()))
                .entrySet().stream()
                .max((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                .map(Entry::getKey).orElse("FAIL");

        System.out.println(mostPopularDigit + " jest najpopularniejsza cyfra");

        //8*) Ile jest wystąpień każdej cyfry (rezultat jako Map<Integer, Integer> z kluczami od 0 do 9)

        Map<Integer, Long> collect6 = integerList.stream()
                .map(integer -> String.valueOf(integer))
                .flatMap(s -> (Stream.of(s.split("\\B"))))
                .collect(groupingBy(s -> Integer.valueOf(s), counting()));
        System.out.println(collect6);

        //9) Wypisz wszystkie liczby pierwsze, posortowane rosnąco

        List<Integer> collect7 = integerList.stream()
                .filter(integer -> {
                    for (int i = 2; i < integer; i++) {
                        if (integer % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .sorted()
                .collect(toList());
        System.out.println("Liczby pierwsze rosnąco: " + collect7);


    }

}
