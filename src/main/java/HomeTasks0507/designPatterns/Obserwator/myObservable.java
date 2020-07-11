package HomeTasks0507.designPatterns.Obserwator;

import HomeTasks0507.designPatterns.Obserwator.Listeners.Listener;

public interface myObservable {

    public void addListener(Listener listener);
    public void removeListener(Listener listener);
    public void notifyListeners();
}

//    Stworzyć dwa Intervfejsy pierwszy "myObservable" będzie reprezentował obiekt są jest nasłuchiwany/obserwowany z metodami:
//        addLisneter(Listener observer)  ---> metoda rejestruąca obserwatora/nasłuchiwacza
//        removeListener(Listener listener)  ----> metoda usuwająca obserwatora/nasłuchującego
//        notifyListeners() ---> metoda która w momencie zajścia jakiegoś zdarzenia  aktualizuje wszystkich naśluchujących.
