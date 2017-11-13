package observer.normal;

import java.util.ArrayList;
import java.util.List;

public class AbstractSubject implements ISubject {

    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void register(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void unregister(IObserver iObserver) {
        observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        observers.parallelStream()
                .forEach(e -> e.update(this));
    }
}
