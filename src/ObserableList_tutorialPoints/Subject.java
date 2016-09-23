package ObserableList_tutorialPoints;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by shk123 on 3/2/16.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
           observer.update();
        }
    }

}


