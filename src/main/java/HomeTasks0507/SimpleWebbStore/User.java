package HomeTasks0507.SimpleWebbStore;

public class User {

    private String name;
    private String surname;
    private String login;
    private String password;
    private int id;

    public User(String name, String surname, String login, String password, int id) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.id = id;
    }

    public User() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


//Zadanie 2. Stworzyć klasę użytkownika (User), która zawiera pola:
//        imie
//        naziwsko
//        login
//        haslo
//        id;
//
//        Stworzyć 2 konstruktowy analogiczne do tych z zadania 1;
//        Stworzyć metody get i set dla wszystkich pół oprócz id;