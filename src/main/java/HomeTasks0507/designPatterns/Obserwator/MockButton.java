package HomeTasks0507.designPatterns.Obserwator;

import HomeTasks0507.designPatterns.Obserwator.Listeners.Listener;

import java.util.ArrayList;
import java.util.List;

public class MockButton implements myObservable {

    List<Listener> listOfListeners;

    public MockButton(){
        listOfListeners = new ArrayList<>();
    }

    public void click(){
        notifyListeners();
    }

    @Override
    public void addListener(Listener listener) {
    listOfListeners.add(listener);

    }

    @Override
    public void removeListener(Listener listener) {
    listOfListeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
    listOfListeners.forEach(listener -> listener.upDate());
    }
}
