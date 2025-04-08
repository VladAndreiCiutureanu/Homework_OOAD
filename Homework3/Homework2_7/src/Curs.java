import java.util.ArrayList;

public class Curs implements Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    String name;
    public Curs(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void callObserver(Observer o) {
        o.getStatus();
    }

    public void prezenta(){
        System.out.println("Prezenta la cursul "+name);
        for(Observer o : observers){
            o.getStatus();
        }
    }
}
