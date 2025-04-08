import java.util.ArrayList;

public class Prelungitor implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private State state = State.CONECTAT;
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void setState(State state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Prelungitorul a fost " + state);
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
