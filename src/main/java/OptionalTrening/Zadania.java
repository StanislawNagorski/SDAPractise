package OptionalTrening;

import java.util.Optional;

public class Zadania {

    public static void main(String[] args) {
        Country amercia = new Country("Amercia", "00-GREJT");
        Adress adress = new Adress("Wallstreet", 301, amercia);
        Person genericHero = new Person("Generic", "Hero", 21, adress);

        Optional<Person> personOptional = Optional.ofNullable(genericHero);
        Optional<Person> emptyPerson = Optional.empty();

        personOptional.ifPresentOrElse
                (person -> System.out.println(person.getAdress().getCountry().getCountyCode()),
                        () -> System.out.println("lack of country code"));

        emptyPerson.ifPresentOrElse
                (person -> System.out.println(person.getAdress().getCountry().getCountyCode()),
                        () -> System.out.println("lack of country code"));

        String countryCode = personOptional
                .map(person -> person.getAdress())
                .map(adress1 -> adress1.getCountry())
                .map(country -> country.getCountyCode())
                .orElse("lack of country code");
        System.out.println(countryCode);

        String lackOfCountryCode = emptyPerson
                .map(Person::getAdress)
                .map(Adress::getCountry)
                .map(Country::getCountyCode)
                .orElse("lack of country code");
        System.out.println(lackOfCountryCode);

    }


}
