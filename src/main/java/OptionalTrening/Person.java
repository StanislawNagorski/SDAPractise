package OptionalTrening;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    //comapatorów możesz mieć kilka a Comparable tylko jedno
    String name;
    String surname;
    int age;
    Adress adress;

    public Person(String name, String surname, int age, Adress adress)  {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;

    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;

        //
    }
}
