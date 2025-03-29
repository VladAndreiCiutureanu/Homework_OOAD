import java.util.ArrayList;
import java.util.List;
public class Thermostat implements Subject {
    private List<Observer> observers = new ArrayList<>();
    double value;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(value);
        }
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }
}
