public class BaconDecorator extends BurgerDecorator {
    private static double cost = 2;
    public BaconDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Bacon";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + cost;
    }
}
