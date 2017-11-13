package observer.jdk;

import java.util.Observer;

public class Main {


    public static void main(String[] args) {
        Observer obj = new ObserverOne();
        Subject subject = new Subject();
        subject.addObserver(obj);
        subject.setData("One");
    }
}
