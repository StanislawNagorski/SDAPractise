package HomeTasks0507.SimpleWebbStore;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    private List<User> userList;

    public UserData() {
        userList = new ArrayList<>();
        userList.add(new User("Son", "Goku", "Goku88", "123456"));
        userList.add(new User("Son", "Gohan", "GreatSaiyamana", "itsReallyGohan"));
        userList.add(new User("Son", "Goten", "GoTen", "lubieMięsko"));
        userList.add(new User("Vegeta", "Prince of Planet Vegeta", "PowerBoi87", "kakarotKiller"));
        userList.add(new User("Szatan", "Serduszko", "Picollo", "1111"));
        userList.add(new User("Krilan", "Noname", "17teenLover", "Adroind17<3"));
    }

    public List<User> getUserList() {
        return userList;
    }

    public boolean addUser(User user) {
        return userList.add(user);
    }

    public boolean removeUser(User user) {
        if (!userList.contains(user)){
            return false;
        }
        User.idCounter--;
        return userList.remove(user);
    }

    public User getUserByLogin(String login) {
        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByID(int id) {
        if (id >= userList.size()) {
            return null;
        }
        return userList.get(id);
    }


}

//Zadanie 4. Stworzyć klasę danych użytkowników (UsersData) który zawiera pola;
//        - lista użytkowników (Pole typu List) parametryzowana typem User z zadania 2 (List<User> users).
//        Następnie:
//        - Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę użytkowników ("users", najlepiej ArrayList) i wypełnia ją przykładowymi danymi - 5-10 użytkowników.
//        Potem stworzyć metody:
//        - Stworzyć metodę addUser, która przyjmuje 1 argument typu User (z zadania 2) i dodaje go do listy użytkowników.
//        - Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę użytkowników (tych przetrzymywanych w polu "users"
//        - Stworzyć metodę removeProduct, która przyjmuje 1 argument typu User (z zadania 2) i usuwa go z listy użytkowników -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
//        - Stworzyć metodę getUserByLogin, która przyjnuje 1 argument typu String z loginem użytkownika i zwraca całego użytkownika (User) jeśli użytkownik o padanym loginie jest na liście, lub null jeśli go nie ma.
//        - Stworzyć metodę getUserById, analogicznie jak powyższy punkt tylko
