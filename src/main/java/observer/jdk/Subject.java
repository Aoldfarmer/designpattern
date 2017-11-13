package observer.jdk;

import java.util.Observable;

public class Subject extends Observable {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}
