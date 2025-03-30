public class TomatoDecorator extends BurgerDecorator {
    private static double cost = 1.0;
    public TomatoDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Tomatoes";
    }
}
