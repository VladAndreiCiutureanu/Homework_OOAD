public class CoffeLover {
    private SimpleCoffeMachine simpleCoffeMachine;
    private ComplexCoffeMachine complexCoffeMachine;

    public CoffeLover() {
        simpleCoffeMachine = new SimpleCoffeMachine();
        complexCoffeMachine = new ComplexCoffeMachine();
    }

    public void startCoffe() {
        simpleCoffeMachine.start();
        complexCoffeMachine.start();
    }
}
