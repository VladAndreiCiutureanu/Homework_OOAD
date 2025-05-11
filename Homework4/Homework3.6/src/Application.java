import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<CoffeMachine> coffeMachines = List.of(new SimpleCoffeMachine(),new ComplexCoffeMachine());
        CoffeLover coffeLover = new CoffeLover(coffeMachines);
        coffeLover.makeCoffe();
    }
}
