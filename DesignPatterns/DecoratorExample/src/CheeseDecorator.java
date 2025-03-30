public class CheeseDecorator extends BurgerDecorator {
    private static double cost = 1.5;
    public CheeseDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + cost;
    }
}
