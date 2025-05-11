import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

    public CoffeLover() {
        coffeMachines = new ArrayList<>();
    }

    void addCoffeMachine(CoffeMachine coffeMachine){
        coffeMachines.add(coffeMachine);
    }
    void startAllCoffeMachines(){
        for(CoffeMachine coffeMachine:coffeMachines){
            coffeMachine.start();
        }
    }
}
